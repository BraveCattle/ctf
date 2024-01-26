package androidx.lifecycle;

import androidx.lifecycle.c;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f869i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f870a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public j.b<m0.g<? super T>, LiveData<T>.a> f871b = new j.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f872c = 0;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f873d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f874e;

    /* renamed from: f  reason: collision with root package name */
    public int f875f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f876g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f877h;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.a implements d {

        /* renamed from: e  reason: collision with root package name */
        public final m0.c f878e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LiveData f879f;

        @Override // androidx.lifecycle.d
        public void c(m0.c cVar, c.a aVar) {
            if (((e) this.f878e.a()).f901b == c.b.DESTROYED) {
                this.f879f.f(this.f880a);
            } else {
                h(j());
            }
        }

        @Override // androidx.lifecycle.LiveData.a
        public void i() {
            ((e) this.f878e.a()).f900a.d(this);
        }

        @Override // androidx.lifecycle.LiveData.a
        public boolean j() {
            return ((e) this.f878e.a()).f901b.compareTo(c.b.STARTED) >= 0;
        }
    }

    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final m0.g<? super T> f880a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f881b;

        /* renamed from: c  reason: collision with root package name */
        public int f882c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f883d;

        public void h(boolean z2) {
            if (z2 == this.f881b) {
                return;
            }
            this.f881b = z2;
            LiveData liveData = this.f883d;
            int i2 = liveData.f872c;
            boolean z3 = i2 == 0;
            liveData.f872c = i2 + (z2 ? 1 : -1);
            if (z3 && z2) {
                liveData.d();
            }
            LiveData liveData2 = this.f883d;
            if (liveData2.f872c == 0 && !this.f881b) {
                liveData2.e();
            }
            if (this.f881b) {
                this.f883d.c(this);
            }
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = f869i;
        this.f873d = obj;
        this.f874e = obj;
        this.f875f = -1;
    }

    public static void a(String str) {
        if (i.a.c().f2105a.b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(LiveData<T>.a aVar) {
        if (aVar.f881b) {
            if (!aVar.j()) {
                aVar.h(false);
                return;
            }
            int i2 = aVar.f882c;
            int i3 = this.f875f;
            if (i2 >= i3) {
                return;
            }
            aVar.f882c = i3;
            aVar.f880a.a((Object) this.f873d);
        }
    }

    public void c(LiveData<T>.a aVar) {
        if (this.f876g) {
            this.f877h = true;
            return;
        }
        this.f876g = true;
        do {
            this.f877h = false;
            if (aVar == null) {
                j.b<m0.g<? super T>, LiveData<T>.a>.d b2 = this.f871b.b();
                while (b2.hasNext()) {
                    b((a) ((Map.Entry) b2.next()).getValue());
                    if (this.f877h) {
                        break;
                    }
                }
            } else {
                b(aVar);
                aVar = null;
            }
        } while (this.f877h);
        this.f876g = false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(m0.g<? super T> gVar) {
        a("removeObserver");
        LiveData<T>.a d2 = this.f871b.d(gVar);
        if (d2 == null) {
            return;
        }
        d2.i();
        d2.h(false);
    }
}