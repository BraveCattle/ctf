package o;

import java.util.ArrayList;
import o.d;

/* loaded from: classes.dex */
public class e {
    public d A;
    public d B;
    public d C;
    public d D;
    public d E;
    public d F;
    public d[] G;
    public ArrayList<d> H;
    public boolean[] I;
    public int[] J;
    public e K;
    public int L;
    public int M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public Object W;
    public int X;
    public String Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f2410a0;

    /* renamed from: b  reason: collision with root package name */
    public p.c f2411b;

    /* renamed from: b0  reason: collision with root package name */
    public float[] f2412b0;

    /* renamed from: c  reason: collision with root package name */
    public p.c f2413c;

    /* renamed from: c0  reason: collision with root package name */
    public e[] f2414c0;

    /* renamed from: d0  reason: collision with root package name */
    public e[] f2416d0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2436x;

    /* renamed from: y  reason: collision with root package name */
    public d f2437y;

    /* renamed from: z  reason: collision with root package name */
    public d f2438z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2409a = false;

    /* renamed from: d  reason: collision with root package name */
    public p.j f2415d = new p.j(this);

    /* renamed from: e  reason: collision with root package name */
    public p.l f2417e = new p.l(this);

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f2418f = {true, true};

    /* renamed from: g  reason: collision with root package name */
    public int[] f2419g = {0, 0, 0, 0};

    /* renamed from: h  reason: collision with root package name */
    public int f2420h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2421i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f2422j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2423k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int[] f2424l = new int[2];

    /* renamed from: m  reason: collision with root package name */
    public int f2425m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f2426n = 0;

    /* renamed from: o  reason: collision with root package name */
    public float f2427o = 1.0f;

    /* renamed from: p  reason: collision with root package name */
    public int f2428p = 0;

    /* renamed from: q  reason: collision with root package name */
    public int f2429q = 0;

    /* renamed from: r  reason: collision with root package name */
    public float f2430r = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public int f2431s = -1;

    /* renamed from: t  reason: collision with root package name */
    public float f2432t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public int[] f2433u = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: v  reason: collision with root package name */
    public float f2434v = 0.0f;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2435w = false;

    public e() {
        d dVar = new d(this, d.a.LEFT);
        this.f2437y = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.f2438z = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.A = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.B = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.C = dVar5;
        this.D = new d(this, d.a.CENTER_X);
        this.E = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.F = dVar6;
        this.G = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        ArrayList<d> arrayList = new ArrayList<>();
        this.H = arrayList;
        this.I = new boolean[2];
        this.J = new int[]{1, 1};
        this.K = null;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        this.X = 0;
        this.Y = null;
        this.Z = 0;
        this.f2410a0 = 0;
        this.f2412b0 = new float[]{-1.0f, -1.0f};
        this.f2414c0 = new e[]{null, null};
        this.f2416d0 = new e[]{null, null};
        arrayList.add(this.f2437y);
        this.H.add(this.f2438z);
        this.H.add(this.A);
        this.H.add(this.B);
        this.H.add(this.D);
        this.H.add(this.E);
        this.H.add(this.F);
        this.H.add(this.C);
    }

    public void A(int i2) {
        this.J[1] = i2;
    }

    public void B(int i2) {
        this.L = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.L = i3;
        }
    }

    public void C(boolean z2, boolean z3) {
        int i2;
        int i3;
        p.j jVar = this.f2415d;
        boolean z4 = z2 & jVar.f2520g;
        p.l lVar = this.f2417e;
        boolean z5 = z3 & lVar.f2520g;
        int i4 = jVar.f2521h.f2492g;
        int i5 = lVar.f2521h.f2492g;
        int i6 = jVar.f2522i.f2492g;
        int i7 = lVar.f2522i.f2492g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.P = i4;
        }
        if (z5) {
            this.Q = i5;
        }
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        if (z4) {
            if (this.J[0] == 1 && i9 < (i3 = this.L)) {
                i9 = i3;
            }
            this.L = i9;
            int i11 = this.S;
            if (i9 < i11) {
                this.L = i11;
            }
        }
        if (z5) {
            if (this.J[1] == 1 && i10 < (i2 = this.M)) {
                i10 = i2;
            }
            this.M = i10;
            int i12 = this.T;
            if (i10 < i12) {
                this.M = i12;
            }
        }
    }

    public void D(n.d dVar) {
        int i2;
        int i3;
        int o2 = dVar.o(this.f2437y);
        int o3 = dVar.o(this.f2438z);
        int o4 = dVar.o(this.A);
        int o5 = dVar.o(this.B);
        p.j jVar = this.f2415d;
        p.f fVar = jVar.f2521h;
        if (fVar.f2495j) {
            p.f fVar2 = jVar.f2522i;
            if (fVar2.f2495j) {
                o2 = fVar.f2492g;
                o4 = fVar2.f2492g;
            }
        }
        p.l lVar = this.f2417e;
        p.f fVar3 = lVar.f2521h;
        if (fVar3.f2495j) {
            p.f fVar4 = lVar.f2522i;
            if (fVar4.f2495j) {
                o3 = fVar3.f2492g;
                o5 = fVar4.f2492g;
            }
        }
        int i4 = o5 - o3;
        if (o4 - o2 < 0 || i4 < 0 || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE) {
            o5 = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i5 = o4 - o2;
        int i6 = o5 - o3;
        this.P = o2;
        this.Q = o3;
        if (this.X == 8) {
            this.L = 0;
            this.M = 0;
            return;
        }
        int[] iArr = this.J;
        if (iArr[0] == 1 && i5 < (i3 = this.L)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.M)) {
            i6 = i2;
        }
        this.L = i5;
        this.M = i6;
        int i7 = this.T;
        if (i6 < i7) {
            this.M = i7;
        }
        int i8 = this.S;
        if (i5 < i8) {
            this.L = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(n.d r46) {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.b(n.d):void");
    }

    public boolean c() {
        return this.X != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0305 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(n.d r29, boolean r30, boolean r31, boolean r32, boolean r33, n.h r34, n.h r35, int r36, boolean r37, o.d r38, o.d r39, int r40, int r41, int r42, int r43, float r44, boolean r45, boolean r46, boolean r47, boolean r48, int r49, int r50, int r51, int r52, float r53, boolean r54) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.e.d(n.d, boolean, boolean, boolean, boolean, n.h, n.h, int, boolean, o.d, o.d, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void e(n.d dVar) {
        dVar.l(this.f2437y);
        dVar.l(this.f2438z);
        dVar.l(this.A);
        dVar.l(this.B);
        if (this.R > 0) {
            dVar.l(this.C);
        }
    }

    public d f(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f2437y;
            case 2:
                return this.f2438z;
            case 3:
                return this.A;
            case 4:
                return this.B;
            case 5:
                return this.C;
            case 6:
                return this.F;
            case 7:
                return this.D;
            case 8:
                return this.E;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int g() {
        return q() + this.M;
    }

    public int h(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return n();
        }
        return 0;
    }

    public int i() {
        if (this.X == 8) {
            return 0;
        }
        return this.M;
    }

    public int j() {
        return this.J[0];
    }

    public e k(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.B).f2396d) != null && dVar2.f2396d == dVar) {
                return dVar2.f2394b;
            }
            return null;
        }
        d dVar3 = this.A;
        d dVar4 = dVar3.f2396d;
        if (dVar4 == null || dVar4.f2396d != dVar3) {
            return null;
        }
        return dVar4.f2394b;
    }

    public e l(int i2) {
        d dVar;
        d dVar2;
        if (i2 != 0) {
            if (i2 == 1 && (dVar2 = (dVar = this.f2438z).f2396d) != null && dVar2.f2396d == dVar) {
                return dVar2.f2394b;
            }
            return null;
        }
        d dVar3 = this.f2437y;
        d dVar4 = dVar3.f2396d;
        if (dVar4 == null || dVar4.f2396d != dVar3) {
            return null;
        }
        return dVar4.f2394b;
    }

    public int m() {
        return p() + this.L;
    }

    public int n() {
        return this.J[1];
    }

    public int o() {
        if (this.X == 8) {
            return 0;
        }
        return this.L;
    }

    public int p() {
        e eVar = this.K;
        return (eVar == null || !(eVar instanceof f)) ? this.P : ((f) eVar).f2444k0 + this.P;
    }

    public int q() {
        e eVar = this.K;
        return (eVar == null || !(eVar instanceof f)) ? this.Q : ((f) eVar).f2445l0 + this.Q;
    }

    public final boolean r(int i2) {
        int i3 = i2 * 2;
        d[] dVarArr = this.G;
        if (dVarArr[i3].f2396d != null && dVarArr[i3].f2396d.f2396d != dVarArr[i3]) {
            int i4 = i3 + 1;
            if (dVarArr[i4].f2396d != null && dVarArr[i4].f2396d.f2396d == dVarArr[i4]) {
                return true;
            }
        }
        return false;
    }

    public boolean s() {
        d dVar = this.f2437y;
        d dVar2 = dVar.f2396d;
        if (dVar2 == null || dVar2.f2396d != dVar) {
            d dVar3 = this.A;
            d dVar4 = dVar3.f2396d;
            return dVar4 != null && dVar4.f2396d == dVar3;
        }
        return true;
    }

    public boolean t() {
        d dVar = this.f2438z;
        d dVar2 = dVar.f2396d;
        if (dVar2 == null || dVar2.f2396d != dVar) {
            d dVar3 = this.B;
            d dVar4 = dVar3.f2396d;
            return dVar4 != null && dVar4.f2396d == dVar3;
        }
        return true;
    }

    public String toString() {
        String str = "";
        StringBuilder a2 = c.f.a("");
        if (this.Y != null) {
            StringBuilder a3 = c.f.a("id: ");
            a3.append(this.Y);
            a3.append(" ");
            str = a3.toString();
        }
        a2.append(str);
        a2.append("(");
        a2.append(this.P);
        a2.append(", ");
        a2.append(this.Q);
        a2.append(") - (");
        a2.append(this.L);
        a2.append(" x ");
        a2.append(this.M);
        a2.append(")");
        return a2.toString();
    }

    public void u() {
        this.f2437y.e();
        this.f2438z.e();
        this.A.e();
        this.B.e();
        this.C.e();
        this.D.e();
        this.E.e();
        this.F.e();
        this.K = null;
        this.f2434v = 0.0f;
        this.L = 0;
        this.M = 0;
        this.N = 0.0f;
        this.O = -1;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0.5f;
        this.V = 0.5f;
        int[] iArr = this.J;
        iArr[0] = 1;
        iArr[1] = 1;
        this.W = null;
        this.X = 0;
        this.Z = 0;
        this.f2410a0 = 0;
        float[] fArr = this.f2412b0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f2420h = -1;
        this.f2421i = -1;
        int[] iArr2 = this.f2433u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f2422j = 0;
        this.f2423k = 0;
        this.f2427o = 1.0f;
        this.f2430r = 1.0f;
        this.f2426n = Integer.MAX_VALUE;
        this.f2429q = Integer.MAX_VALUE;
        this.f2425m = 0;
        this.f2428p = 0;
        this.f2431s = -1;
        this.f2432t = 1.0f;
        boolean[] zArr = this.f2418f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.I;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public void v(n.c cVar) {
        this.f2437y.f();
        this.f2438z.f();
        this.A.f();
        this.B.f();
        this.C.f();
        this.F.f();
        this.D.f();
        this.E.f();
    }

    public void w(int i2) {
        this.M = i2;
        int i3 = this.T;
        if (i2 < i3) {
            this.M = i3;
        }
    }

    public void x(int i2) {
        this.J[0] = i2;
    }

    public void y(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.T = i2;
    }

    public void z(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.S = i2;
    }
}