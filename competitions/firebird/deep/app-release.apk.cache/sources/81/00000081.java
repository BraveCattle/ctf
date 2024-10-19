package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: h  reason: collision with root package name */
    public int f539h;

    /* renamed from: i  reason: collision with root package name */
    public int f540i;

    /* renamed from: j  reason: collision with root package name */
    public o.a f541j;

    public a(Context context) {
        super(context);
        setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.b
    public void e(AttributeSet attributeSet) {
        o.a aVar = new o.a();
        this.f541j = aVar;
        this.f545e = aVar;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
        if (r0 == 6) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
        if (r0 == 6) goto L11;
     */
    @Override // androidx.constraintlayout.widget.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(o.e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f539h
            r3.f540i = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L16
        Lb:
            if (r0 != r1) goto L18
            goto L10
        Le:
            if (r0 != r2) goto L14
        L10:
            r5 = 0
        L11:
            r3.f540i = r5
            goto L18
        L14:
            if (r0 != r1) goto L18
        L16:
            r5 = 1
            goto L11
        L18:
            boolean r5 = r4 instanceof o.a
            if (r5 == 0) goto L22
            o.a r4 = (o.a) r4
            int r5 = r3.f540i
            r4.f2370g0 = r5
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.f(o.e, boolean):void");
    }

    public int getMargin() {
        return this.f541j.f2372i0;
    }

    public int getType() {
        return this.f539h;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f541j.f2371h0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f541j.f2372i0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f541j.f2372i0 = i2;
    }

    public void setType(int i2) {
        this.f539h = i2;
    }
}