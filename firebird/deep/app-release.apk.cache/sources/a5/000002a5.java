package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2221b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2222c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2223d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2224e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2225f;

    public l(o oVar, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f2221b = i2;
        this.f2222c = arrayList;
        this.f2223d = arrayList2;
        this.f2224e = arrayList3;
        this.f2225f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i2 = 0; i2 < this.f2221b; i2++) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            ((View) this.f2222c.get(i2)).setTransitionName((String) this.f2223d.get(i2));
            ((View) this.f2224e.get(i2)).setTransitionName((String) this.f2225f.get(i2));
        }
    }
}