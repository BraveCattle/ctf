package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c.f;
import e0.m;
import h.a1;

/* loaded from: classes.dex */
public class b extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f438b;

    /* renamed from: c  reason: collision with root package name */
    public int f439c;

    /* renamed from: d  reason: collision with root package name */
    public int f440d;

    /* renamed from: e  reason: collision with root package name */
    public int f441e;

    /* renamed from: f  reason: collision with root package name */
    public int f442f;

    /* renamed from: g  reason: collision with root package name */
    public int f443g;

    /* renamed from: h  reason: collision with root package name */
    public float f444h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f445i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f446j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f447k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f448l;

    /* renamed from: m  reason: collision with root package name */
    public int f449m;

    /* renamed from: n  reason: collision with root package name */
    public int f450n;

    /* renamed from: o  reason: collision with root package name */
    public int f451o;

    /* renamed from: p  reason: collision with root package name */
    public int f452p;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f453a;

        /* renamed from: b  reason: collision with root package name */
        public int f454b;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f454b = -1;
            this.f453a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f454b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1232n);
            this.f453a = obtainStyledAttributes.getFloat(3, 0.0f);
            this.f454b = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f454b = -1;
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.f438b = true;
        this.f439c = -1;
        this.f440d = 0;
        this.f442f = 8388659;
        int[] iArr = b.b.f1231m;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        m.e(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        int i3 = obtainStyledAttributes.getInt(1, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(0, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(2, true);
        if (!z2) {
            setBaselineAligned(z2);
        }
        this.f444h = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f439c = obtainStyledAttributes.getInt(3, -1);
        this.f445i = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : d.a.a(context, resourceId));
        this.f451o = obtainStyledAttributes.getInt(8, 0);
        this.f452p = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.f448l.setBounds(getPaddingLeft() + this.f452p, i2, (getWidth() - getPaddingRight()) - this.f452p, this.f450n + i2);
        this.f448l.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.f448l.setBounds(i2, getPaddingTop() + this.f452p, this.f449m + i2, (getHeight() - getPaddingBottom()) - this.f452p);
        this.f448l.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f439c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f439c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f439c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i4 = this.f440d;
            if (this.f441e == 1 && (i2 = this.f442f & 112) != 48) {
                if (i2 == 16) {
                    i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f443g) / 2;
                } else if (i2 == 80) {
                    i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f443g;
                }
            }
            return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f439c;
    }

    public Drawable getDividerDrawable() {
        return this.f448l;
    }

    public int getDividerPadding() {
        return this.f452p;
    }

    public int getDividerWidth() {
        return this.f449m;
    }

    public int getGravity() {
        return this.f442f;
    }

    public int getOrientation() {
        return this.f441e;
    }

    public int getShowDividers() {
        return this.f451o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f444h;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.f441e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public boolean k(int i2) {
        if (i2 == 0) {
            return (this.f451o & 1) != 0;
        } else if (i2 == getChildCount()) {
            return (this.f451o & 4) != 0;
        } else if ((this.f451o & 2) != 0) {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i2;
        if (this.f448l == null) {
            return;
        }
        int i3 = 0;
        if (this.f441e == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i3 < virtualChildCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && k(i3)) {
                    f(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f450n);
                }
                i3++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f450n : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean b2 = a1.b(this);
        while (i3 < virtualChildCount2) {
            View childAt3 = getChildAt(i3);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i3)) {
                a aVar = (a) childAt3.getLayoutParams();
                g(canvas, b2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f449m);
            }
            i3++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (b2) {
                    left = childAt4.getLeft();
                    i2 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    right = (left - i2) - this.f449m;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                }
            } else if (b2) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i2 = getPaddingRight();
                right = (left - i2) - this.f449m;
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b2, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0731, code lost:
        if (r7 < 0) goto L404;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f438b = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f439c = i2;
            return;
        }
        StringBuilder a2 = f.a("base aligned child index out of range (0, ");
        a2.append(getChildCount());
        a2.append(")");
        throw new IllegalArgumentException(a2.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f448l) {
            return;
        }
        this.f448l = drawable;
        if (drawable != null) {
            this.f449m = drawable.getIntrinsicWidth();
            this.f450n = drawable.getIntrinsicHeight();
        } else {
            this.f449m = 0;
            this.f450n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f452p = i2;
    }

    public void setGravity(int i2) {
        if (this.f442f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f442f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f442f;
        if ((8388615 & i4) != i3) {
            this.f442f = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f445i = z2;
    }

    public void setOrientation(int i2) {
        if (this.f441e != i2) {
            this.f441e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f451o) {
            requestLayout();
        }
        this.f451o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f442f;
        if ((i4 & 112) != i3) {
            this.f442f = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f444h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}