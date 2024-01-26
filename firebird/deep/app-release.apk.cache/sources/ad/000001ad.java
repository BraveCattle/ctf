package d1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public class a extends e0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f1593d;

    public a(CheckableImageButton checkableImageButton) {
        this.f1593d = checkableImageButton;
    }

    @Override // e0.a
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1614a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f1593d.isChecked());
    }

    @Override // e0.a
    public void b(View view, f0.d dVar) {
        this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
        dVar.f1731a.setCheckable(true);
        dVar.f1731a.setChecked(this.f1593d.isChecked());
    }
}