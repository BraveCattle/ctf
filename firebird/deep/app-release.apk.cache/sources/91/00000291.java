package k;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f2159a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f3, boolean z2) {
        if (z2) {
            return (float) (((1.0d - f2159a) * f3) + f2);
        }
        return f2;
    }

    public static float b(float f2, float f3, boolean z2) {
        float f4 = f2 * 1.5f;
        if (z2) {
            return (float) (((1.0d - f2159a) * f3) + f4);
        }
        return f4;
    }
}