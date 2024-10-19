package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import c.f;
import c.q;
import com.x64m.xsfmnative.R;
import e0.h;
import e0.i;
import e0.j;
import e0.m;
import e0.o;
import e0.s;
import h.b0;
import h.c0;
import java.util.Objects;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements b0, h, i {
    public static final int[] C = {R.attr.actionBarSize, 16842841};
    public final Runnable A;
    public final j B;

    /* renamed from: b  reason: collision with root package name */
    public int f269b;

    /* renamed from: c  reason: collision with root package name */
    public int f270c;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f271d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f272e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f273f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f274g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f275h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f276i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f277j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f278k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f279l;

    /* renamed from: m  reason: collision with root package name */
    public int f280m;

    /* renamed from: n  reason: collision with root package name */
    public int f281n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f282o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f283p;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f284q;

    /* renamed from: r  reason: collision with root package name */
    public s f285r;

    /* renamed from: s  reason: collision with root package name */
    public s f286s;

    /* renamed from: t  reason: collision with root package name */
    public s f287t;

    /* renamed from: u  reason: collision with root package name */
    public s f288u;

    /* renamed from: v  reason: collision with root package name */
    public d f289v;

    /* renamed from: w  reason: collision with root package name */
    public OverScroller f290w;

    /* renamed from: x  reason: collision with root package name */
    public ViewPropertyAnimator f291x;

    /* renamed from: y  reason: collision with root package name */
    public final AnimatorListenerAdapter f292y;

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f293z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f291x = null;
            actionBarOverlayLayout.f279l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f291x = null;
            actionBarOverlayLayout.f279l = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f291x = actionBarOverlayLayout.f272e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f292y);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f291x = actionBarOverlayLayout.f272e.animate().translationY(-ActionBarOverlayLayout.this.f272e.getHeight()).setListener(ActionBarOverlayLayout.this.f292y);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f270c = 0;
        this.f282o = new Rect();
        this.f283p = new Rect();
        this.f284q = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        s sVar = s.f1646b;
        this.f285r = sVar;
        this.f286s = sVar;
        this.f287t = sVar;
        this.f288u = sVar;
        this.f292y = new a();
        this.f293z = new b();
        this.A = new c();
        r(context);
        this.B = new j();
    }

    @Override // h.b0
    public boolean a() {
        s();
        return this.f273f.a();
    }

    @Override // h.b0
    public void b(Menu menu, i.a aVar) {
        s();
        this.f273f.b(menu, aVar);
    }

    @Override // h.b0
    public boolean c() {
        s();
        return this.f273f.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // h.b0
    public void d() {
        s();
        this.f273f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f274g == null || this.f275h) {
            return;
        }
        if (this.f272e.getVisibility() == 0) {
            i2 = (int) (this.f272e.getTranslationY() + this.f272e.getBottom() + 0.5f);
        } else {
            i2 = 0;
        }
        this.f274g.setBounds(0, i2, getWidth(), this.f274g.getIntrinsicHeight() + i2);
        this.f274g.draw(canvas);
    }

    @Override // h.b0
    public boolean e() {
        s();
        return this.f273f.e();
    }

    @Override // h.b0
    public boolean f() {
        s();
        return this.f273f.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // h.b0
    public boolean g() {
        s();
        return this.f273f.g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f272e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f273f.getTitle();
    }

    @Override // h.b0
    public void h(int i2) {
        s();
        if (i2 == 2) {
            this.f273f.l();
        } else if (i2 == 5) {
            this.f273f.r();
        } else if (i2 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // e0.h
    public void i(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // h.b0
    public void j() {
        s();
        this.f273f.h();
    }

    @Override // e0.i
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // e0.h
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // e0.h
    public void m(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // e0.h
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // e0.h
    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        Objects.requireNonNull(windowInsets);
        s sVar = new s(windowInsets);
        boolean p2 = p(this.f272e, new Rect(sVar.b(), sVar.d(), sVar.c(), sVar.a()), true, true, false, true);
        Rect rect = this.f282o;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        m.b.a(this, sVar, rect);
        Rect rect2 = this.f282o;
        s g2 = sVar.f1647a.g(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f285r = g2;
        boolean z2 = true;
        if (!this.f286s.equals(g2)) {
            this.f286s = this.f285r;
            p2 = true;
        }
        if (this.f283p.equals(this.f282o)) {
            z2 = p2;
        } else {
            this.f283p.set(this.f282o);
        }
        if (z2) {
            requestLayout();
        }
        return sVar.f1647a.a().f1647a.c().f1647a.b().g();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        s a2;
        s();
        measureChildWithMargins(this.f272e, i2, 0, i3, 0);
        e eVar = (e) this.f272e.getLayoutParams();
        int max = Math.max(0, this.f272e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f272e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f272e.getMeasuredState());
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        boolean z2 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z2) {
            measuredHeight = this.f269b;
            if (this.f277j && this.f272e.getTabContainer() != null) {
                measuredHeight += this.f269b;
            }
        } else {
            measuredHeight = this.f272e.getVisibility() != 8 ? this.f272e.getMeasuredHeight() : 0;
        }
        this.f284q.set(this.f282o);
        s sVar = this.f285r;
        this.f287t = sVar;
        if (!this.f276i && !z2) {
            Rect rect = this.f284q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            a2 = sVar.f1647a.g(0, measuredHeight, 0, 0);
        } else {
            x.b a3 = x.b.a(sVar.b(), this.f287t.d() + measuredHeight, this.f287t.c(), this.f287t.a() + 0);
            s sVar2 = this.f287t;
            s.c bVar = Build.VERSION.SDK_INT >= 29 ? new s.b(sVar2) : new s.a(sVar2);
            bVar.c(a3);
            a2 = bVar.a();
        }
        this.f287t = a2;
        p(this.f271d, this.f284q, true, true, true, true);
        if (!this.f288u.equals(this.f287t)) {
            s sVar3 = this.f287t;
            this.f288u = sVar3;
            ContentFrameLayout contentFrameLayout = this.f271d;
            WindowInsets g2 = sVar3.g();
            if (g2 != null && !contentFrameLayout.dispatchApplyWindowInsets(g2).equals(g2)) {
                new s(g2);
            }
        }
        measureChildWithMargins(this.f271d, i2, 0, i3, 0);
        e eVar2 = (e) this.f271d.getLayoutParams();
        int max3 = Math.max(max, this.f271d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f271d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f271d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (this.f278k && z2) {
            this.f290w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f290w.getFinalY() > this.f272e.getHeight()) {
                q();
                this.A.run();
            } else {
                q();
                this.f293z.run();
            }
            this.f279l = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f280m + i3;
        this.f280m = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        q qVar;
        f.h hVar;
        this.B.f1628a = i2;
        this.f280m = getActionBarHideOffset();
        q();
        d dVar = this.f289v;
        if (dVar == null || (hVar = (qVar = (q) dVar).f1400t) == null) {
            return;
        }
        hVar.a();
        qVar.f1400t = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f272e.getVisibility() != 0) {
            return false;
        }
        return this.f278k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f278k && !this.f279l) {
            if (this.f280m <= this.f272e.getHeight()) {
                q();
                postDelayed(this.f293z, 600L);
            } else {
                q();
                postDelayed(this.A, 600L);
            }
        }
        d dVar = this.f289v;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i3 = this.f281n ^ i2;
        this.f281n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.f289v;
        if (dVar != null) {
            ((q) dVar).f1396p = !z3;
            if (!z2 && z3) {
                q qVar = (q) dVar;
                if (!qVar.f1397q) {
                    qVar.f1397q = true;
                    qVar.g(true);
                }
            } else {
                q qVar2 = (q) dVar;
                if (qVar2.f1397q) {
                    qVar2.f1397q = false;
                    qVar2.g(true);
                }
            }
        }
        if ((i3 & 256) == 0 || this.f289v == null) {
            return;
        }
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        requestApplyInsets();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f270c = i2;
        d dVar = this.f289v;
        if (dVar != null) {
            ((q) dVar).f1395o = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.p(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void q() {
        removeCallbacks(this.f293z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f291x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.f269b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f274g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f275h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f290w = new OverScroller(context);
    }

    public void s() {
        c0 wrapper;
        if (this.f271d == null) {
            this.f271d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f272e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof c0) {
                wrapper = (c0) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder a2 = f.a("Can't make a decor toolbar out of ");
                a2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a2.toString());
            } else {
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.f273f = wrapper;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f272e.setTranslationY(-Math.max(0, Math.min(i2, this.f272e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f289v = dVar;
        if (getWindowToken() != null) {
            ((q) this.f289v).f1395o = this.f270c;
            int i2 = this.f281n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                requestApplyInsets();
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f277j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f278k) {
            this.f278k = z2;
            if (z2) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        s();
        this.f273f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f273f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        s();
        this.f273f.n(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f276i = z2;
        this.f275h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // h.b0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f273f.setWindowCallback(callback);
    }

    @Override // h.b0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f273f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}