package o;

/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: g0  reason: collision with root package name */
    public int f2370g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2371h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public int f2372i0 = 0;

    @Override // o.e
    public void b(n.d dVar) {
        Object[] objArr;
        boolean z2;
        n.h hVar;
        d dVar2;
        int i2;
        int i3;
        int i4;
        d[] dVarArr = this.G;
        dVarArr[0] = this.f2437y;
        dVarArr[2] = this.f2438z;
        dVarArr[1] = this.A;
        dVarArr[3] = this.B;
        int i5 = 0;
        while (true) {
            objArr = this.G;
            if (i5 >= objArr.length) {
                break;
            }
            objArr[i5].f2399g = dVar.l(objArr[i5]);
            i5++;
        }
        int i6 = this.f2370g0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        d dVar3 = objArr[i6];
        for (int i7 = 0; i7 < this.f2459f0; i7++) {
            e eVar = this.f2458e0[i7];
            if ((this.f2371h0 || eVar.c()) && ((((i3 = this.f2370g0) == 0 || i3 == 1) && eVar.j() == 3 && eVar.f2437y.f2396d != null && eVar.A.f2396d != null) || (((i4 = this.f2370g0) == 2 || i4 == 3) && eVar.n() == 3 && eVar.f2438z.f2396d != null && eVar.B.f2396d != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = this.f2437y.c() || this.A.c();
        boolean z4 = this.f2438z.c() || this.B.c();
        int i8 = !z2 && (((i2 = this.f2370g0) == 0 && z3) || ((i2 == 2 && z4) || ((i2 == 1 && z3) || (i2 == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.f2459f0; i9++) {
            e eVar2 = this.f2458e0[i9];
            if (this.f2371h0 || eVar2.c()) {
                n.h l2 = dVar.l(eVar2.G[this.f2370g0]);
                d[] dVarArr2 = eVar2.G;
                int i10 = this.f2370g0;
                dVarArr2[i10].f2399g = l2;
                int i11 = (dVarArr2[i10].f2396d == null || dVarArr2[i10].f2396d.f2394b != this) ? 0 : dVarArr2[i10].f2397e + 0;
                if (i10 != 0 && i10 != 2) {
                    n.b m2 = dVar.m();
                    n.h n2 = dVar.n();
                    n2.f2346d = 0;
                    m2.e(dVar3.f2399g, l2, n2, this.f2372i0 + i11);
                    dVar.c(m2);
                } else {
                    n.b m3 = dVar.m();
                    n.h n3 = dVar.n();
                    n3.f2346d = 0;
                    m3.f(dVar3.f2399g, l2, n3, this.f2372i0 - i11);
                    dVar.c(m3);
                }
                dVar.d(dVar3.f2399g, l2, this.f2372i0 + i11, i8);
            }
        }
        int i12 = this.f2370g0;
        if (i12 == 0) {
            dVar.d(this.A.f2399g, this.f2437y.f2399g, 0, 8);
            dVar.d(this.f2437y.f2399g, this.K.A.f2399g, 0, 4);
            hVar = this.f2437y.f2399g;
            dVar2 = this.K.f2437y;
        } else if (i12 == 1) {
            dVar.d(this.f2437y.f2399g, this.A.f2399g, 0, 8);
            dVar.d(this.f2437y.f2399g, this.K.f2437y.f2399g, 0, 4);
            hVar = this.f2437y.f2399g;
            dVar2 = this.K.A;
        } else if (i12 == 2) {
            dVar.d(this.B.f2399g, this.f2438z.f2399g, 0, 8);
            dVar.d(this.f2438z.f2399g, this.K.B.f2399g, 0, 4);
            hVar = this.f2438z.f2399g;
            dVar2 = this.K.f2438z;
        } else if (i12 != 3) {
            return;
        } else {
            dVar.d(this.f2438z.f2399g, this.B.f2399g, 0, 8);
            dVar.d(this.f2438z.f2399g, this.K.f2438z.f2399g, 0, 4);
            hVar = this.f2438z.f2399g;
            dVar2 = this.K.B;
        }
        dVar.d(hVar, dVar2.f2399g, 0, 0);
    }

    @Override // o.e
    public boolean c() {
        return true;
    }

    @Override // o.e
    public String toString() {
        StringBuilder a2 = c.f.a("[Barrier] ");
        a2.append(this.Y);
        a2.append(" {");
        String sb = a2.toString();
        for (int i2 = 0; i2 < this.f2459f0; i2++) {
            e eVar = this.f2458e0[i2];
            if (i2 > 0) {
                sb = f.f.a(sb, ", ");
            }
            StringBuilder a3 = c.f.a(sb);
            a3.append(eVar.Y);
            sb = a3.toString();
        }
        return f.f.a(sb, "}");
    }
}