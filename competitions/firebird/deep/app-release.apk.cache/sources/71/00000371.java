package x0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f2789b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2790c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2791d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2792e;

    public c(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z2) {
        this.f2792e = bottomAppBar;
        this.f2789b = actionMenuView;
        this.f2790c = i2;
        this.f2791d = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f2788a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f2788a) {
            return;
        }
        this.f2792e.A(this.f2789b, this.f2790c, this.f2791d);
    }
}