package y0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import com.x64m.xsfmnative.R;
import d1.f;
import e0.m;
import e0.o;
import h.e;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a extends e {

    /* renamed from: d  reason: collision with root package name */
    public final c f2793d;

    /* renamed from: e  reason: collision with root package name */
    public int f2794e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f2795f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2796g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2797h;

    /* renamed from: i  reason: collision with root package name */
    public int f2798i;

    /* renamed from: j  reason: collision with root package name */
    public int f2799j;

    /* renamed from: k  reason: collision with root package name */
    public int f2800k;

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        Drawable drawable;
        int resourceId;
        TypedArray b2 = d1.e.b(context, attributeSet, u0.a.f2703e, R.attr.materialButtonStyle, 2131624405, new int[0]);
        this.f2794e = b2.getDimensionPixelSize(9, 0);
        this.f2795f = f.a(b2.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.f2796g = b1.b.b(getContext(), b2, 11);
        this.f2797h = (!b2.hasValue(7) || (resourceId = b2.getResourceId(7, 0)) == 0 || (drawable = d.a.a(getContext(), resourceId)) == null) ? b2.getDrawable(7) : drawable;
        this.f2800k = b2.getInteger(8, 1);
        this.f2798i = b2.getDimensionPixelSize(10, 0);
        c cVar = new c(this);
        this.f2793d = cVar;
        cVar.f2802b = b2.getDimensionPixelOffset(0, 0);
        cVar.f2803c = b2.getDimensionPixelOffset(1, 0);
        cVar.f2804d = b2.getDimensionPixelOffset(2, 0);
        cVar.f2805e = b2.getDimensionPixelOffset(3, 0);
        cVar.f2806f = b2.getDimensionPixelSize(6, 0);
        cVar.f2807g = b2.getDimensionPixelSize(15, 0);
        cVar.f2808h = f.a(b2.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        cVar.f2809i = b1.b.b(cVar.f2801a.getContext(), b2, 4);
        cVar.f2810j = b1.b.b(cVar.f2801a.getContext(), b2, 14);
        cVar.f2811k = b1.b.b(cVar.f2801a.getContext(), b2, 13);
        cVar.f2812l.setStyle(Paint.Style.STROKE);
        cVar.f2812l.setStrokeWidth(cVar.f2807g);
        Paint paint = cVar.f2812l;
        ColorStateList colorStateList = cVar.f2810j;
        paint.setColor(colorStateList != null ? colorStateList.getColorForState(cVar.f2801a.getDrawableState(), 0) : 0);
        a aVar = cVar.f2801a;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int paddingStart = aVar.getPaddingStart();
        int paddingTop = cVar.f2801a.getPaddingTop();
        int paddingEnd = cVar.f2801a.getPaddingEnd();
        int paddingBottom = cVar.f2801a.getPaddingBottom();
        cVar.f2801a.setInternalBackground(cVar.a());
        cVar.f2801a.setPaddingRelative(paddingStart + cVar.f2802b, paddingTop + cVar.f2804d, paddingEnd + cVar.f2803c, paddingBottom + cVar.f2805e);
        b2.recycle();
        setCompoundDrawablePadding(this.f2794e);
        b();
    }

    public final boolean a() {
        c cVar = this.f2793d;
        return (cVar == null || cVar.f2818r) ? false : true;
    }

    public final void b() {
        Drawable drawable = this.f2797h;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2797h = mutate;
            mutate.setTintList(this.f2796g);
            PorterDuff.Mode mode = this.f2795f;
            if (mode != null) {
                this.f2797h.setTintMode(mode);
            }
            int i2 = this.f2798i;
            if (i2 == 0) {
                i2 = this.f2797h.getIntrinsicWidth();
            }
            int i3 = this.f2798i;
            if (i3 == 0) {
                i3 = this.f2797h.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2797h;
            int i4 = this.f2799j;
            drawable2.setBounds(i4, 0, i2 + i4, i3);
        }
        setCompoundDrawablesRelative(this.f2797h, null, null, null);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f2793d.f2806f;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2797h;
    }

    public int getIconGravity() {
        return this.f2800k;
    }

    public int getIconPadding() {
        return this.f2794e;
    }

    public int getIconSize() {
        return this.f2798i;
    }

    public ColorStateList getIconTint() {
        return this.f2796g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2795f;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f2793d.f2811k;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f2793d.f2810j;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f2793d.f2807g;
        }
        return 0;
    }

    @Override // h.e
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f2793d.f2809i;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // h.e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f2793d.f2808h;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // h.e, android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2797h == null || this.f2800k != 2) {
            return;
        }
        int measureText = (int) getPaint().measureText(getText().toString());
        int i4 = this.f2798i;
        if (i4 == 0) {
            i4 = this.f2797h.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - measureText;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i4) - this.f2794e) - getPaddingStart()) / 2;
        if (getLayoutDirection() == 1) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2799j != paddingEnd) {
            this.f2799j = paddingEnd;
            b();
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (a()) {
            GradientDrawable gradientDrawable = this.f2793d.f2815o;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    @Override // h.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.i("MaterialButton", "Setting a custom background is not supported.");
                c cVar = this.f2793d;
                cVar.f2818r = true;
                cVar.f2801a.setSupportBackgroundTintList(cVar.f2809i);
                cVar.f2801a.setSupportBackgroundTintMode(cVar.f2808h);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // h.e, android.view.View
    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? d.a.a(getContext(), i2) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCornerRadius(int i2) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2806f != i2) {
                cVar.f2806f = i2;
                GradientDrawable gradientDrawable = cVar.f2815o;
                if (gradientDrawable == null || cVar.f2816p == null || cVar.f2817q == null) {
                    return;
                }
                float f2 = i2 + 1.0E-5f;
                gradientDrawable.setCornerRadius(f2);
                cVar.f2816p.setCornerRadius(f2);
                cVar.f2817q.setCornerRadius(f2);
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2797h != drawable) {
            this.f2797h = drawable;
            b();
        }
    }

    public void setIconGravity(int i2) {
        this.f2800k = i2;
    }

    public void setIconPadding(int i2) {
        if (this.f2794e != i2) {
            this.f2794e = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? d.a.a(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2798i != i2) {
            this.f2798i = i2;
            b();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2796g != colorStateList) {
            this.f2796g = colorStateList;
            b();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2795f != mode) {
            this.f2795f = mode;
            b();
        }
    }

    public void setIconTintResource(int i2) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
        setIconTint(context.getColorStateList(i2));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2811k != colorStateList) {
                cVar.f2811k = colorStateList;
                if (cVar.f2801a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) cVar.f2801a.getBackground()).setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (a()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
            setRippleColor(context.getColorStateList(i2));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2810j != colorStateList) {
                cVar.f2810j = colorStateList;
                cVar.f2812l.setColor(colorStateList != null ? colorStateList.getColorForState(cVar.f2801a.getDrawableState(), 0) : 0);
                if (cVar.f2816p != null) {
                    cVar.f2801a.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (a()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
            setStrokeColor(context.getColorStateList(i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2807g != i2) {
                cVar.f2807g = i2;
                cVar.f2812l.setStrokeWidth(i2);
                if (cVar.f2816p != null) {
                    cVar.f2801a.setInternalBackground(cVar.a());
                }
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // h.e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2809i != colorStateList) {
                cVar.f2809i = colorStateList;
                cVar.b();
            }
        } else if (this.f2793d != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // h.e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f2793d;
            if (cVar.f2808h != mode) {
                cVar.f2808h = mode;
                cVar.b();
            }
        } else if (this.f2793d != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}