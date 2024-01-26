package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import z0.d;

/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f1578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f1579b;

    public b(FabTransformationBehavior fabTransformationBehavior, d dVar, Drawable drawable) {
        this.f1578a = dVar;
        this.f1579b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f1578a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1578a.setCircularRevealOverlayDrawable(this.f1579b);
    }
}