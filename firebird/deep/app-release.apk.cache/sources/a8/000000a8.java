package androidx.fragment.app;

import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: q  reason: collision with root package name */
    public final e f763q;

    /* renamed from: r  reason: collision with root package name */
    public int f764r = -1;

    public a(e eVar) {
        this.f763q = eVar;
    }

    public void a(int i2) {
        if (this.f820h) {
            Interpolator interpolator = e.G;
            int size = this.f813a.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f813a.get(i3).f830b;
                if (fragment != null) {
                    fragment.f741q += i2;
                    Interpolator interpolator2 = e.G;
                }
            }
        }
    }

    public void b(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f821i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f764r);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f818f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f818f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f819g));
            }
            if (this.f814b != 0 || this.f815c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f814b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f815c));
            }
            if (this.f816d != 0 || this.f817e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f816d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f817e));
            }
            if (this.f822j != 0 || this.f823k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f822j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f823k);
            }
            if (this.f824l != 0 || this.f825m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f824l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f825m);
            }
        }
        if (this.f813a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f813a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f.a aVar = this.f813a.get(i2);
            switch (aVar.f829a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder a2 = c.f.a("cmd=");
                    a2.append(aVar.f829a);
                    str2 = a2.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f830b);
            if (z2) {
                if (aVar.f831c != 0 || aVar.f832d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f831c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f832d));
                }
                if (aVar.f833e != 0 || aVar.f834f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f833e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f834f));
                }
            }
        }
    }

    public void c() {
        int size = this.f813a.size();
        for (int i2 = 0; i2 < size; i2++) {
            f.a aVar = this.f813a.get(i2);
            Fragment fragment = aVar.f830b;
            if (fragment != null) {
                int i3 = this.f818f;
                int i4 = this.f819g;
                if (fragment.H != null || i3 != 0 || i4 != 0) {
                    fragment.e();
                    Fragment.a aVar2 = fragment.H;
                    aVar2.f756e = i3;
                    aVar2.f757f = i4;
                }
            }
            switch (aVar.f829a) {
                case 1:
                    fragment.G(aVar.f831c);
                    this.f763q.c(fragment, false);
                    break;
                case 2:
                default:
                    StringBuilder a2 = c.f.a("Unknown cmd: ");
                    a2.append(aVar.f829a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.G(aVar.f832d);
                    this.f763q.Y(fragment);
                    break;
                case 4:
                    fragment.G(aVar.f832d);
                    Objects.requireNonNull(this.f763q);
                    if (!fragment.f749y) {
                        fragment.f749y = true;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 5:
                    fragment.G(aVar.f831c);
                    Objects.requireNonNull(this.f763q);
                    if (fragment.f749y) {
                        fragment.f749y = false;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 6:
                    fragment.G(aVar.f832d);
                    this.f763q.h(fragment);
                    break;
                case 7:
                    fragment.G(aVar.f831c);
                    this.f763q.e(fragment);
                    break;
                case 8:
                    this.f763q.d0(fragment);
                    break;
                case 9:
                    this.f763q.d0(null);
                    break;
                case 10:
                    this.f763q.c0(fragment, aVar.f836h);
                    break;
            }
            if (!this.f828p && aVar.f829a != 1 && fragment != null) {
                this.f763q.U(fragment);
            }
        }
        if (this.f828p) {
            return;
        }
        e eVar = this.f763q;
        eVar.V(eVar.f794o, true);
    }

    public void d(boolean z2) {
        for (int size = this.f813a.size() - 1; size >= 0; size--) {
            f.a aVar = this.f813a.get(size);
            Fragment fragment = aVar.f830b;
            if (fragment != null) {
                int i2 = this.f818f;
                Interpolator interpolator = e.G;
                int i3 = i2 != 4097 ? i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099 : 8194;
                int i4 = this.f819g;
                if (fragment.H != null || i3 != 0 || i4 != 0) {
                    fragment.e();
                    Fragment.a aVar2 = fragment.H;
                    aVar2.f756e = i3;
                    aVar2.f757f = i4;
                }
            }
            switch (aVar.f829a) {
                case 1:
                    fragment.G(aVar.f834f);
                    this.f763q.Y(fragment);
                    break;
                case 2:
                default:
                    StringBuilder a2 = c.f.a("Unknown cmd: ");
                    a2.append(aVar.f829a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.G(aVar.f833e);
                    this.f763q.c(fragment, false);
                    break;
                case 4:
                    fragment.G(aVar.f833e);
                    Objects.requireNonNull(this.f763q);
                    if (fragment.f749y) {
                        fragment.f749y = false;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 5:
                    fragment.G(aVar.f834f);
                    Objects.requireNonNull(this.f763q);
                    if (!fragment.f749y) {
                        fragment.f749y = true;
                        fragment.J = !fragment.J;
                        break;
                    }
                    break;
                case 6:
                    fragment.G(aVar.f833e);
                    this.f763q.e(fragment);
                    break;
                case 7:
                    fragment.G(aVar.f834f);
                    this.f763q.h(fragment);
                    break;
                case 8:
                    this.f763q.d0(null);
                    break;
                case 9:
                    this.f763q.d0(fragment);
                    break;
                case 10:
                    this.f763q.c0(fragment, aVar.f835g);
                    break;
            }
            if (!this.f828p && aVar.f829a != 3 && fragment != null) {
                this.f763q.U(fragment);
            }
        }
        if (this.f828p || !z2) {
            return;
        }
        e eVar = this.f763q;
        eVar.V(eVar.f794o, true);
    }

    public boolean e(int i2) {
        int size = this.f813a.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f813a.get(i3).f830b;
            int i4 = fragment != null ? fragment.f747w : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean f(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f813a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f813a.get(i5).f830b;
            int i6 = fragment != null ? fragment.f747w : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f813a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = aVar.f813a.get(i8).f830b;
                        if ((fragment2 != null ? fragment2.f747w : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f764r >= 0) {
            sb.append(" #");
            sb.append(this.f764r);
        }
        if (this.f821i != null) {
            sb.append(" ");
            sb.append(this.f821i);
        }
        sb.append("}");
        return sb.toString();
    }
}