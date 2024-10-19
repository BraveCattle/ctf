package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i extends j {
    public i(k.j jVar) {
        super(jVar, null);
    }

    @Override // androidx.recyclerview.widget.j
    public int b(View view) {
        Objects.requireNonNull(this.f1068a);
        return view.getBottom() + ((k.C0011k) view.getLayoutParams()).f1145a.bottom + ((ViewGroup.MarginLayoutParams) ((k.C0011k) view.getLayoutParams())).bottomMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public int c(View view) {
        Objects.requireNonNull(this.f1068a);
        return (view.getTop() - ((k.C0011k) view.getLayoutParams()).f1145a.top) - ((ViewGroup.MarginLayoutParams) ((k.C0011k) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public int d() {
        k.j jVar = this.f1068a;
        return jVar.f1138l - jVar.t();
    }

    @Override // androidx.recyclerview.widget.j
    public int e() {
        return this.f1068a.w();
    }

    @Override // androidx.recyclerview.widget.j
    public int f() {
        k.j jVar = this.f1068a;
        return (jVar.f1138l - jVar.w()) - this.f1068a.t();
    }
}