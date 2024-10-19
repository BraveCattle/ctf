package h;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class g extends CheckedTextView {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1865c = {16843016};

    /* renamed from: b  reason: collision with root package name */
    public final x f1866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        r0.a(context);
        p0.a(this, getContext());
        x xVar = new x(this);
        this.f1866b = xVar;
        xVar.e(attributeSet, 16843720);
        xVar.b();
        u0 o2 = u0.o(getContext(), attributeSet, f1865c, 16843720, 0);
        setCheckMarkDrawable(o2.e(0));
        o2.f2006b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f1866b;
        if (xVar != null) {
            xVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.a.f(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(d.a.a(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g0.d.f(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        x xVar = this.f1866b;
        if (xVar != null) {
            xVar.f(context, i2);
        }
    }
}