package r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c extends w {

    /* loaded from: classes.dex */
    public class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2569a;

        public a(c cVar, View view) {
            this.f2569a = view;
        }

        @Override // r0.g.d
        public void b(g gVar) {
            r.f2630a.c(this.f2569a, 1.0f);
            gVar.v(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f2570a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2571b = false;

        public b(View view) {
            this.f2570a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            r.f2630a.c(this.f2570a, 1.0f);
            if (this.f2571b) {
                this.f2570a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f2570a;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            if (view.hasOverlappingRendering() && this.f2570a.getLayerType() == 0) {
                this.f2571b = true;
                this.f2570a.setLayerType(2, null);
            }
        }
    }

    public c(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f2647x = i2;
    }

    @Override // r0.w
    public Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2) {
        Float f2;
        q.d dVar = r.f2630a;
        return K(view, (oVar == null || (f2 = (Float) oVar.f2627a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f2.floatValue(), 0.0f);
    }

    public final Animator K(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        r.f2630a.c(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, r.f2633d, f3);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // r0.g
    public void g(o oVar) {
        H(oVar);
        oVar.f2627a.put("android:fade:transitionAlpha", Float.valueOf(r.a(oVar.f2628b)));
    }
}