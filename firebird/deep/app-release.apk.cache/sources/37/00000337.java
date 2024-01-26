package r0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import r0.g;

/* loaded from: classes.dex */
public abstract class w extends g {

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f2646y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: x  reason: collision with root package name */
    public int f2647x = 3;

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements g.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f2648a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2649b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f2650c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2651d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2652e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2653f = false;

        public a(View view, int i2, boolean z2) {
            this.f2648a = view;
            this.f2649b = i2;
            this.f2650c = (ViewGroup) view.getParent();
            this.f2651d = z2;
            f(true);
        }

        @Override // r0.g.d
        public void a(g gVar) {
        }

        @Override // r0.g.d
        public void b(g gVar) {
            e();
            gVar.v(this);
        }

        @Override // r0.g.d
        public void c(g gVar) {
            f(false);
        }

        @Override // r0.g.d
        public void d(g gVar) {
            f(true);
        }

        public final void e() {
            if (!this.f2653f) {
                r.c(this.f2648a, this.f2649b);
                ViewGroup viewGroup = this.f2650c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            f(false);
        }

        public final void f(boolean z2) {
            ViewGroup viewGroup;
            if (!this.f2651d || this.f2652e == z2 || (viewGroup = this.f2650c) == null) {
                return;
            }
            this.f2652e = z2;
            q.a(viewGroup, z2);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2653f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f2653f) {
                return;
            }
            r.c(this.f2648a, this.f2649b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f2653f) {
                return;
            }
            r.c(this.f2648a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2654a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2655b;

        /* renamed from: c  reason: collision with root package name */
        public int f2656c;

        /* renamed from: d  reason: collision with root package name */
        public int f2657d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f2658e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f2659f;
    }

    public final void H(o oVar) {
        oVar.f2627a.put("android:visibility:visibility", Integer.valueOf(oVar.f2628b.getVisibility()));
        oVar.f2627a.put("android:visibility:parent", oVar.f2628b.getParent());
        int[] iArr = new int[2];
        oVar.f2628b.getLocationOnScreen(iArr);
        oVar.f2627a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.f2658e == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
        if (r0.f2656c == 0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r0.w.b I(r0.o r8, r0.o r9) {
        /*
            r7 = this;
            r0.w$b r0 = new r0.w$b
            r0.<init>()
            r1 = 0
            r0.f2654a = r1
            r0.f2655b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2627a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2627a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f2656c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f2627a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2658e = r6
            goto L37
        L33:
            r0.f2656c = r4
            r0.f2658e = r3
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f2627a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2627a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f2657d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f2627a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2659f = r2
            goto L5e
        L5a:
            r0.f2657d = r4
            r0.f2659f = r3
        L5e:
            r2 = 1
            if (r8 == 0) goto L82
            if (r9 == 0) goto L82
            int r8 = r0.f2656c
            int r9 = r0.f2657d
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f2658e
            android.view.ViewGroup r4 = r0.f2659f
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L75
            goto L93
        L75:
            if (r9 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r8 = r0.f2659f
            if (r8 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r8 = r0.f2658e
            if (r8 != 0) goto L96
            goto L88
        L82:
            if (r8 != 0) goto L8d
            int r8 = r0.f2657d
            if (r8 != 0) goto L8d
        L88:
            r0.f2655b = r2
        L8a:
            r0.f2654a = r2
            goto L96
        L8d:
            if (r9 != 0) goto L96
            int r8 = r0.f2656c
            if (r8 != 0) goto L96
        L93:
            r0.f2655b = r1
            goto L8a
        L96:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.w.I(r0.o, r0.o):r0.w$b");
    }

    public abstract Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2);

    @Override // r0.g
    public void d(o oVar) {
        H(oVar);
    }

    @Override // r0.g
    public Animator k(ViewGroup viewGroup, o oVar, o oVar2) {
        View view;
        int id;
        Float f2;
        b I = I(oVar, oVar2);
        Animator animator = null;
        if (I.f2654a && (I.f2658e != null || I.f2659f != null)) {
            if (I.f2655b) {
                if ((this.f2647x & 1) != 1 || oVar2 == null) {
                    return null;
                }
                if (oVar == null) {
                    View view2 = (View) oVar2.f2628b.getParent();
                    if (I(n(view2, false), q(view2, false)).f2654a) {
                        return null;
                    }
                }
                View view3 = oVar2.f2628b;
                c cVar = (c) this;
                float floatValue = (oVar == null || (f2 = (Float) oVar.f2627a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f2.floatValue();
                return cVar.K(view3, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
            }
            int i2 = I.f2657d;
            if ((this.f2647x & 2) == 2) {
                View view4 = oVar != null ? oVar.f2628b : null;
                View view5 = oVar2 != null ? oVar2.f2628b : null;
                if (view5 == null || view5.getParent() == null) {
                    if (view5 != null) {
                        view4 = view5;
                    } else {
                        if (view4 != null) {
                            if (view4.getParent() != null) {
                                if (view4.getParent() instanceof View) {
                                    view = (View) view4.getParent();
                                    if (I(q(view, true), n(view, true)).f2654a) {
                                        if (view.getParent() == null && (id = view.getId()) != -1) {
                                            viewGroup.findViewById(id);
                                        }
                                        view4 = null;
                                    }
                                    view4 = n.a(viewGroup, view4, view);
                                }
                            }
                        }
                        view4 = null;
                        view5 = null;
                    }
                    view5 = null;
                } else if (i2 == 4 || view4 == view5) {
                    view4 = null;
                } else {
                    view = (View) view4.getParent();
                    view4 = n.a(viewGroup, view4, view);
                    view5 = null;
                }
                if (view4 != null && oVar != null) {
                    int[] iArr = (int[]) oVar.f2627a.get("android:visibility:screenLocation");
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
                    view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
                    k0.d dVar = new k0.d(viewGroup);
                    ((ViewGroupOverlay) dVar.f2170b).add(view4);
                    animator = J(viewGroup, view4, oVar, oVar2);
                    if (animator == null) {
                        ((ViewGroupOverlay) dVar.f2170b).remove(view4);
                    } else {
                        animator.addListener(new v(this, dVar, view4));
                    }
                } else if (view5 != null) {
                    int visibility = view5.getVisibility();
                    r.c(view5, 0);
                    animator = J(viewGroup, view5, oVar, oVar2);
                    if (animator != null) {
                        a aVar = new a(view5, i2, true);
                        animator.addListener(aVar);
                        animator.addPauseListener(aVar);
                        a(aVar);
                    } else {
                        r.c(view5, visibility);
                    }
                }
            }
        }
        return animator;
    }

    @Override // r0.g
    public String[] p() {
        return f2646y;
    }

    @Override // r0.g
    public boolean r(o oVar, o oVar2) {
        if (oVar == null && oVar2 == null) {
            return false;
        }
        if (oVar == null || oVar2 == null || oVar2.f2627a.containsKey("android:visibility:visibility") == oVar.f2627a.containsKey("android:visibility:visibility")) {
            b I = I(oVar, oVar2);
            if (I.f2654a) {
                return I.f2656c == 0 || I.f2657d == 0;
            }
            return false;
        }
        return false;
    }
}