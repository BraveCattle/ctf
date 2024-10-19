package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public final b f1198a;

    /* renamed from: b  reason: collision with root package name */
    public a f1199b = new a();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1200a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1201b;

        /* renamed from: c  reason: collision with root package name */
        public int f1202c;

        /* renamed from: d  reason: collision with root package name */
        public int f1203d;

        /* renamed from: e  reason: collision with root package name */
        public int f1204e;

        public boolean a() {
            int i2 = this.f1200a;
            if ((i2 & 7) == 0 || (i2 & (b(this.f1203d, this.f1201b) << 0)) != 0) {
                int i3 = this.f1200a;
                if ((i3 & 112) == 0 || (i3 & (b(this.f1203d, this.f1202c) << 4)) != 0) {
                    int i4 = this.f1200a;
                    if ((i4 & 1792) == 0 || (i4 & (b(this.f1204e, this.f1201b) << 8)) != 0) {
                        int i5 = this.f1200a;
                        return (i5 & 28672) == 0 || (i5 & (b(this.f1204e, this.f1202c) << 12)) != 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public int b(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View e(int i2);
    }

    public q(b bVar) {
        this.f1198a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int b2 = this.f1198a.b();
        int a2 = this.f1198a.a();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View e2 = this.f1198a.e(i2);
            int d2 = this.f1198a.d(e2);
            int c2 = this.f1198a.c(e2);
            a aVar = this.f1199b;
            aVar.f1201b = b2;
            aVar.f1202c = a2;
            aVar.f1203d = d2;
            aVar.f1204e = c2;
            if (i4 != 0) {
                aVar.f1200a = 0;
                aVar.f1200a = i4 | 0;
                if (aVar.a()) {
                    return e2;
                }
            }
            if (i5 != 0) {
                a aVar2 = this.f1199b;
                aVar2.f1200a = 0;
                aVar2.f1200a = i5 | 0;
                if (aVar2.a()) {
                    view = e2;
                }
            }
            i2 += i6;
        }
        return view;
    }
}