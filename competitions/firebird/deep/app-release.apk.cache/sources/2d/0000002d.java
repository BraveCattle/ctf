package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import e0.b;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements z.b {
    public e0.b A;
    public MenuItem.OnActionExpandListener B;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f184a;

    /* renamed from: b  reason: collision with root package name */
    public final int f185b;

    /* renamed from: c  reason: collision with root package name */
    public final int f186c;

    /* renamed from: d  reason: collision with root package name */
    public final int f187d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f188e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f189f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f190g;

    /* renamed from: h  reason: collision with root package name */
    public char f191h;

    /* renamed from: j  reason: collision with root package name */
    public char f193j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f195l;

    /* renamed from: n  reason: collision with root package name */
    public e f197n;

    /* renamed from: o  reason: collision with root package name */
    public l f198o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f199p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f200q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f201r;

    /* renamed from: y  reason: collision with root package name */
    public int f208y;

    /* renamed from: z  reason: collision with root package name */
    public View f209z;

    /* renamed from: i  reason: collision with root package name */
    public int f192i = 4096;

    /* renamed from: k  reason: collision with root package name */
    public int f194k = 4096;

    /* renamed from: m  reason: collision with root package name */
    public int f196m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f202s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f203t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f204u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f205v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f206w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f207x = 16;
    public boolean C = false;

    /* loaded from: classes.dex */
    public class a implements b.a {
        public a() {
        }
    }

    public g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f208y = 0;
        this.f197n = eVar;
        this.f184a = i3;
        this.f185b = i2;
        this.f186c = i4;
        this.f187d = i5;
        this.f188e = charSequence;
        this.f208y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // z.b
    public z.b a(e0.b bVar) {
        e0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f1617a = null;
        }
        this.f209z = null;
        this.A = bVar;
        this.f197n.p(true);
        e0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    @Override // z.b
    public e0.b b() {
        return this.A;
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f208y & 8) == 0) {
            return false;
        }
        if (this.f209z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f197n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f206w && (this.f204u || this.f205v)) {
            drawable = drawable.mutate();
            if (this.f204u) {
                drawable.setTintList(this.f202s);
            }
            if (this.f205v) {
                drawable.setTintMode(this.f203t);
            }
            this.f206w = false;
        }
        return drawable;
    }

    public char e() {
        return this.f197n.n() ? this.f193j : this.f191h;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        if (f()) {
            MenuItem.OnActionExpandListener onActionExpandListener = this.B;
            if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
                return this.f197n.f(this);
            }
            return false;
        }
        return false;
    }

    public boolean f() {
        e0.b bVar;
        if ((this.f208y & 8) != 0) {
            if (this.f209z == null && (bVar = this.A) != null) {
                this.f209z = bVar.d(this);
            }
            return this.f209z != null;
        }
        return false;
    }

    public boolean g() {
        return (this.f207x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f209z;
        if (view != null) {
            return view;
        }
        e0.b bVar = this.A;
        if (bVar != null) {
            View d2 = bVar.d(this);
            this.f209z = d2;
            return d2;
        }
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f194k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f193j;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f200q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f185b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f195l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f196m;
        if (i2 != 0) {
            Drawable a2 = d.a.a(this.f197n.f157a, i2);
            this.f196m = 0;
            this.f195l = a2;
            return d(a2);
        }
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f202s;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f203t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f190g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f184a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f192i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f191h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f186c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f198o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f188e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f189f;
        return charSequence != null ? charSequence : this.f188e;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f201r;
    }

    public boolean h() {
        return (this.f207x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f198o != null;
    }

    public z.b i(View view) {
        int i2;
        this.f209z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f184a) > 0) {
            view.setId(i2);
        }
        e eVar = this.f197n;
        eVar.f167k = true;
        eVar.p(true);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f207x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f207x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f207x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        e0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f207x & 8) == 0 : (this.f207x & 8) == 0 && this.A.b();
    }

    public void j(boolean z2) {
        int i2 = this.f207x;
        int i3 = (z2 ? 2 : 0) | (i2 & (-3));
        this.f207x = i3;
        if (i2 != i3) {
            this.f197n.p(false);
        }
    }

    public void k(boolean z2) {
        this.f207x = z2 ? this.f207x | 32 : this.f207x & (-33);
    }

    public boolean l(boolean z2) {
        int i2 = this.f207x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.f207x = i3;
        return i2 != i3;
    }

    public boolean m() {
        return this.f197n.o() && e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context context = this.f197n.f157a;
        i(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f193j == c2) {
            return this;
        }
        this.f193j = Character.toLowerCase(c2);
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f193j == c2 && this.f194k == i2) {
            return this;
        }
        this.f193j = Character.toLowerCase(c2);
        this.f194k = KeyEvent.normalizeMetaState(i2);
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f207x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.f207x = i3;
        if (i2 != i3) {
            this.f197n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        if ((this.f207x & 4) != 0) {
            e eVar = this.f197n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f162f.size();
            eVar.y();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = eVar.f162f.get(i2);
                if (gVar.f185b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.x();
        } else {
            j(z2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f200q = charSequence;
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f200q = charSequence;
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f207x = z2 ? this.f207x | 16 : this.f207x & (-17);
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.f195l = null;
        this.f196m = i2;
        this.f206w = true;
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f196m = 0;
        this.f195l = drawable;
        this.f206w = true;
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f202s = colorStateList;
        this.f204u = true;
        this.f206w = true;
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f203t = mode;
        this.f205v = true;
        this.f206w = true;
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f190g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f191h == c2) {
            return this;
        }
        this.f191h = c2;
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f191h == c2 && this.f192i == i2) {
            return this;
        }
        this.f191h = c2;
        this.f192i = KeyEvent.normalizeMetaState(i2);
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f199p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f191h = c2;
        this.f193j = Character.toLowerCase(c3);
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f191h = c2;
        this.f192i = KeyEvent.normalizeMetaState(i2);
        this.f193j = Character.toLowerCase(c3);
        this.f194k = KeyEvent.normalizeMetaState(i3);
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f208y = i2;
        e eVar = this.f197n;
        eVar.f167k = true;
        eVar.p(true);
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.f197n.f157a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f188e = charSequence;
        this.f197n.p(false);
        l lVar = this.f198o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f189f = charSequence;
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f201r = charSequence;
        this.f197n.p(false);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f201r = charSequence;
        this.f197n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        if (l(z2)) {
            e eVar = this.f197n;
            eVar.f164h = true;
            eVar.p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f188e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}