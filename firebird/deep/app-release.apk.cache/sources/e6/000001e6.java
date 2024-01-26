package f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import h.d0;
import h.u0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f1681e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f1682f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f1683a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1684b;

    /* renamed from: c  reason: collision with root package name */
    public Context f1685c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1686d;

    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f1687c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f1688a;

        /* renamed from: b  reason: collision with root package name */
        public Method f1689b;

        public a(Object obj, String str) {
            this.f1688a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1689b = cls.getMethod(str, f1687c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1689b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1689b.invoke(this.f1688a, menuItem)).booleanValue();
                }
                this.f1689b.invoke(this.f1688a, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a  reason: collision with root package name */
        public Menu f1690a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1697h;

        /* renamed from: i  reason: collision with root package name */
        public int f1698i;

        /* renamed from: j  reason: collision with root package name */
        public int f1699j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f1700k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f1701l;

        /* renamed from: m  reason: collision with root package name */
        public int f1702m;

        /* renamed from: n  reason: collision with root package name */
        public char f1703n;

        /* renamed from: o  reason: collision with root package name */
        public int f1704o;

        /* renamed from: p  reason: collision with root package name */
        public char f1705p;

        /* renamed from: q  reason: collision with root package name */
        public int f1706q;

        /* renamed from: r  reason: collision with root package name */
        public int f1707r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f1708s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f1709t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f1710u;

        /* renamed from: v  reason: collision with root package name */
        public int f1711v;

        /* renamed from: w  reason: collision with root package name */
        public int f1712w;

        /* renamed from: x  reason: collision with root package name */
        public String f1713x;

        /* renamed from: y  reason: collision with root package name */
        public String f1714y;

        /* renamed from: z  reason: collision with root package name */
        public e0.b f1715z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: b  reason: collision with root package name */
        public int f1691b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1692c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1693d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1694e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1695f = true;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1696g = true;

        public b(Menu menu) {
            this.f1690a = menu;
        }

        public SubMenu a() {
            this.f1697h = true;
            SubMenu addSubMenu = this.f1690a.addSubMenu(this.f1691b, this.f1698i, this.f1699j, this.f1700k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f1685c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f1708s).setVisible(this.f1709t).setEnabled(this.f1710u).setCheckable(this.f1707r >= 1).setTitleCondensed(this.f1701l).setIcon(this.f1702m);
            int i2 = this.f1711v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f1714y != null) {
                if (g.this.f1685c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                g gVar = g.this;
                if (gVar.f1686d == null) {
                    gVar.f1686d = gVar.a(gVar.f1685c);
                }
                menuItem.setOnMenuItemClickListener(new a(gVar.f1686d, this.f1714y));
            }
            if (this.f1707r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) menuItem;
                    gVar2.f207x = (gVar2.f207x & (-5)) | 4;
                } else if (menuItem instanceof g.c) {
                    g.c cVar = (g.c) menuItem;
                    try {
                        if (cVar.f1763e == null) {
                            cVar.f1763e = cVar.f1762d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f1763e.invoke(cVar.f1762d, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.f1713x;
            if (str != null) {
                menuItem.setActionView((View) b(str, g.f1681e, g.this.f1683a));
                z2 = true;
            }
            int i3 = this.f1712w;
            if (i3 > 0) {
                if (z2) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i3);
                }
            }
            e0.b bVar = this.f1715z;
            if (bVar != null) {
                if (menuItem instanceof z.b) {
                    ((z.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z3 = menuItem instanceof z.b;
            if (z3) {
                ((z.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z3) {
                ((z.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f1703n;
            int i4 = this.f1704o;
            if (z3) {
                ((z.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.f1705p;
            int i5 = this.f1706q;
            if (z3) {
                ((z.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z3) {
                    ((z.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z3) {
                    ((z.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1681e = clsArr;
        f1682f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f1685c = context;
        Object[] objArr = {context};
        this.f1683a = objArr;
        this.f1684b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        e0.b bVar;
        ColorStateList colorStateList;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(f.a("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z3 && name2.equals(str)) {
                        str = null;
                        z3 = false;
                    } else if (name2.equals("group")) {
                        bVar2.f1691b = 0;
                        bVar2.f1692c = 0;
                        bVar2.f1693d = 0;
                        bVar2.f1694e = 0;
                        bVar2.f1695f = true;
                        bVar2.f1696g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar2.f1697h) {
                            e0.b bVar3 = bVar2.f1715z;
                            if (bVar3 == null || !bVar3.a()) {
                                bVar2.f1697h = true;
                                bVar2.c(bVar2.f1690a.add(bVar2.f1691b, bVar2.f1698i, bVar2.f1699j, bVar2.f1700k));
                            } else {
                                bVar2.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = g.this.f1685c.obtainStyledAttributes(attributeSet, b.b.f1234p);
                    bVar2.f1691b = obtainStyledAttributes.getResourceId(1, 0);
                    bVar2.f1692c = obtainStyledAttributes.getInt(3, 0);
                    bVar2.f1693d = obtainStyledAttributes.getInt(4, 0);
                    bVar2.f1694e = obtainStyledAttributes.getInt(5, 0);
                    bVar2.f1695f = obtainStyledAttributes.getBoolean(2, true);
                    bVar2.f1696g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    u0 n2 = u0.n(g.this.f1685c, attributeSet, b.b.f1235q);
                    bVar2.f1698i = n2.j(2, 0);
                    bVar2.f1699j = (n2.h(5, bVar2.f1692c) & (-65536)) | (n2.h(6, bVar2.f1693d) & 65535);
                    bVar2.f1700k = n2.l(7);
                    bVar2.f1701l = n2.l(8);
                    bVar2.f1702m = n2.j(0, 0);
                    String k2 = n2.k(9);
                    bVar2.f1703n = k2 == null ? (char) 0 : k2.charAt(0);
                    bVar2.f1704o = n2.h(16, 4096);
                    String k3 = n2.k(10);
                    bVar2.f1705p = k3 == null ? (char) 0 : k3.charAt(0);
                    bVar2.f1706q = n2.h(20, 4096);
                    bVar2.f1707r = n2.m(11) ? n2.a(11, false) : bVar2.f1694e;
                    bVar2.f1708s = n2.a(3, false);
                    bVar2.f1709t = n2.a(4, bVar2.f1695f);
                    bVar2.f1710u = n2.a(1, bVar2.f1696g);
                    bVar2.f1711v = n2.h(21, -1);
                    bVar2.f1714y = n2.k(12);
                    bVar2.f1712w = n2.j(13, 0);
                    bVar2.f1713x = n2.k(15);
                    String k4 = n2.k(14);
                    boolean z4 = k4 != null;
                    if (z4 && bVar2.f1712w == 0 && bVar2.f1713x == null) {
                        bVar = (e0.b) bVar2.b(k4, f1682f, g.this.f1684b);
                    } else {
                        if (z4) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar = null;
                    }
                    bVar2.f1715z = bVar;
                    bVar2.A = n2.l(17);
                    bVar2.B = n2.l(22);
                    if (n2.m(19)) {
                        bVar2.D = d0.b(n2.h(19, -1), bVar2.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar2.D = null;
                    }
                    if (n2.m(18)) {
                        colorStateList = n2.b(18);
                    }
                    bVar2.C = colorStateList;
                    n2.f2006b.recycle();
                    bVar2.f1697h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, bVar2.a());
                } else {
                    str = name3;
                    z3 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof z.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1685c.getResources().getLayout(i2);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}