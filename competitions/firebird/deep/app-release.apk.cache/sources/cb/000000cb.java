package androidx.lifecycle;

import androidx.lifecycle.c;
import j.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<m0.c> f902c;

    /* renamed from: a  reason: collision with root package name */
    public j.a<m0.b, b> f900a = new j.a<>();

    /* renamed from: d  reason: collision with root package name */
    public int f903d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f904e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f905f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<c.b> f906g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public c.b f901b = c.b.INITIALIZED;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f907a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f908b;

        static {
            int[] iArr = new int[c.b.values().length];
            f908b = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f908b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f908b[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f908b[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f908b[0] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[c.a.values().length];
            f907a = iArr2;
            try {
                iArr2[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f907a[c.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f907a[c.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f907a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f907a[c.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f907a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f907a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public c.b f909a;

        /* renamed from: b  reason: collision with root package name */
        public d f910b;

        public b(m0.b bVar, c.b bVar2) {
            d reflectiveGenericLifecycleObserver;
            Map<Class, Integer> map = m0.e.f2292a;
            boolean z2 = bVar instanceof d;
            boolean z3 = bVar instanceof m0.a;
            if (z2 && z3) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((m0.a) bVar, (d) bVar);
            } else if (z3) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((m0.a) bVar, null);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = (d) bVar;
            } else {
                Class<?> cls = bVar.getClass();
                if (m0.e.c(cls) == 2) {
                    List list = (List) ((HashMap) m0.e.f2293b).get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(m0.e.a((Constructor) list.get(0), bVar));
                    } else {
                        androidx.lifecycle.b[] bVarArr = new androidx.lifecycle.b[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            bVarArr[i2] = m0.e.a((Constructor) list.get(i2), bVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(bVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(bVar);
                }
            }
            this.f910b = reflectiveGenericLifecycleObserver;
            this.f909a = bVar2;
        }

        public void a(m0.c cVar, c.a aVar) {
            c.b c2 = e.c(aVar);
            this.f909a = e.e(this.f909a, c2);
            this.f910b.c(cVar, aVar);
            this.f909a = c2;
        }
    }

    public e(m0.c cVar) {
        this.f902c = new WeakReference<>(cVar);
    }

    public static c.b c(c.a aVar) {
        switch (a.f907a[aVar.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    public static c.b e(c.b bVar, c.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static c.a i(c.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return c.a.ON_CREATE;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    throw new IllegalArgumentException("Unexpected state value " + bVar);
                }
                throw new IllegalArgumentException();
            }
            return c.a.ON_RESUME;
        }
        return c.a.ON_START;
    }

    @Override // androidx.lifecycle.c
    public void a(m0.b bVar) {
        m0.c cVar;
        c.b bVar2 = this.f901b;
        c.b bVar3 = c.b.DESTROYED;
        if (bVar2 != bVar3) {
            bVar3 = c.b.INITIALIZED;
        }
        b bVar4 = new b(bVar, bVar3);
        if (this.f900a.e(bVar, bVar4) == null && (cVar = this.f902c.get()) != null) {
            boolean z2 = this.f903d != 0 || this.f904e;
            c.b b2 = b(bVar);
            this.f903d++;
            while (bVar4.f909a.compareTo(b2) < 0 && this.f900a.f2111e.containsKey(bVar)) {
                this.f906g.add(bVar4.f909a);
                bVar4.a(cVar, i(bVar4.f909a));
                g();
                b2 = b(bVar);
            }
            if (!z2) {
                h();
            }
            this.f903d--;
        }
    }

    public final c.b b(m0.b bVar) {
        j.a<m0.b, b> aVar = this.f900a;
        c.b bVar2 = null;
        b.c<m0.b, b> cVar = aVar.f2111e.containsKey(bVar) ? aVar.f2111e.get(bVar).f2119d : null;
        c.b bVar3 = cVar != null ? cVar.f2117b.f909a : null;
        if (!this.f906g.isEmpty()) {
            ArrayList<c.b> arrayList = this.f906g;
            bVar2 = arrayList.get(arrayList.size() - 1);
        }
        return e(e(this.f901b, bVar3), bVar2);
    }

    public void d(c.a aVar) {
        f(c(aVar));
    }

    public final void f(c.b bVar) {
        if (this.f901b == bVar) {
            return;
        }
        this.f901b = bVar;
        if (this.f904e || this.f903d != 0) {
            this.f905f = true;
            return;
        }
        this.f904e = true;
        h();
        this.f904e = false;
    }

    public final void g() {
        ArrayList<c.b> arrayList = this.f906g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.e.h():void");
    }
}