package androidx.recyclerview.widget;

import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a implements g.a {

    /* renamed from: d  reason: collision with root package name */
    public final InterfaceC0008a f985d;

    /* renamed from: a  reason: collision with root package name */
    public n.e f982a = new n.e(30, 1);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<b> f983b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<b> f984c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final g f986e = new g(this);

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0008a {
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f987a;

        /* renamed from: b  reason: collision with root package name */
        public int f988b;

        /* renamed from: c  reason: collision with root package name */
        public Object f989c;

        /* renamed from: d  reason: collision with root package name */
        public int f990d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i2 = this.f987a;
            if (i2 != bVar.f987a) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f990d - this.f988b) == 1 && this.f990d == bVar.f988b && this.f988b == bVar.f990d) {
                return true;
            }
            if (this.f990d == bVar.f990d && this.f988b == bVar.f988b) {
                Object obj2 = this.f989c;
                Object obj3 = bVar.f989c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f987a * 31) + this.f988b) * 31) + this.f990d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i2 = this.f987a;
            sb.append(i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f988b);
            sb.append("c:");
            sb.append(this.f990d);
            sb.append(",p:");
            sb.append(this.f989c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(InterfaceC0008a interfaceC0008a) {
        this.f985d = interfaceC0008a;
    }

    public int a(int i2, int i3) {
        int size = this.f984c.size();
        while (i3 < size) {
            b bVar = this.f984c.get(i3);
            int i4 = bVar.f987a;
            if (i4 == 8) {
                int i5 = bVar.f988b;
                if (i5 == i2) {
                    i2 = bVar.f990d;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (bVar.f990d <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = bVar.f988b;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = bVar.f990d;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += bVar.f990d;
                }
            }
            i3++;
        }
        return i2;
    }

    public boolean b() {
        return this.f983b.size() > 0;
    }

    public void c(b bVar) {
        bVar.f989c = null;
        this.f982a.c(bVar);
    }

    public void d(List<b> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c(list.get(i2));
        }
        list.clear();
    }
}