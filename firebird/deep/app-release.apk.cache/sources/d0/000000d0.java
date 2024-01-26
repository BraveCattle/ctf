package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.k;
import java.util.Objects;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean A;
    public int B;
    public final SparseIntArray C;
    public final SparseIntArray D;
    public c E;

    /* loaded from: classes.dex */
    public static final class a extends c {
    }

    /* loaded from: classes.dex */
    public static class b extends k.C0011k {

        /* renamed from: c  reason: collision with root package name */
        public int f911c;

        public b(int i2, int i3) {
            super(i2, i3);
            this.f911c = -1;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f911c = -1;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f911c = -1;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f911c = -1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f912a = new SparseIntArray();

        public int a(int i2, int i3) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i4++;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i3 ? i5 + 1 : i5;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.A = false;
        this.B = -1;
        this.C = new SparseIntArray();
        this.D = new SparseIntArray();
        this.E = new a();
        new Rect();
        int i4 = k.j.y(context, attributeSet, i2, i3).f1142b;
        if (i4 == this.B) {
            return;
        }
        this.A = true;
        if (i4 >= 1) {
            this.B = i4;
            this.E.f912a.clear();
            N();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
    }

    @Override // androidx.recyclerview.widget.k.j
    public void E(k.p pVar, k.s sVar, View view, f0.d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof b) {
            Objects.requireNonNull((b) layoutParams);
            throw null;
        } else {
            D(view, dVar);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Z(boolean z2) {
        if (!z2) {
            a(null);
            if (this.f919s) {
                this.f919s = false;
                N();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int a0(k.p pVar, k.s sVar, int i2) {
        if (sVar.f1166e) {
            int c2 = pVar.c(i2);
            if (c2 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
                return 0;
            }
            return this.E.a(c2, this.B);
        }
        return this.E.a(i2, this.B);
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean d(k.C0011k c0011k) {
        return c0011k instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k.j
    public k.C0011k l() {
        return this.f913m == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k m(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int q(k.p pVar, k.s sVar) {
        if (this.f913m == 1) {
            return this.B;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return a0(pVar, sVar, sVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int z(k.p pVar, k.s sVar) {
        if (this.f913m == 0) {
            return this.B;
        }
        if (sVar.a() < 1) {
            return 0;
        }
        return a0(pVar, sVar, sVar.a() - 1) + 1;
    }
}