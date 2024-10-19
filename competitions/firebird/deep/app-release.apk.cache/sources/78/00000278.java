package i;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2106a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f2107b;

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f2108a = new AtomicInteger(0);

        public a(b bVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f2108a.getAndIncrement())));
            return thread;
        }
    }

    public b() {
        super(0);
        this.f2106a = new Object();
        this.f2107b = Executors.newFixedThreadPool(2, new a(this));
    }

    @Override // i.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}