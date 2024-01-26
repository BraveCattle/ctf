package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import k0.o;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f837b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f838c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f839d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l.a f840e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f841f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ o f842g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Rect f843h;

    public g(Fragment fragment, Fragment fragment2, boolean z2, l.a aVar, View view, o oVar, Rect rect) {
        this.f837b = fragment;
        this.f838c = fragment2;
        this.f839d = z2;
        this.f840e = aVar;
        this.f841f = view;
        this.f842g = oVar;
        this.f843h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        i.c(this.f837b, this.f838c, this.f839d, this.f840e, false);
        View view = this.f841f;
        if (view != null) {
            this.f842g.i(view, this.f843h);
        }
    }
}