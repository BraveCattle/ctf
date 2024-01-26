package e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f1642a;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f1643a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1644b;

        public a(o oVar, p pVar, View view) {
            this.f1643a = pVar;
            this.f1644b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1643a.c(this.f1644b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1643a.a(this.f1644b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1643a.b(this.f1644b);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r f1645a;

        public b(o oVar, r rVar, View view) {
            this.f1645a = rVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) c.q.this.f1384d.getParent()).invalidate();
        }
    }

    public o(View view) {
        this.f1642a = new WeakReference<>(view);
    }

    public o a(float f2) {
        View view = this.f1642a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f1642a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public o c(long j2) {
        View view = this.f1642a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public o d(p pVar) {
        View view = this.f1642a.get();
        if (view != null) {
            e(view, pVar);
        }
        return this;
    }

    public final void e(View view, p pVar) {
        if (pVar != null) {
            view.animate().setListener(new a(this, pVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public o f(r rVar) {
        View view = this.f1642a.get();
        if (view != null) {
            view.animate().setUpdateListener(rVar != null ? new b(this, rVar, view) : null);
        }
        return this;
    }

    public o g(float f2) {
        View view = this.f1642a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}