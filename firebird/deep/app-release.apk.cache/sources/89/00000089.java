package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class d extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public c f623b;

    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {

        /* renamed from: m0  reason: collision with root package name */
        public float f624m0;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f625n0;

        /* renamed from: o0  reason: collision with root package name */
        public float f626o0;

        /* renamed from: p0  reason: collision with root package name */
        public float f627p0;

        /* renamed from: q0  reason: collision with root package name */
        public float f628q0;

        /* renamed from: r0  reason: collision with root package name */
        public float f629r0;

        /* renamed from: s0  reason: collision with root package name */
        public float f630s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f631t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f632u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f633v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f634w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f635x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f636y0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f624m0 = 1.0f;
            this.f625n0 = false;
            this.f626o0 = 0.0f;
            this.f627p0 = 0.0f;
            this.f628q0 = 0.0f;
            this.f629r0 = 0.0f;
            this.f630s0 = 1.0f;
            this.f631t0 = 1.0f;
            this.f632u0 = 0.0f;
            this.f633v0 = 0.0f;
            this.f634w0 = 0.0f;
            this.f635x0 = 0.0f;
            this.f636y0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f624m0 = 1.0f;
            this.f625n0 = false;
            this.f626o0 = 0.0f;
            this.f627p0 = 0.0f;
            this.f628q0 = 0.0f;
            this.f629r0 = 0.0f;
            this.f630s0 = 1.0f;
            this.f631t0 = 1.0f;
            this.f632u0 = 0.0f;
            this.f633v0 = 0.0f;
            this.f634w0 = 0.0f;
            this.f635x0 = 0.0f;
            this.f636y0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2543c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.f624m0 = obtainStyledAttributes.getFloat(index, this.f624m0);
                } else if (index == 28) {
                    this.f626o0 = obtainStyledAttributes.getFloat(index, this.f626o0);
                    this.f625n0 = true;
                } else if (index == 23) {
                    this.f628q0 = obtainStyledAttributes.getFloat(index, this.f628q0);
                } else if (index == 24) {
                    this.f629r0 = obtainStyledAttributes.getFloat(index, this.f629r0);
                } else if (index == 22) {
                    this.f627p0 = obtainStyledAttributes.getFloat(index, this.f627p0);
                } else if (index == 20) {
                    this.f630s0 = obtainStyledAttributes.getFloat(index, this.f630s0);
                } else if (index == 21) {
                    this.f631t0 = obtainStyledAttributes.getFloat(index, this.f631t0);
                } else if (index == 16) {
                    this.f632u0 = obtainStyledAttributes.getFloat(index, this.f632u0);
                } else if (index == 17) {
                    this.f633v0 = obtainStyledAttributes.getFloat(index, this.f633v0);
                } else if (index == 18) {
                    this.f634w0 = obtainStyledAttributes.getFloat(index, this.f634w0);
                } else if (index == 19) {
                    this.f635x0 = obtainStyledAttributes.getFloat(index, this.f635x0);
                } else if (index == 27) {
                    this.f636y0 = obtainStyledAttributes.getFloat(index, this.f636y0);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public c getConstraintSet() {
        if (this.f623b == null) {
            this.f623b = new c();
        }
        c cVar = this.f623b;
        Objects.requireNonNull(cVar);
        int childCount = getChildCount();
        cVar.f552c.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.f551b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.f552c.containsKey(Integer.valueOf(id))) {
                cVar.f552c.put(Integer.valueOf(id), new c.a());
            }
            c.a aVar2 = cVar.f552c.get(Integer.valueOf(id));
            if (childAt instanceof b) {
                b bVar = (b) childAt;
                aVar2.c(id, aVar);
                if (bVar instanceof androidx.constraintlayout.widget.a) {
                    c.b bVar2 = aVar2.f556d;
                    bVar2.f567d0 = 1;
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) bVar;
                    bVar2.f563b0 = aVar3.getType();
                    aVar2.f556d.f569e0 = aVar3.getReferencedIds();
                    aVar2.f556d.f565c0 = aVar3.getMargin();
                }
            }
            aVar2.c(id, aVar);
        }
        return this.f623b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }
}