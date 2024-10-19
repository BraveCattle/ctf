package w0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class c<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public d f2755a;

    /* renamed from: b  reason: collision with root package name */
    public int f2756b;

    public c() {
        this.f2756b = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2756b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        t(coordinatorLayout, v2, i2);
        if (this.f2755a == null) {
            this.f2755a = new d(v2);
        }
        d dVar = this.f2755a;
        dVar.f2758b = dVar.f2757a.getTop();
        dVar.f2759c = dVar.f2757a.getLeft();
        dVar.a();
        int i3 = this.f2756b;
        if (i3 != 0) {
            d dVar2 = this.f2755a;
            if (dVar2.f2760d != i3) {
                dVar2.f2760d = i3;
                dVar2.a();
            }
            this.f2756b = 0;
            return true;
        }
        return true;
    }

    public int s() {
        d dVar = this.f2755a;
        if (dVar != null) {
            return dVar.f2760d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        coordinatorLayout.r(v2, i2);
    }

    public boolean u(int i2) {
        d dVar = this.f2755a;
        if (dVar != null) {
            if (dVar.f2760d != i2) {
                dVar.f2760d = i2;
                dVar.a();
                return true;
            }
            return false;
        }
        this.f2756b = i2;
        return false;
    }
}