package h;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1832a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1832a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f1832a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f1832a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static boolean b(View view) {
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        return view.getLayoutDirection() == 1;
    }
}