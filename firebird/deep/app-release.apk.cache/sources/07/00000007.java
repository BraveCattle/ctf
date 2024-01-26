package androidx.activity;

import a.c;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import m0.k;
import m0.l;
import u.f;

/* loaded from: classes.dex */
public class ComponentActivity extends f implements l, q0.b, c {

    /* renamed from: c  reason: collision with root package name */
    public final e f3c;

    /* renamed from: d  reason: collision with root package name */
    public final q0.a f4d;

    /* renamed from: e  reason: collision with root package name */
    public k f5e;

    /* renamed from: f  reason: collision with root package name */
    public final OnBackPressedDispatcher f6f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public k f10a;
    }

    public ComponentActivity() {
        e eVar = new e(this);
        this.f3c = eVar;
        this.f4d = new q0.a(this);
        this.f6f = new OnBackPressedDispatcher(new a());
        eVar.a(new d() { // from class: androidx.activity.ComponentActivity.2
            @Override // androidx.lifecycle.d
            public void c(m0.c cVar, c.a aVar) {
                if (aVar == c.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        eVar.a(new d() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.d
            public void c(m0.c cVar, c.a aVar) {
                if (aVar != c.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.d().a();
            }
        });
    }

    @Override // m0.c
    public androidx.lifecycle.c a() {
        return this.f3c;
    }

    @Override // a.c
    public final OnBackPressedDispatcher b() {
        return this.f6f;
    }

    @Override // q0.b
    public final androidx.savedstate.a c() {
        return this.f4d.f2554b;
    }

    @Override // m0.l
    public k d() {
        if (getApplication() != null) {
            if (this.f5e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f5e = bVar.f10a;
                }
                if (this.f5e == null) {
                    this.f5e = new k();
                }
            }
            return this.f5e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f6f.a();
    }

    @Override // u.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4d.a(bundle);
        g.b(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        k kVar = this.f5e;
        if (kVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            kVar = bVar.f10a;
        }
        if (kVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f10a = kVar;
        return bVar2;
    }

    @Override // u.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        e eVar = this.f3c;
        if (eVar instanceof e) {
            eVar.f(c.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f4d.b(bundle);
    }
}