package c0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import c.f;
import java.util.Objects;

/* loaded from: classes.dex */
public class a implements Spannable {

    /* renamed from: c0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0015a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f1414a;

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f1415b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1416c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1417d;

        public C0015a(PrecomputedText.Params params) {
            this.f1414a = params.getTextPaint();
            this.f1415b = params.getTextDirection();
            this.f1416c = params.getBreakStrategy();
            this.f1417d = params.getHyphenationFrequency();
        }

        @SuppressLint({"NewApi"})
        public C0015a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.f1414a = textPaint;
            this.f1415b = textDirectionHeuristic;
            this.f1416c = i2;
            this.f1417d = i3;
        }

        public boolean a(C0015a c0015a) {
            if (this.f1416c == c0015a.f1416c && this.f1417d == c0015a.f1417d && this.f1414a.getTextSize() == c0015a.f1414a.getTextSize() && this.f1414a.getTextScaleX() == c0015a.f1414a.getTextScaleX() && this.f1414a.getTextSkewX() == c0015a.f1414a.getTextSkewX() && this.f1414a.getLetterSpacing() == c0015a.f1414a.getLetterSpacing() && TextUtils.equals(this.f1414a.getFontFeatureSettings(), c0015a.f1414a.getFontFeatureSettings()) && this.f1414a.getFlags() == c0015a.f1414a.getFlags() && this.f1414a.getTextLocales().equals(c0015a.f1414a.getTextLocales())) {
                return this.f1414a.getTypeface() == null ? c0015a.f1414a.getTypeface() == null : this.f1414a.getTypeface().equals(c0015a.f1414a.getTypeface());
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0015a) {
                C0015a c0015a = (C0015a) obj;
                return a(c0015a) && this.f1415b == c0015a.f1415b;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Float.valueOf(this.f1414a.getTextSize()), Float.valueOf(this.f1414a.getTextScaleX()), Float.valueOf(this.f1414a.getTextSkewX()), Float.valueOf(this.f1414a.getLetterSpacing()), Integer.valueOf(this.f1414a.getFlags()), this.f1414a.getTextLocales(), this.f1414a.getTypeface(), Boolean.valueOf(this.f1414a.isElegantTextHeight()), this.f1415b, Integer.valueOf(this.f1416c), Integer.valueOf(this.f1417d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder a2 = f.a("textSize=");
            a2.append(this.f1414a.getTextSize());
            sb.append(a2.toString());
            sb.append(", textScaleX=" + this.f1414a.getTextScaleX());
            sb.append(", textSkewX=" + this.f1414a.getTextSkewX());
            int i2 = Build.VERSION.SDK_INT;
            StringBuilder a3 = f.a(", letterSpacing=");
            a3.append(this.f1414a.getLetterSpacing());
            sb.append(a3.toString());
            sb.append(", elegantTextHeight=" + this.f1414a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f1414a.getTextLocales());
            sb.append(", typeface=" + this.f1414a.getTypeface());
            if (i2 >= 26) {
                StringBuilder a4 = f.a(", variationSettings=");
                a4.append(this.f1414a.getFontVariationSettings());
                sb.append(a4.toString());
            }
            StringBuilder a5 = f.a(", textDir=");
            a5.append(this.f1415b);
            sb.append(a5.toString());
            sb.append(", breakStrategy=" + this.f1416c);
            sb.append(", hyphenationFrequency=" + this.f1417d);
            sb.append("}");
            return sb.toString();
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i2) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        int i4 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i2, int i3, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        int i2 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        int i5 = Build.VERSION.SDK_INT;
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i2, int i3) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }
}