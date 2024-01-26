package n;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import n.b;

/* loaded from: classes.dex */
public class d {

    /* renamed from: o  reason: collision with root package name */
    public static int f2315o = 1000;

    /* renamed from: p  reason: collision with root package name */
    public static boolean f2316p = true;

    /* renamed from: q  reason: collision with root package name */
    public static long f2317q;

    /* renamed from: r  reason: collision with root package name */
    public static long f2318r;

    /* renamed from: b  reason: collision with root package name */
    public a f2320b;

    /* renamed from: e  reason: collision with root package name */
    public n.b[] f2323e;

    /* renamed from: k  reason: collision with root package name */
    public final c f2329k;

    /* renamed from: n  reason: collision with root package name */
    public a f2332n;

    /* renamed from: a  reason: collision with root package name */
    public int f2319a = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2321c = 32;

    /* renamed from: d  reason: collision with root package name */
    public int f2322d = 32;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2324f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean[] f2325g = new boolean[32];

    /* renamed from: h  reason: collision with root package name */
    public int f2326h = 1;

    /* renamed from: i  reason: collision with root package name */
    public int f2327i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f2328j = 32;

    /* renamed from: l  reason: collision with root package name */
    public h[] f2330l = new h[f2315o];

    /* renamed from: m  reason: collision with root package name */
    public int f2331m = 0;

    /* loaded from: classes.dex */
    public interface a {
        h a(d dVar, boolean[] zArr);

        void b(h hVar);

        void clear();
    }

    /* loaded from: classes.dex */
    public class b extends n.b {
        public b(d dVar, c cVar) {
            this.f2309d = new i(this, cVar);
        }
    }

    public d() {
        this.f2323e = null;
        this.f2323e = new n.b[32];
        s();
        c cVar = new c(0);
        this.f2329k = cVar;
        this.f2320b = new f(cVar);
        this.f2332n = f2316p ? new b(this, cVar) : new n.b(cVar);
    }

    public final h a(int i2, String str) {
        h hVar = (h) this.f2329k.f2313c.a();
        if (hVar == null) {
            hVar = new h(i2);
        } else {
            hVar.c();
        }
        hVar.f2351i = i2;
        int i3 = this.f2331m;
        int i4 = f2315o;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f2315o = i5;
            this.f2330l = (h[]) Arrays.copyOf(this.f2330l, i5);
        }
        h[] hVarArr = this.f2330l;
        int i6 = this.f2331m;
        this.f2331m = i6 + 1;
        hVarArr[i6] = hVar;
        return hVar;
    }

    public void b(h hVar, h hVar2, int i2, float f2, h hVar3, h hVar4, int i3, int i4) {
        int i5;
        float f3;
        n.b m2 = m();
        if (hVar2 == hVar3) {
            m2.f2309d.e(hVar, 1.0f);
            m2.f2309d.e(hVar4, 1.0f);
            m2.f2309d.e(hVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                m2.f2309d.e(hVar, 1.0f);
                m2.f2309d.e(hVar2, -1.0f);
                m2.f2309d.e(hVar3, -1.0f);
                m2.f2309d.e(hVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                    f3 = i5;
                }
            } else if (f2 <= 0.0f) {
                m2.f2309d.e(hVar, -1.0f);
                m2.f2309d.e(hVar2, 1.0f);
                f3 = i2;
            } else if (f2 >= 1.0f) {
                m2.f2309d.e(hVar4, -1.0f);
                m2.f2309d.e(hVar3, 1.0f);
                i5 = -i3;
                f3 = i5;
            } else {
                float f4 = 1.0f - f2;
                m2.f2309d.e(hVar, f4 * 1.0f);
                m2.f2309d.e(hVar2, f4 * (-1.0f));
                m2.f2309d.e(hVar3, (-1.0f) * f2);
                m2.f2309d.e(hVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    m2.f2307b = (i3 * f2) + ((-i2) * f4);
                }
            }
            m2.f2307b = f3;
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    public void c(n.b bVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        h i2;
        boolean z5 = true;
        if (this.f2327i + 1 >= this.f2328j || this.f2326h + 1 >= this.f2322d) {
            p();
        }
        if (bVar.f2310e) {
            z2 = false;
        } else {
            if (this.f2323e.length != 0) {
                boolean z6 = false;
                while (!z6) {
                    int k2 = bVar.f2309d.k();
                    for (int i3 = 0; i3 < k2; i3++) {
                        h b2 = bVar.f2309d.b(i3);
                        if (b2.f2345c != -1 || b2.f2348f) {
                            bVar.f2308c.add(b2);
                        }
                    }
                    if (bVar.f2308c.size() > 0) {
                        Iterator<h> it = bVar.f2308c.iterator();
                        while (it.hasNext()) {
                            h next = it.next();
                            if (next.f2348f) {
                                bVar.k(next, true);
                            } else {
                                bVar.l(this.f2323e[next.f2345c], true);
                            }
                        }
                        bVar.f2308c.clear();
                    } else {
                        z6 = true;
                    }
                }
            }
            if (bVar.f2306a == null && bVar.f2307b == 0.0f && bVar.f2309d.k() == 0) {
                return;
            }
            float f2 = bVar.f2307b;
            if (f2 < 0.0f) {
                bVar.f2307b = f2 * (-1.0f);
                bVar.f2309d.j();
            }
            int k3 = bVar.f2309d.k();
            float f3 = 0.0f;
            float f4 = 0.0f;
            h hVar = null;
            h hVar2 = null;
            boolean z7 = false;
            boolean z8 = false;
            for (int i4 = 0; i4 < k3; i4++) {
                float a2 = bVar.f2309d.a(i4);
                h b3 = bVar.f2309d.b(i4);
                if (b3.f2351i == 1) {
                    if (hVar == null || f3 > a2) {
                        z7 = bVar.h(b3);
                    } else if (!z7 && bVar.h(b3)) {
                        z7 = true;
                    }
                    hVar = b3;
                    f3 = a2;
                } else if (hVar == null && a2 < 0.0f) {
                    if (hVar2 == null || f4 > a2) {
                        z8 = bVar.h(b3);
                    } else if (!z8 && bVar.h(b3)) {
                        z8 = true;
                    }
                    hVar2 = b3;
                    f4 = a2;
                }
            }
            if (hVar == null) {
                hVar = hVar2;
            }
            if (hVar == null) {
                z3 = true;
            } else {
                bVar.j(hVar);
                z3 = false;
            }
            if (bVar.f2309d.k() == 0) {
                bVar.f2310e = true;
            }
            if (z3) {
                if (this.f2326h + 1 >= this.f2322d) {
                    p();
                }
                h a3 = a(3, null);
                int i5 = this.f2319a + 1;
                this.f2319a = i5;
                this.f2326h++;
                a3.f2344b = i5;
                ((h[]) this.f2329k.f2314d)[i5] = a3;
                bVar.f2306a = a3;
                i(bVar);
                n.b bVar2 = (n.b) this.f2332n;
                Objects.requireNonNull(bVar2);
                bVar2.f2306a = null;
                bVar2.f2309d.clear();
                for (int i6 = 0; i6 < bVar.f2309d.k(); i6++) {
                    bVar2.f2309d.d(bVar.f2309d.b(i6), bVar.f2309d.a(i6), true);
                }
                r(this.f2332n);
                if (a3.f2345c == -1) {
                    if (bVar.f2306a == a3 && (i2 = bVar.i(null, a3)) != null) {
                        bVar.j(i2);
                    }
                    if (!bVar.f2310e) {
                        bVar.f2306a.e(bVar);
                    }
                    this.f2327i--;
                }
                z4 = true;
            } else {
                z4 = false;
            }
            h hVar3 = bVar.f2306a;
            if (hVar3 == null || (hVar3.f2351i != 1 && bVar.f2307b < 0.0f)) {
                z5 = false;
            }
            if (!z5) {
                return;
            }
            z2 = z4;
        }
        if (z2) {
            return;
        }
        i(bVar);
    }

    public n.b d(h hVar, h hVar2, int i2, int i3) {
        if (i3 == 8 && hVar2.f2348f && hVar.f2345c == -1) {
            hVar.d(this, hVar2.f2347e + i2);
            return null;
        }
        n.b m2 = m();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            m2.f2307b = i2;
        }
        if (z2) {
            m2.f2309d.e(hVar, 1.0f);
            m2.f2309d.e(hVar2, -1.0f);
        } else {
            m2.f2309d.e(hVar, -1.0f);
            m2.f2309d.e(hVar2, 1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(h hVar, int i2) {
        n.b m2;
        b.a aVar;
        float f2;
        int i3 = hVar.f2345c;
        if (i3 == -1) {
            hVar.d(this, i2);
            return;
        }
        if (i3 != -1) {
            n.b bVar = this.f2323e[i3];
            if (!bVar.f2310e) {
                if (bVar.f2309d.k() == 0) {
                    bVar.f2310e = true;
                } else {
                    m2 = m();
                    if (i2 < 0) {
                        m2.f2307b = i2 * (-1);
                        aVar = m2.f2309d;
                        f2 = 1.0f;
                    } else {
                        m2.f2307b = i2;
                        aVar = m2.f2309d;
                        f2 = -1.0f;
                    }
                    aVar.e(hVar, f2);
                }
            }
            bVar.f2307b = i2;
            return;
        }
        m2 = m();
        m2.f2306a = hVar;
        float f3 = i2;
        hVar.f2347e = f3;
        m2.f2307b = f3;
        m2.f2310e = true;
        c(m2);
    }

    public void f(h hVar, h hVar2, int i2, int i3) {
        n.b m2 = m();
        h n2 = n();
        n2.f2346d = 0;
        m2.e(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f2309d.e(k(i3, null), (int) (m2.f2309d.c(n2) * (-1.0f)));
        }
        c(m2);
    }

    public void g(h hVar, h hVar2, int i2, int i3) {
        n.b m2 = m();
        h n2 = n();
        n2.f2346d = 0;
        m2.f(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f2309d.e(k(i3, null), (int) (m2.f2309d.c(n2) * (-1.0f)));
        }
        c(m2);
    }

    public void h(h hVar, h hVar2, h hVar3, h hVar4, float f2, int i2) {
        n.b m2 = m();
        m2.d(hVar, hVar2, hVar3, hVar4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(n.b bVar) {
        e eVar;
        n.b bVar2;
        if (f2316p) {
            n.b[] bVarArr = this.f2323e;
            int i2 = this.f2327i;
            if (bVarArr[i2] != null) {
                eVar = this.f2329k.f2311a;
                bVar2 = bVarArr[i2];
                eVar.c(bVar2);
            }
        } else {
            n.b[] bVarArr2 = this.f2323e;
            int i3 = this.f2327i;
            if (bVarArr2[i3] != null) {
                eVar = this.f2329k.f2312b;
                bVar2 = bVarArr2[i3];
                eVar.c(bVar2);
            }
        }
        n.b[] bVarArr3 = this.f2323e;
        int i4 = this.f2327i;
        bVarArr3[i4] = bVar;
        h hVar = bVar.f2306a;
        hVar.f2345c = i4;
        this.f2327i = i4 + 1;
        hVar.e(bVar);
    }

    public final void j() {
        for (int i2 = 0; i2 < this.f2327i; i2++) {
            n.b bVar = this.f2323e[i2];
            bVar.f2306a.f2347e = bVar.f2307b;
        }
    }

    public h k(int i2, String str) {
        if (this.f2326h + 1 >= this.f2322d) {
            p();
        }
        h a2 = a(4, str);
        int i3 = this.f2319a + 1;
        this.f2319a = i3;
        this.f2326h++;
        a2.f2344b = i3;
        a2.f2346d = i2;
        ((h[]) this.f2329k.f2314d)[i3] = a2;
        this.f2320b.b(a2);
        return a2;
    }

    public h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f2326h + 1 >= this.f2322d) {
            p();
        }
        if (obj instanceof o.d) {
            o.d dVar = (o.d) obj;
            hVar = dVar.f2399g;
            if (hVar == null) {
                dVar.f();
                hVar = dVar.f2399g;
            }
            int i2 = hVar.f2344b;
            if (i2 == -1 || i2 > this.f2319a || ((h[]) this.f2329k.f2314d)[i2] == null) {
                if (i2 != -1) {
                    hVar.c();
                }
                int i3 = this.f2319a + 1;
                this.f2319a = i3;
                this.f2326h++;
                hVar.f2344b = i3;
                hVar.f2351i = 1;
                ((h[]) this.f2329k.f2314d)[i3] = hVar;
            }
        }
        return hVar;
    }

    public n.b m() {
        n.b bVar;
        if (!f2316p) {
            bVar = (n.b) this.f2329k.f2312b.a();
            if (bVar == null) {
                bVar = new n.b(this.f2329k);
                f2317q++;
            }
            bVar.f2306a = null;
            bVar.f2309d.clear();
            bVar.f2307b = 0.0f;
            bVar.f2310e = false;
        } else {
            bVar = (n.b) this.f2329k.f2311a.a();
            if (bVar == null) {
                bVar = new b(this, this.f2329k);
                f2318r++;
            }
            bVar.f2306a = null;
            bVar.f2309d.clear();
            bVar.f2307b = 0.0f;
            bVar.f2310e = false;
        }
        h.f2342m++;
        return bVar;
    }

    public h n() {
        if (this.f2326h + 1 >= this.f2322d) {
            p();
        }
        h a2 = a(3, null);
        int i2 = this.f2319a + 1;
        this.f2319a = i2;
        this.f2326h++;
        a2.f2344b = i2;
        ((h[]) this.f2329k.f2314d)[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        h hVar = ((o.d) obj).f2399g;
        if (hVar != null) {
            return (int) (hVar.f2347e + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f2321c * 2;
        this.f2321c = i2;
        this.f2323e = (n.b[]) Arrays.copyOf(this.f2323e, i2);
        c cVar = this.f2329k;
        cVar.f2314d = (h[]) Arrays.copyOf((h[]) cVar.f2314d, this.f2321c);
        int i3 = this.f2321c;
        this.f2325g = new boolean[i3];
        this.f2322d = i3;
        this.f2328j = i3;
    }

    public void q(a aVar) {
        float f2;
        boolean z2;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f2327i) {
                z2 = false;
                break;
            }
            n.b[] bVarArr = this.f2323e;
            if (bVarArr[i2].f2306a.f2351i != 1 && bVarArr[i2].f2307b < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            boolean z3 = false;
            int i3 = 0;
            while (!z3) {
                i3++;
                float f3 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f2327i) {
                    n.b bVar = this.f2323e[i6];
                    if (bVar.f2306a.f2351i != 1 && !bVar.f2310e && bVar.f2307b < f2) {
                        int i8 = 1;
                        while (i8 < this.f2326h) {
                            h hVar = ((h[]) this.f2329k.f2314d)[i8];
                            float c2 = bVar.f2309d.c(hVar);
                            if (c2 > f2) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f4 = hVar.f2349g[i9] / c2;
                                    if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f4;
                                        i4 = i6;
                                        i5 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i6++;
                    f2 = 0.0f;
                }
                if (i4 != -1) {
                    n.b bVar2 = this.f2323e[i4];
                    bVar2.f2306a.f2345c = -1;
                    bVar2.j(((h[]) this.f2329k.f2314d)[i5]);
                    h hVar2 = bVar2.f2306a;
                    hVar2.f2345c = i4;
                    hVar2.e(bVar2);
                } else {
                    z3 = true;
                }
                if (i3 > this.f2326h / 2) {
                    z3 = true;
                }
                f2 = 0.0f;
            }
        }
        r(aVar);
        j();
    }

    public final int r(a aVar) {
        for (int i2 = 0; i2 < this.f2326h; i2++) {
            this.f2325g[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f2326h * 2) {
                return i3;
            }
            h hVar = ((n.b) aVar).f2306a;
            if (hVar != null) {
                this.f2325g[hVar.f2344b] = true;
            }
            h a2 = aVar.a(this, this.f2325g);
            if (a2 != null) {
                boolean[] zArr = this.f2325g;
                int i4 = a2.f2344b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f2327i; i6++) {
                    n.b bVar = this.f2323e[i6];
                    if (bVar.f2306a.f2351i != 1 && !bVar.f2310e && bVar.f2309d.i(a2)) {
                        float c2 = bVar.f2309d.c(a2);
                        if (c2 < 0.0f) {
                            float f3 = (-bVar.f2307b) / c2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    n.b bVar2 = this.f2323e[i5];
                    bVar2.f2306a.f2345c = -1;
                    bVar2.j(a2);
                    h hVar2 = bVar2.f2306a;
                    hVar2.f2345c = i5;
                    hVar2.e(bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    public final void s() {
        int i2 = 0;
        if (f2316p) {
            while (true) {
                n.b[] bVarArr = this.f2323e;
                if (i2 >= bVarArr.length) {
                    return;
                }
                n.b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.f2329k.f2311a.c(bVar);
                }
                this.f2323e[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                n.b[] bVarArr2 = this.f2323e;
                if (i2 >= bVarArr2.length) {
                    return;
                }
                n.b bVar2 = bVarArr2[i2];
                if (bVar2 != null) {
                    this.f2329k.f2312b.c(bVar2);
                }
                this.f2323e[i2] = null;
                i2++;
            }
        }
    }

    public void t() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f2329k;
            Object obj = cVar.f2314d;
            if (i2 >= ((h[]) obj).length) {
                break;
            }
            h hVar = ((h[]) obj)[i2];
            if (hVar != null) {
                hVar.c();
            }
            i2++;
        }
        e eVar = cVar.f2313c;
        h[] hVarArr = this.f2330l;
        int i3 = this.f2331m;
        Objects.requireNonNull(eVar);
        if (i3 > hVarArr.length) {
            i3 = hVarArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            h hVar2 = hVarArr[i4];
            int i5 = eVar.f2335c;
            Object[] objArr = eVar.f2334b;
            if (i5 < objArr.length) {
                objArr[i5] = hVar2;
                eVar.f2335c = i5 + 1;
            }
        }
        this.f2331m = 0;
        Arrays.fill((h[]) this.f2329k.f2314d, (Object) null);
        this.f2319a = 0;
        this.f2320b.clear();
        this.f2326h = 1;
        for (int i6 = 0; i6 < this.f2327i; i6++) {
            Objects.requireNonNull(this.f2323e[i6]);
        }
        s();
        this.f2327i = 0;
        this.f2332n = f2316p ? new b(this, this.f2329k) : new n.b(this.f2329k);
    }
}