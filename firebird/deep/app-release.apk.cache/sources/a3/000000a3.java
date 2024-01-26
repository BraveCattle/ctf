package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.c;
import java.util.Objects;
import java.util.UUID;
import k0.p;
import m0.k;
import m0.l;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, m0.c, l, q0.b {
    public static final Object R = new Object();
    public boolean A;
    public boolean C;
    public ViewGroup D;
    public View E;
    public boolean F;
    public a H;
    public boolean I;
    public boolean J;
    public float K;
    public boolean L;
    public androidx.lifecycle.e N;
    public p O;
    public q0.a Q;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f727c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<Parcelable> f728d;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f730f;

    /* renamed from: g  reason: collision with root package name */
    public Fragment f731g;

    /* renamed from: i  reason: collision with root package name */
    public int f733i;

    /* renamed from: k  reason: collision with root package name */
    public boolean f735k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f736l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f737m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f738n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f739o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f740p;

    /* renamed from: q  reason: collision with root package name */
    public int f741q;

    /* renamed from: r  reason: collision with root package name */
    public e f742r;

    /* renamed from: s  reason: collision with root package name */
    public k0.e f743s;

    /* renamed from: u  reason: collision with root package name */
    public Fragment f745u;

    /* renamed from: v  reason: collision with root package name */
    public int f746v;

    /* renamed from: w  reason: collision with root package name */
    public int f747w;

    /* renamed from: x  reason: collision with root package name */
    public String f748x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f749y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f750z;

    /* renamed from: b  reason: collision with root package name */
    public int f726b = 0;

    /* renamed from: e  reason: collision with root package name */
    public String f729e = UUID.randomUUID().toString();

    /* renamed from: h  reason: collision with root package name */
    public String f732h = null;

    /* renamed from: j  reason: collision with root package name */
    public Boolean f734j = null;

    /* renamed from: t  reason: collision with root package name */
    public e f744t = new e();
    public boolean B = true;
    public boolean G = true;
    public c.b M = c.b.RESUMED;
    public m0.f<m0.c> P = new m0.f<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public View f752a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f753b;

        /* renamed from: c  reason: collision with root package name */
        public int f754c;

        /* renamed from: d  reason: collision with root package name */
        public int f755d;

        /* renamed from: e  reason: collision with root package name */
        public int f756e;

        /* renamed from: f  reason: collision with root package name */
        public int f757f;

        /* renamed from: g  reason: collision with root package name */
        public Object f758g;

        /* renamed from: h  reason: collision with root package name */
        public Object f759h;

        /* renamed from: i  reason: collision with root package name */
        public Object f760i;

        /* renamed from: j  reason: collision with root package name */
        public c f761j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f762k;

        public a() {
            Object obj = Fragment.R;
            this.f758g = obj;
            this.f759h = obj;
            this.f760i = obj;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RuntimeException {
        public b(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public Fragment() {
        u();
    }

    public boolean A(Menu menu) {
        if (this.f749y) {
            return false;
        }
        return false | this.f744t.G(menu);
    }

    public final View B() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void C(View view) {
        e().f752a = view;
    }

    public void D(Animator animator) {
        e().f753b = animator;
    }

    public void E(Bundle bundle) {
        e eVar = this.f742r;
        if (eVar != null) {
            if (eVar == null ? false : eVar.S()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f730f = bundle;
    }

    public void F(boolean z2) {
        e().f762k = z2;
    }

    public void G(int i2) {
        if (this.H == null && i2 == 0) {
            return;
        }
        e().f755d = i2;
    }

    public void H(c cVar) {
        e();
        c cVar2 = this.H.f761j;
        if (cVar == cVar2) {
            return;
        }
        if (cVar != null && cVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        } else if (cVar != null) {
            ((e.f) cVar).f812c++;
        }
    }

    @Override // m0.c
    public androidx.lifecycle.c a() {
        return this.N;
    }

    @Override // q0.b
    public final androidx.savedstate.a c() {
        return this.Q.f2554b;
    }

    @Override // m0.l
    public k d() {
        e eVar = this.f742r;
        if (eVar != null) {
            k0.g gVar = eVar.E;
            k kVar = gVar.f2184d.get(this.f729e);
            if (kVar == null) {
                k kVar2 = new k();
                gVar.f2184d.put(this.f729e, kVar2);
                return kVar2;
            }
            return kVar;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final a e() {
        if (this.H == null) {
            this.H = new a();
        }
        return this.H;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment f(String str) {
        return str.equals(this.f729e) ? this : this.f744t.O(str);
    }

    public View g() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.f752a;
    }

    public Animator h() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        return aVar.f753b;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final d i() {
        if (this.f743s != null) {
            return this.f744t;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Object j() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public void k() {
        a aVar = this.H;
        if (aVar == null) {
            return;
        }
        Objects.requireNonNull(aVar);
    }

    public Object l() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public int m() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f755d;
    }

    public int n() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f756e;
    }

    public int o() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f757f;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.C = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k0.e eVar = this.f743s;
        k0.b bVar = eVar == null ? null : (k0.b) eVar.f2171b;
        if (bVar != null) {
            bVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.C = true;
    }

    public Object p() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f759h;
        if (obj == R) {
            l();
            return null;
        }
        return obj;
    }

    public Object q() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f758g;
        if (obj == R) {
            j();
            return null;
        }
        return obj;
    }

    public Object r() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Objects.requireNonNull(aVar);
        return null;
    }

    public Object s() {
        a aVar = this.H;
        if (aVar == null) {
            return null;
        }
        Object obj = aVar.f760i;
        if (obj == R) {
            r();
            return null;
        }
        return obj;
    }

    public int t() {
        a aVar = this.H;
        if (aVar == null) {
            return 0;
        }
        return aVar.f754c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        b.a.a(this, sb);
        sb.append(" (");
        sb.append(this.f729e);
        sb.append(")");
        if (this.f746v != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f746v));
        }
        if (this.f748x != null) {
            sb.append(" ");
            sb.append(this.f748x);
        }
        sb.append('}');
        return sb.toString();
    }

    public final void u() {
        this.N = new androidx.lifecycle.e(this);
        this.Q = new q0.a(this);
        this.N.a(new androidx.lifecycle.d() { // from class: androidx.fragment.app.Fragment.2
            @Override // androidx.lifecycle.d
            public void c(m0.c cVar, c.a aVar) {
                if (aVar == c.a.ON_STOP) {
                    Objects.requireNonNull(Fragment.this);
                }
            }
        });
    }

    public final boolean v() {
        return this.f741q > 0;
    }

    public void w(AttributeSet attributeSet, Bundle bundle) {
        this.C = true;
        k0.e eVar = this.f743s;
        if ((eVar == null ? null : eVar.f2171b) != null) {
            this.C = false;
            this.C = true;
        }
    }

    public void x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f744t.X();
        this.f740p = true;
        p pVar = new p();
        this.O = pVar;
        if (pVar.f2230b != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.O = null;
    }

    public LayoutInflater y(Bundle bundle) {
        k0.e eVar = this.f743s;
        if (eVar != null) {
            LayoutInflater j2 = eVar.j();
            e eVar2 = this.f744t;
            Objects.requireNonNull(eVar2);
            j2.setFactory2(eVar2);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void z() {
        this.C = true;
        this.f744t.n();
    }
}