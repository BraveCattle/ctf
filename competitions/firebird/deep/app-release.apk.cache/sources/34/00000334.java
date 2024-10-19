package r0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class t extends s {

    /* renamed from: e  reason: collision with root package name */
    public static Method f2638e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2639f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f2640g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2641h;

    @Override // q.d
    public void d(View view, Matrix matrix) {
        if (!f2639f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", Matrix.class);
                f2638e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f2639f = true;
        }
        Method method = f2638e;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    @Override // q.d
    public void e(View view, Matrix matrix) {
        if (!f2641h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", Matrix.class);
                f2640g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            f2641h = true;
        }
        Method method = f2640g;
        if (method != null) {
            try {
                method.invoke(view, matrix);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }
}