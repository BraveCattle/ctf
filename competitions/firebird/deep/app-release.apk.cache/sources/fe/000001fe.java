package g;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public class a implements z.b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f1743a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f1744b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f1745c;

    /* renamed from: d  reason: collision with root package name */
    public char f1746d;

    /* renamed from: f  reason: collision with root package name */
    public char f1748f;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f1750h;

    /* renamed from: i  reason: collision with root package name */
    public Context f1751i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1752j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1753k;

    /* renamed from: e  reason: collision with root package name */
    public int f1747e = 4096;

    /* renamed from: g  reason: collision with root package name */
    public int f1749g = 4096;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f1754l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f1755m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1756n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1757o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f1758p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1751i = context;
        this.f1743a = charSequence;
    }

    @Override // z.b
    public z.b a(e0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b
    public e0.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f1750h;
        if (drawable != null) {
            if (this.f1756n || this.f1757o) {
                this.f1750h = drawable;
                Drawable mutate = drawable.mutate();
                this.f1750h = mutate;
                if (this.f1756n) {
                    mutate.setTintList(this.f1754l);
                }
                if (this.f1757o) {
                    this.f1750h.setTintMode(this.f1755m);
                }
            }
        }
    }

    @Override // z.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1749g;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1748f;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1752j;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1750h;
    }

    @Override // z.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1754l;
    }

    @Override // z.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1755m;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1745c;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // z.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1747e;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1746d;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1743a;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1744b;
        return charSequence != null ? charSequence : this.f1743a;
    }

    @Override // z.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1753k;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // z.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1758p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1758p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1758p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1758p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f1748f = Character.toLowerCase(c2);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f1748f = Character.toLowerCase(c2);
        this.f1749g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z2) {
        this.f1758p = (z2 ? 1 : 0) | (this.f1758p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z2) {
        this.f1758p = (z2 ? 2 : 0) | (this.f1758p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1752j = charSequence;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public z.b setContentDescription(CharSequence charSequence) {
        this.f1752j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z2) {
        this.f1758p = (z2 ? 16 : 0) | (this.f1758p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        Context context = this.f1751i;
        Object obj = v.a.f2707a;
        this.f1750h = context.getDrawable(i2);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1750h = drawable;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1754l = colorStateList;
        this.f1756n = true;
        c();
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1755m = mode;
        this.f1757o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1745c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f1746d = c2;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f1746d = c2;
        this.f1747e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f1746d = c2;
        this.f1748f = Character.toLowerCase(c3);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f1746d = c2;
        this.f1747e = KeyEvent.normalizeMetaState(i2);
        this.f1748f = Character.toLowerCase(c3);
        this.f1749g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public void setShowAsAction(int i2) {
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f1743a = this.f1751i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1743a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1744b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1753k = charSequence;
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public z.b setTooltipText(CharSequence charSequence) {
        this.f1753k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z2) {
        this.f1758p = (this.f1758p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // z.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}