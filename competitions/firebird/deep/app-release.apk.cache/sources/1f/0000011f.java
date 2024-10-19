package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public class o {
    public static int a(k.s sVar, j jVar, View view, View view2, k.j jVar2, boolean z2) {
        if (jVar2.p() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z2) {
            return Math.min(jVar.f(), jVar.b(view2) - jVar.c(view));
        }
        jVar2.x(view);
        throw null;
    }

    public static int b(k.s sVar, j jVar, View view, View view2, k.j jVar2, boolean z2, boolean z3) {
        if (jVar2.p() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        jVar2.x(view);
        throw null;
    }

    public static int c(k.s sVar, j jVar, View view, View view2, k.j jVar2, boolean z2) {
        if (jVar2.p() == 0 || sVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (z2) {
            jVar.b(view2);
            jVar.c(view);
            jVar2.x(view);
            throw null;
        }
        return sVar.a();
    }
}