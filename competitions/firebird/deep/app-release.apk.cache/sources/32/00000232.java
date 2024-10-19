package h;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class i0 implements g.f {
    public static Method A;
    public static Method B;

    /* renamed from: b  reason: collision with root package name */
    public Context f1894b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f1895c;

    /* renamed from: d  reason: collision with root package name */
    public e0 f1896d;

    /* renamed from: g  reason: collision with root package name */
    public int f1899g;

    /* renamed from: h  reason: collision with root package name */
    public int f1900h;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1902j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1903k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1904l;

    /* renamed from: o  reason: collision with root package name */
    public DataSetObserver f1907o;

    /* renamed from: p  reason: collision with root package name */
    public View f1908p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemClickListener f1909q;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f1914v;

    /* renamed from: x  reason: collision with root package name */
    public Rect f1916x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1917y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow f1918z;

    /* renamed from: e  reason: collision with root package name */
    public int f1897e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f1898f = -2;

    /* renamed from: i  reason: collision with root package name */
    public int f1901i = 1002;

    /* renamed from: m  reason: collision with root package name */
    public int f1905m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f1906n = Integer.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public final e f1910r = new e();

    /* renamed from: s  reason: collision with root package name */
    public final d f1911s = new d();

    /* renamed from: t  reason: collision with root package name */
    public final c f1912t = new c();

    /* renamed from: u  reason: collision with root package name */
    public final a f1913u = new a();

    /* renamed from: w  reason: collision with root package name */
    public final Rect f1915w = new Rect();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0 e0Var = i0.this.f1896d;
            if (e0Var != null) {
                e0Var.setListSelectionHidden(true);
                e0Var.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (i0.this.a()) {
                i0.this.i();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            i0.this.dismiss();
        }
    }

    /* loaded from: classes.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 == 1) {
                if ((i0.this.f1918z.getInputMethodMode() == 2) || i0.this.f1918z.getContentView() == null) {
                    return;
                }
                i0 i0Var = i0.this;
                i0Var.f1914v.removeCallbacks(i0Var.f1910r);
                i0.this.f1910r.run();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = i0.this.f1918z) != null && popupWindow.isShowing() && x2 >= 0 && x2 < i0.this.f1918z.getWidth() && y2 >= 0 && y2 < i0.this.f1918z.getHeight()) {
                i0 i0Var = i0.this;
                i0Var.f1914v.postDelayed(i0Var.f1910r, 250L);
                return false;
            } else if (action == 1) {
                i0 i0Var2 = i0.this;
                i0Var2.f1914v.removeCallbacks(i0Var2.f1910r);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0 e0Var = i0.this.f1896d;
            if (e0Var != null) {
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                if (!e0Var.isAttachedToWindow() || i0.this.f1896d.getCount() <= i0.this.f1896d.getChildCount()) {
                    return;
                }
                int childCount = i0.this.f1896d.getChildCount();
                i0 i0Var = i0.this;
                if (childCount <= i0Var.f1906n) {
                    i0Var.f1918z.setInputMethodMode(2);
                    i0.this.i();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public i0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1894b = context;
        this.f1914v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1233o, i2, i3);
        this.f1899g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f1900h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1902j = true;
        }
        obtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i2, i3);
        this.f1918z = oVar;
        oVar.setInputMethodMode(1);
    }

    @Override // g.f
    public boolean a() {
        return this.f1918z.isShowing();
    }

    public void c(int i2) {
        this.f1899g = i2;
    }

    public int d() {
        return this.f1899g;
    }

    @Override // g.f
    public void dismiss() {
        this.f1918z.dismiss();
        this.f1918z.setContentView(null);
        this.f1896d = null;
        this.f1914v.removeCallbacks(this.f1910r);
    }

    @Override // g.f
    public ListView e() {
        return this.f1896d;
    }

    @Override // g.f
    public void i() {
        int i2;
        int i3;
        int paddingBottom;
        e0 e0Var;
        if (this.f1896d == null) {
            e0 q2 = q(this.f1894b, !this.f1917y);
            this.f1896d = q2;
            q2.setAdapter(this.f1895c);
            this.f1896d.setOnItemClickListener(this.f1909q);
            this.f1896d.setFocusable(true);
            this.f1896d.setFocusableInTouchMode(true);
            this.f1896d.setOnItemSelectedListener(new h0(this));
            this.f1896d.setOnScrollListener(this.f1912t);
            this.f1918z.setContentView(this.f1896d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1918z.getContentView();
        }
        Drawable background = this.f1918z.getBackground();
        if (background != null) {
            background.getPadding(this.f1915w);
            Rect rect = this.f1915w;
            int i4 = rect.top;
            i2 = rect.bottom + i4;
            if (!this.f1902j) {
                this.f1900h = -i4;
            }
        } else {
            this.f1915w.setEmpty();
            i2 = 0;
        }
        int maxAvailableHeight = this.f1918z.getMaxAvailableHeight(this.f1908p, this.f1900h, this.f1918z.getInputMethodMode() == 2);
        if (this.f1897e == -1) {
            paddingBottom = maxAvailableHeight + i2;
        } else {
            int i5 = this.f1898f;
            if (i5 != -2) {
                i3 = 1073741824;
                if (i5 == -1) {
                    int i6 = this.f1894b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1915w;
                    i5 = i6 - (rect2.left + rect2.right);
                }
            } else {
                int i7 = this.f1894b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1915w;
                i5 = i7 - (rect3.left + rect3.right);
                i3 = Integer.MIN_VALUE;
            }
            int a2 = this.f1896d.a(View.MeasureSpec.makeMeasureSpec(i5, i3), maxAvailableHeight - 0, -1);
            paddingBottom = a2 + (a2 > 0 ? this.f1896d.getPaddingBottom() + this.f1896d.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z2 = this.f1918z.getInputMethodMode() == 2;
        this.f1918z.setWindowLayoutType(this.f1901i);
        if (this.f1918z.isShowing()) {
            View view = this.f1908p;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            if (view.isAttachedToWindow()) {
                int i8 = this.f1898f;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f1908p.getWidth();
                }
                int i9 = this.f1897e;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f1918z.setWidth(this.f1898f == -1 ? -1 : 0);
                        this.f1918z.setHeight(0);
                    } else {
                        this.f1918z.setWidth(this.f1898f == -1 ? -1 : 0);
                        this.f1918z.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f1918z.setOutsideTouchable(true);
                this.f1918z.update(this.f1908p, this.f1899g, this.f1900h, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f1898f;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.f1908p.getWidth();
        }
        int i11 = this.f1897e;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.f1918z.setWidth(i10);
        this.f1918z.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = A;
            if (method != null) {
                try {
                    method.invoke(this.f1918z, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1918z.setIsClippedToScreen(true);
        }
        this.f1918z.setOutsideTouchable(true);
        this.f1918z.setTouchInterceptor(this.f1911s);
        if (this.f1904l) {
            this.f1918z.setOverlapAnchor(this.f1903k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = B;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1918z, this.f1916x);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f1918z.setEpicenterBounds(this.f1916x);
        }
        this.f1918z.showAsDropDown(this.f1908p, this.f1899g, this.f1900h, this.f1905m);
        this.f1896d.setSelection(-1);
        if ((!this.f1917y || this.f1896d.isInTouchMode()) && (e0Var = this.f1896d) != null) {
            e0Var.setListSelectionHidden(true);
            e0Var.requestLayout();
        }
        if (this.f1917y) {
            return;
        }
        this.f1914v.post(this.f1913u);
    }

    public int j() {
        if (this.f1902j) {
            return this.f1900h;
        }
        return 0;
    }

    public void l(Drawable drawable) {
        this.f1918z.setBackgroundDrawable(drawable);
    }

    public void m(int i2) {
        this.f1900h = i2;
        this.f1902j = true;
    }

    public Drawable n() {
        return this.f1918z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1907o;
        if (dataSetObserver == null) {
            this.f1907o = new b();
        } else {
            ListAdapter listAdapter2 = this.f1895c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1895c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1907o);
        }
        e0 e0Var = this.f1896d;
        if (e0Var != null) {
            e0Var.setAdapter(this.f1895c);
        }
    }

    public e0 q(Context context, boolean z2) {
        return new e0(context, z2);
    }

    public void r(int i2) {
        Drawable background = this.f1918z.getBackground();
        if (background == null) {
            this.f1898f = i2;
            return;
        }
        background.getPadding(this.f1915w);
        Rect rect = this.f1915w;
        this.f1898f = rect.left + rect.right + i2;
    }

    public void s(boolean z2) {
        this.f1917y = z2;
        this.f1918z.setFocusable(z2);
    }
}