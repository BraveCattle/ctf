package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class a implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f64b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f65c;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f65c = bVar;
        this.f64b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f65c.f60h.onClick(this.f64b.f25b, i2);
        if (this.f65c.f61i) {
            return;
        }
        this.f64b.f25b.dismiss();
    }
}