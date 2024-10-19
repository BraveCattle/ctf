package h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public class s extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    public final t f1992b;

    public s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        p0.a(this, getContext());
        t tVar = new t(this);
        this.f1992b = tVar;
        tVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f1992b;
        Drawable drawable = tVar.f1998e;
        if (drawable != null && drawable.isStateful() && drawable.setState(tVar.f1997d.getDrawableState())) {
            tVar.f1997d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1992b.f1998e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1992b.d(canvas);
    }
}