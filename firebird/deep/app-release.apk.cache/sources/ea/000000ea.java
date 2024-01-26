package androidx.recyclerview.widget;

import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<k.v> f996h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<k.v> f997i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f998j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<a> f999k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<k.v>> f1000l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f1001m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f1002n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<k.v> f1003o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<k.v> f1004p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<k.v> f1005q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<k.v> f1006r = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public k.v f1007a;

        /* renamed from: b  reason: collision with root package name */
        public k.v f1008b;

        /* renamed from: c  reason: collision with root package name */
        public int f1009c;

        /* renamed from: d  reason: collision with root package name */
        public int f1010d;

        /* renamed from: e  reason: collision with root package name */
        public int f1011e;

        /* renamed from: f  reason: collision with root package name */
        public int f1012f;

        public String toString() {
            StringBuilder a2 = c.f.a("ChangeInfo{oldHolder=");
            a2.append(this.f1007a);
            a2.append(", newHolder=");
            a2.append(this.f1008b);
            a2.append(", fromX=");
            a2.append(this.f1009c);
            a2.append(", fromY=");
            a2.append(this.f1010d);
            a2.append(", toX=");
            a2.append(this.f1011e);
            a2.append(", toY=");
            a2.append(this.f1012f);
            a2.append('}');
            return a2.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public k.v f1013a;
    }

    @Override // androidx.recyclerview.widget.k.g
    public void d() {
        ArrayList<k.v> arrayList;
        int size;
        ArrayList<b> arrayList2;
        int size2;
        int size3 = this.f998j.size() - 1;
        if (size3 >= 0) {
            Objects.requireNonNull(this.f998j.get(size3).f1013a);
            throw null;
        }
        int size4 = this.f996h.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            b(this.f996h.get(size4));
            this.f996h.remove(size4);
        }
        int size5 = this.f997i.size() - 1;
        if (size5 >= 0) {
            Objects.requireNonNull(this.f997i.get(size5));
            throw null;
        }
        int size6 = this.f999k.size();
        while (true) {
            size6--;
            if (size6 < 0) {
                break;
            }
            a aVar = this.f999k.get(size6);
            k.v vVar = aVar.f1007a;
            if (vVar != null) {
                g(aVar, vVar);
            }
            k.v vVar2 = aVar.f1008b;
            if (vVar2 != null) {
                g(aVar, vVar2);
            }
        }
        this.f999k.clear();
        if (e()) {
            int size7 = this.f1001m.size();
            do {
                size7--;
                if (size7 < 0) {
                    int size8 = this.f1000l.size();
                    do {
                        size8--;
                        if (size8 >= 0) {
                            arrayList = this.f1000l.get(size8);
                            size = arrayList.size() - 1;
                        } else {
                            int size9 = this.f1002n.size();
                            while (true) {
                                size9--;
                                if (size9 < 0) {
                                    f(this.f1005q);
                                    f(this.f1004p);
                                    f(this.f1003o);
                                    f(this.f1006r);
                                    c();
                                    return;
                                }
                                ArrayList<a> arrayList3 = this.f1002n.get(size9);
                                int size10 = arrayList3.size();
                                while (true) {
                                    size10--;
                                    if (size10 >= 0) {
                                        a aVar2 = arrayList3.get(size10);
                                        k.v vVar3 = aVar2.f1007a;
                                        if (vVar3 != null) {
                                            g(aVar2, vVar3);
                                        }
                                        k.v vVar4 = aVar2.f1008b;
                                        if (vVar4 != null) {
                                            g(aVar2, vVar4);
                                        }
                                        if (arrayList3.isEmpty()) {
                                            this.f1002n.remove(arrayList3);
                                        }
                                    }
                                }
                            }
                        }
                    } while (size < 0);
                    Objects.requireNonNull(arrayList.get(size));
                    throw null;
                }
                arrayList2 = this.f1001m.get(size7);
                size2 = arrayList2.size() - 1;
            } while (size2 < 0);
            Objects.requireNonNull(arrayList2.get(size2).f1013a);
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.k.g
    public boolean e() {
        return (this.f997i.isEmpty() && this.f999k.isEmpty() && this.f998j.isEmpty() && this.f996h.isEmpty() && this.f1004p.isEmpty() && this.f1005q.isEmpty() && this.f1003o.isEmpty() && this.f1006r.isEmpty() && this.f1001m.isEmpty() && this.f1000l.isEmpty() && this.f1002n.isEmpty()) ? false : true;
    }

    public void f(List<k.v> list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        Objects.requireNonNull(list.get(size));
        throw null;
    }

    public final boolean g(a aVar, k.v vVar) {
        if (aVar.f1008b == vVar) {
            aVar.f1008b = null;
        } else if (aVar.f1007a != vVar) {
            return false;
        } else {
            aVar.f1007a = null;
        }
        Objects.requireNonNull(vVar);
        throw null;
    }
}