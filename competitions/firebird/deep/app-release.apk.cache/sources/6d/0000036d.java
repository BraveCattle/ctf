package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import b0.e;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import w.a;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, a.b> f2785a = new ConcurrentHashMap<>();

    public Typeface a(Context context, a.b bVar, Resources resources, int i2) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File c2 = k.c(context);
        if (c2 == null) {
            return null;
        }
        try {
            if (k.b(c2, inputStream)) {
                return Typeface.createFromFile(c2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c2.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File c2 = k.c(context);
        if (c2 == null) {
            return null;
        }
        try {
            if (k.a(c2, resources, i2)) {
                return Typeface.createFromFile(c2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c2.delete();
        }
    }

    public e.c e(e.c[] cVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        e.c cVar = null;
        int i4 = Integer.MAX_VALUE;
        for (e.c cVar2 : cVarArr) {
            int abs = (Math.abs(cVar2.f1266c - i3) * 2) + (cVar2.f1267d == z2 ? 0 : 1);
            if (cVar == null || i4 > abs) {
                cVar = cVar2;
                i4 = abs;
            }
        }
        return cVar;
    }
}