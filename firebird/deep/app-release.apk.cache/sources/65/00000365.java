package x;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f2762e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2763a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2764b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2765c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2766d;

    public b(int i2, int i3, int i4, int i5) {
        this.f2763a = i2;
        this.f2764b = i3;
        this.f2765c = i4;
        this.f2766d = i5;
    }

    public static b a(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f2762e : new b(i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2766d == bVar.f2766d && this.f2763a == bVar.f2763a && this.f2765c == bVar.f2765c && this.f2764b == bVar.f2764b;
    }

    public int hashCode() {
        return (((((this.f2763a * 31) + this.f2764b) * 31) + this.f2765c) * 31) + this.f2766d;
    }

    public String toString() {
        StringBuilder a2 = c.f.a("Insets{left=");
        a2.append(this.f2763a);
        a2.append(", top=");
        a2.append(this.f2764b);
        a2.append(", right=");
        a2.append(this.f2765c);
        a2.append(", bottom=");
        a2.append(this.f2766d);
        a2.append('}');
        return a2.toString();
    }
}