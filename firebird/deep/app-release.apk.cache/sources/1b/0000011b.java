package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;
import java.util.Objects;

/* loaded from: classes.dex */
public class l implements b.InterfaceC0009b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f1192a;

    public l(k kVar) {
        this.f1192a = kVar;
    }

    public View a(int i2) {
        return this.f1192a.getChildAt(i2);
    }

    public int b() {
        return this.f1192a.getChildCount();
    }

    public void c(int i2) {
        View childAt = this.f1192a.getChildAt(i2);
        if (childAt != null) {
            Objects.requireNonNull(this.f1192a);
            k.u(childAt);
            childAt.clearAnimation();
        }
        this.f1192a.removeViewAt(i2);
    }
}