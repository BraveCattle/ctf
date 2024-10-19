package e0;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public class s {

    /* renamed from: b  reason: collision with root package name */
    public static final s f1646b;

    /* renamed from: a  reason: collision with root package name */
    public final h f1647a;

    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static Field f1648c = null;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f1649d = false;

        /* renamed from: e  reason: collision with root package name */
        public static Constructor<WindowInsets> f1650e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f1651f = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f1652b;

        public a() {
            this.f1652b = d();
        }

        public a(s sVar) {
            this.f1652b = sVar.g();
        }

        public static WindowInsets d() {
            if (!f1649d) {
                try {
                    f1648c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f1649d = true;
            }
            Field field = f1648c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f1651f) {
                try {
                    f1650e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f1651f = true;
            }
            Constructor<WindowInsets> constructor = f1650e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // e0.s.c
        public s a() {
            return s.h(this.f1652b);
        }

        @Override // e0.s.c
        public void c(x.b bVar) {
            WindowInsets windowInsets = this.f1652b;
            if (windowInsets != null) {
                this.f1652b = windowInsets.replaceSystemWindowInsets(bVar.f2763a, bVar.f2764b, bVar.f2765c, bVar.f2766d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f1653b;

        public b() {
            this.f1653b = new WindowInsets.Builder();
        }

        public b(s sVar) {
            WindowInsets g2 = sVar.g();
            this.f1653b = g2 != null ? new WindowInsets.Builder(g2) : new WindowInsets.Builder();
        }

        @Override // e0.s.c
        public s a() {
            return s.h(this.f1653b.build());
        }

        @Override // e0.s.c
        public void b(x.b bVar) {
            this.f1653b.setStableInsets(Insets.of(bVar.f2763a, bVar.f2764b, bVar.f2765c, bVar.f2766d));
        }

        @Override // e0.s.c
        public void c(x.b bVar) {
            this.f1653b.setSystemWindowInsets(Insets.of(bVar.f2763a, bVar.f2764b, bVar.f2765c, bVar.f2766d));
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final s f1654a;

        public c() {
            this(new s((s) null));
        }

        public c(s sVar) {
            this.f1654a = sVar;
        }

        public s a() {
            throw null;
        }

        public void b(x.b bVar) {
        }

        public void c(x.b bVar) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class d extends h {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets f1655b;

        /* renamed from: c  reason: collision with root package name */
        public x.b f1656c;

        public d(s sVar, WindowInsets windowInsets) {
            super(sVar);
            this.f1656c = null;
            this.f1655b = windowInsets;
        }

        @Override // e0.s.h
        public final x.b f() {
            if (this.f1656c == null) {
                this.f1656c = x.b.a(this.f1655b.getSystemWindowInsetLeft(), this.f1655b.getSystemWindowInsetTop(), this.f1655b.getSystemWindowInsetRight(), this.f1655b.getSystemWindowInsetBottom());
            }
            return this.f1656c;
        }

        @Override // e0.s.h
        public s g(int i2, int i3, int i4, int i5) {
            s h2 = s.h(this.f1655b);
            c bVar = Build.VERSION.SDK_INT >= 29 ? new b(h2) : new a(h2);
            bVar.c(s.f(f(), i2, i3, i4, i5));
            bVar.b(s.f(e(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // e0.s.h
        public boolean i() {
            return this.f1655b.isRound();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: d  reason: collision with root package name */
        public x.b f1657d;

        public e(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
            this.f1657d = null;
        }

        @Override // e0.s.h
        public s b() {
            return s.h(this.f1655b.consumeStableInsets());
        }

        @Override // e0.s.h
        public s c() {
            return s.h(this.f1655b.consumeSystemWindowInsets());
        }

        @Override // e0.s.h
        public final x.b e() {
            if (this.f1657d == null) {
                this.f1657d = x.b.a(this.f1655b.getStableInsetLeft(), this.f1655b.getStableInsetTop(), this.f1655b.getStableInsetRight(), this.f1655b.getStableInsetBottom());
            }
            return this.f1657d;
        }

        @Override // e0.s.h
        public boolean h() {
            return this.f1655b.isConsumed();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
        }

        @Override // e0.s.h
        public s a() {
            return s.h(this.f1655b.consumeDisplayCutout());
        }

        @Override // e0.s.h
        public e0.c d() {
            DisplayCutout displayCutout = this.f1655b.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new e0.c(displayCutout);
        }

        @Override // e0.s.h
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return Objects.equals(this.f1655b, ((f) obj).f1655b);
            }
            return false;
        }

        @Override // e0.s.h
        public int hashCode() {
            return this.f1655b.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(s sVar, WindowInsets windowInsets) {
            super(sVar, windowInsets);
        }

        @Override // e0.s.d, e0.s.h
        public s g(int i2, int i3, int i4, int i5) {
            return s.h(this.f1655b.inset(i2, i3, i4, i5));
        }
    }

    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public final s f1658a;

        public h(s sVar) {
            this.f1658a = sVar;
        }

        public s a() {
            return this.f1658a;
        }

        public s b() {
            return this.f1658a;
        }

        public s c() {
            return this.f1658a;
        }

        public e0.c d() {
            return null;
        }

        public x.b e() {
            return x.b.f2762e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return i() == hVar.i() && h() == hVar.h() && Objects.equals(f(), hVar.f()) && Objects.equals(e(), hVar.e()) && Objects.equals(d(), hVar.d());
            }
            return false;
        }

        public x.b f() {
            return x.b.f2762e;
        }

        public s g(int i2, int i3, int i4, int i5) {
            return s.f1646b;
        }

        public boolean h() {
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), f(), e(), d());
        }

        public boolean i() {
            return false;
        }
    }

    static {
        f1646b = (Build.VERSION.SDK_INT >= 29 ? new b() : new a()).a().f1647a.a().f1647a.b().f1647a.c();
    }

    public s(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f1647a = i2 >= 29 ? new g(this, windowInsets) : i2 >= 28 ? new f(this, windowInsets) : new e(this, windowInsets);
    }

    public s(s sVar) {
        this.f1647a = new h(this);
    }

    public static x.b f(x.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f2763a - i2);
        int max2 = Math.max(0, bVar.f2764b - i3);
        int max3 = Math.max(0, bVar.f2765c - i4);
        int max4 = Math.max(0, bVar.f2766d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : x.b.a(max, max2, max3, max4);
    }

    public static s h(WindowInsets windowInsets) {
        Objects.requireNonNull(windowInsets);
        return new s(windowInsets);
    }

    public int a() {
        return e().f2766d;
    }

    public int b() {
        return e().f2763a;
    }

    public int c() {
        return e().f2765c;
    }

    public int d() {
        return e().f2764b;
    }

    public x.b e() {
        return this.f1647a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            return Objects.equals(this.f1647a, ((s) obj).f1647a);
        }
        return false;
    }

    public WindowInsets g() {
        h hVar = this.f1647a;
        if (hVar instanceof d) {
            return ((d) hVar).f1655b;
        }
        return null;
    }

    public int hashCode() {
        h hVar = this.f1647a;
        if (hVar == null) {
            return 0;
        }
        return hVar.hashCode();
    }
}