package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public abstract class a implements i {

    /* renamed from: b  reason: collision with root package name */
    public Context f100b;

    /* renamed from: c  reason: collision with root package name */
    public Context f101c;

    /* renamed from: d  reason: collision with root package name */
    public e f102d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f103e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f104f;

    /* renamed from: g  reason: collision with root package name */
    public int f105g;

    /* renamed from: h  reason: collision with root package name */
    public int f106h;

    /* renamed from: i  reason: collision with root package name */
    public j f107i;

    public a(Context context, int i2, int i3) {
        this.f100b = context;
        this.f103e = LayoutInflater.from(context);
        this.f105g = i2;
        this.f106h = i3;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f104f = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean k(e eVar, g gVar) {
        return false;
    }
}