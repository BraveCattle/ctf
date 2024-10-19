package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends e {

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList<e> f2461e0 = new ArrayList<>();

    public void E() {
        ArrayList<e> arrayList = this.f2461e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.f2461e0.get(i2);
            if (eVar instanceof l) {
                ((l) eVar).E();
            }
        }
    }

    @Override // o.e
    public void u() {
        this.f2461e0.clear();
        super.u();
    }

    @Override // o.e
    public void v(n.c cVar) {
        super.v(cVar);
        int size = this.f2461e0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f2461e0.get(i2).v(cVar);
        }
    }
}