package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f1837a;

    /* renamed from: d  reason: collision with root package name */
    public s0 f1840d;

    /* renamed from: e  reason: collision with root package name */
    public s0 f1841e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f1842f;

    /* renamed from: c  reason: collision with root package name */
    public int f1839c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final i f1838b = i.a();

    public d(View view) {
        this.f1837a = view;
    }

    public void a() {
        Drawable background = this.f1837a.getBackground();
        if (background != null) {
            boolean z2 = true;
            if (this.f1840d != null) {
                if (this.f1842f == null) {
                    this.f1842f = new s0();
                }
                s0 s0Var = this.f1842f;
                s0Var.f1993a = null;
                s0Var.f1996d = false;
                s0Var.f1994b = null;
                s0Var.f1995c = false;
                View view = this.f1837a;
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    s0Var.f1996d = true;
                    s0Var.f1993a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = this.f1837a.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    s0Var.f1995c = true;
                    s0Var.f1994b = backgroundTintMode;
                }
                if (s0Var.f1996d || s0Var.f1995c) {
                    i.f(background, s0Var, this.f1837a.getDrawableState());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            s0 s0Var2 = this.f1841e;
            if (s0Var2 != null) {
                i.f(background, s0Var2, this.f1837a.getDrawableState());
                return;
            }
            s0 s0Var3 = this.f1840d;
            if (s0Var3 != null) {
                i.f(background, s0Var3, this.f1837a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        s0 s0Var = this.f1841e;
        if (s0Var != null) {
            return s0Var.f1993a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        s0 s0Var = this.f1841e;
        if (s0Var != null) {
            return s0Var.f1994b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i2) {
        Context context = this.f1837a.getContext();
        int[] iArr = b.b.f1244z;
        u0 o2 = u0.o(context, attributeSet, iArr, i2, 0);
        View view = this.f1837a;
        e0.m.e(view, view.getContext(), iArr, attributeSet, o2.f2006b, i2, 0);
        try {
            if (o2.m(0)) {
                this.f1839c = o2.j(0, -1);
                ColorStateList d2 = this.f1838b.d(this.f1837a.getContext(), this.f1839c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (o2.m(1)) {
                this.f1837a.setBackgroundTintList(o2.b(1));
            }
            if (o2.m(2)) {
                this.f1837a.setBackgroundTintMode(d0.b(o2.h(2, -1), null));
            }
            o2.f2006b.recycle();
        } catch (Throwable th) {
            o2.f2006b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f1839c = -1;
        g(null);
        a();
    }

    public void f(int i2) {
        this.f1839c = i2;
        i iVar = this.f1838b;
        g(iVar != null ? iVar.d(this.f1837a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1840d == null) {
                this.f1840d = new s0();
            }
            s0 s0Var = this.f1840d;
            s0Var.f1993a = colorStateList;
            s0Var.f1996d = true;
        } else {
            this.f1840d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f1841e == null) {
            this.f1841e = new s0();
        }
        s0 s0Var = this.f1841e;
        s0Var.f1993a = colorStateList;
        s0Var.f1996d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f1841e == null) {
            this.f1841e = new s0();
        }
        s0 s0Var = this.f1841e;
        s0Var.f1994b = mode;
        s0Var.f1995c = true;
        a();
    }
}