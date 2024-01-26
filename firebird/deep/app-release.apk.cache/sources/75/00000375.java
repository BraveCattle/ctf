package y0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f2801a;

    /* renamed from: b  reason: collision with root package name */
    public int f2802b;

    /* renamed from: c  reason: collision with root package name */
    public int f2803c;

    /* renamed from: d  reason: collision with root package name */
    public int f2804d;

    /* renamed from: e  reason: collision with root package name */
    public int f2805e;

    /* renamed from: f  reason: collision with root package name */
    public int f2806f;

    /* renamed from: g  reason: collision with root package name */
    public int f2807g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2808h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f2809i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2810j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f2811k;

    /* renamed from: o  reason: collision with root package name */
    public GradientDrawable f2815o;

    /* renamed from: p  reason: collision with root package name */
    public GradientDrawable f2816p;

    /* renamed from: q  reason: collision with root package name */
    public GradientDrawable f2817q;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f2812l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    public final Rect f2813m = new Rect();

    /* renamed from: n  reason: collision with root package name */
    public final RectF f2814n = new RectF();

    /* renamed from: r  reason: collision with root package name */
    public boolean f2818r = false;

    public c(a aVar) {
        this.f2801a = aVar;
    }

    @TargetApi(21)
    public final Drawable a() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f2815o = gradientDrawable;
        gradientDrawable.setCornerRadius(this.f2806f + 1.0E-5f);
        this.f2815o.setColor(-1);
        b();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.f2816p = gradientDrawable2;
        gradientDrawable2.setCornerRadius(this.f2806f + 1.0E-5f);
        this.f2816p.setColor(0);
        this.f2816p.setStroke(this.f2807g, this.f2810j);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{this.f2815o, this.f2816p}), this.f2802b, this.f2804d, this.f2803c, this.f2805e);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f2817q = gradientDrawable3;
        gradientDrawable3.setCornerRadius(this.f2806f + 1.0E-5f);
        this.f2817q.setColor(-1);
        return new b(e1.a.a(this.f2811k), insetDrawable, this.f2817q);
    }

    public final void b() {
        GradientDrawable gradientDrawable = this.f2815o;
        if (gradientDrawable != null) {
            gradientDrawable.setTintList(this.f2809i);
            PorterDuff.Mode mode = this.f2808h;
            if (mode != null) {
                this.f2815o.setTintMode(mode);
            }
        }
    }
}