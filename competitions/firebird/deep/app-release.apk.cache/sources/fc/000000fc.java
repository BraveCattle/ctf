package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.r;
import f0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class k extends ViewGroup implements e0.e {

    /* renamed from: s0  reason: collision with root package name */
    public static final int[] f1071s0 = {16843830};

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f1072t0 = {16842987};

    /* renamed from: u0  reason: collision with root package name */
    public static final Class<?>[] f1073u0;

    /* renamed from: v0  reason: collision with root package name */
    public static final Interpolator f1074v0;
    public int A;
    public int B;
    public f C;
    public EdgeEffect D;
    public EdgeEffect E;
    public EdgeEffect F;
    public EdgeEffect G;
    public g H;
    public int I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final int Q;
    public final int R;
    public float S;
    public float T;
    public boolean U;
    public final u V;
    public androidx.recyclerview.widget.e W;

    /* renamed from: a0  reason: collision with root package name */
    public e.b f1075a0;

    /* renamed from: b  reason: collision with root package name */
    public final p f1076b;

    /* renamed from: b0  reason: collision with root package name */
    public final s f1077b0;

    /* renamed from: c  reason: collision with root package name */
    public r f1078c;

    /* renamed from: c0  reason: collision with root package name */
    public n f1079c0;

    /* renamed from: d  reason: collision with root package name */
    public androidx.recyclerview.widget.a f1080d;

    /* renamed from: d0  reason: collision with root package name */
    public List<n> f1081d0;

    /* renamed from: e  reason: collision with root package name */
    public androidx.recyclerview.widget.b f1082e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f1083e0;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.recyclerview.widget.r f1084f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1085f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1086g;

    /* renamed from: g0  reason: collision with root package name */
    public g.b f1087g0;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f1088h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1089h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1090i;

    /* renamed from: i0  reason: collision with root package name */
    public androidx.recyclerview.widget.n f1091i0;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f1092j;

    /* renamed from: j0  reason: collision with root package name */
    public e f1093j0;

    /* renamed from: k  reason: collision with root package name */
    public j f1094k;

    /* renamed from: k0  reason: collision with root package name */
    public final int[] f1095k0;

    /* renamed from: l  reason: collision with root package name */
    public q f1096l;

    /* renamed from: l0  reason: collision with root package name */
    public e0.g f1097l0;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<i> f1098m;

    /* renamed from: m0  reason: collision with root package name */
    public final int[] f1099m0;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<m> f1100n;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f1101n0;

    /* renamed from: o  reason: collision with root package name */
    public m f1102o;

    /* renamed from: o0  reason: collision with root package name */
    public final int[] f1103o0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1104p;

    /* renamed from: p0  reason: collision with root package name */
    public final List<v> f1105p0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1106q;

    /* renamed from: q0  reason: collision with root package name */
    public Runnable f1107q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1108r;

    /* renamed from: r0  reason: collision with root package name */
    public final r.b f1109r0;

    /* renamed from: s  reason: collision with root package name */
    public int f1110s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1111t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1112u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1113v;

    /* renamed from: w  reason: collision with root package name */
    public int f1114w;

    /* renamed from: x  reason: collision with root package name */
    public final AccessibilityManager f1115x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1116y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1117z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = k.this.H;
            if (gVar != null) {
                androidx.recyclerview.widget.c cVar = (androidx.recyclerview.widget.c) gVar;
                boolean z2 = !cVar.f996h.isEmpty();
                boolean z3 = !cVar.f998j.isEmpty();
                boolean z4 = !cVar.f999k.isEmpty();
                boolean z5 = !cVar.f997i.isEmpty();
                if (z2 || z3 || z5 || z4) {
                    Iterator<v> it = cVar.f996h.iterator();
                    if (it.hasNext()) {
                        Objects.requireNonNull(it.next());
                        throw null;
                    }
                    cVar.f996h.clear();
                    if (z3) {
                        ArrayList<c.b> arrayList = new ArrayList<>();
                        arrayList.addAll(cVar.f998j);
                        cVar.f1001m.add(arrayList);
                        cVar.f998j.clear();
                        if (!z2) {
                            Iterator<c.b> it2 = arrayList.iterator();
                            if (it2.hasNext()) {
                                v vVar = it2.next().f1013a;
                                Objects.requireNonNull(cVar);
                                Objects.requireNonNull(vVar);
                                throw null;
                            }
                            arrayList.clear();
                            cVar.f1001m.remove(arrayList);
                        } else {
                            Objects.requireNonNull(arrayList.get(0).f1013a);
                            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                            throw null;
                        }
                    }
                    if (z4) {
                        ArrayList<c.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(cVar.f999k);
                        cVar.f1002n.add(arrayList2);
                        cVar.f999k.clear();
                        if (!z2) {
                            Iterator<c.a> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Objects.requireNonNull(cVar);
                                v vVar2 = it3.next().f1007a;
                            }
                            arrayList2.clear();
                            cVar.f1002n.remove(arrayList2);
                        } else {
                            Objects.requireNonNull(arrayList2.get(0).f1007a);
                            WeakHashMap<View, e0.o> weakHashMap2 = e0.m.f1633a;
                            throw null;
                        }
                    }
                    if (z5) {
                        ArrayList<v> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(cVar.f997i);
                        cVar.f1000l.add(arrayList3);
                        cVar.f997i.clear();
                        if (!z2 && !z3 && !z4) {
                            Iterator<v> it4 = arrayList3.iterator();
                            if (it4.hasNext()) {
                                Objects.requireNonNull(cVar);
                                Objects.requireNonNull(it4.next());
                                throw null;
                            }
                            arrayList3.clear();
                            cVar.f1000l.remove(arrayList3);
                        } else {
                            Math.max(z3 ? cVar.f1124e : 0L, z4 ? cVar.f1125f : 0L);
                            Objects.requireNonNull(arrayList3.get(0));
                            WeakHashMap<View, e0.o> weakHashMap3 = e0.m.f1633a;
                            throw null;
                        }
                    }
                }
            }
            k.this.f1089h0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements r.b {
        public c() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d<VH extends v> {
    }

    /* loaded from: classes.dex */
    public interface e {
        int a(int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static class f {
        public EdgeEffect a(k kVar) {
            return new EdgeEffect(kVar.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public b f1120a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1121b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f1122c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f1123d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f1124e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f1125f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {
        }

        public static int a(v vVar) {
            int i2 = vVar.f1183f & 14;
            if (vVar.h()) {
                return 4;
            }
            if ((i2 & 4) == 0) {
                int i3 = vVar.f1179b;
                k kVar = vVar.f1191n;
                int t2 = kVar == null ? -1 : kVar.t(vVar);
                return (i3 == -1 || t2 == -1 || i3 == t2) ? i2 : i2 | 2048;
            }
            return i2;
        }

        public final void b(v vVar) {
            b bVar = this.f1120a;
            if (bVar != null) {
                h hVar = (h) bVar;
                boolean z2 = true;
                vVar.o(true);
                if (vVar.f1182e != null) {
                    vVar.f1182e = null;
                }
                if ((vVar.f1183f & 16) != 0) {
                    return;
                }
                k kVar = k.this;
                kVar.J();
                androidx.recyclerview.widget.b bVar2 = kVar.f1082e;
                int indexOfChild = ((androidx.recyclerview.widget.l) bVar2.f991a).f1192a.indexOfChild(null);
                if (indexOfChild == -1) {
                    bVar2.h(null);
                } else if (bVar2.f992b.d(indexOfChild)) {
                    bVar2.f992b.e(indexOfChild);
                    bVar2.h(null);
                    ((androidx.recyclerview.widget.l) bVar2.f991a).c(indexOfChild);
                } else {
                    z2 = false;
                }
                if (!z2) {
                    kVar.L(!z2);
                    if (z2 || !vVar.k()) {
                        return;
                    }
                    k.this.removeDetachedView(null, false);
                    return;
                }
                v u2 = k.u(null);
                kVar.f1076b.k(u2);
                kVar.f1076b.h(u2);
                throw null;
            }
        }

        public final void c() {
            int size = this.f1121b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1121b.get(i2).a();
            }
            this.f1121b.clear();
        }

        public abstract void d();

        public abstract boolean e();
    }

    /* loaded from: classes.dex */
    public class h implements g.b {
        public h() {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void d(Canvas canvas, k kVar, s sVar) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public androidx.recyclerview.widget.b f1127a;

        /* renamed from: b  reason: collision with root package name */
        public k f1128b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.recyclerview.widget.q f1129c;

        /* renamed from: d  reason: collision with root package name */
        public androidx.recyclerview.widget.q f1130d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1131e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1132f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1133g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1134h;

        /* renamed from: i  reason: collision with root package name */
        public int f1135i;

        /* renamed from: j  reason: collision with root package name */
        public int f1136j;

        /* renamed from: k  reason: collision with root package name */
        public int f1137k;

        /* renamed from: l  reason: collision with root package name */
        public int f1138l;

        /* loaded from: classes.dex */
        public class a implements q.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.q.b
            public int a() {
                j jVar = j.this;
                return jVar.f1137k - jVar.v();
            }

            @Override // androidx.recyclerview.widget.q.b
            public int b() {
                return j.this.u();
            }

            @Override // androidx.recyclerview.widget.q.b
            public int c(View view) {
                Objects.requireNonNull(j.this);
                return view.getRight() + ((C0011k) view.getLayoutParams()).f1145a.right + ((ViewGroup.MarginLayoutParams) ((C0011k) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.q.b
            public int d(View view) {
                Objects.requireNonNull(j.this);
                return (view.getLeft() - ((C0011k) view.getLayoutParams()).f1145a.left) - ((ViewGroup.MarginLayoutParams) ((C0011k) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.q.b
            public View e(int i2) {
                return j.this.o(i2);
            }
        }

        /* loaded from: classes.dex */
        public class b implements q.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.q.b
            public int a() {
                j jVar = j.this;
                return jVar.f1138l - jVar.t();
            }

            @Override // androidx.recyclerview.widget.q.b
            public int b() {
                return j.this.w();
            }

            @Override // androidx.recyclerview.widget.q.b
            public int c(View view) {
                Objects.requireNonNull(j.this);
                return view.getBottom() + ((C0011k) view.getLayoutParams()).f1145a.bottom + ((ViewGroup.MarginLayoutParams) ((C0011k) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.q.b
            public int d(View view) {
                Objects.requireNonNull(j.this);
                return (view.getTop() - ((C0011k) view.getLayoutParams()).f1145a.top) - ((ViewGroup.MarginLayoutParams) ((C0011k) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.q.b
            public View e(int i2) {
                return j.this.o(i2);
            }
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1141a;

            /* renamed from: b  reason: collision with root package name */
            public int f1142b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1143c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1144d;
        }

        public j() {
            a aVar = new a();
            b bVar = new b();
            this.f1129c = new androidx.recyclerview.widget.q(aVar);
            this.f1130d = new androidx.recyclerview.widget.q(bVar);
            this.f1131e = false;
            this.f1132f = false;
            this.f1133g = true;
            this.f1134h = true;
        }

        public static int e(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        public static c y(Context context, AttributeSet attributeSet, int i2, int i3) {
            c cVar = new c();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0.a.f2462a, i2, i3);
            cVar.f1141a = obtainStyledAttributes.getInt(0, 1);
            cVar.f1142b = obtainStyledAttributes.getInt(9, 1);
            cVar.f1143c = obtainStyledAttributes.getBoolean(8, false);
            cVar.f1144d = obtainStyledAttributes.getBoolean(10, false);
            obtainStyledAttributes.recycle();
            return cVar;
        }

        public boolean A() {
            return false;
        }

        public void B(k kVar, p pVar) {
        }

        public void C(AccessibilityEvent accessibilityEvent) {
            k kVar = this.f1128b;
            p pVar = kVar.f1076b;
            s sVar = kVar.f1077b0;
            if (kVar == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!kVar.canScrollVertically(1) && !this.f1128b.canScrollVertically(-1) && !this.f1128b.canScrollHorizontally(-1) && !this.f1128b.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            Objects.requireNonNull(this.f1128b);
        }

        public void D(View view, f0.d dVar) {
            v u2 = k.u(view);
            if (u2 == null || u2.i() || this.f1127a.g(null)) {
                return;
            }
            k kVar = this.f1128b;
            E(kVar.f1076b, kVar.f1077b0, view, dVar);
        }

        public void E(p pVar, s sVar, View view, f0.d dVar) {
            if (c()) {
                x(view);
                throw null;
            } else if (b()) {
                x(view);
                throw null;
            } else {
                dVar.g(d.b.a(0, 1, 0, 1, false, false));
            }
        }

        public void F(Parcelable parcelable) {
        }

        public Parcelable G() {
            return null;
        }

        public void H(int i2) {
        }

        public void I(p pVar) {
            for (int p2 = p() - 1; p2 >= 0; p2--) {
                if (!k.u(o(p2)).p()) {
                    K(p2, pVar);
                    throw null;
                }
            }
        }

        public void J(p pVar) {
            int size = pVar.f1153a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                Objects.requireNonNull(pVar.f1153a.get(i2));
                v u2 = k.u(null);
                if (!u2.p()) {
                    u2.o(false);
                    if (u2.k()) {
                        this.f1128b.removeDetachedView(null, false);
                    }
                    g gVar = this.f1128b.H;
                    if (gVar != null) {
                        androidx.recyclerview.widget.c cVar = (androidx.recyclerview.widget.c) gVar;
                        throw null;
                    }
                    u2.o(true);
                    v u3 = k.u(null);
                    u3.f1187j = null;
                    u3.f1188k = false;
                    u3.c();
                    pVar.h(u3);
                    throw null;
                }
            }
            pVar.f1153a.clear();
            ArrayList<v> arrayList = pVar.f1154b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1128b.invalidate();
            }
        }

        public void K(int i2, p pVar) {
            View o2 = o(i2);
            L(i2);
            pVar.g(o2);
            throw null;
        }

        public void L(int i2) {
            androidx.recyclerview.widget.b bVar;
            int c2;
            View a2;
            if (o(i2) == null || (a2 = ((androidx.recyclerview.widget.l) bVar.f991a).a((c2 = (bVar = this.f1127a).c(i2)))) == null) {
                return;
            }
            if (bVar.f992b.e(c2)) {
                bVar.h(a2);
            }
            ((androidx.recyclerview.widget.l) bVar.f991a).c(c2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
            if (r14 == false) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean M(androidx.recyclerview.widget.k r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.u()
                int r2 = r9.w()
                int r3 = r9.f1137k
                int r4 = r9.v()
                int r3 = r3 - r4
                int r4 = r9.f1138l
                int r5 = r9.t()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.s()
                r8 = 1
                if (r4 != r8) goto L5f
                if (r3 == 0) goto L5a
                goto L67
            L5a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L67
            L5f:
                if (r7 == 0) goto L62
                goto L66
            L62:
                int r7 = java.lang.Math.min(r5, r3)
            L66:
                r3 = r7
            L67:
                if (r2 == 0) goto L6a
                goto L6e
            L6a:
                int r2 = java.lang.Math.min(r6, r12)
            L6e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto Lb5
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L80
            L7e:
                r14 = r1
                goto Lb3
            L80:
                int r0 = r9.u()
                int r2 = r9.w()
                int r3 = r9.f1137k
                int r4 = r9.v()
                int r3 = r3 - r4
                int r4 = r9.f1138l
                int r5 = r9.t()
                int r4 = r4 - r5
                androidx.recyclerview.widget.k r5 = r9.f1128b
                android.graphics.Rect r5 = r5.f1088h
                r9.r(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto L7e
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto L7e
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto L7e
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto Lb2
                goto L7e
            Lb2:
                r14 = r8
            Lb3:
                if (r14 == 0) goto Lba
            Lb5:
                if (r11 != 0) goto Lbb
                if (r12 == 0) goto Lba
                goto Lbb
            Lba:
                return r1
            Lbb:
                if (r13 == 0) goto Lc1
                r10.scrollBy(r11, r12)
                goto Lc4
            Lc1:
                r10.I(r11, r12)
            Lc4:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.j.M(androidx.recyclerview.widget.k, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public void N() {
            k kVar = this.f1128b;
            if (kVar != null) {
                kVar.requestLayout();
            }
        }

        public void O(k kVar) {
            int height;
            if (kVar == null) {
                this.f1128b = null;
                this.f1127a = null;
                height = 0;
                this.f1137k = 0;
            } else {
                this.f1128b = kVar;
                this.f1127a = kVar.f1082e;
                this.f1137k = kVar.getWidth();
                height = kVar.getHeight();
            }
            this.f1138l = height;
            this.f1135i = 1073741824;
            this.f1136j = 1073741824;
        }

        public void a(String str) {
            k kVar = this.f1128b;
            if (kVar != null) {
                kVar.e(str);
            }
        }

        public boolean b() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean d(C0011k c0011k) {
            return c0011k != null;
        }

        public int f(s sVar) {
            return 0;
        }

        public int g(s sVar) {
            return 0;
        }

        public int h(s sVar) {
            return 0;
        }

        public int i(s sVar) {
            return 0;
        }

        public int j(s sVar) {
            return 0;
        }

        public int k(s sVar) {
            return 0;
        }

        public abstract C0011k l();

        public C0011k m(Context context, AttributeSet attributeSet) {
            return new C0011k(context, attributeSet);
        }

        public C0011k n(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C0011k ? new C0011k((C0011k) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0011k((ViewGroup.MarginLayoutParams) layoutParams) : new C0011k(layoutParams);
        }

        public View o(int i2) {
            androidx.recyclerview.widget.b bVar = this.f1127a;
            if (bVar != null) {
                return ((androidx.recyclerview.widget.l) bVar.f991a).a(bVar.c(i2));
            }
            return null;
        }

        public int p() {
            androidx.recyclerview.widget.b bVar = this.f1127a;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }

        public int q(p pVar, s sVar) {
            k kVar = this.f1128b;
            if (kVar != null) {
                Objects.requireNonNull(kVar);
                return 1;
            }
            return 1;
        }

        public void r(View view, Rect rect) {
            int[] iArr = k.f1071s0;
            C0011k c0011k = (C0011k) view.getLayoutParams();
            Rect rect2 = c0011k.f1145a;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c0011k).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c0011k).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c0011k).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0011k).bottomMargin);
        }

        public int s() {
            k kVar = this.f1128b;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            return kVar.getLayoutDirection();
        }

        public int t() {
            k kVar = this.f1128b;
            if (kVar != null) {
                return kVar.getPaddingBottom();
            }
            return 0;
        }

        public int u() {
            k kVar = this.f1128b;
            if (kVar != null) {
                return kVar.getPaddingLeft();
            }
            return 0;
        }

        public int v() {
            k kVar = this.f1128b;
            if (kVar != null) {
                return kVar.getPaddingRight();
            }
            return 0;
        }

        public int w() {
            k kVar = this.f1128b;
            if (kVar != null) {
                return kVar.getPaddingTop();
            }
            return 0;
        }

        public int x(View view) {
            Objects.requireNonNull((C0011k) view.getLayoutParams());
            throw null;
        }

        public int z(p pVar, s sVar) {
            k kVar = this.f1128b;
            if (kVar != null) {
                Objects.requireNonNull(kVar);
                return 1;
            }
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0011k extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f1145a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1146b;

        public C0011k(int i2, int i3) {
            super(i2, i3);
            this.f1145a = new Rect();
            this.f1146b = true;
        }

        public C0011k(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1145a = new Rect();
            this.f1146b = true;
        }

        public C0011k(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1145a = new Rect();
            this.f1146b = true;
        }

        public C0011k(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1145a = new Rect();
            this.f1146b = true;
        }

        public C0011k(C0011k c0011k) {
            super((ViewGroup.LayoutParams) c0011k);
            this.f1145a = new Rect();
            this.f1146b = true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
    }

    /* loaded from: classes.dex */
    public interface m {
        void a(boolean z2);

        boolean b(k kVar, MotionEvent motionEvent);

        void c(k kVar, MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static abstract class n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f1147a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1148b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<v> f1149a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f1150b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1151c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1152d = 0;
        }

        public final a a(int i2) {
            a aVar = this.f1147a.get(i2);
            if (aVar == null) {
                a aVar2 = new a();
                this.f1147a.put(i2, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class p {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<v> f1153a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<v> f1154b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<v> f1155c;

        /* renamed from: d  reason: collision with root package name */
        public final List<v> f1156d;

        /* renamed from: e  reason: collision with root package name */
        public int f1157e;

        /* renamed from: f  reason: collision with root package name */
        public int f1158f;

        /* renamed from: g  reason: collision with root package name */
        public o f1159g;

        public p() {
            ArrayList<v> arrayList = new ArrayList<>();
            this.f1153a = arrayList;
            this.f1154b = null;
            this.f1155c = new ArrayList<>();
            this.f1156d = Collections.unmodifiableList(arrayList);
            this.f1157e = 2;
            this.f1158f = 2;
        }

        public void a(v vVar, boolean z2) {
            k.g(vVar);
            if (vVar.f(16384)) {
                vVar.n(0, 16384);
                e0.m.f(null, null);
            }
            if (z2) {
                q qVar = k.this.f1096l;
                if (qVar != null) {
                    qVar.a(vVar);
                }
                Objects.requireNonNull(k.this);
                k kVar = k.this;
                if (kVar.f1077b0 != null) {
                    kVar.f1084f.a(vVar);
                }
            }
            vVar.f1191n = null;
            o d2 = d();
            Objects.requireNonNull(d2);
            ArrayList<v> arrayList = d2.a(0).f1149a;
            if (d2.f1147a.get(0).f1150b <= arrayList.size()) {
                return;
            }
            vVar.m();
            arrayList.add(vVar);
        }

        public void b() {
            this.f1153a.clear();
            e();
        }

        public int c(int i2) {
            if (i2 >= 0 && i2 < k.this.f1077b0.a()) {
                k kVar = k.this;
                return !kVar.f1077b0.f1166e ? i2 : kVar.f1080d.a(i2, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i2);
            sb.append(". State ");
            sb.append("item count is ");
            sb.append(k.this.f1077b0.a());
            throw new IndexOutOfBoundsException(p0.a.a(k.this, sb));
        }

        public o d() {
            if (this.f1159g == null) {
                this.f1159g = new o();
            }
            return this.f1159g;
        }

        public void e() {
            for (int size = this.f1155c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f1155c.clear();
            int[] iArr = k.f1071s0;
            e.b bVar = k.this.f1075a0;
            int[] iArr2 = bVar.f1053c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f1054d = 0;
        }

        public void f(int i2) {
            a(this.f1155c.get(i2), true);
            this.f1155c.remove(i2);
        }

        public void g(View view) {
            v u2 = k.u(view);
            if (u2.k()) {
                k.this.removeDetachedView(view, false);
            }
            if (u2.j()) {
                u2.f1187j.k(u2);
            } else if (u2.q()) {
                u2.c();
            }
            h(u2);
            throw null;
        }

        public void h(v vVar) {
            if (!vVar.j()) {
                throw null;
            }
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.k$v r5 = androidx.recyclerview.widget.k.u(r5)
                r0 = 12
                boolean r0 = r5.f(r0)
                r1 = 0
                if (r0 != 0) goto L55
                boolean r0 = r5.l()
                if (r0 == 0) goto L55
                androidx.recyclerview.widget.k r0 = androidx.recyclerview.widget.k.this
                androidx.recyclerview.widget.k$g r0 = r0.H
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.e()
                androidx.recyclerview.widget.c r0 = (androidx.recyclerview.widget.c) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f1197g
                if (r0 == 0) goto L33
                boolean r0 = r5.h()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = r1
                goto L34
            L33:
                r0 = r2
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r1
                goto L3a
            L39:
                r0 = r2
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r1
                goto L40
            L3f:
                r0 = r2
            L40:
                if (r0 == 0) goto L43
                goto L55
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.k$v> r0 = r4.f1154b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1154b = r0
            L4e:
                r5.f1187j = r4
                r5.f1188k = r2
                java.util.ArrayList<androidx.recyclerview.widget.k$v> r0 = r4.f1154b
                goto L6f
            L55:
                boolean r0 = r5.h()
                if (r0 == 0) goto L69
                boolean r0 = r5.i()
                if (r0 == 0) goto L62
                goto L69
            L62:
                androidx.recyclerview.widget.k r5 = androidx.recyclerview.widget.k.this
                java.util.Objects.requireNonNull(r5)
                r5 = 0
                throw r5
            L69:
                r5.f1187j = r4
                r5.f1188k = r1
                java.util.ArrayList<androidx.recyclerview.widget.k$v> r0 = r4.f1153a
            L6f:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.p.i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:131:0x026e, code lost:
            if (r6.h() == false) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:139:0x029c, code lost:
            if (r2 == false) goto L130;
         */
        /* JADX WARN: Removed duplicated region for block: B:79:0x017a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.k.v j(int r11, boolean r12, long r13) {
            /*
                Method dump skipped, instructions count: 726
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.p.j(int, boolean, long):androidx.recyclerview.widget.k$v");
        }

        public void k(v vVar) {
            (vVar.f1188k ? this.f1154b : this.f1153a).remove(vVar);
            vVar.f1187j = null;
            vVar.f1188k = false;
            vVar.c();
        }

        public void l() {
            j jVar = k.this.f1094k;
            this.f1158f = this.f1157e + 0;
            int size = this.f1155c.size();
            while (true) {
                size--;
                if (size < 0 || this.f1155c.size() <= this.f1158f) {
                    return;
                }
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(v vVar);
    }

    /* loaded from: classes.dex */
    public static class r extends i0.a {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f1161c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<r> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new r(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new r[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public r createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new r(parcel, classLoader);
            }
        }

        public r(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1161c = parcel.readParcelable(classLoader == null ? j.class.getClassLoader() : classLoader);
        }

        public r(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            parcel.writeParcelable(this.f1161c, 0);
        }
    }

    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public int f1162a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1163b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1164c = 1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1165d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1166e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1167f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1168g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1169h = false;

        public int a() {
            if (this.f1166e) {
                return this.f1162a - this.f1163b;
            }
            return 0;
        }

        public String toString() {
            return "State{mTargetPosition=-1, mData=" + ((Object) null) + ", mItemCount=0, mIsMeasuring=false, mPreviousLayoutItemCount=" + this.f1162a + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1163b + ", mStructureChanged=" + this.f1165d + ", mInPreLayout=" + this.f1166e + ", mRunSimpleAnimations=" + this.f1168g + ", mRunPredictiveAnimations=" + this.f1169h + '}';
        }
    }

    /* loaded from: classes.dex */
    public static abstract class t {
    }

    /* loaded from: classes.dex */
    public class u implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public int f1170b;

        /* renamed from: c  reason: collision with root package name */
        public int f1171c;

        /* renamed from: d  reason: collision with root package name */
        public OverScroller f1172d;

        /* renamed from: e  reason: collision with root package name */
        public Interpolator f1173e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1174f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1175g;

        public u() {
            Interpolator interpolator = k.f1074v0;
            this.f1173e = interpolator;
            this.f1174f = false;
            this.f1175g = false;
            this.f1172d = new OverScroller(k.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f1174f) {
                this.f1175g = true;
                return;
            }
            k.this.removeCallbacks(this);
            k kVar = k.this;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            kVar.postOnAnimation(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            if (kVar.f1094k == null) {
                kVar.removeCallbacks(this);
                this.f1172d.abortAnimation();
                return;
            }
            this.f1175g = false;
            this.f1174f = true;
            kVar.i();
            OverScroller overScroller = this.f1172d;
            Objects.requireNonNull(k.this.f1094k);
            if (overScroller.computeScrollOffset()) {
                int[] iArr = k.this.f1101n0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i2 = currX - this.f1170b;
                int i3 = currY - this.f1171c;
                this.f1170b = currX;
                this.f1171c = currY;
                if (k.this.l(i2, i3, iArr, null, 1)) {
                    i2 -= iArr[0];
                    i3 -= iArr[1];
                }
                Objects.requireNonNull(k.this);
                if (!k.this.f1098m.isEmpty()) {
                    k.this.invalidate();
                }
                if (k.this.getOverScrollMode() != 2) {
                    k.this.h(i2, i3);
                }
                k.this.m(0, 0, 0, 0, null, 1);
                if (!k.this.awakenScrollBars()) {
                    k.this.invalidate();
                }
                boolean z2 = (i2 == 0 && i3 == 0) || (i2 != 0 && k.this.f1094k.b() && i2 == 0) || (i3 != 0 && k.this.f1094k.c() && i3 == 0);
                if (overScroller.isFinished() || !(z2 || k.this.v(1))) {
                    k.this.setScrollState(0);
                    int[] iArr2 = k.f1071s0;
                    e.b bVar = k.this.f1075a0;
                    int[] iArr3 = bVar.f1053c;
                    if (iArr3 != null) {
                        Arrays.fill(iArr3, -1);
                    }
                    bVar.f1054d = 0;
                    k.this.a(1);
                } else {
                    a();
                    k kVar2 = k.this;
                    androidx.recyclerview.widget.e eVar = kVar2.W;
                    if (eVar != null) {
                        eVar.a(kVar2, i2, i3);
                    }
                }
            }
            this.f1174f = false;
            if (this.f1175g) {
                a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class v {

        /* renamed from: o  reason: collision with root package name */
        public static final List<Object> f1177o = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public int f1178a;

        /* renamed from: b  reason: collision with root package name */
        public int f1179b;

        /* renamed from: c  reason: collision with root package name */
        public long f1180c;

        /* renamed from: d  reason: collision with root package name */
        public int f1181d;

        /* renamed from: e  reason: collision with root package name */
        public v f1182e;

        /* renamed from: f  reason: collision with root package name */
        public int f1183f;

        /* renamed from: g  reason: collision with root package name */
        public List<Object> f1184g;

        /* renamed from: h  reason: collision with root package name */
        public List<Object> f1185h;

        /* renamed from: i  reason: collision with root package name */
        public int f1186i;

        /* renamed from: j  reason: collision with root package name */
        public p f1187j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1188k;

        /* renamed from: l  reason: collision with root package name */
        public int f1189l;

        /* renamed from: m  reason: collision with root package name */
        public int f1190m;

        /* renamed from: n  reason: collision with root package name */
        public k f1191n;

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1183f) == 0) {
                if (this.f1184g == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1184g = arrayList;
                    this.f1185h = Collections.unmodifiableList(arrayList);
                }
                this.f1184g.add(obj);
            }
        }

        public void b(int i2) {
            this.f1183f = i2 | this.f1183f;
        }

        public void c() {
            this.f1183f &= -33;
        }

        public final int d() {
            int i2 = this.f1181d;
            return i2 == -1 ? this.f1178a : i2;
        }

        public List<Object> e() {
            if ((this.f1183f & 1024) == 0) {
                List<Object> list = this.f1184g;
                return (list == null || list.size() == 0) ? f1177o : this.f1185h;
            }
            return f1177o;
        }

        public boolean f(int i2) {
            return (i2 & this.f1183f) != 0;
        }

        public boolean g() {
            return (this.f1183f & 1) != 0;
        }

        public boolean h() {
            return (this.f1183f & 4) != 0;
        }

        public boolean i() {
            return (this.f1183f & 8) != 0;
        }

        public boolean j() {
            return this.f1187j != null;
        }

        public boolean k() {
            return (this.f1183f & 256) != 0;
        }

        public boolean l() {
            return (this.f1183f & 2) != 0;
        }

        public void m() {
            this.f1183f = 0;
            this.f1178a = -1;
            this.f1179b = -1;
            this.f1180c = -1L;
            this.f1181d = -1;
            this.f1186i = 0;
            this.f1182e = null;
            List<Object> list = this.f1184g;
            if (list != null) {
                list.clear();
            }
            this.f1183f &= -1025;
            this.f1189l = 0;
            this.f1190m = -1;
            int[] iArr = k.f1071s0;
        }

        public void n(int i2, int i3) {
            this.f1183f = (i2 & i3) | (this.f1183f & (~i3));
        }

        public final void o(boolean z2) {
            int i2;
            int i3 = this.f1186i;
            int i4 = z2 ? i3 - 1 : i3 + 1;
            this.f1186i = i4;
            if (i4 < 0) {
                this.f1186i = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i4 == 1) {
                i2 = this.f1183f | 16;
            } else if (!z2 || i4 != 0) {
                return;
            } else {
                i2 = this.f1183f & (-17);
            }
            this.f1183f = i2;
        }

        public boolean p() {
            return (this.f1183f & 128) != 0;
        }

        public boolean q() {
            return (this.f1183f & 32) != 0;
        }

        public String toString() {
            StringBuilder a2 = c.f.a("ViewHolder{");
            a2.append(Integer.toHexString(hashCode()));
            a2.append(" position=");
            a2.append(this.f1178a);
            a2.append(" id=");
            a2.append(this.f1180c);
            a2.append(", oldPos=");
            a2.append(this.f1179b);
            a2.append(", pLpos:");
            a2.append(this.f1181d);
            new StringBuilder(a2.toString());
            if ((this.f1183f & 16) != 0) {
                throw null;
            }
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            throw null;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        f1073u0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f1074v0 = new b();
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:40|(1:42)(13:82|(1:84)|44|45|46|(1:48)(1:66)|49|50|51|52|53|54|55)|43|44|45|46|(0)(0)|49|50|51|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0260, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0262, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0277, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0278, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0298, code lost:
        throw new java.lang.IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022d A[Catch: ClassCastException -> 0x0299, IllegalAccessException -> 0x02b8, InstantiationException -> 0x02d7, InvocationTargetException -> 0x02f4, ClassNotFoundException -> 0x0311, TryCatch #4 {ClassCastException -> 0x0299, ClassNotFoundException -> 0x0311, IllegalAccessException -> 0x02b8, InstantiationException -> 0x02d7, InvocationTargetException -> 0x02f4, blocks: (B:57:0x0227, B:59:0x022d, B:61:0x023a, B:63:0x0245, B:69:0x0269, B:67:0x0262, B:71:0x0278, B:72:0x0298, B:60:0x0236), top: B:96:0x0227 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0236 A[Catch: ClassCastException -> 0x0299, IllegalAccessException -> 0x02b8, InstantiationException -> 0x02d7, InvocationTargetException -> 0x02f4, ClassNotFoundException -> 0x0311, TryCatch #4 {ClassCastException -> 0x0299, ClassNotFoundException -> 0x0311, IllegalAccessException -> 0x02b8, InstantiationException -> 0x02d7, InvocationTargetException -> 0x02f4, blocks: (B:57:0x0227, B:59:0x022d, B:61:0x023a, B:63:0x0245, B:69:0x0269, B:67:0x0262, B:71:0x0278, B:72:0x0298, B:60:0x0236), top: B:96:0x0227 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void g(v vVar) {
        Objects.requireNonNull(vVar);
    }

    private e0.g getScrollingChildHelper() {
        if (this.f1097l0 == null) {
            this.f1097l0 = new e0.g(this);
        }
        return this.f1097l0;
    }

    public static v u(View view) {
        if (view == null) {
            return null;
        }
        Objects.requireNonNull((C0011k) view.getLayoutParams());
        return null;
    }

    public void A() {
        this.A++;
    }

    public void B(boolean z2) {
        boolean z3 = true;
        int i2 = this.A - 1;
        this.A = i2;
        if (i2 < 1) {
            this.A = 0;
            if (z2) {
                int i3 = this.f1114w;
                this.f1114w = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f1115x;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                int size = this.f1105p0.size() - 1;
                if (size < 0) {
                    this.f1105p0.clear();
                } else {
                    Objects.requireNonNull(this.f1105p0.get(size));
                    throw null;
                }
            }
        }
    }

    public final void C(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.N = x2;
            this.L = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.O = y2;
            this.M = y2;
        }
    }

    public void D() {
        g gVar = this.H;
        if (gVar != null) {
            gVar.d();
        }
        j jVar = this.f1094k;
        if (jVar != null) {
            jVar.I(this.f1076b);
            this.f1094k.J(this.f1076b);
        }
        this.f1076b.b();
    }

    public final void E(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1088h.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0011k) {
            C0011k c0011k = (C0011k) layoutParams;
            if (!c0011k.f1146b) {
                Rect rect = c0011k.f1145a;
                Rect rect2 = this.f1088h;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1088h);
            offsetRectIntoDescendantCoords(view, this.f1088h);
        }
        this.f1094k.M(this, view, this.f1088h, !this.f1108r, view2 == null);
    }

    public final void F() {
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        a(0);
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.E;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.E.isFinished();
        }
        EdgeEffect edgeEffect3 = this.F;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.G(int, int, android.view.MotionEvent):boolean");
    }

    public boolean H(v vVar, int i2) {
        if (!y()) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            throw null;
        }
        vVar.f1190m = i2;
        this.f1105p0.add(vVar);
        return false;
    }

    public void I(int i2, int i3) {
        int i4;
        j jVar = this.f1094k;
        if (jVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f1112u) {
        } else {
            int i5 = !jVar.b() ? 0 : i2;
            int i6 = !this.f1094k.c() ? 0 : i3;
            if (i5 == 0 && i6 == 0) {
                return;
            }
            u uVar = this.V;
            Objects.requireNonNull(uVar);
            int abs = Math.abs(i5);
            int abs2 = Math.abs(i6);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
            k kVar = k.this;
            int width = z2 ? kVar.getWidth() : kVar.getHeight();
            int i7 = width / 2;
            float f2 = width;
            float f3 = i7;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            int min = Math.min(i4, 2000);
            Interpolator interpolator = f1074v0;
            if (uVar.f1173e != interpolator) {
                uVar.f1173e = interpolator;
                uVar.f1172d = new OverScroller(k.this.getContext(), interpolator);
            }
            k.this.setScrollState(2);
            uVar.f1171c = 0;
            uVar.f1170b = 0;
            uVar.f1172d.startScroll(0, 0, i5, i6, min);
            uVar.a();
        }
    }

    public void J() {
        int i2 = this.f1110s + 1;
        this.f1110s = i2;
        if (i2 != 1 || this.f1112u) {
            return;
        }
        this.f1111t = false;
    }

    public boolean K(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    public void L(boolean z2) {
        if (this.f1110s < 1) {
            this.f1110s = 1;
        }
        if (!z2 && !this.f1112u) {
            this.f1111t = false;
        }
        int i2 = this.f1110s;
        if (i2 == 1) {
            if (z2 && this.f1111t && !this.f1112u) {
                j jVar = this.f1094k;
            }
            if (!this.f1112u) {
                this.f1111t = false;
            }
        }
        this.f1110s = i2 - 1;
    }

    public void M() {
        setScrollState(0);
        u uVar = this.V;
        k.this.removeCallbacks(uVar);
        uVar.f1172d.abortAnimation();
    }

    @Override // e0.e
    public void a(int i2) {
        getScrollingChildHelper().i(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        j jVar = this.f1094k;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
        }
        super.addFocusables(arrayList, i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0011k) && this.f1094k.d((C0011k) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.b()) {
            return this.f1094k.f(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.b()) {
            return this.f1094k.g(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.b()) {
            return this.f1094k.h(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.c()) {
            return this.f1094k.i(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.c()) {
            return this.f1094k.j(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        j jVar = this.f1094k;
        if (jVar != null && jVar.c()) {
            return this.f1094k.k(this.f1077b0);
        }
        return 0;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.f1098m.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f1098m.get(i2).d(canvas, this, this.f1077b0);
        }
        EdgeEffect edgeEffect = this.D;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1086g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.D;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1086g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.E;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.F;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1086g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.F;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.G;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1086g) {
                f2 = getPaddingRight() + (-getWidth());
                f3 = getPaddingBottom() + (-getHeight());
            } else {
                f2 = -getWidth();
                f3 = -getHeight();
            }
            canvas.translate(f2, f3);
            EdgeEffect edgeEffect8 = this.G;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.H == null || this.f1098m.size() <= 0 || !this.H.e()) {
            z4 = z2;
        }
        if (z4) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void e(String str) {
        if (y()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(p0.a.a(this, c.f.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else if (this.B > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(p0.a.a(this, c.f.a(""))));
        }
    }

    public final void f() {
        F();
        setScrollState(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c7, code lost:
        if (r4 > 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
        if (r6 > 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e4, code lost:
        if (r4 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e7, code lost:
        if (r6 < 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ef, code lost:
        if ((r6 * r3) < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00f7, code lost:
        if ((r6 * r3) > 0) goto L76;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        j jVar = this.f1094k;
        if (jVar != null) {
            return jVar.l();
        }
        throw new IllegalStateException(p0.a.a(this, c.f.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        j jVar = this.f1094k;
        if (jVar != null) {
            return jVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException(p0.a.a(this, c.f.a("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        j jVar = this.f1094k;
        if (jVar != null) {
            return jVar.n(layoutParams);
        }
        throw new IllegalStateException(p0.a.a(this, c.f.a("RecyclerView has no LayoutManager")));
    }

    public d getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        j jVar = this.f1094k;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i2, int i3) {
        e eVar = this.f1093j0;
        return eVar == null ? super.getChildDrawingOrder(i2, i3) : eVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1086g;
    }

    public androidx.recyclerview.widget.n getCompatAccessibilityDelegate() {
        return this.f1091i0;
    }

    public f getEdgeEffectFactory() {
        return this.C;
    }

    public g getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.f1098m.size();
    }

    public j getLayoutManager() {
        return this.f1094k;
    }

    public int getMaxFlingVelocity() {
        return this.R;
    }

    public int getMinFlingVelocity() {
        return this.Q;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public l getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.U;
    }

    public o getRecycledViewPool() {
        return this.f1076b.d();
    }

    public int getScrollState() {
        return this.I;
    }

    public void h(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.D;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.D.onRelease();
            z2 = this.D.isFinished();
        }
        EdgeEffect edgeEffect2 = this.F;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.F.onRelease();
            z2 |= this.F.isFinished();
        }
        EdgeEffect edgeEffect3 = this.E;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.E.onRelease();
            z2 |= this.E.isFinished();
        }
        EdgeEffect edgeEffect4 = this.G;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.G.onRelease();
            z2 |= this.G.isFinished();
        }
        if (z2) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public void i() {
        if (!this.f1108r || this.f1116y) {
            int i2 = a0.a.f2a;
            Trace.beginSection("RV FullInvalidate");
            k();
            Trace.endSection();
        } else if (this.f1080d.b()) {
            Objects.requireNonNull(this.f1080d);
            if (this.f1080d.b()) {
                int i3 = a0.a.f2a;
                Trace.beginSection("RV FullInvalidate");
                k();
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f1104p;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f1626d;
    }

    public void j(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        setMeasuredDimension(j.e(i2, paddingRight, getMinimumWidth()), j.e(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void k() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    public boolean l(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, null, i4);
    }

    public boolean m(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, null);
    }

    public void n() {
        int measuredWidth;
        int measuredHeight;
        if (this.G != null) {
            return;
        }
        EdgeEffect a2 = this.C.a(this);
        this.G = a2;
        if (this.f1086g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }

    public void o() {
        int measuredHeight;
        int measuredWidth;
        if (this.D != null) {
            return;
        }
        EdgeEffect a2 = this.C.a(this);
        this.D = a2;
        if (this.f1086g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = 0;
        this.f1104p = true;
        this.f1108r = this.f1108r && !isLayoutRequested();
        j jVar = this.f1094k;
        if (jVar != null) {
            jVar.f1132f = true;
        }
        this.f1089h0 = false;
        ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f1045f;
        androidx.recyclerview.widget.e eVar = threadLocal.get();
        this.W = eVar;
        if (eVar == null) {
            this.W = new androidx.recyclerview.widget.e();
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            Display display = getDisplay();
            float f2 = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f2 = refreshRate;
                }
            }
            androidx.recyclerview.widget.e eVar2 = this.W;
            eVar2.f1049d = 1.0E9f / f2;
            threadLocal.set(eVar2);
        }
        this.W.f1047b.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.H;
        if (gVar != null) {
            gVar.d();
        }
        M();
        this.f1104p = false;
        j jVar = this.f1094k;
        if (jVar != null) {
            p pVar = this.f1076b;
            jVar.f1132f = false;
            jVar.B(this, pVar);
        }
        this.f1105p0.clear();
        removeCallbacks(this.f1107q0);
        Objects.requireNonNull(this.f1084f);
        do {
        } while (r.a.f1207d.a() != null);
        androidx.recyclerview.widget.e eVar = this.W;
        if (eVar != null) {
            eVar.f1047b.remove(this);
            this.W = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1098m.size();
        for (int i2 = 0; i2 < size; i2++) {
            Objects.requireNonNull(this.f1098m.get(i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.k$j r0 = r5.f1094k
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f1112u
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.k$j r0 = r5.f1094k
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.k$j r3 = r5.f1094k
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.k$j r3 = r5.f1094k
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.k$j r3 = r5.f1094k
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.S
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.T
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.G(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        if (this.f1112u) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f1102o = null;
        }
        int size = this.f1100n.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = false;
                break;
            }
            m mVar = this.f1100n.get(i2);
            if (mVar.b(this, motionEvent) && action != 3) {
                this.f1102o = mVar;
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            f();
            return true;
        }
        j jVar = this.f1094k;
        if (jVar == null) {
            return false;
        }
        boolean b2 = jVar.b();
        boolean c2 = this.f1094k.c();
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1113v) {
                this.f1113v = false;
            }
            this.J = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.N = x2;
            this.L = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.O = y2;
            this.M = y2;
            if (this.I == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f1103o0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = b2;
            if (c2) {
                i3 = (b2 ? 1 : 0) | 2;
            }
            K(i3, 0);
        } else if (actionMasked == 1) {
            this.K.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.J);
            if (findPointerIndex < 0) {
                StringBuilder a2 = c.f.a("Error processing scroll; pointer index for id ");
                a2.append(this.J);
                a2.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", a2.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.I != 1) {
                int i4 = x3 - this.L;
                int i5 = y3 - this.M;
                if (!b2 || Math.abs(i4) <= this.P) {
                    z3 = false;
                } else {
                    this.N = x3;
                    z3 = true;
                }
                if (c2 && Math.abs(i5) > this.P) {
                    this.O = y3;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            f();
        } else if (actionMasked == 5) {
            this.J = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.N = x4;
            this.L = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.O = y4;
            this.M = y4;
        } else if (actionMasked == 6) {
            C(motionEvent);
        }
        return this.I == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = a0.a.f2a;
        Trace.beginSection("RV OnLayout");
        k();
        Trace.endSection();
        this.f1108r = true;
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        j jVar = this.f1094k;
        if (jVar == null) {
            j(i2, i3);
        } else if (jVar.A()) {
            View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getMode(i3);
            this.f1094k.f1128b.j(i2, i3);
        } else if (this.f1106q) {
            this.f1094k.f1128b.j(i2, i3);
        } else {
            s sVar = this.f1077b0;
            if (sVar.f1169h) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Objects.requireNonNull(sVar);
            J();
            this.f1094k.f1128b.j(i2, i3);
            L(false);
            this.f1077b0.f1166e = false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (y()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof r)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        r rVar = (r) parcelable;
        this.f1078c = rVar;
        super.onRestoreInstanceState(rVar.f2110a);
        j jVar = this.f1094k;
        if (jVar == null || (parcelable2 = this.f1078c.f1161c) == null) {
            return;
        }
        jVar.F(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        r rVar = new r(super.onSaveInstanceState());
        r rVar2 = this.f1078c;
        if (rVar2 != null) {
            rVar.f1161c = rVar2.f1161c;
        } else {
            j jVar = this.f1094k;
            rVar.f1161c = jVar != null ? jVar.G() : null;
        }
        return rVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        x();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x023d, code lost:
        if (r1 != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r2 != 1) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p() {
        int measuredHeight;
        int measuredWidth;
        if (this.F != null) {
            return;
        }
        EdgeEffect a2 = this.C.a(this);
        this.F = a2;
        if (this.f1086g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a2.setSize(measuredHeight, measuredWidth);
    }

    public void q() {
        int measuredWidth;
        int measuredHeight;
        if (this.E != null) {
            return;
        }
        EdgeEffect a2 = this.C.a(this);
        this.E = a2;
        if (this.f1086g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a2.setSize(measuredWidth, measuredHeight);
    }

    public String r() {
        StringBuilder a2 = c.f.a(" ");
        a2.append(super.toString());
        a2.append(", adapter:");
        a2.append((Object) null);
        a2.append(", layout:");
        a2.append(this.f1094k);
        a2.append(", context:");
        a2.append(getContext());
        return a2.toString();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z2) {
        v u2 = u(view);
        if (u2 != null) {
            if (u2.k()) {
                u2.f1183f &= -257;
            } else if (!u2.p()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(u2);
                throw new IllegalArgumentException(p0.a.a(this, sb));
            }
        }
        view.clearAnimation();
        u(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        Objects.requireNonNull(this.f1094k);
        if (!y() && view2 != null) {
            E(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1094k.M(this, view, rect, z2, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.f1100n.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1100n.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f1110s != 0 || this.f1112u) {
            this.f1111t = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View s(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.k.s(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        j jVar = this.f1094k;
        if (jVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f1112u) {
        } else {
            boolean b2 = jVar.b();
            boolean c2 = this.f1094k.c();
            if (b2 || c2) {
                if (!b2) {
                    i2 = 0;
                }
                if (!c2) {
                    i3 = 0;
                }
                G(i2, i3, null);
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (y()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f1114w |= contentChangeTypes != 0 ? contentChangeTypes : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.n nVar) {
        this.f1091i0 = nVar;
        e0.m.f(this, nVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        D();
        androidx.recyclerview.widget.a aVar = this.f1080d;
        aVar.d(aVar.f983b);
        aVar.d(aVar.f984c);
        p pVar = this.f1076b;
        pVar.b();
        o d2 = pVar.d();
        Objects.requireNonNull(d2);
        if (d2.f1148b == 0) {
            for (int i2 = 0; i2 < d2.f1147a.size(); i2++) {
                d2.f1147a.valueAt(i2).f1149a.clear();
            }
        }
        this.f1077b0.f1165d = true;
        this.f1117z |= false;
        this.f1116y = true;
        int e2 = this.f1082e.e();
        for (int i3 = 0; i3 < e2; i3++) {
            v u2 = u(this.f1082e.d(i3));
            if (u2 != null && !u2.p()) {
                u2.b(6);
            }
        }
        z();
        p pVar2 = this.f1076b;
        int size = pVar2.f1155c.size();
        for (int i4 = 0; i4 < size; i4++) {
            v vVar = pVar2.f1155c.get(i4);
            if (vVar != null) {
                vVar.b(6);
                vVar.a(null);
            }
        }
        Objects.requireNonNull(k.this);
        pVar2.e();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(e eVar) {
        if (eVar == this.f1093j0) {
            return;
        }
        this.f1093j0 = eVar;
        setChildrenDrawingOrderEnabled(eVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1086g) {
            x();
        }
        this.f1086g = z2;
        super.setClipToPadding(z2);
        if (this.f1108r) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(f fVar) {
        Objects.requireNonNull(fVar);
        this.C = fVar;
        x();
    }

    public void setHasFixedSize(boolean z2) {
        this.f1106q = z2;
    }

    public void setItemAnimator(g gVar) {
        g gVar2 = this.H;
        if (gVar2 != null) {
            gVar2.d();
            this.H.f1120a = null;
        }
        this.H = gVar;
        if (gVar != null) {
            gVar.f1120a = this.f1087g0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        p pVar = this.f1076b;
        pVar.f1157e = i2;
        pVar.l();
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.f1112u) {
            e("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.f1112u = false;
                if (this.f1111t) {
                    j jVar = this.f1094k;
                }
                this.f1111t = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1112u = true;
            this.f1113v = true;
            M();
        }
    }

    public void setLayoutManager(j jVar) {
        if (jVar == this.f1094k) {
            return;
        }
        M();
        if (this.f1094k != null) {
            g gVar = this.H;
            if (gVar != null) {
                gVar.d();
            }
            this.f1094k.I(this.f1076b);
            this.f1094k.J(this.f1076b);
            this.f1076b.b();
            if (this.f1104p) {
                j jVar2 = this.f1094k;
                p pVar = this.f1076b;
                jVar2.f1132f = false;
                jVar2.B(this, pVar);
            }
            this.f1094k.O(null);
            this.f1094k = null;
        } else {
            this.f1076b.b();
        }
        androidx.recyclerview.widget.b bVar = this.f1082e;
        b.a aVar = bVar.f992b;
        aVar.f994a = 0L;
        b.a aVar2 = aVar.f995b;
        if (aVar2 != null) {
            aVar2.f();
        }
        int size = bVar.f993c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.l lVar = (androidx.recyclerview.widget.l) bVar.f991a;
            Objects.requireNonNull(lVar);
            v u2 = u(bVar.f993c.get(size));
            if (u2 != null) {
                lVar.f1192a.H(u2, u2.f1189l);
                u2.f1189l = 0;
            }
            bVar.f993c.remove(size);
        }
        androidx.recyclerview.widget.l lVar2 = (androidx.recyclerview.widget.l) bVar.f991a;
        int b2 = lVar2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            View a2 = lVar2.a(i2);
            Objects.requireNonNull(lVar2.f1192a);
            u(a2);
            a2.clearAnimation();
        }
        lVar2.f1192a.removeAllViews();
        this.f1094k = jVar;
        if (jVar != null) {
            if (jVar.f1128b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(jVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(p0.a.a(jVar.f1128b, sb));
            }
            jVar.O(this);
            if (this.f1104p) {
                this.f1094k.f1132f = true;
            }
        }
        this.f1076b.l();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        e0.g scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f1626d) {
            View view = scrollingChildHelper.f1625c;
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.f1626d = z2;
    }

    public void setOnFlingListener(l lVar) {
    }

    @Deprecated
    public void setOnScrollListener(n nVar) {
        this.f1079c0 = nVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.U = z2;
    }

    public void setRecycledViewPool(o oVar) {
        o oVar2;
        p pVar = this.f1076b;
        if (pVar.f1159g != null) {
            oVar2.f1148b--;
        }
        pVar.f1159g = oVar;
        if (oVar != null) {
            k.this.getAdapter();
        }
    }

    public void setRecyclerListener(q qVar) {
        this.f1096l = qVar;
    }

    public void setScrollState(int i2) {
        if (i2 == this.I) {
            return;
        }
        this.I = i2;
        if (i2 != 2) {
            u uVar = this.V;
            k.this.removeCallbacks(uVar);
            uVar.f1172d.abortAnimation();
        }
        j jVar = this.f1094k;
        if (jVar != null) {
            jVar.H(i2);
        }
        List<n> list = this.f1081d0;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Objects.requireNonNull(this.f1081d0.get(size));
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.P = scaledTouchSlop;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.P = scaledTouchSlop;
    }

    public void setViewCacheExtension(t tVar) {
        Objects.requireNonNull(this.f1076b);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public int t(v vVar) {
        if (!vVar.f(524) && vVar.g()) {
            androidx.recyclerview.widget.a aVar = this.f1080d;
            int i2 = vVar.f1178a;
            int size = aVar.f983b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f983b.get(i3);
                int i4 = bVar.f987a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.f988b;
                        if (i5 <= i2) {
                            int i6 = bVar.f990d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.f988b;
                        if (i7 == i2) {
                            i2 = bVar.f990d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f990d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f988b <= i2) {
                    i2 += bVar.f990d;
                }
            }
            return i2;
        }
        return -1;
    }

    public boolean v(int i2) {
        return getScrollingChildHelper().f(i2) != null;
    }

    public boolean w() {
        return !this.f1108r || this.f1116y || this.f1080d.b();
    }

    public void x() {
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    public boolean y() {
        return this.A > 0;
    }

    public void z() {
        int e2 = this.f1082e.e();
        for (int i2 = 0; i2 < e2; i2++) {
            ((C0011k) this.f1082e.d(i2).getLayoutParams()).f1146b = true;
        }
        p pVar = this.f1076b;
        if (pVar.f1155c.size() <= 0) {
            return;
        }
        Objects.requireNonNull(pVar.f1155c.get(0));
        throw null;
    }
}