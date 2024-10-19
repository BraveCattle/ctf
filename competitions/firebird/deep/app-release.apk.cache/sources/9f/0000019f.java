package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;
import v0.g;
import v0.h;
import v0.i;

/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1563c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f1564d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f1565e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1566f;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f1567a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1568b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f1569c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z2, View view, View view2) {
            this.f1567a = z2;
            this.f1568b = view;
            this.f1569c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1567a) {
                return;
            }
            this.f1568b.setVisibility(4);
            this.f1569c.setAlpha(1.0f);
            this.f1569c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f1567a) {
                this.f1568b.setVisibility(0);
                this.f1569c.setAlpha(0.0f);
                this.f1569c.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f1570a;

        /* renamed from: b  reason: collision with root package name */
        public i f1571b;
    }

    public FabTransformationBehavior() {
        this.f1563c = new Rect();
        this.f1564d = new RectF();
        this.f1565e = new RectF();
        this.f1566f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1563c = new Rect();
        this.f1564d = new RectF();
        this.f1565e = new RectF();
        this.f1566f = new int[2];
    }

    public final ViewGroup A(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void c(CoordinatorLayout.f fVar) {
        if (fVar.f672h == 0) {
            fVar.f672h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b6 A[LOOP:0: B:119:0x03b4->B:120:0x03b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x033b  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.AnimatorSet u(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, i iVar) {
        RectF rectF = this.f1564d;
        RectF rectF2 = this.f1565e;
        y(view, rectF);
        y(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, i iVar) {
        RectF rectF = this.f1564d;
        RectF rectF2 = this.f1565e;
        y(view, rectF);
        y(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float x(b bVar, h hVar, float f2, float f3) {
        long j2 = hVar.f2720a;
        long j3 = hVar.f2721b;
        h c2 = bVar.f1570a.c("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((c2.f2720a + c2.f2721b) + 17) - j2)) / ((float) j3));
        TimeInterpolator timeInterpolator = v0.a.f2708a;
        return ((f3 - f2) * interpolation) + f2;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f1566f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z2);
}