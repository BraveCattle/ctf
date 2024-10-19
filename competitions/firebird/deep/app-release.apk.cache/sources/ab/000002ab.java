package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import l.g;

/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public g<K, V> f2231h;

    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0030a extends g<K, V> {
        public C0030a() {
        }

        @Override // l.g
        public void a() {
            a.this.clear();
        }

        @Override // l.g
        public Object b(int i2, int i3) {
            return a.this.f2279b[(i2 << 1) + i3];
        }

        @Override // l.g
        public Map<K, V> c() {
            return a.this;
        }

        @Override // l.g
        public int d() {
            return a.this.f2280c;
        }

        @Override // l.g
        public int e(Object obj) {
            return a.this.e(obj);
        }

        @Override // l.g
        public int f(Object obj) {
            return a.this.g(obj);
        }

        @Override // l.g
        public void g(K k2, V v2) {
            a.this.put(k2, v2);
        }

        @Override // l.g
        public void h(int i2) {
            a.this.i(i2);
        }

        @Override // l.g
        public V i(int i2, V v2) {
            int i3 = (i2 << 1) + 1;
            Object[] objArr = a.this.f2279b;
            V v3 = (V) objArr[i3];
            objArr[i3] = v2;
            return v3;
        }
    }

    public a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(h hVar) {
        if (hVar != null) {
            int i2 = hVar.f2280c;
            b(this.f2280c + i2);
            if (this.f2280c != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(hVar.h(i3), hVar.k(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(hVar.f2278a, 0, this.f2278a, 0, i2);
                System.arraycopy(hVar.f2279b, 0, this.f2279b, 0, i2 << 1);
                this.f2280c = i2;
            }
        }
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V> l2 = l();
        if (l2.f2259a == null) {
            l2.f2259a = new g.b();
        }
        return l2.f2259a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        g<K, V> l2 = l();
        if (l2.f2260b == null) {
            l2.f2260b = new g.c();
        }
        return l2.f2260b;
    }

    public final g<K, V> l() {
        if (this.f2231h == null) {
            this.f2231h = new C0030a();
        }
        return this.f2231h;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f2280c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        g<K, V> l2 = l();
        if (l2.f2261c == null) {
            l2.f2261c = new g.e();
        }
        return l2.f2261c;
    }
}