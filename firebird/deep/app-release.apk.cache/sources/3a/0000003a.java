package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import h.a1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContextView extends h.a {

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f257j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f258k;

    /* renamed from: l  reason: collision with root package name */
    public View f259l;

    /* renamed from: m  reason: collision with root package name */
    public View f260m;

    /* renamed from: n  reason: collision with root package name */
    public LinearLayout f261n;

    /* renamed from: o  reason: collision with root package name */
    public TextView f262o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f263p;

    /* renamed from: q  reason: collision with root package name */
    public int f264q;

    /* renamed from: r  reason: collision with root package name */
    public int f265r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f266s;

    /* renamed from: t  reason: collision with root package name */
    public int f267t;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f.a f268b;

        public a(ActionBarContextView actionBarContextView, f.a aVar) {
            this.f268b = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f268b.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1222d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.a.a(context, resourceId);
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        setBackground(drawable);
        this.f264q = obtainStyledAttributes.getResourceId(5, 0);
        this.f265r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1825f = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f267t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(f.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f259l
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f267t
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f259l = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r6.f259l
        L1e:
            r6.addView(r0)
        L21:
            android.view.View r0 = r6.f259l
            r2 = 2131230779(0x7f08003b, float:1.807762E38)
            android.view.View r0 = r0.findViewById(r2)
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.e()
            androidx.appcompat.view.menu.e r7 = (androidx.appcompat.view.menu.e) r7
            androidx.appcompat.widget.a r0 = r6.f1824e
            if (r0 == 0) goto L3f
            r0.a()
        L3f:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f1824e = r0
            r2 = 1
            r0.f418m = r2
            r0.f419n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.a r3 = r6.f1824e
            android.content.Context r4 = r6.f1822c
            r7.b(r3, r4)
            androidx.appcompat.widget.a r7 = r6.f1824e
            androidx.appcompat.view.menu.j r3 = r7.f107i
            if (r3 != 0) goto L77
            android.view.LayoutInflater r4 = r7.f103e
            int r5 = r7.f105g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.j r1 = (androidx.appcompat.view.menu.j) r1
            r7.f107i = r1
            androidx.appcompat.view.menu.e r4 = r7.f102d
            r1.c(r4)
            r7.h(r2)
        L77:
            androidx.appcompat.view.menu.j r1 = r7.f107i
            if (r3 == r1) goto L81
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L81:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f1823d = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, e0.o> r2 = e0.m.f1633a
            r1.setBackground(r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f1823d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(f.a):void");
    }

    public final void g() {
        if (this.f261n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f261n = linearLayout;
            this.f262o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f263p = (TextView) this.f261n.findViewById(R.id.action_bar_subtitle);
            if (this.f264q != 0) {
                this.f262o.setTextAppearance(getContext(), this.f264q);
            }
            if (this.f265r != 0) {
                this.f263p.setTextAppearance(getContext(), this.f265r);
            }
        }
        this.f262o.setText(this.f257j);
        this.f263p.setText(this.f258k);
        boolean z2 = !TextUtils.isEmpty(this.f257j);
        boolean z3 = !TextUtils.isEmpty(this.f258k);
        int i2 = 0;
        this.f263p.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f261n;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f261n.getParent() == null) {
            addView(this.f261n);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // h.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // h.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f258k;
    }

    public CharSequence getTitle() {
        return this.f257j;
    }

    public void h() {
        removeAllViews();
        this.f260m = null;
        this.f1823d = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f1824e;
        if (aVar != null) {
            aVar.i();
            this.f1824e.l();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f257j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean b2 = a1.b(this);
        int paddingRight = b2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f259l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f259l.getLayoutParams();
            int i6 = b2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = b2 ? paddingRight - i6 : paddingRight + i6;
            int d2 = i8 + d(this.f259l, i8, paddingTop, paddingTop2, b2);
            paddingRight = b2 ? d2 - i7 : d2 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f261n;
        if (linearLayout != null && this.f260m == null && linearLayout.getVisibility() != 8) {
            i9 += d(this.f261n, i9, paddingTop, paddingTop2, b2);
        }
        int i10 = i9;
        View view2 = this.f260m;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, b2);
        }
        int paddingLeft = b2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1823d;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i2);
            int i4 = this.f1825f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f259l;
            if (view != null) {
                int c2 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f259l.getLayoutParams();
                paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1823d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f1823d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f261n;
            if (linearLayout != null && this.f260m == null) {
                if (this.f266s) {
                    this.f261n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f261n.getMeasuredWidth();
                    boolean z2 = measuredWidth <= paddingLeft;
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f261n.setVisibility(z2 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f260m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f260m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i9));
            }
            if (this.f1825f <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        }
    }

    @Override // h.a
    public void setContentHeight(int i2) {
        this.f1825f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f260m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f260m = view;
        if (view != null && (linearLayout = this.f261n) != null) {
            removeView(linearLayout);
            this.f261n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f258k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f257j = charSequence;
        g();
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f266s) {
            requestLayout();
        }
        this.f266s = z2;
    }

    @Override // h.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}