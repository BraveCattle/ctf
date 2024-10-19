package k0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d implements r0.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2169a;

    /* renamed from: b  reason: collision with root package name */
    public e<?> f2170b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, k0.e<?>] */
    public d() {
        this.f2169a = 1;
        this.f2170b = new HashMap();
    }

    @Override // r0.p
    public void a(View view) {
        ((ViewGroupOverlay) this.f2170b).remove(view);
    }

    public void b() {
        this.f2170b.f2175f.X();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.ViewGroupOverlay, k0.e<?>] */
    public d(ViewGroup viewGroup) {
        this.f2169a = 2;
        this.f2170b = viewGroup.getOverlay();
    }

    public d(e eVar) {
        this.f2169a = 0;
        this.f2170b = eVar;
    }
}