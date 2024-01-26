package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f315b;

    /* renamed from: c  reason: collision with root package name */
    public int f316c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f316c = -1;
        int[] iArr = b.b.f1229k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        m.e(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f315b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z2) {
        setOrientation(z2 ? 1 : 0);
        setGravity(z2 ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f315b) {
            if (size > this.f316c && b()) {
                setStacked(false);
            }
            this.f316c = size;
        }
        if (b() || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f315b && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int a2 = a(0);
        if (a2 >= 0) {
            View childAt = getChildAt(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a3 = a(a2 + 1);
                i5 = a3 >= 0 ? getChildAt(a3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (getMinimumHeight() != i5) {
            setMinimumHeight(i5);
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f315b != z2) {
            this.f315b = z2;
            if (!z2 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}