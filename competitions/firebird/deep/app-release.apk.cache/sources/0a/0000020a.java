package g0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import e0.m;
import e0.o;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f1775r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0023a f1776b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f1777c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1778d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f1779e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1780f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f1781g;

    /* renamed from: h  reason: collision with root package name */
    public int f1782h;

    /* renamed from: i  reason: collision with root package name */
    public int f1783i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f1784j;

    /* renamed from: k  reason: collision with root package name */
    public float[] f1785k;

    /* renamed from: l  reason: collision with root package name */
    public float[] f1786l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1787m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1788n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1789o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1790p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1791q;

    /* renamed from: g0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023a {

        /* renamed from: a  reason: collision with root package name */
        public int f1792a;

        /* renamed from: b  reason: collision with root package name */
        public int f1793b;

        /* renamed from: c  reason: collision with root package name */
        public float f1794c;

        /* renamed from: d  reason: collision with root package name */
        public float f1795d;

        /* renamed from: j  reason: collision with root package name */
        public float f1801j;

        /* renamed from: k  reason: collision with root package name */
        public int f1802k;

        /* renamed from: e  reason: collision with root package name */
        public long f1796e = Long.MIN_VALUE;

        /* renamed from: i  reason: collision with root package name */
        public long f1800i = -1;

        /* renamed from: f  reason: collision with root package name */
        public long f1797f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f1798g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1799h = 0;

        public final float a(long j2) {
            long j3 = this.f1796e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f1800i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / this.f1792a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f1801j;
            return (a.b(((float) (j2 - j4)) / this.f1802k, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1790p) {
                if (aVar.f1788n) {
                    aVar.f1788n = false;
                    C0023a c0023a = aVar.f1776b;
                    Objects.requireNonNull(c0023a);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    c0023a.f1796e = currentAnimationTimeMillis;
                    c0023a.f1800i = -1L;
                    c0023a.f1797f = currentAnimationTimeMillis;
                    c0023a.f1801j = 0.5f;
                    c0023a.f1798g = 0;
                    c0023a.f1799h = 0;
                }
                C0023a c0023a2 = a.this.f1776b;
                if (!(c0023a2.f1800i > 0 && AnimationUtils.currentAnimationTimeMillis() > c0023a2.f1800i + ((long) c0023a2.f1802k)) && a.this.e()) {
                    a aVar2 = a.this;
                    if (aVar2.f1789o) {
                        aVar2.f1789o = false;
                        Objects.requireNonNull(aVar2);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        aVar2.f1778d.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0023a2.f1797f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a2 = c0023a2.a(currentAnimationTimeMillis2);
                        c0023a2.f1797f = currentAnimationTimeMillis2;
                        float f2 = ((float) (currentAnimationTimeMillis2 - c0023a2.f1797f)) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2));
                        c0023a2.f1798g = (int) (c0023a2.f1794c * f2);
                        int i2 = (int) (f2 * c0023a2.f1795d);
                        c0023a2.f1799h = i2;
                        ((c) a.this).f1805s.scrollListBy(i2);
                        View view = a.this.f1778d;
                        WeakHashMap<View, o> weakHashMap = m.f1633a;
                        view.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                a.this.f1790p = false;
            }
        }
    }

    public a(View view) {
        C0023a c0023a = new C0023a();
        this.f1776b = c0023a;
        this.f1777c = new AccelerateInterpolator();
        this.f1780f = new float[]{0.0f, 0.0f};
        this.f1781g = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1784j = new float[]{0.0f, 0.0f};
        this.f1785k = new float[]{0.0f, 0.0f};
        this.f1786l = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1778d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f1786l;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f1785k;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f1782h = 1;
        float[] fArr3 = this.f1781g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f1780f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f1784j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f1783i = f1775r;
        c0023a.f1792a = 500;
        c0023a.f1793b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1780f
            r0 = r0[r4]
            float[] r1 = r3.f1781g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L25
            android.view.animation.Interpolator r6 = r3.f1777c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2f
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L38
            android.view.animation.Interpolator r6 = r3.f1777c
            float r5 = r6.getInterpolation(r5)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.f1784j
            r0 = r0[r4]
            float[] r1 = r3.f1785k
            r1 = r1[r4]
            float[] r2 = r3.f1786l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f1782h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f1790p && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f1788n) {
            this.f1790p = false;
            return;
        }
        C0023a c0023a = this.f1776b;
        Objects.requireNonNull(c0023a);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - c0023a.f1796e);
        int i4 = c0023a.f1793b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        c0023a.f1802k = i2;
        c0023a.f1801j = c0023a.a(currentAnimationTimeMillis);
        c0023a.f1800i = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e() {
        /*
            r9 = this;
            g0.a$a r0 = r9.f1776b
            float r1 = r0.f1795d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f1794c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            g0.c r4 = (g0.c) r4
            android.widget.ListView r4 = r4.f1805s
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = r3
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.e():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1791q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.d()
            goto L7f
        L1a:
            r5.f1789o = r2
            r5.f1787m = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1778d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1778d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            g0.a$a r7 = r5.f1776b
            r7.f1794c = r0
            r7.f1795d = r6
            boolean r6 = r5.f1790p
            if (r6 != 0) goto L7f
            boolean r6 = r5.e()
            if (r6 == 0) goto L7f
            java.lang.Runnable r6 = r5.f1779e
            if (r6 != 0) goto L61
            g0.a$b r6 = new g0.a$b
            r6.<init>()
            r5.f1779e = r6
        L61:
            r5.f1790p = r2
            r5.f1788n = r2
            boolean r6 = r5.f1787m
            if (r6 != 0) goto L78
            int r6 = r5.f1783i
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f1778d
            java.lang.Runnable r0 = r5.f1779e
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, e0.o> r6 = e0.m.f1633a
            r7.postOnAnimationDelayed(r0, r3)
            goto L7d
        L78:
            java.lang.Runnable r6 = r5.f1779e
            r6.run()
        L7d:
            r5.f1787m = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}