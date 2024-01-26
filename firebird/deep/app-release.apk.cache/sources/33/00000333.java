package r0;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class s extends q.d {

    /* renamed from: a  reason: collision with root package name */
    public static Method f2634a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2635b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f2636c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2637d;

    public s() {
        super(1);
    }

    @Override // q.d
    public float a(View view) {
        if (!f2637d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f2636c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f2637d = true;
        }
        Method method = f2636c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
        return super.a(view);
    }

    @Override // q.d
    public void c(View view, float f2) {
        if (!f2635b) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setTransitionAlpha", Float.TYPE);
                f2634a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f2635b = true;
        }
        Method method = f2634a;
        if (method == null) {
            view.setAlpha(f2);
            return;
        }
        try {
            method.invoke(view, Float.valueOf(f2));
        } catch (IllegalAccessException unused) {
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3.getCause());
        }
    }
}