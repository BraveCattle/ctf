package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public class n extends e0.a {

    /* renamed from: d  reason: collision with root package name */
    public final k f1194d;

    /* renamed from: e  reason: collision with root package name */
    public final e0.a f1195e = new a(this);

    /* loaded from: classes.dex */
    public static class a extends e0.a {

        /* renamed from: d  reason: collision with root package name */
        public final n f1196d;

        public a(n nVar) {
            this.f1196d = nVar;
        }

        @Override // e0.a
        public void b(View view, f0.d dVar) {
            this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
            if (this.f1196d.d() || this.f1196d.f1194d.getLayoutManager() == null) {
                return;
            }
            this.f1196d.f1194d.getLayoutManager().D(view, dVar);
        }

        @Override // e0.a
        public boolean c(View view, int i2, Bundle bundle) {
            if (super.c(view, i2, bundle)) {
                return true;
            }
            if (!this.f1196d.d() && this.f1196d.f1194d.getLayoutManager() != null) {
                k.p pVar = this.f1196d.f1194d.getLayoutManager().f1128b.f1076b;
            }
            return false;
        }
    }

    public n(k kVar) {
        this.f1194d = kVar;
    }

    @Override // e0.a
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1614a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(k.class.getName());
        if (!(view instanceof k) || d()) {
            return;
        }
        k kVar = (k) view;
        if (kVar.getLayoutManager() != null) {
            kVar.getLayoutManager().C(accessibilityEvent);
        }
    }

    @Override // e0.a
    public void b(View view, f0.d dVar) {
        this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
        dVar.f1731a.setClassName(k.class.getName());
        if (d() || this.f1194d.getLayoutManager() == null) {
            return;
        }
        k.j layoutManager = this.f1194d.getLayoutManager();
        k kVar = layoutManager.f1128b;
        k.p pVar = kVar.f1076b;
        k.s sVar = kVar.f1077b0;
        if (kVar.canScrollVertically(-1) || layoutManager.f1128b.canScrollHorizontally(-1)) {
            dVar.f1731a.addAction(8192);
            dVar.f1731a.setScrollable(true);
        }
        if (layoutManager.f1128b.canScrollVertically(1) || layoutManager.f1128b.canScrollHorizontally(1)) {
            dVar.f1731a.addAction(4096);
            dVar.f1731a.setScrollable(true);
        }
        dVar.f1731a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.z(pVar, sVar), layoutManager.q(pVar, sVar), false, 0));
    }

    @Override // e0.a
    public boolean c(View view, int i2, Bundle bundle) {
        int w2;
        int u2;
        if (super.c(view, i2, bundle)) {
            return true;
        }
        if (d() || this.f1194d.getLayoutManager() == null) {
            return false;
        }
        k.j layoutManager = this.f1194d.getLayoutManager();
        k kVar = layoutManager.f1128b;
        k.p pVar = kVar.f1076b;
        if (i2 == 4096) {
            w2 = kVar.canScrollVertically(1) ? (layoutManager.f1138l - layoutManager.w()) - layoutManager.t() : 0;
            if (layoutManager.f1128b.canScrollHorizontally(1)) {
                u2 = (layoutManager.f1137k - layoutManager.u()) - layoutManager.v();
            }
            u2 = 0;
        } else if (i2 != 8192) {
            u2 = 0;
            w2 = 0;
        } else {
            w2 = kVar.canScrollVertically(-1) ? -((layoutManager.f1138l - layoutManager.w()) - layoutManager.t()) : 0;
            if (layoutManager.f1128b.canScrollHorizontally(-1)) {
                u2 = -((layoutManager.f1137k - layoutManager.u()) - layoutManager.v());
            }
            u2 = 0;
        }
        if (w2 == 0 && u2 == 0) {
            return false;
        }
        layoutManager.f1128b.I(u2, w2);
        return true;
    }

    public boolean d() {
        return this.f1194d.w();
    }
}