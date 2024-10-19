package w0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import e0.m;
import e0.o;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a<V extends View> extends c<V> {

    /* renamed from: c  reason: collision with root package name */
    public Runnable f2741c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f2742d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2743e;

    /* renamed from: f  reason: collision with root package name */
    public int f2744f;

    /* renamed from: g  reason: collision with root package name */
    public int f2745g;

    /* renamed from: h  reason: collision with root package name */
    public int f2746h;

    /* renamed from: i  reason: collision with root package name */
    public VelocityTracker f2747i;

    /* renamed from: w0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0039a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final CoordinatorLayout f2748b;

        /* renamed from: c  reason: collision with root package name */
        public final V f2749c;

        public RunnableC0039a(CoordinatorLayout coordinatorLayout, V v2) {
            this.f2748b = coordinatorLayout;
            this.f2749c = v2;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f2749c == null || (overScroller = a.this.f2742d) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                a aVar = a.this;
                aVar.y(this.f2748b, this.f2749c, aVar.f2742d.getCurrY());
                V v2 = this.f2749c;
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                v2.postOnAnimation(this);
                return;
            }
            a aVar2 = a.this;
            CoordinatorLayout coordinatorLayout = this.f2748b;
            V v3 = this.f2749c;
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) aVar2;
            Objects.requireNonNull(baseBehavior);
            baseBehavior.C(coordinatorLayout, (AppBarLayout) v3);
        }
    }

    public a() {
        this.f2744f = -1;
        this.f2746h = -1;
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2744f = -1;
        this.f2746h = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f2746h
            if (r0 >= 0) goto L12
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f2746h = r0
        L12:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L1f
            boolean r0 = r4.f2743e
            if (r0 == 0) goto L1f
            return r2
        L1f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L60
            r5 = -1
            if (r0 == r2) goto L51
            if (r0 == r1) goto L2f
            r6 = 3
            if (r0 == r6) goto L51
            goto L8a
        L2f:
            int r6 = r4.f2744f
            if (r6 != r5) goto L34
            goto L8a
        L34:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L3b
            goto L8a
        L3b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f2745g
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f2746h
            if (r6 <= r0) goto L8a
            r4.f2743e = r2
            r4.f2745g = r5
            goto L8a
        L51:
            r4.f2743e = r3
            r4.f2744f = r5
            android.view.VelocityTracker r5 = r4.f2747i
            if (r5 == 0) goto L8a
            r5.recycle()
            r5 = 0
            r4.f2747i = r5
            goto L8a
        L60:
            r4.f2743e = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.v(r6)
            if (r2 == 0) goto L8a
            boolean r5 = r5.p(r6, r0, r1)
            if (r5 == 0) goto L8a
            r4.f2745g = r1
            int r5 = r7.getPointerId(r3)
            r4.f2744f = r5
            android.view.VelocityTracker r5 = r4.f2747i
            if (r5 != 0) goto L8a
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r4.f2747i = r5
        L8a:
            android.view.VelocityTracker r5 = r4.f2747i
            if (r5 == 0) goto L91
            r5.addMovement(r7)
        L91:
            boolean r5 = r4.f2743e
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.a.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract boolean v(V v2);

    public abstract int w();

    public final int x(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4) {
        return z(coordinatorLayout, v2, w() - i2, i3, i4);
    }

    public int y(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        return z(coordinatorLayout, v2, i2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public abstract int z(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4);
}