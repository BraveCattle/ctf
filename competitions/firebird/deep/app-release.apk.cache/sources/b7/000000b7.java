package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.i;
import java.util.ArrayList;
import k0.o;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l.a f845c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f846d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i.a f847e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f848f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f849g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Fragment f850h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Fragment f851i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f852j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f853k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f854l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Rect f855m;

    public h(o oVar, l.a aVar, Object obj, i.a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f844b = oVar;
        this.f845c = aVar;
        this.f846d = obj;
        this.f847e = aVar2;
        this.f848f = arrayList;
        this.f849g = view;
        this.f850h = fragment;
        this.f851i = fragment2;
        this.f852j = z2;
        this.f853k = arrayList2;
        this.f854l = obj2;
        this.f855m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.a<String, View> e2 = i.e(this.f844b, this.f845c, this.f846d, this.f847e);
        if (e2 != null) {
            this.f848f.addAll(e2.values());
            this.f848f.add(this.f849g);
        }
        i.c(this.f850h, this.f851i, this.f852j, e2, false);
        Object obj = this.f846d;
        if (obj != null) {
            this.f844b.s(obj, this.f853k, this.f848f);
            View k2 = i.k(e2, this.f847e, this.f854l, this.f852j);
            if (k2 != null) {
                this.f844b.i(k2, this.f855m);
            }
        }
    }
}