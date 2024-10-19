package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.x64m.xsfmnative.R;
import d1.g;
import e0.m;
import e0.o;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes.dex */
public class FloatingActionButton extends g implements b1.a {

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1493c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f1494d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f1495e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f1496f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1497g;

    /* renamed from: h  reason: collision with root package name */
    public int f1498h;

    /* renamed from: i  reason: collision with root package name */
    public int f1499i;

    /* renamed from: j  reason: collision with root package name */
    public int f1500j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1501k;

    /* renamed from: l  reason: collision with root package name */
    public c f1502l;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f1503a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1504b;

        public BaseBehavior() {
            this.f1504b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2701c);
            this.f1504b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void c(CoordinatorLayout.f fVar) {
            if (fVar.f672h == 0) {
                fVar.f672h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f665a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d2 = coordinatorLayout.d(floatingActionButton);
            int size = d2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = d2.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f665a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i2);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            return this.f1504b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f670f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (s(appBarLayout, floatingActionButton)) {
                if (this.f1503a == null) {
                    this.f1503a = new Rect();
                }
                Rect rect = this.f1503a;
                ThreadLocal<Matrix> threadLocal = d1.b.f1594a;
                rect.set(0, 0, appBarLayout.getWidth(), appBarLayout.getHeight());
                ThreadLocal<Matrix> threadLocal2 = d1.b.f1594a;
                Matrix matrix = threadLocal2.get();
                if (matrix == null) {
                    matrix = new Matrix();
                    threadLocal2.set(matrix);
                } else {
                    matrix.reset();
                }
                d1.b.a(coordinatorLayout, appBarLayout, matrix);
                ThreadLocal<RectF> threadLocal3 = d1.b.f1595b;
                RectF rectF = threadLocal3.get();
                if (rectF == null) {
                    rectF = new RectF();
                    threadLocal3.set(rectF);
                }
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.h(null, false);
                    return true;
                }
                floatingActionButton.m(null, false);
                return true;
            }
            return false;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (s(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.h(null, false);
                    return true;
                }
                floatingActionButton.m(null, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public class b implements f1.b {
        public b() {
        }
    }

    private c getImpl() {
        if (this.f1502l == null) {
            this.f1502l = new c1.b(this, new b());
        }
        return this.f1502l;
    }

    @Override // b1.a
    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        c impl = getImpl();
        if (impl.f1533n == null) {
            impl.f1533n = new ArrayList<>();
        }
        impl.f1533n.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().h(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        c impl = getImpl();
        if (impl.f1532m == null) {
            impl.f1532m = new ArrayList<>();
        }
        impl.f1532m.add(null);
    }

    @Deprecated
    public boolean f(Rect rect) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (isLaidOut()) {
            rect.set(0, 0, getWidth(), getHeight());
            throw null;
        }
        return false;
    }

    public final int g(int i2) {
        int i3 = this.f1499i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 != -1) {
            return resources.getDimensionPixelSize(i2 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? g(1) : g(0);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f1493c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f1494d;
    }

    public float getCompatElevation() {
        return getImpl().c();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f1529j;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f1530k;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f1499i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public v0.g getHideMotionSpec() {
        return getImpl().f1523d;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f1497g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f1497g;
    }

    public v0.g getShowMotionSpec() {
        return getImpl().f1522c;
    }

    public int getSize() {
        return this.f1498h;
    }

    public int getSizeDimension() {
        return g(this.f1498h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f1495e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f1496f;
    }

    public boolean getUseCompatPadding() {
        return this.f1501k;
    }

    public void h(a aVar, boolean z2) {
        c impl = getImpl();
        boolean z3 = true;
        if (impl.f1534o.getVisibility() != 0 ? impl.f1520a == 2 : impl.f1520a != 1) {
            z3 = false;
        }
        if (z3) {
            return;
        }
        Animator animator = impl.f1521b;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m()) {
            impl.f1534o.b(z2 ? 8 : 4, z2);
            return;
        }
        v0.g gVar = impl.f1523d;
        if (gVar == null) {
            if (impl.f1525f == null) {
                impl.f1525f = v0.g.a(impl.f1534o.getContext(), R.animator.design_fab_hide_motion_spec);
            }
            gVar = impl.f1525f;
        }
        AnimatorSet a2 = impl.a(gVar, 0.0f, 0.0f, 0.0f);
        a2.addListener(new com.google.android.material.floatingactionbutton.a(impl, z2, null));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f1533n;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    public boolean i() {
        return getImpl().e();
    }

    public final void j() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f1495e;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f1496f;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(i.c(colorForState, mode));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().f();
    }

    public void k(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f1533n;
        if (arrayList == null) {
            return;
        }
        arrayList.remove((Object) null);
    }

    public void l(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = getImpl().f1532m;
        if (arrayList == null) {
            return;
        }
        arrayList.remove((Object) null);
    }

    public void m(a aVar, boolean z2) {
        c impl = getImpl();
        if (impl.e()) {
            return;
        }
        Animator animator = impl.f1521b;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.m()) {
            impl.f1534o.b(0, z2);
            impl.f1534o.setAlpha(1.0f);
            impl.f1534o.setScaleY(1.0f);
            impl.f1534o.setScaleX(1.0f);
            impl.k(1.0f);
            return;
        }
        if (impl.f1534o.getVisibility() != 0) {
            impl.f1534o.setAlpha(0.0f);
            impl.f1534o.setScaleY(0.0f);
            impl.f1534o.setScaleX(0.0f);
            impl.k(0.0f);
        }
        v0.g gVar = impl.f1522c;
        if (gVar == null) {
            if (impl.f1524e == null) {
                impl.f1524e = v0.g.a(impl.f1534o.getContext(), R.animator.design_fab_show_motion_spec);
            }
            gVar = impl.f1524e;
        }
        AnimatorSet a2 = impl.a(gVar, 1.0f, 1.0f, 1.0f);
        a2.addListener(new com.google.android.material.floatingactionbutton.b(impl, z2, null));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f1532m;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof c1.b)) {
            if (impl.f1538s == null) {
                impl.f1538s = new c1.a(impl);
            }
            impl.f1534o.getViewTreeObserver().addOnPreDrawListener(impl.f1538s);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c impl = getImpl();
        if (impl.f1538s != null) {
            impl.f1534o.getViewTreeObserver().removeOnPreDrawListener(impl.f1538s);
            impl.f1538s = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i2, int i3) {
        this.f1500j = (getSizeDimension() + 0) / 2;
        getImpl().n();
        throw null;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h1.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h1.a aVar = (h1.a) parcelable;
        super.onRestoreInstanceState(aVar.f2110a);
        aVar.f2103c.getOrDefault("expandableWidgetHelper", null);
        throw null;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() != null) {
            throw null;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            f(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1493c != colorStateList) {
            this.f1493c = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1494d != mode) {
            this.f1494d = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        c impl = getImpl();
        if (impl.f1528i != f2) {
            impl.f1528i = f2;
            impl.i(f2, impl.f1529j, impl.f1530k);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        c impl = getImpl();
        if (impl.f1529j != f2) {
            impl.f1529j = f2;
            impl.i(impl.f1528i, f2, impl.f1530k);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        c impl = getImpl();
        if (impl.f1530k != f2) {
            impl.f1530k = f2;
            impl.i(impl.f1528i, impl.f1529j, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        this.f1499i = i2;
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(v0.g gVar) {
        getImpl().f1523d = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(v0.g.a(getContext(), i2));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        c impl = getImpl();
        impl.k(impl.f1531l);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        throw null;
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f1497g != colorStateList) {
            this.f1497g = colorStateList;
            getImpl().l(this.f1497g);
        }
    }

    public void setShowMotionSpec(v0.g gVar) {
        getImpl().f1522c = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(v0.g.a(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f1499i = 0;
        if (i2 != this.f1498h) {
            this.f1498h = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f1495e != colorStateList) {
            this.f1495e = colorStateList;
            j();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f1496f != mode) {
            this.f1496f = mode;
            j();
        }
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f1501k != z2) {
            this.f1501k = z2;
            getImpl().g();
        }
    }
}