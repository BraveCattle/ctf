package f;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import f.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1675a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f1676b;

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0020a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f1677a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f1678b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f1679c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final l.h<Menu, Menu> f1680d = new l.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f1678b = context;
            this.f1677a = callback;
        }

        @Override // f.a.InterfaceC0020a
        public boolean a(f.a aVar, Menu menu) {
            return this.f1677a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // f.a.InterfaceC0020a
        public void b(f.a aVar) {
            this.f1677a.onDestroyActionMode(e(aVar));
        }

        @Override // f.a.InterfaceC0020a
        public boolean c(f.a aVar, MenuItem menuItem) {
            return this.f1677a.onActionItemClicked(e(aVar), new g.c(this.f1678b, (z.b) menuItem));
        }

        @Override // f.a.InterfaceC0020a
        public boolean d(f.a aVar, Menu menu) {
            return this.f1677a.onPrepareActionMode(e(aVar), f(menu));
        }

        public ActionMode e(f.a aVar) {
            int size = this.f1679c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f1679c.get(i2);
                if (eVar != null && eVar.f1676b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f1678b, aVar);
            this.f1679c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f1680d.getOrDefault(menu, null);
            if (orDefault == null) {
                g.e eVar = new g.e(this.f1678b, (z.a) menu);
                this.f1680d.put(menu, eVar);
                return eVar;
            }
            return orDefault;
        }
    }

    public e(Context context, f.a aVar) {
        this.f1675a = context;
        this.f1676b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f1676b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f1676b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new g.e(this.f1675a, (z.a) this.f1676b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f1676b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f1676b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f1676b.f1662b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f1676b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f1676b.f1663c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f1676b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f1676b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f1676b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i2) {
        this.f1676b.l(i2);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f1676b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f1676b.f1662b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i2) {
        this.f1676b.n(i2);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f1676b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z2) {
        this.f1676b.p(z2);
    }
}