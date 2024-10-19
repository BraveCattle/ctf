package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import com.x64m.xsfmnative.R;
import h.e0;
import h.k0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class k extends g.d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c  reason: collision with root package name */
    public final Context f224c;

    /* renamed from: d  reason: collision with root package name */
    public final e f225d;

    /* renamed from: e  reason: collision with root package name */
    public final d f226e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f227f;

    /* renamed from: g  reason: collision with root package name */
    public final int f228g;

    /* renamed from: h  reason: collision with root package name */
    public final int f229h;

    /* renamed from: i  reason: collision with root package name */
    public final int f230i;

    /* renamed from: j  reason: collision with root package name */
    public final k0 f231j;

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f234m;

    /* renamed from: n  reason: collision with root package name */
    public View f235n;

    /* renamed from: o  reason: collision with root package name */
    public View f236o;

    /* renamed from: p  reason: collision with root package name */
    public i.a f237p;

    /* renamed from: q  reason: collision with root package name */
    public ViewTreeObserver f238q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f239r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f240s;

    /* renamed from: t  reason: collision with root package name */
    public int f241t;

    /* renamed from: v  reason: collision with root package name */
    public boolean f243v;

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f232k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f233l = new b();

    /* renamed from: u  reason: collision with root package name */
    public int f242u = 0;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (k.this.a()) {
                k kVar = k.this;
                if (kVar.f231j.f1917y) {
                    return;
                }
                View view = kVar.f236o;
                if (view == null || !view.isShown()) {
                    k.this.dismiss();
                } else {
                    k.this.f231j.i();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f238q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f238q = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f238q.removeGlobalOnLayoutListener(kVar.f232k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i2, int i3, boolean z2) {
        this.f224c = context;
        this.f225d = eVar;
        this.f227f = z2;
        this.f226e = new d(eVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f229h = i2;
        this.f230i = i3;
        Resources resources = context.getResources();
        this.f228g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f235n = view;
        this.f231j = new k0(context, null, i2, i3);
        eVar.b(this, context);
    }

    @Override // g.f
    public boolean a() {
        return !this.f239r && this.f231j.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z2) {
        if (eVar != this.f225d) {
            return;
        }
        dismiss();
        i.a aVar = this.f237p;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f237p = aVar;
    }

    @Override // g.f
    public void dismiss() {
        if (a()) {
            this.f231j.dismiss();
        }
    }

    @Override // g.f
    public ListView e() {
        return this.f231j.f1896d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(androidx.appcompat.view.menu.l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L78
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f224c
            android.view.View r5 = r9.f236o
            boolean r6 = r9.f227f
            int r7 = r9.f229h
            int r8 = r9.f230i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f237p
            r0.d(r2)
            boolean r2 = g.d.u(r10)
            r0.f218h = r2
            g.d r3 = r0.f220j
            if (r3 == 0) goto L2a
            r3.o(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f234m
            r0.f221k = r2
            r2 = 0
            r9.f234m = r2
            androidx.appcompat.view.menu.e r2 = r9.f225d
            r2.c(r1)
            h.k0 r2 = r9.f231j
            int r3 = r2.f1899g
            boolean r4 = r2.f1902j
            if (r4 != 0) goto L40
            r2 = r1
            goto L42
        L40:
            int r2 = r2.f1900h
        L42:
            int r4 = r9.f242u
            android.view.View r5 = r9.f235n
            java.util.WeakHashMap<android.view.View, e0.o> r6 = e0.m.f1633a
            int r5 = r5.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5c
            android.view.View r4 = r9.f235n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L64
            goto L6d
        L64:
            android.view.View r4 = r0.f216f
            if (r4 != 0) goto L6a
            r0 = r1
            goto L6e
        L6a:
            r0.e(r3, r2, r5, r5)
        L6d:
            r0 = r5
        L6e:
            if (r0 == 0) goto L78
            androidx.appcompat.view.menu.i$a r0 = r9.f237p
            if (r0 == 0) goto L77
            r0.c(r10)
        L77:
            return r5
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.f(androidx.appcompat.view.menu.l):boolean");
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(boolean z2) {
        this.f240s = false;
        d dVar = this.f226e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // g.f
    public void i() {
        View view;
        boolean z2 = true;
        if (!a()) {
            if (this.f239r || (view = this.f235n) == null) {
                z2 = false;
            } else {
                this.f236o = view;
                this.f231j.f1918z.setOnDismissListener(this);
                k0 k0Var = this.f231j;
                k0Var.f1909q = this;
                k0Var.s(true);
                View view2 = this.f236o;
                boolean z3 = this.f238q == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f238q = viewTreeObserver;
                if (z3) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f232k);
                }
                view2.addOnAttachStateChangeListener(this.f233l);
                k0 k0Var2 = this.f231j;
                k0Var2.f1908p = view2;
                k0Var2.f1905m = this.f242u;
                if (!this.f240s) {
                    this.f241t = g.d.m(this.f226e, null, this.f224c, this.f228g);
                    this.f240s = true;
                }
                this.f231j.r(this.f241t);
                this.f231j.f1918z.setInputMethodMode(2);
                k0 k0Var3 = this.f231j;
                Rect rect = this.f1772b;
                Objects.requireNonNull(k0Var3);
                k0Var3.f1916x = rect != null ? new Rect(rect) : null;
                this.f231j.i();
                e0 e0Var = this.f231j.f1896d;
                e0Var.setOnKeyListener(this);
                if (this.f243v && this.f225d.f169m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f224c).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) e0Var, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f225d.f169m);
                    }
                    frameLayout.setEnabled(false);
                    e0Var.addHeaderView(frameLayout, null, false);
                }
                this.f231j.o(this.f226e);
                this.f231j.i();
            }
        }
        if (!z2) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // g.d
    public void l(e eVar) {
    }

    @Override // g.d
    public void n(View view) {
        this.f235n = view;
    }

    @Override // g.d
    public void o(boolean z2) {
        this.f226e.f152d = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f239r = true;
        this.f225d.c(true);
        ViewTreeObserver viewTreeObserver = this.f238q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f238q = this.f236o.getViewTreeObserver();
            }
            this.f238q.removeGlobalOnLayoutListener(this.f232k);
            this.f238q = null;
        }
        this.f236o.removeOnAttachStateChangeListener(this.f233l);
        PopupWindow.OnDismissListener onDismissListener = this.f234m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f242u = i2;
    }

    @Override // g.d
    public void q(int i2) {
        this.f231j.f1899g = i2;
    }

    @Override // g.d
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f234m = onDismissListener;
    }

    @Override // g.d
    public void s(boolean z2) {
        this.f243v = z2;
    }

    @Override // g.d
    public void t(int i2) {
        k0 k0Var = this.f231j;
        k0Var.f1900h = i2;
        k0Var.f1902j = true;
    }
}