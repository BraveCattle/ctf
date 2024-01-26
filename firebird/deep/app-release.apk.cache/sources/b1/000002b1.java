package l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f2252a;

    /* renamed from: b  reason: collision with root package name */
    public int f2253b;

    /* renamed from: c  reason: collision with root package name */
    public int f2254c;

    /* renamed from: d  reason: collision with root package name */
    public int f2255d;

    /* renamed from: e  reason: collision with root package name */
    public int f2256e;

    /* renamed from: f  reason: collision with root package name */
    public int f2257f;

    /* renamed from: g  reason: collision with root package name */
    public int f2258g;

    public f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2254c = i2;
        this.f2252a = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V a(K k2) {
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v2 = this.f2252a.get(k2);
            if (v2 != null) {
                this.f2257f++;
                return v2;
            }
            this.f2258g++;
            return null;
        }
    }

    public final V b(K k2, V v2) {
        V put;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2255d++;
            this.f2253b++;
            put = this.f2252a.put(k2, v2);
            if (put != null) {
                this.f2253b--;
            }
        }
        c(this.f2254c);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f2253b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f2252a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f2253b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f2253b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f2252a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f2252a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f2252a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f2253b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f2253b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f2256e     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f2256e = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.f.c(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f2257f;
        i3 = this.f2258g + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f2254c), Integer.valueOf(this.f2257f), Integer.valueOf(this.f2258g), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0));
    }
}