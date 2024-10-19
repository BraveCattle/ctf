package c1;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.c;

/* loaded from: classes.dex */
public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f1418b;

    public a(c cVar) {
        this.f1418b = cVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        c cVar = this.f1418b;
        float rotation = cVar.f1534o.getRotation();
        if (cVar.f1527h != rotation) {
            cVar.f1527h = rotation;
            return true;
        }
        return true;
    }
}