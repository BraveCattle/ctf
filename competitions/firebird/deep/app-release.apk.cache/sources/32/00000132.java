package b0;

import android.content.Context;
import android.graphics.Typeface;
import b0.e;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b implements Callable<e.d> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f1250a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f1251b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1252c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f1253d;

    public b(Context context, a aVar, int i2, String str) {
        this.f1250a = context;
        this.f1251b = aVar;
        this.f1252c = i2;
        this.f1253d = str;
    }

    @Override // java.util.concurrent.Callable
    public e.d call() {
        e.d b2 = e.b(this.f1250a, this.f1251b, this.f1252c);
        Typeface typeface = b2.f1269a;
        if (typeface != null) {
            e.f1257a.b(this.f1253d, typeface);
        }
        return b2;
    }
}