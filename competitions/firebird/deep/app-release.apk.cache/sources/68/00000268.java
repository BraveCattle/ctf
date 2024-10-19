package h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import c0.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class y extends TextView implements g0.b {

    /* renamed from: b  reason: collision with root package name */
    public final d f2063b;

    /* renamed from: c  reason: collision with root package name */
    public final x f2064c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2065d;

    /* renamed from: e  reason: collision with root package name */
    public Future<c0.a> f2066e;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        r0.a(context);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f2063b = dVar;
        dVar.d(attributeSet, i2);
        x xVar = new x(this);
        this.f2064c = xVar;
        xVar.e(attributeSet, i2);
        xVar.b();
        this.f2065d = new w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f2063b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g0.b.f1804a) {
            return super.getAutoSizeMaxTextSize();
        }
        x xVar = this.f2064c;
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
        x xVar = this.f2064c;
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
        x xVar = this.f2064c;
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
        x xVar = this.f2064c;
        return xVar != null ? xVar.f2041i.f2082f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g0.b.f1804a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        x xVar = this.f2064c;
        if (xVar != null) {
            return xVar.f2041i.f2077a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f2063b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f2063b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        s0 s0Var = this.f2064c.f2040h;
        if (s0Var != null) {
            return s0Var.f1993a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        s0 s0Var = this.f2064c.f2040h;
        if (s0Var != null) {
            return s0Var.f1994b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<c0.a> future = this.f2066e;
        if (future != null) {
            try {
                this.f2066e = null;
                g0.d.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f2065d) == null) ? super.getTextClassifier() : wVar.a();
    }

    public a.C0015a getTextMetricsParamsCompat() {
        return g0.d.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a.f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        x xVar = this.f2064c;
        if (xVar == null || g0.b.f1804a) {
            return;
        }
        xVar.f2041i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        Future<c0.a> future = this.f2066e;
        if (future != null) {
            try {
                this.f2066e = null;
                g0.d.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        x xVar = this.f2064c;
        if (xVar == null || g0.b.f1804a || !xVar.d()) {
            return;
        }
        this.f2064c.f2041i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (g0.b.f1804a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        x xVar = this.f2064c;
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
        x xVar = this.f2064c;
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
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.i(i2);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f2063b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f2063b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? d.a.a(context, i2) : null, i3 != 0 ? d.a.a(context, i3) : null, i4 != 0 ? d.a.a(context, i4) : null, i5 != 0 ? d.a.a(context, i5) : null);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? d.a.a(context, i2) : null, i3 != 0 ? d.a.a(context, i3) : null, i4 != 0 ? d.a.a(context, i4) : null, i5 != 0 ? d.a.a(context, i5) : null);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.d.f(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            g0.d.b(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            g0.d.c(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        g0.d.d(this, i2);
    }

    public void setPrecomputedText(c0.a aVar) {
        g0.d.e(this, aVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f2063b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f2063b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f2064c.j(colorStateList);
        this.f2064c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f2064c.k(mode);
        this.f2064c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.f2065d) != null) {
            wVar.f2032b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<c0.a> future) {
        this.f2066e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0015a c0015a) {
        TextDirectionHeuristic textDirectionHeuristic = c0015a.f1415b;
        int i2 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0015a.f1414a);
        setBreakStrategy(c0015a.f1416c);
        setHyphenationFrequency(c0015a.f1417d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        boolean z2 = g0.b.f1804a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        x xVar = this.f2064c;
        if (xVar == null || z2 || xVar.d()) {
            return;
        }
        xVar.f2041i.f(i2, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            x.j jVar = x.d.f2767a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i2);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        x xVar = this.f2064c;
        if (xVar != null) {
            xVar.b();
        }
    }
}