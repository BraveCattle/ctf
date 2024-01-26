package b0;

import android.os.Handler;
import b0.f;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f1282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Handler f1283c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.c f1284d;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f1285b;

        public a(Object obj) {
            this.f1285b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f1284d.a(this.f1285b);
        }
    }

    public g(f fVar, Callable callable, Handler handler, f.c cVar) {
        this.f1282b = callable;
        this.f1283c = handler;
        this.f1284d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f1282b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f1283c.post(new a(obj));
    }
}