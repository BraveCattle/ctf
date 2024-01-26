package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import o.h;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f542b;

    /* renamed from: c  reason: collision with root package name */
    public int f543c;

    /* renamed from: d  reason: collision with root package name */
    public Context f544d;

    /* renamed from: e  reason: collision with root package name */
    public h f545e;

    /* renamed from: f  reason: collision with root package name */
    public String f546f;

    /* renamed from: g  reason: collision with root package name */
    public HashMap<Integer, String> f547g;

    public b(Context context) {
        super(context);
        this.f542b = new int[32];
        this.f547g = new HashMap<>();
        this.f544d = context;
        e(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f544d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i2 = 0;
        if (isInEditMode() && constraintLayout2 != null) {
            Object c2 = constraintLayout2.c(0, trim);
            if (c2 instanceof Integer) {
                i2 = ((Integer) c2).intValue();
            }
        }
        if (i2 == 0 && constraintLayout2 != null) {
            i2 = d(constraintLayout2, trim);
        }
        if (i2 == 0) {
            try {
                i2 = q.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i2 == 0) {
            i2 = this.f544d.getResources().getIdentifier(trim, "id", this.f544d.getPackageName());
        }
        if (i2 != 0) {
            this.f547g.put(Integer.valueOf(i2), trim);
            b(i2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i2) {
        if (i2 == getId()) {
            return;
        }
        int i3 = this.f543c + 1;
        int[] iArr = this.f542b;
        if (i3 > iArr.length) {
            this.f542b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f542b;
        int i4 = this.f543c;
        iArr2[i4] = i2;
        this.f543c = i4 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f543c; i2++) {
            View d2 = constraintLayout.d(this.f542b[i2]);
            if (d2 != null) {
                d2.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d2.setTranslationZ(d2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f544d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.e.f2542b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f546f = string;
                    setIds(string);
                }
            }
        }
    }

    public void f(o.e eVar, boolean z2) {
    }

    public void g() {
        if (this.f545e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f516l0 = (o.e) this.f545e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f542b, this.f543c);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f546f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f546f = str;
        if (str == null) {
            return;
        }
        int i2 = 0;
        this.f543c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i2);
            if (indexOf == -1) {
                a(str.substring(i2));
                return;
            } else {
                a(str.substring(i2, indexOf));
                i2 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f546f = null;
        this.f543c = 0;
        for (int i2 : iArr) {
            b(i2);
        }
    }
}