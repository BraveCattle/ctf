package b0;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    public HandlerThread f1272b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f1273c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1271a = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler.Callback f1275e = new a();

    /* renamed from: d  reason: collision with root package name */
    public int f1274d = 0;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                f fVar = f.this;
                synchronized (fVar.f1271a) {
                    if (!fVar.f1273c.hasMessages(1)) {
                        fVar.f1272b.quit();
                        fVar.f1272b = null;
                        fVar.f1273c = null;
                    }
                }
                return true;
            } else if (i2 != 1) {
                return true;
            } else {
                f fVar2 = f.this;
                Objects.requireNonNull(fVar2);
                ((Runnable) message.obj).run();
                synchronized (fVar2.f1271a) {
                    fVar2.f1273c.removeMessages(0);
                    Handler handler = fVar2.f1273c;
                    handler.sendMessageDelayed(handler.obtainMessage(0), 10000);
                }
                return true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f1277b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Callable f1278c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f1279d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f1280e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Condition f1281f;

        public b(f fVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f1277b = atomicReference;
            this.f1278c = callable;
            this.f1279d = reentrantLock;
            this.f1280e = atomicBoolean;
            this.f1281f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f1277b.set(this.f1278c.call());
            } catch (Exception unused) {
            }
            this.f1279d.lock();
            try {
                this.f1280e.set(false);
                this.f1281f.signal();
            } finally {
                this.f1279d.unlock();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c<T> {
        void a(T t2);
    }

    public f(String str, int i2, int i3) {
    }

    public final void a(Runnable runnable) {
        synchronized (this.f1271a) {
            if (this.f1272b == null) {
                HandlerThread handlerThread = new HandlerThread("fonts", 10);
                this.f1272b = handlerThread;
                handlerThread.start();
                this.f1273c = new Handler(this.f1272b.getLooper(), this.f1275e);
                this.f1274d++;
            }
            this.f1273c.removeMessages(0);
            Handler handler = this.f1273c;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> T b(Callable<T> callable, int i2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        a(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (atomicBoolean.get()) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
                do {
                    try {
                        nanos = newCondition.awaitNanos(nanos);
                    } catch (InterruptedException unused) {
                    }
                    if (!atomicBoolean.get()) {
                        return (T) atomicReference.get();
                    }
                } while (nanos > 0);
                throw new InterruptedException("timeout");
            }
            return (T) atomicReference.get();
        } finally {
            reentrantLock.unlock();
        }
    }
}