package q0;

import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.savedstate.Recreator;
import androidx.savedstate.a;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f2553a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.savedstate.a f2554b = new androidx.savedstate.a();

    public a(b bVar) {
        this.f2553a = bVar;
    }

    public void a(Bundle bundle) {
        c a2 = this.f2553a.a();
        if (((e) a2).f901b == c.b.INITIALIZED) {
            a2.a(new Recreator(this.f2553a));
            final androidx.savedstate.a aVar = this.f2554b;
            if (aVar.f1215c) {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            if (bundle != null) {
                aVar.f1214b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            a2.a(new d() { // from class: androidx.savedstate.SavedStateRegistry$1
                @Override // androidx.lifecycle.d
                public void c(m0.c cVar, c.a aVar2) {
                    if (aVar2 == c.a.ON_START || aVar2 == c.a.ON_STOP) {
                        Objects.requireNonNull(a.this);
                    }
                }
            });
            aVar.f1215c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        androidx.savedstate.a aVar = this.f2554b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1214b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        j.b<String, a.b>.d b2 = aVar.f1213a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}