package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0009b f991a;

    /* renamed from: b  reason: collision with root package name */
    public final a f992b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f993c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f994a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f995b;

        public void a(int i2) {
            if (i2 < 64) {
                this.f994a &= ~(1 << i2);
                return;
            }
            a aVar = this.f995b;
            if (aVar != null) {
                aVar.a(i2 - 64);
            }
        }

        public int b(int i2) {
            long j2;
            a aVar = this.f995b;
            if (aVar == null) {
                if (i2 >= 64) {
                    j2 = this.f994a;
                    return Long.bitCount(j2);
                }
            } else if (i2 >= 64) {
                return Long.bitCount(this.f994a) + aVar.b(i2 - 64);
            }
            j2 = this.f994a & ((1 << i2) - 1);
            return Long.bitCount(j2);
        }

        public final void c() {
            if (this.f995b == null) {
                this.f995b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.f994a & (1 << i2)) != 0;
            }
            c();
            return this.f995b.d(i2 - 64);
        }

        public boolean e(int i2) {
            if (i2 >= 64) {
                c();
                return this.f995b.e(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f994a;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f994a = j4;
            long j5 = j2 - 1;
            this.f994a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.f995b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    g(63);
                }
                this.f995b.e(0);
            }
            return z2;
        }

        public void f() {
            this.f994a = 0L;
            a aVar = this.f995b;
            if (aVar != null) {
                aVar.f();
            }
        }

        public void g(int i2) {
            if (i2 < 64) {
                this.f994a |= 1 << i2;
                return;
            }
            c();
            this.f995b.g(i2 - 64);
        }

        public String toString() {
            if (this.f995b == null) {
                return Long.toBinaryString(this.f994a);
            }
            return this.f995b.toString() + "xx" + Long.toBinaryString(this.f994a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0009b {
    }

    public b(InterfaceC0009b interfaceC0009b) {
        this.f991a = interfaceC0009b;
    }

    public void a(int i2) {
        k.v u2;
        int c2 = c(i2);
        this.f992b.e(c2);
        l lVar = (l) this.f991a;
        View childAt = lVar.f1192a.getChildAt(c2);
        if (childAt != null && (u2 = k.u(childAt)) != null) {
            if (u2.k() && !u2.p()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(u2);
                throw new IllegalArgumentException(p0.a.a(lVar.f1192a, sb));
            }
            u2.b(256);
        }
        lVar.f1192a.detachViewFromParent(c2);
    }

    public int b() {
        return ((l) this.f991a).b() - this.f993c.size();
    }

    public final int c(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int b2 = ((l) this.f991a).b();
        int i3 = i2;
        while (i3 < b2) {
            int b3 = i2 - (i3 - this.f992b.b(i3));
            if (b3 == 0) {
                while (this.f992b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b3;
        }
        return -1;
    }

    public View d(int i2) {
        return ((l) this.f991a).f1192a.getChildAt(i2);
    }

    public int e() {
        return ((l) this.f991a).b();
    }

    public int f(View view) {
        int indexOfChild = ((l) this.f991a).f1192a.indexOfChild(view);
        if (indexOfChild == -1 || this.f992b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f992b.b(indexOfChild);
    }

    public boolean g(View view) {
        return this.f993c.contains(null);
    }

    public final boolean h(View view) {
        if (this.f993c.remove(view)) {
            l lVar = (l) this.f991a;
            Objects.requireNonNull(lVar);
            k.v u2 = k.u(view);
            if (u2 != null) {
                lVar.f1192a.H(u2, u2.f1189l);
                u2.f1189l = 0;
                return true;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f992b.toString() + ", hidden list:" + this.f993c.size();
    }
}