package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public class k extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final d f1927b;

    /* renamed from: c  reason: collision with root package name */
    public final l f1928c;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(context);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f1927b = dVar;
        dVar.d(attributeSet, i2);
        l lVar = new l(this);
        this.f1928c = lVar;
        lVar.b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1927b;
        if (dVar != null) {
            dVar.a();
        }
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1927b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1927b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        s0 s0Var;
        l lVar = this.f1928c;
        if (lVar == null || (s0Var = lVar.f1934b) == null) {
            return null;
        }
        return s0Var.f1993a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        s0 s0Var;
        l lVar = this.f1928c;
        if (lVar == null || (s0Var = lVar.f1934b) == null) {
            return null;
        }
        return s0Var.f1994b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f1928c.f1933a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1927b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f1927b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        this.f1928c.c(i2);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1927b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1927b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f1928c;
        if (lVar != null) {
            lVar.e(mode);
        }
    }
}