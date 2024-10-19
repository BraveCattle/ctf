package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e0.m;
import e0.o;
import j0.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1463a;

    /* renamed from: b  reason: collision with root package name */
    public float f1464b;

    /* renamed from: c  reason: collision with root package name */
    public int f1465c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1466d;

    /* renamed from: e  reason: collision with root package name */
    public int f1467e;

    /* renamed from: f  reason: collision with root package name */
    public int f1468f;

    /* renamed from: g  reason: collision with root package name */
    public int f1469g;

    /* renamed from: h  reason: collision with root package name */
    public int f1470h;

    /* renamed from: i  reason: collision with root package name */
    public int f1471i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1472j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1473k;

    /* renamed from: l  reason: collision with root package name */
    public int f1474l;

    /* renamed from: m  reason: collision with root package name */
    public j0.a f1475m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1476n;

    /* renamed from: o  reason: collision with root package name */
    public int f1477o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1478p;

    /* renamed from: q  reason: collision with root package name */
    public int f1479q;

    /* renamed from: r  reason: collision with root package name */
    public WeakReference<V> f1480r;

    /* renamed from: s  reason: collision with root package name */
    public WeakReference<View> f1481s;

    /* renamed from: t  reason: collision with root package name */
    public VelocityTracker f1482t;

    /* renamed from: u  reason: collision with root package name */
    public int f1483u;

    /* renamed from: v  reason: collision with root package name */
    public int f1484v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1485w;

    /* renamed from: x  reason: collision with root package name */
    public Map<View, Integer> f1486x;

    /* renamed from: y  reason: collision with root package name */
    public final a.c f1487y;

    /* loaded from: classes.dex */
    public class a extends a.c {
        public a() {
        }

        @Override // j0.a.c
        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        @Override // j0.a.c
        public int b(View view, int i2, int i3) {
            int u2 = BottomSheetBehavior.this.u();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return b.a.e(i2, u2, bottomSheetBehavior.f1472j ? bottomSheetBehavior.f1479q : bottomSheetBehavior.f1471i);
        }

        @Override // j0.a.c
        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.f1472j ? bottomSheetBehavior.f1479q : bottomSheetBehavior.f1471i;
        }

        @Override // j0.a.c
        public void f(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior.this.w(1);
            }
        }

        @Override // j0.a.c
        public void g(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.f1480r.get();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
            if (r7 < java.lang.Math.abs(r7 - r8.f1471i)) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x008a, code lost:
            r7 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
            if (java.lang.Math.abs(r7 - r0) < java.lang.Math.abs(r7 - r5.f1488a.f1471i)) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
            if (r7 > r8) goto L17;
         */
        @Override // j0.a.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void h(android.view.View r6, float r7, float r8) {
            /*
                r5 = this;
                r0 = 0
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 4
                r3 = 3
                if (r1 >= 0) goto L1e
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = r7.f1463a
                if (r8 == 0) goto L12
            Ld:
                int r7 = r7.f1469g
            Lf:
                r2 = r3
                goto La4
            L12:
                int r7 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r8.f1470h
                if (r7 <= r8) goto L8a
                goto La1
            L1e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r4 = r1.f1472j
                if (r4 == 0) goto L46
                boolean r1 = r1.x(r6, r8)
                if (r1 == 0) goto L46
                int r1 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r4 = r4.f1471i
                if (r1 > r4) goto L40
                float r1 = java.lang.Math.abs(r7)
                float r4 = java.lang.Math.abs(r8)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 >= 0) goto L46
            L40:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.f1479q
                r2 = 5
                goto La4
            L46:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r0 == 0) goto L5c
                float r7 = java.lang.Math.abs(r7)
                float r8 = java.lang.Math.abs(r8)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 <= 0) goto L57
                goto L5c
            L57:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.f1471i
                goto La4
            L5c:
                int r7 = r6.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r8.f1463a
                if (r0 == 0) goto L7c
                int r8 = r8.f1469g
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f1471i
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L57
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                goto Ld
            L7c:
                int r0 = r8.f1470h
                if (r7 >= r0) goto L8c
                int r8 = r8.f1471i
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                if (r7 >= r8) goto L9d
            L8a:
                r7 = 0
                goto Lf
            L8c:
                int r8 = r7 - r0
                int r8 = java.lang.Math.abs(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f1471i
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L57
            L9d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r8 = r7.f1470h
            La1:
                r7 = 6
                r2 = r7
                r7 = r8
            La4:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                j0.a r8 = r8.f1475m
                int r0 = r6.getLeft()
                boolean r7 = r8.t(r0, r7)
                if (r7 == 0) goto Lc5
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8 = 2
                r7.w(r8)
                com.google.android.material.bottomsheet.BottomSheetBehavior$c r7 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r7.<init>(r6, r2)
                java.util.WeakHashMap<android.view.View, e0.o> r8 = e0.m.f1633a
                r6.postOnAnimation(r7)
                goto Lca
            Lc5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r6.w(r2)
            Lca:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // j0.a.c
        public boolean i(View view, int i2) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.f1474l;
            if (i3 == 1 || bottomSheetBehavior.f1485w) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.f1483u == i2 && (view2 = bottomSheetBehavior.f1481s.get()) != null && view2.canScrollVertically(-1)) {
                return false;
            }
            WeakReference<V> weakReference = BottomSheetBehavior.this.f1480r;
            return weakReference != null && weakReference.get() == view;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends i0.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f1489c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new b[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1489c = parcel.readInt();
        }

        public b(Parcelable parcelable, int i2) {
            super(parcelable);
            this.f1489c = i2;
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            parcel.writeInt(this.f1489c);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f1490b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1491c;

        public c(View view, int i2) {
            this.f1490b = view;
            this.f1491c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.a aVar = BottomSheetBehavior.this.f1475m;
            if (aVar != null && aVar.i(true)) {
                View view = this.f1490b;
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                view.postOnAnimation(this);
                return;
            }
            BottomSheetBehavior.this.w(this.f1491c);
        }
    }

    public BottomSheetBehavior() {
        this.f1463a = true;
        this.f1474l = 4;
        this.f1487y = new a();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.f1463a = true;
        this.f1474l = 4;
        this.f1487y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2700b);
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue == null || (i2 = peekValue.data) != -1) {
            v(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        } else {
            v(i2);
        }
        this.f1472j = obtainStyledAttributes.getBoolean(1, false);
        boolean z2 = obtainStyledAttributes.getBoolean(0, true);
        if (this.f1463a != z2) {
            this.f1463a = z2;
            if (this.f1480r != null) {
                s();
            }
            w((this.f1463a && this.f1474l == 6) ? 3 : this.f1474l);
        }
        this.f1473k = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f1464b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        j0.a aVar;
        if (!v2.isShown()) {
            this.f1476n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1483u = -1;
            VelocityTracker velocityTracker = this.f1482t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1482t = null;
            }
        }
        if (this.f1482t == null) {
            this.f1482t = VelocityTracker.obtain();
        }
        this.f1482t.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x2 = (int) motionEvent.getX();
            this.f1484v = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f1481s;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.p(view, x2, this.f1484v)) {
                this.f1483u = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f1485w = true;
            }
            this.f1476n = this.f1483u == -1 && !coordinatorLayout.p(v2, x2, this.f1484v);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f1485w = false;
            this.f1483u = -1;
            if (this.f1476n) {
                this.f1476n = false;
                return false;
            }
        }
        if (this.f1476n || (aVar = this.f1475m) == null || !aVar.u(motionEvent)) {
            WeakReference<View> weakReference2 = this.f1481s;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f1476n || this.f1474l == 1 || coordinatorLayout.p(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f1475m == null || Math.abs(((float) this.f1484v) - motionEvent.getY()) <= ((float) this.f1475m.f2127b)) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, int r7) {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, e0.o> r0 = e0.m.f1633a
            boolean r0 = r5.getFitsSystemWindows()
            r1 = 1
            if (r0 == 0) goto L12
            boolean r0 = r6.getFitsSystemWindows()
            if (r0 != 0) goto L12
            r6.setFitsSystemWindows(r1)
        L12:
            int r0 = r6.getTop()
            r5.r(r6, r7)
            int r7 = r5.getHeight()
            r4.f1479q = r7
            boolean r7 = r4.f1466d
            if (r7 == 0) goto L46
            int r7 = r4.f1467e
            if (r7 != 0) goto L34
            android.content.res.Resources r7 = r5.getResources()
            r2 = 2131099749(0x7f060065, float:1.781186E38)
            int r7 = r7.getDimensionPixelSize(r2)
            r4.f1467e = r7
        L34:
            int r7 = r4.f1467e
            int r2 = r4.f1479q
            int r3 = r5.getWidth()
            int r3 = r3 * 9
            int r3 = r3 / 16
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            goto L48
        L46:
            int r7 = r4.f1465c
        L48:
            r4.f1468f = r7
            r7 = 0
            int r2 = r4.f1479q
            int r3 = r6.getHeight()
            int r2 = r2 - r3
            int r7 = java.lang.Math.max(r7, r2)
            r4.f1469g = r7
            int r7 = r4.f1479q
            r2 = 2
            int r7 = r7 / r2
            r4.f1470h = r7
            r4.s()
            int r7 = r4.f1474l
            r3 = 3
            if (r7 != r3) goto L6b
            int r7 = r4.u()
            goto L80
        L6b:
            r3 = 6
            if (r7 != r3) goto L71
            int r7 = r4.f1470h
            goto L80
        L71:
            boolean r3 = r4.f1472j
            if (r3 == 0) goto L7b
            r3 = 5
            if (r7 != r3) goto L7b
            int r7 = r4.f1479q
            goto L80
        L7b:
            r3 = 4
            if (r7 != r3) goto L84
            int r7 = r4.f1471i
        L80:
            r6.offsetTopAndBottom(r7)
            goto L90
        L84:
            if (r7 == r1) goto L88
            if (r7 != r2) goto L90
        L88:
            int r7 = r6.getTop()
            int r0 = r0 - r7
            r6.offsetTopAndBottom(r0)
        L90:
            j0.a r7 = r4.f1475m
            if (r7 != 0) goto La1
            j0.a$c r7 = r4.f1487y
            j0.a r0 = new j0.a
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2, r5, r7)
            r4.f1475m = r0
        La1:
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r6)
            r4.f1480r = r5
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.view.View r6 = r4.t(r6)
            r5.<init>(r6)
            r4.f1481s = r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.f(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        return view == this.f1481s.get() && this.f1474l != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void i(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1 && view == this.f1481s.get()) {
            int top = v2.getTop();
            int i6 = top - i3;
            if (i3 > 0) {
                if (i6 < u()) {
                    iArr[1] = top - u();
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    v2.offsetTopAndBottom(-iArr[1]);
                    i5 = 3;
                    w(i5);
                } else {
                    iArr[1] = i3;
                    int i7 = -i3;
                    WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                    v2.offsetTopAndBottom(i7);
                    w(1);
                }
            } else if (i3 < 0 && !view.canScrollVertically(-1)) {
                int i8 = this.f1471i;
                if (i6 > i8 && !this.f1472j) {
                    iArr[1] = top - i8;
                    WeakHashMap<View, o> weakHashMap3 = m.f1633a;
                    v2.offsetTopAndBottom(-iArr[1]);
                    i5 = 4;
                    w(i5);
                } else {
                    iArr[1] = i3;
                    int i72 = -i3;
                    WeakHashMap<View, o> weakHashMap22 = m.f1633a;
                    v2.offsetTopAndBottom(i72);
                    w(1);
                }
            }
            v2.getTop();
            this.f1480r.get();
            this.f1477o = i3;
            this.f1478p = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void m(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        int i2 = ((b) parcelable).f1489c;
        this.f1474l = (i2 == 1 || i2 == 2) ? 4 : 4;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable n(CoordinatorLayout coordinatorLayout, V v2) {
        return new b(View.BaseSavedState.EMPTY_STATE, this.f1474l);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.f1477o = 0;
        this.f1478p = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.f1471i)) goto L46;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.u()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.w(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.f1481s
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lc5
            boolean r4 = r3.f1478p
            if (r4 != 0) goto L1d
            goto Lc5
        L1d:
            int r4 = r3.f1477o
            r6 = 4
            r7 = 0
            if (r4 <= 0) goto L29
            int r4 = r3.u()
            goto L93
        L29:
            boolean r4 = r3.f1472j
            if (r4 == 0) goto L4c
            android.view.VelocityTracker r4 = r3.f1482t
            if (r4 != 0) goto L33
            r4 = 0
            goto L42
        L33:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f1464b
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.f1482t
            int r1 = r3.f1483u
            float r4 = r4.getYVelocity(r1)
        L42:
            boolean r4 = r3.x(r5, r4)
            if (r4 == 0) goto L4c
            int r4 = r3.f1479q
            r0 = 5
            goto L93
        L4c:
            int r4 = r3.f1477o
            if (r4 != 0) goto L90
            int r4 = r5.getTop()
            boolean r1 = r3.f1463a
            r2 = 6
            if (r1 == 0) goto L6d
            int r1 = r3.f1469g
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f1471i
            int r4 = r4 - r2
            int r4 = java.lang.Math.abs(r4)
            if (r1 >= r4) goto L90
            int r4 = r3.f1469g
            goto L93
        L6d:
            int r1 = r3.f1470h
            if (r4 >= r1) goto L7d
            int r6 = r3.f1471i
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L8c
            r4 = r7
            goto L93
        L7d:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.f1471i
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L90
        L8c:
            int r4 = r3.f1470h
            r0 = r2
            goto L93
        L90:
            int r4 = r3.f1471i
            r0 = r6
        L93:
            j0.a r6 = r3.f1475m
            int r1 = r5.getLeft()
            r6.f2143r = r5
            r2 = -1
            r6.f2128c = r2
            boolean r4 = r6.l(r1, r4, r7, r7)
            if (r4 != 0) goto Laf
            int r1 = r6.f2126a
            if (r1 != 0) goto Laf
            android.view.View r1 = r6.f2143r
            if (r1 == 0) goto Laf
            r1 = 0
            r6.f2143r = r1
        Laf:
            if (r4 == 0) goto Lc0
            r4 = 2
            r3.w(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r4 = new com.google.android.material.bottomsheet.BottomSheetBehavior$c
            r4.<init>(r5, r0)
            java.util.WeakHashMap<android.view.View, e0.o> r6 = e0.m.f1633a
            r5.postOnAnimation(r4)
            goto Lc3
        Lc0:
            r3.w(r0)
        Lc3:
            r3.f1478p = r7
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        if (v2.isShown()) {
            int actionMasked = motionEvent.getActionMasked();
            if (this.f1474l == 1 && actionMasked == 0) {
                return true;
            }
            j0.a aVar = this.f1475m;
            if (aVar != null) {
                aVar.n(motionEvent);
            }
            if (actionMasked == 0) {
                this.f1483u = -1;
                VelocityTracker velocityTracker = this.f1482t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1482t = null;
                }
            }
            if (this.f1482t == null) {
                this.f1482t = VelocityTracker.obtain();
            }
            this.f1482t.addMovement(motionEvent);
            if (actionMasked == 2 && !this.f1476n) {
                float abs = Math.abs(this.f1484v - motionEvent.getY());
                j0.a aVar2 = this.f1475m;
                if (abs > aVar2.f2127b) {
                    aVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            return !this.f1476n;
        }
        return false;
    }

    public final void s() {
        this.f1471i = this.f1463a ? Math.max(this.f1479q - this.f1468f, this.f1469g) : this.f1479q - this.f1468f;
    }

    public View t(View view) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View t2 = t(viewGroup.getChildAt(i2));
                if (t2 != null) {
                    return t2;
                }
            }
            return null;
        }
        return null;
    }

    public final int u() {
        if (this.f1463a) {
            return this.f1469g;
        }
        return 0;
    }

    public final void v(int i2) {
        WeakReference<V> weakReference;
        V v2;
        boolean z2 = true;
        if (i2 == -1) {
            if (!this.f1466d) {
                this.f1466d = true;
            }
            z2 = false;
        } else {
            if (this.f1466d || this.f1465c != i2) {
                this.f1466d = false;
                this.f1465c = Math.max(0, i2);
                this.f1471i = this.f1479q - i2;
            }
            z2 = false;
        }
        if (!z2 || this.f1474l != 4 || (weakReference = this.f1480r) == null || (v2 = weakReference.get()) == null) {
            return;
        }
        v2.requestLayout();
    }

    public void w(int i2) {
        boolean z2;
        if (this.f1474l == i2) {
            return;
        }
        this.f1474l = i2;
        if (i2 != 6 && i2 != 3) {
            z2 = (i2 == 5 || i2 == 4) ? false : true;
            this.f1480r.get();
        }
        y(z2);
        this.f1480r.get();
    }

    public boolean x(View view, float f2) {
        if (this.f1473k) {
            return true;
        }
        if (view.getTop() < this.f1471i) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.f1471i)) / ((float) this.f1465c) > 0.5f;
    }

    public final void y(boolean z2) {
        int intValue;
        WeakReference<V> weakReference = this.f1480r;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.f1486x != null) {
                    return;
                }
                this.f1486x = new HashMap(childCount);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.f1480r.get()) {
                    Map<View, Integer> map = this.f1486x;
                    if (z2) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    } else {
                        intValue = (map != null && map.containsKey(childAt)) ? this.f1486x.get(childAt).intValue() : 4;
                    }
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    childAt.setImportantForAccessibility(intValue);
                }
            }
            if (z2) {
                return;
            }
            this.f1486x = null;
        }
    }
}