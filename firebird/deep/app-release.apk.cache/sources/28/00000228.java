package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public class f extends CheckBox {

    /* renamed from: b  reason: collision with root package name */
    public final h f1862b;

    /* renamed from: c  reason: collision with root package name */
    public final d f1863c;

    /* renamed from: d  reason: collision with root package name */
    public final x f1864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkboxStyle);
        r0.a(context);
        p0.a(this, getContext());
        h hVar = new h(this);
        this.f1862b = hVar;
        hVar.b(attributeSet, R.attr.checkboxStyle);
        d dVar = new d(this);
        this.f1863c = dVar;
        dVar.d(attributeSet, R.attr.checkboxStyle);
        x xVar = new x(this);
        this.f1864d = xVar;
        xVar.e(attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1863c;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.f1864d;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1863c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1863c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f1862b;
        if (hVar != null) {
            return hVar.f1879b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f1862b;
        if (hVar != null) {
            return hVar.f1880c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1863c;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f1863c;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i2) {
        setButtonDrawable(d.a.a(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f1862b;
        if (hVar != null) {
            if (hVar.f1883f) {
                hVar.f1883f = false;
                return;
            }
            hVar.f1883f = true;
            hVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1863c;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1863c;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f1862b;
        if (hVar != null) {
            hVar.f1879b = colorStateList;
            hVar.f1881d = true;
            hVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f1862b;
        if (hVar != null) {
            hVar.f1880c = mode;
            hVar.f1882e = true;
            hVar.a();
        }
    }
}