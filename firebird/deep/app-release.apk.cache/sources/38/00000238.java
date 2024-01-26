package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public class j extends EditText {

    /* renamed from: b  reason: collision with root package name */
    public final d f1924b;

    /* renamed from: c  reason: collision with root package name */
    public final x f1925c;

    /* renamed from: d  reason: collision with root package name */
    public final w f1926d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        r0.a(context);
        p0.a(this, getContext());
        d dVar = new d(this);
        this.f1924b = dVar;
        dVar.d(attributeSet, R.attr.editTextStyle);
        x xVar = new x(this);
        this.f1925c = xVar;
        xVar.e(attributeSet, R.attr.editTextStyle);
        xVar.b();
        this.f1926d = new w(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f1924b;
        if (dVar != null) {
            dVar.a();
        }
        x xVar = this.f1925c;
        if (xVar != null) {
            xVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.f1924b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.f1924b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1926d) == null) ? super.getTextClassifier() : wVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a.f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f1924b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        d dVar = this.f1924b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.d.f(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        d dVar = this.f1924b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        d dVar = this.f1924b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1925c;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        w wVar;
        if (Build.VERSION.SDK_INT < 28 && (wVar = this.f1926d) != null) {
            wVar.f2032b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}