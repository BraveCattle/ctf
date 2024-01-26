package d1;

import android.content.Context;
import android.content.res.TypedArray;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1609a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1610b = {R.attr.colorSecondary};

    public static void a(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!hasValue) {
            throw new IllegalArgumentException(x.c.a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.TypedArray b(android.content.Context r8, android.util.AttributeSet r9, int[] r10, int r11, int r12, int... r13) {
        /*
            int[] r0 = u0.a.f2706h
            android.content.res.TypedArray r1 = r8.obtainStyledAttributes(r9, r0, r11, r12)
            r2 = 1
            r3 = 0
            boolean r4 = r1.getBoolean(r2, r3)
            r1.recycle()
            if (r4 == 0) goto L18
            int[] r1 = d1.e.f1610b
            java.lang.String r4 = "Theme.MaterialComponents"
            a(r8, r1, r4)
        L18:
            int[] r1 = d1.e.f1609a
            java.lang.String r4 = "Theme.AppCompat"
            a(r8, r1, r4)
            android.content.res.TypedArray r0 = r8.obtainStyledAttributes(r9, r0, r11, r12)
            r1 = 2
            boolean r1 = r0.getBoolean(r1, r3)
            if (r1 != 0) goto L2e
            r0.recycle()
            goto L59
        L2e:
            r1 = -1
            int r4 = r13.length
            if (r4 != 0) goto L39
            int r13 = r0.getResourceId(r3, r1)
            if (r13 == r1) goto L4c
            goto L54
        L39:
            android.content.res.TypedArray r4 = r8.obtainStyledAttributes(r9, r10, r11, r12)
            int r5 = r13.length
            r6 = r3
        L3f:
            if (r6 >= r5) goto L51
            r7 = r13[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L4e
            r4.recycle()
        L4c:
            r2 = r3
            goto L54
        L4e:
            int r6 = r6 + 1
            goto L3f
        L51:
            r4.recycle()
        L54:
            r0.recycle()
            if (r2 == 0) goto L5e
        L59:
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r9, r10, r11, r12)
            return r8
        L5e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.e.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):android.content.res.TypedArray");
    }
}