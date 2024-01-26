package l;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class h<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f2274d;

    /* renamed from: e  reason: collision with root package name */
    public static int f2275e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f2276f;

    /* renamed from: g  reason: collision with root package name */
    public static int f2277g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f2278a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f2279b;

    /* renamed from: c  reason: collision with root package name */
    public int f2280c;

    public h() {
        this.f2278a = d.f2244a;
        this.f2279b = d.f2246c;
        this.f2280c = 0;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f2278a = d.f2244a;
            this.f2279b = d.f2246c;
        } else {
            a(i2);
        }
        this.f2280c = 0;
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (h.class) {
                Object[] objArr = f2276f;
                if (objArr != null) {
                    this.f2279b = objArr;
                    f2276f = (Object[]) objArr[0];
                    this.f2278a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2277g--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (h.class) {
                Object[] objArr2 = f2274d;
                if (objArr2 != null) {
                    this.f2279b = objArr2;
                    f2274d = (Object[]) objArr2[0];
                    this.f2278a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2275e--;
                    return;
                }
            }
        }
        this.f2278a = new int[i2];
        this.f2279b = new Object[i2 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (f2277g < 10) {
                    objArr[0] = f2276f;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2276f = objArr;
                    f2277g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f2275e < 10) {
                    objArr[0] = f2274d;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2274d = objArr;
                    f2275e++;
                }
            }
        }
    }

    public void b(int i2) {
        int i3 = this.f2280c;
        int[] iArr = this.f2278a;
        if (iArr.length < i2) {
            Object[] objArr = this.f2279b;
            a(i2);
            if (this.f2280c > 0) {
                System.arraycopy(iArr, 0, this.f2278a, 0, i3);
                System.arraycopy(objArr, 0, this.f2279b, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f2280c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f2280c;
        if (i2 > 0) {
            int[] iArr = this.f2278a;
            Object[] objArr = this.f2279b;
            this.f2278a = d.f2244a;
            this.f2279b = d.f2246c;
            this.f2280c = 0;
            c(iArr, objArr, i2);
        }
        if (this.f2280c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i2) {
        int i3 = this.f2280c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f2278a, i3, i2);
            if (a2 >= 0 && !obj.equals(this.f2279b[a2 << 1])) {
                int i4 = a2 + 1;
                while (i4 < i3 && this.f2278a[i4] == i2) {
                    if (obj.equals(this.f2279b[i4 << 1])) {
                        return i4;
                    }
                    i4++;
                }
                for (int i5 = a2 - 1; i5 >= 0 && this.f2278a[i5] == i2; i5--) {
                    if (obj.equals(this.f2279b[i5 << 1])) {
                        return i5;
                    }
                }
                return ~i4;
            }
            return a2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f2280c != hVar.f2280c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2280c; i2++) {
                try {
                    K h2 = h(i2);
                    V k2 = k(i2);
                    Object obj2 = hVar.get(h2);
                    if (k2 == null) {
                        if (obj2 != null || !hVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2280c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2280c; i3++) {
                try {
                    K h3 = h(i3);
                    V k3 = k(i3);
                    Object obj3 = map.get(h3);
                    if (k3 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!k3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i2 = this.f2280c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f2278a, i2, 0);
            if (a2 >= 0 && this.f2279b[a2 << 1] != null) {
                int i3 = a2 + 1;
                while (i3 < i2 && this.f2278a[i3] == 0) {
                    if (this.f2279b[i3 << 1] == null) {
                        return i3;
                    }
                    i3++;
                }
                for (int i4 = a2 - 1; i4 >= 0 && this.f2278a[i4] == 0; i4--) {
                    if (this.f2279b[i4 << 1] == null) {
                        return i4;
                    }
                }
                return ~i3;
            }
            return a2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i2 = this.f2280c * 2;
        Object[] objArr = this.f2279b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v2) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f2279b[(e2 << 1) + 1] : v2;
    }

    public K h(int i2) {
        return (K) this.f2279b[i2 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f2278a;
        Object[] objArr = this.f2279b;
        int i2 = this.f2280c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public V i(int i2) {
        Object[] objArr = this.f2279b;
        int i3 = i2 << 1;
        V v2 = (V) objArr[i3 + 1];
        int i4 = this.f2280c;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f2278a, objArr, i4);
            this.f2278a = d.f2244a;
            this.f2279b = d.f2246c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2278a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f2279b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f2279b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f2280c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2278a, 0, i2);
                    System.arraycopy(objArr, 0, this.f2279b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f2278a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f2279b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 == this.f2280c) {
            this.f2280c = i5;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f2280c <= 0;
    }

    public V j(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2279b;
        V v3 = (V) objArr[i3];
        objArr[i3] = v2;
        return v3;
    }

    public V k(int i2) {
        return (V) this.f2279b[(i2 << 1) + 1];
    }

    public V put(K k2, V v2) {
        int i2;
        int d2;
        int i3 = this.f2280c;
        if (k2 == null) {
            d2 = f();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            d2 = d(k2, hashCode);
        }
        if (d2 >= 0) {
            int i4 = (d2 << 1) + 1;
            Object[] objArr = this.f2279b;
            V v3 = (V) objArr[i4];
            objArr[i4] = v2;
            return v3;
        }
        int i5 = ~d2;
        int[] iArr = this.f2278a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f2279b;
            a(i6);
            if (i3 != this.f2280c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2278a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2279b, 0, objArr2.length);
            }
            c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2278a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2279b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2280c - i5) << 1);
        }
        int i8 = this.f2280c;
        if (i3 == i8) {
            int[] iArr4 = this.f2278a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2279b;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v2;
                this.f2280c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v2) {
        V orDefault = getOrDefault(k2, null);
        return orDefault == null ? put(k2, v2) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 >= 0) {
            V k2 = k(e2);
            if (obj2 == k2 || (obj2 != null && obj2.equals(k2))) {
                i(e2);
                return true;
            }
            return false;
        }
        return false;
    }

    public V replace(K k2, V v2) {
        int e2 = e(k2);
        if (e2 >= 0) {
            return j(e2, v2);
        }
        return null;
    }

    public boolean replace(K k2, V v2, V v3) {
        int e2 = e(k2);
        if (e2 >= 0) {
            V k3 = k(e2);
            if (k3 == v2 || (v2 != null && v2.equals(k3))) {
                j(e2, v3);
                return true;
            }
            return false;
        }
        return false;
    }

    public int size() {
        return this.f2280c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2280c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2280c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}