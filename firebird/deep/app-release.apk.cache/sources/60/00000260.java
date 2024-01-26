package h;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class v0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final g.a f2029b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.d f2030c;

    public v0(androidx.appcompat.widget.d dVar) {
        this.f2030c = dVar;
        this.f2029b = new g.a(dVar.f459a.getContext(), 0, 16908332, 0, dVar.f467i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        androidx.appcompat.widget.d dVar = this.f2030c;
        Window.Callback callback = dVar.f470l;
        if (callback == null || !dVar.f471m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2029b);
    }
}