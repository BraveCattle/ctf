package h0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f2100j;

    /* renamed from: k  reason: collision with root package name */
    public int f2101k;

    /* renamed from: l  reason: collision with root package name */
    public LayoutInflater f2102l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, null, z2);
        this.f2101k = i2;
        this.f2100j = i2;
        this.f2102l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}