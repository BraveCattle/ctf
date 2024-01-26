package f0;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final b f1729a;

    public c(b bVar) {
        this.f1729a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f1729a.equals(((c) obj).f1729a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1729a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z2) {
        g1.d.this.setClickableOrFocusableBasedOnAccessibility(z2);
    }
}