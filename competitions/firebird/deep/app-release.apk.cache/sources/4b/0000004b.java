package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import c.g;
import c.i;
import h.b0;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public TypedValue f317b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f318c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f319d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f320e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f321f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f322g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f323h;

    /* renamed from: i  reason: collision with root package name */
    public a f324i;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f323h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f321f == null) {
            this.f321f = new TypedValue();
        }
        return this.f321f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f322g == null) {
            this.f322g = new TypedValue();
        }
        return this.f322g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f319d == null) {
            this.f319d = new TypedValue();
        }
        return this.f319d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f320e == null) {
            this.f320e = new TypedValue();
        }
        return this.f320e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f317b == null) {
            this.f317b = new TypedValue();
        }
        return this.f317b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f318c == null) {
            this.f318c = new TypedValue();
        }
        return this.f318c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f324i;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f324i;
        if (aVar != null) {
            g gVar = ((i) aVar).f1351a;
            b0 b0Var = gVar.f1304l;
            if (b0Var != null) {
                b0Var.j();
            }
            if (gVar.f1309q != null) {
                gVar.f1298f.getDecorView().removeCallbacks(gVar.f1310r);
                if (gVar.f1309q.isShowing()) {
                    try {
                        gVar.f1309q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                gVar.f1309q = null;
            }
            gVar.I();
            e eVar = gVar.N(0).f1340h;
            if (eVar != null) {
                eVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f324i = aVar;
    }
}