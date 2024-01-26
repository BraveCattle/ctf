package p;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f implements d {

    /* renamed from: d  reason: collision with root package name */
    public m f2489d;

    /* renamed from: f  reason: collision with root package name */
    public int f2491f;

    /* renamed from: g  reason: collision with root package name */
    public int f2492g;

    /* renamed from: a  reason: collision with root package name */
    public d f2486a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2487b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2488c = false;

    /* renamed from: e  reason: collision with root package name */
    public a f2490e = a.UNKNOWN;

    /* renamed from: h  reason: collision with root package name */
    public int f2493h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f2494i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2495j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f2496k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f2497l = new ArrayList();

    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f2489d = mVar;
    }

    @Override // p.d
    public void a(d dVar) {
        for (f fVar : this.f2497l) {
            if (!fVar.f2495j) {
                return;
            }
        }
        this.f2488c = true;
        d dVar2 = this.f2486a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f2487b) {
            this.f2489d.a(this);
            return;
        }
        f fVar2 = null;
        int i2 = 0;
        for (f fVar3 : this.f2497l) {
            if (!(fVar3 instanceof g)) {
                i2++;
                fVar2 = fVar3;
            }
        }
        if (fVar2 != null && i2 == 1 && fVar2.f2495j) {
            g gVar = this.f2494i;
            if (gVar != null) {
                if (!gVar.f2495j) {
                    return;
                }
                this.f2491f = this.f2493h * gVar.f2492g;
            }
            c(fVar2.f2492g + this.f2491f);
        }
        d dVar3 = this.f2486a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f2497l.clear();
        this.f2496k.clear();
        this.f2495j = false;
        this.f2492g = 0;
        this.f2488c = false;
        this.f2487b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2489d.f2515b.Y);
        sb.append(":");
        sb.append(this.f2490e);
        sb.append("(");
        sb.append(this.f2495j ? Integer.valueOf(this.f2492g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f2497l.size());
        sb.append(":d=");
        sb.append(this.f2496k.size());
        sb.append(">");
        return sb.toString();
    }
}