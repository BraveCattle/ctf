package o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p.b;
import p.m;

/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: k0  reason: collision with root package name */
    public int f2444k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2445l0;

    /* renamed from: f0  reason: collision with root package name */
    public p.b f2439f0 = new p.b(this);

    /* renamed from: g0  reason: collision with root package name */
    public p.e f2440g0 = new p.e(this);

    /* renamed from: h0  reason: collision with root package name */
    public b.InterfaceC0032b f2441h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2442i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public n.d f2443j0 = new n.d();

    /* renamed from: m0  reason: collision with root package name */
    public int f2446m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public int f2447n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public c[] f2448o0 = new c[4];

    /* renamed from: p0  reason: collision with root package name */
    public c[] f2449p0 = new c[4];

    /* renamed from: q0  reason: collision with root package name */
    public int f2450q0 = 263;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2451r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2452s0 = false;

    @Override // o.e
    public void C(boolean z2, boolean z3) {
        super.C(z2, z3);
        int size = this.f2461e0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2461e0.get(i2).C(z2, z3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    @Override // o.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void E() {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.f.E():void");
    }

    public void F(e eVar, int i2) {
        if (i2 == 0) {
            int i3 = this.f2446m0 + 1;
            c[] cVarArr = this.f2449p0;
            if (i3 >= cVarArr.length) {
                this.f2449p0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.f2449p0;
            int i4 = this.f2446m0;
            cVarArr2[i4] = new c(eVar, 0, this.f2442i0);
            this.f2446m0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.f2447n0 + 1;
            c[] cVarArr3 = this.f2448o0;
            if (i5 >= cVarArr3.length) {
                this.f2448o0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.f2448o0;
            int i6 = this.f2447n0;
            cVarArr4[i6] = new c(eVar, 1, this.f2442i0);
            this.f2447n0 = i6 + 1;
        }
    }

    public boolean G(n.d dVar) {
        b(dVar);
        int size = this.f2461e0.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.f2461e0.get(i2);
            boolean[] zArr = eVar.I;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.f2461e0.get(i3);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i4 = 0; i4 < aVar.f2459f0; i4++) {
                        e eVar3 = aVar.f2458e0[i4];
                        int i5 = aVar.f2370g0;
                        if (i5 == 0 || i5 == 1) {
                            eVar3.I[0] = true;
                        } else if (i5 == 2 || i5 == 3) {
                            eVar3.I[1] = true;
                        }
                    }
                }
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = this.f2461e0.get(i6);
            Objects.requireNonNull(eVar4);
            if ((eVar4 instanceof k) || (eVar4 instanceof g)) {
                eVar4.b(dVar);
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            e eVar5 = this.f2461e0.get(i7);
            if (eVar5 instanceof f) {
                int[] iArr = eVar5.J;
                int i8 = iArr[0];
                int i9 = iArr[1];
                if (i8 == 2) {
                    iArr[0] = 1;
                }
                if (i9 == 2) {
                    iArr[1] = 1;
                }
                eVar5.b(dVar);
                if (i8 == 2) {
                    eVar5.x(i8);
                }
                if (i9 == 2) {
                    eVar5.A(i9);
                }
            } else {
                eVar5.f2420h = -1;
                eVar5.f2421i = -1;
                if (this.J[0] != 2 && eVar5.J[0] == 4) {
                    int i10 = eVar5.f2437y.f2397e;
                    int o2 = o() - eVar5.A.f2397e;
                    d dVar2 = eVar5.f2437y;
                    dVar2.f2399g = dVar.l(dVar2);
                    d dVar3 = eVar5.A;
                    dVar3.f2399g = dVar.l(dVar3);
                    dVar.e(eVar5.f2437y.f2399g, i10);
                    dVar.e(eVar5.A.f2399g, o2);
                    eVar5.f2420h = 2;
                    eVar5.P = i10;
                    int i11 = o2 - i10;
                    eVar5.L = i11;
                    int i12 = eVar5.S;
                    if (i11 < i12) {
                        eVar5.L = i12;
                    }
                }
                if (this.J[1] != 2 && eVar5.J[1] == 4) {
                    int i13 = eVar5.f2438z.f2397e;
                    int i14 = i() - eVar5.B.f2397e;
                    d dVar4 = eVar5.f2438z;
                    dVar4.f2399g = dVar.l(dVar4);
                    d dVar5 = eVar5.B;
                    dVar5.f2399g = dVar.l(dVar5);
                    dVar.e(eVar5.f2438z.f2399g, i13);
                    dVar.e(eVar5.B.f2399g, i14);
                    if (eVar5.R > 0 || eVar5.X == 8) {
                        d dVar6 = eVar5.C;
                        dVar6.f2399g = dVar.l(dVar6);
                        dVar.e(eVar5.C.f2399g, eVar5.R + i13);
                    }
                    eVar5.f2421i = 2;
                    eVar5.Q = i13;
                    int i15 = i14 - i13;
                    eVar5.M = i15;
                    int i16 = eVar5.T;
                    if (i15 < i16) {
                        eVar5.M = i16;
                    }
                }
                if (!((eVar5 instanceof k) || (eVar5 instanceof g))) {
                    eVar5.b(dVar);
                }
            }
        }
        if (this.f2446m0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.f2447n0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean H(boolean z2, int i2) {
        int i3;
        p.g gVar;
        boolean z3;
        p.g gVar2;
        int i4;
        p.e eVar = this.f2440g0;
        boolean z4 = true;
        boolean z5 = z2 & true;
        int h2 = eVar.f2478a.h(0);
        int h3 = eVar.f2478a.h(1);
        int p2 = eVar.f2478a.p();
        int q2 = eVar.f2478a.q();
        if (z5 && (h2 == 2 || h3 == 2)) {
            Iterator<m> it = eVar.f2482e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (next.f2519f == i2 && !next.k()) {
                    z5 = false;
                    break;
                }
            }
            if (i2 == 0) {
                if (z5 && h2 == 2) {
                    f fVar = eVar.f2478a;
                    fVar.J[0] = 1;
                    fVar.B(eVar.d(fVar, 0));
                    f fVar2 = eVar.f2478a;
                    gVar2 = fVar2.f2415d.f2518e;
                    i4 = fVar2.o();
                    gVar2.c(i4);
                }
            } else if (z5 && h3 == 2) {
                f fVar3 = eVar.f2478a;
                fVar3.J[1] = 1;
                fVar3.w(eVar.d(fVar3, 1));
                f fVar4 = eVar.f2478a;
                gVar2 = fVar4.f2417e.f2518e;
                i4 = fVar4.i();
                gVar2.c(i4);
            }
        }
        f fVar5 = eVar.f2478a;
        int[] iArr = fVar5.J;
        if (i2 == 0) {
            if (iArr[0] == 1 || iArr[0] == 4) {
                int o2 = fVar5.o() + p2;
                eVar.f2478a.f2415d.f2522i.c(o2);
                gVar = eVar.f2478a.f2415d.f2518e;
                i3 = o2 - p2;
                gVar.c(i3);
                z3 = true;
            }
            z3 = false;
        } else {
            if (iArr[1] == 1 || iArr[1] == 4) {
                int i5 = fVar5.i() + q2;
                eVar.f2478a.f2417e.f2522i.c(i5);
                i3 = i5 - q2;
                gVar = eVar.f2478a.f2417e.f2518e;
                gVar.c(i3);
                z3 = true;
            }
            z3 = false;
        }
        eVar.g();
        Iterator<m> it2 = eVar.f2482e.iterator();
        while (it2.hasNext()) {
            m next2 = it2.next();
            if (next2.f2519f == i2 && (next2.f2515b != eVar.f2478a || next2.f2520g)) {
                next2.e();
            }
        }
        Iterator<m> it3 = eVar.f2482e.iterator();
        while (it3.hasNext()) {
            m next3 = it3.next();
            if (next3.f2519f == i2 && (z3 || next3.f2515b != eVar.f2478a)) {
                if (!next3.f2521h.f2495j || !next3.f2522i.f2495j || (!(next3 instanceof p.c) && !next3.f2518e.f2495j)) {
                    z4 = false;
                    break;
                }
            }
        }
        eVar.f2478a.x(h2);
        eVar.f2478a.A(h3);
        return z4;
    }

    public void I() {
        this.f2440g0.f2479b = true;
    }

    public void J(int i2) {
        this.f2450q0 = i2;
        n.d.f2316p = j.a(i2, 256);
    }

    @Override // o.l, o.e
    public void u() {
        this.f2443j0.t();
        this.f2444k0 = 0;
        this.f2445l0 = 0;
        super.u();
    }
}