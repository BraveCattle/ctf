package c;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import e0.s;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class h implements e0.k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1350a;

    public h(g gVar) {
        this.f1350a = gVar;
    }

    @Override // e0.k
    public s a(View view, s sVar) {
        int d2 = sVar.d();
        int X = this.f1350a.X(sVar, null);
        if (d2 != X) {
            int b2 = sVar.b();
            int c2 = sVar.c();
            int a2 = sVar.a();
            s.c bVar = Build.VERSION.SDK_INT >= 29 ? new s.b(sVar) : new s.a(sVar);
            bVar.c(x.b.a(b2, X, c2, a2));
            sVar = bVar.a();
        }
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        WindowInsets g2 = sVar.g();
        if (g2 != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(g2);
            return !onApplyWindowInsets.equals(g2) ? new s(onApplyWindowInsets) : sVar;
        }
        return sVar;
    }
}