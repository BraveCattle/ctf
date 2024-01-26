package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class t extends p {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1997d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1998e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1999f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f2000g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2001h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2002i;

    public t(SeekBar seekBar) {
        super(seekBar);
        this.f1999f = null;
        this.f2000g = null;
        this.f2001h = false;
        this.f2002i = false;
        this.f1997d = seekBar;
    }

    @Override // h.p
    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f1997d.getContext();
        int[] iArr = b.b.f1225g;
        u0 o2 = u0.o(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f1997d;
        e0.m.e(seekBar, seekBar.getContext(), iArr, attributeSet, o2.f2006b, i2, 0);
        Drawable f2 = o2.f(0);
        if (f2 != null) {
            this.f1997d.setThumb(f2);
        }
        Drawable e2 = o2.e(1);
        Drawable drawable = this.f1998e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1998e = e2;
        if (e2 != null) {
            e2.setCallback(this.f1997d);
            SeekBar seekBar2 = this.f1997d;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            e2.setLayoutDirection(seekBar2.getLayoutDirection());
            if (e2.isStateful()) {
                e2.setState(this.f1997d.getDrawableState());
            }
            c();
        }
        this.f1997d.invalidate();
        if (o2.m(3)) {
            this.f2000g = d0.b(o2.h(3, -1), this.f2000g);
            this.f2002i = true;
        }
        if (o2.m(2)) {
            this.f1999f = o2.b(2);
            this.f2001h = true;
        }
        o2.f2006b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1998e;
        if (drawable != null) {
            if (this.f2001h || this.f2002i) {
                Drawable mutate = drawable.mutate();
                this.f1998e = mutate;
                if (this.f2001h) {
                    mutate.setTintList(this.f1999f);
                }
                if (this.f2002i) {
                    this.f1998e.setTintMode(this.f2000g);
                }
                if (this.f1998e.isStateful()) {
                    this.f1998e.setState(this.f1997d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1998e != null) {
            int max = this.f1997d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1998e.getIntrinsicWidth();
                int intrinsicHeight = this.f1998e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1998e.setBounds(-i2, -i3, i2, i3);
                float width = ((this.f1997d.getWidth() - this.f1997d.getPaddingLeft()) - this.f1997d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f1997d.getPaddingLeft(), this.f1997d.getHeight() / 2);
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f1998e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}