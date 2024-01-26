package e0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f1623a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f1624b;

    /* renamed from: c  reason: collision with root package name */
    public final View f1625c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1626d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f1627e;

    public g(View view) {
        this.f1625c = view;
    }

    public boolean a(float f2, float f3, boolean z2) {
        ViewParent f4;
        if (!this.f1626d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return f4.onNestedFling(this.f1625c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent f4;
        if (!this.f1626d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return f4.onNestedPreFling(this.f1625c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent f2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.f1626d || (f2 = f(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1625c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.f1627e == null) {
                this.f1627e = new int[2];
            }
            iArr3 = this.f1627e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f1625c;
        if (f2 instanceof h) {
            ((h) f2).n(view, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                f2.onNestedPreScroll(view, i2, i3, iArr3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            this.f1625c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public boolean d(int i2, int i3, int i4, int i5, int[] iArr) {
        return e(i2, i3, i4, i5, iArr, 0, null);
    }

    public final boolean e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent f2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.f1626d || (f2 = f(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1625c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.f1627e == null) {
                this.f1627e = new int[2];
            }
            int[] iArr4 = this.f1627e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f1625c;
        if (f2 instanceof i) {
            ((i) f2).k(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (f2 instanceof h) {
                ((h) f2).l(view, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    f2.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedScroll", e2);
                }
            }
        }
        if (iArr != null) {
            this.f1625c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent f(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return null;
            }
            return this.f1624b;
        }
        return this.f1623a;
    }

    public boolean g(int i2) {
        return f(i2) != null;
    }

    public boolean h(int i2, int i3) {
        boolean onStartNestedScroll;
        if (f(i3) != null) {
            return true;
        }
        if (this.f1626d) {
            View view = this.f1625c;
            for (ViewParent parent = this.f1625c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f1625c;
                boolean z2 = parent instanceof h;
                if (z2) {
                    onStartNestedScroll = ((h) parent).o(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i3 == 0) {
                        this.f1623a = parent;
                    } else if (i3 == 1) {
                        this.f1624b = parent;
                    }
                    View view3 = this.f1625c;
                    if (z2) {
                        ((h) parent).i(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = parent;
                }
            }
        }
        return false;
    }

    public void i(int i2) {
        ViewParent f2 = f(i2);
        if (f2 != null) {
            View view = this.f1625c;
            if (f2 instanceof h) {
                ((h) f2).m(view, i2);
            } else if (i2 == 0) {
                try {
                    f2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f1623a = null;
            } else if (i2 != 1) {
            } else {
                this.f1624b = null;
            }
        }
    }
}