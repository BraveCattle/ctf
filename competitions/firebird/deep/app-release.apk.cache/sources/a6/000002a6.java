package k0;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2226b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f2227c;

    public m(o oVar, ArrayList arrayList, Map map) {
        this.f2226b = arrayList;
        this.f2227c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f2226b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f2226b.get(i2);
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f2227c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}