package androidx.lifecycle;

import androidx.lifecycle.c;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements d {

    /* renamed from: a  reason: collision with root package name */
    public final m0.a f866a;

    /* renamed from: b  reason: collision with root package name */
    public final d f867b;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f868a;

        static {
            int[] iArr = new int[c.a.values().length];
            f868a = iArr;
            try {
                iArr[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f868a[c.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f868a[c.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f868a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f868a[c.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f868a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f868a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(m0.a aVar, d dVar) {
        this.f866a = aVar;
        this.f867b = dVar;
    }

    @Override // androidx.lifecycle.d
    public void c(m0.c cVar, c.a aVar) {
        switch (a.f868a[aVar.ordinal()]) {
            case 1:
                this.f866a.f(cVar);
                break;
            case 2:
                this.f866a.a(cVar);
                break;
            case 3:
                this.f866a.b(cVar);
                break;
            case 4:
                this.f866a.g(cVar);
                break;
            case 5:
                this.f866a.e(cVar);
                break;
            case 6:
                this.f866a.d(cVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        d dVar = this.f867b;
        if (dVar != null) {
            dVar.c(cVar, aVar);
        }
    }
}