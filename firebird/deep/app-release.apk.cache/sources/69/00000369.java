package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import b0.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import w.a;

/* loaded from: classes.dex */
public class f extends j {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f2774b;

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<?> f2775c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f2776d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f2777e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f2775c = constructor;
        f2774b = cls;
        f2776d = method2;
        f2777e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f2776d.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2774b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2777e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // x.j
    public Typeface a(Context context, a.b bVar, Resources resources, int i2) {
        Object obj;
        a.c[] cVarArr;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f2775c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (a.c cVar : bVar.f2725a) {
            int i3 = cVar.f2731f;
            File c2 = k.c(context);
            if (c2 != null) {
                try {
                    if (k.a(c2, resources, i3)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(c2);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                                break;
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !f(obj, mappedByteBuffer, cVar.f2730e, cVar.f2727b, cVar.f2728c)) {
                            return null;
                        }
                    }
                } finally {
                    c2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return g(obj);
    }

    @Override // x.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        Object obj;
        try {
            obj = f2775c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        l.h hVar = new l.h();
        for (e.c cVar : cVarArr) {
            Uri uri = cVar.f1264a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = k.d(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !f(obj, byteBuffer, cVar.f1265b, cVar.f1266c, cVar.f1267d)) {
                return null;
            }
        }
        Typeface g2 = g(obj);
        if (g2 == null) {
            return null;
        }
        return Typeface.create(g2, i2);
    }
}