package x;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b0.e;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w.a;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f2778g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f2779h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f2780i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f2781j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f2782k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f2783l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f2784m;

    public g() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method4 = o(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder a2 = c.f.a("Unable to collect necessary methods for class ");
            a2.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a2.toString(), e2);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2778g = cls;
        this.f2779h = constructor;
        this.f2780i = method3;
        this.f2781j = method4;
        this.f2782k = method5;
        this.f2783l = method2;
        this.f2784m = method;
    }

    private Object m() {
        try {
            return this.f2779h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // x.e, x.j
    public Typeface a(Context context, a.b bVar, Resources resources, int i2) {
        a.c[] cVarArr;
        if (l()) {
            Object m2 = m();
            if (m2 == null) {
                return null;
            }
            for (a.c cVar : bVar.f2725a) {
                if (!i(context, m2, cVar.f2726a, cVar.f2730e, cVar.f2727b, cVar.f2728c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f2729d))) {
                    h(m2);
                    return null;
                }
            }
            if (k(m2)) {
                return j(m2);
            }
            return null;
        }
        return super.a(context, bVar, resources, i2);
    }

    @Override // x.e, x.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        Typeface j2;
        boolean z2;
        if (cVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            e.c e2 = e(cVarArr, i2);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e2.f1264a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e2.f1266c).setItalic(e2.f1267d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        l.f<String, Typeface> fVar = b0.e.f1257a;
        HashMap hashMap = new HashMap();
        for (e.c cVar : cVarArr) {
            if (cVar.f1268e == 0) {
                Uri uri = cVar.f1264a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, k.d(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        int length = cVarArr.length;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < length) {
            e.c cVar2 = cVarArr[i3];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(cVar2.f1264a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f2781j.invoke(m2, byteBuffer, Integer.valueOf(cVar2.f1265b), null, Integer.valueOf(cVar2.f1266c), Integer.valueOf(cVar2.f1267d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    h(m2);
                    return null;
                }
                z3 = true;
            }
            i3++;
            z3 = z3;
        }
        if (!z3) {
            h(m2);
            return null;
        } else if (k(m2) && (j2 = j(m2)) != null) {
            return Typeface.create(j2, i2);
        } else {
            return null;
        }
    }

    @Override // x.j
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (l()) {
            Object m2 = m();
            if (m2 == null) {
                return null;
            }
            if (!i(context, m2, str, 0, -1, -1, null)) {
                h(m2);
                return null;
            } else if (k(m2)) {
                return j(m2);
            } else {
                return null;
            }
        }
        return super.d(context, resources, i2, str, i3);
    }

    public final void h(Object obj) {
        try {
            this.f2783l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2780i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2778g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2784m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f2782k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f2780i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2780i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}