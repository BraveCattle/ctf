package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import l.g;

/* loaded from: classes.dex */
public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2234e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f2235f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f2236g;

    /* renamed from: h  reason: collision with root package name */
    public static int f2237h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f2238i;

    /* renamed from: j  reason: collision with root package name */
    public static int f2239j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f2240a = f2234e;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f2241b = f2235f;

    /* renamed from: c  reason: collision with root package name */
    public int f2242c = 0;

    /* renamed from: d  reason: collision with root package name */
    public g<E, E> f2243d;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f2239j < 10) {
                    objArr[0] = f2238i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2238i = objArr;
                    f2239j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f2237h < 10) {
                    objArr[0] = f2236g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2236g = objArr;
                    f2237h++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = f2238i;
                if (objArr != null) {
                    this.f2241b = objArr;
                    f2238i = (Object[]) objArr[0];
                    this.f2240a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2239j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f2236g;
                if (objArr2 != null) {
                    this.f2241b = objArr2;
                    f2236g = (Object[]) objArr2[0];
                    this.f2240a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2237h--;
                    return;
                }
            }
        }
        this.f2240a = new int[i2];
        this.f2241b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int d2;
        if (e2 == null) {
            d2 = e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            d2 = d(e2, hashCode);
        }
        if (d2 >= 0) {
            return false;
        }
        int i3 = ~d2;
        int i4 = this.f2242c;
        int[] iArr = this.f2240a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f2241b;
            a(i5);
            int[] iArr2 = this.f2240a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2241b, 0, objArr.length);
            }
            b(iArr, objArr, this.f2242c);
        }
        int i6 = this.f2242c;
        if (i3 < i6) {
            int[] iArr3 = this.f2240a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2241b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2242c - i3);
        }
        this.f2240a[i3] = i2;
        this.f2241b[i3] = e2;
        this.f2242c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f2242c;
        int[] iArr = this.f2240a;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2241b;
            a(size);
            int i2 = this.f2242c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2240a, 0, i2);
                System.arraycopy(objArr, 0, this.f2241b, 0, this.f2242c);
            }
            b(iArr, objArr, this.f2242c);
        }
        for (E e2 : collection) {
            z2 |= add(e2);
        }
        return z2;
    }

    public int c(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f2242c;
        if (i2 != 0) {
            b(this.f2240a, this.f2241b, i2);
            this.f2240a = f2234e;
            this.f2241b = f2235f;
            this.f2242c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i2) {
        int i3 = this.f2242c;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f2240a, i3, i2);
        if (a2 >= 0 && !obj.equals(this.f2241b[a2])) {
            int i4 = a2 + 1;
            while (i4 < i3 && this.f2240a[i4] == i2) {
                if (obj.equals(this.f2241b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = a2 - 1; i5 >= 0 && this.f2240a[i5] == i2; i5--) {
                if (obj.equals(this.f2241b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        }
        return a2;
    }

    public final int e() {
        int i2 = this.f2242c;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f2240a, i2, 0);
        if (a2 >= 0 && this.f2241b[a2] != null) {
            int i3 = a2 + 1;
            while (i3 < i2 && this.f2240a[i3] == 0) {
                if (this.f2241b[i3] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f2240a[i4] == 0; i4--) {
                if (this.f2241b[i4] == null) {
                    return i4;
                }
            }
            return ~i3;
        }
        return a2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f2242c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2242c; i2++) {
                try {
                    if (!set.contains(this.f2241b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        Object[] objArr = this.f2241b;
        E e2 = (E) objArr[i2];
        int i3 = this.f2242c;
        if (i3 <= 1) {
            b(this.f2240a, objArr, i3);
            this.f2240a = f2234e;
            this.f2241b = f2235f;
            this.f2242c = 0;
        } else {
            int[] iArr = this.f2240a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f2242c = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f2241b;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f2242c - i2);
                }
                this.f2241b[this.f2242c] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f2242c--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2240a, 0, i2);
                    System.arraycopy(objArr, 0, this.f2241b, 0, i2);
                }
                int i6 = this.f2242c;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f2240a, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f2241b, i2, this.f2242c - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f2240a;
        int i2 = this.f2242c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2242c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f2243d == null) {
            this.f2243d = new b(this);
        }
        g<E, E> gVar = this.f2243d;
        if (gVar.f2260b == null) {
            gVar.f2260b = new g.c();
        }
        return gVar.f2260b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int c2 = c(obj);
        if (c2 >= 0) {
            f(c2);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= remove(it.next());
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.f2242c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2241b[i2])) {
                f(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2242c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f2242c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2241b, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2242c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2242c));
        }
        System.arraycopy(this.f2241b, 0, tArr, 0, this.f2242c);
        int length = tArr.length;
        int i2 = this.f2242c;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2242c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2242c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2241b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}