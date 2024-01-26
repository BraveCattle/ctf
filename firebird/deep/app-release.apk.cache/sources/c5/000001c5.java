package e0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f1630b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f1631c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f1632d;

    public l(View view, Runnable runnable) {
        this.f1630b = view;
        this.f1631c = view.getViewTreeObserver();
        this.f1632d = runnable;
    }

    public static l a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        l lVar = new l(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(lVar);
        view.addOnAttachStateChangeListener(lVar);
        return lVar;
    }

    public void b() {
        (this.f1631c.isAlive() ? this.f1631c : this.f1630b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f1630b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1632d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1631c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}