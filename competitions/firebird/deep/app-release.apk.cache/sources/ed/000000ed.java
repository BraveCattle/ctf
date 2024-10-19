package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d extends k.i implements k.m {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final k.n C;

    /* renamed from: a  reason: collision with root package name */
    public final int f1014a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1015b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1016c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f1017d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1018e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1019f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1020g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1021h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1022i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1023j;

    /* renamed from: k  reason: collision with root package name */
    public int f1024k;

    /* renamed from: l  reason: collision with root package name */
    public int f1025l;

    /* renamed from: m  reason: collision with root package name */
    public float f1026m;

    /* renamed from: n  reason: collision with root package name */
    public int f1027n;

    /* renamed from: o  reason: collision with root package name */
    public int f1028o;

    /* renamed from: p  reason: collision with root package name */
    public float f1029p;

    /* renamed from: s  reason: collision with root package name */
    public k f1032s;

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f1039z;

    /* renamed from: q  reason: collision with root package name */
    public int f1030q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1031r = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1033t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1034u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f1035v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f1036w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1037x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f1038y = new int[2];

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            int i2 = dVar.A;
            if (i2 == 1) {
                dVar.f1039z.cancel();
            } else if (i2 != 2) {
                return;
            }
            dVar.A = 3;
            ValueAnimator valueAnimator = dVar.f1039z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            dVar.f1039z.setDuration(500);
            dVar.f1039z.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends k.n {
        public b() {
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1042a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1042a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1042a) {
                this.f1042a = false;
            } else if (((Float) d.this.f1039z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.A = 0;
                dVar.i(0);
            } else {
                d dVar2 = d.this;
                dVar2.A = 2;
                dVar2.f1032s.invalidate();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0010d implements ValueAnimator.AnimatorUpdateListener {
        public C0010d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f1016c.setAlpha(floatValue);
            d.this.f1017d.setAlpha(floatValue);
            d.this.f1032s.invalidate();
        }
    }

    public d(k kVar, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1039z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f1016c = stateListDrawable;
        this.f1017d = drawable;
        this.f1020g = stateListDrawable2;
        this.f1021h = drawable2;
        this.f1018e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1019f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f1022i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1023j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1014a = i3;
        this.f1015b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0010d());
        k kVar2 = this.f1032s;
        if (kVar2 == kVar) {
            return;
        }
        if (kVar2 != null) {
            k.j jVar = kVar2.f1094k;
            if (jVar != null) {
                jVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            kVar2.f1098m.remove(this);
            if (kVar2.f1098m.isEmpty()) {
                kVar2.setWillNotDraw(kVar2.getOverScrollMode() == 2);
            }
            kVar2.z();
            kVar2.requestLayout();
            k kVar3 = this.f1032s;
            kVar3.f1100n.remove(this);
            if (kVar3.f1102o == this) {
                kVar3.f1102o = null;
            }
            List<k.n> list = this.f1032s.f1081d0;
            if (list != null) {
                list.remove(bVar);
            }
            e();
        }
        this.f1032s = kVar;
        k.j jVar2 = kVar.f1094k;
        if (jVar2 != null) {
            jVar2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (kVar.f1098m.isEmpty()) {
            kVar.setWillNotDraw(false);
        }
        kVar.f1098m.add(this);
        kVar.z();
        kVar.requestLayout();
        this.f1032s.f1100n.add(this);
        k kVar4 = this.f1032s;
        if (kVar4.f1081d0 == null) {
            kVar4.f1081d0 = new ArrayList();
        }
        kVar4.f1081d0.add(bVar);
    }

    @Override // androidx.recyclerview.widget.k.m
    public void a(boolean z2) {
    }

    @Override // androidx.recyclerview.widget.k.m
    public boolean b(k kVar, MotionEvent motionEvent) {
        int i2 = this.f1035v;
        if (i2 == 1) {
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            boolean f2 = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g2 || f2)) {
                if (f2) {
                    this.f1036w = 1;
                    this.f1029p = (int) motionEvent.getX();
                } else if (g2) {
                    this.f1036w = 2;
                    this.f1026m = (int) motionEvent.getY();
                }
                i(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.k.m
    public void c(k kVar, MotionEvent motionEvent) {
        if (this.f1035v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            boolean f2 = f(motionEvent.getX(), motionEvent.getY());
            if (g2 || f2) {
                if (f2) {
                    this.f1036w = 1;
                    this.f1029p = (int) motionEvent.getX();
                } else if (g2) {
                    this.f1036w = 2;
                    this.f1026m = (int) motionEvent.getY();
                }
                i(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f1035v == 2) {
            this.f1026m = 0.0f;
            this.f1029p = 0.0f;
            i(1);
            this.f1036w = 0;
        } else if (motionEvent.getAction() == 2 && this.f1035v == 2) {
            j();
            if (this.f1036w == 1) {
                float x2 = motionEvent.getX();
                int[] iArr = this.f1038y;
                int i2 = this.f1015b;
                iArr[0] = i2;
                iArr[1] = this.f1030q - i2;
                float max = Math.max(iArr[0], Math.min(iArr[1], x2));
                if (Math.abs(this.f1028o - max) >= 2.0f) {
                    int h2 = h(this.f1029p, max, iArr, this.f1032s.computeHorizontalScrollRange(), this.f1032s.computeHorizontalScrollOffset(), this.f1030q);
                    if (h2 != 0) {
                        this.f1032s.scrollBy(h2, 0);
                    }
                    this.f1029p = max;
                }
            }
            if (this.f1036w == 2) {
                float y2 = motionEvent.getY();
                int[] iArr2 = this.f1037x;
                int i3 = this.f1015b;
                iArr2[0] = i3;
                iArr2[1] = this.f1031r - i3;
                float max2 = Math.max(iArr2[0], Math.min(iArr2[1], y2));
                if (Math.abs(this.f1025l - max2) < 2.0f) {
                    return;
                }
                int h3 = h(this.f1026m, max2, iArr2, this.f1032s.computeVerticalScrollRange(), this.f1032s.computeVerticalScrollOffset(), this.f1031r);
                if (h3 != 0) {
                    this.f1032s.scrollBy(0, h3);
                }
                this.f1026m = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.k.i
    public void d(Canvas canvas, k kVar, k.s sVar) {
        if (this.f1030q != this.f1032s.getWidth() || this.f1031r != this.f1032s.getHeight()) {
            this.f1030q = this.f1032s.getWidth();
            this.f1031r = this.f1032s.getHeight();
            i(0);
        } else if (this.A != 0) {
            if (this.f1033t) {
                int i2 = this.f1030q;
                int i3 = this.f1018e;
                int i4 = i2 - i3;
                int i5 = this.f1025l;
                int i6 = this.f1024k;
                int i7 = i5 - (i6 / 2);
                this.f1016c.setBounds(0, 0, i3, i6);
                this.f1017d.setBounds(0, 0, this.f1019f, this.f1031r);
                k kVar2 = this.f1032s;
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                if (kVar2.getLayoutDirection() == 1) {
                    this.f1017d.draw(canvas);
                    canvas.translate(this.f1018e, i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f1016c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i4 = this.f1018e;
                } else {
                    canvas.translate(i4, 0.0f);
                    this.f1017d.draw(canvas);
                    canvas.translate(0.0f, i7);
                    this.f1016c.draw(canvas);
                }
                canvas.translate(-i4, -i7);
            }
            if (this.f1034u) {
                int i8 = this.f1031r;
                int i9 = this.f1022i;
                int i10 = i8 - i9;
                int i11 = this.f1028o;
                int i12 = this.f1027n;
                int i13 = i11 - (i12 / 2);
                this.f1020g.setBounds(0, 0, i12, i9);
                this.f1021h.setBounds(0, 0, this.f1030q, this.f1023j);
                canvas.translate(0.0f, i10);
                this.f1021h.draw(canvas);
                canvas.translate(i13, 0.0f);
                this.f1020g.draw(canvas);
                canvas.translate(-i13, -i10);
            }
        }
    }

    public final void e() {
        this.f1032s.removeCallbacks(this.B);
    }

    public boolean f(float f2, float f3) {
        if (f3 >= this.f1031r - this.f1022i) {
            int i2 = this.f1028o;
            int i3 = this.f1027n;
            if (f2 >= i2 - (i3 / 2) && f2 <= (i3 / 2) + i2) {
                return true;
            }
        }
        return false;
    }

    public boolean g(float f2, float f3) {
        k kVar = this.f1032s;
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        if (kVar.getLayoutDirection() == 1) {
            if (f2 > this.f1018e / 2) {
                return false;
            }
        } else if (f2 < this.f1030q - this.f1018e) {
            return false;
        }
        int i2 = this.f1025l;
        int i3 = this.f1024k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    public final int h(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void i(int i2) {
        int i3;
        if (i2 == 2 && this.f1035v != 2) {
            this.f1016c.setState(D);
            e();
        }
        if (i2 == 0) {
            this.f1032s.invalidate();
        } else {
            j();
        }
        if (this.f1035v != 2 || i2 == 2) {
            i3 = i2 == 1 ? 1500 : 1500;
            this.f1035v = i2;
        }
        this.f1016c.setState(E);
        i3 = 1200;
        e();
        this.f1032s.postDelayed(this.B, i3);
        this.f1035v = i2;
    }

    public void j() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            this.f1039z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f1039z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f1039z.setDuration(500L);
        this.f1039z.setStartDelay(0L);
        this.f1039z.start();
    }
}