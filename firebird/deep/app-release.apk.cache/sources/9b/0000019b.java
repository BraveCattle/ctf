package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e0.m;
import e0.o;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f1556a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1557b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f1558c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ b1.a f1559d;

        public a(View view, int i2, b1.a aVar) {
            this.f1557b = view;
            this.f1558c = i2;
            this.f1559d = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f1557b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f1556a == this.f1558c) {
                b1.a aVar = this.f1559d;
                expandableBehavior.t((View) aVar, this.f1557b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f1556a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1556a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b1.a aVar = (b1.a) view2;
        if (s(aVar.a())) {
            this.f1556a = aVar.a() ? 1 : 2;
            return t((View) aVar, view, aVar.a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, View view, int i2) {
        b1.a aVar;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (!view.isLaidOut()) {
            List<View> d2 = coordinatorLayout.d(view);
            int size = d2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d2.get(i3);
                if (b(coordinatorLayout, view, view2)) {
                    aVar = (b1.a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null && s(aVar.a())) {
                int i4 = aVar.a() ? 1 : 2;
                this.f1556a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, aVar));
            }
        }
        return false;
    }

    public final boolean s(boolean z2) {
        if (!z2) {
            return this.f1556a == 1;
        }
        int i2 = this.f1556a;
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean t(View view, View view2, boolean z2, boolean z3);
}