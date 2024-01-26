package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g1.a;
import g1.d;
import g1.e;
import java.util.Objects;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h  reason: collision with root package name */
    public final a f1551h = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f1551h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.f1817c == null) {
                    e.f1817c = new e();
                }
                synchronized (e.f1817c.f1818a) {
                }
            }
        } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.f1817c == null) {
                e.f1817c = new e();
            }
            synchronized (e.f1817c.f1818a) {
            }
        }
        return super.e(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean s(View view) {
        Objects.requireNonNull(this.f1551h);
        return view instanceof d;
    }
}