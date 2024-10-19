package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final l.h<String, Class<?>> f780a = new l.h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        l.h<String, Class<?>> hVar = f780a;
        Class<?> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            hVar.put(str, cls);
            return cls;
        }
        return orDefault;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}