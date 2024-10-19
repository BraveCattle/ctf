package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<o.e> f2463a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f2464b = new a();

    /* renamed from: c  reason: collision with root package name */
    public o.f f2465c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2466a;

        /* renamed from: b  reason: collision with root package name */
        public int f2467b;

        /* renamed from: c  reason: collision with root package name */
        public int f2468c;

        /* renamed from: d  reason: collision with root package name */
        public int f2469d;

        /* renamed from: e  reason: collision with root package name */
        public int f2470e;

        /* renamed from: f  reason: collision with root package name */
        public int f2471f;

        /* renamed from: g  reason: collision with root package name */
        public int f2472g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2473h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2474i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2475j;
    }

    /* renamed from: p.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0032b {
    }

    public b(o.f fVar) {
        this.f2465c = fVar;
    }

    public final boolean a(InterfaceC0032b interfaceC0032b, o.e eVar, boolean z2) {
        this.f2464b.f2466a = eVar.j();
        this.f2464b.f2467b = eVar.n();
        this.f2464b.f2468c = eVar.o();
        this.f2464b.f2469d = eVar.i();
        a aVar = this.f2464b;
        aVar.f2474i = false;
        aVar.f2475j = z2;
        boolean z3 = aVar.f2466a == 3;
        boolean z4 = aVar.f2467b == 3;
        boolean z5 = z3 && eVar.N > 0.0f;
        boolean z6 = z4 && eVar.N > 0.0f;
        if (z5 && eVar.f2424l[0] == 4) {
            aVar.f2466a = 1;
        }
        if (z6 && eVar.f2424l[1] == 4) {
            aVar.f2467b = 1;
        }
        ((ConstraintLayout.b) interfaceC0032b).a(eVar, aVar);
        eVar.B(this.f2464b.f2470e);
        eVar.w(this.f2464b.f2471f);
        a aVar2 = this.f2464b;
        eVar.f2435w = aVar2.f2473h;
        int i2 = aVar2.f2472g;
        eVar.R = i2;
        eVar.f2435w = i2 > 0;
        aVar2.f2475j = false;
        return aVar2.f2474i;
    }

    public final void b(o.f fVar, int i2, int i3) {
        int i4 = fVar.S;
        int i5 = fVar.T;
        fVar.z(0);
        fVar.y(0);
        fVar.L = i2;
        int i6 = fVar.S;
        if (i2 < i6) {
            fVar.L = i6;
        }
        fVar.M = i3;
        int i7 = fVar.T;
        if (i3 < i7) {
            fVar.M = i7;
        }
        fVar.z(i4);
        fVar.y(i5);
        this.f2465c.E();
    }
}