package androidx.lifecycle;

import androidx.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f887c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, C0006a> f888a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class, Boolean> f889b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<c.a, List<b>> f890a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, c.a> f891b;

        public C0006a(Map<b, c.a> map) {
            this.f891b = map;
            for (Map.Entry<b, c.a> entry : map.entrySet()) {
                c.a value = entry.getValue();
                List<b> list = this.f890a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f890a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, m0.c cVar, c.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i2 = bVar.f892a;
                        if (i2 == 0) {
                            bVar.f893b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            bVar.f893b.invoke(obj, cVar);
                        } else if (i2 == 2) {
                            bVar.f893b.invoke(obj, cVar, aVar);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f892a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f893b;

        public b(int i2, Method method) {
            this.f892a = i2;
            this.f893b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f892a == bVar.f892a && this.f893b.getName().equals(bVar.f893b.getName());
        }

        public int hashCode() {
            return this.f893b.getName().hashCode() + (this.f892a * 31);
        }
    }

    public final C0006a a(Class cls, Method[] methodArr) {
        int i2;
        C0006a b2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f891b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c.a> entry : b(cls2).f891b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            f fVar = (f) method.getAnnotation(f.class);
            if (fVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (!parameterTypes[0].isAssignableFrom(m0.c.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i2 = 1;
                }
                c.a value = fVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(c.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != c.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new b(i2, method), value, cls);
                z2 = true;
            }
        }
        C0006a c0006a = new C0006a(hashMap);
        this.f888a.put(cls, c0006a);
        this.f889b.put(cls, Boolean.valueOf(z2));
        return c0006a;
    }

    public C0006a b(Class cls) {
        C0006a c0006a = this.f888a.get(cls);
        return c0006a != null ? c0006a : a(cls, null);
    }

    public final void c(Map<b, c.a> map, b bVar, c.a aVar, Class cls) {
        c.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f893b;
        StringBuilder a2 = c.f.a("Method ");
        a2.append(method.getName());
        a2.append(" in ");
        a2.append(cls.getName());
        a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
        a2.append(aVar2);
        a2.append(", new value ");
        a2.append(aVar);
        throw new IllegalArgumentException(a2.toString());
    }
}