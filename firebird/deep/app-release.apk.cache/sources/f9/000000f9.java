package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.k;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends j {
    public h(k.j jVar) {
        super(jVar, null);
    }

    @Override // androidx.recyclerview.widget.j
    public int b(View view) {
        Objects.requireNonNull(this.f1068a);
        return view.getRight() + ((k.C0011k) view.getLayoutParams()).f1145a.right + ((ViewGroup.MarginLayoutParams) ((k.C0011k) view.getLayoutParams())).rightMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public int c(View view) {
        Objects.requireNonNull(this.f1068a);
        return (view.getLeft() - ((k.C0011k) view.getLayoutParams()).f1145a.left) - ((ViewGroup.MarginLayoutParams) ((k.C0011k) view.getLayoutParams())).leftMargin;
    }

    @Override // androidx.recyclerview.widget.j
    public int d() {
        k.j jVar = this.f1068a;
        return jVar.f1137k - jVar.v();
    }

    @Override // androidx.recyclerview.widget.j
    public int e() {
        return this.f1068a.u();
    }

    @Override // androidx.recyclerview.widget.j
    public int f() {
        k.j jVar = this.f1068a;
        return (jVar.f1137k - jVar.u()) - this.f1068a.v();
    }
}