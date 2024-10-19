package l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f2259a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f2260b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f2261c;

    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f2262a;

        /* renamed from: b  reason: collision with root package name */
        public int f2263b;

        /* renamed from: c  reason: collision with root package name */
        public int f2264c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2265d = false;

        public a(int i2) {
            this.f2262a = i2;
            this.f2263b = g.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2264c < this.f2263b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t2 = (T) g.this.b(this.f2264c, this.f2262a);
                this.f2264c++;
                this.f2265d = true;
                return t2;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2265d) {
                throw new IllegalStateException();
            }
            int i2 = this.f2264c - 1;
            this.f2264c = i2;
            this.f2263b--;
            this.f2265d = false;
            g.this.h(i2);
        }
    }

    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d2 = g.this.d();
            for (Map.Entry<K, V> entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d2 != g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int e2 = g.this.e(entry.getKey());
                if (e2 < 0) {
                    return false;
                }
                return l.d.c(g.this.b(e2, 1), entry.getValue());
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = g.this.b(d2, 0);
                Object b3 = g.this.b(d2, 1);
                i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> c2 = g.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c2.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = g.this.b(d2, 0);
                i2 += b2 == null ? 0 : b2.hashCode();
            }
            return i2;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e2 = g.this.e(obj);
            if (e2 >= 0) {
                g.this.h(e2);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> c2 = g.this.c();
            int size = c2.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c2.remove(it.next());
            }
            return size != c2.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return g.this.l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 0);
        }
    }

    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f2269a;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2271c = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2270b = -1;

        public d() {
            this.f2269a = g.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this.f2271c) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    return l.d.c(entry.getKey(), g.this.b(this.f2270b, 0)) && l.d.c(entry.getValue(), g.this.b(this.f2270b, 1));
                }
                return false;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2271c) {
                return (K) g.this.b(this.f2270b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2271c) {
                return (V) g.this.b(this.f2270b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2270b < this.f2269a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (this.f2271c) {
                Object b2 = g.this.b(this.f2270b, 0);
                Object b3 = g.this.b(this.f2270b, 1);
                return (b2 == null ? 0 : b2.hashCode()) ^ (b3 != null ? b3.hashCode() : 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.f2270b++;
                this.f2271c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2271c) {
                throw new IllegalStateException();
            }
            g.this.h(this.f2270b);
            this.f2270b--;
            this.f2269a--;
            this.f2271c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            if (this.f2271c) {
                return (V) g.this.i(this.f2270b, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            g.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f2 = g.this.f(obj);
            if (f2 >= 0) {
                g.this.h(f2);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (!collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        @Override // java.util.Collection
        public int size() {
            return g.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return g.this.l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k2, V v2);

    public abstract void h(int i2);

    public abstract V i(int i2, V v2);

    public Object[] l(int i2) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] m(T[] tArr, int i2) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2));
        }
        for (int i3 = 0; i3 < d2; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}