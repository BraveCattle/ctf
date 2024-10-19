package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.x64m.xsfmnative.R;
import e0.e;
import e0.m;
import e0.o;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import l.h;
import w0.b;

@CoordinatorLayout.d(Behavior.class)
/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public int f1419b;

    /* renamed from: c  reason: collision with root package name */
    public int f1420c;

    /* renamed from: d  reason: collision with root package name */
    public int f1421d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1422e;

    /* renamed from: f  reason: collision with root package name */
    public int f1423f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1424g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1425h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1426i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f1427j;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends w0.a<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f1428j;

        /* renamed from: k  reason: collision with root package name */
        public int f1429k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f1430l;

        /* renamed from: m  reason: collision with root package name */
        public int f1431m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1432n;

        /* renamed from: o  reason: collision with root package name */
        public float f1433o;

        /* renamed from: p  reason: collision with root package name */
        public WeakReference<View> f1434p;

        /* loaded from: classes.dex */
        public static class a extends i0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0016a();

            /* renamed from: c  reason: collision with root package name */
            public int f1435c;

            /* renamed from: d  reason: collision with root package name */
            public float f1436d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f1437e;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0016a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i2) {
                    return new a[i2];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f1435c = parcel.readInt();
                this.f1436d = parcel.readFloat();
                this.f1437e = parcel.readByte() != 0;
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // i0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeParcelable(this.f2110a, i2);
                parcel.writeInt(this.f1435c);
                parcel.writeFloat(this.f1436d);
                parcel.writeByte(this.f1437e ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
            this.f1431m = -1;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1431m = -1;
        }

        public static boolean B(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        public final void A(CoordinatorLayout coordinatorLayout, T t2, int i2, float f2) {
            int abs = Math.abs(w() - i2);
            float abs2 = Math.abs(f2);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t2.getHeight()) + 1.0f) * 150.0f);
            int w2 = w();
            if (w2 == i2) {
                ValueAnimator valueAnimator = this.f1430l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f1430l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f1430l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f1430l = valueAnimator3;
                valueAnimator3.setInterpolator(v0.a.f2711d);
                this.f1430l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, t2));
            } else {
                valueAnimator2.cancel();
            }
            this.f1430l.setDuration(Math.min(round, 600));
            this.f1430l.setIntValues(w2, i2);
            this.f1430l.start();
        }

        public final void C(CoordinatorLayout coordinatorLayout, T t2) {
            int w2 = w();
            int childCount = t2.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t2.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                a aVar = (a) childAt.getLayoutParams();
                if (B(aVar.f1438a, 32)) {
                    top -= ((LinearLayout.LayoutParams) aVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) aVar).bottomMargin;
                }
                int i3 = -w2;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t2.getChildAt(i2);
                a aVar2 = (a) childAt2.getLayoutParams();
                int i4 = aVar2.f1438a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == t2.getChildCount() - 1) {
                        i6 += t2.getTopInset();
                    }
                    if (B(i4, 2)) {
                        WeakHashMap<View, o> weakHashMap = m.f1633a;
                        i6 += childAt2.getMinimumHeight();
                    } else if (B(i4, 5)) {
                        WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                        int minimumHeight = childAt2.getMinimumHeight() + i6;
                        if (w2 < minimumHeight) {
                            i5 = minimumHeight;
                        } else {
                            i6 = minimumHeight;
                        }
                    }
                    if (B(i4, 32)) {
                        i5 += ((LinearLayout.LayoutParams) aVar2).topMargin;
                        i6 -= ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    }
                    if (w2 < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    A(coordinatorLayout, t2, b.a.e(i5, -t2.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void D(int i2, T t2, View view, int i3) {
            if (i3 == 1) {
                int w2 = w();
                if ((i2 >= 0 || w2 != 0) && (i2 <= 0 || w2 != (-t2.getDownNestedScrollRange()))) {
                    return;
                }
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                if (view instanceof e) {
                    ((e) view).a(1);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void E(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, int r10, int r11, boolean r12) {
            /*
                r7 = this;
                int r0 = java.lang.Math.abs(r10)
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r9.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto Lb7
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$a r0 = (com.google.android.material.appbar.AppBarLayout.a) r0
                int r0 = r0.f1438a
                r1 = r0 & 1
                r3 = 1
                if (r1 == 0) goto L5e
                java.util.WeakHashMap<android.view.View, e0.o> r1 = e0.m.f1633a
                int r1 = r5.getMinimumHeight()
                if (r11 <= 0) goto L4b
                r11 = r0 & 12
                if (r11 == 0) goto L4b
                int r10 = -r10
                int r11 = r5.getBottom()
                int r11 = r11 - r1
                int r0 = r9.getTopInset()
                int r11 = r11 - r0
                if (r10 < r11) goto L5e
                goto L5c
            L4b:
                r11 = r0 & 2
                if (r11 == 0) goto L5e
                int r10 = -r10
                int r11 = r5.getBottom()
                int r11 = r11 - r1
                int r0 = r9.getTopInset()
                int r11 = r11 - r0
                if (r10 < r11) goto L5e
            L5c:
                r10 = r3
                goto L5f
            L5e:
                r10 = r2
            L5f:
                boolean r11 = r9.f1426i
                if (r11 == 0) goto L82
                int r11 = r8.getChildCount()
                r0 = r2
            L68:
                if (r0 >= r11) goto L77
                android.view.View r1 = r8.getChildAt(r0)
                boolean r5 = r1 instanceof e0.f
                if (r5 == 0) goto L74
                r4 = r1
                goto L77
            L74:
                int r0 = r0 + 1
                goto L68
            L77:
                if (r4 == 0) goto L82
                int r10 = r4.getScrollY()
                if (r10 <= 0) goto L81
                r10 = r3
                goto L82
            L81:
                r10 = r2
            L82:
                boolean r10 = r9.c(r10)
                if (r12 != 0) goto Lb4
                if (r10 == 0) goto Lb7
                java.util.List r8 = r8.e(r9)
                int r10 = r8.size()
                r11 = r2
            L93:
                if (r11 >= r10) goto Lb2
                java.lang.Object r12 = r8.get(r11)
                android.view.View r12 = (android.view.View) r12
                android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r12 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r12
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r12 = r12.f665a
                boolean r0 = r12 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r0 == 0) goto Laf
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r12 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r12
                int r8 = r12.f2754f
                if (r8 == 0) goto Lb2
                r2 = r3
                goto Lb2
            Laf:
                int r11 = r11 + 1
                goto L93
            Lb2:
                if (r2 == 0) goto Lb7
            Lb4:
                r9.jumpDrawablesToCurrentState()
            Lb7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.E(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // w0.c, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean f(CoordinatorLayout coordinatorLayout, View view, int i2) {
            int round;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.f(coordinatorLayout, appBarLayout, i2);
            int pendingAction = appBarLayout.getPendingAction();
            int i3 = this.f1431m;
            if (i3 >= 0 && (pendingAction & 8) == 0) {
                View childAt = appBarLayout.getChildAt(i3);
                int i4 = -childAt.getBottom();
                if (this.f1432n) {
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    round = appBarLayout.getTopInset() + childAt.getMinimumHeight() + i4;
                } else {
                    round = Math.round(childAt.getHeight() * this.f1433o) + i4;
                }
                y(coordinatorLayout, appBarLayout, round);
            } else if (pendingAction != 0) {
                boolean z2 = (pendingAction & 4) != 0;
                if ((pendingAction & 2) != 0) {
                    int i5 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z2) {
                        A(coordinatorLayout, appBarLayout, i5, 0.0f);
                    } else {
                        y(coordinatorLayout, appBarLayout, i5);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z2) {
                        A(coordinatorLayout, appBarLayout, 0, 0.0f);
                    } else {
                        y(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f1423f = 0;
            this.f1431m = -1;
            u(b.a.e(s(), -appBarLayout.getTotalScrollRange(), 0));
            E(coordinatorLayout, appBarLayout, s(), 0, true);
            s();
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.s(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void i(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 != 0) {
                if (i3 < 0) {
                    i5 = -appBarLayout.getTotalScrollRange();
                    i6 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -appBarLayout.getUpNestedPreScrollRange();
                    i6 = 0;
                }
                int i7 = i5;
                int i8 = i6;
                if (i7 != i8) {
                    iArr[1] = x(coordinatorLayout, appBarLayout, i3, i7, i8);
                    D(i3, appBarLayout, view2, i4);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i5 < 0) {
                x(coordinatorLayout, appBarLayout, i5, -appBarLayout.getDownNestedScrollRange(), 0);
                D(i5, appBarLayout, view2, i6);
            }
            if (appBarLayout.f1426i) {
                appBarLayout.c(view2.getScrollY() > 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void m(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (!(parcelable instanceof a)) {
                this.f1431m = -1;
                return;
            }
            a aVar = (a) parcelable;
            this.f1431m = aVar.f1435c;
            this.f1433o = aVar.f1436d;
            this.f1432n = aVar.f1437e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public Parcelable n(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int s2 = s();
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                int bottom = childAt.getBottom() + s2;
                if (childAt.getTop() + s2 <= 0 && bottom >= 0) {
                    a aVar = new a(absSavedState);
                    aVar.f1435c = i2;
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    aVar.f1437e = bottom == appBarLayout.getTopInset() + childAt.getMinimumHeight();
                    aVar.f1436d = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f1426i
                if (r5 != 0) goto L2d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r6
                goto L15
            L14:
                r5 = r0
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r6
                goto L29
            L28:
                r2 = r0
            L29:
                if (r2 == 0) goto L2c
                goto L2d
            L2c:
                r6 = r0
            L2d:
                if (r6 == 0) goto L36
                android.animation.ValueAnimator r2 = r1.f1430l
                if (r2 == 0) goto L36
                r2.cancel()
            L36:
                r2 = 0
                r1.f1434p = r2
                r1.f1429k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f1429k == 0 || i2 == 1) {
                C(coordinatorLayout, appBarLayout);
            }
            this.f1434p = new WeakReference<>(view2);
        }

        @Override // w0.a
        public boolean v(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f1434p;
            if (weakReference != null) {
                View view2 = weakReference.get();
                return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
            }
            return true;
        }

        @Override // w0.a
        public int w() {
            return s() + this.f1428j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // w0.a
        public int z(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            List list;
            int i6;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int w2 = w();
            if (i3 == 0 || w2 < i3 || w2 > i4) {
                this.f1428j = 0;
                return 0;
            }
            int e2 = b.a.e(i2, i3, i4);
            if (w2 != e2) {
                if (appBarLayout.f1422e) {
                    int abs = Math.abs(e2);
                    int childCount = appBarLayout.getChildCount();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= childCount) {
                            break;
                        }
                        View childAt = appBarLayout.getChildAt(i7);
                        a aVar = (a) childAt.getLayoutParams();
                        Interpolator interpolator = aVar.f1439b;
                        if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                            i7++;
                        } else if (interpolator != null) {
                            int i8 = aVar.f1438a;
                            if ((i8 & 1) != 0) {
                                i6 = childAt.getHeight() + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0;
                                if ((i8 & 2) != 0) {
                                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                                    i6 -= childAt.getMinimumHeight();
                                }
                            } else {
                                i6 = 0;
                            }
                            WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                            if (childAt.getFitsSystemWindows()) {
                                i6 -= appBarLayout.getTopInset();
                            }
                            if (i6 > 0) {
                                float f2 = i6;
                                i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f2) * f2)) * Integer.signum(e2);
                            }
                        }
                    }
                }
                i5 = e2;
                boolean u2 = u(i5);
                int i9 = w2 - e2;
                this.f1428j = e2 - i5;
                if (!u2 && appBarLayout.f1422e && (list = (List) ((h) coordinatorLayout.f646c.f2312b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        View view2 = (View) list.get(i10);
                        CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f665a;
                        if (cVar != null) {
                            cVar.d(coordinatorLayout, view2, appBarLayout);
                        }
                    }
                }
                s();
                E(coordinatorLayout, appBarLayout, e2, e2 < w2 ? -1 : 1, false);
                return i9;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2704f);
            this.f2754f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f665a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f1428j) + this.f2753e) - v(view2);
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f1426i) {
                    appBarLayout.c(view.getScrollY() > 0);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            AppBarLayout w2 = w(coordinatorLayout.d(view));
            if (w2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f2751c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w2.b(false, !z2);
                    return true;
                }
            }
            return false;
        }

        public AppBarLayout w(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f1438a;

        /* renamed from: b  reason: collision with root package name */
        public Interpolator f1439b;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1438a = 1;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1438a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u0.a.f2699a);
            this.f1438a = obtainStyledAttributes.getInt(0, 0);
            if (obtainStyledAttributes.hasValue(1)) {
                this.f1439b = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1438a = 1;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1438a = 1;
        }

        public a(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1438a = 1;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new a((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public void b(boolean z2, boolean z3) {
        this.f1423f = (z2 ? 1 : 2) | (z3 ? 4 : 0) | 8;
        requestLayout();
    }

    public boolean c(boolean z2) {
        if (this.f1425h != z2) {
            this.f1425h = z2;
            refreshDrawableState();
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getDownNestedPreScrollRange() {
        int topInset;
        int i2 = this.f1420c;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = aVar.f1438a;
            if ((i4 & 5) == 5) {
                int i5 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + i3;
                if ((i4 & 8) != 0) {
                    WeakHashMap<View, o> weakHashMap = m.f1633a;
                    i3 = childAt.getMinimumHeight() + i5;
                } else {
                    if ((i4 & 2) != 0) {
                        WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                        topInset = childAt.getMinimumHeight();
                    } else {
                        topInset = getTopInset();
                    }
                    i3 = (measuredHeight - topInset) + i5;
                }
            } else if (i3 > 0) {
                break;
            }
        }
        int max = Math.max(0, i3);
        this.f1420c = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f1421d;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + childAt.getMeasuredHeight();
            int i5 = aVar.f1438a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                i4 -= getTopInset() + childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f1421d = max;
        return max;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount >= 1 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return (minimumHeight * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f1423f;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f1419b;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            a aVar = (a) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = aVar.f1438a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                i4 -= childAt.getMinimumHeight();
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4 - getTopInset());
        this.f1419b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i2) {
        if (this.f1427j == null) {
            this.f1427j = new int[4];
        }
        int[] iArr = this.f1427j;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z2 = this.f1424g;
        iArr[0] = z2 ? R.attr.state_liftable : -2130903580;
        iArr[1] = (z2 && this.f1425h) ? R.attr.state_lifted : -2130903581;
        iArr[2] = z2 ? R.attr.state_collapsible : -2130903579;
        iArr[3] = (z2 && this.f1425h) ? R.attr.state_collapsed : -2130903578;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r3 != false) goto L32;
     */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = -1
            r1.f1419b = r2
            r1.f1420c = r2
            r1.f1421d = r2
            r2 = 0
            r1.f1422e = r2
            int r3 = r1.getChildCount()
            r4 = r2
        L12:
            r5 = 1
            if (r4 >= r3) goto L29
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r6 = (com.google.android.material.appbar.AppBarLayout.a) r6
            android.view.animation.Interpolator r6 = r6.f1439b
            if (r6 == 0) goto L26
            r1.f1422e = r5
            goto L29
        L26:
            int r4 = r4 + 1
            goto L12
        L29:
            boolean r3 = r1.f1426i
            if (r3 != 0) goto L55
            int r3 = r1.getChildCount()
            r4 = r2
        L32:
            if (r4 >= r3) goto L52
            android.view.View r6 = r1.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$a r6 = (com.google.android.material.appbar.AppBarLayout.a) r6
            int r6 = r6.f1438a
            r0 = r6 & 1
            if (r0 != r5) goto L4a
            r6 = r6 & 10
            if (r6 == 0) goto L4a
            r6 = r5
            goto L4b
        L4a:
            r6 = r2
        L4b:
            if (r6 == 0) goto L4f
            r3 = r5
            goto L53
        L4f:
            int r4 = r4 + 1
            goto L32
        L52:
            r3 = r2
        L53:
            if (r3 == 0) goto L56
        L55:
            r2 = r5
        L56:
            boolean r3 = r1.f1424g
            if (r3 == r2) goto L5f
            r1.f1424g = r2
            r1.refreshDrawableState()
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f1419b = -1;
        this.f1420c = -1;
        this.f1421d = -1;
    }

    public void setExpanded(boolean z2) {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        b(z2, isLaidOut());
    }

    public void setLiftOnScroll(boolean z2) {
        this.f1426i = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.state_liftable, -2130903581}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(this, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new a(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }
}