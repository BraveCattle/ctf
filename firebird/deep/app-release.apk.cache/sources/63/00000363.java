package w0;

import android.view.View;
import e0.m;
import e0.o;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f2757a;

    /* renamed from: b  reason: collision with root package name */
    public int f2758b;

    /* renamed from: c  reason: collision with root package name */
    public int f2759c;

    /* renamed from: d  reason: collision with root package name */
    public int f2760d;

    /* renamed from: e  reason: collision with root package name */
    public int f2761e;

    public d(View view) {
        this.f2757a = view;
    }

    public final void a() {
        View view = this.f2757a;
        int top = this.f2760d - (view.getTop() - this.f2758b);
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        view.offsetTopAndBottom(top);
        View view2 = this.f2757a;
        view2.offsetLeftAndRight(this.f2761e - (view2.getLeft() - this.f2759c));
    }
}