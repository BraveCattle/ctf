package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f211a;

    /* renamed from: b  reason: collision with root package name */
    public final e f212b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f213c;

    /* renamed from: d  reason: collision with root package name */
    public final int f214d;

    /* renamed from: e  reason: collision with root package name */
    public final int f215e;

    /* renamed from: f  reason: collision with root package name */
    public View f216f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f218h;

    /* renamed from: i  reason: collision with root package name */
    public i.a f219i;

    /* renamed from: j  reason: collision with root package name */
    public g.d f220j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f221k;

    /* renamed from: g  reason: collision with root package name */
    public int f217g = 8388611;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f222l = new a();

    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.c();
        }
    }

    public h(Context context, e eVar, View view, boolean z2, int i2, int i3) {
        this.f211a = context;
        this.f212b = eVar;
        this.f216f = view;
        this.f213c = z2;
        this.f214d = i2;
        this.f215e = i3;
    }

    public g.d a() {
        if (this.f220j == null) {
            Display defaultDisplay = ((WindowManager) this.f211a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            g.d bVar = Math.min(point.x, point.y) >= this.f211a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new b(this.f211a, this.f216f, this.f214d, this.f215e, this.f213c) : new k(this.f211a, this.f212b, this.f216f, this.f214d, this.f215e, this.f213c);
            bVar.l(this.f212b);
            bVar.r(this.f222l);
            bVar.n(this.f216f);
            bVar.d(this.f219i);
            bVar.o(this.f218h);
            bVar.p(this.f217g);
            this.f220j = bVar;
        }
        return this.f220j;
    }

    public boolean b() {
        g.d dVar = this.f220j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f220j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f221k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(i.a aVar) {
        this.f219i = aVar;
        g.d dVar = this.f220j;
        if (dVar != null) {
            dVar.d(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z2, boolean z3) {
        g.d a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f217g;
            View view = this.f216f;
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f216f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f211a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f1772b = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.i();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f216f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}