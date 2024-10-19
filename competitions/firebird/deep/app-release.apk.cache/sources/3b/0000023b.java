package h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class k0 extends i0 implements j0 {
    public static Method D;
    public j0 C;

    /* loaded from: classes.dex */
    public static class a extends e0 {

        /* renamed from: o  reason: collision with root package name */
        public final int f1929o;

        /* renamed from: p  reason: collision with root package name */
        public final int f1930p;

        /* renamed from: q  reason: collision with root package name */
        public j0 f1931q;

        /* renamed from: r  reason: collision with root package name */
        public MenuItem f1932r;

        public a(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1929o = 21;
                this.f1930p = 22;
                return;
            }
            this.f1929o = 22;
            this.f1930p = 21;
        }

        @Override // h.e0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.f1931q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) adapter;
                androidx.appcompat.view.menu.g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < dVar.getCount()) {
                    gVar = dVar.getItem(i3);
                }
                MenuItem menuItem = this.f1932r;
                if (menuItem != gVar) {
                    androidx.appcompat.view.menu.e eVar = dVar.f150b;
                    if (menuItem != null) {
                        this.f1931q.k(eVar, menuItem);
                    }
                    this.f1932r = gVar;
                    if (gVar != null) {
                        this.f1931q.g(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f1929o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.f1930p) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ((androidx.appcompat.view.menu.d) getAdapter()).f150b.c(false);
                return true;
            }
        }

        public void setHoverListener(j0 j0Var) {
            this.f1931q = j0Var;
        }

        @Override // h.e0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, null, i2, i3);
    }

    @Override // h.j0
    public void g(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        j0 j0Var = this.C;
        if (j0Var != null) {
            j0Var.g(eVar, menuItem);
        }
    }

    @Override // h.j0
    public void k(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        j0 j0Var = this.C;
        if (j0Var != null) {
            j0Var.k(eVar, menuItem);
        }
    }

    @Override // h.i0
    public e0 q(Context context, boolean z2) {
        a aVar = new a(context, z2);
        aVar.setHoverListener(this);
        return aVar;
    }
}