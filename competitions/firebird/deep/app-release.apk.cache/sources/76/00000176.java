package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f1443a;

    /* renamed from: b  reason: collision with root package name */
    public int f1444b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPropertyAnimator f1445c;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f1445c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f1443a = 0;
        this.f1444b = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1443a = 0;
        this.f1444b = 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        this.f1443a = v2.getMeasuredHeight();
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f1444b;
        if (i6 != 1 && i3 > 0) {
            t(v2);
        } else if (i6 == 2 || i3 >= 0) {
        } else {
            u(v2);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
        return i2 == 2;
    }

    public final void s(V v2, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f1445c = v2.animate().translationY(i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }

    public void t(V v2) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1445c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f1444b = 1;
        s(v2, this.f1443a, 175L, v0.a.f2709b);
    }

    public void u(V v2) {
        ViewPropertyAnimator viewPropertyAnimator = this.f1445c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v2.clearAnimation();
        }
        this.f1444b = 2;
        s(v2, 0, 225L, v0.a.f2710c);
    }
}