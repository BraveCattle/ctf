package r0;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f2660a;

    public x(View view) {
        this.f2660a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).f2660a.equals(this.f2660a);
    }

    public int hashCode() {
        return this.f2660a.hashCode();
    }
}