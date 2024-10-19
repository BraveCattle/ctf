package z0;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* loaded from: classes.dex */
public interface d {

    /* loaded from: classes.dex */
    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f2820b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f2821a = new e(null);

        @Override // android.animation.TypeEvaluator
        public e evaluate(float f2, e eVar, e eVar2) {
            e eVar3 = eVar;
            e eVar4 = eVar2;
            e eVar5 = this.f2821a;
            float c2 = b1.b.c(eVar3.f2824a, eVar4.f2824a, f2);
            float c3 = b1.b.c(eVar3.f2825b, eVar4.f2825b, f2);
            float c4 = b1.b.c(eVar3.f2826c, eVar4.f2826c, f2);
            eVar5.f2824a = c2;
            eVar5.f2825b = c3;
            eVar5.f2826c = c4;
            return this.f2821a;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f2822a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* renamed from: z0.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0040d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f2823a = new C0040d("circularRevealScrimColor");

        public C0040d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f2824a;

        /* renamed from: b  reason: collision with root package name */
        public float f2825b;

        /* renamed from: c  reason: collision with root package name */
        public float f2826c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.f2824a = f2;
            this.f2825b = f3;
            this.f2826c = f4;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}