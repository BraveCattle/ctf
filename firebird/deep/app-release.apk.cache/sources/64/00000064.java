package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import c.a;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import h.c0;
import h.k;
import h.n0;
import h.u0;
import h.y;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public androidx.appcompat.widget.d J;
    public androidx.appcompat.widget.a K;
    public d L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f376b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f377c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f378d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f379e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f380f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f381g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f382h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f383i;

    /* renamed from: j  reason: collision with root package name */
    public View f384j;

    /* renamed from: k  reason: collision with root package name */
    public Context f385k;

    /* renamed from: l  reason: collision with root package name */
    public int f386l;

    /* renamed from: m  reason: collision with root package name */
    public int f387m;

    /* renamed from: n  reason: collision with root package name */
    public int f388n;

    /* renamed from: o  reason: collision with root package name */
    public int f389o;

    /* renamed from: p  reason: collision with root package name */
    public int f390p;

    /* renamed from: q  reason: collision with root package name */
    public int f391q;

    /* renamed from: r  reason: collision with root package name */
    public int f392r;

    /* renamed from: s  reason: collision with root package name */
    public int f393s;

    /* renamed from: t  reason: collision with root package name */
    public int f394t;

    /* renamed from: u  reason: collision with root package name */
    public n0 f395u;

    /* renamed from: v  reason: collision with root package name */
    public int f396v;

    /* renamed from: w  reason: collision with root package name */
    public int f397w;

    /* renamed from: x  reason: collision with root package name */
    public int f398x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f399y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f400z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.u();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f405c;
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements i {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f404b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f405c;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f383i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f383i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f383i);
            }
            Toolbar.this.f384j = gVar.getActionView();
            this.f405c = gVar;
            ViewParent parent2 = Toolbar.this.f384j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f384j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f1287a = 8388611 | (toolbar4.f389o & 112);
                generateDefaultLayoutParams.f407b = 2;
                toolbar4.f384j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f384j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f407b != 2 && childAt != toolbar6.f376b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f197n.p(false);
            View view = Toolbar.this.f384j;
            if (view instanceof f.b) {
                ((f.b) view).a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean f(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void h(boolean z2) {
            if (this.f405c != null) {
                androidx.appcompat.view.menu.e eVar = this.f404b;
                boolean z3 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f404b.getItem(i2) == this.f405c) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z3) {
                    return;
                }
                k(this.f404b, this.f405c);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f404b;
            if (eVar2 != null && (gVar = this.f405c) != null) {
                eVar2.d(gVar);
            }
            this.f404b = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f384j;
            if (view instanceof f.b) {
                ((f.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f384j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f383i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f384j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.F.clear();
                    this.f405c = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.f197n.p(false);
                    return true;
                }
                toolbar3.addView(toolbar3.F.get(size));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0013a {

        /* renamed from: b  reason: collision with root package name */
        public int f407b;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f407b = 0;
            this.f1287a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f407b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f407b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f407b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0013a) eVar);
            this.f407b = 0;
            this.f407b = eVar.f407b;
        }

        public e(a.C0013a c0013a) {
            super(c0013a);
            this.f407b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends i0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f408c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f409d;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new g[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f408c = parcel.readInt();
            this.f409d = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            parcel.writeInt(this.f408c);
            parcel.writeInt(this.f409d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f398x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.N = new b();
        Context context2 = getContext();
        int[] iArr = b.b.f1242x;
        u0 o2 = u0.o(context2, attributeSet, iArr, R.attr.toolbarStyle, 0);
        m.e(this, context, iArr, attributeSet, o2.f2006b, R.attr.toolbarStyle, 0);
        this.f387m = o2.j(28, 0);
        this.f388n = o2.j(19, 0);
        this.f398x = o2.f2006b.getInteger(0, this.f398x);
        this.f389o = o2.f2006b.getInteger(2, 48);
        int c2 = o2.c(22, 0);
        c2 = o2.m(27) ? o2.c(27, c2) : c2;
        this.f394t = c2;
        this.f393s = c2;
        this.f392r = c2;
        this.f391q = c2;
        int c3 = o2.c(25, -1);
        if (c3 >= 0) {
            this.f391q = c3;
        }
        int c4 = o2.c(24, -1);
        if (c4 >= 0) {
            this.f392r = c4;
        }
        int c5 = o2.c(26, -1);
        if (c5 >= 0) {
            this.f393s = c5;
        }
        int c6 = o2.c(23, -1);
        if (c6 >= 0) {
            this.f394t = c6;
        }
        this.f390p = o2.d(13, -1);
        int c7 = o2.c(9, Integer.MIN_VALUE);
        int c8 = o2.c(5, Integer.MIN_VALUE);
        int d2 = o2.d(7, 0);
        int d3 = o2.d(8, 0);
        d();
        n0 n0Var = this.f395u;
        n0Var.f1957h = false;
        if (d2 != Integer.MIN_VALUE) {
            n0Var.f1954e = d2;
            n0Var.f1950a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            n0Var.f1955f = d3;
            n0Var.f1951b = d3;
        }
        if (c7 != Integer.MIN_VALUE || c8 != Integer.MIN_VALUE) {
            n0Var.a(c7, c8);
        }
        this.f396v = o2.c(10, Integer.MIN_VALUE);
        this.f397w = o2.c(6, Integer.MIN_VALUE);
        this.f381g = o2.e(4);
        this.f382h = o2.l(3);
        CharSequence l2 = o2.l(21);
        if (!TextUtils.isEmpty(l2)) {
            setTitle(l2);
        }
        CharSequence l3 = o2.l(18);
        if (!TextUtils.isEmpty(l3)) {
            setSubtitle(l3);
        }
        this.f385k = getContext();
        setPopupTheme(o2.j(17, 0));
        Drawable e2 = o2.e(16);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence l4 = o2.l(15);
        if (!TextUtils.isEmpty(l4)) {
            setNavigationContentDescription(l4);
        }
        Drawable e3 = o2.e(11);
        if (e3 != null) {
            setLogo(e3);
        }
        CharSequence l5 = o2.l(12);
        if (!TextUtils.isEmpty(l5)) {
            setLogoDescription(l5);
        }
        if (o2.m(29)) {
            setTitleTextColor(o2.b(29));
        }
        if (o2.m(20)) {
            setSubtitleTextColor(o2.b(20));
        }
        if (o2.m(14)) {
            getMenuInflater().inflate(o2.j(14, 0), getMenu());
        }
        o2.f2006b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new f.g(getContext());
    }

    public final void a(List<View> list, int i2) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f407b == 0 && t(childAt) && j(eVar.f1287a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f407b == 0 && t(childAt2) && j(eVar2.f1287a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f407b = 1;
        if (!z2 || this.f384j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.F.add(view);
    }

    public void c() {
        if (this.f383i == null) {
            k kVar = new k(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f383i = kVar;
            kVar.setImageDrawable(this.f381g);
            this.f383i.setContentDescription(this.f382h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1287a = 8388611 | (this.f389o & 112);
            generateDefaultLayoutParams.f407b = 2;
            this.f383i.setLayoutParams(generateDefaultLayoutParams);
            this.f383i.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.f395u == null) {
            this.f395u = new n0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f376b;
        if (actionMenuView.f297q == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f376b.setExpandedActionViewsExclusive(true);
            eVar.b(this.L, this.f385k);
        }
    }

    public final void f() {
        if (this.f376b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f376b = actionMenuView;
            actionMenuView.setPopupTheme(this.f386l);
            this.f376b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f376b;
            actionMenuView2.f302v = null;
            actionMenuView2.f303w = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1287a = 8388613 | (this.f389o & 112);
            this.f376b.setLayoutParams(generateDefaultLayoutParams);
            b(this.f376b, false);
        }
    }

    public final void g() {
        if (this.f379e == null) {
            this.f379e = new k(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f1287a = 8388611 | (this.f389o & 112);
            this.f379e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f383i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f383i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        n0 n0Var = this.f395u;
        if (n0Var != null) {
            return n0Var.f1956g ? n0Var.f1950a : n0Var.f1951b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f397w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        n0 n0Var = this.f395u;
        if (n0Var != null) {
            return n0Var.f1950a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        n0 n0Var = this.f395u;
        if (n0Var != null) {
            return n0Var.f1951b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        n0 n0Var = this.f395u;
        if (n0Var != null) {
            return n0Var.f1956g ? n0Var.f1951b : n0Var.f1950a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f396v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVar;
        ActionMenuView actionMenuView = this.f376b;
        return actionMenuView != null && (eVar = actionMenuView.f297q) != null && eVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f397w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f396v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f380f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f380f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f376b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f379e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f379e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f376b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f385k;
    }

    public int getPopupTheme() {
        return this.f386l;
    }

    public CharSequence getSubtitle() {
        return this.f400z;
    }

    public final TextView getSubtitleTextView() {
        return this.f378d;
    }

    public CharSequence getTitle() {
        return this.f399y;
    }

    public int getTitleMarginBottom() {
        return this.f394t;
    }

    public int getTitleMarginEnd() {
        return this.f392r;
    }

    public int getTitleMarginStart() {
        return this.f391q;
    }

    public int getTitleMarginTop() {
        return this.f393s;
    }

    public final TextView getTitleTextView() {
        return this.f377c;
    }

    public c0 getWrapper() {
        if (this.J == null) {
            this.J = new androidx.appcompat.widget.d(this, true);
        }
        return this.J;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0013a ? new e((a.C0013a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.f1287a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f398x & 112;
        }
        if (i4 != 48) {
            if (i4 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i5 < i6) {
                    i5 = i6;
                } else {
                    int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
                    int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i7 < i8) {
                        i5 = Math.max(0, i5 - (i8 - i7));
                    }
                }
                return paddingTop + i5;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i3;
        }
        return getPaddingTop() - i3;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean o() {
        ActionMenuView actionMenuView = this.f376b;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.f301u;
            if (aVar != null && aVar.m()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0297 A[LOOP:0: B:109:0x0295->B:110:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b9 A[LOOP:1: B:112:0x02b7->B:113:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02de A[LOOP:2: B:115:0x02dc->B:116:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0333 A[LOOP:3: B:124:0x0331->B:125:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0292  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f2110a);
        ActionMenuView actionMenuView = this.f376b;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.f297q : null;
        int i2 = gVar.f408c;
        if (i2 != 0 && this.L != null && eVar != null && (findItem = eVar.findItem(i2)) != null) {
            findItem.expandActionView();
        }
        if (gVar.f409d) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            h.n0 r0 = r2.f395u
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.f1956g
            if (r1 != r3) goto L12
            goto L40
        L12:
            r0.f1956g = r1
            boolean r3 = r0.f1957h
            if (r3 == 0) goto L38
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2a
            int r1 = r0.f1953d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f1954e
        L23:
            r0.f1950a = r1
            int r1 = r0.f1952c
            if (r1 == r3) goto L3c
            goto L3e
        L2a:
            int r1 = r0.f1952c
            if (r1 == r3) goto L2f
            goto L31
        L2f:
            int r1 = r0.f1954e
        L31:
            r0.f1950a = r1
            int r1 = r0.f1953d
            if (r1 == r3) goto L3c
            goto L3e
        L38:
            int r3 = r0.f1954e
            r0.f1950a = r3
        L3c:
            int r1 = r0.f1955f
        L3e:
            r0.f1951b = r1
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (gVar = dVar.f405c) != null) {
            gVar2.f408c = gVar.f184a;
        }
        gVar2.f409d = o();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final int p(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int q(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int r(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void s(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f383i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(d.a.a(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f383i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f383i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f381g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f397w) {
            this.f397w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f396v) {
            this.f396v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.a.a(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f380f == null) {
                this.f380f = new h.m(getContext(), null, 0);
            }
            if (!n(this.f380f)) {
                b(this.f380f, true);
            }
        } else {
            ImageView imageView = this.f380f;
            if (imageView != null && n(imageView)) {
                removeView(this.f380f);
                this.F.remove(this.f380f);
            }
        }
        ImageView imageView2 = this.f380f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f380f == null) {
            this.f380f = new h.m(getContext(), null, 0);
        }
        ImageView imageView = this.f380f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f379e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.a.a(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.f379e)) {
                b(this.f379e, true);
            }
        } else {
            ImageButton imageButton = this.f379e;
            if (imageButton != null && n(imageButton)) {
                removeView(this.f379e);
                this.F.remove(this.f379e);
            }
        }
        ImageButton imageButton2 = this.f379e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f379e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f376b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f386l != i2) {
            this.f386l = i2;
            if (i2 == 0) {
                this.f385k = getContext();
            } else {
                this.f385k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f378d;
            if (textView != null && n(textView)) {
                removeView(this.f378d);
                this.F.remove(this.f378d);
            }
        } else {
            if (this.f378d == null) {
                Context context = getContext();
                y yVar = new y(context, null);
                this.f378d = yVar;
                yVar.setSingleLine();
                this.f378d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f388n;
                if (i2 != 0) {
                    this.f378d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f378d.setTextColor(colorStateList);
                }
            }
            if (!n(this.f378d)) {
                b(this.f378d, true);
            }
        }
        TextView textView2 = this.f378d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f400z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f378d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f377c;
            if (textView != null && n(textView)) {
                removeView(this.f377c);
                this.F.remove(this.f377c);
            }
        } else {
            if (this.f377c == null) {
                Context context = getContext();
                y yVar = new y(context, null);
                this.f377c = yVar;
                yVar.setSingleLine();
                this.f377c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f387m;
                if (i2 != 0) {
                    this.f377c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f377c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f377c)) {
                b(this.f377c, true);
            }
        }
        TextView textView2 = this.f377c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f399y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f394t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f392r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f391q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f393s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f377c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean u() {
        ActionMenuView actionMenuView = this.f376b;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.f301u;
            if (aVar != null && aVar.n()) {
                return true;
            }
        }
        return false;
    }
}