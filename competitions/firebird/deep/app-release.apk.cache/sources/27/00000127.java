package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.savedstate.a;
import f.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import m0.c;
import q0.b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements d {

    /* renamed from: a  reason: collision with root package name */
    public final b f1211a;

    public Recreator(b bVar) {
        this.f1211a = bVar;
    }

    @Override // androidx.lifecycle.d
    public void c(c cVar, c.a aVar) {
        Class cls;
        if (aVar == c.a.ON_CREATE) {
            ((e) cVar.a()).f900a.d(this);
            a c2 = this.f1211a.c();
            if (!c2.f1215c) {
                throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            }
            Bundle bundle = c2.f1214b;
            Bundle bundle2 = null;
            if (bundle != null) {
                Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                c2.f1214b.remove("androidx.savedstate.Restarter");
                if (c2.f1214b.isEmpty()) {
                    c2.f1214b = null;
                }
                bundle2 = bundle3;
            }
            if (bundle2 == null) {
                return;
            }
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
            if (stringArrayList == null) {
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    try {
                        Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0012a.class).getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            ((a.InterfaceC0012a) declaredConstructor.newInstance(new Object[0])).a(this.f1211a);
                        } catch (Exception e2) {
                            throw new RuntimeException(f.a("Failed to instantiate ", next), e2);
                        }
                    } catch (NoSuchMethodException e3) {
                        StringBuilder a2 = c.f.a("Class");
                        a2.append(cls.getSimpleName());
                        a2.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(a2.toString(), e3);
                    }
                } catch (ClassNotFoundException e4) {
                    throw new RuntimeException(x.c.a("Class ", next, " wasn't found"), e4);
                }
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}