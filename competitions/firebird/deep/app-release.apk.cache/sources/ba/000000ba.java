package androidx.lifecycle;

import androidx.lifecycle.c;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements d {

    /* renamed from: a  reason: collision with root package name */
    public final b[] f865a;

    public CompositeGeneratedAdaptersObserver(b[] bVarArr) {
        this.f865a = bVarArr;
    }

    @Override // androidx.lifecycle.d
    public void c(m0.c cVar, c.a aVar) {
        k0.d dVar = new k0.d();
        for (b bVar : this.f865a) {
            bVar.a(cVar, aVar, false, dVar);
        }
        for (b bVar2 : this.f865a) {
            bVar2.a(cVar, aVar, true, dVar);
        }
    }
}