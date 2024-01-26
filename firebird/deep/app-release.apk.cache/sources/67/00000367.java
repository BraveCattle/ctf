package x;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import b0.e;
import b0.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;
import w.a;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final j f2767a;

    /* renamed from: b  reason: collision with root package name */
    public static final l.f<String, Typeface> f2768b;

    static {
        j fVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            fVar = new i();
        } else if (i2 >= 28) {
            fVar = new h();
        } else if (i2 >= 26) {
            fVar = new g();
        } else {
            Method method = f.f2776d;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            fVar = method != null ? new f() : new e();
        }
        f2767a = fVar;
        f2768b = new l.f<>(16);
    }

    public static Typeface a(Context context, a.InterfaceC0037a interfaceC0037a, Resources resources, int i2, int i3, w.b bVar, Handler handler, boolean z2) {
        Typeface a2;
        if (interfaceC0037a instanceof a.d) {
            a.d dVar = (a.d) interfaceC0037a;
            boolean z3 = true;
            if (!z2 ? bVar != null : dVar.f2734c != 0) {
                z3 = false;
            }
            int i4 = z2 ? dVar.f2733b : -1;
            b0.a aVar = dVar.f2732a;
            l.f<String, Typeface> fVar = b0.e.f1257a;
            String str = aVar.f1249e + "-" + i3;
            a2 = b0.e.f1257a.a(str);
            if (a2 != null) {
                if (bVar != null) {
                    bVar.c(a2);
                }
            } else if (z3 && i4 == -1) {
                e.d b2 = b0.e.b(context, aVar, i3);
                if (bVar != null) {
                    int i5 = b2.f1270b;
                    if (i5 == 0) {
                        bVar.b(b2.f1269a, handler);
                    } else {
                        bVar.a(i5, handler);
                    }
                }
                a2 = b2.f1269a;
            } else {
                b0.b bVar2 = new b0.b(context, aVar, i3, str);
                a2 = null;
                if (z3) {
                    try {
                        a2 = ((e.d) b0.e.f1258b.b(bVar2, i4)).f1269a;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    b0.c cVar = bVar == null ? null : new b0.c(bVar, handler);
                    synchronized (b0.e.f1259c) {
                        l.h<String, ArrayList<f.c<e.d>>> hVar = b0.e.f1260d;
                        ArrayList<f.c<e.d>> orDefault = hVar.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (cVar != null) {
                                ArrayList<f.c<e.d>> arrayList = new ArrayList<>();
                                arrayList.add(cVar);
                                hVar.put(str, arrayList);
                            }
                            b0.f fVar2 = b0.e.f1258b;
                            b0.d dVar2 = new b0.d(str);
                            Objects.requireNonNull(fVar2);
                            fVar2.a(new b0.g(fVar2, bVar2, new Handler(), dVar2));
                        } else if (cVar != null) {
                            orDefault.add(cVar);
                        }
                    }
                }
            }
        } else {
            a2 = f2767a.a(context, (a.b) interfaceC0037a, resources, i3);
            if (bVar != null) {
                if (a2 != null) {
                    bVar.b(a2, handler);
                } else {
                    bVar.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            f2768b.b(c(resources, i2, i3), a2);
        }
        return a2;
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = f2767a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            f2768b.b(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}