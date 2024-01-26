package r0;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class q {
    public static void a(ViewGroup viewGroup, boolean z2) {
        String str;
        if (!b.a.f1218b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", Boolean.TYPE);
                b.a.f1217a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            b.a.f1218b = true;
        }
        Method method = b.a.f1217a;
        if (method != null) {
            try {
                method.invoke(viewGroup, Boolean.valueOf(z2));
            } catch (IllegalAccessException e3) {
                e = e3;
                str = "Failed to invoke suppressLayout method";
                Log.i("ViewUtilsApi18", str, e);
            } catch (InvocationTargetException e4) {
                e = e4;
                str = "Error invoking suppressLayout method";
                Log.i("ViewUtilsApi18", str, e);
            }
        }
    }
}