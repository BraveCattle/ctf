package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1980a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1981b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1982c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f1983d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1984e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1985f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1986g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b.f1228j);
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 == null || !d2.isStateful()) {
            ThreadLocal<TypedValue> threadLocal = f1980a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            context.getTheme().resolveAttribute(16842803, typedValue, true);
            float f2 = typedValue.getFloat();
            int c2 = c(context, i2);
            return x.a.c(c2, Math.round(Color.alpha(c2) * f2));
        }
        return d2.getColorForState(f1981b, d2.getDefaultColor());
    }

    public static int c(Context context, int i2) {
        int[] iArr = f1986g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f1986g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}