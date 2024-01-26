package p;

import java.util.List;
import o.d;
import p.f;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f2508k = new int[2];

    public j(o.e eVar) {
        super(eVar);
        this.f2521h.f2490e = f.a.LEFT;
        this.f2522i.f2490e = f.a.RIGHT;
        this.f2519f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0252, code lost:
        if (r15 != 1) goto L126;
     */
    @Override // p.m, p.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(p.d r19) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.j.a(p.d):void");
    }

    @Override // p.m
    public void d() {
        o.e eVar;
        o.e eVar2;
        f fVar;
        o.d dVar;
        List<d> list;
        d dVar2;
        f fVar2;
        f fVar3;
        f fVar4;
        int i2;
        o.e eVar3;
        o.e eVar4 = this.f2515b;
        if (eVar4.f2409a) {
            this.f2518e.c(eVar4.o());
        }
        if (!this.f2518e.f2495j) {
            int j2 = this.f2515b.j();
            this.f2517d = j2;
            if (j2 != 3) {
                if (j2 == 4 && (((eVar3 = this.f2515b.K) != null && eVar3.j() == 1) || eVar3.j() == 4)) {
                    int o2 = (eVar3.o() - this.f2515b.f2437y.b()) - this.f2515b.A.b();
                    b(this.f2521h, eVar3.f2415d.f2521h, this.f2515b.f2437y.b());
                    b(this.f2522i, eVar3.f2415d.f2522i, -this.f2515b.A.b());
                    this.f2518e.c(o2);
                    return;
                } else if (this.f2517d == 1) {
                    this.f2518e.c(this.f2515b.o());
                }
            }
        } else if (this.f2517d == 4 && (((eVar = this.f2515b.K) != null && eVar.j() == 1) || eVar.j() == 4)) {
            b(this.f2521h, eVar.f2415d.f2521h, this.f2515b.f2437y.b());
            b(this.f2522i, eVar.f2415d.f2522i, -this.f2515b.A.b());
            return;
        }
        g gVar = this.f2518e;
        if (gVar.f2495j) {
            o.e eVar5 = this.f2515b;
            if (eVar5.f2409a) {
                o.d[] dVarArr = eVar5.G;
                if (dVarArr[0].f2396d != null && dVarArr[1].f2396d != null) {
                    if (eVar5.s()) {
                        this.f2521h.f2491f = this.f2515b.G[0].b();
                        fVar = this.f2522i;
                        dVar = this.f2515b.G[1];
                        fVar.f2491f = -dVar.b();
                        return;
                    }
                    f h2 = h(this.f2515b.G[0]);
                    if (h2 != null) {
                        f fVar5 = this.f2521h;
                        int b2 = this.f2515b.G[0].b();
                        fVar5.f2497l.add(h2);
                        fVar5.f2491f = b2;
                        h2.f2496k.add(fVar5);
                    }
                    f h3 = h(this.f2515b.G[1]);
                    if (h3 != null) {
                        f fVar6 = this.f2522i;
                        fVar6.f2497l.add(h3);
                        fVar6.f2491f = -this.f2515b.G[1].b();
                        h3.f2496k.add(fVar6);
                    }
                    this.f2521h.f2487b = true;
                    this.f2522i.f2487b = true;
                    return;
                }
                if (dVarArr[0].f2396d != null) {
                    f h4 = h(dVarArr[0]);
                    if (h4 == null) {
                        return;
                    }
                    f fVar7 = this.f2521h;
                    int b3 = this.f2515b.G[0].b();
                    fVar7.f2497l.add(h4);
                    fVar7.f2491f = b3;
                    h4.f2496k.add(fVar7);
                } else if (dVarArr[1].f2396d != null) {
                    f h5 = h(dVarArr[1]);
                    if (h5 != null) {
                        f fVar8 = this.f2522i;
                        fVar8.f2497l.add(h5);
                        fVar8.f2491f = -this.f2515b.G[1].b();
                        h5.f2496k.add(fVar8);
                        fVar3 = this.f2521h;
                        fVar4 = this.f2522i;
                        i2 = -this.f2518e.f2492g;
                        b(fVar3, fVar4, i2);
                        return;
                    }
                    return;
                } else if ((eVar5 instanceof o.h) || eVar5.K == null || eVar5.f(d.a.CENTER).f2396d != null) {
                    return;
                } else {
                    o.e eVar6 = this.f2515b;
                    b(this.f2521h, eVar6.K.f2415d.f2521h, eVar6.p());
                }
                fVar3 = this.f2522i;
                fVar4 = this.f2521h;
                i2 = this.f2518e.f2492g;
                b(fVar3, fVar4, i2);
                return;
            }
        }
        if (this.f2517d == 3) {
            o.e eVar7 = this.f2515b;
            int i3 = eVar7.f2422j;
            if (i3 == 2) {
                o.e eVar8 = eVar7.K;
                if (eVar8 != null) {
                    g gVar2 = eVar8.f2417e.f2518e;
                    gVar.f2497l.add(gVar2);
                    gVar2.f2496k.add(this.f2518e);
                    g gVar3 = this.f2518e;
                    gVar3.f2487b = true;
                    gVar3.f2496k.add(this.f2521h);
                    list = this.f2518e.f2496k;
                    dVar2 = this.f2522i;
                    list.add(dVar2);
                }
            } else if (i3 == 3) {
                if (eVar7.f2423k == 3) {
                    this.f2521h.f2486a = this;
                    this.f2522i.f2486a = this;
                    l lVar = eVar7.f2417e;
                    lVar.f2521h.f2486a = this;
                    lVar.f2522i.f2486a = this;
                    gVar.f2486a = this;
                    if (eVar7.t()) {
                        this.f2518e.f2497l.add(this.f2515b.f2417e.f2518e);
                        this.f2515b.f2417e.f2518e.f2496k.add(this.f2518e);
                        l lVar2 = this.f2515b.f2417e;
                        lVar2.f2518e.f2486a = this;
                        this.f2518e.f2497l.add(lVar2.f2521h);
                        this.f2518e.f2497l.add(this.f2515b.f2417e.f2522i);
                        this.f2515b.f2417e.f2521h.f2496k.add(this.f2518e);
                        list = this.f2515b.f2417e.f2522i.f2496k;
                        dVar2 = this.f2518e;
                        list.add(dVar2);
                    } else if (this.f2515b.s()) {
                        this.f2515b.f2417e.f2518e.f2497l.add(this.f2518e);
                        list = this.f2518e.f2496k;
                        dVar2 = this.f2515b.f2417e.f2518e;
                        list.add(dVar2);
                    } else {
                        fVar2 = this.f2515b.f2417e.f2518e;
                    }
                } else {
                    g gVar4 = eVar7.f2417e.f2518e;
                    gVar.f2497l.add(gVar4);
                    gVar4.f2496k.add(this.f2518e);
                    this.f2515b.f2417e.f2521h.f2496k.add(this.f2518e);
                    this.f2515b.f2417e.f2522i.f2496k.add(this.f2518e);
                    g gVar5 = this.f2518e;
                    gVar5.f2487b = true;
                    gVar5.f2496k.add(this.f2521h);
                    this.f2518e.f2496k.add(this.f2522i);
                    this.f2521h.f2497l.add(this.f2518e);
                    fVar2 = this.f2522i;
                }
                list = fVar2.f2497l;
                dVar2 = this.f2518e;
                list.add(dVar2);
            }
            fVar.f2491f = -dVar.b();
            return;
        }
        o.e eVar9 = this.f2515b;
        o.d[] dVarArr2 = eVar9.G;
        if (dVarArr2[0].f2396d != null && dVarArr2[1].f2396d != null) {
            if (eVar9.s()) {
                this.f2521h.f2491f = this.f2515b.G[0].b();
                fVar = this.f2522i;
                dVar = this.f2515b.G[1];
                fVar.f2491f = -dVar.b();
                return;
            }
            f h6 = h(this.f2515b.G[0]);
            f h7 = h(this.f2515b.G[1]);
            h6.f2496k.add(this);
            if (h6.f2495j) {
                a(this);
            }
            h7.f2496k.add(this);
            if (h7.f2495j) {
                a(this);
            }
            this.f2523j = 4;
            return;
        }
        if (dVarArr2[0].f2396d != null) {
            f h8 = h(dVarArr2[0]);
            if (h8 == null) {
                return;
            }
            f fVar9 = this.f2521h;
            int b4 = this.f2515b.G[0].b();
            fVar9.f2497l.add(h8);
            fVar9.f2491f = b4;
            h8.f2496k.add(fVar9);
        } else if (dVarArr2[1].f2396d != null) {
            f h9 = h(dVarArr2[1]);
            if (h9 != null) {
                f fVar10 = this.f2522i;
                fVar10.f2497l.add(h9);
                fVar10.f2491f = -this.f2515b.G[1].b();
                h9.f2496k.add(fVar10);
                c(this.f2521h, this.f2522i, -1, this.f2518e);
                return;
            }
            return;
        } else if ((eVar9 instanceof o.h) || (eVar2 = eVar9.K) == null) {
            return;
        } else {
            b(this.f2521h, eVar2.f2415d.f2521h, eVar9.p());
        }
        c(this.f2522i, this.f2521h, 1, this.f2518e);
    }

    @Override // p.m
    public void e() {
        f fVar = this.f2521h;
        if (fVar.f2495j) {
            this.f2515b.P = fVar.f2492g;
        }
    }

    @Override // p.m
    public void f() {
        this.f2516c = null;
        this.f2521h.b();
        this.f2522i.b();
        this.f2518e.b();
        this.f2520g = false;
    }

    @Override // p.m
    public boolean k() {
        return this.f2517d != 3 || this.f2515b.f2422j == 0;
    }

    public final void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 != -1) {
            if (i6 == 0) {
                iArr[0] = (int) ((i8 * f2) + 0.5f);
                iArr[1] = i8;
                return;
            } else if (i6 != 1) {
                return;
            } else {
                iArr[0] = i7;
                iArr[1] = (int) ((i7 * f2) + 0.5f);
                return;
            }
        }
        int i9 = (int) ((i8 * f2) + 0.5f);
        int i10 = (int) ((i7 / f2) + 0.5f);
        if (i9 <= i7) {
            iArr[0] = i9;
            iArr[1] = i8;
        } else if (i10 <= i8) {
            iArr[0] = i7;
            iArr[1] = i10;
        }
    }

    public void n() {
        this.f2520g = false;
        this.f2521h.b();
        this.f2521h.f2495j = false;
        this.f2522i.b();
        this.f2522i.f2495j = false;
        this.f2518e.f2495j = false;
    }

    public String toString() {
        StringBuilder a2 = c.f.a("HorizontalRun ");
        a2.append(this.f2515b.Y);
        return a2.toString();
    }
}