package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e0.m;
import e0.o;
import j0.a;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public j0.a f1447a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1448b;

    /* renamed from: c  reason: collision with root package name */
    public int f1449c = 2;

    /* renamed from: d  reason: collision with root package name */
    public float f1450d = 0.5f;

    /* renamed from: e  reason: collision with root package name */
    public float f1451e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f1452f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public final a.c f1453g = new a();

    /* loaded from: classes.dex */
    public class a extends a.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1454a;

        /* renamed from: b  reason: collision with root package name */
        public int f1455b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
            r5 = r2.f1454a;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
            r5 = r2.f1454a - r3.getWidth();
            r3 = r2.f1454a;
         */
        @Override // j0.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap<android.view.View, e0.o> r5 = e0.m.f1633a
                int r5 = r3.getLayoutDirection()
                r0 = 1
                if (r5 != r0) goto Lb
                r5 = r0
                goto Lc
            Lb:
                r5 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f1449c
                if (r1 != 0) goto L26
                if (r5 == 0) goto L1e
            L14:
                int r5 = r2.f1454a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f1454a
                goto L39
            L1e:
                int r5 = r2.f1454a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L39
            L26:
                if (r1 != r0) goto L2b
                if (r5 == 0) goto L14
                goto L1e
            L2b:
                int r5 = r2.f1454a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f1454a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L39:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        @Override // j0.a.c
        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // j0.a.c
        public int c(View view) {
            return view.getWidth();
        }

        @Override // j0.a.c
        public void e(View view, int i2) {
            this.f1455b = i2;
            this.f1454a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // j0.a.c
        public void f(int i2) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // j0.a.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f1451e) + this.f1454a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f1452f) + this.f1454a;
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f1454a) >= java.lang.Math.round(r8.getWidth() * r7.f1456c.f1450d)) goto L34;
         */
        @Override // j0.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f1455b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L3c
                java.util.WeakHashMap<android.view.View, e0.o> r4 = e0.m.f1633a
                int r4 = r8.getLayoutDirection()
                if (r4 != r2) goto L18
                r4 = r2
                goto L19
            L18:
                r4 = r3
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f1449c
                r6 = 2
                if (r5 != r6) goto L21
                goto L2c
            L21:
                if (r5 != 0) goto L30
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
                goto L2c
            L2a:
                if (r1 <= 0) goto L2e
            L2c:
                r9 = r2
                goto L58
            L2e:
                r9 = r3
                goto L58
            L30:
                if (r5 != r2) goto L2e
                if (r4 == 0) goto L37
                if (r1 <= 0) goto L2e
                goto L3b
            L37:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L2e
            L3b:
                goto L2c
            L3c:
                int r9 = r8.getLeft()
                int r0 = r7.f1454a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f1450d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L2e
                goto L2c
            L58:
                if (r9 == 0) goto L66
                int r9 = r8.getLeft()
                int r0 = r7.f1454a
                if (r9 >= r0) goto L64
                int r0 = r0 - r10
                goto L69
            L64:
                int r0 = r0 + r10
                goto L69
            L66:
                int r0 = r7.f1454a
                r2 = r3
            L69:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                j0.a r9 = r9.f1447a
                int r10 = r8.getTop()
                boolean r9 = r9.t(r0, r10)
                if (r9 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, e0.o> r10 = e0.m.f1633a
                r8.postOnAnimation(r9)
                goto L8b
            L84:
                if (r2 == 0) goto L8b
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // j0.a.c
        public boolean i(View view, int i2) {
            return this.f1455b == -1 && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f1457b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f1458c;

        public b(View view, boolean z2) {
            this.f1457b = view;
            this.f1458c = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.a aVar = SwipeDismissBehavior.this.f1447a;
            if (aVar != null && aVar.i(true)) {
                View view = this.f1457b;
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                view.postOnAnimation(this);
            } else if (this.f1458c) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public static float t(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2 = this.f1448b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.p(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f1448b = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1448b = false;
        }
        if (z2) {
            if (this.f1447a == null) {
                this.f1447a = new j0.a(coordinatorLayout.getContext(), coordinatorLayout, this.f1453g);
            }
            return this.f1447a.u(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        j0.a aVar = this.f1447a;
        if (aVar != null) {
            aVar.n(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}