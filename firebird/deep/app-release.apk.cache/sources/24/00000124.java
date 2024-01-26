package androidx.recyclerview.widget;

import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final l.a<k.v, a> f1205a = new l.a<>();

    /* renamed from: b  reason: collision with root package name */
    public final l.e<k.v> f1206b = new l.e<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static n.e<a> f1207d = new n.e<>(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f1208a;

        /* renamed from: b  reason: collision with root package name */
        public k.g.c f1209b;

        /* renamed from: c  reason: collision with root package name */
        public k.g.c f1210c;

        public static void a(a aVar) {
            aVar.f1208a = 0;
            aVar.f1209b = null;
            aVar.f1210c = null;
            f1207d.c(aVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    public void a(k.v vVar) {
        int g2 = this.f1206b.g() - 1;
        while (true) {
            if (g2 < 0) {
                break;
            } else if (vVar == this.f1206b.h(g2)) {
                l.e<k.v> eVar = this.f1206b;
                Object[] objArr = eVar.f2250c;
                Object obj = objArr[g2];
                Object obj2 = l.e.f2247e;
                if (obj != obj2) {
                    objArr[g2] = obj2;
                    eVar.f2248a = true;
                }
            } else {
                g2--;
            }
        }
        a remove = this.f1205a.remove(vVar);
        if (remove != null) {
            a.a(remove);
        }
    }
}