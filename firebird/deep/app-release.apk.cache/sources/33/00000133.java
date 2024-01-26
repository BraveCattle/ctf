package b0;

import android.os.Handler;
import b0.e;
import b0.f;

/* loaded from: classes.dex */
public class c implements f.c<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w.b f1254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Handler f1255b;

    public c(w.b bVar, Handler handler) {
        this.f1254a = bVar;
        this.f1255b = handler;
    }

    @Override // b0.f.c
    public void a(e.d dVar) {
        int i2;
        w.b bVar;
        e.d dVar2 = dVar;
        if (dVar2 == null) {
            bVar = this.f1254a;
            i2 = 1;
        } else {
            i2 = dVar2.f1270b;
            if (i2 == 0) {
                this.f1254a.b(dVar2.f1269a, this.f1255b);
                return;
            }
            bVar = this.f1254a;
        }
        bVar.a(i2, this.f1255b);
    }
}