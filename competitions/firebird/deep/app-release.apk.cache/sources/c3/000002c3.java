package m0;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class, Integer> f2292a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class, List<Constructor<? extends androidx.lifecycle.b>>> f2293b = new HashMap();

    public static androidx.lifecycle.b a(Constructor<? extends androidx.lifecycle.b> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        boolean z2;
        List arrayList;
        Map<Class, List<Constructor<? extends androidx.lifecycle.b>>> map;
        Integer num = (Integer) ((HashMap) f2292a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b2 = b(canonicalName);
                if (!name.isEmpty()) {
                    b2 = name + "." + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor != null) {
                map = f2293b;
                arrayList = Collections.singletonList(constructor);
            } else {
                androidx.lifecycle.a aVar = androidx.lifecycle.a.f887c;
                Boolean bool = aVar.f889b.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                aVar.f889b.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            } else if (((androidx.lifecycle.f) declaredMethods[i3].getAnnotation(androidx.lifecycle.f.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && b.class.isAssignableFrom(superclass)) {
                        arrayList = c(superclass) != 1 ? new ArrayList((Collection) ((HashMap) f2293b).get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class<?> cls2 = interfaces[i4];
                            if (cls2 != null && b.class.isAssignableFrom(cls2)) {
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll((Collection) ((HashMap) f2293b).get(cls2));
                            }
                            i4++;
                        } else if (arrayList != null) {
                            map = f2293b;
                        }
                    }
                }
            }
            ((HashMap) map).put(cls, arrayList);
            i2 = 2;
        }
        ((HashMap) f2292a).put(cls, Integer.valueOf(i2));
        return i2;
    }
}