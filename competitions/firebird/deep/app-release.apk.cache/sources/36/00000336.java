package r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public class v extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f2644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2645b;

    public v(w wVar, p pVar, View view) {
        this.f2644a = pVar;
        this.f2645b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2644a.a(this.f2645b);
    }
}