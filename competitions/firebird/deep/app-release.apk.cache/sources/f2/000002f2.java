package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public o.f f2478a;

    /* renamed from: d  reason: collision with root package name */
    public o.f f2481d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0032b f2483f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f2484g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<k> f2485h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2479b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2480c = true;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<m> f2482e = new ArrayList<>();

    public e(o.f fVar) {
        new ArrayList();
        this.f2483f = null;
        this.f2484g = new b.a();
        this.f2485h = new ArrayList<>();
        this.f2478a = fVar;
        this.f2481d = fVar;
    }

    public final void a(f fVar, int i2, int i3, f fVar2, ArrayList<k> arrayList, k kVar) {
        m mVar = fVar.f2489d;
        if (mVar.f2516c == null) {
            o.f fVar3 = this.f2478a;
            if (mVar == fVar3.f2415d || mVar == fVar3.f2417e) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i3);
                arrayList.add(kVar);
            }
            mVar.f2516c = kVar;
            kVar.f2511b.add(mVar);
            for (d dVar : mVar.f2521h.f2496k) {
                if (dVar instanceof f) {
                    a((f) dVar, i2, 0, fVar2, arrayList, kVar);
                }
            }
            for (d dVar2 : mVar.f2522i.f2496k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i2, 1, fVar2, arrayList, kVar);
                }
            }
            if (i2 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f2512k.f2496k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i2, 2, fVar2, arrayList, kVar);
                    }
                }
            }
            for (f fVar4 : mVar.f2521h.f2497l) {
                a(fVar4, i2, 0, fVar2, arrayList, kVar);
            }
            for (f fVar5 : mVar.f2522i.f2497l) {
                a(fVar5, i2, 1, fVar2, arrayList, kVar);
            }
            if (i2 == 1 && (mVar instanceof l)) {
                for (f fVar6 : ((l) mVar).f2512k.f2497l) {
                    a(fVar6, i2, 2, fVar2, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
        if (r2.f2423k == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(o.f r17) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.b(o.f):boolean");
    }

    public void c() {
        m hVar;
        ArrayList<m> arrayList = this.f2482e;
        arrayList.clear();
        this.f2481d.f2415d.f();
        this.f2481d.f2417e.f();
        arrayList.add(this.f2481d.f2415d);
        arrayList.add(this.f2481d.f2417e);
        Iterator<o.e> it = this.f2481d.f2461e0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            o.e next = it.next();
            if (next instanceof o.g) {
                hVar = new h(next);
            } else {
                if (next.s()) {
                    if (next.f2411b == null) {
                        next.f2411b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2411b);
                } else {
                    arrayList.add(next.f2415d);
                }
                if (next.t()) {
                    if (next.f2413c == null) {
                        next.f2413c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2413c);
                } else {
                    arrayList.add(next.f2417e);
                }
                if (next instanceof o.i) {
                    hVar = new i(next);
                }
            }
            arrayList.add(hVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<m> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<m> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m next2 = it3.next();
            if (next2.f2515b != this.f2481d) {
                next2.d();
            }
        }
        this.f2485h.clear();
        k.f2509c = 0;
        e(this.f2478a.f2415d, 0, this.f2485h);
        e(this.f2478a.f2417e, 1, this.f2485h);
        this.f2479b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(o.f r17, int r18) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.d(o.f, int):int");
    }

    public final void e(m mVar, int i2, ArrayList<k> arrayList) {
        for (d dVar : mVar.f2521h.f2496k) {
            if (dVar instanceof f) {
                a((f) dVar, i2, 0, mVar.f2522i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f2521h, i2, 0, mVar.f2522i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f2522i.f2496k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i2, 1, mVar.f2521h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f2522i, i2, 1, mVar.f2521h, arrayList, null);
            }
        }
        if (i2 == 1) {
            for (d dVar3 : ((l) mVar).f2512k.f2496k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i2, 2, null, arrayList, null);
                }
            }
        }
    }

    public final void f(o.e eVar, int i2, int i3, int i4, int i5) {
        b.a aVar = this.f2484g;
        aVar.f2466a = i2;
        aVar.f2467b = i4;
        aVar.f2468c = i3;
        aVar.f2469d = i5;
        ((ConstraintLayout.b) this.f2483f).a(eVar, aVar);
        eVar.B(this.f2484g.f2470e);
        eVar.w(this.f2484g.f2471f);
        b.a aVar2 = this.f2484g;
        eVar.f2435w = aVar2.f2473h;
        int i6 = aVar2.f2472g;
        eVar.R = i6;
        eVar.f2435w = i6 > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        r2.f2507m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        r2.c(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r12 = this;
            o.f r0 = r12.f2478a
            java.util.ArrayList<o.e> r0 = r0.f2461e0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La0
            java.lang.Object r1 = r0.next()
            o.e r1 = (o.e) r1
            boolean r2 = r1.f2409a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.J
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f2422j
            int r4 = r1.f2423k
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            p.j r4 = r1.f2415d
            p.g r4 = r4.f2518e
            boolean r5 = r4.f2495j
            p.l r6 = r1.f2417e
            p.g r6 = r6.f2518e
            boolean r7 = r6.f2495j
            if (r5 == 0) goto L54
            if (r7 == 0) goto L54
            int r5 = r4.f2492g
            int r7 = r6.f2492g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L8d
        L54:
            if (r5 == 0) goto L6e
            if (r3 == 0) goto L6e
            int r5 = r4.f2492g
            int r7 = r6.f2492g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            p.l r2 = r1.f2417e
            p.g r2 = r2.f2518e
            int r3 = r1.i()
            if (r10 != r11) goto L8a
            goto L87
        L6e:
            if (r7 == 0) goto L8f
            if (r2 == 0) goto L8f
            int r5 = r4.f2492g
            int r7 = r6.f2492g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            p.j r2 = r1.f2415d
            p.g r2 = r2.f2518e
            int r3 = r1.o()
            if (r8 != r11) goto L8a
        L87:
            r2.f2507m = r3
            goto L8f
        L8a:
            r2.c(r3)
        L8d:
            r1.f2409a = r9
        L8f:
            boolean r2 = r1.f2409a
            if (r2 == 0) goto L8
            p.l r2 = r1.f2417e
            p.g r2 = r2.f2513l
            if (r2 == 0) goto L8
            int r1 = r1.R
            r2.c(r1)
            goto L8
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.g():void");
    }
}