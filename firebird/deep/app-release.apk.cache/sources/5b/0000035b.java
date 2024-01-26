package w;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b {

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Typeface f2735b;

        public a(Typeface typeface) {
            this.f2735b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.c(this.f2735b);
        }
    }

    /* renamed from: w.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0038b implements Runnable {
        public RunnableC0038b(int i2) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(b.this);
        }
    }

    public final void a(int i2, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new RunnableC0038b(i2));
    }

    public final void b(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public abstract void c(Typeface typeface);
}