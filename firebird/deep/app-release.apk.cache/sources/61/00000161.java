package c;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public static Field f1362a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f1363b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f1364c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1365d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f1366e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1367f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f1368g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1369h;

    public static void a(Object obj) {
        if (!f1365d) {
            try {
                f1364c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f1365d = true;
        }
        Class<?> cls = f1364c;
        if (cls == null) {
            return;
        }
        if (!f1367f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1366e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f1367f = true;
        }
        Field field = f1366e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}