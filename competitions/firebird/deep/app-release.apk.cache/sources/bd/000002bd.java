package l0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2289a;

    /* renamed from: b  reason: collision with root package name */
    public final float f2290b;

    public d(float[] fArr) {
        this.f2289a = fArr;
        this.f2290b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f2289a;
        int min = Math.min((int) ((fArr.length - 1) * f2), fArr.length - 2);
        float f3 = this.f2290b;
        float f4 = (f2 - (min * f3)) / f3;
        float[] fArr2 = this.f2289a;
        return ((fArr2[min + 1] - fArr2[min]) * f4) + fArr2[min];
    }
}