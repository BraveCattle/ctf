package c;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends e0.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f1354a;

    public k(g gVar) {
        this.f1354a = gVar;
    }

    @Override // e0.p
    public void a(View view) {
        this.f1354a.f1308p.setAlpha(1.0f);
        this.f1354a.f1311s.d(null);
        this.f1354a.f1311s = null;
    }

    @Override // e0.q, e0.p
    public void b(View view) {
        this.f1354a.f1308p.setVisibility(0);
        this.f1354a.f1308p.sendAccessibilityEvent(32);
        if (this.f1354a.f1308p.getParent() instanceof View) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            ((View) this.f1354a.f1308p.getParent()).requestApplyInsets();
        }
    }
}