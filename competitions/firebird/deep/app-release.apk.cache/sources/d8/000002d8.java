package n;

import java.util.Arrays;
import n.b;

/* loaded from: classes.dex */
public class i implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f2355a = 16;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2356b = new int[16];

    /* renamed from: c  reason: collision with root package name */
    public int[] f2357c = new int[16];

    /* renamed from: d  reason: collision with root package name */
    public int[] f2358d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    public float[] f2359e = new float[16];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2360f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    public int[] f2361g = new int[16];

    /* renamed from: h  reason: collision with root package name */
    public int f2362h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f2363i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final b f2364j;

    /* renamed from: k  reason: collision with root package name */
    public final c f2365k;

    public i(b bVar, c cVar) {
        this.f2364j = bVar;
        this.f2365k = cVar;
        clear();
    }

    @Override // n.b.a
    public float a(int i2) {
        int i3 = this.f2362h;
        int i4 = this.f2363i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f2359e[i4];
            }
            i4 = this.f2361g[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // n.b.a
    public h b(int i2) {
        int i3 = this.f2362h;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f2363i;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return ((h[]) this.f2365k.f2314d)[this.f2358d[i4]];
            }
            i4 = this.f2361g[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // n.b.a
    public float c(h hVar) {
        int n2 = n(hVar);
        if (n2 != -1) {
            return this.f2359e[n2];
        }
        return 0.0f;
    }

    @Override // n.b.a
    public void clear() {
        int i2 = this.f2362h;
        for (int i3 = 0; i3 < i2; i3++) {
            h b2 = b(i3);
            if (b2 != null) {
                b2.b(this.f2364j);
            }
        }
        for (int i4 = 0; i4 < this.f2355a; i4++) {
            this.f2358d[i4] = -1;
            this.f2357c[i4] = -1;
        }
        for (int i5 = 0; i5 < 16; i5++) {
            this.f2356b[i5] = -1;
        }
        this.f2362h = 0;
        this.f2363i = -1;
    }

    @Override // n.b.a
    public void d(h hVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int n2 = n(hVar);
            if (n2 == -1) {
                e(hVar, f2);
                return;
            }
            float[] fArr = this.f2359e;
            fArr[n2] = fArr[n2] + f2;
            if (fArr[n2] <= -0.001f || fArr[n2] >= 0.001f) {
                return;
            }
            fArr[n2] = 0.0f;
            g(hVar, z2);
        }
    }

    @Override // n.b.a
    public void e(h hVar, float f2) {
        if (f2 > -0.001f && f2 < 0.001f) {
            g(hVar, true);
            return;
        }
        int i2 = 0;
        if (this.f2362h == 0) {
            m(0, hVar, f2);
            l(hVar, 0);
            this.f2363i = 0;
            return;
        }
        int n2 = n(hVar);
        if (n2 != -1) {
            this.f2359e[n2] = f2;
            return;
        }
        int i3 = this.f2362h + 1;
        int i4 = this.f2355a;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f2358d = Arrays.copyOf(this.f2358d, i5);
            this.f2359e = Arrays.copyOf(this.f2359e, i5);
            this.f2360f = Arrays.copyOf(this.f2360f, i5);
            this.f2361g = Arrays.copyOf(this.f2361g, i5);
            this.f2357c = Arrays.copyOf(this.f2357c, i5);
            for (int i6 = this.f2355a; i6 < i5; i6++) {
                this.f2358d[i6] = -1;
                this.f2357c[i6] = -1;
            }
            this.f2355a = i5;
        }
        int i7 = this.f2362h;
        int i8 = this.f2363i;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int[] iArr = this.f2358d;
            int i11 = iArr[i8];
            int i12 = hVar.f2344b;
            if (i11 == i12) {
                this.f2359e[i8] = f2;
                return;
            }
            if (iArr[i8] < i12) {
                i9 = i8;
            }
            i8 = this.f2361g[i8];
            if (i8 == -1) {
                break;
            }
        }
        while (true) {
            if (i2 >= this.f2355a) {
                i2 = -1;
                break;
            } else if (this.f2358d[i2] == -1) {
                break;
            } else {
                i2++;
            }
        }
        m(i2, hVar, f2);
        int[] iArr2 = this.f2360f;
        if (i9 != -1) {
            iArr2[i2] = i9;
            int[] iArr3 = this.f2361g;
            iArr3[i2] = iArr3[i9];
            iArr3[i9] = i2;
        } else {
            iArr2[i2] = -1;
            if (this.f2362h > 0) {
                this.f2361g[i2] = this.f2363i;
                this.f2363i = i2;
            } else {
                this.f2361g[i2] = -1;
            }
        }
        int[] iArr4 = this.f2361g;
        if (iArr4[i2] != -1) {
            this.f2360f[iArr4[i2]] = i2;
        }
        l(hVar, i2);
    }

    @Override // n.b.a
    public void f(float f2) {
        int i2 = this.f2362h;
        int i3 = this.f2363i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2359e;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f2361g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // n.b.a
    public float g(h hVar, boolean z2) {
        int[] iArr;
        int n2 = n(hVar);
        if (n2 == -1) {
            return 0.0f;
        }
        int i2 = hVar.f2344b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f2356b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f2358d[i4] == i2) {
                int[] iArr3 = this.f2357c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f2357c;
                    if (iArr[i4] == -1 || this.f2358d[iArr[i4]] == i2) {
                        break;
                    }
                    i4 = iArr[i4];
                }
                int i5 = iArr[i4];
                if (i5 != -1 && this.f2358d[i5] == i2) {
                    iArr[i4] = iArr[i5];
                    iArr[i5] = -1;
                }
            }
        }
        float f2 = this.f2359e[n2];
        if (this.f2363i == n2) {
            this.f2363i = this.f2361g[n2];
        }
        this.f2358d[n2] = -1;
        int[] iArr4 = this.f2360f;
        if (iArr4[n2] != -1) {
            int[] iArr5 = this.f2361g;
            iArr5[iArr4[n2]] = iArr5[n2];
        }
        int[] iArr6 = this.f2361g;
        if (iArr6[n2] != -1) {
            iArr4[iArr6[n2]] = iArr4[n2];
        }
        this.f2362h--;
        hVar.f2354l--;
        if (z2) {
            hVar.b(this.f2364j);
        }
        return f2;
    }

    @Override // n.b.a
    public float h(b bVar, boolean z2) {
        float c2 = c(bVar.f2306a);
        g(bVar.f2306a, z2);
        i iVar = (i) bVar.f2309d;
        int i2 = iVar.f2362h;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int[] iArr = iVar.f2358d;
            if (iArr[i4] != -1) {
                d(((h[]) this.f2365k.f2314d)[iArr[i4]], iVar.f2359e[i4] * c2, z2);
                i3++;
            }
            i4++;
        }
        return c2;
    }

    @Override // n.b.a
    public boolean i(h hVar) {
        return n(hVar) != -1;
    }

    @Override // n.b.a
    public void j() {
        int i2 = this.f2362h;
        int i3 = this.f2363i;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f2359e;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f2361g[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // n.b.a
    public int k() {
        return this.f2362h;
    }

    public final void l(h hVar, int i2) {
        int[] iArr;
        int i3 = hVar.f2344b % 16;
        int[] iArr2 = this.f2356b;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f2357c;
                if (iArr[i4] == -1) {
                    break;
                }
                i4 = iArr[i4];
            }
            iArr[i4] = i2;
        }
        this.f2357c[i2] = -1;
    }

    public final void m(int i2, h hVar, float f2) {
        this.f2358d[i2] = hVar.f2344b;
        this.f2359e[i2] = f2;
        this.f2360f[i2] = -1;
        this.f2361g[i2] = -1;
        hVar.a(this.f2364j);
        hVar.f2354l++;
        this.f2362h++;
    }

    public int n(h hVar) {
        int[] iArr;
        if (this.f2362h == 0) {
            return -1;
        }
        int i2 = hVar.f2344b;
        int i3 = this.f2356b[i2 % 16];
        if (i3 == -1) {
            return -1;
        }
        if (this.f2358d[i3] == i2) {
            return i3;
        }
        while (true) {
            iArr = this.f2357c;
            if (iArr[i3] == -1 || this.f2358d[iArr[i3]] == i2) {
                break;
            }
            i3 = iArr[i3];
        }
        if (iArr[i3] != -1 && this.f2358d[iArr[i3]] == i2) {
            return iArr[i3];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String a2;
        String str = hashCode() + " { ";
        int i2 = this.f2362h;
        for (int i3 = 0; i3 < i2; i3++) {
            h b2 = b(i3);
            if (b2 != null) {
                String str2 = str + b2 + " = " + a(i3) + " ";
                int n2 = n(b2);
                String a3 = f.f.a(str2, "[p: ");
                if (this.f2360f[n2] != -1) {
                    sb = c.f.a(a3);
                    sb.append(((h[]) this.f2365k.f2314d)[this.f2358d[this.f2360f[n2]]]);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(a3);
                    sb2.append("none");
                    sb = sb2;
                }
                String a4 = f.f.a(sb.toString(), ", n: ");
                if (this.f2361g[n2] != -1) {
                    StringBuilder a5 = c.f.a(a4);
                    a5.append(((h[]) this.f2365k.f2314d)[this.f2358d[this.f2361g[n2]]]);
                    a2 = a5.toString();
                } else {
                    a2 = f.f.a(a4, "none");
                }
                str = f.f.a(a2, "]");
            }
        }
        return f.f.a(str, " }");
    }
}