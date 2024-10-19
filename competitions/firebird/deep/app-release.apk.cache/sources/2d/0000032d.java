package r0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    public View f2628b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2627a = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f2629c = new ArrayList<>();

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            return this.f2628b == oVar.f2628b && this.f2627a.equals(oVar.f2627a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2627a.hashCode() + (this.f2628b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a2 = c.f.a("TransitionValues@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(":\n");
        String a3 = f.f.a(a2.toString() + "    view = " + this.f2628b + "\n", "    values:");
        for (String str : this.f2627a.keySet()) {
            a3 = a3 + "    " + str + ": " + this.f2627a.get(str) + "\n";
        }
        return a3;
    }
}