package d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import h.l0;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1587a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<Object>> f1588b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1589c = new Object();

    public static Drawable a(Context context, int i2) {
        return l0.c().e(context, i2);
    }
}