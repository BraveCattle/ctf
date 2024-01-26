package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import v0.g;
import v0.i;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g  reason: collision with root package name */
    public Map<View, Integer> f1576g;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public boolean t(View view, View view2, boolean z2, boolean z3) {
        int intValue;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                this.f1576g = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                boolean z4 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f665a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z4) {
                    Map<View, Integer> map = this.f1576g;
                    if (z2) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    } else {
                        intValue = (map != null && map.containsKey(childAt)) ? this.f1576g.get(childAt).intValue() : 4;
                    }
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    childAt.setImportantForAccessibility(intValue);
                }
            }
            if (!z2) {
                this.f1576g = null;
            }
        }
        super.t(view, view2, z2, z3);
        return true;
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public FabTransformationBehavior.b z(Context context, boolean z2) {
        int i2 = z2 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f1570a = g.a(context, i2);
        bVar.f1571b = new i(17, 0.0f, 0.0f);
        return bVar;
    }
}