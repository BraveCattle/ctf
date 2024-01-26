package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements e.b, j, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f81c = {16842964, 16843049};

    /* renamed from: b  reason: collision with root package name */
    public e f82b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f81c, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : d.a.a(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : d.a.a(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean b(g gVar) {
        return this.f82b.r(gVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar) {
        this.f82b = eVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        b((g) getAdapter().getItem(i2));
    }
}