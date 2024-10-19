package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import e0.n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class e implements z.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f156y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f157a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f158b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f159c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f160d;

    /* renamed from: e  reason: collision with root package name */
    public a f161e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f162f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f163g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f164h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<g> f165i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f166j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f167k;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f169m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f170n;

    /* renamed from: o  reason: collision with root package name */
    public View f171o;

    /* renamed from: v  reason: collision with root package name */
    public g f178v;

    /* renamed from: x  reason: collision with root package name */
    public boolean f180x;

    /* renamed from: l  reason: collision with root package name */
    public int f168l = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f172p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f173q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f174r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f175s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f176t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f177u = new CopyOnWriteArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public boolean f179w = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);

        boolean b(e eVar, MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f157a = context;
        Resources resources = context.getResources();
        this.f158b = resources;
        this.f162f = new ArrayList<>();
        this.f163g = new ArrayList<>();
        this.f164h = true;
        this.f165i = new ArrayList<>();
        this.f166j = new ArrayList<>();
        this.f167k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = n.f1641a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f160d = z3;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = ((-65536) & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = f156y;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                g gVar = new g(this, i2, i3, i4, i7, charSequence, this.f168l);
                ArrayList<g> arrayList = this.f162f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i5 = 0;
                        break;
                    } else if (arrayList.get(size).f187d <= i7) {
                        i5 = size + 1;
                        break;
                    }
                }
                arrayList.add(i5, gVar);
                p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f158b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f158b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f157a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            g gVar = (g) a(i2, i3, i4, resolveInfo.loadLabel(packageManager));
            gVar.setIcon(resolveInfo.loadIcon(packageManager));
            gVar.setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = gVar;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.f158b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.f158b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        g gVar = (g) a(i2, i3, i4, charSequence);
        l lVar = new l(this.f157a, this, gVar);
        gVar.f198o = lVar;
        lVar.setHeaderTitle(gVar.f188e);
        return lVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar, Context context) {
        this.f177u.add(new WeakReference<>(iVar));
        iVar.j(context, this);
        this.f167k = true;
    }

    public final void c(boolean z2) {
        if (this.f175s) {
            return;
        }
        this.f175s = true;
        Iterator<WeakReference<i>> it = this.f177u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f177u.remove(next);
            } else {
                iVar.b(this, z2);
            }
        }
        this.f175s = false;
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.f178v;
        if (gVar != null) {
            d(gVar);
        }
        this.f162f.clear();
        p(true);
    }

    public void clearHeader() {
        this.f170n = null;
        this.f169m = null;
        this.f171o = null;
        p(false);
    }

    @Override // android.view.Menu
    public void close() {
        c(true);
    }

    public boolean d(g gVar) {
        boolean z2 = false;
        if (!this.f177u.isEmpty() && this.f178v == gVar) {
            y();
            Iterator<WeakReference<i>> it = this.f177u.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f177u.remove(next);
                } else {
                    z2 = iVar.k(this, gVar);
                    if (z2) {
                        break;
                    }
                }
            }
            x();
            if (z2) {
                this.f178v = null;
            }
        }
        return z2;
    }

    public boolean e(e eVar, MenuItem menuItem) {
        a aVar = this.f161e;
        return aVar != null && aVar.b(eVar, menuItem);
    }

    public boolean f(g gVar) {
        boolean z2 = false;
        if (this.f177u.isEmpty()) {
            return false;
        }
        y();
        Iterator<WeakReference<i>> it = this.f177u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar = next.get();
            if (iVar == null) {
                this.f177u.remove(next);
            } else {
                z2 = iVar.c(this, gVar);
                if (z2) {
                    break;
                }
            }
        }
        x();
        if (z2) {
            this.f178v = gVar;
        }
        return z2;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f162f.get(i3);
            if (gVar.f184a == i2) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f198o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public g g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<g> arrayList = this.f176t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = arrayList.get(i3);
            if (n2) {
                c2 = gVar.f193j;
            } else {
                c2 = gVar.f191h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == '\b' && i2 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i2) {
        return this.f162f.get(i2);
    }

    public void h(List<g> list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f162f.size();
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = this.f162f.get(i4);
                if (gVar.hasSubMenu()) {
                    gVar.f198o.h(list, i2, keyEvent);
                }
                if (n2) {
                    c2 = gVar.f193j;
                } else {
                    c2 = gVar.f191h;
                }
                if (n2) {
                    i3 = gVar.f194k;
                } else {
                    i3 = gVar.f192i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == '\b' && i2 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f180x) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f162f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<g> l2 = l();
        if (this.f167k) {
            Iterator<WeakReference<i>> it = this.f177u.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f177u.remove(next);
                } else {
                    z2 |= iVar.g();
                }
            }
            if (z2) {
                this.f165i.clear();
                this.f166j.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g gVar = l2.get(i2);
                    (gVar.g() ? this.f165i : this.f166j).add(gVar);
                }
            } else {
                this.f165i.clear();
                this.f166j.clear();
                this.f166j.addAll(l());
            }
            this.f167k = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public e k() {
        return this;
    }

    public ArrayList<g> l() {
        if (this.f164h) {
            this.f163g.clear();
            int size = this.f162f.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = this.f162f.get(i2);
                if (gVar.isVisible()) {
                    this.f163g.add(gVar);
                }
            }
            this.f164h = false;
            this.f167k = true;
            return this.f163g;
        }
        return this.f163g;
    }

    public boolean m() {
        return this.f179w;
    }

    public boolean n() {
        return this.f159c;
    }

    public boolean o() {
        return this.f160d;
    }

    public void p(boolean z2) {
        if (!this.f172p) {
            if (z2) {
                this.f164h = true;
                this.f167k = true;
            }
            if (this.f177u.isEmpty()) {
                return;
            }
            y();
            Iterator<WeakReference<i>> it = this.f177u.iterator();
            while (it.hasNext()) {
                WeakReference<i> next = it.next();
                i iVar = next.get();
                if (iVar == null) {
                    this.f177u.remove(next);
                } else {
                    iVar.h(z2);
                }
            }
            x();
            return;
        }
        this.f173q = true;
        if (z2) {
            this.f174r = true;
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), i3);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        g g2 = g(i2, keyEvent);
        boolean r2 = g2 != null ? r(g2, null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return r2;
    }

    public boolean q(MenuItem menuItem, int i2) {
        return r(menuItem, null, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005b, code lost:
        if (r1 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
        if ((r9 & 1) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c6, code lost:
        if (r1 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c8, code lost:
        c(true);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean r(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto Lcc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcc
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f199p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            androidx.appcompat.view.menu.e r1 = r7.f197n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r1 = r7.f190g
            if (r1 == 0) goto L36
            androidx.appcompat.view.menu.e r3 = r7.f197n     // Catch: android.content.ActivityNotFoundException -> L2e
            android.content.Context r3 = r3.f157a     // Catch: android.content.ActivityNotFoundException -> L2e
            r3.startActivity(r1)     // Catch: android.content.ActivityNotFoundException -> L2e
            goto L40
        L2e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L36:
            e0.b r1 = r7.A
            if (r1 == 0) goto L42
            boolean r1 = r1.e()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            e0.b r3 = r7.A
            if (r3 == 0) goto L4f
            boolean r4 = r3.a()
            if (r4 == 0) goto L4f
            r4 = r2
            goto L50
        L4f:
            r4 = r0
        L50:
            boolean r5 = r7.f()
            if (r5 == 0) goto L5f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lcb
            goto Lc8
        L5f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6d
            if (r4 == 0) goto L68
            goto L6d
        L68:
            r7 = r9 & 1
            if (r7 != 0) goto Lcb
            goto Lc8
        L6d:
            r9 = r9 & 4
            if (r9 != 0) goto L74
            r6.c(r0)
        L74:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L88
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f157a
            r9.<init>(r5, r6, r7)
            r7.f198o = r9
            java.lang.CharSequence r5 = r7.f188e
            r9.setHeaderTitle(r5)
        L88:
            androidx.appcompat.view.menu.l r7 = r7.f198o
            if (r4 == 0) goto L8f
            r3.f(r7)
        L8f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f177u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L98
            goto Lc5
        L98:
            if (r8 == 0) goto L9e
            boolean r0 = r8.f(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f177u
            java.util.Iterator r8 = r8.iterator()
        La4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto Lbe
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f177u
            r3.remove(r9)
            goto La4
        Lbe:
            if (r0 != 0) goto La4
            boolean r0 = r3.f(r7)
            goto La4
        Lc5:
            r1 = r1 | r0
            if (r1 != 0) goto Lcb
        Lc8:
            r6.c(r2)
        Lcb:
            return r1
        Lcc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.r(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    @Override // android.view.Menu
    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f162f.get(i3).f185b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f162f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f162f.get(i3).f185b != i2) {
                    break;
                }
                s(i3, false);
                i4 = i5;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f162f.get(i3).f184a == i2) {
                break;
            } else {
                i3++;
            }
        }
        s(i3, true);
    }

    public final void s(int i2, boolean z2) {
        if (i2 < 0 || i2 >= this.f162f.size()) {
            return;
        }
        this.f162f.remove(i2);
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f162f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f162f.get(i3);
            if (gVar.f185b == i2) {
                gVar.f207x = (gVar.f207x & (-5)) | (z3 ? 4 : 0);
                gVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.f179w = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f162f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f162f.get(i3);
            if (gVar.f185b == i2) {
                gVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f162f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f162f.get(i3);
            if (gVar.f185b == i2 && gVar.l(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f159c = z2;
        p(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f162f.size();
    }

    public void t(i iVar) {
        Iterator<WeakReference<i>> it = this.f177u.iterator();
        while (it.hasNext()) {
            WeakReference<i> next = it.next();
            i iVar2 = next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f177u.remove(next);
            }
        }
    }

    public void u(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).u(bundle);
            }
        }
        int i3 = bundle.getInt("android:menu:expandedactionview");
        if (i3 <= 0 || (findItem = findItem(i3)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void v(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void w(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f158b;
        if (view != null) {
            this.f171o = view;
            this.f169m = null;
            this.f170n = null;
        } else {
            if (i2 > 0) {
                this.f169m = resources.getText(i2);
            } else if (charSequence != null) {
                this.f169m = charSequence;
            }
            if (i3 > 0) {
                Context context = this.f157a;
                Object obj = v.a.f2707a;
                this.f170n = context.getDrawable(i3);
            } else if (drawable != null) {
                this.f170n = drawable;
            }
            this.f171o = null;
        }
        p(false);
    }

    public void x() {
        this.f172p = false;
        if (this.f173q) {
            this.f173q = false;
            p(this.f174r);
        }
    }

    public void y() {
        if (this.f172p) {
            return;
        }
        this.f172p = true;
        this.f173q = false;
        this.f174r = false;
    }
}