package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f2033a;

    /* renamed from: b  reason: collision with root package name */
    public s0 f2034b;

    /* renamed from: c  reason: collision with root package name */
    public s0 f2035c;

    /* renamed from: d  reason: collision with root package name */
    public s0 f2036d;

    /* renamed from: e  reason: collision with root package name */
    public s0 f2037e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f2038f;

    /* renamed from: g  reason: collision with root package name */
    public s0 f2039g;

    /* renamed from: h  reason: collision with root package name */
    public s0 f2040h;

    /* renamed from: i  reason: collision with root package name */
    public final z f2041i;

    /* renamed from: j  reason: collision with root package name */
    public int f2042j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2043k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f2044l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2045m;

    /* loaded from: classes.dex */
    public class a extends w.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f2046a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2047b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f2048c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.f2046a = i2;
            this.f2047b = i3;
            this.f2048c = weakReference;
        }

        @Override // w.b
        public void c(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f2046a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f2047b & 2) != 0);
            }
            x xVar = x.this;
            WeakReference weakReference = this.f2048c;
            if (xVar.f2045m) {
                xVar.f2044l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, xVar.f2042j);
                }
            }
        }
    }

    public x(TextView textView) {
        this.f2033a = textView;
        this.f2041i = new z(textView);
    }

    public static s0 c(Context context, i iVar, int i2) {
        ColorStateList d2 = iVar.d(context, i2);
        if (d2 != null) {
            s0 s0Var = new s0();
            s0Var.f1996d = true;
            s0Var.f1993a = d2;
            return s0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, s0 s0Var) {
        if (drawable == null || s0Var == null) {
            return;
        }
        i.f(drawable, s0Var, this.f2033a.getDrawableState());
    }

    public void b() {
        if (this.f2034b != null || this.f2035c != null || this.f2036d != null || this.f2037e != null) {
            Drawable[] compoundDrawables = this.f2033a.getCompoundDrawables();
            a(compoundDrawables[0], this.f2034b);
            a(compoundDrawables[1], this.f2035c);
            a(compoundDrawables[2], this.f2036d);
            a(compoundDrawables[3], this.f2037e);
        }
        if (this.f2038f == null && this.f2039g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f2033a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f2038f);
        a(compoundDrawablesRelative[2], this.f2039g);
    }

    public boolean d() {
        z zVar = this.f2041i;
        return zVar.i() && zVar.f2077a != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x036e, code lost:
        if (r3 != null) goto L151;
     */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.x.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String k2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, b.b.f1241w);
        u0 u0Var = new u0(context, obtainStyledAttributes);
        if (u0Var.m(14)) {
            this.f2033a.setAllCaps(u0Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (u0Var.m(0) && u0Var.d(0, -1) == 0) {
            this.f2033a.setTextSize(0, 0.0f);
        }
        l(context, u0Var);
        if (i3 >= 26 && u0Var.m(13) && (k2 = u0Var.k(13)) != null) {
            this.f2033a.setFontVariationSettings(k2);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f2044l;
        if (typeface != null) {
            this.f2033a.setTypeface(typeface, this.f2042j);
        }
    }

    public void g(int i2, int i3, int i4, int i5) {
        z zVar = this.f2041i;
        if (zVar.i()) {
            DisplayMetrics displayMetrics = zVar.f2086j.getResources().getDisplayMetrics();
            zVar.j(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (zVar.g()) {
                zVar.a();
            }
        }
    }

    public void h(int[] iArr, int i2) {
        z zVar = this.f2041i;
        if (zVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = zVar.f2086j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                zVar.f2082f = zVar.b(iArr2);
                if (!zVar.h()) {
                    StringBuilder a2 = c.f.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                zVar.f2083g = false;
            }
            if (zVar.g()) {
                zVar.a();
            }
        }
    }

    public void i(int i2) {
        z zVar = this.f2041i;
        if (zVar.i()) {
            if (i2 == 0) {
                zVar.f2077a = 0;
                zVar.f2080d = -1.0f;
                zVar.f2081e = -1.0f;
                zVar.f2079c = -1.0f;
                zVar.f2082f = new int[0];
                zVar.f2078b = false;
            } else if (i2 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
            } else {
                DisplayMetrics displayMetrics = zVar.f2086j.getResources().getDisplayMetrics();
                zVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (zVar.g()) {
                    zVar.a();
                }
            }
        }
    }

    public void j(ColorStateList colorStateList) {
        if (this.f2040h == null) {
            this.f2040h = new s0();
        }
        s0 s0Var = this.f2040h;
        s0Var.f1993a = colorStateList;
        s0Var.f1996d = colorStateList != null;
        this.f2034b = s0Var;
        this.f2035c = s0Var;
        this.f2036d = s0Var;
        this.f2037e = s0Var;
        this.f2038f = s0Var;
        this.f2039g = s0Var;
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f2040h == null) {
            this.f2040h = new s0();
        }
        s0 s0Var = this.f2040h;
        s0Var.f1994b = mode;
        s0Var.f1995c = mode != null;
        this.f2034b = s0Var;
        this.f2035c = s0Var;
        this.f2036d = s0Var;
        this.f2037e = s0Var;
        this.f2038f = s0Var;
        this.f2039g = s0Var;
    }

    public final void l(Context context, u0 u0Var) {
        String k2;
        Typeface create;
        Typeface typeface;
        this.f2042j = u0Var.h(2, this.f2042j);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int h2 = u0Var.h(11, -1);
            this.f2043k = h2;
            if (h2 != -1) {
                this.f2042j = (this.f2042j & 2) | 0;
            }
        }
        if (!u0Var.m(10) && !u0Var.m(12)) {
            if (u0Var.m(1)) {
                this.f2045m = false;
                int h3 = u0Var.h(1, 1);
                if (h3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f2044l = typeface;
                return;
            }
            return;
        }
        this.f2044l = null;
        int i3 = u0Var.m(12) ? 12 : 10;
        int i4 = this.f2043k;
        int i5 = this.f2042j;
        if (!context.isRestricted()) {
            try {
                Typeface g2 = u0Var.g(i3, this.f2042j, new a(i4, i5, new WeakReference(this.f2033a)));
                if (g2 != null) {
                    if (i2 >= 28 && this.f2043k != -1) {
                        g2 = Typeface.create(Typeface.create(g2, 0), this.f2043k, (this.f2042j & 2) != 0);
                    }
                    this.f2044l = g2;
                }
                this.f2045m = this.f2044l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2044l != null || (k2 = u0Var.k(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2043k == -1) {
            create = Typeface.create(k2, this.f2042j);
        } else {
            create = Typeface.create(Typeface.create(k2, 0), this.f2043k, (this.f2042j & 2) != 0);
        }
        this.f2044l = create;
    }
}