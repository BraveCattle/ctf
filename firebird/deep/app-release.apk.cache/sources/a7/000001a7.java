package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import z0.d;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f1580a;

    public c(FabTransformationBehavior fabTransformationBehavior, d dVar) {
        this.f1580a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        d.e revealInfo = this.f1580a.getRevealInfo();
        revealInfo.f2826c = Float.MAX_VALUE;
        this.f1580a.setRevealInfo(revealInfo);
    }
}