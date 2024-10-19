package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: b  reason: collision with root package name */
    public e f181b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.appcompat.app.b f182c;

    /* renamed from: d  reason: collision with root package name */
    public c f183d;

    public f(e eVar) {
        this.f181b = eVar;
    }

    @Override // androidx.appcompat.view.menu.i.a
    public void b(e eVar, boolean z2) {
        androidx.appcompat.app.b bVar;
        if ((z2 || eVar == this.f181b) && (bVar = this.f182c) != null) {
            bVar.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i.a
    public boolean c(e eVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f181b.q(((c.a) this.f183d.a()).getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f183d;
        e eVar = this.f181b;
        i.a aVar = cVar.f146f;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f182c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f182c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f181b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f181b.performShortcut(i2, keyEvent, 0);
    }
}