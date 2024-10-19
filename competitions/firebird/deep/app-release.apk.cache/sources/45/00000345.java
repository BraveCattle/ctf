package u;

import android.app.Application;
import u.e;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Application f2682b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.a f2683c;

    public c(Application application, e.a aVar) {
        this.f2682b = application;
        this.f2683c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2682b.unregisterActivityLifecycleCallbacks(this.f2683c);
    }
}