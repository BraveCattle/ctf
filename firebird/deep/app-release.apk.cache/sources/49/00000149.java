package c;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: b  reason: collision with root package name */
    public static final l.c<WeakReference<e>> f1291b = new l.c<>();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1292c = new Object();

    public static void s(e eVar) {
        synchronized (f1292c) {
            Iterator<WeakReference<e>> it = f1291b.iterator();
            while (it.hasNext()) {
                e eVar2 = it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i2);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract a h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l(Bundle bundle);

    public abstract void m();

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i2);

    public abstract void u(int i2);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public void x(int i2) {
    }

    public abstract void y(CharSequence charSequence);
}