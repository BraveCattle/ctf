package j0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import c.f;
import e0.m;
import e0.o;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: v  reason: collision with root package name */
    public static final Interpolator f2125v = new animation.InterpolatorC0029a();

    /* renamed from: a  reason: collision with root package name */
    public int f2126a;

    /* renamed from: b  reason: collision with root package name */
    public int f2127b;

    /* renamed from: d  reason: collision with root package name */
    public float[] f2129d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2130e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f2131f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2132g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f2133h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f2134i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2135j;

    /* renamed from: k  reason: collision with root package name */
    public int f2136k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f2137l;

    /* renamed from: m  reason: collision with root package name */
    public float f2138m;

    /* renamed from: n  reason: collision with root package name */
    public float f2139n;

    /* renamed from: o  reason: collision with root package name */
    public int f2140o;

    /* renamed from: p  reason: collision with root package name */
    public OverScroller f2141p;

    /* renamed from: q  reason: collision with root package name */
    public final c f2142q;

    /* renamed from: r  reason: collision with root package name */
    public View f2143r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2144s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f2145t;

    /* renamed from: c  reason: collision with root package name */
    public int f2128c = -1;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f2146u = new b();

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class animation.InterpolatorC0029a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.s(0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i2) {
        }

        public abstract void f(int i2);

        public abstract void g(View view, int i2, int i3, int i4, int i5);

        public abstract void h(View view, float f2, float f3);

        public abstract boolean i(View view, int i2);
    }

    public a(Context context, ViewGroup viewGroup, c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2145t = viewGroup;
        this.f2142q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2140o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2127b = viewConfiguration.getScaledTouchSlop();
        this.f2138m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2139n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2141p = new OverScroller(context, f2125v);
    }

    public void a() {
        this.f2128c = -1;
        float[] fArr = this.f2129d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f2130e, 0.0f);
            Arrays.fill(this.f2131f, 0.0f);
            Arrays.fill(this.f2132g, 0.0f);
            Arrays.fill(this.f2133h, 0);
            Arrays.fill(this.f2134i, 0);
            Arrays.fill(this.f2135j, 0);
            this.f2136k = 0;
        }
        VelocityTracker velocityTracker = this.f2137l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2137l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() != this.f2145t) {
            StringBuilder a2 = f.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
            a2.append(this.f2145t);
            a2.append(")");
            throw new IllegalArgumentException(a2.toString());
        }
        this.f2143r = view;
        this.f2128c = i2;
        this.f2142q.e(view, i2);
        s(1);
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2133h[i2] & i3) != i3 || (0 & i3) == 0 || (this.f2135j[i2] & i3) == i3 || (this.f2134i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2127b;
        if (abs > i4 || abs2 > i4) {
            if (abs < abs2 * 0.5f) {
                Objects.requireNonNull(this.f2142q);
            }
            return (this.f2134i[i2] & i3) == 0 && abs > ((float) this.f2127b);
        }
        return false;
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f2142q.c(view) > 0;
        boolean z3 = this.f2142q.d(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f2127b) : z3 && Math.abs(f3) > ((float) this.f2127b);
        }
        float f4 = f3 * f3;
        int i2 = this.f2127b;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g(int i2) {
        float[] fArr = this.f2129d;
        if (fArr != null) {
            int i3 = this.f2136k;
            int i4 = 1 << i2;
            if ((i4 & i3) != 0) {
                fArr[i2] = 0.0f;
                this.f2130e[i2] = 0.0f;
                this.f2131f[i2] = 0.0f;
                this.f2132g[i2] = 0.0f;
                this.f2133h[i2] = 0;
                this.f2134i[i2] = 0;
                this.f2135j[i2] = 0;
                this.f2136k = (~i4) & i3;
            }
        }
    }

    public final int h(int i2, int i3, int i4) {
        int width;
        if (i2 == 0) {
            return 0;
        }
        float width2 = this.f2145t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i2) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z2) {
        if (this.f2126a == 2) {
            boolean computeScrollOffset = this.f2141p.computeScrollOffset();
            int currX = this.f2141p.getCurrX();
            int currY = this.f2141p.getCurrY();
            int left = currX - this.f2143r.getLeft();
            int top = currY - this.f2143r.getTop();
            if (left != 0) {
                View view = this.f2143r;
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f2143r;
                WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f2142q.g(this.f2143r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2141p.getFinalX() && currY == this.f2141p.getFinalY()) {
                this.f2141p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.f2145t.post(this.f2146u);
                } else {
                    s(0);
                }
            }
        }
        return this.f2126a == 2;
    }

    public final void j(float f2, float f3) {
        this.f2144s = true;
        this.f2142q.h(this.f2143r, f2, f3);
        this.f2144s = false;
        if (this.f2126a == 1) {
            s(0);
        }
    }

    public View k(int i2, int i3) {
        for (int childCount = this.f2145t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f2145t;
            Objects.requireNonNull(this.f2142q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f2143r.getLeft();
        int top = this.f2143r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f2141p.abortAnimation();
            s(0);
            return false;
        }
        View view = this.f2143r;
        int f6 = f(i4, (int) this.f2139n, (int) this.f2138m);
        int f7 = f(i5, (int) this.f2139n, (int) this.f2138m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i8;
        } else {
            f2 = abs;
            f3 = i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i8;
        } else {
            f4 = abs2;
            f5 = i9;
        }
        int h2 = h(i6, f6, this.f2142q.c(view));
        this.f2141p.startScroll(left, top, i6, i7, (int) ((h(i7, f7, this.f2142q.d(view)) * (f4 / f5)) + (h2 * f8)));
        s(2);
        return true;
    }

    public final boolean m(int i2) {
        if ((this.f2136k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void n(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2137l == null) {
            this.f2137l = VelocityTracker.obtain();
        }
        this.f2137l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f2126a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (m(pointerId)) {
                                float x2 = motionEvent.getX(i3);
                                float y2 = motionEvent.getY(i3);
                                float f2 = x2 - this.f2129d[pointerId];
                                float f3 = y2 - this.f2130e[pointerId];
                                p(f2, f3, pointerId);
                                if (this.f2126a != 1) {
                                    View k2 = k((int) x2, (int) y2);
                                    if (d(k2, f2, f3) && v(k2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (!m(this.f2128c)) {
                        return;
                    } else {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f2128c);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f2131f;
                        int i4 = this.f2128c;
                        int i5 = (int) (x3 - fArr[i4]);
                        int i6 = (int) (y3 - this.f2132g[i4]);
                        int left = this.f2143r.getLeft() + i5;
                        int top = this.f2143r.getTop() + i6;
                        int left2 = this.f2143r.getLeft();
                        int top2 = this.f2143r.getTop();
                        if (i5 != 0) {
                            left = this.f2142q.a(this.f2143r, left, i5);
                            WeakHashMap<View, o> weakHashMap = m.f1633a;
                            this.f2143r.offsetLeftAndRight(left - left2);
                        }
                        int i7 = left;
                        if (i6 != 0) {
                            top = this.f2142q.b(this.f2143r, top, i6);
                            WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                            this.f2143r.offsetTopAndBottom(top - top2);
                        }
                        int i8 = top;
                        if (i5 != 0 || i6 != 0) {
                            this.f2142q.g(this.f2143r, i7, i8, i7 - left2, i8 - top2);
                        }
                    }
                    r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        if (this.f2126a == 1 && pointerId2 == this.f2128c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId3 = motionEvent.getPointerId(i3);
                                if (pointerId3 != this.f2128c) {
                                    View k3 = k((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view = this.f2143r;
                                    if (k3 == view && v(view, pointerId3)) {
                                        i2 = this.f2128c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                o();
                            }
                        }
                        g(pointerId2);
                        return;
                    }
                    int pointerId4 = motionEvent.getPointerId(actionIndex);
                    float x4 = motionEvent.getX(actionIndex);
                    float y4 = motionEvent.getY(actionIndex);
                    q(x4, y4, pointerId4);
                    if (this.f2126a != 0) {
                        int i9 = (int) x4;
                        int i10 = (int) y4;
                        View view2 = this.f2143r;
                        if (view2 != null && i9 >= view2.getLeft() && i9 < view2.getRight() && i10 >= view2.getTop() && i10 < view2.getBottom()) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            v(this.f2143r, pointerId4);
                            return;
                        }
                        return;
                    }
                    v(k((int) x4, (int) y4), pointerId4);
                    if ((this.f2133h[pointerId4] & 0) == 0) {
                        return;
                    }
                } else if (this.f2126a == 1) {
                    j(0.0f, 0.0f);
                }
            } else if (this.f2126a == 1) {
                o();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View k4 = k((int) x5, (int) y5);
        q(x5, y5, pointerId5);
        v(k4, pointerId5);
        if ((this.f2133h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.f2142q);
    }

    public final void o() {
        this.f2137l.computeCurrentVelocity(1000, this.f2138m);
        j(e(this.f2137l.getXVelocity(this.f2128c), this.f2139n, this.f2138m), e(this.f2137l.getYVelocity(this.f2128c), this.f2139n, this.f2138m));
    }

    public final void p(float f2, float f3, int i2) {
        boolean c2 = c(f2, f3, i2, 1);
        if (c(f3, f2, i2, 4)) {
            c2 |= true;
        }
        if (c(f2, f3, i2, 2)) {
            c2 |= true;
        }
        if (c(f3, f2, i2, 8)) {
            c2 |= true;
        }
        if (c2) {
            int[] iArr = this.f2134i;
            iArr[i2] = iArr[i2] | c2;
            Objects.requireNonNull(this.f2142q);
        }
    }

    public final void q(float f2, float f3, int i2) {
        float[] fArr = this.f2129d;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2130e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2131f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2132g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2133h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2134i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2135j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2129d = fArr2;
            this.f2130e = fArr3;
            this.f2131f = fArr4;
            this.f2132g = fArr5;
            this.f2133h = iArr;
            this.f2134i = iArr2;
            this.f2135j = iArr3;
        }
        float[] fArr9 = this.f2129d;
        this.f2131f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f2130e;
        this.f2132g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f2133h;
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = i4 < this.f2145t.getLeft() + this.f2140o ? 1 : 0;
        if (i5 < this.f2145t.getTop() + this.f2140o) {
            i6 |= 4;
        }
        if (i4 > this.f2145t.getRight() - this.f2140o) {
            i6 |= 2;
        }
        if (i5 > this.f2145t.getBottom() - this.f2140o) {
            i6 |= 8;
        }
        iArr7[i2] = i6;
        this.f2136k |= 1 << i2;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f2131f[pointerId] = x2;
                this.f2132g[pointerId] = y2;
            }
        }
    }

    public void s(int i2) {
        this.f2145t.removeCallbacks(this.f2146u);
        if (this.f2126a != i2) {
            this.f2126a = i2;
            this.f2142q.f(i2);
            if (this.f2126a == 0) {
                this.f2143r = null;
            }
        }
    }

    public boolean t(int i2, int i3) {
        if (this.f2144s) {
            return l(i2, i3, (int) this.f2137l.getXVelocity(this.f2128c), (int) this.f2137l.getYVelocity(this.f2128c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
        if (r12 != r11) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean u(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i2) {
        if (view == this.f2143r && this.f2128c == i2) {
            return true;
        }
        if (view == null || !this.f2142q.i(view, i2)) {
            return false;
        }
        this.f2128c = i2;
        b(view, i2);
        return true;
    }
}