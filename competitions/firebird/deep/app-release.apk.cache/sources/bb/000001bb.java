package e0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1618a;

    public c(Object obj) {
        this.f1618a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f1618a;
        Object obj3 = ((c) obj).f1618a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f1618a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder a2 = c.f.a("DisplayCutoutCompat{");
        a2.append(this.f1618a);
        a2.append("}");
        return a2.toString();
    }
}