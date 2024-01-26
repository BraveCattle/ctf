package c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import f.a;
import h.z0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends k0.b implements d {

    /* renamed from: n  reason: collision with root package name */
    public e f1290n;

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(m().d(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        n();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // u.f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        n();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // c.d
    public void e(f.a aVar) {
    }

    @Override // c.d
    public f.a f(a.InterfaceC0020a interfaceC0020a) {
        return null;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i2) {
        return (T) m().e(i2);
    }

    @Override // c.d
    public void g(f.a aVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m().g();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i2 = z0.f2088a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m().j();
    }

    @Override // k0.b
    public void l() {
        m().j();
    }

    public e m() {
        if (this.f1290n == null) {
            l.c<WeakReference<e>> cVar = e.f1291b;
            this.f1290n = new g(this, null, this, this);
        }
        return this.f1290n;
    }

    public a n() {
        return m().h();
    }

    public Intent o() {
        return u.g.a(this);
    }

    @Override // k0.b, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m().k(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // k0.b, androidx.activity.ComponentActivity, u.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        e m2 = m();
        m2.i();
        m2.l(bundle);
        super.onCreate(bundle);
    }

    @Override // k0.b, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m().m();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // k0.b, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent a2;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a n2 = n();
        if (menuItem.getItemId() == 16908332 && n2 != null && (((q) n2).f1385e.j() & 4) != 0 && (a2 = u.g.a(this)) != null) {
            if (shouldUpRecreateTask(a2)) {
                ArrayList arrayList = new ArrayList();
                Intent o2 = o();
                if (o2 == null) {
                    o2 = u.g.a(this);
                }
                if (o2 != null) {
                    ComponentName component = o2.getComponent();
                    if (component == null) {
                        component = o2.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            Intent b2 = u.g.b(this, component);
                            if (b2 == null) {
                                break;
                            }
                            arrayList.add(size, b2);
                            component = b2.getComponent();
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                            throw new IllegalArgumentException(e2);
                        }
                    }
                    arrayList.add(o2);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    Object obj = v.a.f2707a;
                    startActivities(intentArr, null);
                    try {
                        int i3 = u.a.f2679b;
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(a2);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    @Override // k0.b, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m().n(bundle);
    }

    @Override // k0.b, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m().o();
    }

    @Override // k0.b, androidx.activity.ComponentActivity, u.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m().p(bundle);
    }

    @Override // k0.b, android.app.Activity
    public void onStart() {
        super.onStart();
        m().q();
    }

    @Override // k0.b, android.app.Activity
    public void onStop() {
        super.onStop();
        m().r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        m().y(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        n();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        m().u(i2);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m().v(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m().w(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        super.setTheme(i2);
        m().x(i2);
    }
}