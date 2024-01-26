package g0;

import android.graphics.Paint;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import c0.a;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f1806a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1807b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f1808c;

        /* renamed from: d  reason: collision with root package name */
        public Method f1809d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1810e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1811f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f1806a = callback;
            this.f1807b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f1806a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f1806a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f1806a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.d.a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r7 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r5 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c0.a.C0015a a(android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            c0.a$a r0 = new c0.a$a
            android.text.PrecomputedText$Params r7 = r7.getTextMetricsParams()
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = r7.getBreakStrategy()
            int r4 = r7.getHyphenationFrequency()
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L75
        L2e:
            r5 = 0
            r6 = 1
            if (r0 < r1) goto L57
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L57
            java.util.Locale r7 = r7.getTextLocale()
            android.icu.text.DecimalFormatSymbols r7 = android.icu.text.DecimalFormatSymbols.getInstance(r7)
            java.lang.String[] r7 = r7.getDigitStrings()
            r7 = r7[r5]
            int r7 = r7.codePointAt(r5)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r6) goto L6d
            r0 = 2
            if (r7 != r0) goto L2b
            goto L6d
        L57:
            int r0 = r7.getLayoutDirection()
            if (r0 != r6) goto L5e
            r5 = r6
        L5e:
            int r7 = r7.getTextDirection()
            switch(r7) {
                case 2: goto L70;
                case 3: goto L2b;
                case 4: goto L6d;
                case 5: goto L6a;
                case 6: goto L73;
                case 7: goto L67;
                default: goto L65;
            }
        L65:
            if (r5 == 0) goto L73
        L67:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L75
        L6a:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L75
        L6d:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L75
        L70:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L75
        L73:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L75:
            c0.a$a r0 = new c0.a$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.d.a(android.widget.TextView):c0.a$a");
    }

    public static void b(TextView textView, int i2) {
        b.a.b(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i2) {
        b.a.b(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void d(TextView textView, int i2) {
        b.a.b(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void e(TextView textView, c0.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(aVar);
            textView.setText((CharSequence) null);
            return;
        }
        a.C0015a a2 = a(textView);
        Objects.requireNonNull(aVar);
        a2.a(null);
        throw null;
    }

    public static ActionMode.Callback f(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof a)) ? callback : new a(callback, textView);
    }
}