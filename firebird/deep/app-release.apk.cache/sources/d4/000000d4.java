package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public class LinearLayoutManager extends k.j {

    /* renamed from: n  reason: collision with root package name */
    public c f914n;

    /* renamed from: o  reason: collision with root package name */
    public j f915o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f916p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f917q;

    /* renamed from: m  reason: collision with root package name */
    public int f913m = 1;

    /* renamed from: r  reason: collision with root package name */
    public boolean f918r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f919s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f920t = true;

    /* renamed from: u  reason: collision with root package name */
    public int f921u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f922v = Integer.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    public d f923w = null;

    /* renamed from: x  reason: collision with root package name */
    public final a f924x = new a();

    /* renamed from: y  reason: collision with root package name */
    public final b f925y = new b();

    /* renamed from: z  reason: collision with root package name */
    public int f926z = 2;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public j f927a;

        /* renamed from: b  reason: collision with root package name */
        public int f928b;

        /* renamed from: c  reason: collision with root package name */
        public int f929c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f930d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f931e;

        public a() {
            a();
        }

        public void a() {
            this.f928b = -1;
            this.f929c = Integer.MIN_VALUE;
            this.f930d = false;
            this.f931e = false;
        }

        public String toString() {
            StringBuilder a2 = c.f.a("AnchorInfo{mPosition=");
            a2.append(this.f928b);
            a2.append(", mCoordinate=");
            a2.append(this.f929c);
            a2.append(", mLayoutFromEnd=");
            a2.append(this.f930d);
            a2.append(", mValid=");
            a2.append(this.f931e);
            a2.append('}');
            return a2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f932a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f933b = 0;
    }

    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f934a;

        /* renamed from: b  reason: collision with root package name */
        public int f935b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f936c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f934a = parcel.readInt();
            this.f935b = parcel.readInt();
            this.f936c = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f934a = dVar.f934a;
            this.f935b = dVar.f935b;
            this.f936c = dVar.f936c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f934a);
            parcel.writeInt(this.f935b);
            parcel.writeInt(this.f936c ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i2, boolean z2) {
        this.f917q = false;
        Y(i2);
        a(null);
        if (z2 == this.f917q) {
            return;
        }
        this.f917q = z2;
        N();
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean A() {
        return true;
    }

    @Override // androidx.recyclerview.widget.k.j
    public void B(k kVar, k.p pVar) {
    }

    @Override // androidx.recyclerview.widget.k.j
    public void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View V = V(0, p(), false, true);
            if (V == null) {
                accessibilityEvent.setFromIndex(-1);
                View V2 = V(p() - 1, -1, false, true);
                if (V2 == null) {
                    accessibilityEvent.setToIndex(-1);
                    return;
                } else {
                    x(V2);
                    throw null;
                }
            }
            x(V);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.k.j
    public void F(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f923w = (d) parcelable;
            N();
        }
    }

    @Override // androidx.recyclerview.widget.k.j
    public Parcelable G() {
        d dVar = this.f923w;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (p() <= 0) {
            dVar2.f934a = -1;
            return dVar2;
        }
        S();
        boolean z2 = this.f916p ^ this.f918r;
        dVar2.f936c = z2;
        if (!z2) {
            x(X());
            throw null;
        }
        View W = W();
        dVar2.f935b = this.f915o.d() - this.f915o.b(W);
        x(W);
        throw null;
    }

    public final int P(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        S();
        return o.a(sVar, this.f915o, U(!this.f920t, true), T(!this.f920t, true), this, this.f920t);
    }

    public final int Q(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        S();
        o.b(sVar, this.f915o, U(!this.f920t, true), T(!this.f920t, true), this, this.f920t, this.f918r);
        return 0;
    }

    public final int R(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        S();
        return o.c(sVar, this.f915o, U(!this.f920t, true), T(!this.f920t, true), this, this.f920t);
    }

    public void S() {
        if (this.f914n == null) {
            this.f914n = new c();
        }
    }

    public final View T(boolean z2, boolean z3) {
        int p2;
        int i2;
        if (this.f918r) {
            p2 = 0;
            i2 = p();
        } else {
            p2 = p() - 1;
            i2 = -1;
        }
        return V(p2, i2, z2, z3);
    }

    public final View U(boolean z2, boolean z3) {
        int i2;
        int p2;
        if (this.f918r) {
            i2 = p() - 1;
            p2 = -1;
        } else {
            i2 = 0;
            p2 = p();
        }
        return V(i2, p2, z2, z3);
    }

    public View V(int i2, int i3, boolean z2, boolean z3) {
        S();
        return (this.f913m == 0 ? this.f1129c : this.f1130d).a(i2, i3, z2 ? 24579 : 320, z3 ? 320 : 0);
    }

    public final View W() {
        return o(this.f918r ? 0 : p() - 1);
    }

    public final View X() {
        return o(this.f918r ? p() - 1 : 0);
    }

    public void Y(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        a(null);
        if (i2 != this.f913m || this.f915o == null) {
            j a2 = j.a(this, i2);
            this.f915o = a2;
            this.f924x.f927a = a2;
            this.f913m = i2;
            N();
        }
    }

    public void Z(boolean z2) {
        a(null);
        if (this.f919s == z2) {
            return;
        }
        this.f919s = z2;
        N();
    }

    @Override // androidx.recyclerview.widget.k.j
    public void a(String str) {
        k kVar;
        if (this.f923w != null || (kVar = this.f1128b) == null) {
            return;
        }
        kVar.e(str);
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean b() {
        return this.f913m == 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean c() {
        return this.f913m == 1;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int f(k.s sVar) {
        return P(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int g(k.s sVar) {
        Q(sVar);
        return 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int h(k.s sVar) {
        return R(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int i(k.s sVar) {
        return P(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int j(k.s sVar) {
        Q(sVar);
        return 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int k(k.s sVar) {
        return R(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k l() {
        return new k.C0011k(-2, -2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f917q = false;
        k.j.c y2 = k.j.y(context, attributeSet, i2, i3);
        Y(y2.f1141a);
        boolean z2 = y2.f1143c;
        a(null);
        if (z2 != this.f917q) {
            this.f917q = z2;
            N();
        }
        Z(y2.f1144d);
    }
}