package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.c;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f884a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0006a f885b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f884a = obj;
        this.f885b = a.f887c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.d
    public void c(m0.c cVar, c.a aVar) {
        a.C0006a c0006a = this.f885b;
        Object obj = this.f884a;
        a.C0006a.a(c0006a.f890a.get(aVar), cVar, aVar, obj);
        a.C0006a.a(c0006a.f890a.get(c.a.ON_ANY), cVar, aVar, obj);
    }
}