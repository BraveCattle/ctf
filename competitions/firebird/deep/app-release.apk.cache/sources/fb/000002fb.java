package p;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f2514a;

    /* renamed from: b  reason: collision with root package name */
    public o.e f2515b;

    /* renamed from: c  reason: collision with root package name */
    public k f2516c;

    /* renamed from: d  reason: collision with root package name */
    public int f2517d;

    /* renamed from: e  reason: collision with root package name */
    public g f2518e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f2519f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2520g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f2521h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f2522i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f2523j = 1;

    public m(o.e eVar) {
        this.f2515b = eVar;
    }

    @Override // p.d
    public void a(d dVar) {
    }

    public final void b(f fVar, f fVar2, int i2) {
        fVar.f2497l.add(fVar2);
        fVar.f2491f = i2;
        fVar2.f2496k.add(fVar);
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f2497l.add(fVar2);
        fVar.f2497l.add(this.f2518e);
        fVar.f2493h = i2;
        fVar.f2494i = gVar;
        fVar2.f2496k.add(fVar);
        gVar.f2496k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int max;
        if (i3 == 0) {
            o.e eVar = this.f2515b;
            int i4 = eVar.f2426n;
            max = Math.max(eVar.f2425m, i2);
            if (i4 > 0) {
                max = Math.min(i4, i2);
            }
            if (max == i2) {
                return i2;
            }
        } else {
            o.e eVar2 = this.f2515b;
            int i5 = eVar2.f2429q;
            max = Math.max(eVar2.f2428p, i2);
            if (i5 > 0) {
                max = Math.min(i5, i2);
            }
            if (max == i2) {
                return i2;
            }
        }
        return max;
    }

    public final f h(o.d dVar) {
        m mVar;
        m mVar2;
        o.d dVar2 = dVar.f2396d;
        if (dVar2 == null) {
            return null;
        }
        o.e eVar = dVar2.f2394b;
        int ordinal = dVar2.f2395c.ordinal();
        if (ordinal == 1) {
            mVar = eVar.f2415d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                mVar2 = eVar.f2415d;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return eVar.f2417e.f2512k;
            } else {
                mVar2 = eVar.f2417e;
            }
            return mVar2.f2522i;
        } else {
            mVar = eVar.f2417e;
        }
        return mVar.f2521h;
    }

    public final f i(o.d dVar, int i2) {
        o.d dVar2 = dVar.f2396d;
        if (dVar2 == null) {
            return null;
        }
        o.e eVar = dVar2.f2394b;
        m mVar = i2 == 0 ? eVar.f2415d : eVar.f2417e;
        int ordinal = dVar2.f2395c.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return mVar.f2521h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return mVar.f2522i;
        }
        return null;
    }

    public long j() {
        g gVar = this.f2518e;
        if (gVar.f2495j) {
            return gVar.f2492g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f2514a == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(o.d r13, o.d r14, int r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.m.l(o.d, o.d, int):void");
    }
}