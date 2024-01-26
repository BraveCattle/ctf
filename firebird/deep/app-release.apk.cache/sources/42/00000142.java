package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1287a;

        public C0013a(int i2, int i3) {
            super(i2, i3);
            this.f1287a = 0;
            this.f1287a = 8388627;
        }

        public C0013a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1287a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1220b);
            this.f1287a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0013a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1287a = 0;
        }

        public C0013a(C0013a c0013a) {
            super((ViewGroup.MarginLayoutParams) c0013a);
            this.f1287a = 0;
            this.f1287a = c0013a.f1287a;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z2);
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public abstract void a(boolean z2);

    public abstract Context b();

    public abstract void c(boolean z2);
}