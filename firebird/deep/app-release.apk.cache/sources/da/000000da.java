package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.k;
import f0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends k.j {
    public boolean A;
    public e B;

    /* renamed from: m  reason: collision with root package name */
    public int f937m;

    /* renamed from: n  reason: collision with root package name */
    public f[] f938n;

    /* renamed from: o  reason: collision with root package name */
    public j f939o;

    /* renamed from: p  reason: collision with root package name */
    public j f940p;

    /* renamed from: q  reason: collision with root package name */
    public int f941q;

    /* renamed from: r  reason: collision with root package name */
    public final androidx.recyclerview.widget.f f942r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f943s;

    /* renamed from: u  reason: collision with root package name */
    public BitSet f945u;

    /* renamed from: z  reason: collision with root package name */
    public boolean f950z;

    /* renamed from: t  reason: collision with root package name */
    public boolean f944t = false;

    /* renamed from: v  reason: collision with root package name */
    public int f946v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f947w = Integer.MIN_VALUE;

    /* renamed from: x  reason: collision with root package name */
    public d f948x = new d();

    /* renamed from: y  reason: collision with root package name */
    public int f949y = 2;
    public final Rect C = new Rect();
    public final b D = new b();
    public boolean E = true;
    public final Runnable F = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.P();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f952a;

        /* renamed from: b  reason: collision with root package name */
        public int f953b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f954c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f955d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f956e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f957f;

        public b() {
            a();
        }

        public void a() {
            this.f952a = -1;
            this.f953b = Integer.MIN_VALUE;
            this.f954c = false;
            this.f955d = false;
            this.f956e = false;
            int[] iArr = this.f957f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends k.C0011k {

        /* renamed from: c  reason: collision with root package name */
        public f f959c;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f960a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f961b;

        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0007a();

            /* renamed from: a  reason: collision with root package name */
            public int f962a;

            /* renamed from: b  reason: collision with root package name */
            public int f963b;

            /* renamed from: c  reason: collision with root package name */
            public int[] f964c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f965d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0007a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i2) {
                    return new a[i2];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f962a = parcel.readInt();
                this.f963b = parcel.readInt();
                this.f965d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f964c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a2 = c.f.a("FullSpanItem{mPosition=");
                a2.append(this.f962a);
                a2.append(", mGapDir=");
                a2.append(this.f963b);
                a2.append(", mHasUnwantedGapAfter=");
                a2.append(this.f965d);
                a2.append(", mGapPerSpan=");
                a2.append(Arrays.toString(this.f964c));
                a2.append('}');
                return a2.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f962a);
                parcel.writeInt(this.f963b);
                parcel.writeInt(this.f965d ? 1 : 0);
                int[] iArr = this.f964c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f964c);
            }
        }

        public void a() {
            int[] iArr = this.f960a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f961b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f966a;

        /* renamed from: b  reason: collision with root package name */
        public int f967b;

        /* renamed from: c  reason: collision with root package name */
        public int f968c;

        /* renamed from: d  reason: collision with root package name */
        public int[] f969d;

        /* renamed from: e  reason: collision with root package name */
        public int f970e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f971f;

        /* renamed from: g  reason: collision with root package name */
        public List<d.a> f972g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f973h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f974i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f975j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f966a = parcel.readInt();
            this.f967b = parcel.readInt();
            int readInt = parcel.readInt();
            this.f968c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f969d = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f970e = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f971f = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f973h = parcel.readInt() == 1;
            this.f974i = parcel.readInt() == 1;
            this.f975j = parcel.readInt() == 1;
            this.f972g = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f968c = eVar.f968c;
            this.f966a = eVar.f966a;
            this.f967b = eVar.f967b;
            this.f969d = eVar.f969d;
            this.f970e = eVar.f970e;
            this.f971f = eVar.f971f;
            this.f973h = eVar.f973h;
            this.f974i = eVar.f974i;
            this.f975j = eVar.f975j;
            this.f972g = eVar.f972g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f966a);
            parcel.writeInt(this.f967b);
            parcel.writeInt(this.f968c);
            if (this.f968c > 0) {
                parcel.writeIntArray(this.f969d);
            }
            parcel.writeInt(this.f970e);
            if (this.f970e > 0) {
                parcel.writeIntArray(this.f971f);
            }
            parcel.writeInt(this.f973h ? 1 : 0);
            parcel.writeInt(this.f974i ? 1 : 0);
            parcel.writeInt(this.f975j ? 1 : 0);
            parcel.writeList(this.f972g);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f976a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f977b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f978c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f979d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f980e;

        public f(int i2) {
            this.f980e = i2;
        }

        public void a() {
            ArrayList<View> arrayList = this.f976a;
            View view = arrayList.get(arrayList.size() - 1);
            c e2 = e(view);
            this.f978c = StaggeredGridLayoutManager.this.f939o.b(view);
            Objects.requireNonNull(e2);
        }

        public void b() {
            View view = this.f976a.get(0);
            c e2 = e(view);
            this.f977b = StaggeredGridLayoutManager.this.f939o.c(view);
            Objects.requireNonNull(e2);
        }

        public void c() {
            this.f976a.clear();
            this.f977b = Integer.MIN_VALUE;
            this.f978c = Integer.MIN_VALUE;
            this.f979d = 0;
        }

        public int d(int i2) {
            int i3 = this.f978c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f976a.size() == 0) {
                return i2;
            }
            a();
            return this.f978c;
        }

        public c e(View view) {
            return (c) view.getLayoutParams();
        }

        public int f(int i2) {
            int i3 = this.f977b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f976a.size() == 0) {
                return i2;
            }
            b();
            return this.f977b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f937m = -1;
        this.f943s = false;
        k.j.c y2 = k.j.y(context, attributeSet, i2, i3);
        int i4 = y2.f1141a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i4 != this.f941q) {
            this.f941q = i4;
            j jVar = this.f939o;
            this.f939o = this.f940p;
            this.f940p = jVar;
            N();
        }
        int i5 = y2.f1142b;
        a(null);
        if (i5 != this.f937m) {
            this.f948x.a();
            N();
            this.f937m = i5;
            this.f945u = new BitSet(this.f937m);
            this.f938n = new f[this.f937m];
            for (int i6 = 0; i6 < this.f937m; i6++) {
                this.f938n[i6] = new f(i6);
            }
            N();
        }
        boolean z2 = y2.f1143c;
        a(null);
        e eVar = this.B;
        if (eVar != null && eVar.f973h != z2) {
            eVar.f973h = z2;
        }
        this.f943s = z2;
        N();
        this.f942r = new androidx.recyclerview.widget.f();
        this.f939o = j.a(this, this.f941q);
        this.f940p = j.a(this, 1 - this.f941q);
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean A() {
        return this.f949y != 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public void B(k kVar, k.p pVar) {
        Runnable runnable = this.F;
        k kVar2 = this.f1128b;
        if (kVar2 != null) {
            kVar2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.f937m; i2++) {
            this.f938n[i2].c();
        }
        kVar.requestLayout();
    }

    @Override // androidx.recyclerview.widget.k.j
    public void C(AccessibilityEvent accessibilityEvent) {
        super.C(accessibilityEvent);
        if (p() > 0) {
            View U = U(false);
            View T = T(false);
            if (U == null || T == null) {
                return;
            }
            x(U);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.k.j
    public void E(k.p pVar, k.s sVar, View view, f0.d dVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            D(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f941q == 0) {
            f fVar = cVar.f959c;
            i4 = fVar == null ? -1 : fVar.f980e;
            i5 = 1;
            i2 = -1;
            i3 = -1;
        } else {
            f fVar2 = cVar.f959c;
            i2 = fVar2 == null ? -1 : fVar2.f980e;
            i3 = 1;
            i4 = -1;
            i5 = -1;
        }
        dVar.f1731a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.b.a(i4, i5, i2, i3, false, false).f1739a);
    }

    @Override // androidx.recyclerview.widget.k.j
    public void F(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.B = (e) parcelable;
            N();
        }
    }

    @Override // androidx.recyclerview.widget.k.j
    public Parcelable G() {
        int f2;
        int e2;
        int[] iArr;
        e eVar = this.B;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f973h = this.f943s;
        eVar2.f974i = this.f950z;
        eVar2.f975j = this.A;
        d dVar = this.f948x;
        if (dVar == null || (iArr = dVar.f960a) == null) {
            eVar2.f970e = 0;
        } else {
            eVar2.f971f = iArr;
            eVar2.f970e = iArr.length;
            eVar2.f972g = dVar.f961b;
        }
        if (p() > 0) {
            if (this.f950z) {
                W();
            } else {
                V();
            }
            eVar2.f966a = 0;
            View T = this.f944t ? T(true) : U(true);
            if (T == null) {
                eVar2.f967b = -1;
                int i2 = this.f937m;
                eVar2.f968c = i2;
                eVar2.f969d = new int[i2];
                for (int i3 = 0; i3 < this.f937m; i3++) {
                    if (this.f950z) {
                        f2 = this.f938n[i3].d(Integer.MIN_VALUE);
                        if (f2 != Integer.MIN_VALUE) {
                            e2 = this.f939o.d();
                            f2 -= e2;
                            eVar2.f969d[i3] = f2;
                        } else {
                            eVar2.f969d[i3] = f2;
                        }
                    } else {
                        f2 = this.f938n[i3].f(Integer.MIN_VALUE);
                        if (f2 != Integer.MIN_VALUE) {
                            e2 = this.f939o.e();
                            f2 -= e2;
                            eVar2.f969d[i3] = f2;
                        } else {
                            eVar2.f969d[i3] = f2;
                        }
                    }
                }
            } else {
                x(T);
                throw null;
            }
        } else {
            eVar2.f966a = -1;
            eVar2.f967b = -1;
            eVar2.f968c = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.k.j
    public void H(int i2) {
        if (i2 == 0) {
            P();
        }
    }

    public boolean P() {
        if (p() != 0 && this.f949y != 0 && this.f1132f) {
            if (this.f944t) {
                W();
                V();
            } else {
                V();
                W();
            }
            if (X() != null) {
                this.f948x.a();
                this.f1131e = true;
                N();
                return true;
            }
        }
        return false;
    }

    public final int Q(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        return o.a(sVar, this.f939o, U(!this.E), T(!this.E), this, this.E);
    }

    public final int R(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        o.b(sVar, this.f939o, U(!this.E), T(!this.E), this, this.E, this.f944t);
        return 0;
    }

    public final int S(k.s sVar) {
        if (p() == 0) {
            return 0;
        }
        return o.c(sVar, this.f939o, U(!this.E), T(!this.E), this, this.E);
    }

    public View T(boolean z2) {
        int e2 = this.f939o.e();
        int d2 = this.f939o.d();
        View view = null;
        for (int p2 = p() - 1; p2 >= 0; p2--) {
            View o2 = o(p2);
            int c2 = this.f939o.c(o2);
            int b2 = this.f939o.b(o2);
            if (b2 > e2 && c2 < d2) {
                if (b2 <= d2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public View U(boolean z2) {
        int e2 = this.f939o.e();
        int d2 = this.f939o.d();
        int p2 = p();
        View view = null;
        for (int i2 = 0; i2 < p2; i2++) {
            View o2 = o(i2);
            int c2 = this.f939o.c(o2);
            if (this.f939o.b(o2) > e2 && c2 < d2) {
                if (c2 >= e2 || !z2) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public int V() {
        if (p() == 0) {
            return 0;
        }
        x(o(0));
        throw null;
    }

    public int W() {
        int p2 = p();
        if (p2 == 0) {
            return 0;
        }
        x(o(p2 - 1));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r10 == r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c9, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View X() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X():android.view.View");
    }

    public boolean Y() {
        return s() == 1;
    }

    @Override // androidx.recyclerview.widget.k.j
    public void a(String str) {
        k kVar;
        if (this.B != null || (kVar = this.f1128b) == null) {
            return;
        }
        kVar.e(str);
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean b() {
        return this.f941q == 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean c() {
        return this.f941q == 1;
    }

    @Override // androidx.recyclerview.widget.k.j
    public boolean d(k.C0011k c0011k) {
        return c0011k instanceof c;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int f(k.s sVar) {
        return Q(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int g(k.s sVar) {
        R(sVar);
        return 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int h(k.s sVar) {
        return S(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int i(k.s sVar) {
        return Q(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int j(k.s sVar) {
        R(sVar);
        return 0;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int k(k.s sVar) {
        return S(sVar);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k l() {
        return this.f941q == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k m(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.k.j
    public k.C0011k n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.k.j
    public int q(k.p pVar, k.s sVar) {
        if (this.f941q == 1) {
            return this.f937m;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.k.j
    public int z(k.p pVar, k.s sVar) {
        if (this.f941q == 0) {
            return this.f937m;
        }
        return 1;
    }
}