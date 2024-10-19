package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2228b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f2229c;

    public n(o oVar, ArrayList arrayList, Map map) {
        this.f2228b = arrayList;
        this.f2229c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f2228b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2228b.get(i2);
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            view.setTransitionName((String) this.f2229c.get(view.getTransitionName()));
        }
    }
}