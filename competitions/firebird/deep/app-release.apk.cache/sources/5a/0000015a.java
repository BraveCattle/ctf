package c;

import android.view.View;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f1352b;

    /* loaded from: classes.dex */
    public class a extends e0.q {
        public a() {
        }

        @Override // e0.p
        public void a(View view) {
            j.this.f1352b.f1308p.setAlpha(1.0f);
            j.this.f1352b.f1311s.d(null);
            j.this.f1352b.f1311s = null;
        }

        @Override // e0.q, e0.p
        public void b(View view) {
            j.this.f1352b.f1308p.setVisibility(0);
        }
    }

    public j(g gVar) {
        this.f1352b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar = this.f1352b;
        gVar.f1309q.showAtLocation(gVar.f1308p, 55, 0, 0);
        this.f1352b.I();
        if (this.f1352b.V()) {
            this.f1352b.f1308p.setAlpha(0.0f);
            g gVar2 = this.f1352b;
            e0.o a2 = e0.m.a(gVar2.f1308p);
            a2.a(1.0f);
            gVar2.f1311s = a2;
            e0.o oVar = this.f1352b.f1311s;
            a aVar = new a();
            View view = oVar.f1642a.get();
            if (view != null) {
                oVar.e(view, aVar);
                return;
            }
            return;
        }
        this.f1352b.f1308p.setAlpha(1.0f);
        this.f1352b.f1308p.setVisibility(0);
    }
}