package p;

import p.f;

/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f2507m;

    public g(m mVar) {
        super(mVar);
        this.f2490e = mVar instanceof j ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // p.f
    public void c(int i2) {
        if (this.f2495j) {
            return;
        }
        this.f2495j = true;
        this.f2492g = i2;
        for (d dVar : this.f2496k) {
            dVar.a(dVar);
        }
    }
}