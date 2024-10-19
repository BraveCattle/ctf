package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.x64m.xsfmnative.R;
import h.g0;
import h.m;
import h.w0;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a {

    /* renamed from: j  reason: collision with root package name */
    public d f415j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f416k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f417l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f418m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f419n;

    /* renamed from: o  reason: collision with root package name */
    public int f420o;

    /* renamed from: p  reason: collision with root package name */
    public int f421p;

    /* renamed from: q  reason: collision with root package name */
    public int f422q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f423r;

    /* renamed from: s  reason: collision with root package name */
    public final SparseBooleanArray f424s;

    /* renamed from: t  reason: collision with root package name */
    public e f425t;

    /* renamed from: u  reason: collision with root package name */
    public C0001a f426u;

    /* renamed from: v  reason: collision with root package name */
    public c f427v;

    /* renamed from: w  reason: collision with root package name */
    public b f428w;

    /* renamed from: x  reason: collision with root package name */
    public final f f429x;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0001a extends h {
        public C0001a(Context context, l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.A.g()) {
                View view2 = a.this.f415j;
                this.f216f = view2 == null ? (View) a.this.f107i : view2;
            }
            d(a.this.f429x);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            a aVar = a.this;
            aVar.f426u = null;
            Objects.requireNonNull(aVar);
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public e f432b;

        public c(e eVar) {
            this.f432b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = a.this.f102d;
            if (eVar != null && (aVar = eVar.f161e) != null) {
                aVar.a(eVar);
            }
            View view = (View) a.this.f107i;
            if (view != null && view.getWindowToken() != null && this.f432b.f()) {
                a.this.f425t = this.f432b;
            }
            a.this.f427v = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends m implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0002a extends g0 {
            public C0002a(View view, a aVar) {
                super(view);
            }

            @Override // h.g0
            public g.f b() {
                e eVar = a.this.f425t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // h.g0
            public boolean c() {
                a.this.n();
                return true;
            }

            @Override // h.g0
            public boolean d() {
                a aVar = a.this;
                if (aVar.f427v != null) {
                    return false;
                }
                aVar.i();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            w0.a(this, getContentDescription());
            setOnTouchListener(new C0002a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.n();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z2) {
            super(context, eVar, view, z2, R.attr.actionOverflowMenuStyle, 0);
            this.f217g = 8388613;
            d(a.this.f429x);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            androidx.appcompat.view.menu.e eVar = a.this.f102d;
            if (eVar != null) {
                eVar.c(true);
            }
            a.this.f425t = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            if (eVar instanceof l) {
                eVar.k().c(false);
            }
            i.a aVar = a.this.f104f;
            if (aVar != null) {
                aVar.b(eVar, z2);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f102d) {
                return false;
            }
            Objects.requireNonNull(((l) eVar).A);
            i.a aVar = a.this.f104f;
            if (aVar != null) {
                return aVar.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.f424s = new SparseBooleanArray();
        this.f429x = new f();
    }

    public boolean a() {
        return i() | l();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        a();
        i.a aVar = this.f104f;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    public View e(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.f()) {
            j.a aVar = view instanceof j.a ? (j.a) view : (j.a) this.f103e.inflate(this.f106h, viewGroup, false);
            aVar.d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f107i);
            if (this.f428w == null) {
                this.f428w = new b();
            }
            actionMenuItemView.setPopupCallback(this.f428w);
            actionView = (View) aVar;
        }
        actionView.setVisibility(gVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(l lVar) {
        boolean z2 = false;
        if (lVar.hasVisibleItems()) {
            l lVar2 = lVar;
            while (true) {
                androidx.appcompat.view.menu.e eVar = lVar2.f246z;
                if (eVar == this.f102d) {
                    break;
                }
                lVar2 = (l) eVar;
            }
            g gVar = lVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f107i;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == gVar) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
            }
            if (view == null) {
                return false;
            }
            Objects.requireNonNull(lVar.A);
            int size = lVar.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem item = lVar.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            C0001a c0001a = new C0001a(this.f101c, lVar, view);
            this.f426u = c0001a;
            c0001a.f218h = z2;
            g.d dVar = c0001a.f220j;
            if (dVar != null) {
                dVar.o(z2);
            }
            if (this.f426u.f()) {
                i.a aVar = this.f104f;
                if (aVar != null) {
                    aVar.c(lVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        int i2;
        ArrayList<g> arrayList;
        int i3;
        boolean z2;
        androidx.appcompat.view.menu.e eVar = this.f102d;
        if (eVar != null) {
            arrayList = eVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i4 = this.f422q;
        int i5 = this.f421p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f107i;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            g gVar = arrayList.get(i6);
            int i9 = gVar.f208y;
            if ((i9 & 2) == 2) {
                i8++;
            } else if ((i9 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f423r && gVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f418m && (z3 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.f424s;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            g gVar2 = arrayList.get(i11);
            int i13 = gVar2.f208y;
            if ((i13 & 2) == i3 ? z2 : false) {
                View e2 = e(gVar2, null, viewGroup);
                e2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = e2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = gVar2.f185b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                gVar2.k(z2);
            } else if ((i13 & 1) == z2 ? z2 : false) {
                int i15 = gVar2.f185b;
                boolean z4 = sparseBooleanArray.get(i15);
                boolean z5 = ((i10 > 0 || z4) && i5 > 0) ? z2 : false;
                if (z5) {
                    View e3 = e(gVar2, null, viewGroup);
                    e3.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = e3.getMeasuredWidth();
                    i5 -= measuredWidth2;
                    if (i12 == 0) {
                        i12 = measuredWidth2;
                    }
                    z5 &= i5 + i12 > 0;
                }
                if (z5 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z4) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i11; i16++) {
                        g gVar3 = arrayList.get(i16);
                        if (gVar3.f185b == i15) {
                            if (gVar3.g()) {
                                i10++;
                            }
                            gVar3.k(false);
                        }
                    }
                }
                if (z5) {
                    i10--;
                }
                gVar2.k(z5);
            } else {
                gVar2.k(false);
                i11++;
                i3 = 2;
                z2 = true;
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return z2;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(boolean z2) {
        int i2;
        boolean z3;
        ViewGroup viewGroup = (ViewGroup) this.f107i;
        ArrayList<g> arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.e eVar = this.f102d;
            if (eVar != null) {
                eVar.i();
                ArrayList<g> l2 = this.f102d.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    g gVar = l2.get(i3);
                    if (gVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View e2 = e(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            e2.setPressed(false);
                            e2.jumpDrawablesToCurrentState();
                        }
                        if (e2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) e2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(e2);
                            }
                            ((ViewGroup) this.f107i).addView(e2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f415j) {
                    z3 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z3 = true;
                }
                if (!z3) {
                    i2++;
                }
            }
        }
        ((View) this.f107i).requestLayout();
        androidx.appcompat.view.menu.e eVar2 = this.f102d;
        if (eVar2 != null) {
            eVar2.i();
            ArrayList<g> arrayList2 = eVar2.f165i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                e0.b bVar = arrayList2.get(i4).A;
            }
        }
        androidx.appcompat.view.menu.e eVar3 = this.f102d;
        if (eVar3 != null) {
            eVar3.i();
            arrayList = eVar3.f166j;
        }
        if (this.f418m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        d dVar = this.f415j;
        if (z4) {
            if (dVar == null) {
                this.f415j = new d(this.f100b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f415j.getParent();
            if (viewGroup3 != this.f107i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f415j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f107i;
                d dVar2 = this.f415j;
                ActionMenuView.c h2 = actionMenuView.h();
                h2.f307c = true;
                actionMenuView.addView(dVar2, h2);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            j jVar = this.f107i;
            if (parent == jVar) {
                ((ViewGroup) jVar).removeView(this.f415j);
            }
        }
        ((ActionMenuView) this.f107i).setOverflowReserved(this.f418m);
    }

    public boolean i() {
        j jVar;
        c cVar = this.f427v;
        if (cVar != null && (jVar = this.f107i) != null) {
            ((View) jVar).removeCallbacks(cVar);
            this.f427v = null;
            return true;
        }
        e eVar = this.f425t;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f220j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f101c = context;
        LayoutInflater.from(context);
        this.f102d = eVar;
        Resources resources = context.getResources();
        if (!this.f419n) {
            this.f418m = true;
        }
        int i2 = 2;
        this.f420o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f422q = i2;
        int i5 = this.f420o;
        if (this.f418m) {
            if (this.f415j == null) {
                d dVar = new d(this.f100b);
                this.f415j = dVar;
                if (this.f417l) {
                    dVar.setImageDrawable(this.f416k);
                    this.f416k = null;
                    this.f417l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f415j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f415j.getMeasuredWidth();
        } else {
            this.f415j = null;
        }
        this.f421p = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    public boolean l() {
        C0001a c0001a = this.f426u;
        if (c0001a != null) {
            if (c0001a.b()) {
                c0001a.f220j.dismiss();
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean m() {
        e eVar = this.f425t;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f418m || m() || (eVar = this.f102d) == null || this.f107i == null || this.f427v != null) {
            return false;
        }
        eVar.i();
        if (eVar.f166j.isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f101c, this.f102d, this.f415j, true));
        this.f427v = cVar;
        ((View) this.f107i).post(cVar);
        return true;
    }
}