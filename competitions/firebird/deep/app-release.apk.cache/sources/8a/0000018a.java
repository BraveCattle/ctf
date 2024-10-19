package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.c;

/* loaded from: classes.dex */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f1510a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.d f1511b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f1512c;

    public b(c cVar, boolean z2, c.d dVar) {
        this.f1512c = cVar;
        this.f1510a = z2;
        this.f1511b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        c cVar = this.f1512c;
        cVar.f1520a = 0;
        cVar.f1521b = null;
        c.d dVar = this.f1511b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1512c.f1534o.b(0, this.f1510a);
        c cVar = this.f1512c;
        cVar.f1520a = 2;
        cVar.f1521b = animator;
    }
}