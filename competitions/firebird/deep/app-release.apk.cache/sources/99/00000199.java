package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.WeakHashMap;
import u0.a;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public TextView f1552b;

    /* renamed from: c  reason: collision with root package name */
    public Button f1553c;

    /* renamed from: d  reason: collision with root package name */
    public int f1554d;

    /* renamed from: e  reason: collision with root package name */
    public int f1555e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f2705g);
        this.f1554d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1555e = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f1552b.getPaddingTop() == i3 && this.f1552b.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f1552b;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i3, textView.getPaddingEnd(), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f1553c;
    }

    public TextView getMessageView() {
        return this.f1552b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1552b = (TextView) findViewById(R.id.snackbar_text);
        this.f1553c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (a(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (a(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f1554d
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f1554d
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131099773(0x7f06007d, float:1.7811909E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131099772(0x7f06007c, float:1.7811907E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f1552b
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3e
            r2 = r4
            goto L3f
        L3e:
            r2 = r3
        L3f:
            if (r2 == 0) goto L58
            int r5 = r7.f1555e
            if (r5 <= 0) goto L58
            android.widget.Button r5 = r7.f1553c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f1555e
            if (r5 <= r6) goto L58
            int r1 = r0 - r1
            boolean r0 = r7.a(r4, r0, r1)
            if (r0 == 0) goto L63
            goto L62
        L58:
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L63
        L62:
            r3 = r4
        L63:
            if (r3 == 0) goto L68
            super.onMeasure(r8, r9)
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}