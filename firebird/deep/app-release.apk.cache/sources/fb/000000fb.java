package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public final k.j f1068a;

    /* renamed from: b  reason: collision with root package name */
    public int f1069b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1070c = new Rect();

    public j(k.j jVar, h hVar) {
        this.f1068a = jVar;
    }

    public static j a(k.j jVar, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new i(jVar);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new h(jVar);
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d();

    public abstract int e();

    public abstract int f();
}