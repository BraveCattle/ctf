package k0;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2202b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f2203c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f2204d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Fragment f2205e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2206f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2207g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2208h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f2209i;

    public j(Object obj, o oVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2202b = obj;
        this.f2203c = oVar;
        this.f2204d = view;
        this.f2205e = fragment;
        this.f2206f = arrayList;
        this.f2207g = arrayList2;
        this.f2208h = arrayList3;
        this.f2209i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f2202b;
        if (obj != null) {
            this.f2203c.l(obj, this.f2204d);
            this.f2207g.addAll(androidx.fragment.app.i.h(this.f2203c, this.f2202b, this.f2205e, this.f2206f, this.f2204d));
        }
        if (this.f2208h != null) {
            if (this.f2209i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2204d);
                this.f2203c.m(this.f2209i, this.f2208h, arrayList);
            }
            this.f2208h.clear();
            this.f2208h.add(this.f2204d);
        }
    }
}