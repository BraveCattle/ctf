package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1933a;

    /* renamed from: b  reason: collision with root package name */
    public s0 f1934b;

    public l(ImageView imageView) {
        this.f1933a = imageView;
    }

    public void a() {
        s0 s0Var;
        Drawable drawable = this.f1933a.getDrawable();
        if (drawable != null) {
            int[] iArr = d0.f1843a;
        }
        if (drawable == null || (s0Var = this.f1934b) == null) {
            return;
        }
        i.f(drawable, s0Var, this.f1933a.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i2) {
        int j2;
        Context context = this.f1933a.getContext();
        int[] iArr = b.b.f1224f;
        u0 o2 = u0.o(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f1933a;
        e0.m.e(imageView, imageView.getContext(), iArr, attributeSet, o2.f2006b, i2, 0);
        try {
            Drawable drawable = this.f1933a.getDrawable();
            if (drawable == null && (j2 = o2.j(1, -1)) != -1 && (drawable = d.a.a(this.f1933a.getContext(), j2)) != null) {
                this.f1933a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = d0.f1843a;
            }
            if (o2.m(2)) {
                this.f1933a.setImageTintList(o2.b(2));
            }
            if (o2.m(3)) {
                this.f1933a.setImageTintMode(d0.b(o2.h(3, -1), null));
            }
            o2.f2006b.recycle();
        } catch (Throwable th) {
            o2.f2006b.recycle();
            throw th;
        }
    }

    public void c(int i2) {
        if (i2 != 0) {
            Drawable a2 = d.a.a(this.f1933a.getContext(), i2);
            if (a2 != null) {
                int[] iArr = d0.f1843a;
            }
            this.f1933a.setImageDrawable(a2);
        } else {
            this.f1933a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f1934b == null) {
            this.f1934b = new s0();
        }
        s0 s0Var = this.f1934b;
        s0Var.f1993a = colorStateList;
        s0Var.f1996d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f1934b == null) {
            this.f1934b = new s0();
        }
        s0 s0Var = this.f1934b;
        s0Var.f1994b = mode;
        s0Var.f1995c = true;
        a();
    }
}