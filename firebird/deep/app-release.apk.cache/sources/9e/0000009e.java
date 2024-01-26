package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import c.f;
import e0.e;
import e0.g;
import e0.i;
import e0.j;
import e0.m;
import e0.o;
import f0.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements i, e {
    public static final a B = new a();
    public static final int[] C = {16843130};
    public b A;

    /* renamed from: b  reason: collision with root package name */
    public long f700b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f701c;

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f702d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f703e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f704f;

    /* renamed from: g  reason: collision with root package name */
    public int f705g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f706h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f707i;

    /* renamed from: j  reason: collision with root package name */
    public View f708j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f709k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f710l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f711m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f712n;

    /* renamed from: o  reason: collision with root package name */
    public int f713o;

    /* renamed from: p  reason: collision with root package name */
    public int f714p;

    /* renamed from: q  reason: collision with root package name */
    public int f715q;

    /* renamed from: r  reason: collision with root package name */
    public int f716r;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f717s;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f718t;

    /* renamed from: u  reason: collision with root package name */
    public int f719u;

    /* renamed from: v  reason: collision with root package name */
    public int f720v;

    /* renamed from: w  reason: collision with root package name */
    public c f721w;

    /* renamed from: x  reason: collision with root package name */
    public final j f722x;

    /* renamed from: y  reason: collision with root package name */
    public final g f723y;

    /* renamed from: z  reason: collision with root package name */
    public float f724z;

    /* loaded from: classes.dex */
    public static class a extends e0.a {
        @Override // e0.a
        public void a(View view, AccessibilityEvent accessibilityEvent) {
            this.f1614a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // e0.a
        public void b(View view, d dVar) {
            int scrollRange;
            this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.f1731a.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            dVar.f1731a.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                dVar.a(d.a.f1733e);
                dVar.a(d.a.f1734f);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                dVar.a(d.a.f1732d);
                dVar.a(d.a.f1735g);
            }
        }

        @Override // e0.a
        public boolean c(View view, int i2, Bundle bundle) {
            int min;
            if (super.c(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (nestedScrollView.isEnabled()) {
                if (i2 != 4096) {
                    if (i2 == 8192 || i2 == 16908344) {
                        min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                        if (min == nestedScrollView.getScrollY()) {
                            return false;
                        }
                        nestedScrollView.C(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                        return true;
                    } else if (i2 != 16908346) {
                        return false;
                    }
                }
                min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.C(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f725a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public c[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f725a = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = f.a("HorizontalScrollView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" scrollPosition=");
            a2.append(this.f725a);
            a2.append("}");
            return a2.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f725a);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f701c = new Rect();
        this.f706h = true;
        this.f707i = false;
        this.f708j = null;
        this.f709k = false;
        this.f712n = true;
        this.f716r = -1;
        this.f717s = new int[2];
        this.f718t = new int[2];
        this.f702d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f713o = viewConfiguration.getScaledTouchSlop();
        this.f714p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f715q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f722x = new j();
        this.f723y = new g(this);
        setNestedScrollingEnabled(true);
        m.f(this, B);
    }

    public static int d(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f724z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f724z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f724z;
    }

    public static boolean t(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && t((View) parent, view2);
    }

    public final boolean A(int i2, int i3, int i4) {
        boolean z2;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z3 = i2 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = (View) focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i3 < scrollY || i4 > i5) {
            g(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z2;
    }

    public final void B(View view) {
        view.getDrawingRect(this.f701c);
        offsetDescendantRectToMyCoords(view, this.f701c);
        int e2 = e(this.f701c);
        if (e2 != 0) {
            scrollBy(0, e2);
        }
    }

    public final void C(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f700b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f702d;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
            z(z2);
        } else {
            if (!this.f702d.isFinished()) {
                b();
            }
            scrollBy(i2, i3);
        }
        this.f700b = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean D(int i2, int i3) {
        return this.f723y.h(i2, i3);
    }

    @Override // e0.e
    public void a(int i2) {
        this.f723y.i(i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final void b() {
        this.f702d.abortAnimation();
        this.f723y.i(1);
    }

    public boolean c(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !u(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f701c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f701c);
            g(e(this.f701c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!u(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f702d.isFinished()) {
            return;
        }
        this.f702d.computeScrollOffset();
        int currY = this.f702d.getCurrY();
        int i2 = currY - this.f720v;
        this.f720v = currY;
        int[] iArr = this.f718t;
        boolean z2 = false;
        iArr[1] = 0;
        f(0, i2, iArr, null, 1);
        int i3 = i2 - this.f718t[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            x(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.f718t;
            iArr2[1] = 0;
            this.f723y.e(0, scrollY2, 0, i4, this.f717s, 1, iArr2);
            i3 = i4 - this.f718t[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z2 = true;
            }
            if (z2) {
                j();
                if (i3 < 0) {
                    if (this.f703e.isFinished()) {
                        edgeEffect = this.f703e;
                        edgeEffect.onAbsorb((int) this.f702d.getCurrVelocity());
                    }
                } else if (this.f704f.isFinished()) {
                    edgeEffect = this.f704f;
                    edgeEffect.onAbsorb((int) this.f702d.getCurrVelocity());
                }
            }
            b();
        }
        if (!this.f702d.isFinished()) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            postInvalidateOnAnimation();
            return;
        }
        this.f723y.i(1);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || p(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f723y.a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f723y.b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return f(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f723y.d(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f703e != null) {
            int scrollY = getScrollY();
            int i3 = 0;
            if (!this.f703e.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    i2 = getPaddingLeft() + 0;
                } else {
                    i2 = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate(i2, min);
                this.f703e.setSize(width, height);
                if (this.f703e.draw(canvas)) {
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (this.f704f.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i3 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i3 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f704f.setSize(width2, height2);
            if (this.f704f.draw(canvas)) {
                WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean f(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.f723y.c(i2, i3, iArr, iArr2, i4);
    }

    public final void g(int i2) {
        if (i2 != 0) {
            if (this.f712n) {
                C(0, i2, 250, false);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f722x.a();
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final void h() {
        this.f709k = false;
        y();
        this.f723y.i(0);
        EdgeEffect edgeEffect = this.f703e;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f704f.onRelease();
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return s(0);
    }

    @Override // e0.h
    public void i(View view, View view2, int i2, int i3) {
        j jVar = this.f722x;
        if (i3 == 1) {
            jVar.f1629b = i2;
        } else {
            jVar.f1628a = i2;
        }
        D(2, i3);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f723y.f1626d;
    }

    public final void j() {
        if (getOverScrollMode() == 2) {
            this.f703e = null;
            this.f704f = null;
        } else if (this.f703e == null) {
            Context context = getContext();
            this.f703e = new EdgeEffect(context);
            this.f704f = new EdgeEffect(context);
        }
    }

    @Override // e0.i
    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        v(i5, i6, iArr);
    }

    @Override // e0.h
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        v(i5, i6, null);
    }

    @Override // e0.h
    public void m(View view, int i2) {
        j jVar = this.f722x;
        if (i2 == 1) {
            jVar.f1629b = 0;
        } else {
            jVar.f1628a = 0;
        }
        this.f723y.i(i2);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // e0.h
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        f(i2, i3, iArr, null, i4);
    }

    @Override // e0.h
    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f707i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f709k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f706h = false;
        View view = this.f708j;
        if (view != null && t(view, this)) {
            B(this.f708j);
        }
        this.f708j = null;
        if (!this.f707i) {
            if (this.f721w != null) {
                scrollTo(getScrollX(), this.f721w.f725a);
                this.f721w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int d2 = d(scrollY, paddingTop, i6);
            if (d2 != scrollY) {
                scrollTo(getScrollX(), d2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f707i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f711m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        q((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        f(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        v(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f722x.f1628a = i2;
        D(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i2) : focusFinder.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus == null || (true ^ u(findNextFocus, 0, getHeight()))) {
            return false;
        }
        return findNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f721w = cVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f725a = getScrollY();
        return cVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            c.b bVar2 = (c.b) bVar;
            AlertController.c(this, bVar2.f1288a, bVar2.f1289b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !u(findFocus, 0, i5)) {
            return;
        }
        findFocus.getDrawingRect(this.f701c);
        offsetDescendantRectToMyCoords(findFocus, this.f701c);
        g(e(this.f701c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f722x.f1628a = 0;
        a(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (r22.f702d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0207, code lost:
        if (r22.f702d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0209, code lost:
        r0 = e0.m.f1633a;
        postInvalidateOnAnimation();
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean p(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.p(android.view.KeyEvent):boolean");
    }

    public void q(int i2) {
        if (getChildCount() > 0) {
            this.f702d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            z(true);
        }
    }

    public boolean r(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f701c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f701c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f701c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f701c;
        return A(i2, rect3.top, rect3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f706h) {
            this.f708j = view2;
        } else {
            B(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int e2 = e(rect);
        boolean z3 = e2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, e2);
            } else {
                C(0, e2, 250, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            y();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f706h = true;
        super.requestLayout();
    }

    public boolean s(int i2) {
        return this.f723y.f(i2) != null;
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int d2 = d(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int d3 = d(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (d2 == getScrollX() && d3 == getScrollY()) {
                return;
            }
            super.scrollTo(d2, d3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f711m) {
            this.f711m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        g gVar = this.f723y;
        if (gVar.f1626d) {
            View view = gVar.f1625c;
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            view.stopNestedScroll();
        }
        gVar.f1626d = z2;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f712n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f723y.h(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f723y.i(0);
    }

    public final boolean u(View view, int i2, int i3) {
        view.getDrawingRect(this.f701c);
        offsetDescendantRectToMyCoords(view, this.f701c);
        return this.f701c.bottom + i2 >= getScrollY() && this.f701c.top - i2 <= getScrollY() + i3;
    }

    public final void v(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f723y.e(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    public final void w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f716r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f705g = (int) motionEvent.getY(i2);
            this.f716r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f710l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean x(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i10 = i4 + i2;
        int i11 = !z6 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z7 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z2 = true;
        } else if (i10 < i14) {
            z2 = true;
            i10 = i14;
        } else {
            z2 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z3 = true;
        } else if (i12 < i16) {
            z3 = true;
            i12 = i16;
        } else {
            z3 = false;
        }
        if (z3 && !s(1)) {
            this.f702d.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z2, z3);
        return z2 || z3;
    }

    public final void y() {
        VelocityTracker velocityTracker = this.f710l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f710l = null;
        }
    }

    public final void z(boolean z2) {
        if (z2) {
            D(2, 1);
        } else {
            this.f723y.i(1);
        }
        this.f720v = getScrollY();
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        postInvalidateOnAnimation();
    }
}