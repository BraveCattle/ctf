package o;

import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public final e f2394b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2395c;

    /* renamed from: d  reason: collision with root package name */
    public d f2396d;

    /* renamed from: g  reason: collision with root package name */
    public n.h f2399g;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f2393a = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2397e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2398f = -1;

    /* loaded from: classes.dex */
    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f2394b = eVar;
        this.f2395c = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6.f2394b.f2435w == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r4 != r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0053, code lost:
        if (r4 != r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006a, code lost:
        if (r4 != r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(o.d r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != 0) goto L7
            r6.e()
            return r0
        L7:
            r1 = 0
            if (r10 != 0) goto L74
            o.d$a r10 = o.d.a.CENTER_Y
            o.d$a r2 = o.d.a.CENTER_X
            o.d$a r3 = o.d.a.BASELINE
            o.d$a r4 = r7.f2395c
            o.d$a r5 = r6.f2395c
            if (r4 != r5) goto L25
            if (r5 != r3) goto L6c
            o.e r10 = r7.f2394b
            boolean r10 = r10.f2435w
            if (r10 == 0) goto L70
            o.e r10 = r6.f2394b
            boolean r10 = r10.f2435w
            if (r10 != 0) goto L6c
            goto L70
        L25:
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L70;
                case 1: goto L56;
                case 2: goto L3f;
                case 3: goto L56;
                case 4: goto L3f;
                case 5: goto L70;
                case 6: goto L38;
                case 7: goto L70;
                case 8: goto L70;
                default: goto L2c;
            }
        L2c:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            o.d$a r8 = r6.f2395c
            java.lang.String r8 = r8.name()
            r7.<init>(r8)
            throw r7
        L38:
            if (r4 == r3) goto L70
            if (r4 == r2) goto L70
            if (r4 == r10) goto L70
            goto L6c
        L3f:
            o.d$a r2 = o.d.a.TOP
            if (r4 == r2) goto L4a
            o.d$a r2 = o.d.a.BOTTOM
            if (r4 != r2) goto L48
            goto L4a
        L48:
            r2 = r1
            goto L4b
        L4a:
            r2 = r0
        L4b:
            o.e r3 = r7.f2394b
            boolean r3 = r3 instanceof o.g
            if (r3 == 0) goto L71
            if (r2 != 0) goto L6c
            if (r4 != r10) goto L70
            goto L6c
        L56:
            o.d$a r10 = o.d.a.LEFT
            if (r4 == r10) goto L61
            o.d$a r10 = o.d.a.RIGHT
            if (r4 != r10) goto L5f
            goto L61
        L5f:
            r10 = r1
            goto L62
        L61:
            r10 = r0
        L62:
            o.e r3 = r7.f2394b
            boolean r3 = r3 instanceof o.g
            if (r3 == 0) goto L6e
            if (r10 != 0) goto L6c
            if (r4 != r2) goto L70
        L6c:
            r2 = r0
            goto L71
        L6e:
            r2 = r10
            goto L71
        L70:
            r2 = r1
        L71:
            if (r2 != 0) goto L74
            return r1
        L74:
            r6.f2396d = r7
            java.util.HashSet<o.d> r10 = r7.f2393a
            if (r10 != 0) goto L81
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r7.f2393a = r10
        L81:
            o.d r7 = r6.f2396d
            java.util.HashSet<o.d> r7 = r7.f2393a
            r7.add(r6)
            if (r8 <= 0) goto L8d
            r6.f2397e = r8
            goto L8f
        L8d:
            r6.f2397e = r1
        L8f:
            r6.f2398f = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.d.a(o.d, int, int, boolean):boolean");
    }

    public int b() {
        d dVar;
        if (this.f2394b.X == 8) {
            return 0;
        }
        int i2 = this.f2398f;
        return (i2 <= -1 || (dVar = this.f2396d) == null || dVar.f2394b.X != 8) ? this.f2397e : i2;
    }

    public boolean c() {
        d dVar;
        HashSet<d> hashSet = this.f2393a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            d next = it.next();
            switch (next.f2395c.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    dVar = null;
                    break;
                case 1:
                    dVar = next.f2394b.A;
                    break;
                case 2:
                    dVar = next.f2394b.B;
                    break;
                case 3:
                    dVar = next.f2394b.f2437y;
                    break;
                case 4:
                    dVar = next.f2394b.f2438z;
                    break;
                default:
                    throw new AssertionError(next.f2395c.name());
            }
            if (dVar.d()) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        return this.f2396d != null;
    }

    public void e() {
        HashSet<d> hashSet;
        d dVar = this.f2396d;
        if (dVar != null && (hashSet = dVar.f2393a) != null) {
            hashSet.remove(this);
        }
        this.f2396d = null;
        this.f2397e = 0;
        this.f2398f = -1;
    }

    public void f() {
        n.h hVar = this.f2399g;
        if (hVar == null) {
            this.f2399g = new n.h(1);
        } else {
            hVar.c();
        }
    }

    public String toString() {
        return this.f2394b.Y + ":" + this.f2395c.toString();
    }
}