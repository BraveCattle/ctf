package h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class z {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f2074l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f2075m = new ConcurrentHashMap<>();

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f2076n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f2077a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2078b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f2079c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f2080d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f2081e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f2082f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f2083g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f2084h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f2085i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f2086j;

    /* renamed from: k  reason: collision with root package name */
    public final c f2087k;

    /* loaded from: classes.dex */
    public static class a extends c {
        @Override // h.z.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) z.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
        @Override // h.z.a, h.z.c
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // h.z.c
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) z.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public z(TextView textView) {
        this.f2085i = textView;
        this.f2086j = textView.getContext();
        this.f2087k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static Method d(String str) {
        try {
            Method method = f2075m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f2075m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t2) {
        try {
            return (T) d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    public void a() {
        if (i() && this.f2077a != 0) {
            if (this.f2078b) {
                if (this.f2085i.getMeasuredHeight() <= 0 || this.f2085i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f2087k.b(this.f2085i) ? 1048576 : (this.f2085i.getMeasuredWidth() - this.f2085i.getTotalPaddingLeft()) - this.f2085i.getTotalPaddingRight();
                int height = (this.f2085i.getHeight() - this.f2085i.getCompoundPaddingBottom()) - this.f2085i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f2074l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float c2 = c(rectF);
                    if (c2 != this.f2085i.getTextSize()) {
                        f(0, c2);
                    }
                }
            }
            this.f2078b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f2082f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                int i6 = this.f2082f[i5];
                CharSequence text = this.f2085i.getText();
                TransformationMethod transformationMethod = this.f2085i.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f2085i)) != null) {
                    text = transformation;
                }
                int maxLines = this.f2085i.getMaxLines();
                TextPaint textPaint = this.f2084h;
                if (textPaint == null) {
                    this.f2084h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f2084h.set(this.f2085i.getPaint());
                this.f2084h.setTextSize(i6);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f2084h, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) e(this.f2085i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f2085i.getLineSpacingExtra(), this.f2085i.getLineSpacingMultiplier()).setIncludePad(this.f2085i.getIncludeFontPadding()).setBreakStrategy(this.f2085i.getBreakStrategy()).setHyphenationFrequency(this.f2085i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f2087k.a(obtain, this.f2085i);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    int i7 = i5 + 1;
                    i4 = i3;
                    i3 = i7;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f2082f[i4];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void f(int i2, float f2) {
        Context context = this.f2086j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f2085i.getPaint().getTextSize()) {
            this.f2085i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f2085i.isInLayout();
            if (this.f2085i.getLayout() != null) {
                this.f2078b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f2085i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    this.f2085i.forceLayout();
                } else {
                    this.f2085i.requestLayout();
                }
                this.f2085i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (i() && this.f2077a == 1) {
            if (!this.f2083g || this.f2082f.length == 0) {
                int floor = ((int) Math.floor((this.f2081e - this.f2080d) / this.f2079c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((i2 * this.f2079c) + this.f2080d);
                }
                this.f2082f = b(iArr);
            }
            this.f2078b = true;
        } else {
            this.f2078b = false;
        }
        return this.f2078b;
    }

    public final boolean h() {
        int[] iArr = this.f2082f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f2083g = z2;
        if (z2) {
            this.f2077a = 1;
            this.f2080d = iArr[0];
            this.f2081e = iArr[length - 1];
            this.f2079c = -1.0f;
        }
        return z2;
    }

    public final boolean i() {
        return !(this.f2085i instanceof j);
    }

    public final void j(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        } else {
            this.f2077a = 1;
            this.f2080d = f2;
            this.f2081e = f3;
            this.f2079c = f4;
            this.f2083g = false;
        }
    }
}