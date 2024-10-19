package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class m extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    public final d f1945b;

    /* renamed from: c  reason: collision with root package name */
    public final l f1946c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(context);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f1945b = dVar;
        dVar.d(attributeSet, i2);
        l lVar = new l(this);
        this.f1946c = lVar;
        lVar.b(attributeSet, i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1945b;
        if (dVar != null) {
            dVar.a();
        }
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1945b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1945b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        s0 s0Var;
        l lVar = this.f1946c;
        if (lVar == null || (s0Var = lVar.f1934b) == null) {
            return null;
        }
        return s0Var.f1993a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        s0 s0Var;
        l lVar = this.f1946c;
        if (lVar == null || (s0Var = lVar.f1934b) == null) {
            return null;
        }
        return s0Var.f1994b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f1946c.f1933a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1945b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f1945b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1945b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1945b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        l lVar = this.f1946c;
        if (lVar != null) {
            lVar.e(mode);
        }
    }
}