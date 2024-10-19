package l;

/* loaded from: classes.dex */
public class i<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2281e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f2282a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2283b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2284c;

    /* renamed from: d  reason: collision with root package name */
    public int f2285d;

    public i() {
        this(10);
    }

    public i(int i2) {
        this.f2282a = false;
        if (i2 == 0) {
            this.f2283b = d.f2244a;
            this.f2284c = d.f2246c;
            return;
        }
        int e2 = d.e(i2);
        this.f2283b = new int[e2];
        this.f2284c = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f2285d;
        if (i3 != 0 && i2 <= this.f2283b[i3 - 1]) {
            g(i2, e2);
            return;
        }
        if (this.f2282a && i3 >= this.f2283b.length) {
            c();
        }
        int i4 = this.f2285d;
        if (i4 >= this.f2283b.length) {
            int e3 = d.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f2283b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f2284c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f2283b = iArr;
            this.f2284c = objArr;
        }
        this.f2283b[i4] = i2;
        this.f2284c[i4] = e2;
        this.f2285d = i4 + 1;
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f2283b = (int[]) this.f2283b.clone();
            iVar.f2284c = (Object[]) this.f2284c.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i2 = this.f2285d;
        int[] iArr = this.f2283b;
        Object[] objArr = this.f2284c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f2281e) {
                if (i4 != i3) {
                    iArr[i3] = iArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f2282a = false;
        this.f2285d = i3;
    }

    public E d(int i2) {
        return e(i2, null);
    }

    public E e(int i2, E e2) {
        int a2 = d.a(this.f2283b, this.f2285d, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f2284c;
            if (objArr[a2] != f2281e) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int f(int i2) {
        if (this.f2282a) {
            c();
        }
        return this.f2283b[i2];
    }

    public void g(int i2, E e2) {
        int a2 = d.a(this.f2283b, this.f2285d, i2);
        if (a2 >= 0) {
            this.f2284c[a2] = e2;
            return;
        }
        int i3 = ~a2;
        int i4 = this.f2285d;
        if (i3 < i4) {
            Object[] objArr = this.f2284c;
            if (objArr[i3] == f2281e) {
                this.f2283b[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (this.f2282a && i4 >= this.f2283b.length) {
            c();
            i3 = ~d.a(this.f2283b, this.f2285d, i2);
        }
        int i5 = this.f2285d;
        if (i5 >= this.f2283b.length) {
            int e3 = d.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f2283b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f2284c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f2283b = iArr;
            this.f2284c = objArr2;
        }
        int i6 = this.f2285d;
        if (i6 - i3 != 0) {
            int[] iArr3 = this.f2283b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr4 = this.f2284c;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f2285d - i3);
        }
        this.f2283b[i3] = i2;
        this.f2284c[i3] = e2;
        this.f2285d++;
    }

    public void h(int i2) {
        int a2 = d.a(this.f2283b, this.f2285d, i2);
        if (a2 >= 0) {
            Object[] objArr = this.f2284c;
            Object obj = objArr[a2];
            Object obj2 = f2281e;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.f2282a = true;
            }
        }
    }

    public int i() {
        if (this.f2282a) {
            c();
        }
        return this.f2285d;
    }

    public E j(int i2) {
        if (this.f2282a) {
            c();
        }
        return (E) this.f2284c[i2];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2285d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2285d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(f(i2));
            sb.append('=');
            E j2 = j(i2);
            if (j2 != this) {
                sb.append(j2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}