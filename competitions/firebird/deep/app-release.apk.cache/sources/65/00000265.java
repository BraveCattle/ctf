package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.x64m.xsfmnative.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static x0 f2050k;

    /* renamed from: l  reason: collision with root package name */
    public static x0 f2051l;

    /* renamed from: b  reason: collision with root package name */
    public final View f2052b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f2053c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2054d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f2055e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f2056f = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f2057g;

    /* renamed from: h  reason: collision with root package name */
    public int f2058h;

    /* renamed from: i  reason: collision with root package name */
    public y0 f2059i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2060j;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.d(false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.b();
        }
    }

    public x0(View view, CharSequence charSequence) {
        this.f2052b = view;
        this.f2053c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = e0.n.f1641a;
        this.f2054d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(x0 x0Var) {
        x0 x0Var2 = f2050k;
        if (x0Var2 != null) {
            x0Var2.f2052b.removeCallbacks(x0Var2.f2055e);
        }
        f2050k = x0Var;
        if (x0Var != null) {
            x0Var.f2052b.postDelayed(x0Var.f2055e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f2057g = Integer.MAX_VALUE;
        this.f2058h = Integer.MAX_VALUE;
    }

    public void b() {
        if (f2051l == this) {
            f2051l = null;
            y0 y0Var = this.f2059i;
            if (y0Var != null) {
                y0Var.a();
                this.f2059i = null;
                a();
                this.f2052b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2050k == this) {
            c(null);
        }
        this.f2052b.removeCallbacks(this.f2056f);
    }

    public void d(boolean z2) {
        int height;
        int i2;
        long longPressTimeout;
        View view = this.f2052b;
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        if (view.isAttachedToWindow()) {
            c(null);
            x0 x0Var = f2051l;
            if (x0Var != null) {
                x0Var.b();
            }
            f2051l = this;
            this.f2060j = z2;
            y0 y0Var = new y0(this.f2052b.getContext());
            this.f2059i = y0Var;
            View view2 = this.f2052b;
            int i3 = this.f2057g;
            int i4 = this.f2058h;
            boolean z3 = this.f2060j;
            CharSequence charSequence = this.f2053c;
            if (y0Var.f2068b.getParent() != null) {
                y0Var.a();
            }
            y0Var.f2069c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = y0Var.f2070d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = y0Var.f2067a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i3 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = y0Var.f2067a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = y0Var.f2067a.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(y0Var.f2071e);
                Rect rect = y0Var.f2071e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = y0Var.f2067a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    y0Var.f2071e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(y0Var.f2073g);
                view2.getLocationOnScreen(y0Var.f2072f);
                int[] iArr = y0Var.f2072f;
                int i5 = iArr[0];
                int[] iArr2 = y0Var.f2073g;
                iArr[0] = i5 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i3) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                y0Var.f2068b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = y0Var.f2068b.getMeasuredHeight();
                int[] iArr3 = y0Var.f2072f;
                int i6 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i7 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z3 ? measuredHeight + i7 <= y0Var.f2071e.height() : i6 < 0) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) y0Var.f2067a.getSystemService("window")).addView(y0Var.f2068b, y0Var.f2070d);
            this.f2052b.addOnAttachStateChangeListener(this);
            if (this.f2060j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((this.f2052b.getWindowSystemUiVisibility() & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f2052b.removeCallbacks(this.f2056f);
            this.f2052b.postDelayed(this.f2056f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z2;
        if (this.f2059i == null || !this.f2060j) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f2052b.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    a();
                    b();
                }
            } else if (this.f2052b.isEnabled() && this.f2059i == null) {
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (Math.abs(x2 - this.f2057g) > this.f2054d || Math.abs(y2 - this.f2058h) > this.f2054d) {
                    this.f2057g = x2;
                    this.f2058h = y2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f2057g = view.getWidth() / 2;
        this.f2058h = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}