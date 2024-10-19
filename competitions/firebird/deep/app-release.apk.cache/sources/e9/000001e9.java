package f;

import android.view.View;
import android.view.animation.Interpolator;
import e0.o;
import e0.p;
import e0.q;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f1718c;

    /* renamed from: d  reason: collision with root package name */
    public p f1719d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1720e;

    /* renamed from: b  reason: collision with root package name */
    public long f1717b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final q f1721f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<o> f1716a = new ArrayList<>();

    /* loaded from: classes.dex */
    public class a extends q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1722a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1723b = 0;

        public a() {
        }

        @Override // e0.p
        public void a(View view) {
            int i2 = this.f1723b + 1;
            this.f1723b = i2;
            if (i2 == h.this.f1716a.size()) {
                p pVar = h.this.f1719d;
                if (pVar != null) {
                    pVar.a(null);
                }
                this.f1723b = 0;
                this.f1722a = false;
                h.this.f1720e = false;
            }
        }

        @Override // e0.q, e0.p
        public void b(View view) {
            if (this.f1722a) {
                return;
            }
            this.f1722a = true;
            p pVar = h.this.f1719d;
            if (pVar != null) {
                pVar.b(null);
            }
        }
    }

    public void a() {
        if (this.f1720e) {
            Iterator<o> it = this.f1716a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f1720e = false;
        }
    }

    public void b() {
        View view;
        if (this.f1720e) {
            return;
        }
        Iterator<o> it = this.f1716a.iterator();
        while (it.hasNext()) {
            o next = it.next();
            long j2 = this.f1717b;
            if (j2 >= 0) {
                next.c(j2);
            }
            Interpolator interpolator = this.f1718c;
            if (interpolator != null && (view = next.f1642a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1719d != null) {
                next.d(this.f1721f);
            }
            View view2 = next.f1642a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1720e = true;
    }
}