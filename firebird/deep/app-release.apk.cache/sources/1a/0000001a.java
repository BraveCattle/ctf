package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import h.g0;
import h.w0;
import h.y;

/* loaded from: classes.dex */
public class ActionMenuItemView extends y implements j.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    public g f69f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f70g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f71h;

    /* renamed from: i  reason: collision with root package name */
    public e.b f72i;

    /* renamed from: j  reason: collision with root package name */
    public g0 f73j;

    /* renamed from: k  reason: collision with root package name */
    public b f74k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f75l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f76m;

    /* renamed from: n  reason: collision with root package name */
    public int f77n;

    /* renamed from: o  reason: collision with root package name */
    public int f78o;

    /* renamed from: p  reason: collision with root package name */
    public int f79p;

    /* loaded from: classes.dex */
    public class a extends g0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // h.g0
        public g.f b() {
            a.C0001a c0001a;
            b bVar = ActionMenuItemView.this.f74k;
            if (bVar == null || (c0001a = androidx.appcompat.widget.a.this.f426u) == null) {
                return null;
            }
            return c0001a.a();
        }

        @Override // h.g0
        public boolean c() {
            g.f b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f72i;
            return bVar != null && bVar.b(actionMenuItemView.f69f) && (b2 = b()) != null && b2.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f75l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1221c, 0, 0);
        this.f77n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f79p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f78o = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return c() && this.f69f.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return c();
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i2) {
        this.f69f = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f184a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f73j == null) {
            this.f73j = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f70g);
        if (this.f71h != null) {
            if (!((this.f69f.f208y & 4) == 4) || (!this.f75l && !this.f76m)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f70g : null);
        CharSequence charSequence = this.f69f.f200q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z4 ? null : this.f69f.f188e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f69f.f201r;
        if (TextUtils.isEmpty(charSequence2)) {
            w0.a(this, z4 ? null : this.f69f.f188e);
        } else {
            w0.a(this, charSequence2);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f69f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f72i;
        if (bVar != null) {
            bVar.b(this.f69f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f75l = e();
        f();
    }

    @Override // h.y, android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean c2 = c();
        if (c2 && (i4 = this.f78o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f77n) : this.f77n;
        if (mode != 1073741824 && this.f77n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (c2 || this.f71h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f71h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var;
        if (this.f69f.hasSubMenu() && (g0Var = this.f73j) != null && g0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f76m != z2) {
            this.f76m = z2;
            g gVar = this.f69f;
            if (gVar != null) {
                e eVar = gVar.f197n;
                eVar.f167k = true;
                eVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f71h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f79p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (intrinsicHeight * (i2 / intrinsicWidth));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f72i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f78o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f74k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f70g = charSequence;
        f();
    }
}