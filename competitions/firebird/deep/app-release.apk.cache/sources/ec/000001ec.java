package f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f1726a;

    /* renamed from: b  reason: collision with root package name */
    public final d f1727b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1728c;

    public a(int i2, d dVar, int i3) {
        this.f1726a = i2;
        this.f1727b = dVar;
        this.f1728c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1726a);
        d dVar = this.f1727b;
        dVar.f1731a.performAction(this.f1728c, bundle);
    }
}