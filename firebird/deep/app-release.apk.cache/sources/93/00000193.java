package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import com.x64m.xsfmnative.R;
import d1.a;
import e0.m;
import h.k;

/* loaded from: classes.dex */
public class CheckableImageButton extends k implements Checkable {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f1544e = {16842912};

    /* renamed from: d  reason: collision with root package name */
    public boolean f1545d;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        m.f(this, new a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1545d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f1545d) {
            int[] iArr = f1544e;
            return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i2 + iArr.length), iArr);
        }
        return super.onCreateDrawableState(i2);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.f1545d != z2) {
            this.f1545d = z2;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1545d);
    }
}