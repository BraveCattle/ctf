package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class l extends e implements SubMenu {
    public g A;

    /* renamed from: z  reason: collision with root package name */
    public e f246z;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f246z = eVar;
        this.A = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean d(g gVar) {
        return this.f246z.d(gVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean e(e eVar, MenuItem menuItem) {
        return super.e(eVar, menuItem) || this.f246z.e(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f246z.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.e
    public String j() {
        g gVar = this.A;
        int i2 = gVar != null ? gVar.f184a : 0;
        if (i2 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i2;
    }

    @Override // androidx.appcompat.view.menu.e
    public e k() {
        return this.f246z.k();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean m() {
        return this.f246z.m();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean n() {
        return this.f246z.n();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean o() {
        return this.f246z.o();
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f246z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i2) {
        w(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i2) {
        w(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i2) {
        this.A.setIcon(i2);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f246z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }
}