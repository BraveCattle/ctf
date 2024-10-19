package j;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f2112a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f2113b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f2114c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f2115d = 0;

    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2119d;
        }

        @Override // j.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2118c;
        }
    }

    /* renamed from: j.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0028b<K, V> extends e<K, V> {
        public C0028b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // j.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f2118c;
        }

        @Override // j.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f2119d;
        }
    }

    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f2116a;

        /* renamed from: b  reason: collision with root package name */
        public final V f2117b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f2118c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f2119d;

        public c(K k2, V v2) {
            this.f2116a = k2;
            this.f2117b = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f2116a.equals(cVar.f2116a) && this.f2117b.equals(cVar.f2117b);
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2116a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2117b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2116a.hashCode() ^ this.f2117b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2116a + "=" + this.f2117b;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f2120a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2121b = true;

        public d() {
        }

        @Override // j.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2120a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2119d;
                this.f2120a = cVar3;
                this.f2121b = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2121b) {
                return b.this.f2112a != null;
            }
            c<K, V> cVar = this.f2120a;
            return (cVar == null || cVar.f2118c == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar;
            if (this.f2121b) {
                this.f2121b = false;
                cVar = b.this.f2112a;
            } else {
                c<K, V> cVar2 = this.f2120a;
                cVar = cVar2 != null ? cVar2.f2118c : null;
            }
            this.f2120a = cVar;
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f2123a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f2124b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2123a = cVar2;
            this.f2124b = cVar;
        }

        @Override // j.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f2123a == cVar && cVar == this.f2124b) {
                this.f2124b = null;
                this.f2123a = null;
            }
            c<K, V> cVar3 = this.f2123a;
            if (cVar3 == cVar) {
                this.f2123a = b(cVar3);
            }
            c<K, V> cVar4 = this.f2124b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f2123a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f2124b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2124b != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f2124b;
            c<K, V> cVar2 = this.f2123a;
            this.f2124b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.f2112a;
        while (cVar != null && !cVar.f2116a.equals(k2)) {
            cVar = cVar.f2118c;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f2114c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k2, V v2) {
        c<K, V> cVar = new c<>(k2, v2);
        this.f2115d++;
        c<K, V> cVar2 = this.f2113b;
        if (cVar2 == null) {
            this.f2112a = cVar;
        } else {
            cVar2.f2118c = cVar;
            cVar.f2119d = cVar2;
        }
        this.f2113b = cVar;
        return cVar;
    }

    public V d(K k2) {
        c<K, V> a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f2115d--;
        if (!this.f2114c.isEmpty()) {
            for (f<K, V> fVar : this.f2114c.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f2119d;
        c<K, V> cVar2 = a2.f2118c;
        if (cVar != null) {
            cVar.f2118c = cVar2;
        } else {
            this.f2112a = cVar2;
        }
        c<K, V> cVar3 = a2.f2118c;
        if (cVar3 != null) {
            cVar3.f2119d = cVar;
        } else {
            this.f2113b = cVar;
        }
        a2.f2118c = null;
        a2.f2119d = null;
        return a2.f2117b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((j.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof j.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j.b r7 = (j.b) r7
            int r1 = r6.f2115d
            int r3 = r7.f2115d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            j.b$e r3 = (j.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            j.b$e r4 = (j.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            j.b$e r7 = (j.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2112a, this.f2113b);
        this.f2114c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder a2 = c.f.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                a2.append("]");
                return a2.toString();
            }
            a2.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                a2.append(", ");
            }
        }
    }
}