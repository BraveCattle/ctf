package p;

import p.f;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k  reason: collision with root package name */
    public f f2512k;

    /* renamed from: l  reason: collision with root package name */
    public g f2513l;

    public l(o.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f2512k = fVar;
        this.f2513l = null;
        this.f2521h.f2490e = f.a.TOP;
        this.f2522i.f2490e = f.a.BOTTOM;
        fVar.f2490e = f.a.BASELINE;
        this.f2519f = 1;
    }

    @Override // p.m, p.d
    public void a(d dVar) {
        g gVar;
        float f2;
        int i2;
        g gVar2;
        if (n.g.a(this.f2523j) == 3) {
            o.e eVar = this.f2515b;
            l(eVar.f2438z, eVar.B, 1);
            return;
        }
        g gVar3 = this.f2518e;
        if (gVar3.f2488c && !gVar3.f2495j && this.f2517d == 3) {
            o.e eVar2 = this.f2515b;
            int i3 = eVar2.f2423k;
            if (i3 == 2) {
                o.e eVar3 = eVar2.K;
                if (eVar3 != null) {
                    if (eVar3.f2417e.f2518e.f2495j) {
                        f2 = gVar.f2492g * eVar2.f2430r;
                        i2 = (int) (f2 + 0.5f);
                    }
                }
            } else if (i3 == 3) {
                if (eVar2.f2415d.f2518e.f2495j) {
                    int i4 = eVar2.O;
                    if (i4 != -1) {
                        if (i4 == 0) {
                            f2 = gVar2.f2492g * eVar2.N;
                            i2 = (int) (f2 + 0.5f);
                        } else if (i4 != 1) {
                            i2 = 0;
                        }
                    }
                    f2 = gVar2.f2492g / eVar2.N;
                    i2 = (int) (f2 + 0.5f);
                }
            }
            gVar3.c(i2);
        }
        f fVar = this.f2521h;
        if (fVar.f2488c) {
            f fVar2 = this.f2522i;
            if (fVar2.f2488c) {
                if (fVar.f2495j && fVar2.f2495j && this.f2518e.f2495j) {
                    return;
                }
                if (!this.f2518e.f2495j && this.f2517d == 3) {
                    o.e eVar4 = this.f2515b;
                    if (eVar4.f2422j == 0 && !eVar4.t()) {
                        int i5 = this.f2521h.f2497l.get(0).f2492g;
                        f fVar3 = this.f2521h;
                        int i6 = i5 + fVar3.f2491f;
                        int i7 = this.f2522i.f2497l.get(0).f2492g + this.f2522i.f2491f;
                        fVar3.c(i6);
                        this.f2522i.c(i7);
                        this.f2518e.c(i7 - i6);
                        return;
                    }
                }
                if (!this.f2518e.f2495j && this.f2517d == 3 && this.f2514a == 1 && this.f2521h.f2497l.size() > 0 && this.f2522i.f2497l.size() > 0) {
                    int i8 = (this.f2522i.f2497l.get(0).f2492g + this.f2522i.f2491f) - (this.f2521h.f2497l.get(0).f2492g + this.f2521h.f2491f);
                    g gVar4 = this.f2518e;
                    int i9 = gVar4.f2507m;
                    if (i8 < i9) {
                        gVar4.c(i8);
                    } else {
                        gVar4.c(i9);
                    }
                }
                if (this.f2518e.f2495j && this.f2521h.f2497l.size() > 0 && this.f2522i.f2497l.size() > 0) {
                    f fVar4 = this.f2521h.f2497l.get(0);
                    f fVar5 = this.f2522i.f2497l.get(0);
                    int i10 = fVar4.f2492g;
                    f fVar6 = this.f2521h;
                    int i11 = fVar6.f2491f + i10;
                    int i12 = fVar5.f2492g;
                    int i13 = this.f2522i.f2491f + i12;
                    float f3 = this.f2515b.V;
                    if (fVar4 == fVar5) {
                        f3 = 0.5f;
                    } else {
                        i10 = i11;
                        i12 = i13;
                    }
                    fVar6.c((int) ((((i12 - i10) - this.f2518e.f2492g) * f3) + i10 + 0.5f));
                    this.f2522i.c(this.f2521h.f2492g + this.f2518e.f2492g);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0309, code lost:
        if (r9.f2515b.f2435w != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x035c, code lost:
        if (r0.f2517d == 3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0395, code lost:
        if (r9.f2515b.f2435w != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0397, code lost:
        r0 = r9.f2512k;
        r1 = r9.f2521h;
        r3 = r9.f2513l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040a, code lost:
        if (r0.f2517d == 3) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x040c, code lost:
        r0.f2518e.f2496k.add(r9.f2518e);
        r9.f2518e.f2497l.add(r9.f2515b.f2415d.f2518e);
        r9.f2518e.f2486a = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    @Override // p.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.l.d():void");
    }

    @Override // p.m
    public void e() {
        f fVar = this.f2521h;
        if (fVar.f2495j) {
            this.f2515b.Q = fVar.f2492g;
        }
    }

    @Override // p.m
    public void f() {
        this.f2516c = null;
        this.f2521h.b();
        this.f2522i.b();
        this.f2512k.b();
        this.f2518e.b();
        this.f2520g = false;
    }

    @Override // p.m
    public boolean k() {
        return this.f2517d != 3 || this.f2515b.f2423k == 0;
    }

    public void m() {
        this.f2520g = false;
        this.f2521h.b();
        this.f2521h.f2495j = false;
        this.f2522i.b();
        this.f2522i.f2495j = false;
        this.f2512k.b();
        this.f2512k.f2495j = false;
        this.f2518e.f2495j = false;
    }

    public String toString() {
        StringBuilder a2 = c.f.a("VerticalRun ");
        a2.append(this.f2515b.Y);
        return a2.toString();
    }
}