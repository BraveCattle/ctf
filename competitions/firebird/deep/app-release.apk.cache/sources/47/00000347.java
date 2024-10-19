package u;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f2686a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f2687b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f2688c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f2689d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f2690e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f2691f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f2692g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f2693a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f2694b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2695c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2696d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2697e = false;

        public a(Activity activity) {
            this.f2694b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f2694b == activity) {
                this.f2694b = null;
                this.f2696d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f2696d || this.f2697e || this.f2695c) {
                return;
            }
            Object obj = this.f2693a;
            boolean z2 = false;
            try {
                Object obj2 = e.f2688c.get(activity);
                if (obj2 == obj) {
                    e.f2692g.postAtFrontOfQueue(new d(e.f2687b.get(activity), obj2));
                    z2 = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z2) {
                this.f2697e = true;
                this.f2693a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f2694b == activity) {
                this.f2695c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            u.e.f2692g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            u.e.f2686a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            u.e.f2687b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            u.e.f2688c = r0
            java.lang.Class<?> r0 = u.e.f2686a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3e
        L3c:
            r0 = r1
            goto L53
        L3e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3c
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3c
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L3c
        L53:
            u.e.f2689d = r0
            java.lang.Class<?> r0 = u.e.f2686a
            if (r0 != 0) goto L5b
        L59:
            r0 = r1
            goto L6c
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L59
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L59
            r7[r2] = r8     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L59
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L59
        L6c:
            u.e.f2690e = r0
            java.lang.Class<?> r0 = u.e.f2686a
            boolean r4 = a()
            if (r4 == 0) goto Lad
            if (r0 != 0) goto L79
            goto Lad
        L79:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lad
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lad
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lad
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lad
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lad
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lad
            r1 = r0
        Lad:
            u.e.f2691f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.e.<clinit>():void");
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }
}