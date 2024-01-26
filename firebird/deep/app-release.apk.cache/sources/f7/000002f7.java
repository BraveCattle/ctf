package p;

import p.f;

/* loaded from: classes.dex */
public class i extends m {
    public i(o.e eVar) {
        super(eVar);
    }

    @Override // p.m, p.d
    public void a(d dVar) {
        o.a aVar = (o.a) this.f2515b;
        int i2 = aVar.f2370g0;
        int i3 = 0;
        int i4 = -1;
        for (f fVar : this.f2521h.f2497l) {
            int i5 = fVar.f2492g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 != 0 && i2 != 2) {
            this.f2521h.c(i3 + aVar.f2372i0);
        } else {
            this.f2521h.c(i4 + aVar.f2372i0);
        }
    }

    @Override // p.m
    public void d() {
        m mVar;
        o.e eVar = this.f2515b;
        if (eVar instanceof o.a) {
            f fVar = this.f2521h;
            fVar.f2487b = true;
            o.a aVar = (o.a) eVar;
            int i2 = aVar.f2370g0;
            boolean z2 = aVar.f2371h0;
            int i3 = 0;
            if (i2 == 0) {
                fVar.f2490e = f.a.LEFT;
                while (i3 < aVar.f2459f0) {
                    o.e eVar2 = aVar.f2458e0[i3];
                    if (z2 || eVar2.X != 8) {
                        f fVar2 = eVar2.f2415d.f2521h;
                        fVar2.f2496k.add(this.f2521h);
                        this.f2521h.f2497l.add(fVar2);
                    }
                    i3++;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    fVar.f2490e = f.a.TOP;
                    while (i3 < aVar.f2459f0) {
                        o.e eVar3 = aVar.f2458e0[i3];
                        if (z2 || eVar3.X != 8) {
                            f fVar3 = eVar3.f2417e.f2521h;
                            fVar3.f2496k.add(this.f2521h);
                            this.f2521h.f2497l.add(fVar3);
                        }
                        i3++;
                    }
                } else if (i2 != 3) {
                    return;
                } else {
                    fVar.f2490e = f.a.BOTTOM;
                    while (i3 < aVar.f2459f0) {
                        o.e eVar4 = aVar.f2458e0[i3];
                        if (z2 || eVar4.X != 8) {
                            f fVar4 = eVar4.f2417e.f2522i;
                            fVar4.f2496k.add(this.f2521h);
                            this.f2521h.f2497l.add(fVar4);
                        }
                        i3++;
                    }
                }
                m(this.f2515b.f2417e.f2521h);
                mVar = this.f2515b.f2417e;
                m(mVar.f2522i);
            } else {
                fVar.f2490e = f.a.RIGHT;
                while (i3 < aVar.f2459f0) {
                    o.e eVar5 = aVar.f2458e0[i3];
                    if (z2 || eVar5.X != 8) {
                        f fVar5 = eVar5.f2415d.f2522i;
                        fVar5.f2496k.add(this.f2521h);
                        this.f2521h.f2497l.add(fVar5);
                    }
                    i3++;
                }
            }
            m(this.f2515b.f2415d.f2521h);
            mVar = this.f2515b.f2415d;
            m(mVar.f2522i);
        }
    }

    @Override // p.m
    public void e() {
        o.e eVar = this.f2515b;
        if (eVar instanceof o.a) {
            int i2 = ((o.a) eVar).f2370g0;
            if (i2 != 0 && i2 != 1) {
                eVar.Q = this.f2521h.f2492g;
            } else {
                eVar.P = this.f2521h.f2492g;
            }
        }
    }

    @Override // p.m
    public void f() {
        this.f2516c = null;
        this.f2521h.b();
    }

    @Override // p.m
    public boolean k() {
        return false;
    }

    public final void m(f fVar) {
        this.f2521h.f2496k.add(fVar);
        fVar.f2497l.add(this.f2521h);
    }
}