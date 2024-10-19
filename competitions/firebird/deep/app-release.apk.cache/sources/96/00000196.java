package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public class NavigationMenuView extends k implements j {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(e eVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}