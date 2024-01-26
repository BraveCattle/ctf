package q;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public abstract class f extends androidx.constraintlayout.widget.b {

    /* renamed from: h  reason: collision with root package name */
    public boolean f2551h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2552i;

    @Override // androidx.constraintlayout.widget.b
    public void e(AttributeSet attributeSet) {
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f2551h || this.f2552i) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i2 = 0; i2 < this.f543c; i2++) {
                View d2 = constraintLayout.d(this.f542b[i2]);
                if (d2 != null) {
                    if (this.f2551h) {
                        d2.setVisibility(visibility);
                    }
                    if (this.f2552i && elevation > 0.0f) {
                        d2.setTranslationZ(d2.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        c();
    }
}