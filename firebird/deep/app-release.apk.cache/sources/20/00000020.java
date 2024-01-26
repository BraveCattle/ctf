package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import h.j0;
import h.k0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b extends g.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f108c;

    /* renamed from: d  reason: collision with root package name */
    public final int f109d;

    /* renamed from: e  reason: collision with root package name */
    public final int f110e;

    /* renamed from: f  reason: collision with root package name */
    public final int f111f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f112g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f113h;

    /* renamed from: p  reason: collision with root package name */
    public View f121p;

    /* renamed from: q  reason: collision with root package name */
    public View f122q;

    /* renamed from: r  reason: collision with root package name */
    public int f123r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f124s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f125t;

    /* renamed from: u  reason: collision with root package name */
    public int f126u;

    /* renamed from: v  reason: collision with root package name */
    public int f127v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f129x;

    /* renamed from: y  reason: collision with root package name */
    public i.a f130y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTreeObserver f131z;

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f114i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<d> f115j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f116k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f117l = new View$OnAttachStateChangeListenerC0000b();

    /* renamed from: m  reason: collision with root package name */
    public final j0 f118m = new c();

    /* renamed from: n  reason: collision with root package name */
    public int f119n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f120o = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f128w = false;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f115j.size() <= 0 || b.this.f115j.get(0).f139a.f1917y) {
                return;
            }
            View view = b.this.f122q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            for (d dVar : b.this.f115j) {
                dVar.f139a.i();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0000b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0000b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f131z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f131z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f131z.removeGlobalOnLayoutListener(bVar.f116k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class c implements j0 {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f135b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ MenuItem f136c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ e f137d;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f135b = dVar;
                this.f136c = menuItem;
                this.f137d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f135b;
                if (dVar != null) {
                    b.this.B = true;
                    dVar.f140b.c(false);
                    b.this.B = false;
                }
                if (this.f136c.isEnabled() && this.f136c.hasSubMenu()) {
                    this.f137d.q(this.f136c, 4);
                }
            }
        }

        public c() {
        }

        @Override // h.j0
        public void g(e eVar, MenuItem menuItem) {
            b.this.f113h.removeCallbacksAndMessages(null);
            int size = b.this.f115j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f115j.get(i2).f140b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return;
            }
            int i3 = i2 + 1;
            b.this.f113h.postAtTime(new a(i3 < b.this.f115j.size() ? b.this.f115j.get(i3) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // h.j0
        public void k(e eVar, MenuItem menuItem) {
            b.this.f113h.removeCallbacksAndMessages(eVar);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final k0 f139a;

        /* renamed from: b  reason: collision with root package name */
        public final e f140b;

        /* renamed from: c  reason: collision with root package name */
        public final int f141c;

        public d(k0 k0Var, e eVar, int i2) {
            this.f139a = k0Var;
            this.f140b = eVar;
            this.f141c = i2;
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z2) {
        this.f108c = context;
        this.f121p = view;
        this.f110e = i2;
        this.f111f = i3;
        this.f112g = z2;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        this.f123r = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f109d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f113h = new Handler();
    }

    @Override // g.f
    public boolean a() {
        return this.f115j.size() > 0 && this.f115j.get(0).f139a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z2) {
        int i2;
        int size = this.f115j.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (eVar == this.f115j.get(i3).f140b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < this.f115j.size()) {
            this.f115j.get(i4).f140b.c(false);
        }
        d remove = this.f115j.remove(i3);
        remove.f140b.t(this);
        if (this.B) {
            remove.f139a.f1918z.setExitTransition(null);
            remove.f139a.f1918z.setAnimationStyle(0);
        }
        remove.f139a.dismiss();
        int size2 = this.f115j.size();
        if (size2 > 0) {
            i2 = this.f115j.get(size2 - 1).f141c;
        } else {
            View view = this.f121p;
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            i2 = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        this.f123r = i2;
        if (size2 != 0) {
            if (z2) {
                this.f115j.get(0).f140b.c(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f130y;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f131z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f131z.removeGlobalOnLayoutListener(this.f116k);
            }
            this.f131z = null;
        }
        this.f122q.removeOnAttachStateChangeListener(this.f117l);
        this.A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f130y = aVar;
    }

    @Override // g.f
    public void dismiss() {
        int size = this.f115j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f115j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f139a.a()) {
                    dVar.f139a.dismiss();
                }
            }
        }
    }

    @Override // g.f
    public ListView e() {
        if (this.f115j.isEmpty()) {
            return null;
        }
        List<d> list = this.f115j;
        return list.get(list.size() - 1).f139a.f1896d;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(l lVar) {
        for (d dVar : this.f115j) {
            if (lVar == dVar.f140b) {
                dVar.f139a.f1896d.requestFocus();
                return true;
            }
        }
        if (lVar.hasVisibleItems()) {
            lVar.b(this, this.f108c);
            if (a()) {
                v(lVar);
            } else {
                this.f114i.add(lVar);
            }
            i.a aVar = this.f130y;
            if (aVar != null) {
                aVar.c(lVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(boolean z2) {
        for (d dVar : this.f115j) {
            ListAdapter adapter = dVar.f139a.f1896d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).notifyDataSetChanged();
        }
    }

    @Override // g.f
    public void i() {
        if (a()) {
            return;
        }
        for (e eVar : this.f114i) {
            v(eVar);
        }
        this.f114i.clear();
        View view = this.f121p;
        this.f122q = view;
        if (view != null) {
            boolean z2 = this.f131z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f131z = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f116k);
            }
            this.f122q.addOnAttachStateChangeListener(this.f117l);
        }
    }

    @Override // g.d
    public void l(e eVar) {
        eVar.b(this, this.f108c);
        if (a()) {
            v(eVar);
        } else {
            this.f114i.add(eVar);
        }
    }

    @Override // g.d
    public void n(View view) {
        if (this.f121p != view) {
            this.f121p = view;
            int i2 = this.f119n;
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            this.f120o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.d
    public void o(boolean z2) {
        this.f128w = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f115j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f115j.get(i2);
            if (!dVar.f139a.a()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f140b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i2 == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // g.d
    public void p(int i2) {
        if (this.f119n != i2) {
            this.f119n = i2;
            View view = this.f121p;
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            this.f120o = Gravity.getAbsoluteGravity(i2, view.getLayoutDirection());
        }
    }

    @Override // g.d
    public void q(int i2) {
        this.f124s = true;
        this.f126u = i2;
    }

    @Override // g.d
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // g.d
    public void s(boolean z2) {
        this.f129x = z2;
    }

    @Override // g.d
    public void t(int i2) {
        this.f125t = true;
        this.f127v = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(androidx.appcompat.view.menu.e r17) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.v(androidx.appcompat.view.menu.e):void");
    }
}