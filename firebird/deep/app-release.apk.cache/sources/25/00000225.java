package h;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.x64m.xsfmnative.R;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class e0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f1847b;

    /* renamed from: c  reason: collision with root package name */
    public int f1848c;

    /* renamed from: d  reason: collision with root package name */
    public int f1849d;

    /* renamed from: e  reason: collision with root package name */
    public int f1850e;

    /* renamed from: f  reason: collision with root package name */
    public int f1851f;

    /* renamed from: g  reason: collision with root package name */
    public int f1852g;

    /* renamed from: h  reason: collision with root package name */
    public Field f1853h;

    /* renamed from: i  reason: collision with root package name */
    public a f1854i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1855j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1856k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1857l;

    /* renamed from: m  reason: collision with root package name */
    public g0.c f1858m;

    /* renamed from: n  reason: collision with root package name */
    public b f1859n;

    /* loaded from: classes.dex */
    public static class a extends e.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1860c;

        public a(Drawable drawable) {
            super(drawable);
            this.f1860c = true;
        }

        @Override // e.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1860c) {
                this.f1612b.draw(canvas);
            }
        }

        @Override // e.a, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f1860c) {
                this.f1612b.setHotspot(f2, f3);
            }
        }

        @Override // e.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f1860c) {
                this.f1612b.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        @Override // e.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1860c) {
                return this.f1612b.setState(iArr);
            }
            return false;
        }

        @Override // e.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f1860c) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0 e0Var = e0.this;
            e0Var.f1859n = null;
            e0Var.drawableStateChanged();
        }
    }

    public e0(Context context, boolean z2) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1847b = new Rect();
        this.f1848c = 0;
        this.f1849d = 0;
        this.f1850e = 0;
        this.f1851f = 0;
        this.f1856k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1853h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z2) {
        a aVar = this.f1854i;
        if (aVar != null) {
            aVar.f1860c = z2;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0128 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.e0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1857l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1847b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1847b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1859n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1856k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1856k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1856k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1856k && this.f1855j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1859n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1859n == null) {
            b bVar = new b();
            this.f1859n = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1852g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1859n;
        if (bVar != null) {
            e0 e0Var = e0.this;
            e0Var.f1859n = null;
            e0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f1855j = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1854i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1848c = rect.left;
        this.f1849d = rect.top;
        this.f1850e = rect.right;
        this.f1851f = rect.bottom;
    }
}