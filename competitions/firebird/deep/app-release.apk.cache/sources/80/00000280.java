package j;

import j.b;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f2111e = new HashMap<>();

    @Override // j.b
    public b.c<K, V> a(K k2) {
        return this.f2111e.get(k2);
    }

    public boolean contains(K k2) {
        return this.f2111e.containsKey(k2);
    }

    @Override // j.b
    public V d(K k2) {
        V v2 = (V) super.d(k2);
        this.f2111e.remove(k2);
        return v2;
    }

    public V e(K k2, V v2) {
        b.c<K, V> cVar = this.f2111e.get(k2);
        if (cVar != null) {
            return cVar.f2117b;
        }
        this.f2111e.put(k2, c(k2, v2));
        return null;
    }
}