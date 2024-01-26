package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import l.h;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1759a;

    /* renamed from: b  reason: collision with root package name */
    public h<z.b, MenuItem> f1760b;

    /* renamed from: c  reason: collision with root package name */
    public h<z.c, SubMenu> f1761c;

    public b(Context context) {
        this.f1759a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof z.b) {
            z.b bVar = (z.b) menuItem;
            if (this.f1760b == null) {
                this.f1760b = new h<>();
            }
            MenuItem orDefault = this.f1760b.getOrDefault(menuItem, null);
            if (orDefault == null) {
                c cVar = new c(this.f1759a, bVar);
                this.f1760b.put(bVar, cVar);
                return cVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof z.c) {
            z.c cVar = (z.c) subMenu;
            if (this.f1761c == null) {
                this.f1761c = new h<>();
            }
            SubMenu subMenu2 = this.f1761c.get(cVar);
            if (subMenu2 == null) {
                g gVar = new g(this.f1759a, cVar);
                this.f1761c.put(cVar, gVar);
                return gVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}