package u;

import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2684b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2685c;

    public d(Object obj, Object obj2) {
        this.f2684b = obj;
        this.f2685c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = e.f2689d;
            if (method != null) {
                method.invoke(this.f2684b, this.f2685c, Boolean.FALSE, "AppCompat recreation");
            } else {
                e.f2690e.invoke(this.f2684b, this.f2685c, Boolean.FALSE);
            }
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}