package e1;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.StateSet;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1659a = {16842919};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1660b = {16842913, 16842919};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1661c = {16842913};

    public static ColorStateList a(ColorStateList colorStateList) {
        return new ColorStateList(new int[][]{f1661c, StateSet.NOTHING}, new int[]{b(colorStateList, f1660b), b(colorStateList, f1659a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return x.a.c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }
}