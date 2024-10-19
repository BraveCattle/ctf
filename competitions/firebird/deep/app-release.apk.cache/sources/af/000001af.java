package d1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* loaded from: classes.dex */
public class c extends androidx.appcompat.widget.b {

    /* renamed from: q  reason: collision with root package name */
    public Drawable f1596q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f1597r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f1598s;

    /* renamed from: t  reason: collision with root package name */
    public int f1599t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1600u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1601v;

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1597r = new Rect();
        this.f1598s = new Rect();
        this.f1599t = 119;
        this.f1600u = true;
        this.f1601v = false;
        TypedArray b2 = e.b(context, attributeSet, u0.a.f2702d, i2, 0, new int[0]);
        this.f1599t = b2.getInt(1, this.f1599t);
        Drawable drawable = b2.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f1600u = b2.getBoolean(2, true);
        b2.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f1596q;
        if (drawable != null) {
            if (this.f1601v) {
                this.f1601v = false;
                Rect rect = this.f1597r;
                Rect rect2 = this.f1598s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f1600u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f1599t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f1596q;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1596q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f1596q.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f1596q;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f1599t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1596q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f1601v = z2 | this.f1601v;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f1601v = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f1596q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f1596q);
            }
            this.f1596q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f1599t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i2) {
        if (this.f1599t != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f1599t = i2;
            if (i2 == 119 && this.f1596q != null) {
                this.f1596q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1596q;
    }
}