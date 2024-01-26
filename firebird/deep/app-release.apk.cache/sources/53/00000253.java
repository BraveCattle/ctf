package h;

import android.annotation.SuppressLint;
import android.view.View;
import h.v;

/* loaded from: classes.dex */
public class u extends g0 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v.d f2003k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ v f2004l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, View view, v.d dVar) {
        super(view);
        this.f2004l = vVar;
        this.f2003k = dVar;
    }

    @Override // h.g0
    public g.f b() {
        return this.f2003k;
    }

    @Override // h.g0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f2004l.getInternalPopup().a()) {
            return true;
        }
        this.f2004l.b();
        return true;
    }
}