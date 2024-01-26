package c;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d  reason: collision with root package name */
    public static p f1374d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1375a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f1376b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1377c = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1378a;

        /* renamed from: b  reason: collision with root package name */
        public long f1379b;
    }

    public p(Context context, LocationManager locationManager) {
        this.f1375a = context;
        this.f1376b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f1376b.isProviderEnabled(str)) {
                return this.f1376b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}