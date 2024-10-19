package r0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.x64m.xsfmnative.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import r0.g;
import r0.k;

/* loaded from: classes.dex */
public class d extends k0.o {

    /* loaded from: classes.dex */
    public class a extends g.c {
        public a(d dVar, Rect rect) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f2572a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2573b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.f2572a = view;
            this.f2573b = arrayList;
        }

        @Override // r0.g.d
        public void a(g gVar) {
        }

        @Override // r0.g.d
        public void b(g gVar) {
            gVar.v(this);
            this.f2572a.setVisibility(8);
            int size = this.f2573b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f2573b.get(i2)).setVisibility(0);
            }
        }

        @Override // r0.g.d
        public void c(g gVar) {
        }

        @Override // r0.g.d
        public void d(g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f2574a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2575b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2576c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2577d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f2578e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f2579f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2574a = obj;
            this.f2575b = arrayList;
            this.f2576c = obj2;
            this.f2577d = arrayList2;
            this.f2578e = obj3;
            this.f2579f = arrayList3;
        }

        @Override // r0.g.d
        public void a(g gVar) {
            Object obj = this.f2574a;
            if (obj != null) {
                d.this.m(obj, this.f2575b, null);
            }
            Object obj2 = this.f2576c;
            if (obj2 != null) {
                d.this.m(obj2, this.f2577d, null);
            }
            Object obj3 = this.f2578e;
            if (obj3 != null) {
                d.this.m(obj3, this.f2579f, null);
            }
        }

        @Override // r0.g.d
        public void b(g gVar) {
        }

        @Override // r0.g.d
        public void c(g gVar) {
        }

        @Override // r0.g.d
        public void d(g gVar) {
        }
    }

    /* renamed from: r0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0035d extends g.c {
        public C0035d(d dVar, Rect rect) {
        }
    }

    public static boolean u(g gVar) {
        return (k0.o.j(gVar.f2588e) && k0.o.j(null) && k0.o.j(null)) ? false : true;
    }

    @Override // k0.o
    public void a(Object obj, View view) {
        if (obj != null) {
            ((g) obj).b(view);
        }
    }

    @Override // k0.o
    public void b(Object obj, ArrayList<View> arrayList) {
        g gVar = (g) obj;
        if (gVar == null) {
            return;
        }
        int i2 = 0;
        if (gVar instanceof m) {
            m mVar = (m) gVar;
            int size = mVar.f2619x.size();
            while (i2 < size) {
                b(mVar.I(i2), arrayList);
                i2++;
            }
        } else if (u(gVar) || !k0.o.j(gVar.f2589f)) {
        } else {
            int size2 = arrayList.size();
            while (i2 < size2) {
                gVar.b(arrayList.get(i2));
                i2++;
            }
        }
    }

    @Override // k0.o
    public void c(ViewGroup viewGroup, Object obj) {
        g gVar = (g) obj;
        if (k.f2614c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        if (viewGroup.isLaidOut()) {
            k.f2614c.add(viewGroup);
            g clone = gVar.clone();
            ArrayList<g> orDefault = k.a().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<g> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            if (((f) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                viewGroup.setTag(R.id.transition_current_scene, null);
                if (clone != null) {
                    k.a aVar = new k.a(clone, viewGroup);
                    viewGroup.addOnAttachStateChangeListener(aVar);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // k0.o
    public boolean e(Object obj) {
        return obj instanceof g;
    }

    @Override // k0.o
    public Object f(Object obj) {
        if (obj != null) {
            return ((g) obj).clone();
        }
        return null;
    }

    @Override // k0.o
    public Object k(Object obj, Object obj2, Object obj3) {
        m mVar = new m();
        if (obj != null) {
            mVar.H((g) obj);
        }
        if (obj2 != null) {
            mVar.H((g) obj2);
        }
        if (obj3 != null) {
            mVar.H((g) obj3);
        }
        return mVar;
    }

    @Override // k0.o
    public void l(Object obj, View view) {
        if (obj != null) {
            ((g) obj).w(view);
        }
    }

    @Override // k0.o
    public void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        g gVar = (g) obj;
        int i2 = 0;
        if (gVar instanceof m) {
            m mVar = (m) gVar;
            int size = mVar.f2619x.size();
            while (i2 < size) {
                m(mVar.I(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (u(gVar)) {
        } else {
            ArrayList<View> arrayList3 = gVar.f2589f;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size2) {
                gVar.b(arrayList2.get(i2));
                i2++;
            }
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                gVar.w(arrayList.get(size3));
            }
        }
    }

    @Override // k0.o
    public void n(Object obj, View view, ArrayList<View> arrayList) {
        ((g) obj).a(new b(this, view, arrayList));
    }

    @Override // k0.o
    public void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((g) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // k0.o
    public void p(Object obj, Rect rect) {
        if (obj != null) {
            ((g) obj).A(new C0035d(this, rect));
        }
    }

    @Override // k0.o
    public void q(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            i(view, rect);
            ((g) obj).A(new a(this, rect));
        }
    }

    @Override // k0.o
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        ArrayList<View> arrayList2 = mVar.f2589f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            k0.o.d(arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(mVar, arrayList);
    }

    @Override // k0.o
    public void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.f2589f.clear();
            mVar.f2589f.addAll(arrayList2);
            m(mVar, arrayList, arrayList2);
        }
    }

    @Override // k0.o
    public Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        m mVar = new m();
        mVar.H((g) obj);
        return mVar;
    }
}