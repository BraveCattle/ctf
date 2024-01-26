package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import b0.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w.a;

/* loaded from: classes.dex */
public class e extends j {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f2769b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f2770c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2771d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f2772e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2773f = false;

    public static boolean f(Object obj, String str, int i2, boolean z2) {
        g();
        try {
            return ((Boolean) f2771d.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2773f) {
            return;
        }
        f2773f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f2770c = constructor;
        f2769b = cls;
        f2771d = method2;
        f2772e = method;
    }

    @Override // x.j
    public Typeface a(Context context, a.b bVar, Resources resources, int i2) {
        a.c[] cVarArr;
        g();
        try {
            Object newInstance = f2770c.newInstance(new Object[0]);
            for (a.c cVar : bVar.f2725a) {
                File c2 = k.c(context);
                if (c2 == null) {
                    return null;
                }
                try {
                    if (!k.a(c2, resources, cVar.f2731f)) {
                        return null;
                    }
                    if (!f(newInstance, c2.getPath(), cVar.f2727b, cVar.f2728c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c2.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f2769b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2772e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // x.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        File file;
        FileInputStream fileInputStream;
        String readlink;
        if (cVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(e(cVarArr, i2).f1264a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface c2 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c2;
                }
                Typeface c22 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c22;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}