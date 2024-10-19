package h;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public class r0 extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1991a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof r0) && !(context.getResources() instanceof t0)) {
            context.getResources();
            int i2 = z0.f2088a;
        }
        return context;
    }
}