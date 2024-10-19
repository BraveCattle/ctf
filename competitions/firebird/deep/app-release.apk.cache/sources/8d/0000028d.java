package k;

import android.content.res.ColorStateList;

/* loaded from: classes.dex */
public class b implements d {
    public final e a(c cVar) {
        return (e) cVar.c();
    }

    public float b(c cVar) {
        a(null);
        throw null;
    }

    public float c(c cVar) {
        a(null);
        throw null;
    }

    public void d(c cVar, ColorStateList colorStateList) {
        a(null);
        throw null;
    }

    public void e(c cVar, float f2) {
        e a2 = a(cVar);
        boolean a3 = cVar.a();
        boolean d2 = cVar.d();
        if (f2 == a2.f2152b && a2.f2153c == a3 && a2.f2154d == d2) {
            if (!cVar.a()) {
                cVar.b(0, 0, 0, 0);
                return;
            }
            float f3 = a(cVar).f2152b;
            float f4 = a(cVar).f2151a;
            int ceil = (int) Math.ceil(f.a(f3, f4, cVar.d()));
            int ceil2 = (int) Math.ceil(f.b(f3, f4, cVar.d()));
            cVar.b(ceil, ceil2, ceil, ceil2);
            return;
        }
        a2.f2152b = f2;
        a2.f2153c = a3;
        a2.f2154d = d2;
        a2.b(null);
        throw null;
    }
}