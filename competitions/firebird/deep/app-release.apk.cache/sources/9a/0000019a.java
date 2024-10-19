package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import c.m;
import h.e;
import y0.a;

@Keep
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends m {
    @Override // c.m
    public e createButton(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }
}