package v0;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public class f implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f2716a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f2717b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f2718c = new Matrix();

    @Override // android.animation.TypeEvaluator
    public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f2716a);
        matrix2.getValues(this.f2717b);
        for (int i2 = 0; i2 < 9; i2++) {
            float[] fArr = this.f2717b;
            float f3 = fArr[i2];
            float[] fArr2 = this.f2716a;
            fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
        }
        this.f2718c.setValues(this.f2717b);
        return this.f2718c;
    }
}