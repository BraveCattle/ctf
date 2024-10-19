package b0;

import b0.e;
import b0.f;
import java.util.ArrayList;
import l.h;

/* loaded from: classes.dex */
public class d implements f.c<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f1256a;

    public d(String str) {
        this.f1256a = str;
    }

    @Override // b0.f.c
    /* renamed from: b */
    public void a(e.d dVar) {
        synchronized (e.f1259c) {
            h<String, ArrayList<f.c<e.d>>> hVar = e.f1260d;
            ArrayList<f.c<e.d>> arrayList = hVar.get(this.f1256a);
            if (arrayList == null) {
                return;
            }
            hVar.remove(this.f1256a);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).a(dVar);
            }
        }
    }
}