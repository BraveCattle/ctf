package h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class g0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final float f1867b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1868c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1869d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1870e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f1871f;

    /* renamed from: g  reason: collision with root package name */
    public Runnable f1872g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1873h;

    /* renamed from: i  reason: collision with root package name */
    public int f1874i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f1875j = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = g0.this.f1870e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0Var = g0.this;
            g0Var.a();
            View view = g0Var.f1870e;
            if (view.isEnabled() && !view.isLongClickable() && g0Var.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                g0Var.f1873h = true;
            }
        }
    }

    public g0(View view) {
        this.f1870e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1867b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1868c = tapTimeout;
        this.f1869d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.f1872g;
        if (runnable != null) {
            this.f1870e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1871f;
        if (runnable2 != null) {
            this.f1870e.removeCallbacks(runnable2);
        }
    }

    public abstract g.f b();

    public abstract boolean c();

    public boolean d() {
        g.f b2 = b();
        if (b2 == null || !b2.a()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r4 != 3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1873h = false;
        this.f1874i = -1;
        Runnable runnable = this.f1871f;
        if (runnable != null) {
            this.f1870e.removeCallbacks(runnable);
        }
    }
}