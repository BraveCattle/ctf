package r0;

import android.graphics.Rect;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    public static Field f2631b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2632c;

    /* renamed from: a  reason: collision with root package name */
    public static final q.d f2630a = new u();

    /* renamed from: d  reason: collision with root package name */
    public static final Property<View, Float> f2633d = new a(Float.class, "translationAlpha");

    /* loaded from: classes.dex */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(r.a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f2) {
            float floatValue = f2.floatValue();
            r.f2630a.c(view, floatValue);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            view.setClipBounds(rect);
        }
    }

    static {
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f2630a.a(view);
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        f2630a.b(view, i2, i3, i4, i5);
    }

    public static void c(View view, int i2) {
        if (!f2632c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f2631b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }
            f2632c = true;
        }
        Field field = f2631b;
        if (field != null) {
            try {
                f2631b.setInt(view, i2 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}