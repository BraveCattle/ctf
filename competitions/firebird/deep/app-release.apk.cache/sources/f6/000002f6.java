package p;

/* loaded from: classes.dex */
public class h extends m {
    public h(o.e eVar) {
        super(eVar);
        eVar.f2415d.f();
        eVar.f2417e.f();
        this.f2519f = ((o.g) eVar).f2457i0;
    }

    @Override // p.m, p.d
    public void a(d dVar) {
        f fVar = this.f2521h;
        if (fVar.f2488c && !fVar.f2495j) {
            this.f2521h.c((int) ((fVar.f2497l.get(0).f2492g * ((o.g) this.f2515b).f2453e0) + 0.5f));
        }
    }

    @Override // p.m
    public void d() {
        m mVar;
        o.e eVar = this.f2515b;
        o.g gVar = (o.g) eVar;
        int i2 = gVar.f2454f0;
        int i3 = gVar.f2455g0;
        if (gVar.f2457i0 == 1) {
            f fVar = this.f2521h;
            if (i2 != -1) {
                fVar.f2497l.add(eVar.K.f2415d.f2521h);
                this.f2515b.K.f2415d.f2521h.f2496k.add(this.f2521h);
                this.f2521h.f2491f = i2;
            } else if (i3 != -1) {
                fVar.f2497l.add(eVar.K.f2415d.f2522i);
                this.f2515b.K.f2415d.f2522i.f2496k.add(this.f2521h);
                this.f2521h.f2491f = -i3;
            } else {
                fVar.f2487b = true;
                fVar.f2497l.add(eVar.K.f2415d.f2522i);
                this.f2515b.K.f2415d.f2522i.f2496k.add(this.f2521h);
            }
            m(this.f2515b.f2415d.f2521h);
            mVar = this.f2515b.f2415d;
        } else {
            f fVar2 = this.f2521h;
            if (i2 != -1) {
                fVar2.f2497l.add(eVar.K.f2417e.f2521h);
                this.f2515b.K.f2417e.f2521h.f2496k.add(this.f2521h);
                this.f2521h.f2491f = i2;
            } else if (i3 != -1) {
                fVar2.f2497l.add(eVar.K.f2417e.f2522i);
                this.f2515b.K.f2417e.f2522i.f2496k.add(this.f2521h);
                this.f2521h.f2491f = -i3;
            } else {
                fVar2.f2487b = true;
                fVar2.f2497l.add(eVar.K.f2417e.f2522i);
                this.f2515b.K.f2417e.f2522i.f2496k.add(this.f2521h);
            }
            m(this.f2515b.f2417e.f2521h);
            mVar = this.f2515b.f2417e;
        }
        m(mVar.f2522i);
    }

    @Override // p.m
    public void e() {
        o.e eVar = this.f2515b;
        if (((o.g) eVar).f2457i0 == 1) {
            eVar.P = this.f2521h.f2492g;
        } else {
            eVar.Q = this.f2521h.f2492g;
        }
    }

    @Override // p.m
    public void f() {
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