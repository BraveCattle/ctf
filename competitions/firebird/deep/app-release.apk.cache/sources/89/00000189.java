package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.c;
import d1.g;

/* loaded from: classes.dex */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1506a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f1507b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.d f1508c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f1509d;

    public a(c cVar, boolean z2, c.d dVar) {
        this.f1509d = cVar;
        this.f1507b = z2;
        this.f1508c = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f1506a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        c cVar = this.f1509d;
        cVar.f1520a = 0;
        cVar.f1521b = null;
        if (this.f1506a) {
            return;
        }
        g gVar = cVar.f1534o;
        boolean z2 = this.f1507b;
        gVar.b(z2 ? 8 : 4, z2);
        c.d dVar = this.f1508c;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f1509d.f1534o.b(0, this.f1507b);
        c cVar = this.f1509d;
        cVar.f1520a = 1;
        cVar.f1521b = animator;
        this.f1506a = false;
    }
}