package h;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public class h0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i0 f1884b;

    public h0(i0 i0Var) {
        this.f1884b = i0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        e0 e0Var;
        if (i2 == -1 || (e0Var = this.f1884b.f1896d) == null) {
            return;
        }
        e0Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}