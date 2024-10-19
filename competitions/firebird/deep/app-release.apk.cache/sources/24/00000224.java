package h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class e extends Button implements g0.b {

    /* renamed from: b  reason: collision with root package name */
    public final d f1845b;

    /* renamed from: c  reason: collision with root package name */
    public final x f1846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(context);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f1845b = dVar;
        dVar.d(attributeSet, i2);
        x xVar = new x(this);
        this.f1846c = xVar;
        xVar.e(attributeSet, i2);
        xVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1845b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g0.b.f1804a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            return Math.round(xVar.f2041i.f2081e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g0.b.f1804a) {
            return super.getAutoSizeMinTextSize();
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            return Math.round(xVar.f2041i.f2080d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g0.b.f1804a) {
            return super.getAutoSizeStepGranularity();
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            return Math.round(xVar.f2041i.f2079c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g0.b.f1804a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        x xVar = this.f1846c;
        return xVar != null ? xVar.f2041i.f2082f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g0.b.f1804a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            return xVar.f2041i.f2077a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1845b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1845b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        s0 s0Var = this.f1846c.f2040h;
        if (s0Var != null) {
            return s0Var.f1993a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        s0 s0Var = this.f1846c.f2040h;
        if (s0Var != null) {
            return s0Var.f1994b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        x xVar = this.f1846c;
        if (xVar == null || g0.b.f1804a) {
            return;
        }
        xVar.f2041i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.f1846c;
        if (xVar == null || g0.b.f1804a || !xVar.d()) {
            return;
        }
        this.f1846c.f2041i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (g0.b.f1804a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.g(i2, i3, i4, i5);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (g0.b.f1804a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.h(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (g0.b.f1804a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1845b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f1845b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.d.f(this, callback));
    }

    public void setSupportAllCaps(boolean z2) {
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.f2033a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1845b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1845b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1846c.j(colorStateList);
        this.f1846c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1846c.k(mode);
        this.f1846c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1846c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z2 = g0.b.f1804a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.f1846c;
        if (xVar == null || z2 || xVar.d()) {
            return;
        }
        xVar.f2041i.f(i2, f2);
    }
}