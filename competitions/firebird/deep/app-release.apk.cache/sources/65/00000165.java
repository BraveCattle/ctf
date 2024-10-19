package c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import c.a;
import com.x64m.xsfmnative.R;
import e0.r;
import f.a;
import h.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class q extends c.a implements ActionBarOverlayLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public Context f1381a;

    /* renamed from: b  reason: collision with root package name */
    public Context f1382b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f1383c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f1384d;

    /* renamed from: e  reason: collision with root package name */
    public c0 f1385e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f1386f;

    /* renamed from: g  reason: collision with root package name */
    public View f1387g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1388h;

    /* renamed from: i  reason: collision with root package name */
    public d f1389i;

    /* renamed from: j  reason: collision with root package name */
    public f.a f1390j;

    /* renamed from: k  reason: collision with root package name */
    public a.InterfaceC0020a f1391k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1392l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f1393m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1394n;

    /* renamed from: o  reason: collision with root package name */
    public int f1395o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1396p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1397q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1398r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1399s;

    /* renamed from: t  reason: collision with root package name */
    public f.h f1400t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1401u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1402v;

    /* renamed from: w  reason: collision with root package name */
    public final e0.p f1403w;

    /* renamed from: x  reason: collision with root package name */
    public final e0.p f1404x;

    /* renamed from: y  reason: collision with root package name */
    public final r f1405y;

    /* renamed from: z  reason: collision with root package name */
    public static final Interpolator f1380z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    /* loaded from: classes.dex */
    public class a extends e0.q {
        public a() {
        }

        @Override // e0.p
        public void a(View view) {
            View view2;
            q qVar = q.this;
            if (qVar.f1396p && (view2 = qVar.f1387g) != null) {
                view2.setTranslationY(0.0f);
                q.this.f1384d.setTranslationY(0.0f);
            }
            q.this.f1384d.setVisibility(8);
            q.this.f1384d.setTransitioning(false);
            q qVar2 = q.this;
            qVar2.f1400t = null;
            a.InterfaceC0020a interfaceC0020a = qVar2.f1391k;
            if (interfaceC0020a != null) {
                interfaceC0020a.b(qVar2.f1390j);
                qVar2.f1390j = null;
                qVar2.f1391k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = q.this.f1383c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends e0.q {
        public b() {
        }

        @Override // e0.p
        public void a(View view) {
            q qVar = q.this;
            qVar.f1400t = null;
            qVar.f1384d.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c implements r {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public class d extends f.a implements e.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f1409d;

        /* renamed from: e  reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f1410e;

        /* renamed from: f  reason: collision with root package name */
        public a.InterfaceC0020a f1411f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f1412g;

        public d(Context context, a.InterfaceC0020a interfaceC0020a) {
            this.f1409d = context;
            this.f1411f = interfaceC0020a;
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            eVar.f168l = 1;
            this.f1410e = eVar;
            eVar.f161e = this;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void a(androidx.appcompat.view.menu.e eVar) {
            if (this.f1411f == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = q.this.f1386f.f1824e;
            if (aVar != null) {
                aVar.n();
            }
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            a.InterfaceC0020a interfaceC0020a = this.f1411f;
            if (interfaceC0020a != null) {
                return interfaceC0020a.c(this, menuItem);
            }
            return false;
        }

        @Override // f.a
        public void c() {
            q qVar = q.this;
            if (qVar.f1389i != this) {
                return;
            }
            if (!qVar.f1397q) {
                this.f1411f.b(this);
            } else {
                qVar.f1390j = this;
                qVar.f1391k = this.f1411f;
            }
            this.f1411f = null;
            q.this.d(false);
            ActionBarContextView actionBarContextView = q.this.f1386f;
            if (actionBarContextView.f259l == null) {
                actionBarContextView.h();
            }
            q.this.f1385e.p().sendAccessibilityEvent(32);
            q qVar2 = q.this;
            qVar2.f1383c.setHideOnContentScrollEnabled(qVar2.f1402v);
            q.this.f1389i = null;
        }

        @Override // f.a
        public View d() {
            WeakReference<View> weakReference = this.f1412g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // f.a
        public Menu e() {
            return this.f1410e;
        }

        @Override // f.a
        public MenuInflater f() {
            return new f.g(this.f1409d);
        }

        @Override // f.a
        public CharSequence g() {
            return q.this.f1386f.getSubtitle();
        }

        @Override // f.a
        public CharSequence h() {
            return q.this.f1386f.getTitle();
        }

        @Override // f.a
        public void i() {
            if (q.this.f1389i != this) {
                return;
            }
            this.f1410e.y();
            try {
                this.f1411f.d(this, this.f1410e);
            } finally {
                this.f1410e.x();
            }
        }

        @Override // f.a
        public boolean j() {
            return q.this.f1386f.f266s;
        }

        @Override // f.a
        public void k(View view) {
            q.this.f1386f.setCustomView(view);
            this.f1412g = new WeakReference<>(view);
        }

        @Override // f.a
        public void l(int i2) {
            q.this.f1386f.setSubtitle(q.this.f1381a.getResources().getString(i2));
        }

        @Override // f.a
        public void m(CharSequence charSequence) {
            q.this.f1386f.setSubtitle(charSequence);
        }

        @Override // f.a
        public void n(int i2) {
            q.this.f1386f.setTitle(q.this.f1381a.getResources().getString(i2));
        }

        @Override // f.a
        public void o(CharSequence charSequence) {
            q.this.f1386f.setTitle(charSequence);
        }

        @Override // f.a
        public void p(boolean z2) {
            this.f1663c = z2;
            q.this.f1386f.setTitleOptional(z2);
        }
    }

    public q(Activity activity, boolean z2) {
        new ArrayList();
        this.f1393m = new ArrayList<>();
        this.f1395o = 0;
        this.f1396p = true;
        this.f1399s = true;
        this.f1403w = new a();
        this.f1404x = new b();
        this.f1405y = new c();
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (z2) {
            return;
        }
        this.f1387g = decorView.findViewById(16908290);
    }

    public q(Dialog dialog) {
        new ArrayList();
        this.f1393m = new ArrayList<>();
        this.f1395o = 0;
        this.f1396p = true;
        this.f1399s = true;
        this.f1403w = new a();
        this.f1404x = new b();
        this.f1405y = new c();
        e(dialog.getWindow().getDecorView());
    }

    @Override // c.a
    public void a(boolean z2) {
        if (z2 == this.f1392l) {
            return;
        }
        this.f1392l = z2;
        int size = this.f1393m.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1393m.get(i2).a(z2);
        }
    }

    @Override // c.a
    public Context b() {
        if (this.f1382b == null) {
            TypedValue typedValue = new TypedValue();
            this.f1381a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1382b = new ContextThemeWrapper(this.f1381a, i2);
            } else {
                this.f1382b = this.f1381a;
            }
        }
        return this.f1382b;
    }

    @Override // c.a
    public void c(boolean z2) {
        if (this.f1388h) {
            return;
        }
        int i2 = z2 ? 4 : 0;
        int j2 = this.f1385e.j();
        this.f1388h = true;
        this.f1385e.u((i2 & 4) | (j2 & (-5)));
    }

    public void d(boolean z2) {
        e0.o i2;
        e0.o e2;
        if (z2) {
            if (!this.f1398r) {
                this.f1398r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1383c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f1398r) {
            this.f1398r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1383c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f1384d;
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                this.f1385e.k(4);
                this.f1386f.setVisibility(0);
                return;
            }
            this.f1385e.k(0);
            this.f1386f.setVisibility(8);
            return;
        }
        if (z2) {
            e2 = this.f1385e.i(4, 100L);
            i2 = this.f1386f.e(0, 200L);
        } else {
            i2 = this.f1385e.i(0, 200L);
            e2 = this.f1386f.e(8, 100L);
        }
        f.h hVar = new f.h();
        hVar.f1716a.add(e2);
        View view = e2.f1642a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = i2.f1642a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        hVar.f1716a.add(i2);
        hVar.b();
    }

    public final void e(View view) {
        c0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f1383c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof c0) {
            wrapper = (c0) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder a2 = f.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        } else {
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f1385e = wrapper;
        this.f1386f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f1384d = actionBarContainer;
        c0 c0Var = this.f1385e;
        if (c0Var == null || this.f1386f == null || actionBarContainer == null) {
            throw new IllegalStateException(q.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1381a = c0Var.t();
        boolean z2 = (this.f1385e.j() & 4) != 0;
        if (z2) {
            this.f1388h = true;
        }
        Context context = this.f1381a;
        this.f1385e.q((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f1381a.obtainStyledAttributes(null, b.b.f1219a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f1383c;
            if (!actionBarOverlayLayout2.f276i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f1402v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f1384d;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void f(boolean z2) {
        this.f1394n = z2;
        if (z2) {
            this.f1384d.setTabContainer(null);
            this.f1385e.o(null);
        } else {
            this.f1385e.o(null);
            this.f1384d.setTabContainer(null);
        }
        boolean z3 = true;
        boolean z4 = this.f1385e.v() == 2;
        this.f1385e.s(!this.f1394n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1383c;
        if (this.f1394n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void g(boolean z2) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.f1398r || !this.f1397q)) {
            if (this.f1399s) {
                this.f1399s = false;
                f.h hVar = this.f1400t;
                if (hVar != null) {
                    hVar.a();
                }
                if (this.f1395o != 0 || (!this.f1401u && !z2)) {
                    this.f1403w.a(null);
                    return;
                }
                this.f1384d.setAlpha(1.0f);
                this.f1384d.setTransitioning(true);
                f.h hVar2 = new f.h();
                float f2 = -this.f1384d.getHeight();
                if (z2) {
                    this.f1384d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                e0.o a2 = e0.m.a(this.f1384d);
                a2.g(f2);
                a2.f(this.f1405y);
                if (!hVar2.f1720e) {
                    hVar2.f1716a.add(a2);
                }
                if (this.f1396p && (view = this.f1387g) != null) {
                    e0.o a3 = e0.m.a(view);
                    a3.g(f2);
                    if (!hVar2.f1720e) {
                        hVar2.f1716a.add(a3);
                    }
                }
                Interpolator interpolator = f1380z;
                boolean z3 = hVar2.f1720e;
                if (!z3) {
                    hVar2.f1718c = interpolator;
                }
                if (!z3) {
                    hVar2.f1717b = 250L;
                }
                e0.p pVar = this.f1403w;
                if (!z3) {
                    hVar2.f1719d = pVar;
                }
                this.f1400t = hVar2;
                hVar2.b();
            }
        } else if (this.f1399s) {
        } else {
            this.f1399s = true;
            f.h hVar3 = this.f1400t;
            if (hVar3 != null) {
                hVar3.a();
            }
            this.f1384d.setVisibility(0);
            if (this.f1395o == 0 && (this.f1401u || z2)) {
                this.f1384d.setTranslationY(0.0f);
                float f3 = -this.f1384d.getHeight();
                if (z2) {
                    this.f1384d.getLocationInWindow(new int[]{0, 0});
                    f3 -= iArr2[1];
                }
                this.f1384d.setTranslationY(f3);
                f.h hVar4 = new f.h();
                e0.o a4 = e0.m.a(this.f1384d);
                a4.g(0.0f);
                a4.f(this.f1405y);
                if (!hVar4.f1720e) {
                    hVar4.f1716a.add(a4);
                }
                if (this.f1396p && (view3 = this.f1387g) != null) {
                    view3.setTranslationY(f3);
                    e0.o a5 = e0.m.a(this.f1387g);
                    a5.g(0.0f);
                    if (!hVar4.f1720e) {
                        hVar4.f1716a.add(a5);
                    }
                }
                Interpolator interpolator2 = A;
                boolean z4 = hVar4.f1720e;
                if (!z4) {
                    hVar4.f1718c = interpolator2;
                }
                if (!z4) {
                    hVar4.f1717b = 250L;
                }
                e0.p pVar2 = this.f1404x;
                if (!z4) {
                    hVar4.f1719d = pVar2;
                }
                this.f1400t = hVar4;
                hVar4.b();
            } else {
                this.f1384d.setAlpha(1.0f);
                this.f1384d.setTranslationY(0.0f);
                if (this.f1396p && (view2 = this.f1387g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.f1404x.a(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1383c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }
}