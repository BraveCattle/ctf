package n;

import java.util.Arrays;
import n.b;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f2297b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2298c;

    /* renamed from: a  reason: collision with root package name */
    public int f2296a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2299d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2300e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2301f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2302g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2303h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2304i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2305j = false;

    public a(b bVar, c cVar) {
        this.f2297b = bVar;
        this.f2298c = cVar;
    }

    @Override // n.b.a
    public float a(int i2) {
        int i3 = this.f2303h;
        for (int i4 = 0; i3 != -1 && i4 < this.f2296a; i4++) {
            if (i4 == i2) {
                return this.f2302g[i3];
            }
            i3 = this.f2301f[i3];
        }
        return 0.0f;
    }

    @Override // n.b.a
    public h b(int i2) {
        int i3 = this.f2303h;
        for (int i4 = 0; i3 != -1 && i4 < this.f2296a; i4++) {
            if (i4 == i2) {
                return ((h[]) this.f2298c.f2314d)[this.f2300e[i3]];
            }
            i3 = this.f2301f[i3];
        }
        return null;
    }

    @Override // n.b.a
    public final float c(h hVar) {
        int i2 = this.f2303h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            if (this.f2300e[i2] == hVar.f2344b) {
                return this.f2302g[i2];
            }
            i2 = this.f2301f[i2];
        }
        return 0.0f;
    }

    @Override // n.b.a
    public final void clear() {
        int i2 = this.f2303h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            h hVar = ((h[]) this.f2298c.f2314d)[this.f2300e[i2]];
            if (hVar != null) {
                hVar.b(this.f2297b);
            }
            i2 = this.f2301f[i2];
        }
        this.f2303h = -1;
        this.f2304i = -1;
        this.f2305j = false;
        this.f2296a = 0;
    }

    @Override // n.b.a
    public void d(h hVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f2303h;
            if (i2 == -1) {
                this.f2303h = 0;
                this.f2302g[0] = f2;
                this.f2300e[0] = hVar.f2344b;
                this.f2301f[0] = -1;
                hVar.f2354l++;
                hVar.a(this.f2297b);
                this.f2296a++;
                if (this.f2305j) {
                    return;
                }
                int i3 = this.f2304i + 1;
                this.f2304i = i3;
                int[] iArr = this.f2300e;
                if (i3 >= iArr.length) {
                    this.f2305j = true;
                    this.f2304i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f2296a; i5++) {
                int[] iArr2 = this.f2300e;
                int i6 = iArr2[i2];
                int i7 = hVar.f2344b;
                if (i6 == i7) {
                    float[] fArr = this.f2302g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f2303h) {
                            this.f2303h = this.f2301f[i2];
                        } else {
                            int[] iArr3 = this.f2301f;
                            iArr3[i4] = iArr3[i2];
                        }
                        if (z2) {
                            hVar.b(this.f2297b);
                        }
                        if (this.f2305j) {
                            this.f2304i = i2;
                        }
                        hVar.f2354l--;
                        this.f2296a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i4 = i2;
                }
                i2 = this.f2301f[i2];
            }
            int i8 = this.f2304i;
            int i9 = i8 + 1;
            if (this.f2305j) {
                int[] iArr4 = this.f2300e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f2300e;
            if (i8 >= iArr5.length && this.f2296a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f2300e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f2300e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f2299d * 2;
                this.f2299d = i11;
                this.f2305j = false;
                this.f2304i = i8 - 1;
                this.f2302g = Arrays.copyOf(this.f2302g, i11);
                this.f2300e = Arrays.copyOf(this.f2300e, this.f2299d);
                this.f2301f = Arrays.copyOf(this.f2301f, this.f2299d);
            }
            this.f2300e[i8] = hVar.f2344b;
            this.f2302g[i8] = f2;
            int[] iArr8 = this.f2301f;
            if (i4 != -1) {
                iArr8[i8] = iArr8[i4];
                iArr8[i4] = i8;
            } else {
                iArr8[i8] = this.f2303h;
                this.f2303h = i8;
            }
            hVar.f2354l++;
            hVar.a(this.f2297b);
            this.f2296a++;
            if (!this.f2305j) {
                this.f2304i++;
            }
            int i12 = this.f2304i;
            int[] iArr9 = this.f2300e;
            if (i12 >= iArr9.length) {
                this.f2305j = true;
                this.f2304i = iArr9.length - 1;
            }
        }
    }

    @Override // n.b.a
    public final void e(h hVar, float f2) {
        if (f2 == 0.0f) {
            g(hVar, true);
            return;
        }
        int i2 = this.f2303h;
        if (i2 == -1) {
            this.f2303h = 0;
            this.f2302g[0] = f2;
            this.f2300e[0] = hVar.f2344b;
            this.f2301f[0] = -1;
            hVar.f2354l++;
            hVar.a(this.f2297b);
            this.f2296a++;
            if (this.f2305j) {
                return;
            }
            int i3 = this.f2304i + 1;
            this.f2304i = i3;
            int[] iArr = this.f2300e;
            if (i3 >= iArr.length) {
                this.f2305j = true;
                this.f2304i = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f2296a; i5++) {
            int[] iArr2 = this.f2300e;
            int i6 = iArr2[i2];
            int i7 = hVar.f2344b;
            if (i6 == i7) {
                this.f2302g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i4 = i2;
            }
            i2 = this.f2301f[i2];
        }
        int i8 = this.f2304i;
        int i9 = i8 + 1;
        if (this.f2305j) {
            int[] iArr3 = this.f2300e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f2300e;
        if (i8 >= iArr4.length && this.f2296a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f2300e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f2300e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f2299d * 2;
            this.f2299d = i11;
            this.f2305j = false;
            this.f2304i = i8 - 1;
            this.f2302g = Arrays.copyOf(this.f2302g, i11);
            this.f2300e = Arrays.copyOf(this.f2300e, this.f2299d);
            this.f2301f = Arrays.copyOf(this.f2301f, this.f2299d);
        }
        this.f2300e[i8] = hVar.f2344b;
        this.f2302g[i8] = f2;
        int[] iArr7 = this.f2301f;
        if (i4 != -1) {
            iArr7[i8] = iArr7[i4];
            iArr7[i4] = i8;
        } else {
            iArr7[i8] = this.f2303h;
            this.f2303h = i8;
        }
        hVar.f2354l++;
        hVar.a(this.f2297b);
        int i12 = this.f2296a + 1;
        this.f2296a = i12;
        if (!this.f2305j) {
            this.f2304i++;
        }
        int[] iArr8 = this.f2300e;
        if (i12 >= iArr8.length) {
            this.f2305j = true;
        }
        if (this.f2304i >= iArr8.length) {
            this.f2305j = true;
            this.f2304i = iArr8.length - 1;
        }
    }

    @Override // n.b.a
    public void f(float f2) {
        int i2 = this.f2303h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            float[] fArr = this.f2302g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2301f[i2];
        }
    }

    @Override // n.b.a
    public final float g(h hVar, boolean z2) {
        int i2 = this.f2303h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f2296a) {
            if (this.f2300e[i2] == hVar.f2344b) {
                if (i2 == this.f2303h) {
                    this.f2303h = this.f2301f[i2];
                } else {
                    int[] iArr = this.f2301f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    hVar.b(this.f2297b);
                }
                hVar.f2354l--;
                this.f2296a--;
                this.f2300e[i2] = -1;
                if (this.f2305j) {
                    this.f2304i = i2;
                }
                return this.f2302g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f2301f[i2];
        }
        return 0.0f;
    }

    @Override // n.b.a
    public float h(b bVar, boolean z2) {
        float c2 = c(bVar.f2306a);
        g(bVar.f2306a, z2);
        b.a aVar = bVar.f2309d;
        int k2 = aVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            h b2 = aVar.b(i2);
            d(b2, aVar.c(b2) * c2, z2);
        }
        return c2;
    }

    @Override // n.b.a
    public boolean i(h hVar) {
        int i2 = this.f2303h;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            if (this.f2300e[i2] == hVar.f2344b) {
                return true;
            }
            i2 = this.f2301f[i2];
        }
        return false;
    }

    @Override // n.b.a
    public void j() {
        int i2 = this.f2303h;
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            float[] fArr = this.f2302g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2301f[i2];
        }
    }

    @Override // n.b.a
    public int k() {
        return this.f2296a;
    }

    public String toString() {
        int i2 = this.f2303h;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f2296a; i3++) {
            StringBuilder a2 = c.f.a(f.f.a(str, " -> "));
            a2.append(this.f2302g[i2]);
            a2.append(" : ");
            StringBuilder a3 = c.f.a(a2.toString());
            a3.append(((h[]) this.f2298c.f2314d)[this.f2300e[i2]]);
            str = a3.toString();
            i2 = this.f2301f[i2];
        }
        return str;
    }
}