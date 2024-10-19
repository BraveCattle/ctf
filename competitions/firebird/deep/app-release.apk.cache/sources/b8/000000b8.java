package androidx.fragment.app;

import android.view.View;
import e0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import k0.k;
import k0.o;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f856a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final o f857b = new k();

    /* renamed from: c  reason: collision with root package name */
    public static final o f858c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f859a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f860b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.fragment.app.a f861c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f862d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f863e;

        /* renamed from: f  reason: collision with root package name */
        public androidx.fragment.app.a f864f;
    }

    static {
        o oVar;
        try {
            oVar = (o) r0.d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            oVar = null;
        }
        f858c = oVar;
    }

    public static void a(ArrayList<View> arrayList, l.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f2280c - 1; i2 >= 0; i2--) {
            View k2 = aVar.k(i2);
            WeakHashMap<View, e0.o> weakHashMap = m.f1633a;
            if (collection.contains(k2.getTransitionName())) {
                arrayList.add(k2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
        if (r10.f735k != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
        if (r10.f749y != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007c, code lost:
        if (r10.f749y == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x007e, code lost:
        r1 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(androidx.fragment.app.a r16, androidx.fragment.app.f.a r17, android.util.SparseArray<androidx.fragment.app.i.a> r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.b(androidx.fragment.app.a, androidx.fragment.app.f$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z2, l.a<String, View> aVar, boolean z3) {
        if (z2) {
            fragment2.k();
        } else {
            fragment.k();
        }
    }

    public static boolean d(o oVar, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!oVar.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static l.a<String, View> e(o oVar, l.a<String, String> aVar, Object obj, a aVar2) {
        Objects.requireNonNull(aVar2.f859a);
        aVar.isEmpty();
        aVar.clear();
        return null;
    }

    public static l.a<String, View> f(o oVar, l.a<String, String> aVar, Object obj, a aVar2) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = aVar2.f862d;
            l.a<String, View> aVar3 = new l.a<>();
            oVar.h(aVar3, fragment.B());
            androidx.fragment.app.a aVar4 = aVar2.f864f;
            if (aVar2.f863e) {
                fragment.k();
                arrayList = aVar4.f827o;
            } else {
                arrayList = aVar4.f826n;
            }
            l.g.k(aVar3, arrayList);
            l.g.k(aVar, aVar3.keySet());
            return aVar3;
        }
        aVar.clear();
        return null;
    }

    public static o g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            fragment.l();
            Object q2 = fragment.q();
            if (q2 != null) {
                arrayList.add(q2);
            }
            Object s2 = fragment.s();
            if (s2 != null) {
                arrayList.add(s2);
            }
        }
        if (fragment2 != null) {
            fragment2.j();
            Object p2 = fragment2.p();
            if (p2 != null) {
                arrayList.add(p2);
            }
            fragment2.r();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        o oVar = f857b;
        if (d(oVar, arrayList)) {
            return oVar;
        }
        o oVar2 = f858c;
        if (oVar2 == null || !d(oVar2, arrayList)) {
            throw new IllegalArgumentException("Invalid Transition types");
        }
        return oVar2;
    }

    public static ArrayList<View> h(o oVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            Objects.requireNonNull(fragment);
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                return arrayList2;
            }
            arrayList2.add(view);
            oVar.b(obj, arrayList2);
            return arrayList2;
        }
        return null;
    }

    public static Object i(o oVar, Fragment fragment, boolean z2) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z2) {
            obj = fragment.p();
        } else {
            fragment.j();
        }
        return oVar.f(obj);
    }

    public static Object j(o oVar, Fragment fragment, boolean z2) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z2) {
            obj = fragment.q();
        } else {
            fragment.l();
        }
        return oVar.f(obj);
    }

    public static View k(l.a<String, View> aVar, a aVar2, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar3 = aVar2.f861c;
        if (obj == null || aVar == null || (arrayList = aVar3.f826n) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z2 ? aVar3.f826n : aVar3.f827o).get(0));
    }

    public static Object l(o oVar, Fragment fragment, Fragment fragment2, boolean z2) {
        Object obj;
        if (z2) {
            obj = fragment2.s();
        } else {
            fragment.r();
            obj = null;
        }
        return oVar.t(oVar.f(obj));
    }

    public static void m(o oVar, Object obj, Object obj2, l.a<String, View> aVar, boolean z2, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f826n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z2 ? aVar2.f827o : aVar2.f826n).get(0));
        oVar.q(obj, view);
        if (obj2 != null) {
            oVar.q(obj2, view);
        }
    }

    public static void n(ArrayList<View> arrayList, int i2) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(androidx.fragment.app.e r38, java.util.ArrayList<androidx.fragment.app.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.o(androidx.fragment.app.e, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }
}