package k0;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f2160a;

    public a(Fragment fragment) {
        this.f2160a = fragment;
    }

    @Override // k0.c
    public View e(int i2) {
        Objects.requireNonNull(this.f2160a);
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // k0.c
    public boolean f() {
        Objects.requireNonNull(this.f2160a);
        return false;
    }
}