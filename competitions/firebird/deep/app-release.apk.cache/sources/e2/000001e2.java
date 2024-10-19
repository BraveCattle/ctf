package f;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import f.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d extends a implements e.a {

    /* renamed from: d  reason: collision with root package name */
    public Context f1669d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f1670e;

    /* renamed from: f  reason: collision with root package name */
    public a.InterfaceC0020a f1671f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f1672g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1673h;

    /* renamed from: i  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f1674i;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0020a interfaceC0020a, boolean z2) {
        this.f1669d = context;
        this.f1670e = actionBarContextView;
        this.f1671f = interfaceC0020a;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(actionBarContextView.getContext());
        eVar.f168l = 1;
        this.f1674i = eVar;
        eVar.f161e = this;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void a(androidx.appcompat.view.menu.e eVar) {
        i();
        androidx.appcompat.widget.a aVar = this.f1670e.f1824e;
        if (aVar != null) {
            aVar.n();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f1671f.c(this, menuItem);
    }

    @Override // f.a
    public void c() {
        if (this.f1673h) {
            return;
        }
        this.f1673h = true;
        this.f1670e.sendAccessibilityEvent(32);
        this.f1671f.b(this);
    }

    @Override // f.a
    public View d() {
        WeakReference<View> weakReference = this.f1672g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // f.a
    public Menu e() {
        return this.f1674i;
    }

    @Override // f.a
    public MenuInflater f() {
        return new g(this.f1670e.getContext());
    }

    @Override // f.a
    public CharSequence g() {
        return this.f1670e.getSubtitle();
    }

    @Override // f.a
    public CharSequence h() {
        return this.f1670e.getTitle();
    }

    @Override // f.a
    public void i() {
        this.f1671f.d(this, this.f1674i);
    }

    @Override // f.a
    public boolean j() {
        return this.f1670e.f266s;
    }

    @Override // f.a
    public void k(View view) {
        this.f1670e.setCustomView(view);
        this.f1672g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // f.a
    public void l(int i2) {
        this.f1670e.setSubtitle(this.f1669d.getString(i2));
    }

    @Override // f.a
    public void m(CharSequence charSequence) {
        this.f1670e.setSubtitle(charSequence);
    }

    @Override // f.a
    public void n(int i2) {
        this.f1670e.setTitle(this.f1669d.getString(i2));
    }

    @Override // f.a
    public void o(CharSequence charSequence) {
        this.f1670e.setTitle(charSequence);
    }

    @Override // f.a
    public void p(boolean z2) {
        this.f1663c = z2;
        this.f1670e.setTitleOptional(z2);
    }
}