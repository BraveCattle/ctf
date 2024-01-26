package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import com.x64m.xsfmnative.R;
import d1.c;
import e0.m;
import e0.o;
import f0.d;
import h.w0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends c implements j.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public g B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final e0.a F;

    /* renamed from: w  reason: collision with root package name */
    public final int f1546w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1547x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1548y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f1549z;

    /* loaded from: classes.dex */
    public class a extends e0.a {
        public a() {
        }

        @Override // e0.a
        public void b(View view, d dVar) {
            this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
            dVar.f1731a.setCheckable(NavigationMenuItemView.this.f1548y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f1546w = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f1549z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        m.f(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i2) {
        b.a aVar;
        int i3;
        StateListDrawable stateListDrawable;
        this.B = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z2 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            setBackground(stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f188e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f200q);
        w0.a(this, gVar.f201r);
        g gVar2 = this.B;
        if (gVar2.f188e != null || gVar2.getIcon() != null || this.B.getActionView() == null) {
            z2 = false;
        }
        if (z2) {
            this.f1549z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout == null) {
                return;
            }
            aVar = (b.a) frameLayout.getLayoutParams();
            i3 = -1;
        } else {
            this.f1549z.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (b.a) frameLayout2.getLayoutParams();
            i3 = -2;
        }
        ((ViewGroup.MarginLayoutParams) aVar).width = i3;
        this.A.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        g gVar = this.B;
        if (gVar != null && gVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f1548y != z2) {
            this.f1548y = z2;
            e0.a aVar = this.F;
            aVar.f1614a.sendAccessibilityEvent(this.f1549z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.f1549z.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, 0, i2, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.C);
            }
            int i2 = this.f1546w;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f1547x) {
            if (this.E == null) {
                Drawable drawable2 = getResources().getDrawable(R.drawable.navigation_empty_icon, getContext().getTheme());
                this.E = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f1546w;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        this.f1549z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f1549z.setCompoundDrawablePadding(i2);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        g gVar = this.B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f1547x = z2;
    }

    public void setTextAppearance(int i2) {
        this.f1549z.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1549z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1549z.setText(charSequence);
    }
}