package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e0.m;
import e0.o;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x0.b;
import x0.c;

/* loaded from: classes.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    public static final /* synthetic */ int T = 0;
    public Animator O;
    public Animator P;
    public int Q;
    public boolean R;
    public boolean S;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1460d;

        public Behavior() {
            this.f1460d = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1460d = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, int i2) {
            Animator animator;
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            int i3 = BottomAppBar.T;
            FloatingActionButton x2 = bottomAppBar.x();
            if (x2 == null) {
                Animator animator2 = bottomAppBar.P;
                if ((animator2 != null && animator2.isRunning()) || ((animator = bottomAppBar.O) != null && animator.isRunning())) {
                    coordinatorLayout.r(bottomAppBar, i2);
                    this.f1443a = bottomAppBar.getMeasuredHeight();
                    return false;
                }
                BottomAppBar.v(bottomAppBar);
                throw null;
            }
            ((CoordinatorLayout.f) x2.getLayoutParams()).f668d = 17;
            x2.k(null);
            x2.l(null);
            x2.d(null);
            x2.e(null);
            this.f1460d.set(0, 0, x2.getMeasuredWidth(), x2.getMeasuredHeight());
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll()) {
                return i3 == 0 ? o(coordinatorLayout, bottomAppBar, view2, view3, i2) : false;
            }
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void t(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.t(bottomAppBar2);
            int i2 = BottomAppBar.T;
            FloatingActionButton x2 = bottomAppBar2.x();
            if (x2 != null) {
                x2.f(this.f1460d);
                x2.clearAnimation();
                x2.animate().translationY((-x2.getPaddingBottom()) + (x2.getMeasuredHeight() - this.f1460d.height())).setInterpolator(v0.a.f2709b).setDuration(175L);
            }
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior
        public void u(BottomAppBar bottomAppBar) {
            BottomAppBar bottomAppBar2 = bottomAppBar;
            super.u(bottomAppBar2);
            int i2 = BottomAppBar.T;
            FloatingActionButton x2 = bottomAppBar2.x();
            if (x2 != null) {
                x2.clearAnimation();
                x2.animate().translationY(bottomAppBar2.getFabTranslationY()).setInterpolator(v0.a.f2710c).setDuration(225L);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a extends i0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0017a();

        /* renamed from: c  reason: collision with root package name */
        public int f1461c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1462d;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0017a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new a[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1461c = parcel.readInt();
            this.f1462d = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            parcel.writeInt(this.f1461c);
            parcel.writeInt(this.f1462d ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private float getFabTranslationX() {
        return y(this.Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationY() {
        boolean z2 = this.S;
        FloatingActionButton x2 = x();
        if (x2 == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        x2.f(rect);
        float height = rect.height();
        if (height == 0.0f) {
            height = x2.getMeasuredHeight();
        }
        float height2 = x2.getHeight() - rect.height();
        float height3 = (height / 2.0f) + (-getCradleVerticalOffset()) + (x2.getHeight() - rect.bottom);
        float paddingBottom = height2 - x2.getPaddingBottom();
        float f2 = -getMeasuredHeight();
        if (!z2) {
            height3 = paddingBottom;
        }
        return f2 + height3;
    }

    public static void v(BottomAppBar bottomAppBar) {
        bottomAppBar.getFabTranslationX();
        throw null;
    }

    public final void A(ActionMenuView actionMenuView, int i2, boolean z2) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        boolean z3 = getLayoutDirection() == 1;
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f1287a & 8388615) == 8388611) {
                i3 = Math.max(i3, z3 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i2 == 1 && z2) ? i3 - (z3 ? actionMenuView.getRight() : actionMenuView.getLeft()) : 0.0f);
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        throw null;
    }

    public int getFabAlignmentMode() {
        return this.Q;
    }

    public float getFabCradleMargin() {
        throw null;
    }

    public float getFabCradleRoundedCornerRadius() {
        throw null;
    }

    public boolean getHideOnScroll() {
        return this.R;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        Animator animator = this.P;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.O;
        if (animator2 != null) {
            animator2.cancel();
        }
        getFabTranslationX();
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f2110a);
        this.Q = aVar.f1461c;
        this.S = aVar.f1462d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f1461c = this.Q;
        aVar.f1462d = this.S;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            throw null;
        }
    }

    public void setFabAlignmentMode(int i2) {
        int i3;
        if (this.Q != i2) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            if (isLaidOut()) {
                Animator animator = this.O;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (!this.S) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x(), "translationX", y(i2));
                    ofFloat.setDuration(300L);
                    arrayList.add(ofFloat);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    this.O = animatorSet;
                    animatorSet.addListener(new x0.a(this));
                    this.O.start();
                } else {
                    throw null;
                }
            }
        }
        boolean z2 = this.S;
        WeakHashMap<View, o> weakHashMap2 = m.f1633a;
        if (isLaidOut()) {
            Animator animator2 = this.P;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (z()) {
                i3 = i2;
            } else {
                z2 = false;
                i3 = 0;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if ((this.S || (z2 && z())) && (this.Q == 1 || i3 == 1)) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat3.addListener(new c(this, actionMenuView, i3, z2));
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.setDuration(150L);
                    animatorSet2.playSequentially(ofFloat3, ofFloat2);
                    arrayList2.add(animatorSet2);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList2.add(ofFloat2);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.P = animatorSet3;
            animatorSet3.addListener(new b(this));
            this.P.start();
        }
        this.Q = i2;
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            throw null;
        }
    }

    public void setFabDiameter(int i2) {
        throw null;
    }

    public void setHideOnScroll(boolean z2) {
        this.R = z2;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton x() {
        if (getParent() instanceof CoordinatorLayout) {
            for (View view : ((CoordinatorLayout) getParent()).e(this)) {
                if (view instanceof FloatingActionButton) {
                    return (FloatingActionButton) view;
                }
            }
            return null;
        }
        return null;
    }

    public final int y(int i2) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        boolean z2 = getLayoutDirection() == 1;
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - 0) * (z2 ? -1 : 1);
        }
        return 0;
    }

    public final boolean z() {
        FloatingActionButton x2 = x();
        return x2 != null && x2.i();
    }
}