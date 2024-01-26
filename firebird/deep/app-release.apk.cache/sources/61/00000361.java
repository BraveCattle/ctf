package w0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import e0.m;
import e0.o;
import e0.s;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b extends c<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2751c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f2752d;

    /* renamed from: e  reason: collision with root package name */
    public int f2753e;

    /* renamed from: f  reason: collision with root package name */
    public int f2754f;

    public b() {
        this.f2751c = new Rect();
        this.f2752d = new Rect();
        this.f2753e = 0;
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2751c = new Rect();
        this.f2752d = new Rect();
        this.f2753e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            AppBarLayout w2 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view));
            if (w2 != null) {
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                if (w2.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    view.setFitsSystemWindows(true);
                    if (view.getFitsSystemWindows()) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = View.MeasureSpec.getSize(i4);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.s(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size - w2.getMeasuredHeight()) + w2.getTotalScrollRange(), i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // w0.c
    public void t(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        AppBarLayout w2 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view));
        if (w2 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f2751c;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, w2.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((w2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            s lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rect.left = lastWindowInsets.b() + rect.left;
                    rect.right -= lastWindowInsets.c();
                }
            }
            Rect rect2 = this.f2752d;
            int i4 = fVar.f667c;
            if (i4 == 0) {
                i4 = 8388659;
            }
            Gravity.apply(i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int v2 = v(w2);
            view.layout(rect2.left, rect2.top - v2, rect2.right, rect2.bottom - v2);
            i3 = rect2.top - w2.getBottom();
        } else {
            coordinatorLayout.r(view, i2);
            i3 = 0;
        }
        this.f2753e = i3;
    }

    public final int v(View view) {
        int i2;
        if (this.f2754f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f665a;
            int w2 = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).w() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + w2 > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (w2 / i2);
            }
        }
        int i3 = this.f2754f;
        return b.a.e((int) (f2 * i3), 0, i3);
    }
}