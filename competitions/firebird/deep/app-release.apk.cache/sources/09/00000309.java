package r0;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends r0.g {
    public static final Property<View, PointF> A;
    public static final Property<View, PointF> B;
    public static final Property<View, PointF> C;

    /* renamed from: x  reason: collision with root package name */
    public static final String[] f2557x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y  reason: collision with root package name */
    public static final Property<i, PointF> f2558y;

    /* renamed from: z  reason: collision with root package name */
    public static final Property<i, PointF> f2559z;

    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f2560a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f2560a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f2560a);
            Rect rect = this.f2560a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f2560a);
            this.f2560a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f2560a);
        }
    }

    /* renamed from: r0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0034b extends Property<i, PointF> {
        public C0034b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f2562a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2563b = round;
            int i2 = iVar2.f2567f + 1;
            iVar2.f2567f = i2;
            if (i2 == iVar2.f2568g) {
                r.b(iVar2.f2566e, iVar2.f2562a, round, iVar2.f2564c, iVar2.f2565d);
                iVar2.f2567f = 0;
                iVar2.f2568g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(i iVar, PointF pointF) {
            i iVar2 = iVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(iVar2);
            iVar2.f2564c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            iVar2.f2565d = round;
            int i2 = iVar2.f2568g + 1;
            iVar2.f2568g = i2;
            if (iVar2.f2567f == i2) {
                r.b(iVar2.f2566e, iVar2.f2562a, iVar2.f2563b, iVar2.f2564c, round);
                iVar2.f2567f = 0;
                iVar2.f2568g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            r.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            r.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.mViewBounds = iVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2561a;

        public h(b bVar, ViewGroup viewGroup) {
            this.f2561a = viewGroup;
        }

        @Override // r0.g.d
        public void b(r0.g gVar) {
            q.a(this.f2561a, false);
            gVar.v(this);
        }

        @Override // r0.j, r0.g.d
        public void c(r0.g gVar) {
            q.a(this.f2561a, false);
        }

        @Override // r0.j, r0.g.d
        public void d(r0.g gVar) {
            q.a(this.f2561a, true);
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f2562a;

        /* renamed from: b  reason: collision with root package name */
        public int f2563b;

        /* renamed from: c  reason: collision with root package name */
        public int f2564c;

        /* renamed from: d  reason: collision with root package name */
        public int f2565d;

        /* renamed from: e  reason: collision with root package name */
        public View f2566e;

        /* renamed from: f  reason: collision with root package name */
        public int f2567f;

        /* renamed from: g  reason: collision with root package name */
        public int f2568g;

        public i(View view) {
            this.f2566e = view;
        }
    }

    static {
        new a(PointF.class, "boundsOrigin");
        f2558y = new C0034b(PointF.class, "topLeft");
        f2559z = new c(PointF.class, "bottomRight");
        A = new d(PointF.class, "bottomRight");
        B = new e(PointF.class, "topLeft");
        C = new f(PointF.class, "position");
    }

    public final void H(o oVar) {
        View view = oVar.f2628b;
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        oVar.f2627a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        oVar.f2627a.put("android:changeBounds:parent", oVar.f2628b.getParent());
    }

    @Override // r0.g
    public void d(o oVar) {
        H(oVar);
    }

    @Override // r0.g
    public void g(o oVar) {
        H(oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // r0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator k(android.view.ViewGroup r19, r0.o r20, r0.o r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.k(android.view.ViewGroup, r0.o, r0.o):android.animation.Animator");
    }

    @Override // r0.g
    public String[] p() {
        return f2557x;
    }
}