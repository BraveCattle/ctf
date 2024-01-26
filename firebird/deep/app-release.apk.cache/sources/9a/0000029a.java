package k0;

import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends m0.h {

    /* renamed from: g  reason: collision with root package name */
    public static final m0.i f2181g = new a();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2185e;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet<Fragment> f2182b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, g> f2183c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, m0.k> f2184d = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f2186f = false;

    /* loaded from: classes.dex */
    public static class a implements m0.i {
        public <T extends m0.h> T a(Class<T> cls) {
            return new g(true);
        }
    }

    public g(boolean z2) {
        this.f2185e = z2;
    }

    @Override // m0.h
    public void a() {
        Interpolator interpolator = androidx.fragment.app.e.G;
        this.f2186f = true;
    }

    public boolean b(Fragment fragment) {
        if (this.f2182b.contains(fragment) && this.f2185e) {
            return this.f2186f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2182b.equals(gVar.f2182b) && this.f2183c.equals(gVar.f2183c) && this.f2184d.equals(gVar.f2184d);
    }

    public int hashCode() {
        int hashCode = this.f2183c.hashCode();
        return this.f2184d.hashCode() + ((hashCode + (this.f2182b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2182b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2183c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2184d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}