package n;

import java.util.Arrays;
import java.util.Comparator;
import n.b;

/* loaded from: classes.dex */
public class f extends n.b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f2336f;

    /* renamed from: g  reason: collision with root package name */
    public h[] f2337g;

    /* renamed from: h  reason: collision with root package name */
    public int f2338h;

    /* renamed from: i  reason: collision with root package name */
    public b f2339i;

    /* loaded from: classes.dex */
    public class a implements Comparator<h> {
        public a(f fVar) {
        }

        @Override // java.util.Comparator
        public int compare(h hVar, h hVar2) {
            return hVar.f2344b - hVar2.f2344b;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Comparable {

        /* renamed from: a  reason: collision with root package name */
        public h f2340a;

        public b(f fVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2340a.f2344b - ((h) obj).f2344b;
        }

        public String toString() {
            String str = "[ ";
            if (this.f2340a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder a2 = c.f.a(str);
                    a2.append(this.f2340a.f2350h[i2]);
                    a2.append(" ");
                    str = a2.toString();
                }
            }
            return str + "] " + this.f2340a;
        }
    }

    public f(c cVar) {
        super(cVar);
        this.f2336f = new h[128];
        this.f2337g = new h[128];
        this.f2338h = 0;
        this.f2339i = new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r8 < r7) goto L32;
     */
    @Override // n.b, n.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n.h a(n.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = -1
            r0 = 0
            r2 = r11
            r1 = r0
        L4:
            int r3 = r10.f2338h
            if (r1 >= r3) goto L57
            n.h[] r3 = r10.f2336f
            r4 = r3[r1]
            int r5 = r4.f2344b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L54
        L13:
            n.f$b r5 = r10.f2339i
            r5.f2340a = r4
            r4 = 8
            r6 = 1
            if (r2 != r11) goto L36
        L1c:
            if (r4 < 0) goto L32
            n.h r3 = r5.f2340a
            float[] r3 = r3.f2350h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2a
            goto L32
        L2a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L33
        L2f:
            int r4 = r4 + (-1)
            goto L1c
        L32:
            r6 = r0
        L33:
            if (r6 == 0) goto L54
            goto L53
        L36:
            r3 = r3[r2]
        L38:
            if (r4 < 0) goto L50
            float[] r7 = r3.f2350h
            r7 = r7[r4]
            n.h r8 = r5.f2340a
            float[] r8 = r8.f2350h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L4b
            int r4 = r4 + (-1)
            goto L38
        L4b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L50
            goto L51
        L50:
            r6 = r0
        L51:
            if (r6 == 0) goto L54
        L53:
            r2 = r1
        L54:
            int r1 = r1 + 1
            goto L4
        L57:
            if (r2 != r11) goto L5b
            r11 = 0
            return r11
        L5b:
            n.h[] r11 = r10.f2336f
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.a(n.d, boolean[]):n.h");
    }

    @Override // n.b, n.d.a
    public void b(h hVar) {
        this.f2339i.f2340a = hVar;
        Arrays.fill(hVar.f2350h, 0.0f);
        hVar.f2350h[hVar.f2346d] = 1.0f;
        m(hVar);
    }

    @Override // n.b, n.d.a
    public void clear() {
        this.f2338h = 0;
        this.f2307b = 0.0f;
    }

    @Override // n.b
    public void l(n.b bVar, boolean z2) {
        h hVar = bVar.f2306a;
        if (hVar == null) {
            return;
        }
        b.a aVar = bVar.f2309d;
        int k2 = aVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            h b2 = aVar.b(i2);
            float a2 = aVar.a(i2);
            b bVar2 = this.f2339i;
            bVar2.f2340a = b2;
            boolean z3 = true;
            if (b2.f2343a) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = bVar2.f2340a.f2350h;
                    fArr[i3] = (hVar.f2350h[i3] * a2) + fArr[i3];
                    if (Math.abs(fArr[i3]) < 1.0E-4f) {
                        bVar2.f2340a.f2350h[i3] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    f.this.n(bVar2.f2340a);
                }
                z3 = false;
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = hVar.f2350h[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * a2;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        bVar2.f2340a.f2350h[i4] = f3;
                    } else {
                        bVar2.f2340a.f2350h[i4] = 0.0f;
                    }
                }
            }
            if (z3) {
                m(b2);
            }
            this.f2307b = (bVar.f2307b * a2) + this.f2307b;
        }
        n(hVar);
    }

    public final void m(h hVar) {
        int i2;
        int i3 = this.f2338h + 1;
        h[] hVarArr = this.f2336f;
        if (i3 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f2336f = hVarArr2;
            this.f2337g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f2336f;
        int i4 = this.f2338h;
        hVarArr3[i4] = hVar;
        int i5 = i4 + 1;
        this.f2338h = i5;
        if (i5 > 1 && hVarArr3[i5 - 1].f2344b > hVar.f2344b) {
            int i6 = 0;
            while (true) {
                i2 = this.f2338h;
                if (i6 >= i2) {
                    break;
                }
                this.f2337g[i6] = this.f2336f[i6];
                i6++;
            }
            Arrays.sort(this.f2337g, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f2338h; i7++) {
                this.f2336f[i7] = this.f2337g[i7];
            }
        }
        hVar.f2343a = true;
        hVar.a(this);
    }

    public final void n(h hVar) {
        int i2 = 0;
        while (i2 < this.f2338h) {
            if (this.f2336f[i2] == hVar) {
                while (true) {
                    int i3 = this.f2338h;
                    if (i2 >= i3 - 1) {
                        this.f2338h = i3 - 1;
                        hVar.f2343a = false;
                        return;
                    }
                    h[] hVarArr = this.f2336f;
                    int i4 = i2 + 1;
                    hVarArr[i2] = hVarArr[i4];
                    i2 = i4;
                }
            } else {
                i2++;
            }
        }
    }

    @Override // n.b
    public String toString() {
        String str = " goal -> (" + this.f2307b + ") : ";
        for (int i2 = 0; i2 < this.f2338h; i2++) {
            this.f2339i.f2340a = this.f2336f[i2];
            StringBuilder a2 = c.f.a(str);
            a2.append(this.f2339i);
            a2.append(" ");
            str = a2.toString();
        }
        return str;
    }
}