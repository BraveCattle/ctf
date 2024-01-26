package k;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public float f2151a;

    /* renamed from: b  reason: collision with root package name */
    public float f2152b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2153c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2154d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f2155e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuffColorFilter f2156f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2157g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2158h;

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        int i2 = rect.left;
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2156f != null) {
            throw null;
        }
        float f2 = this.f2151a;
        canvas.drawRoundRect(null, f2, f2, null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(null, this.f2151a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2157g;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2155e) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2155e;
        colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2157g = colorStateList;
        this.f2156f = a(colorStateList, this.f2158h);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2158h = mode;
        this.f2156f = a(this.f2157g, mode);
        invalidateSelf();
    }
}