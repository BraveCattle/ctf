package r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.a f2609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2610b;

    public h(g gVar, l.a aVar) {
        this.f2610b = gVar;
        this.f2609a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2609a.remove(animator);
        this.f2610b.f2596m.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f2610b.f2596m.add(animator);
    }
}