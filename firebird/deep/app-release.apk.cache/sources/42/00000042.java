package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.b;
import h.a1;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements e.b, j {
    public int A;
    public e B;

    /* renamed from: q  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f297q;

    /* renamed from: r  reason: collision with root package name */
    public Context f298r;

    /* renamed from: s  reason: collision with root package name */
    public int f299s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f300t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.appcompat.widget.a f301u;

    /* renamed from: v  reason: collision with root package name */
    public i.a f302v;

    /* renamed from: w  reason: collision with root package name */
    public e.a f303w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f304x;

    /* renamed from: y  reason: collision with root package name */
    public int f305y;

    /* renamed from: z  reason: collision with root package name */
    public int f306z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends b.a {
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public boolean f307c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public int f308d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public int f309e;
        @ViewDebug.ExportedProperty

        /* renamed from: f  reason: collision with root package name */
        public boolean f310f;
        @ViewDebug.ExportedProperty

        /* renamed from: g  reason: collision with root package name */
        public boolean f311g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f312h;

        public c(int i2, int i3) {
            super(i2, i3);
            this.f307c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f307c = cVar.f307c;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void a(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f303w;
            if (aVar != null) {
                aVar.a(eVar);
            }
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.B;
            if (eVar2 != null) {
                Toolbar.f fVar = Toolbar.this.H;
                return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f306z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.f298r = context;
        this.f299s = 0;
    }

    public static int o(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = false;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.c();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!cVar.f307c && z3) {
            z2 = true;
        }
        cVar.f310f = z2;
        cVar.f308d = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f297q.r(gVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(androidx.appcompat.view.menu.e eVar) {
        this.f297q = eVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f297q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f297q = eVar;
            eVar.f161e = new d();
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f301u = aVar;
            aVar.f418m = true;
            aVar.f419n = true;
            i.a aVar2 = this.f302v;
            if (aVar2 == null) {
                aVar2 = new b();
            }
            aVar.f104f = aVar2;
            this.f297q.b(aVar, this.f298r);
            androidx.appcompat.widget.a aVar3 = this.f301u;
            aVar3.f107i = this;
            this.f297q = aVar3.f102d;
        }
        return this.f297q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f301u;
        a.d dVar = aVar.f415j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.f417l) {
            return aVar.f416k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f299s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.b
    public b.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: l */
    public c h() {
        c cVar = new c(-2, -2);
        cVar.f454b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: m */
    public c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.f454b <= 0) {
                cVar.f454b = 16;
            }
            return cVar;
        }
        return h();
    }

    public boolean n(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).a();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f301u;
        if (aVar != null) {
            aVar.h(false);
            if (this.f301u.m()) {
                this.f301u.i();
                this.f301u.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f301u;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int i6;
        if (!this.f304x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i4 - i2;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = a1.b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f307c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    n(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (b2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f307c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f307c) {
                int i20 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        ?? r3;
        androidx.appcompat.view.menu.e eVar;
        boolean z4 = this.f304x;
        boolean z5 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f304x = z5;
        if (z4 != z5) {
            this.f305y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f304x && (eVar = this.f297q) != null && size != this.f305y) {
            this.f305y = size;
            eVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f304x || childCount <= 0) {
            for (int i8 = 0; i8 < childCount; i8++) {
                c cVar = (c) getChildAt(i8).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i9 = size2 - paddingRight;
        int i10 = this.f306z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = (i12 / i11) + i10;
        int childCount2 = getChildCount();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z6 = false;
        long j2 = 0;
        while (i18 < childCount2) {
            View childAt = getChildAt(i18);
            int i19 = size3;
            int i20 = i9;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i21 = i14 + 1;
                if (z7) {
                    int i22 = this.A;
                    i7 = i21;
                    r3 = 0;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i7 = i21;
                    r3 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f312h = r3;
                cVar2.f309e = r3;
                cVar2.f308d = r3;
                cVar2.f310f = r3;
                ((ViewGroup.MarginLayoutParams) cVar2).leftMargin = r3;
                ((ViewGroup.MarginLayoutParams) cVar2).rightMargin = r3;
                cVar2.f311g = z7 && ((ActionMenuItemView) childAt).c();
                int o2 = o(childAt, i13, cVar2.f307c ? 1 : i11, childMeasureSpec, paddingBottom);
                i16 = Math.max(i16, o2);
                if (cVar2.f310f) {
                    i17++;
                }
                if (cVar2.f307c) {
                    z6 = true;
                }
                i11 -= o2;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (o2 == 1) {
                    j2 |= 1 << i18;
                }
                i14 = i7;
            }
            i18++;
            size3 = i19;
            i9 = i20;
        }
        int i23 = i9;
        int i24 = size3;
        boolean z8 = z6 && i14 == 2;
        boolean z9 = false;
        while (i17 > 0 && i11 > 0) {
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j3 = 0;
            while (i26 < childCount2) {
                int i28 = i15;
                c cVar3 = (c) getChildAt(i26).getLayoutParams();
                boolean z10 = z9;
                if (cVar3.f310f) {
                    int i29 = cVar3.f308d;
                    if (i29 < i25) {
                        j3 = 1 << i26;
                        i25 = i29;
                        i27 = 1;
                    } else if (i29 == i25) {
                        i27++;
                        j3 |= 1 << i26;
                    }
                }
                i26++;
                z9 = z10;
                i15 = i28;
            }
            i4 = i15;
            z2 = z9;
            j2 |= j3;
            if (i27 > i11) {
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount2) {
                View childAt2 = getChildAt(i31);
                c cVar4 = (c) childAt2.getLayoutParams();
                int i32 = i17;
                long j4 = 1 << i31;
                if ((j3 & j4) == 0) {
                    if (cVar4.f308d == i30) {
                        j2 |= j4;
                    }
                    z3 = z8;
                } else {
                    if (z8 && cVar4.f311g && i11 == 1) {
                        int i33 = this.A;
                        z3 = z8;
                        childAt2.setPadding(i33 + i13, 0, i33, 0);
                    } else {
                        z3 = z8;
                    }
                    cVar4.f308d++;
                    cVar4.f312h = true;
                    i11--;
                }
                i31++;
                i17 = i32;
                z8 = z3;
            }
            i15 = i4;
            z9 = true;
        }
        i4 = i15;
        z2 = z9;
        boolean z11 = !z6 && i14 == 1;
        if (i11 > 0 && j2 != 0 && (i11 < i14 - 1 || z11 || i16 > 1)) {
            float bitCount = Long.bitCount(j2);
            if (!z11) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f311g) {
                    bitCount -= 0.5f;
                }
                int i34 = childCount2 - 1;
                if ((j2 & (1 << i34)) != 0 && !((c) getChildAt(i34).getLayoutParams()).f311g) {
                    bitCount -= 0.5f;
                }
            }
            int i35 = bitCount > 0.0f ? (int) ((i11 * i13) / bitCount) : 0;
            for (int i36 = 0; i36 < childCount2; i36++) {
                if ((j2 & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f309e = i35;
                        cVar5.f312h = true;
                        if (i36 == 0 && !cVar5.f311g) {
                            ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = (-i35) / 2;
                        }
                        z2 = true;
                    } else if (cVar5.f307c) {
                        cVar5.f309e = i35;
                        cVar5.f312h = true;
                        ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = (-i35) / 2;
                        z2 = true;
                    } else {
                        if (i36 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = i35 / 2;
                        }
                        if (i36 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = i35 / 2;
                        }
                    }
                }
            }
        }
        if (z2) {
            for (int i37 = 0; i37 < childCount2; i37++) {
                View childAt4 = getChildAt(i37);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f312h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f308d * i13) + cVar6.f309e, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i23;
            i5 = i4;
        } else {
            i5 = i24;
            i6 = i23;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f301u.f423r = z2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.f301u;
        a.d dVar = aVar.f415j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        aVar.f417l = true;
        aVar.f416k = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.f300t = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f299s != i2) {
            this.f299s = i2;
            if (i2 == 0) {
                this.f298r = getContext();
            } else {
                this.f298r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f301u = aVar;
        aVar.f107i = this;
        this.f297q = aVar.f102d;
    }
}