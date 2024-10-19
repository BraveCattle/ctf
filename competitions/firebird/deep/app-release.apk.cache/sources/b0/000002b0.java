package l;

/* loaded from: classes.dex */
public class e<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2247e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2248a = false;

    /* renamed from: b  reason: collision with root package name */
    public long[] f2249b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2250c;

    /* renamed from: d  reason: collision with root package name */
    public int f2251d;

    public e() {
        int f2 = d.f(10);
        this.f2249b = new long[f2];
        this.f2250c = new Object[f2];
    }

    public void a() {
        int i2 = this.f2251d;
        Object[] objArr = this.f2250c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f2251d = 0;
        this.f2248a = false;
    }

    /* renamed from: b */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f2249b = (long[]) this.f2249b.clone();
            eVar.f2250c = (Object[]) this.f2250c.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f2251d;
        long[] jArr = this.f2249b;
        Object[] objArr = this.f2250c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2247e) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2248a = false;
        this.f2251d = i3;
    }

    public E d(long j2) {
        return e(j2, null);
    }

    public E e(long j2, E e2) {
        int b2 = d.b(this.f2249b, this.f2251d, j2);
        if (b2 >= 0) {
            Object[] objArr = this.f2250c;
            if (objArr[b2] != f2247e) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public void f(long j2, E e2) {
        int b2 = d.b(this.f2249b, this.f2251d, j2);
        if (b2 >= 0) {
            this.f2250c[b2] = e2;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f2251d;
        if (i2 < i3) {
            Object[] objArr = this.f2250c;
            if (objArr[i2] == f2247e) {
                this.f2249b[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f2248a && i3 >= this.f2249b.length) {
            c();
            i2 = ~d.b(this.f2249b, this.f2251d, j2);
        }
        int i4 = this.f2251d;
        if (i4 >= this.f2249b.length) {
            int f2 = d.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f2249b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f2250c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2249b = jArr;
            this.f2250c = objArr2;
        }
        int i5 = this.f2251d;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f2249b;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f2250c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f2251d - i2);
        }
        this.f2249b[i2] = j2;
        this.f2250c[i2] = e2;
        this.f2251d++;
    }

    public int g() {
        if (this.f2248a) {
            c();
        }
        return this.f2251d;
    }

    public E h(int i2) {
        if (this.f2248a) {
            c();
        }
        return (E) this.f2250c[i2];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2251d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2251d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f2248a) {
                c();
            }
            sb.append(this.f2249b[i2]);
            sb.append('=');
            E h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}