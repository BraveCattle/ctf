package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f247b;

    /* renamed from: c  reason: collision with root package name */
    public View f248c;

    /* renamed from: d  reason: collision with root package name */
    public View f249d;

    /* renamed from: e  reason: collision with root package name */
    public View f250e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f251f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f252g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f253h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f254i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f255j;

    /* renamed from: k  reason: collision with root package name */
    public int f256k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.b bVar = new h.b(this);
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        setBackground(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1219a);
        boolean z2 = false;
        this.f251f = obtainStyledAttributes.getDrawable(0);
        this.f252g = obtainStyledAttributes.getDrawable(2);
        this.f256k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f254i = true;
            this.f253h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f254i ? !(this.f251f != null || this.f252g != null) : this.f253h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f251f;
        if (drawable != null && drawable.isStateful()) {
            this.f251f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f252g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f252g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f253h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f253h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f248c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f251f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f252g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f253h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f249d = findViewById(R.id.action_bar);
        this.f250e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f247b || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        View view2 = this.f248c;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f254i) {
            Drawable drawable3 = this.f253h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.f251f != null) {
                if (this.f249d.getVisibility() == 0) {
                    drawable2 = this.f251f;
                    left = this.f249d.getLeft();
                    top = this.f249d.getTop();
                    right = this.f249d.getRight();
                    view = this.f249d;
                } else {
                    View view3 = this.f250e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f251f.setBounds(0, 0, 0, 0);
                        z4 = true;
                    } else {
                        drawable2 = this.f251f;
                        left = this.f250e.getLeft();
                        top = this.f250e.getTop();
                        right = this.f250e.getRight();
                        view = this.f250e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.f255j = z5;
            if (z5 && (drawable = this.f252g) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f249d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f256k
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f249d
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f248c
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f249d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f249d
        L42:
            int r0 = r3.a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f250e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f250e
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f248c
            int r1 = r3.a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f251f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f251f);
        }
        this.f251f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f249d;
            if (view != null) {
                this.f251f.setBounds(view.getLeft(), this.f249d.getTop(), this.f249d.getRight(), this.f249d.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f254i ? this.f251f != null || this.f252g != null : this.f253h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f253h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f253h);
        }
        this.f253h = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f254i && (drawable2 = this.f253h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f254i ? !(this.f251f != null || this.f252g != null) : this.f253h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f252g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f252g);
        }
        this.f252g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f255j && (drawable2 = this.f252g) != null) {
                drawable2.setBounds(this.f248c.getLeft(), this.f248c.getTop(), this.f248c.getRight(), this.f248c.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f254i ? this.f251f != null || this.f252g != null : this.f253h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        View view = this.f248c;
        if (view != null) {
            removeView(view);
        }
        this.f248c = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f247b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f251f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f252g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f253h;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f251f && !this.f254i) || (drawable == this.f252g && this.f255j) || ((drawable == this.f253h && this.f254i) || super.verifyDrawable(drawable));
    }
}