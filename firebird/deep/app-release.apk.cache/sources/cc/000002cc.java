package n;

import java.util.ArrayList;
import n.d;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: d  reason: collision with root package name */
    public a f2309d;

    /* renamed from: a  reason: collision with root package name */
    public h f2306a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f2307b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f2308c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2310e = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i2);

        h b(int i2);

        float c(h hVar);

        void clear();

        void d(h hVar, float f2, boolean z2);

        void e(h hVar, float f2);

        void f(float f2);

        float g(h hVar, boolean z2);

        float h(b bVar, boolean z2);

        boolean i(h hVar);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f2309d = new n.a(this, cVar);
    }

    @Override // n.d.a
    public h a(d dVar, boolean[] zArr) {
        return i(zArr, null);
    }

    @Override // n.d.a
    public void b(h hVar) {
        float f2;
        int i2 = hVar.f2346d;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
            this.f2309d.e(hVar, f2);
        }
        f2 = 1.0f;
        this.f2309d.e(hVar, f2);
    }

    public b c(d dVar, int i2) {
        this.f2309d.e(dVar.k(i2, "ep"), 1.0f);
        this.f2309d.e(dVar.k(i2, "em"), -1.0f);
        return this;
    }

    @Override // n.d.a
    public void clear() {
        this.f2309d.clear();
        this.f2306a = null;
        this.f2307b = 0.0f;
    }

    public b d(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f2309d.e(hVar, -1.0f);
        this.f2309d.e(hVar2, 1.0f);
        this.f2309d.e(hVar3, f2);
        this.f2309d.e(hVar4, -f2);
        return this;
    }

    public b e(h hVar, h hVar2, h hVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2307b = i2;
        }
        if (z2) {
            this.f2309d.e(hVar, 1.0f);
            this.f2309d.e(hVar2, -1.0f);
            this.f2309d.e(hVar3, -1.0f);
        } else {
            this.f2309d.e(hVar, -1.0f);
            this.f2309d.e(hVar2, 1.0f);
            this.f2309d.e(hVar3, 1.0f);
        }
        return this;
    }

    public b f(h hVar, h hVar2, h hVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f2307b = i2;
        }
        if (z2) {
            this.f2309d.e(hVar, 1.0f);
            this.f2309d.e(hVar2, -1.0f);
            this.f2309d.e(hVar3, 1.0f);
        } else {
            this.f2309d.e(hVar, -1.0f);
            this.f2309d.e(hVar2, 1.0f);
            this.f2309d.e(hVar3, -1.0f);
        }
        return this;
    }

    public b g(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f2309d.e(hVar3, 0.5f);
        this.f2309d.e(hVar4, 0.5f);
        this.f2309d.e(hVar, -0.5f);
        this.f2309d.e(hVar2, -0.5f);
        this.f2307b = -f2;
        return this;
    }

    public final boolean h(h hVar) {
        return hVar.f2354l <= 1;
    }

    public final h i(boolean[] zArr, h hVar) {
        int i2;
        int k2 = this.f2309d.k();
        h hVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < k2; i3++) {
            float a2 = this.f2309d.a(i3);
            if (a2 < 0.0f) {
                h b2 = this.f2309d.b(i3);
                if ((zArr == null || !zArr[b2.f2344b]) && b2 != hVar && (((i2 = b2.f2351i) == 3 || i2 == 4) && a2 < f2)) {
                    f2 = a2;
                    hVar2 = b2;
                }
            }
        }
        return hVar2;
    }

    public void j(h hVar) {
        h hVar2 = this.f2306a;
        if (hVar2 != null) {
            this.f2309d.e(hVar2, -1.0f);
            this.f2306a = null;
        }
        float g2 = this.f2309d.g(hVar, true) * (-1.0f);
        this.f2306a = hVar;
        if (g2 == 1.0f) {
            return;
        }
        this.f2307b /= g2;
        this.f2309d.f(g2);
    }

    public void k(h hVar, boolean z2) {
        if (hVar.f2348f) {
            float c2 = this.f2309d.c(hVar);
            this.f2307b = (hVar.f2347e * c2) + this.f2307b;
            this.f2309d.g(hVar, z2);
            if (z2) {
                hVar.b(this);
            }
        }
    }

    public void l(b bVar, boolean z2) {
        float h2 = this.f2309d.h(bVar, z2);
        this.f2307b = (bVar.f2307b * h2) + this.f2307b;
        if (z2) {
            bVar.f2306a.b(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            n.h r0 = r10.f2306a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L16
        L7:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = c.f.a(r0)
            n.h r1 = r10.f2306a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L16:
            java.lang.String r1 = " = "
            java.lang.String r0 = f.f.a(r0, r1)
            float r1 = r10.f2307b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L34
            java.lang.StringBuilder r0 = c.f.a(r0)
            float r1 = r10.f2307b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L35
        L34:
            r1 = r3
        L35:
            n.b$a r5 = r10.f2309d
            int r5 = r5.k()
        L3b:
            if (r3 >= r5) goto La5
            n.b$a r6 = r10.f2309d
            n.h r6 = r6.b(r3)
            if (r6 != 0) goto L46
            goto La2
        L46:
            n.b$a r7 = r10.f2309d
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L51
            goto La2
        L51:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L64
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.StringBuilder r0 = c.f.a(r0)
            java.lang.String r1 = "- "
            goto L76
        L64:
            java.lang.StringBuilder r0 = c.f.a(r0)
            if (r8 <= 0) goto L74
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L7e
        L74:
            java.lang.String r1 = " - "
        L76:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r7 = r7 * r9
        L7e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L97
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        L97:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        La2:
            int r3 = r3 + 1
            goto L3b
        La5:
            if (r1 != 0) goto Lad
            java.lang.String r1 = "0.0"
            java.lang.String r0 = f.f.a(r0, r1)
        Lad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.toString():java.lang.String");
    }
}