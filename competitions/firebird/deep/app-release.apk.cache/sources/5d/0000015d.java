package c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import e0.d;
import f.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class l extends Dialog implements d {

    /* renamed from: b  reason: collision with root package name */
    public e f1355b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f1356c;

    /* loaded from: classes.dex */
    public class a implements d.a {
        public a() {
        }

        @Override // e0.d.a
        public boolean h(KeyEvent keyEvent) {
            return l.this.b(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903245(0x7f0300cd, float:1.7413303E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            c.l$a r2 = new c.l$a
            r2.<init>()
            r4.f1356c = r2
            c.e r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r2.x(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.l.<init>(android.content.Context, int):void");
    }

    public e a() {
        if (this.f1355b == null) {
            l.c<WeakReference<e>> cVar = e.f1291b;
            this.f1355b = new g(getContext(), getWindow(), this, this);
        }
        return this.f1355b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().m();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e0.d.b(this.f1356c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // c.d
    public void e(f.a aVar) {
    }

    @Override // c.d
    public f.a f(a.InterfaceC0020a interfaceC0020a) {
        return null;
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i2) {
        return (T) a().e(i2);
    }

    @Override // c.d
    public void g(f.a aVar) {
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().j();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        a().u(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().v(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i2) {
        super.setTitle(i2);
        a().y(getContext().getString(i2));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}