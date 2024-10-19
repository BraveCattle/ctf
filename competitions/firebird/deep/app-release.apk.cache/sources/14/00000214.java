package g1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import e0.m;
import e0.o;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public final AccessibilityManager f1812b;

    /* renamed from: c  reason: collision with root package name */
    public final f0.b f1813c;

    /* renamed from: d  reason: collision with root package name */
    public c f1814d;

    /* renamed from: e  reason: collision with root package name */
    public b f1815e;

    /* loaded from: classes.dex */
    public class a implements f0.b {
        public a() {
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2705g);
        if (obtainStyledAttributes.hasValue(1)) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            setElevation(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        }
        obtainStyledAttributes.recycle();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        this.f1812b = accessibilityManager;
        a aVar = new a();
        this.f1813c = aVar;
        accessibilityManager.addTouchExplorationStateChangeListener(new f0.c(aVar));
        setClickableOrFocusableBasedOnAccessibility(accessibilityManager.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickableOrFocusableBasedOnAccessibility(boolean z2) {
        setClickable(!z2);
        setFocusable(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f1815e;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f1815e;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
        AccessibilityManager accessibilityManager = this.f1812b;
        f0.b bVar2 = this.f1813c;
        if (bVar2 == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(new f0.c(bVar2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        c cVar = this.f1814d;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f1815e = bVar;
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f1814d = cVar;
    }
}