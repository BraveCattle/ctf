package o;

import o.d;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: e0  reason: collision with root package name */
    public float f2453e0 = -1.0f;

    /* renamed from: f0  reason: collision with root package name */
    public int f2454f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public int f2455g0 = -1;

    /* renamed from: h0  reason: collision with root package name */
    public d f2456h0 = this.f2438z;

    /* renamed from: i0  reason: collision with root package name */
    public int f2457i0 = 0;

    public g() {
        this.H.clear();
        this.H.add(this.f2456h0);
        int length = this.G.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.G[i2] = this.f2456h0;
        }
    }

    @Override // o.e
    public void D(n.d dVar) {
        if (this.K == null) {
            return;
        }
        int o2 = dVar.o(this.f2456h0);
        if (this.f2457i0 == 1) {
            this.P = o2;
            this.Q = 0;
            w(this.K.i());
            B(0);
            return;
        }
        this.P = 0;
        this.Q = o2;
        B(this.K.o());
        w(0);
    }

    public void E(int i2) {
        if (this.f2457i0 == i2) {
            return;
        }
        this.f2457i0 = i2;
        this.H.clear();
        this.f2456h0 = this.f2457i0 == 1 ? this.f2437y : this.f2438z;
        this.H.add(this.f2456h0);
        int length = this.G.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.G[i3] = this.f2456h0;
        }
    }

    @Override // o.e
    public void b(n.d dVar) {
        f fVar = (f) this.K;
        if (fVar == null) {
            return;
        }
        d f2 = fVar.f(d.a.LEFT);
        d f3 = fVar.f(d.a.RIGHT);
        e eVar = this.K;
        boolean z2 = true;
        boolean z3 = eVar != null && eVar.J[0] == 2;
        if (this.f2457i0 == 0) {
            f2 = fVar.f(d.a.TOP);
            f3 = fVar.f(d.a.BOTTOM);
            e eVar2 = this.K;
            if (eVar2 == null || eVar2.J[1] != 2) {
                z2 = false;
            }
            z3 = z2;
        }
        if (this.f2454f0 != -1) {
            n.h l2 = dVar.l(this.f2456h0);
            dVar.d(l2, dVar.l(f2), this.f2454f0, 8);
            if (z3) {
                dVar.f(dVar.l(f3), l2, 0, 5);
            }
        } else if (this.f2455g0 != -1) {
            n.h l3 = dVar.l(this.f2456h0);
            n.h l4 = dVar.l(f3);
            dVar.d(l3, l4, -this.f2455g0, 8);
            if (z3) {
                dVar.f(l3, dVar.l(f2), 0, 5);
                dVar.f(l4, l3, 0, 5);
            }
        } else if (this.f2453e0 != -1.0f) {
            n.h l5 = dVar.l(this.f2456h0);
            n.h l6 = dVar.l(f3);
            float f4 = this.f2453e0;
            n.b m2 = dVar.m();
            m2.f2309d.e(l5, -1.0f);
            m2.f2309d.e(l6, f4);
            dVar.c(m2);
        }
    }

    @Override // o.e
    public boolean c() {
        return true;
    }

    @Override // o.e
    public d f(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.f2457i0 == 1) {
                    return this.f2456h0;
                }
                break;
            case 2:
            case 4:
                if (this.f2457i0 == 0) {
                    return this.f2456h0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}