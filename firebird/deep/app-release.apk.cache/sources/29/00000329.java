package r0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import r0.g;

/* loaded from: classes.dex */
public class m extends g {

    /* renamed from: z  reason: collision with root package name */
    public int f2621z;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<g> f2619x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public boolean f2620y = true;
    public boolean A = false;
    public int B = 0;

    /* loaded from: classes.dex */
    public class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f2622a;

        public a(m mVar, g gVar) {
            this.f2622a = gVar;
        }

        @Override // r0.g.d
        public void b(g gVar) {
            this.f2622a.y();
            gVar.v(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public m f2623a;

        public b(m mVar) {
            this.f2623a = mVar;
        }

        @Override // r0.j, r0.g.d
        public void a(g gVar) {
            m mVar = this.f2623a;
            if (mVar.A) {
                return;
            }
            mVar.F();
            this.f2623a.A = true;
        }

        @Override // r0.g.d
        public void b(g gVar) {
            m mVar = this.f2623a;
            int i2 = mVar.f2621z - 1;
            mVar.f2621z = i2;
            if (i2 == 0) {
                mVar.A = false;
                mVar.m();
            }
            gVar.v(this);
        }
    }

    @Override // r0.g
    public void A(g.c cVar) {
        this.f2602s = cVar;
        this.B |= 8;
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2619x.get(i2).A(cVar);
        }
    }

    @Override // r0.g
    public g B(TimeInterpolator timeInterpolator) {
        this.B |= 1;
        ArrayList<g> arrayList = this.f2619x;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2619x.get(i2).B(timeInterpolator);
            }
        }
        this.f2587d = timeInterpolator;
        return this;
    }

    @Override // r0.g
    public void C(i.c cVar) {
        this.f2603t = cVar == null ? g.f2582v : cVar;
        this.B |= 4;
        for (int i2 = 0; i2 < this.f2619x.size(); i2++) {
            this.f2619x.get(i2).C(cVar);
        }
    }

    @Override // r0.g
    public void D(l lVar) {
        this.B |= 2;
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2619x.get(i2).D(lVar);
        }
    }

    @Override // r0.g
    public g E(long j2) {
        this.f2585b = j2;
        return this;
    }

    @Override // r0.g
    public String G(String str) {
        String G = super.G(str);
        for (int i2 = 0; i2 < this.f2619x.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.f2619x.get(i2).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public m H(g gVar) {
        this.f2619x.add(gVar);
        gVar.f2592i = this;
        long j2 = this.f2586c;
        if (j2 >= 0) {
            gVar.z(j2);
        }
        if ((this.B & 1) != 0) {
            gVar.B(this.f2587d);
        }
        if ((this.B & 2) != 0) {
            gVar.D(null);
        }
        if ((this.B & 4) != 0) {
            gVar.C(this.f2603t);
        }
        if ((this.B & 8) != 0) {
            gVar.A(this.f2602s);
        }
        return this;
    }

    public g I(int i2) {
        if (i2 < 0 || i2 >= this.f2619x.size()) {
            return null;
        }
        return this.f2619x.get(i2);
    }

    public m J(int i2) {
        if (i2 == 0) {
            this.f2620y = true;
        } else if (i2 != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        } else {
            this.f2620y = false;
        }
        return this;
    }

    @Override // r0.g
    public g a(g.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // r0.g
    public g b(View view) {
        for (int i2 = 0; i2 < this.f2619x.size(); i2++) {
            this.f2619x.get(i2).b(view);
        }
        this.f2589f.add(view);
        return this;
    }

    @Override // r0.g
    public void d(o oVar) {
        if (s(oVar.f2628b)) {
            Iterator<g> it = this.f2619x.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.s(oVar.f2628b)) {
                    next.d(oVar);
                    oVar.f2629c.add(next);
                }
            }
        }
    }

    @Override // r0.g
    public void f(o oVar) {
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2619x.get(i2).f(oVar);
        }
    }

    @Override // r0.g
    public void g(o oVar) {
        if (s(oVar.f2628b)) {
            Iterator<g> it = this.f2619x.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.s(oVar.f2628b)) {
                    next.g(oVar);
                    oVar.f2629c.add(next);
                }
            }
        }
    }

    @Override // r0.g
    /* renamed from: j */
    public g clone() {
        m mVar = (m) super.clone();
        mVar.f2619x = new ArrayList<>();
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            mVar.H(this.f2619x.get(i2).clone());
        }
        return mVar;
    }

    @Override // r0.g
    public void l(ViewGroup viewGroup, n.c cVar, n.c cVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        long j2 = this.f2585b;
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f2619x.get(i2);
            if (j2 > 0 && (this.f2620y || i2 == 0)) {
                long j3 = gVar.f2585b;
                if (j3 > 0) {
                    gVar.E(j3 + j2);
                } else {
                    gVar.E(j2);
                }
            }
            gVar.l(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    @Override // r0.g
    public void u(View view) {
        super.u(view);
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2619x.get(i2).u(view);
        }
    }

    @Override // r0.g
    public g v(g.d dVar) {
        super.v(dVar);
        return this;
    }

    @Override // r0.g
    public g w(View view) {
        for (int i2 = 0; i2 < this.f2619x.size(); i2++) {
            this.f2619x.get(i2).w(view);
        }
        this.f2589f.remove(view);
        return this;
    }

    @Override // r0.g
    public void x(View view) {
        super.x(view);
        int size = this.f2619x.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2619x.get(i2).x(view);
        }
    }

    @Override // r0.g
    public void y() {
        if (this.f2619x.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<g> it = this.f2619x.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f2621z = this.f2619x.size();
        if (this.f2620y) {
            Iterator<g> it2 = this.f2619x.iterator();
            while (it2.hasNext()) {
                it2.next().y();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f2619x.size(); i2++) {
            this.f2619x.get(i2 - 1).a(new a(this, this.f2619x.get(i2)));
        }
        g gVar = this.f2619x.get(0);
        if (gVar != null) {
            gVar.y();
        }
    }

    @Override // r0.g
    public g z(long j2) {
        this.f2586c = j2;
        if (j2 >= 0) {
            int size = this.f2619x.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2619x.get(i2).z(j2);
            }
        }
        return this;
    }
}