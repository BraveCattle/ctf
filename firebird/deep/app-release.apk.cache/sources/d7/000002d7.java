package n;

import java.util.Arrays;

/* loaded from: classes.dex */
public class h {

    /* renamed from: m  reason: collision with root package name */
    public static int f2342m = 1;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2343a;

    /* renamed from: e  reason: collision with root package name */
    public float f2347e;

    /* renamed from: i  reason: collision with root package name */
    public int f2351i;

    /* renamed from: b  reason: collision with root package name */
    public int f2344b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f2345c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2346d = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2348f = false;

    /* renamed from: g  reason: collision with root package name */
    public float[] f2349g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public float[] f2350h = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public b[] f2352j = new b[16];

    /* renamed from: k  reason: collision with root package name */
    public int f2353k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f2354l = 0;

    public h(int i2) {
        this.f2351i = i2;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f2353k;
            if (i2 >= i3) {
                b[] bVarArr = this.f2352j;
                if (i3 >= bVarArr.length) {
                    this.f2352j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2352j;
                int i4 = this.f2353k;
                bVarArr2[i4] = bVar;
                this.f2353k = i4 + 1;
                return;
            } else if (this.f2352j[i2] == bVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f2353k;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f2352j[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f2352j;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f2353k--;
                return;
            }
            i3++;
        }
    }

    public void c() {
        this.f2351i = 5;
        this.f2346d = 0;
        this.f2344b = -1;
        this.f2345c = -1;
        this.f2347e = 0.0f;
        this.f2348f = false;
        int i2 = this.f2353k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2352j[i3] = null;
        }
        this.f2353k = 0;
        this.f2354l = 0;
        this.f2343a = false;
        Arrays.fill(this.f2350h, 0.0f);
    }

    public void d(d dVar, float f2) {
        this.f2347e = f2;
        this.f2348f = true;
        int i2 = this.f2353k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2352j[i3].k(this, false);
        }
        this.f2353k = 0;
    }

    public final void e(b bVar) {
        int i2 = this.f2353k;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2352j[i3].l(bVar, false);
        }
        this.f2353k = 0;
    }

    public String toString() {
        StringBuilder a2 = c.f.a("");
        a2.append(this.f2344b);
        return a2.toString();
    }
}