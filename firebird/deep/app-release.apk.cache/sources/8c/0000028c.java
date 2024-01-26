package k;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class a extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final d f2148d = new b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2149b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2150c;

    public ColorStateList getCardBackgroundColor() {
        ((b) f2148d).a(null);
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        ((b) f2148d).b(null);
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2150c;
    }

    public float getRadius() {
        ((b) f2148d).c(null);
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f2149b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ((b) f2148d).d(null, ColorStateList.valueOf(i2));
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ((b) f2148d).d(null, colorStateList);
        throw null;
    }

    public void setCardElevation(float f2) {
        throw null;
    }

    public void setMaxCardElevation(float f2) {
        ((b) f2148d).e(null, f2);
        throw null;
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 == this.f2150c) {
            return;
        }
        this.f2150c = z2;
        ((b) f2148d).a(null);
        throw null;
    }

    public void setRadius(float f2) {
        ((b) f2148d).a(null);
        throw null;
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f2149b == z2) {
            return;
        }
        this.f2149b = z2;
        ((b) f2148d).a(null);
        throw null;
    }
}