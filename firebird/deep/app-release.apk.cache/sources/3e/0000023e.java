package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.x64m.xsfmnative.R;
import h.i;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: i  reason: collision with root package name */
    public static l0 f1936i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, l.i<ColorStateList>> f1938a;

    /* renamed from: b  reason: collision with root package name */
    public l.h<String, b> f1939b;

    /* renamed from: c  reason: collision with root package name */
    public l.i<String> f1940c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, l.e<WeakReference<Drawable.ConstantState>>> f1941d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f1942e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1943f;

    /* renamed from: g  reason: collision with root package name */
    public c f1944g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f1935h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final a f1937j = new a(6);

    /* loaded from: classes.dex */
    public static class a extends l.f<Integer, PorterDuffColorFilter> {
        public a(int i2) {
            super(i2);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    public static synchronized l0 c() {
        l0 l0Var;
        synchronized (l0.class) {
            if (f1936i == null) {
                f1936i = new l0();
            }
            l0Var = f1936i;
        }
        return l0Var;
    }

    public static synchronized PorterDuffColorFilter g(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (l0.class) {
            a aVar = f1937j;
            Objects.requireNonNull(aVar);
            int i3 = (i2 + 31) * 31;
            a2 = aVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(aVar);
                aVar.b(Integer.valueOf(mode.hashCode() + i3), a2);
            }
        }
        return a2;
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        boolean z2;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            l.e<WeakReference<Drawable.ConstantState>> eVar = this.f1941d.get(context);
            if (eVar == null) {
                eVar = new l.e<>();
                this.f1941d.put(context, eVar);
            }
            eVar.f(j2, new WeakReference<>(constantState));
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final Drawable b(Context context, int i2) {
        if (this.f1942e == null) {
            this.f1942e = new TypedValue();
        }
        TypedValue typedValue = this.f1942e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        c cVar = this.f1944g;
        LayerDrawable layerDrawable = null;
        if (cVar != null) {
            i.a aVar = (i.a) cVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{e(context, R.drawable.abc_cab_background_internal_bg), e(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable d(Context context, long j2) {
        l.e<WeakReference<Drawable.ConstantState>> eVar = this.f1941d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e2 = eVar.e(j2, null);
        if (e2 != null) {
            Drawable.ConstantState constantState = e2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = l.d.b(eVar.f2249b, eVar.f2251d, j2);
            if (b2 >= 0) {
                Object[] objArr = eVar.f2250c;
                Object obj = objArr[b2];
                Object obj2 = l.e.f2247e;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    eVar.f2248a = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable e(Context context, int i2) {
        return f(context, i2, false);
    }

    public synchronized Drawable f(Context context, int i2, boolean z2) {
        Drawable i3;
        if (!this.f1943f) {
            boolean z3 = true;
            this.f1943f = true;
            Drawable e2 = e(context, R.drawable.abc_vector_test);
            if (e2 != null) {
                if (!(e2 instanceof s0.b) && !"android.graphics.drawable.VectorDrawable".equals(e2.getClass().getName())) {
                    z3 = false;
                }
            }
            this.f1943f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        i3 = i(context, i2);
        if (i3 == null) {
            i3 = b(context, i2);
        }
        if (i3 == null) {
            Object obj = v.a.f2707a;
            i3 = context.getDrawable(i2);
        }
        if (i3 != null) {
            i3 = j(context, i2, z2, i3);
        }
        if (i3 != null) {
            int[] iArr = d0.f1843a;
        }
        return i3;
    }

    public synchronized ColorStateList h(Context context, int i2) {
        ColorStateList e2;
        l.i<ColorStateList> iVar;
        WeakHashMap<Context, l.i<ColorStateList>> weakHashMap = this.f1938a;
        ColorStateList colorStateList = null;
        e2 = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.e(i2, null);
        if (e2 == null) {
            c cVar = this.f1944g;
            if (cVar != null) {
                colorStateList = ((i.a) cVar).c(context, i2);
            }
            if (colorStateList != null) {
                if (this.f1938a == null) {
                    this.f1938a = new WeakHashMap<>();
                }
                l.i<ColorStateList> iVar2 = this.f1938a.get(context);
                if (iVar2 == null) {
                    iVar2 = new l.i<>(10);
                    this.f1938a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList);
            }
            e2 = colorStateList;
        }
        return e2;
    }

    public final Drawable i(Context context, int i2) {
        int next;
        l.h<String, b> hVar = this.f1939b;
        if (hVar == null || hVar.isEmpty()) {
            return null;
        }
        l.i<String> iVar = this.f1940c;
        if (iVar != null) {
            String e2 = iVar.e(i2, null);
            if ("appcompat_skip_skip".equals(e2) || (e2 != null && this.f1939b.getOrDefault(e2, null) == null)) {
                return null;
            }
        } else {
            this.f1940c = new l.i<>(10);
        }
        if (this.f1942e == null) {
            this.f1942e = new TypedValue();
        }
        TypedValue typedValue = this.f1942e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable d2 = d(context, j2);
        if (d2 != null) {
            return d2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1940c.a(i2, name);
                b bVar = this.f1939b.get(name);
                if (bVar != null) {
                    d2 = bVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (d2 != null) {
                    d2.setChangingConfigurations(typedValue.changingConfigurations);
                    a(context, j2, d2);
                }
            } catch (Exception e3) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e3);
            }
        }
        if (d2 == null) {
            this.f1940c.a(i2, "appcompat_skip_skip");
        }
        return d2;
    }

    public final Drawable j(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList h2 = h(context, i2);
        PorterDuff.Mode mode = null;
        if (h2 != null) {
            if (d0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(h2);
            c cVar = this.f1944g;
            if (cVar != null) {
                i.a aVar = (i.a) cVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode != null) {
                drawable.setTintMode(mode);
                return drawable;
            }
            return drawable;
        }
        c cVar2 = this.f1944g;
        if (cVar2 != null) {
            i.a aVar2 = (i.a) cVar2;
            boolean z3 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = p0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = i.f1885b;
                aVar2.d(findDrawableByLayerId, c2, mode2);
                aVar2.d(layerDrawable.findDrawableByLayerId(16908303), p0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.d(layerDrawable.findDrawableByLayerId(16908301), p0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = p0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = i.f1885b;
                aVar2.d(findDrawableByLayerId2, b2, mode3);
                aVar2.d(layerDrawable2.findDrawableByLayerId(16908303), p0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.d(layerDrawable2.findDrawableByLayerId(16908301), p0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z3 = false;
            }
            if (z3) {
                return drawable;
            }
        }
        if (k(context, i2, drawable) || !z2) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            h.l0$c r0 = r7.f1944g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L72
            h.i$a r0 = (h.i.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = h.i.f1885b
            int[] r4 = r0.f1888a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1d
            r5 = 2130903191(0x7f030097, float:1.7413193E38)
            goto L49
        L1d:
            int[] r4 = r0.f1890c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L29
            r5 = 2130903189(0x7f030095, float:1.7413189E38)
            goto L49
        L29:
            int[] r4 = r0.f1891d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L49
        L34:
            r0 = 2131165234(0x7f070032, float:1.794468E38)
            if (r9 != r0) goto L44
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L4b
        L44:
            r0 = 2131165210(0x7f07001a, float:1.794463E38)
            if (r9 != r0) goto L4d
        L49:
            r9 = r5
            r0 = r6
        L4b:
            r4 = r1
            goto L50
        L4d:
            r9 = r2
            r4 = r9
            r0 = r6
        L50:
            if (r4 == 0) goto L6e
            boolean r4 = h.d0.a(r10)
            if (r4 == 0) goto L5c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5c:
            int r8 = h.p0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = h.i.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6c
            r10.setAlpha(r0)
        L6c:
            r8 = r1
            goto L6f
        L6e:
            r8 = r2
        L6f:
            if (r8 == 0) goto L72
            goto L73
        L72:
            r1 = r2
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l0.k(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}