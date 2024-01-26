package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import e0.q;
import h.c0;
import h.u0;
import h.v0;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f459a;

    /* renamed from: b  reason: collision with root package name */
    public int f460b;

    /* renamed from: c  reason: collision with root package name */
    public View f461c;

    /* renamed from: d  reason: collision with root package name */
    public View f462d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f463e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f464f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f465g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f466h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f467i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f468j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f469k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f470l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f471m;

    /* renamed from: n  reason: collision with root package name */
    public androidx.appcompat.widget.a f472n;

    /* renamed from: o  reason: collision with root package name */
    public int f473o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f474p;

    /* loaded from: classes.dex */
    public class a extends q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f475a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f476b;

        public a(int i2) {
            this.f476b = i2;
        }

        @Override // e0.p
        public void a(View view) {
            if (this.f475a) {
                return;
            }
            d.this.f459a.setVisibility(this.f476b);
        }

        @Override // e0.q, e0.p
        public void b(View view) {
            d.this.f459a.setVisibility(0);
        }

        @Override // e0.q, e0.p
        public void c(View view) {
            this.f475a = true;
        }
    }

    public d(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f473o = 0;
        this.f459a = toolbar;
        this.f467i = toolbar.getTitle();
        this.f468j = toolbar.getSubtitle();
        this.f466h = this.f467i != null;
        this.f465g = toolbar.getNavigationIcon();
        u0 o2 = u0.o(toolbar.getContext(), null, b.b.f1219a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.f474p = o2.e(15);
        if (z2) {
            CharSequence l2 = o2.l(27);
            if (!TextUtils.isEmpty(l2)) {
                this.f466h = true;
                this.f467i = l2;
                if ((this.f460b & 8) != 0) {
                    this.f459a.setTitle(l2);
                }
            }
            CharSequence l3 = o2.l(25);
            if (!TextUtils.isEmpty(l3)) {
                this.f468j = l3;
                if ((this.f460b & 8) != 0) {
                    this.f459a.setSubtitle(l3);
                }
            }
            Drawable e2 = o2.e(20);
            if (e2 != null) {
                this.f464f = e2;
                y();
            }
            Drawable e3 = o2.e(17);
            if (e3 != null) {
                this.f463e = e3;
                y();
            }
            if (this.f465g == null && (drawable = this.f474p) != null) {
                this.f465g = drawable;
                x();
            }
            u(o2.h(10, 0));
            int j2 = o2.j(9, 0);
            if (j2 != 0) {
                View inflate = LayoutInflater.from(this.f459a.getContext()).inflate(j2, (ViewGroup) this.f459a, false);
                View view = this.f462d;
                if (view != null && (this.f460b & 16) != 0) {
                    this.f459a.removeView(view);
                }
                this.f462d = inflate;
                if (inflate != null && (this.f460b & 16) != 0) {
                    this.f459a.addView(inflate);
                }
                u(this.f460b | 16);
            }
            int i3 = o2.i(13, 0);
            if (i3 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f459a.getLayoutParams();
                layoutParams.height = i3;
                this.f459a.setLayoutParams(layoutParams);
            }
            int c2 = o2.c(7, -1);
            int c3 = o2.c(3, -1);
            if (c2 >= 0 || c3 >= 0) {
                Toolbar toolbar2 = this.f459a;
                int max = Math.max(c2, 0);
                int max2 = Math.max(c3, 0);
                toolbar2.d();
                toolbar2.f395u.a(max, max2);
            }
            int j3 = o2.j(28, 0);
            if (j3 != 0) {
                Toolbar toolbar3 = this.f459a;
                Context context = toolbar3.getContext();
                toolbar3.f387m = j3;
                TextView textView = toolbar3.f377c;
                if (textView != null) {
                    textView.setTextAppearance(context, j3);
                }
            }
            int j4 = o2.j(26, 0);
            if (j4 != 0) {
                Toolbar toolbar4 = this.f459a;
                Context context2 = toolbar4.getContext();
                toolbar4.f388n = j4;
                TextView textView2 = toolbar4.f378d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, j4);
                }
            }
            int j5 = o2.j(22, 0);
            if (j5 != 0) {
                this.f459a.setPopupTheme(j5);
            }
        } else {
            if (this.f459a.getNavigationIcon() != null) {
                this.f474p = this.f459a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f460b = i2;
        }
        o2.f2006b.recycle();
        if (R.string.abc_action_bar_up_description != this.f473o) {
            this.f473o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f459a.getNavigationContentDescription())) {
                int i4 = this.f473o;
                this.f469k = i4 != 0 ? t().getString(i4) : null;
                w();
            }
        }
        this.f469k = this.f459a.getNavigationContentDescription();
        this.f459a.setNavigationOnClickListener(new v0(this));
    }

    @Override // h.c0
    public boolean a() {
        return this.f459a.u();
    }

    @Override // h.c0
    public void b(Menu menu, i.a aVar) {
        g gVar;
        if (this.f472n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f459a.getContext());
            this.f472n = aVar2;
            Objects.requireNonNull(aVar2);
        }
        androidx.appcompat.widget.a aVar3 = this.f472n;
        aVar3.f104f = aVar;
        Toolbar toolbar = this.f459a;
        e eVar = (e) menu;
        if (eVar == null && toolbar.f376b == null) {
            return;
        }
        toolbar.f();
        e eVar2 = toolbar.f376b.f297q;
        if (eVar2 == eVar) {
            return;
        }
        if (eVar2 != null) {
            eVar2.t(toolbar.K);
            eVar2.t(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new Toolbar.d();
        }
        aVar3.f423r = true;
        if (eVar != null) {
            eVar.b(aVar3, toolbar.f385k);
            eVar.b(toolbar.L, toolbar.f385k);
        } else {
            aVar3.j(toolbar.f385k, null);
            Toolbar.d dVar = toolbar.L;
            e eVar3 = dVar.f404b;
            if (eVar3 != null && (gVar = dVar.f405c) != null) {
                eVar3.d(gVar);
            }
            dVar.f404b = null;
            aVar3.h(true);
            toolbar.L.h(true);
        }
        toolbar.f376b.setPopupTheme(toolbar.f386l);
        toolbar.f376b.setPresenter(aVar3);
        toolbar.K = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // h.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f459a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f376b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            androidx.appcompat.widget.a r0 = r0.f301u
            if (r0 == 0) goto L1e
            androidx.appcompat.widget.a$c r3 = r0.f427v
            if (r3 != 0) goto L19
            boolean r0 = r0.m()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = r2
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L22
            goto L23
        L22:
            r1 = r2
        L23:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.c():boolean");
    }

    @Override // h.c0
    public void collapseActionView() {
        Toolbar.d dVar = this.f459a.L;
        g gVar = dVar == null ? null : dVar.f405c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    @Override // h.c0
    public void d() {
        this.f471m = true;
    }

    @Override // h.c0
    public boolean e() {
        return this.f459a.o();
    }

    @Override // h.c0
    public boolean f() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f459a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f376b) != null && actionMenuView.f300t;
    }

    @Override // h.c0
    public boolean g() {
        ActionMenuView actionMenuView = this.f459a.f376b;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.f301u;
            if (aVar != null && aVar.i()) {
                return true;
            }
        }
        return false;
    }

    @Override // h.c0
    public CharSequence getTitle() {
        return this.f459a.getTitle();
    }

    @Override // h.c0
    public void h() {
        androidx.appcompat.widget.a aVar;
        ActionMenuView actionMenuView = this.f459a.f376b;
        if (actionMenuView == null || (aVar = actionMenuView.f301u) == null) {
            return;
        }
        aVar.a();
    }

    @Override // h.c0
    public o i(int i2, long j2) {
        o a2 = m.a(this.f459a);
        a2.a(i2 == 0 ? 1.0f : 0.0f);
        a2.c(j2);
        a aVar = new a(i2);
        View view = a2.f1642a.get();
        if (view != null) {
            a2.e(view, aVar);
        }
        return a2;
    }

    @Override // h.c0
    public int j() {
        return this.f460b;
    }

    @Override // h.c0
    public void k(int i2) {
        this.f459a.setVisibility(i2);
    }

    @Override // h.c0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // h.c0
    public boolean m() {
        Toolbar.d dVar = this.f459a.L;
        return (dVar == null || dVar.f405c == null) ? false : true;
    }

    @Override // h.c0
    public void n(int i2) {
        this.f464f = i2 != 0 ? d.a.a(t(), i2) : null;
        y();
    }

    @Override // h.c0
    public void o(c cVar) {
        View view = this.f461c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f459a;
            if (parent == toolbar) {
                toolbar.removeView(this.f461c);
            }
        }
        this.f461c = null;
    }

    @Override // h.c0
    public ViewGroup p() {
        return this.f459a;
    }

    @Override // h.c0
    public void q(boolean z2) {
    }

    @Override // h.c0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // h.c0
    public void s(boolean z2) {
        this.f459a.setCollapsible(z2);
    }

    @Override // h.c0
    public void setIcon(int i2) {
        this.f463e = i2 != 0 ? d.a.a(t(), i2) : null;
        y();
    }

    @Override // h.c0
    public void setIcon(Drawable drawable) {
        this.f463e = drawable;
        y();
    }

    @Override // h.c0
    public void setWindowCallback(Window.Callback callback) {
        this.f470l = callback;
    }

    @Override // h.c0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f466h) {
            return;
        }
        this.f467i = charSequence;
        if ((this.f460b & 8) != 0) {
            this.f459a.setTitle(charSequence);
        }
    }

    @Override // h.c0
    public Context t() {
        return this.f459a.getContext();
    }

    @Override // h.c0
    public void u(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f460b ^ i2;
        this.f460b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i3 & 3) != 0) {
                y();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f459a.setTitle(this.f467i);
                    toolbar = this.f459a;
                    charSequence = this.f468j;
                } else {
                    charSequence = null;
                    this.f459a.setTitle((CharSequence) null);
                    toolbar = this.f459a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) == 0 || (view = this.f462d) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                this.f459a.addView(view);
            } else {
                this.f459a.removeView(view);
            }
        }
    }

    @Override // h.c0
    public int v() {
        return 0;
    }

    public final void w() {
        if ((this.f460b & 4) != 0) {
            if (TextUtils.isEmpty(this.f469k)) {
                this.f459a.setNavigationContentDescription(this.f473o);
            } else {
                this.f459a.setNavigationContentDescription(this.f469k);
            }
        }
    }

    public final void x() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f460b & 4) != 0) {
            toolbar = this.f459a;
            drawable = this.f465g;
            if (drawable == null) {
                drawable = this.f474p;
            }
        } else {
            toolbar = this.f459a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i2 = this.f460b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f464f) == null) {
            drawable = this.f463e;
        }
        this.f459a.setLogo(drawable);
    }
}