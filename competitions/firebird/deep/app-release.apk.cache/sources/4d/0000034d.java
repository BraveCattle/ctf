package v0;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f2708a;

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f2709b;

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f2710c;

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f2711d;

    static {
        new LinearInterpolator();
        f2708a = new l0.b();
        f2709b = new l0.a();
        f2710c = new l0.c();
        f2711d = new DecelerateInterpolator();
    }
}