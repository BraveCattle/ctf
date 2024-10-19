package u;

import u.e;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.a f2680b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2681c;

    public b(e.a aVar, Object obj) {
        this.f2680b = aVar;
        this.f2681c = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2680b.f2693a = this.f2681c;
    }
}