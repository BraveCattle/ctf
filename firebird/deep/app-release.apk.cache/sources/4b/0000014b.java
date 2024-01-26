package c;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.s;
import f.a;
import h.a1;
import h.b0;
import h.l0;
import h.u0;
import h.z0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class g extends c.e implements e.a, LayoutInflater.Factory2 {
    public static final l.h<String, Integer> Z = new l.h<>();

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f1293a0 = {16842836};

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f1294b0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f1295c0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public i[] F;
    public i G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public f Q;
    public f R;
    public boolean S;
    public int T;
    public boolean V;
    public Rect W;
    public Rect X;
    public m Y;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1296d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f1297e;

    /* renamed from: f  reason: collision with root package name */
    public Window f1298f;

    /* renamed from: g  reason: collision with root package name */
    public d f1299g;

    /* renamed from: h  reason: collision with root package name */
    public final c.d f1300h;

    /* renamed from: i  reason: collision with root package name */
    public c.a f1301i;

    /* renamed from: j  reason: collision with root package name */
    public MenuInflater f1302j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1303k;

    /* renamed from: l  reason: collision with root package name */
    public b0 f1304l;

    /* renamed from: m  reason: collision with root package name */
    public b f1305m;

    /* renamed from: n  reason: collision with root package name */
    public j f1306n;

    /* renamed from: o  reason: collision with root package name */
    public f.a f1307o;

    /* renamed from: p  reason: collision with root package name */
    public ActionBarContextView f1308p;

    /* renamed from: q  reason: collision with root package name */
    public PopupWindow f1309q;

    /* renamed from: r  reason: collision with root package name */
    public Runnable f1310r;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1312t;

    /* renamed from: u  reason: collision with root package name */
    public ViewGroup f1313u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f1314v;

    /* renamed from: w  reason: collision with root package name */
    public View f1315w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1316x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1317y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1318z;

    /* renamed from: s  reason: collision with root package name */
    public e0.o f1311s = null;
    public final Runnable U = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.T & 1) != 0) {
                gVar.H(0);
            }
            g gVar2 = g.this;
            if ((gVar2.T & 4096) != 0) {
                gVar2.H(108);
            }
            g gVar3 = g.this;
            gVar3.S = false;
            gVar3.T = 0;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements i.a {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            g.this.D(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback O = g.this.O();
            if (O != null) {
                O.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class c implements a.InterfaceC0020a {

        /* renamed from: a  reason: collision with root package name */
        public a.InterfaceC0020a f1321a;

        /* loaded from: classes.dex */
        public class a extends e0.q {
            public a() {
            }

            @Override // e0.p
            public void a(View view) {
                g.this.f1308p.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f1309q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f1308p.getParent() instanceof View) {
                    WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                    ((View) g.this.f1308p.getParent()).requestApplyInsets();
                }
                g.this.f1308p.removeAllViews();
                g.this.f1311s.d(null);
                g gVar2 = g.this;
                gVar2.f1311s = null;
                ViewGroup viewGroup = gVar2.f1313u;
                WeakHashMap<View, e0.o> weakHashMap2 = e0.m.f1633a;
                viewGroup.requestApplyInsets();
            }
        }

        public c(a.InterfaceC0020a interfaceC0020a) {
            this.f1321a = interfaceC0020a;
        }

        @Override // f.a.InterfaceC0020a
        public boolean a(f.a aVar, Menu menu) {
            return this.f1321a.a(aVar, menu);
        }

        @Override // f.a.InterfaceC0020a
        public void b(f.a aVar) {
            this.f1321a.b(aVar);
            g gVar = g.this;
            if (gVar.f1309q != null) {
                gVar.f1298f.getDecorView().removeCallbacks(g.this.f1310r);
            }
            g gVar2 = g.this;
            if (gVar2.f1308p != null) {
                gVar2.I();
                g gVar3 = g.this;
                e0.o a2 = e0.m.a(gVar3.f1308p);
                a2.a(0.0f);
                gVar3.f1311s = a2;
                e0.o oVar = g.this.f1311s;
                a aVar2 = new a();
                View view = oVar.f1642a.get();
                if (view != null) {
                    oVar.e(view, aVar2);
                }
            }
            g gVar4 = g.this;
            c.d dVar = gVar4.f1300h;
            if (dVar != null) {
                dVar.e(gVar4.f1307o);
            }
            g gVar5 = g.this;
            gVar5.f1307o = null;
            ViewGroup viewGroup = gVar5.f1313u;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            viewGroup.requestApplyInsets();
        }

        @Override // f.a.InterfaceC0020a
        public boolean c(f.a aVar, MenuItem menuItem) {
            return this.f1321a.c(aVar, menuItem);
        }

        @Override // f.a.InterfaceC0020a
        public boolean d(f.a aVar, Menu menu) {
            ViewGroup viewGroup = g.this.f1313u;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            viewGroup.requestApplyInsets();
            return this.f1321a.d(aVar, menu);
        }
    }

    /* loaded from: classes.dex */
    public class d extends f.i {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r11) {
            /*
                Method dump skipped, instructions count: 521
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.g.d.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.G(keyEvent) || this.f1725b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
            if (r3 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
            if (r7 != false) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f1725b
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L70
                c.g r0 = c.g.this
                int r3 = r7.getKeyCode()
                r0.P()
                c.a r4 = r0.f1301i
                if (r4 == 0) goto L3f
                c.q r4 = (c.q) r4
                c.q$d r4 = r4.f1389i
                if (r4 != 0) goto L1e
                goto L3b
            L1e:
                androidx.appcompat.view.menu.e r4 = r4.f1410e
                if (r4 == 0) goto L3b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r2) goto L32
                r5 = r2
                goto L33
            L32:
                r5 = r1
            L33:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r1)
                goto L3c
            L3b:
                r3 = r1
            L3c:
                if (r3 == 0) goto L3f
                goto L6b
            L3f:
                c.g$i r3 = r0.G
                if (r3 == 0) goto L54
                int r4 = r7.getKeyCode()
                boolean r3 = r0.T(r3, r4, r7, r2)
                if (r3 == 0) goto L54
                c.g$i r7 = r0.G
                if (r7 == 0) goto L6b
                r7.f1344l = r2
                goto L6b
            L54:
                c.g$i r3 = r0.G
                if (r3 != 0) goto L6d
                c.g$i r3 = r0.N(r1)
                r0.U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.T(r3, r4, r7, r2)
                r3.f1343k = r1
                if (r7 == 0) goto L6d
            L6b:
                r7 = r2
                goto L6e
            L6d:
                r7 = r1
            L6e:
                if (r7 == 0) goto L71
            L70:
                r1 = r2
            L71:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: c.g.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return this.f1725b.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i2, Menu menu) {
            this.f1725b.onMenuOpened(i2, menu);
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            if (i2 == 108) {
                gVar.P();
                c.a aVar = gVar.f1301i;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i2, Menu menu) {
            this.f1725b.onPanelClosed(i2, menu);
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            if (i2 == 108) {
                gVar.P();
                c.a aVar = gVar.f1301i;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i2 == 0) {
                i N = gVar.N(i2);
                if (N.f1345m) {
                    gVar.E(N, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f180x = true;
            }
            boolean onPreparePanel = this.f1725b.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.f180x = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.e eVar = g.this.N(0).f1340h;
            if (eVar != null) {
                this.f1725b.onProvideKeyboardShortcuts(list, eVar, i2);
            } else {
                this.f1725b.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Objects.requireNonNull(g.this);
            if (i2 != 0) {
                return this.f1725b.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }

    /* loaded from: classes.dex */
    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f1325c;

        public e(Context context) {
            super();
            this.f1325c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // c.g.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // c.g.f
        public int c() {
            return this.f1325c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // c.g.f
        public void d() {
            g.this.z();
        }
    }

    /* loaded from: classes.dex */
    public abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f1327a;

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f1327a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f1297e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1327a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f1327a == null) {
                this.f1327a = new a();
            }
            g.this.f1297e.registerReceiver(this.f1327a, b2);
        }
    }

    /* renamed from: c.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0014g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final p f1330c;

        public C0014g(p pVar) {
            super();
            this.f1330c = pVar;
        }

        @Override // c.g.f
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x00ec A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // c.g.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c() {
            /*
                Method dump skipped, instructions count: 238
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c.g.C0014g.c():int");
        }

        @Override // c.g.f
        public void d() {
            g.this.z();
        }
    }

    /* loaded from: classes.dex */
    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                    g gVar = g.this;
                    gVar.E(gVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(d.a.a(getContext(), i2));
        }
    }

    /* loaded from: classes.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public int f1333a;

        /* renamed from: b  reason: collision with root package name */
        public int f1334b;

        /* renamed from: c  reason: collision with root package name */
        public int f1335c;

        /* renamed from: d  reason: collision with root package name */
        public int f1336d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f1337e;

        /* renamed from: f  reason: collision with root package name */
        public View f1338f;

        /* renamed from: g  reason: collision with root package name */
        public View f1339g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f1340h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f1341i;

        /* renamed from: j  reason: collision with root package name */
        public Context f1342j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1343k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1344l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1345m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1346n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1347o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f1348p;

        public i(int i2) {
            this.f1333a = i2;
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1340h;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.t(this.f1341i);
            }
            this.f1340h = eVar;
            if (eVar == null || (cVar = this.f1341i) == null) {
                return;
            }
            eVar.b(cVar, eVar.f157a);
        }
    }

    /* loaded from: classes.dex */
    public final class j implements i.a {
        public j() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            androidx.appcompat.view.menu.e k2 = eVar.k();
            boolean z3 = k2 != eVar;
            g gVar = g.this;
            if (z3) {
                eVar = k2;
            }
            i L = gVar.L(eVar);
            if (L != null) {
                if (!z3) {
                    g.this.E(L, z2);
                    return;
                }
                g.this.C(L.f1333a, L, k2);
                g.this.E(L, true);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback O;
            if (eVar == eVar.k()) {
                g gVar = g.this;
                if (!gVar.f1318z || (O = gVar.O()) == null || g.this.L) {
                    return true;
                }
                O.onMenuOpened(108, eVar);
                return true;
            }
            return true;
        }
    }

    public g(Context context, Window window, c.d dVar, Object obj) {
        l.h<String, Integer> hVar;
        Integer orDefault;
        c.c cVar;
        this.M = -100;
        this.f1297e = context;
        this.f1300h = dVar;
        this.f1296d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof c.c)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    cVar = (c.c) context;
                    break;
                }
            }
            cVar = null;
            if (cVar != null) {
                this.M = cVar.m().f();
            }
        }
        if (this.M == -100 && (orDefault = (hVar = Z).getOrDefault(this.f1296d.getClass().getName(), null)) != null) {
            this.M = orDefault.intValue();
            hVar.remove(this.f1296d.getClass().getName());
        }
        if (window != null) {
            B(window);
        }
        h.i.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x020b, code lost:
        if ((((androidx.lifecycle.e) ((m0.c) r0).a()).f901b.compareTo(androidx.lifecycle.c.b.STARTED) >= 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0210, code lost:
        if (r18.K != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0212, code lost:
        r0.onConfigurationChanged(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013d, code lost:
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0147 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A(boolean r19) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.A(boolean):boolean");
    }

    public final void B(Window window) {
        if (this.f1298f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof d) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        d dVar = new d(callback);
        this.f1299g = dVar;
        window.setCallback(dVar);
        u0 n2 = u0.n(this.f1297e, null, f1293a0);
        Drawable f2 = n2.f(0);
        if (f2 != null) {
            window.setBackgroundDrawable(f2);
        }
        n2.f2006b.recycle();
        this.f1298f = window;
    }

    public void C(int i2, i iVar, Menu menu) {
        if (menu == null) {
            menu = iVar.f1340h;
        }
        if (iVar.f1345m && !this.L) {
            this.f1299g.f1725b.onPanelClosed(i2, menu);
        }
    }

    public void D(androidx.appcompat.view.menu.e eVar) {
        if (this.E) {
            return;
        }
        this.E = true;
        this.f1304l.j();
        Window.Callback O = O();
        if (O != null && !this.L) {
            O.onPanelClosed(108, eVar);
        }
        this.E = false;
    }

    public void E(i iVar, boolean z2) {
        ViewGroup viewGroup;
        b0 b0Var;
        if (z2 && iVar.f1333a == 0 && (b0Var = this.f1304l) != null && b0Var.e()) {
            D(iVar.f1340h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1297e.getSystemService("window");
        if (windowManager != null && iVar.f1345m && (viewGroup = iVar.f1337e) != null) {
            windowManager.removeView(viewGroup);
            if (z2) {
                C(iVar.f1333a, iVar, null);
            }
        }
        iVar.f1343k = false;
        iVar.f1344l = false;
        iVar.f1345m = false;
        iVar.f1338f = null;
        iVar.f1346n = true;
        if (this.G == iVar) {
            this.G = null;
        }
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0123, code lost:
        if (r7 != false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.G(android.view.KeyEvent):boolean");
    }

    public void H(int i2) {
        i N = N(i2);
        if (N.f1340h != null) {
            Bundle bundle = new Bundle();
            N.f1340h.v(bundle);
            if (bundle.size() > 0) {
                N.f1348p = bundle;
            }
            N.f1340h.y();
            N.f1340h.clear();
        }
        N.f1347o = true;
        N.f1346n = true;
        if ((i2 == 108 || i2 == 0) && this.f1304l != null) {
            i N2 = N(0);
            N2.f1343k = false;
            U(N2, null);
        }
    }

    public void I() {
        e0.o oVar = this.f1311s;
        if (oVar != null) {
            oVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (this.f1312t) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f1297e.obtainStyledAttributes(b.b.f1228j);
        if (!obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(124, false)) {
            t(1);
        } else if (obtainStyledAttributes.getBoolean(115, false)) {
            t(108);
        }
        if (obtainStyledAttributes.getBoolean(116, false)) {
            t(109);
        }
        if (obtainStyledAttributes.getBoolean(117, false)) {
            t(10);
        }
        this.C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        K();
        this.f1298f.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1297e);
        if (this.D) {
            viewGroup = (ViewGroup) from.inflate(this.B ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.C) {
            viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.A = false;
            this.f1318z = false;
        } else if (this.f1318z) {
            TypedValue typedValue = new TypedValue();
            this.f1297e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new f.c(this.f1297e, typedValue.resourceId) : this.f1297e).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            b0 b0Var = (b0) viewGroup.findViewById(R.id.decor_content_parent);
            this.f1304l = b0Var;
            b0Var.setWindowCallback(O());
            if (this.A) {
                this.f1304l.h(109);
            }
            if (this.f1316x) {
                this.f1304l.h(2);
            }
            if (this.f1317y) {
                this.f1304l.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            e0.m.g(viewGroup, new c.h(this));
            if (this.f1304l == null) {
                this.f1314v = (TextView) viewGroup.findViewById(R.id.title);
            }
            Method method = a1.f1832a;
            try {
                Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method2.isAccessible()) {
                    method2.setAccessible(true);
                }
                method2.invoke(viewGroup, new Object[0]);
            } catch (IllegalAccessException e2) {
                e = e2;
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e3) {
                e = e3;
                Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
            }
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.f1298f.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.f1298f.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new c.i(this));
            this.f1313u = viewGroup;
            Object obj = this.f1296d;
            CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1303k;
            if (!TextUtils.isEmpty(title)) {
                b0 b0Var2 = this.f1304l;
                if (b0Var2 != null) {
                    b0Var2.setWindowTitle(title);
                } else {
                    c.a aVar = this.f1301i;
                    if (aVar != null) {
                        ((q) aVar).f1385e.setWindowTitle(title);
                    } else {
                        TextView textView = this.f1314v;
                        if (textView != null) {
                            textView.setText(title);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1313u.findViewById(16908290);
            View decorView = this.f1298f.getDecorView();
            contentFrameLayout2.f323h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            if (contentFrameLayout2.isLaidOut()) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray obtainStyledAttributes2 = this.f1297e.obtainStyledAttributes(b.b.f1228j);
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
            if (obtainStyledAttributes2.hasValue(120)) {
                obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
            }
            if (obtainStyledAttributes2.hasValue(121)) {
                obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
            }
            if (obtainStyledAttributes2.hasValue(118)) {
                obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
            }
            if (obtainStyledAttributes2.hasValue(119)) {
                obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.f1312t = true;
            i N = N(0);
            if (this.L || N.f1340h != null) {
                return;
            }
            Q(108);
            return;
        }
        StringBuilder a2 = c.f.a("AppCompat does not support the current theme features: { windowActionBar: ");
        a2.append(this.f1318z);
        a2.append(", windowActionBarOverlay: ");
        a2.append(this.A);
        a2.append(", android:windowIsFloating: ");
        a2.append(this.C);
        a2.append(", windowActionModeOverlay: ");
        a2.append(this.B);
        a2.append(", windowNoTitle: ");
        a2.append(this.D);
        a2.append(" }");
        throw new IllegalArgumentException(a2.toString());
    }

    public final void K() {
        if (this.f1298f == null) {
            Object obj = this.f1296d;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.f1298f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public i L(Menu menu) {
        i[] iVarArr = this.F;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.f1340h == menu) {
                return iVar;
            }
        }
        return null;
    }

    public final f M(Context context) {
        if (this.Q == null) {
            if (p.f1374d == null) {
                Context applicationContext = context.getApplicationContext();
                p.f1374d = new p(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q = new C0014g(p.f1374d);
        }
        return this.Q;
    }

    public i N(int i2) {
        i[] iVarArr = this.F;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[i2 + 1];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.F = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar == null) {
            i iVar2 = new i(i2);
            iVarArr[i2] = iVar2;
            return iVar2;
        }
        return iVar;
    }

    public final Window.Callback O() {
        return this.f1298f.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P() {
        /*
            r3 = this;
            r3.J()
            boolean r0 = r3.f1318z
            if (r0 == 0) goto L37
            c.a r0 = r3.f1301i
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f1296d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            c.q r0 = new c.q
            java.lang.Object r1 = r3.f1296d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
        L1d:
            r3.f1301i = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            c.q r0 = new c.q
            java.lang.Object r1 = r3.f1296d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            c.a r0 = r3.f1301i
            if (r0 == 0) goto L37
            boolean r1 = r3.V
            r0.c(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.P():void");
    }

    public final void Q(int i2) {
        this.T = (1 << i2) | this.T;
        if (this.S) {
            return;
        }
        View decorView = this.f1298f.getDecorView();
        Runnable runnable = this.U;
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        decorView.postOnAnimation(runnable);
        this.S = true;
    }

    public int R(Context context, int i2) {
        f M;
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.R == null) {
                            this.R = new e(context);
                        }
                        M = this.R;
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                } else {
                    M = M(context);
                }
                return M.c();
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
        if (r15 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(c.g.i r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.S(c.g$i, android.view.KeyEvent):void");
    }

    public final boolean T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f1343k || U(iVar, keyEvent)) && (eVar = iVar.f1340h) != null) {
            z2 = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f1304l == null) {
            E(iVar, true);
        }
        return z2;
    }

    public final boolean U(i iVar, KeyEvent keyEvent) {
        b0 b0Var;
        b0 b0Var2;
        Resources.Theme theme;
        b0 b0Var3;
        b0 b0Var4;
        if (this.L) {
            return false;
        }
        if (iVar.f1343k) {
            return true;
        }
        i iVar2 = this.G;
        if (iVar2 != null && iVar2 != iVar) {
            E(iVar2, false);
        }
        Window.Callback O = O();
        if (O != null) {
            iVar.f1339g = O.onCreatePanelView(iVar.f1333a);
        }
        int i2 = iVar.f1333a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (b0Var4 = this.f1304l) != null) {
            b0Var4.d();
        }
        if (iVar.f1339g == null) {
            androidx.appcompat.view.menu.e eVar = iVar.f1340h;
            if (eVar == null || iVar.f1347o) {
                if (eVar == null) {
                    Context context = this.f1297e;
                    int i3 = iVar.f1333a;
                    if ((i3 == 0 || i3 == 108) && this.f1304l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            f.c cVar = new f.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.f161e = this;
                    iVar.a(eVar2);
                    if (iVar.f1340h == null) {
                        return false;
                    }
                }
                if (z2 && (b0Var2 = this.f1304l) != null) {
                    if (this.f1305m == null) {
                        this.f1305m = new b();
                    }
                    b0Var2.b(iVar.f1340h, this.f1305m);
                }
                iVar.f1340h.y();
                if (!O.onCreatePanelMenu(iVar.f1333a, iVar.f1340h)) {
                    iVar.a(null);
                    if (z2 && (b0Var = this.f1304l) != null) {
                        b0Var.b(null, this.f1305m);
                    }
                    return false;
                }
                iVar.f1347o = false;
            }
            iVar.f1340h.y();
            Bundle bundle = iVar.f1348p;
            if (bundle != null) {
                iVar.f1340h.u(bundle);
                iVar.f1348p = null;
            }
            if (!O.onPreparePanel(0, iVar.f1339g, iVar.f1340h)) {
                if (z2 && (b0Var3 = this.f1304l) != null) {
                    b0Var3.b(null, this.f1305m);
                }
                iVar.f1340h.x();
                return false;
            }
            iVar.f1340h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            iVar.f1340h.x();
        }
        iVar.f1343k = true;
        iVar.f1344l = false;
        this.G = iVar;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.f1312t && (viewGroup = this.f1313u) != null) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.f1312t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int X(s sVar, Rect rect) {
        boolean z2;
        boolean z3;
        Context context;
        int i2;
        int d2 = sVar.d();
        ActionBarContextView actionBarContextView = this.f1308p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1308p.getLayoutParams();
            if (this.f1308p.isShown()) {
                if (this.W == null) {
                    this.W = new Rect();
                    this.X = new Rect();
                }
                Rect rect2 = this.W;
                Rect rect3 = this.X;
                rect2.set(sVar.b(), sVar.d(), sVar.c(), sVar.a());
                a1.a(this.f1313u, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                ViewGroup viewGroup = this.f1313u;
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                s h2 = s.h(m.c.a(viewGroup));
                int b2 = h2.b();
                int c2 = h2.c();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z3 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z3 = true;
                }
                if (i3 <= 0 || this.f1315w != null) {
                    View view = this.f1315w;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            this.f1315w.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f1297e);
                    this.f1315w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    this.f1313u.addView(this.f1315w, -1, layoutParams);
                }
                View view3 = this.f1315w;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.f1315w;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        context = this.f1297e;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f1297e;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = v.a.f2707a;
                    view4.setBackgroundColor(context.getColor(i2));
                }
                if (!this.B && z2) {
                    d2 = 0;
                }
                r4 = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                r4 = false;
                z2 = false;
            }
            if (r4) {
                this.f1308p.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f1315w;
        if (view5 != null) {
            view5.setVisibility(z2 ? 0 : 8);
        }
        return d2;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void a(androidx.appcompat.view.menu.e eVar) {
        b0 b0Var = this.f1304l;
        if (b0Var == null || !b0Var.f() || (ViewConfiguration.get(this.f1297e).hasPermanentMenuKey() && !this.f1304l.c())) {
            i N = N(0);
            N.f1346n = true;
            E(N, false);
            S(N, null);
            return;
        }
        Window.Callback O = O();
        if (this.f1304l.e()) {
            this.f1304l.g();
            if (this.L) {
                return;
            }
            O.onPanelClosed(108, N(0).f1340h);
        } else if (O == null || this.L) {
        } else {
            if (this.S && (1 & this.T) != 0) {
                this.f1298f.getDecorView().removeCallbacks(this.U);
                this.U.run();
            }
            i N2 = N(0);
            androidx.appcompat.view.menu.e eVar2 = N2.f1340h;
            if (eVar2 == null || N2.f1347o || !O.onPreparePanel(0, N2.f1339g, eVar2)) {
                return;
            }
            O.onMenuOpened(108, N2.f1340h);
            this.f1304l.a();
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i L;
        Window.Callback O = O();
        if (O == null || this.L || (L = L(eVar.k())) == null) {
            return false;
        }
        return O.onMenuItemSelected(L.f1333a, menuItem);
    }

    @Override // c.e
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.f1313u.findViewById(16908290)).addView(view, layoutParams);
        this.f1299g.f1725b.onContentChanged();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0181  */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.content.Context d(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.d(android.content.Context):android.content.Context");
    }

    @Override // c.e
    public <T extends View> T e(int i2) {
        J();
        return (T) this.f1298f.findViewById(i2);
    }

    @Override // c.e
    public int f() {
        return this.M;
    }

    @Override // c.e
    public MenuInflater g() {
        if (this.f1302j == null) {
            P();
            c.a aVar = this.f1301i;
            this.f1302j = new f.g(aVar != null ? aVar.b() : this.f1297e);
        }
        return this.f1302j;
    }

    @Override // c.e
    public c.a h() {
        P();
        return this.f1301i;
    }

    @Override // c.e
    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f1297e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (from.getFactory2() instanceof g) {
        } else {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // c.e
    public void j() {
        P();
        c.a aVar = this.f1301i;
        Q(0);
    }

    @Override // c.e
    public void k(Configuration configuration) {
        if (this.f1318z && this.f1312t) {
            P();
            c.a aVar = this.f1301i;
            if (aVar != null) {
                q qVar = (q) aVar;
                qVar.f(qVar.f1381a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        h.i a2 = h.i.a();
        Context context = this.f1297e;
        synchronized (a2) {
            l0 l0Var = a2.f1887a;
            synchronized (l0Var) {
                l.e<WeakReference<Drawable.ConstantState>> eVar = l0Var.f1941d.get(context);
                if (eVar != null) {
                    eVar.a();
                }
            }
        }
        A(false);
    }

    @Override // c.e
    public void l(Bundle bundle) {
        this.I = true;
        A(false);
        K();
        Object obj = this.f1296d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = u.g.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                c.a aVar = this.f1301i;
                if (aVar == null) {
                    this.V = true;
                } else {
                    aVar.c(true);
                }
            }
            synchronized (c.e.f1292c) {
                c.e.s(this);
                c.e.f1291b.add(new WeakReference<>(this));
            }
        }
        this.J = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1296d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = c.e.f1292c
            monitor-enter(r0)
            c.e.s(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.S
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f1298f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.U
            r0.removeCallbacks(r1)
        L20:
            r0 = 0
            r3.K = r0
            r0 = 1
            r3.L = r0
            int r0 = r3.M
            r1 = -100
            if (r0 == r1) goto L50
            java.lang.Object r0 = r3.f1296d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L50
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L50
            l.h<java.lang.String, java.lang.Integer> r0 = c.g.Z
            java.lang.Object r1 = r3.f1296d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5f
        L50:
            l.h<java.lang.String, java.lang.Integer> r0 = c.g.Z
            java.lang.Object r1 = r3.f1296d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5f:
            c.a r0 = r3.f1301i
            if (r0 == 0) goto L66
            java.util.Objects.requireNonNull(r0)
        L66:
            c.g$f r0 = r3.Q
            if (r0 == 0) goto L6d
            r0.a()
        L6d:
            c.g$f r0 = r3.R
            if (r0 == 0) goto L74
            r0.a()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.g.m():void");
    }

    @Override // c.e
    public void n(Bundle bundle) {
        J();
    }

    @Override // c.e
    public void o() {
        P();
        c.a aVar = this.f1301i;
        if (aVar != null) {
            ((q) aVar).f1401u = true;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        m mVar;
        if (this.Y == null) {
            String string = this.f1297e.obtainStyledAttributes(b.b.f1228j).getString(114);
            if (string == null) {
                mVar = new m();
            } else {
                try {
                    this.Y = (m) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    mVar = new m();
                }
            }
            this.Y = mVar;
        }
        m mVar2 = this.Y;
        int i2 = z0.f2088a;
        return mVar2.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // c.e
    public void p(Bundle bundle) {
    }

    @Override // c.e
    public void q() {
        this.K = true;
        z();
    }

    @Override // c.e
    public void r() {
        this.K = false;
        P();
        c.a aVar = this.f1301i;
        if (aVar != null) {
            q qVar = (q) aVar;
            qVar.f1401u = false;
            f.h hVar = qVar.f1400t;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    @Override // c.e
    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D && i2 == 108) {
            return false;
        }
        if (this.f1318z && i2 == 1) {
            this.f1318z = false;
        }
        if (i2 == 1) {
            W();
            this.D = true;
            return true;
        } else if (i2 == 2) {
            W();
            this.f1316x = true;
            return true;
        } else if (i2 == 5) {
            W();
            this.f1317y = true;
            return true;
        } else if (i2 == 10) {
            W();
            this.B = true;
            return true;
        } else if (i2 == 108) {
            W();
            this.f1318z = true;
            return true;
        } else if (i2 != 109) {
            return this.f1298f.requestFeature(i2);
        } else {
            W();
            this.A = true;
            return true;
        }
    }

    @Override // c.e
    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f1313u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1297e).inflate(i2, viewGroup);
        this.f1299g.f1725b.onContentChanged();
    }

    @Override // c.e
    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f1313u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1299g.f1725b.onContentChanged();
    }

    @Override // c.e
    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f1313u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1299g.f1725b.onContentChanged();
    }

    @Override // c.e
    public void x(int i2) {
        this.N = i2;
    }

    @Override // c.e
    public final void y(CharSequence charSequence) {
        this.f1303k = charSequence;
        b0 b0Var = this.f1304l;
        if (b0Var != null) {
            b0Var.setWindowTitle(charSequence);
            return;
        }
        c.a aVar = this.f1301i;
        if (aVar != null) {
            ((q) aVar).f1385e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f1314v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return A(true);
    }
}