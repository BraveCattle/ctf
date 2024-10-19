package b1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class b {
    public static float a(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot(f4 - f2, f5 - f3);
    }

    public static ColorStateList b(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i2);
    }

    public static float c(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }
}