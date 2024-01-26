package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import e0.m;
import e0.o;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import v0.g;

/* loaded from: classes.dex */
public class c {

    /* renamed from: t  reason: collision with root package name */
    public static final TimeInterpolator f1513t = v0.a.f2709b;

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f1514u = {16842919, 16842910};

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f1515v = {16843623, 16842908, 16842910};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f1516w = {16842908, 16842910};

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f1517x = {16843623, 16842910};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f1518y = {16842910};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f1519z = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public Animator f1521b;

    /* renamed from: c  reason: collision with root package name */
    public g f1522c;

    /* renamed from: d  reason: collision with root package name */
    public g f1523d;

    /* renamed from: e  reason: collision with root package name */
    public g f1524e;

    /* renamed from: f  reason: collision with root package name */
    public g f1525f;

    /* renamed from: g  reason: collision with root package name */
    public final d1.d f1526g;

    /* renamed from: h  reason: collision with root package name */
    public float f1527h;

    /* renamed from: i  reason: collision with root package name */
    public float f1528i;

    /* renamed from: j  reason: collision with root package name */
    public float f1529j;

    /* renamed from: k  reason: collision with root package name */
    public float f1530k;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f1532m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f1533n;

    /* renamed from: o  reason: collision with root package name */
    public final d1.g f1534o;

    /* renamed from: p  reason: collision with root package name */
    public final f1.b f1535p;

    /* renamed from: r  reason: collision with root package name */
    public final Matrix f1537r;

    /* renamed from: s  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f1538s;

    /* renamed from: a  reason: collision with root package name */
    public int f1520a = 0;

    /* renamed from: l  reason: collision with root package name */
    public float f1531l = 1.0f;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f1536q = new Rect();

    /* loaded from: classes.dex */
    public class a extends f {
        public a(c cVar) {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {
        public b() {
            super(null);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0018c extends f {
        public C0018c() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public class e extends f {
        public e() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public abstract class f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public f(com.google.android.material.floatingactionbutton.a aVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(c.this);
            throw null;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            Objects.requireNonNull(c.this);
            throw null;
        }
    }

    public c(d1.g gVar, f1.b bVar) {
        new RectF();
        new RectF();
        this.f1537r = new Matrix();
        this.f1534o = gVar;
        this.f1535p = bVar;
        d1.d dVar = new d1.d();
        this.f1526g = dVar;
        dVar.a(f1514u, b(new C0018c()));
        dVar.a(f1515v, b(new b()));
        dVar.a(f1516w, b(new b()));
        dVar.a(f1517x, b(new b()));
        dVar.a(f1518y, b(new e()));
        dVar.a(f1519z, b(new a(this)));
        this.f1527h = gVar.getRotation();
    }

    public final AnimatorSet a(g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f1534o, View.ALPHA, f2);
        gVar.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f1534o, View.SCALE_X, f3);
        gVar.c("scale").a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f1534o, View.SCALE_Y, f3);
        gVar.c("scale").a(ofFloat3);
        arrayList.add(ofFloat3);
        this.f1537r.reset();
        this.f1534o.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f1534o, new v0.e(), new v0.f(), new Matrix(this.f1537r));
        gVar.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        b.a.g(animatorSet, arrayList);
        return animatorSet;
    }

    public final ValueAnimator b(f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f1513t);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float c() {
        throw null;
    }

    public void d(Rect rect) {
        throw null;
    }

    public boolean e() {
        return this.f1534o.getVisibility() != 0 ? this.f1520a == 2 : this.f1520a != 1;
    }

    public void f() {
        throw null;
    }

    public void g() {
        throw null;
    }

    public void h(int[] iArr) {
        throw null;
    }

    public void i(float f2, float f3, float f4) {
        throw null;
    }

    public void j(Rect rect) {
        throw null;
    }

    public final void k(float f2) {
        this.f1531l = f2;
        Matrix matrix = this.f1537r;
        matrix.reset();
        this.f1534o.getDrawable();
        this.f1534o.setImageMatrix(matrix);
    }

    public void l(ColorStateList colorStateList) {
        throw null;
    }

    public final boolean m() {
        d1.g gVar = this.f1534o;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        return gVar.isLaidOut() && !this.f1534o.isInEditMode();
    }

    public final void n() {
        Rect rect = this.f1536q;
        d(rect);
        j(rect);
        f1.b bVar = this.f1535p;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}