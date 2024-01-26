package r0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class g implements Cloneable {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f2581u = {2, 1, 3, 4};

    /* renamed from: v  reason: collision with root package name */
    public static final i.c f2582v = new a();

    /* renamed from: w  reason: collision with root package name */
    public static ThreadLocal<l.a<Animator, b>> f2583w = new ThreadLocal<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<o> f2594k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<o> f2595l;

    /* renamed from: s  reason: collision with root package name */
    public c f2602s;

    /* renamed from: a  reason: collision with root package name */
    public String f2584a = getClass().getName();

    /* renamed from: b  reason: collision with root package name */
    public long f2585b = -1;

    /* renamed from: c  reason: collision with root package name */
    public long f2586c = -1;

    /* renamed from: d  reason: collision with root package name */
    public TimeInterpolator f2587d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Integer> f2588e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f2589f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public n.c f2590g = new n.c(2);

    /* renamed from: h  reason: collision with root package name */
    public n.c f2591h = new n.c(2);

    /* renamed from: i  reason: collision with root package name */
    public m f2592i = null;

    /* renamed from: j  reason: collision with root package name */
    public int[] f2593j = f2581u;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<Animator> f2596m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public int f2597n = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2598o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2599p = false;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<d> f2600q = null;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<Animator> f2601r = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public i.c f2603t = f2582v;

    /* loaded from: classes.dex */
    public static class a extends i.c {
        public a() {
            super(1);
        }

        @Override // i.c
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f2604a;

        /* renamed from: b  reason: collision with root package name */
        public String f2605b;

        /* renamed from: c  reason: collision with root package name */
        public o f2606c;

        /* renamed from: d  reason: collision with root package name */
        public y f2607d;

        /* renamed from: e  reason: collision with root package name */
        public g f2608e;

        public b(View view, String str, g gVar, y yVar, o oVar) {
            this.f2604a = view;
            this.f2605b = str;
            this.f2606c = oVar;
            this.f2607d = yVar;
            this.f2608e = gVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);

        void d(g gVar);
    }

    public static void c(n.c cVar, View view, o oVar) {
        ((l.a) cVar.f2311a).put(view, oVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) cVar.f2312b).indexOfKey(id) >= 0) {
                ((SparseArray) cVar.f2312b).put(id, null);
            } else {
                ((SparseArray) cVar.f2312b).put(id, view);
            }
        }
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            if (((l.a) cVar.f2314d).e(transitionName) >= 0) {
                ((l.a) cVar.f2314d).put(transitionName, null);
            } else {
                ((l.a) cVar.f2314d).put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                l.e eVar = (l.e) cVar.f2313c;
                if (eVar.f2248a) {
                    eVar.c();
                }
                if (l.d.b(eVar.f2249b, eVar.f2251d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((l.e) cVar.f2313c).d(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((l.e) cVar.f2313c).f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((l.e) cVar.f2313c).f(itemIdAtPosition, view);
            }
        }
    }

    public static l.a<Animator, b> o() {
        l.a<Animator, b> aVar = f2583w.get();
        if (aVar == null) {
            l.a<Animator, b> aVar2 = new l.a<>();
            f2583w.set(aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static boolean t(o oVar, o oVar2, String str) {
        Object obj = oVar.f2627a.get(str);
        Object obj2 = oVar2.f2627a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(c cVar) {
        this.f2602s = cVar;
    }

    public g B(TimeInterpolator timeInterpolator) {
        this.f2587d = timeInterpolator;
        return this;
    }

    public void C(i.c cVar) {
        if (cVar == null) {
            cVar = f2582v;
        }
        this.f2603t = cVar;
    }

    public void D(l lVar) {
    }

    public g E(long j2) {
        this.f2585b = j2;
        return this;
    }

    public void F() {
        if (this.f2597n == 0) {
            ArrayList<d> arrayList = this.f2600q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2600q.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).a(this);
                }
            }
            this.f2599p = false;
        }
        this.f2597n++;
    }

    public String G(String str) {
        StringBuilder a2 = c.f.a(str);
        a2.append(getClass().getSimpleName());
        a2.append("@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(": ");
        String sb = a2.toString();
        if (this.f2586c != -1) {
            sb = sb + "dur(" + this.f2586c + ") ";
        }
        if (this.f2585b != -1) {
            sb = sb + "dly(" + this.f2585b + ") ";
        }
        if (this.f2587d != null) {
            sb = sb + "interp(" + this.f2587d + ") ";
        }
        if (this.f2588e.size() > 0 || this.f2589f.size() > 0) {
            String a3 = f.f.a(sb, "tgts(");
            if (this.f2588e.size() > 0) {
                for (int i2 = 0; i2 < this.f2588e.size(); i2++) {
                    if (i2 > 0) {
                        a3 = f.f.a(a3, ", ");
                    }
                    StringBuilder a4 = c.f.a(a3);
                    a4.append(this.f2588e.get(i2));
                    a3 = a4.toString();
                }
            }
            if (this.f2589f.size() > 0) {
                for (int i3 = 0; i3 < this.f2589f.size(); i3++) {
                    if (i3 > 0) {
                        a3 = f.f.a(a3, ", ");
                    }
                    StringBuilder a5 = c.f.a(a3);
                    a5.append(this.f2589f.get(i3));
                    a3 = a5.toString();
                }
            }
            return f.f.a(a3, ")");
        }
        return sb;
    }

    public g a(d dVar) {
        if (this.f2600q == null) {
            this.f2600q = new ArrayList<>();
        }
        this.f2600q.add(dVar);
        return this;
    }

    public g b(View view) {
        this.f2589f.add(view);
        return this;
    }

    public abstract void d(o oVar);

    public final void e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            o oVar = new o();
            oVar.f2628b = view;
            if (z2) {
                g(oVar);
            } else {
                d(oVar);
            }
            oVar.f2629c.add(this);
            f(oVar);
            c(z2 ? this.f2590g : this.f2591h, view, oVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                e(viewGroup.getChildAt(i2), z2);
            }
        }
    }

    public void f(o oVar) {
    }

    public abstract void g(o oVar);

    public void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        if (this.f2588e.size() <= 0 && this.f2589f.size() <= 0) {
            e(viewGroup, z2);
            return;
        }
        for (int i2 = 0; i2 < this.f2588e.size(); i2++) {
            View findViewById = viewGroup.findViewById(this.f2588e.get(i2).intValue());
            if (findViewById != null) {
                o oVar = new o();
                oVar.f2628b = findViewById;
                if (z2) {
                    g(oVar);
                } else {
                    d(oVar);
                }
                oVar.f2629c.add(this);
                f(oVar);
                c(z2 ? this.f2590g : this.f2591h, findViewById, oVar);
            }
        }
        for (int i3 = 0; i3 < this.f2589f.size(); i3++) {
            View view = this.f2589f.get(i3);
            o oVar2 = new o();
            oVar2.f2628b = view;
            if (z2) {
                g(oVar2);
            } else {
                d(oVar2);
            }
            oVar2.f2629c.add(this);
            f(oVar2);
            c(z2 ? this.f2590g : this.f2591h, view, oVar2);
        }
    }

    public void i(boolean z2) {
        n.c cVar;
        if (z2) {
            ((l.a) this.f2590g.f2311a).clear();
            ((SparseArray) this.f2590g.f2312b).clear();
            cVar = this.f2590g;
        } else {
            ((l.a) this.f2591h.f2311a).clear();
            ((SparseArray) this.f2591h.f2312b).clear();
            cVar = this.f2591h;
        }
        ((l.e) cVar.f2313c).a();
    }

    @Override // 
    /* renamed from: j */
    public g clone() {
        try {
            g gVar = (g) super.clone();
            gVar.f2601r = new ArrayList<>();
            gVar.f2590g = new n.c(2);
            gVar.f2591h = new n.c(2);
            gVar.f2594k = null;
            gVar.f2595l = null;
            return gVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, o oVar, o oVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, n.c cVar, n.c cVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        Animator k2;
        int i2;
        View view;
        Animator animator;
        o oVar;
        Animator animator2;
        o oVar2;
        l.a<Animator, b> o2 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            o oVar3 = arrayList.get(i3);
            o oVar4 = arrayList2.get(i3);
            if (oVar3 != null && !oVar3.f2629c.contains(this)) {
                oVar3 = null;
            }
            if (oVar4 != null && !oVar4.f2629c.contains(this)) {
                oVar4 = null;
            }
            if (oVar3 != null || oVar4 != null) {
                if ((oVar3 == null || oVar4 == null || r(oVar3, oVar4)) && (k2 = k(viewGroup, oVar3, oVar4)) != null) {
                    if (oVar4 != null) {
                        View view2 = oVar4.f2628b;
                        String[] p2 = p();
                        if (view2 == null || p2 == null || p2.length <= 0) {
                            i2 = size;
                            animator2 = k2;
                            oVar2 = null;
                        } else {
                            oVar2 = new o();
                            oVar2.f2628b = view2;
                            o oVar5 = (o) ((l.a) cVar2.f2311a).getOrDefault(view2, null);
                            if (oVar5 != null) {
                                int i4 = 0;
                                while (i4 < p2.length) {
                                    oVar2.f2627a.put(p2[i4], oVar5.f2627a.get(p2[i4]));
                                    i4++;
                                    k2 = k2;
                                    size = size;
                                    oVar5 = oVar5;
                                }
                            }
                            Animator animator3 = k2;
                            i2 = size;
                            int i5 = o2.f2280c;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = animator3;
                                    break;
                                }
                                b bVar = o2.get(o2.h(i6));
                                if (bVar.f2606c != null && bVar.f2604a == view2 && bVar.f2605b.equals(this.f2584a) && bVar.f2606c.equals(oVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        }
                        view = view2;
                        animator = animator2;
                        oVar = oVar2;
                    } else {
                        i2 = size;
                        view = oVar3.f2628b;
                        animator = k2;
                        oVar = null;
                    }
                    if (animator != null) {
                        String str = this.f2584a;
                        q.d dVar = r.f2630a;
                        o2.put(animator, new b(view, str, this, new x(viewGroup), oVar));
                        this.f2601r.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            i2 = size;
            i3++;
            size = i2;
        }
        for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
            Animator animator4 = this.f2601r.get(sparseIntArray.keyAt(i7));
            animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i7) - Long.MAX_VALUE));
        }
    }

    public void m() {
        int i2 = this.f2597n - 1;
        this.f2597n = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.f2600q;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f2600q.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).b(this);
                }
            }
            for (int i4 = 0; i4 < ((l.e) this.f2590g.f2313c).g(); i4++) {
                View view = (View) ((l.e) this.f2590g.f2313c).h(i4);
                if (view != null) {
                    WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                    view.setHasTransientState(false);
                }
            }
            for (int i5 = 0; i5 < ((l.e) this.f2591h.f2313c).g(); i5++) {
                View view2 = (View) ((l.e) this.f2591h.f2313c).h(i5);
                if (view2 != null) {
                    WeakHashMap<View, e0.o> weakHashMap2 = e0.m.f1633a;
                    view2.setHasTransientState(false);
                }
            }
            this.f2599p = true;
        }
    }

    public o n(View view, boolean z2) {
        m mVar = this.f2592i;
        if (mVar != null) {
            return mVar.n(view, z2);
        }
        ArrayList<o> arrayList = z2 ? this.f2594k : this.f2595l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            o oVar = arrayList.get(i3);
            if (oVar == null) {
                return null;
            }
            if (oVar.f2628b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z2 ? this.f2595l : this.f2594k).get(i2);
        }
        return null;
    }

    public String[] p() {
        return null;
    }

    public o q(View view, boolean z2) {
        m mVar = this.f2592i;
        if (mVar != null) {
            return mVar.q(view, z2);
        }
        return (o) ((l.a) (z2 ? this.f2590g : this.f2591h).f2311a).getOrDefault(view, null);
    }

    public boolean r(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return false;
        }
        String[] p2 = p();
        if (p2 == null) {
            for (String str : oVar.f2627a.keySet()) {
                if (t(oVar, oVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : p2) {
            if (!t(oVar, oVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.f2588e.size() == 0 && this.f2589f.size() == 0) || this.f2588e.contains(Integer.valueOf(view.getId())) || this.f2589f.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        int i2;
        if (this.f2599p) {
            return;
        }
        l.a<Animator, b> o2 = o();
        int i3 = o2.f2280c;
        q.d dVar = r.f2630a;
        WindowId windowId = view.getWindowId();
        int i4 = i3 - 1;
        while (true) {
            i2 = 0;
            if (i4 < 0) {
                break;
            }
            b k2 = o2.k(i4);
            if (k2.f2604a != null) {
                y yVar = k2.f2607d;
                if ((yVar instanceof x) && ((x) yVar).f2660a.equals(windowId)) {
                    i2 = 1;
                }
                if (i2 != 0) {
                    o2.h(i4).pause();
                }
            }
            i4--;
        }
        ArrayList<d> arrayList = this.f2600q;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f2600q.clone();
            int size = arrayList2.size();
            while (i2 < size) {
                ((d) arrayList2.get(i2)).c(this);
                i2++;
            }
        }
        this.f2598o = true;
    }

    public g v(d dVar) {
        ArrayList<d> arrayList = this.f2600q;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f2600q.size() == 0) {
            this.f2600q = null;
        }
        return this;
    }

    public g w(View view) {
        this.f2589f.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.f2598o) {
            if (!this.f2599p) {
                l.a<Animator, b> o2 = o();
                int i2 = o2.f2280c;
                q.d dVar = r.f2630a;
                WindowId windowId = view.getWindowId();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b k2 = o2.k(i3);
                    if (k2.f2604a != null) {
                        y yVar = k2.f2607d;
                        if ((yVar instanceof x) && ((x) yVar).f2660a.equals(windowId)) {
                            o2.h(i3).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f2600q;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f2600q.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).d(this);
                    }
                }
            }
            this.f2598o = false;
        }
    }

    public void y() {
        F();
        l.a<Animator, b> o2 = o();
        Iterator<Animator> it = this.f2601r.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o2.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new h(this, o2));
                    long j2 = this.f2586c;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f2585b;
                    if (j3 >= 0) {
                        next.setStartDelay(j3);
                    }
                    TimeInterpolator timeInterpolator = this.f2587d;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new i(this));
                    next.start();
                }
            }
        }
        this.f2601r.clear();
        m();
    }

    public g z(long j2) {
        this.f2586c = j2;
        return this;
    }
}