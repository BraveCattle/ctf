package d1;

import android.widget.ImageButton;

/* loaded from: classes.dex */
public class g extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public int f1611b;

    public final void b(int i2, boolean z2) {
        super.setVisibility(i2);
        if (z2) {
            this.f1611b = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f1611b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.f1611b = i2;
    }
}