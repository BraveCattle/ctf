package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.lifecycle.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.g;
import m0.j;
import m0.k;
import m0.l;

/* loaded from: classes.dex */
public final class e extends androidx.fragment.app.d implements LayoutInflater.Factory2 {
    public static final Interpolator G = new DecelerateInterpolator(2.5f);
    public static final Interpolator H = new DecelerateInterpolator(1.5f);
    public ArrayList<Fragment> A;
    public ArrayList<f> D;
    public k0.g E;

    /* renamed from: d  reason: collision with root package name */
    public boolean f783d;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f787h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<Fragment> f788i;

    /* renamed from: j  reason: collision with root package name */
    public OnBackPressedDispatcher f789j;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f791l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<Integer> f792m;

    /* renamed from: p  reason: collision with root package name */
    public k0.e f795p;

    /* renamed from: q  reason: collision with root package name */
    public k0.c f796q;

    /* renamed from: r  reason: collision with root package name */
    public Fragment f797r;

    /* renamed from: s  reason: collision with root package name */
    public Fragment f798s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f799t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f800u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f801v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f802w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f803x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<androidx.fragment.app.a> f804y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayList<Boolean> f805z;

    /* renamed from: e  reason: collision with root package name */
    public int f784e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<Fragment> f785f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap<String, Fragment> f786g = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    public final a.b f790k = new a(false);

    /* renamed from: n  reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f793n = new CopyOnWriteArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public int f794o = 0;
    public Bundle B = null;
    public SparseArray<Parcelable> C = null;
    public Runnable F = new b();

    /* loaded from: classes.dex */
    public class a extends a.b {
        public a(boolean z2) {
            super(z2);
        }

        @Override // a.b
        public void a() {
            e eVar = e.this;
            eVar.K();
            if (eVar.f790k.f0a) {
                eVar.a();
            } else {
                eVar.f789j.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.K();
        }
    }

    /* loaded from: classes.dex */
    public class c extends androidx.fragment.app.c {
        public c() {
        }

        @Override // androidx.fragment.app.c
        public Fragment a(ClassLoader classLoader, String str) {
            k0.e eVar = e.this.f795p;
            Context context = eVar.f2172c;
            Objects.requireNonNull(eVar);
            Object obj = Fragment.R;
            try {
                return androidx.fragment.app.c.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (InstantiationException e3) {
                throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
            } catch (NoSuchMethodException e4) {
                throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
            } catch (InvocationTargetException e5) {
                throw new Fragment.b(x.c.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
    }

    /* renamed from: androidx.fragment.app.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0005e {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f809a = {16842755, 16842960, 16842961};
    }

    /* loaded from: classes.dex */
    public static class f implements Fragment.c {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f810a;

        /* renamed from: b  reason: collision with root package name */
        public final androidx.fragment.app.a f811b;

        /* renamed from: c  reason: collision with root package name */
        public int f812c;

        public void a() {
            boolean z2 = this.f812c > 0;
            e eVar = this.f811b.f763q;
            int size = eVar.f785f.size();
            for (int i2 = 0; i2 < size; i2++) {
                eVar.f785f.get(i2).H(null);
            }
            androidx.fragment.app.a aVar = this.f811b;
            aVar.f763q.g(aVar, this.f810a, !z2, true);
        }
    }

    public void A(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.A(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void B(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.B(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public boolean C(MenuItem menuItem) {
        if (this.f794o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                if (!fragment.f749y && fragment.f744t.C(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void D(Menu menu) {
        if (this.f794o < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null && !fragment.f749y) {
                fragment.f744t.D(menu);
            }
        }
    }

    public final void E(Fragment fragment) {
        if (fragment == null || this.f786g.get(fragment.f729e) != fragment) {
            return;
        }
        boolean R = fragment.f742r.R(fragment);
        Boolean bool = fragment.f734j;
        if (bool == null || bool.booleanValue() != R) {
            fragment.f734j = Boolean.valueOf(R);
            e eVar = fragment.f744t;
            eVar.g0();
            eVar.E(eVar.f798s);
        }
    }

    public void F(boolean z2) {
        int size = this.f785f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f785f.get(size);
            if (fragment != null) {
                fragment.f744t.F(z2);
            }
        }
    }

    public boolean G(Menu menu) {
        if (this.f794o < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null && fragment.A(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public final void H(int i2) {
        try {
            this.f783d = true;
            V(i2, false);
            this.f783d = false;
            K();
        } catch (Throwable th) {
            this.f783d = false;
            throw th;
        }
    }

    public void I(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        String a2 = f.f.a(str, "    ");
        if (!this.f786g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.f786g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(a2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.f746v));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.f747w));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.f748x);
                    printWriter.print(a2);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f726b);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f729e);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.f741q);
                    printWriter.print(a2);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.f735k);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.f736l);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.f737m);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.f738n);
                    printWriter.print(a2);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.f749y);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.f750z);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.B);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(a2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.A);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.G);
                    if (fragment.f742r != null) {
                        printWriter.print(a2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.f742r);
                    }
                    if (fragment.f743s != null) {
                        printWriter.print(a2);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.f743s);
                    }
                    if (fragment.f745u != null) {
                        printWriter.print(a2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.f745u);
                    }
                    if (fragment.f730f != null) {
                        printWriter.print(a2);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.f730f);
                    }
                    if (fragment.f727c != null) {
                        printWriter.print(a2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f727c);
                    }
                    if (fragment.f728d != null) {
                        printWriter.print(a2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.f728d);
                    }
                    Object obj = fragment.f731g;
                    if (obj == null) {
                        e eVar = fragment.f742r;
                        obj = (eVar == null || (str2 = fragment.f732h) == null) ? null : (Fragment) eVar.f786g.get(str2);
                    }
                    if (obj != null) {
                        printWriter.print(a2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.f733i);
                    }
                    if (fragment.m() != 0) {
                        printWriter.print(a2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.m());
                    }
                    if (fragment.D != null) {
                        printWriter.print(a2);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.D);
                    }
                    if (fragment.E != null) {
                        printWriter.print(a2);
                        printWriter.print("mInnerView=");
                        printWriter.println((Object) null);
                    }
                    if (fragment.g() != null) {
                        printWriter.print(a2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.g());
                        printWriter.print(a2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.t());
                    }
                    k0.e eVar2 = fragment.f743s;
                    if ((eVar2 != null ? eVar2.f2172c : null) != null) {
                        n0.a.b(fragment).a(a2, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(a2);
                    printWriter.println("Child " + fragment.f744t + ":");
                    fragment.f744t.I(f.f.a(a2, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size4 = this.f785f.size();
        if (size4 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size4; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(this.f785f.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f788i;
        if (arrayList != null && (size3 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size3; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f788i.get(i3).toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f787h;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size2; i4++) {
                androidx.fragment.app.a aVar = this.f787h.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.b(a2, printWriter, true);
            }
        }
        synchronized (this) {
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f791l;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i5 = 0; i5 < size; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println((androidx.fragment.app.a) this.f791l.get(i5));
                }
            }
            ArrayList<Integer> arrayList4 = this.f792m;
            if (arrayList4 != null && arrayList4.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f792m.toArray()));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f795p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f796q);
        if (this.f797r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f797r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f794o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f800u);
        printWriter.print(" mStopped=");
        printWriter.print(this.f801v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f802w);
        if (this.f799t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f799t);
        }
    }

    public final void J(boolean z2) {
        if (this.f783d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f795p == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f795p.f2173d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f804y == null) {
            this.f804y = new ArrayList<>();
            this.f805z = new ArrayList<>();
        }
        this.f783d = true;
        try {
            M(null, null);
        } finally {
            this.f783d = false;
        }
    }

    public boolean K() {
        J(true);
        synchronized (this) {
        }
        g0();
        if (this.f803x) {
            this.f803x = false;
            e0();
        }
        this.f786g.values().removeAll(Collections.singleton(null));
        return false;
    }

    public final void L(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i2).f828p;
        ArrayList<Fragment> arrayList4 = this.A;
        if (arrayList4 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.A.addAll(this.f785f);
        Fragment fragment = this.f798s;
        int i8 = i2;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 >= i3) {
                this.A.clear();
                if (!z2) {
                    i.o(this, arrayList, arrayList2, i2, i3, false);
                }
                int i10 = i2;
                while (i10 < i3) {
                    androidx.fragment.app.a aVar = arrayList.get(i10);
                    if (arrayList2.get(i10).booleanValue()) {
                        aVar.a(-1);
                        aVar.d(i10 == i3 + (-1));
                    } else {
                        aVar.a(1);
                        aVar.c();
                    }
                    i10++;
                }
                if (z2) {
                    l.c<Fragment> cVar = new l.c<>();
                    b(cVar);
                    i4 = i2;
                    for (int i11 = i3 - 1; i11 >= i4; i11--) {
                        androidx.fragment.app.a aVar2 = arrayList.get(i11);
                        arrayList2.get(i11).booleanValue();
                        for (int i12 = 0; i12 < aVar2.f813a.size(); i12++) {
                            Fragment fragment2 = aVar2.f813a.get(i12).f830b;
                        }
                    }
                    int i13 = cVar.f2242c;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Fragment fragment3 = (Fragment) cVar.f2241b[i14];
                        if (!fragment3.f735k) {
                            View B = fragment3.B();
                            fragment3.K = B.getAlpha();
                            B.setAlpha(0.0f);
                        }
                    }
                } else {
                    i4 = i2;
                }
                if (i3 != i4 && z2) {
                    i.o(this, arrayList, arrayList2, i2, i3, true);
                    V(this.f794o, true);
                }
                while (i4 < i3) {
                    androidx.fragment.app.a aVar3 = arrayList.get(i4);
                    if (arrayList2.get(i4).booleanValue() && (i5 = aVar3.f764r) >= 0) {
                        synchronized (this) {
                            this.f791l.set(i5, null);
                            if (this.f792m == null) {
                                this.f792m = new ArrayList<>();
                            }
                            this.f792m.add(Integer.valueOf(i5));
                        }
                        aVar3.f764r = -1;
                    }
                    Objects.requireNonNull(aVar3);
                    i4++;
                }
                return;
            }
            androidx.fragment.app.a aVar4 = arrayList.get(i8);
            int i15 = 3;
            if (!arrayList3.get(i8).booleanValue()) {
                ArrayList<Fragment> arrayList5 = this.A;
                int i16 = 0;
                while (i16 < aVar4.f813a.size()) {
                    f.a aVar5 = aVar4.f813a.get(i16);
                    int i17 = aVar5.f829a;
                    if (i17 != i9) {
                        if (i17 == 2) {
                            Fragment fragment4 = aVar5.f830b;
                            int i18 = fragment4.f747w;
                            int size = arrayList5.size() - 1;
                            boolean z4 = false;
                            while (size >= 0) {
                                Fragment fragment5 = arrayList5.get(size);
                                if (fragment5.f747w != i18) {
                                    i7 = i18;
                                } else if (fragment5 == fragment4) {
                                    i7 = i18;
                                    z4 = true;
                                } else {
                                    if (fragment5 == fragment) {
                                        i7 = i18;
                                        aVar4.f813a.add(i16, new f.a(9, fragment5));
                                        i16++;
                                        fragment = null;
                                    } else {
                                        i7 = i18;
                                    }
                                    f.a aVar6 = new f.a(3, fragment5);
                                    aVar6.f831c = aVar5.f831c;
                                    aVar6.f833e = aVar5.f833e;
                                    aVar6.f832d = aVar5.f832d;
                                    aVar6.f834f = aVar5.f834f;
                                    aVar4.f813a.add(i16, aVar6);
                                    arrayList5.remove(fragment5);
                                    i16++;
                                }
                                size--;
                                i18 = i7;
                            }
                            if (z4) {
                                aVar4.f813a.remove(i16);
                                i16--;
                            } else {
                                i6 = 1;
                                aVar5.f829a = 1;
                                arrayList5.add(fragment4);
                                i16 += i6;
                                i9 = i6;
                                i15 = 3;
                            }
                        } else if (i17 == i15 || i17 == 6) {
                            arrayList5.remove(aVar5.f830b);
                            Fragment fragment6 = aVar5.f830b;
                            if (fragment6 == fragment) {
                                aVar4.f813a.add(i16, new f.a(9, fragment6));
                                i16++;
                                fragment = null;
                            }
                        } else if (i17 == 7) {
                            i6 = 1;
                        } else if (i17 == 8) {
                            aVar4.f813a.add(i16, new f.a(9, fragment));
                            i16++;
                            fragment = aVar5.f830b;
                        }
                        i6 = 1;
                        i16 += i6;
                        i9 = i6;
                        i15 = 3;
                    } else {
                        i6 = i9;
                    }
                    arrayList5.add(aVar5.f830b);
                    i16 += i6;
                    i9 = i6;
                    i15 = 3;
                }
            } else {
                int i19 = 1;
                ArrayList<Fragment> arrayList6 = this.A;
                int size2 = aVar4.f813a.size() - 1;
                while (size2 >= 0) {
                    f.a aVar7 = aVar4.f813a.get(size2);
                    int i20 = aVar7.f829a;
                    if (i20 != i19) {
                        if (i20 != 3) {
                            switch (i20) {
                                case 8:
                                    fragment = null;
                                    break;
                                case 9:
                                    fragment = aVar7.f830b;
                                    break;
                                case 10:
                                    aVar7.f836h = aVar7.f835g;
                                    break;
                            }
                            size2--;
                            i19 = 1;
                        }
                        arrayList6.add(aVar7.f830b);
                        size2--;
                        i19 = 1;
                    }
                    arrayList6.remove(aVar7.f830b);
                    size2--;
                    i19 = 1;
                }
            }
            z3 = z3 || aVar4.f820h;
            i8++;
            arrayList3 = arrayList2;
        }
    }

    public final void M(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<f> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            f fVar = this.D.get(i2);
            if (arrayList == null || fVar.f810a || (indexOf2 = arrayList.indexOf(fVar.f811b)) == -1 || !arrayList2.get(indexOf2).booleanValue()) {
                if ((fVar.f812c == 0) || (arrayList != null && fVar.f811b.f(arrayList, 0, arrayList.size()))) {
                    this.D.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || fVar.f810a || (indexOf = arrayList.indexOf(fVar.f811b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                        fVar.a();
                    }
                }
                i2++;
            } else {
                this.D.remove(i2);
                i2--;
                size--;
            }
            androidx.fragment.app.a aVar = fVar.f811b;
            aVar.f763q.g(aVar, fVar.f810a, false, false);
            i2++;
        }
    }

    public Fragment N(int i2) {
        for (int size = this.f785f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f785f.get(size);
            if (fragment != null && fragment.f746v == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.f786g.values()) {
            if (fragment2 != null && fragment2.f746v == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public Fragment O(String str) {
        Fragment f2;
        for (Fragment fragment : this.f786g.values()) {
            if (fragment != null && (f2 = fragment.f(str)) != null) {
                return f2;
            }
        }
        return null;
    }

    public androidx.fragment.app.c P() {
        if (this.f782b == null) {
            this.f782b = androidx.fragment.app.d.f781c;
        }
        androidx.fragment.app.c cVar = this.f782b;
        androidx.fragment.app.c cVar2 = androidx.fragment.app.d.f781c;
        if (cVar == cVar2) {
            Fragment fragment = this.f797r;
            if (fragment != null) {
                return fragment.f742r.P();
            }
            this.f782b = new c();
        }
        if (this.f782b == null) {
            this.f782b = cVar2;
        }
        return this.f782b;
    }

    public final boolean Q(Fragment fragment) {
        e eVar = fragment.f744t;
        boolean z2 = false;
        for (Fragment fragment2 : eVar.f786g.values()) {
            if (fragment2 != null) {
                z2 = eVar.Q(fragment2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public boolean R(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        e eVar = fragment.f742r;
        return fragment == eVar.f798s && R(eVar.f797r);
    }

    public boolean S() {
        return this.f800u || this.f801v;
    }

    public void T(Fragment fragment) {
        if (this.f786g.get(fragment.f729e) != null) {
            return;
        }
        this.f786g.put(fragment.f729e, fragment);
    }

    public void U(Fragment fragment) {
        if (fragment != null && this.f786g.containsKey(fragment.f729e)) {
            int i2 = this.f794o;
            if (fragment.f736l) {
                i2 = fragment.v() ? Math.min(i2, 1) : Math.min(i2, 0);
            }
            W(fragment, i2, fragment.n(), fragment.o(), false);
            if (fragment.J) {
                if (fragment.f735k && Q(fragment)) {
                    this.f799t = true;
                }
                fragment.J = false;
            }
        }
    }

    public void V(int i2, boolean z2) {
        k0.e eVar;
        if (this.f795p == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f794o) {
            this.f794o = i2;
            int size = this.f785f.size();
            for (int i3 = 0; i3 < size; i3++) {
                U(this.f785f.get(i3));
            }
            for (Fragment fragment : this.f786g.values()) {
                if (fragment != null && (fragment.f736l || fragment.f750z)) {
                    if (!fragment.I) {
                        U(fragment);
                    }
                }
            }
            e0();
            if (this.f799t && (eVar = this.f795p) != null && this.f794o == 4) {
                eVar.k();
                this.f799t = false;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
        if (r0 != 3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.W(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    public void X() {
        this.f800u = false;
        this.f801v = false;
        int size = this.f785f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                fragment.f744t.X();
            }
        }
    }

    public void Y(Fragment fragment) {
        boolean z2 = !fragment.v();
        if (!fragment.f750z || z2) {
            synchronized (this.f785f) {
                this.f785f.remove(fragment);
            }
            if (Q(fragment)) {
                this.f799t = true;
            }
            fragment.f735k = false;
            fragment.f736l = true;
        }
    }

    public final void Z(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        M(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f828p) {
                if (i3 != i2) {
                    L(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f828p) {
                        i3++;
                    }
                }
                L(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            L(arrayList, arrayList2, i3, size);
        }
    }

    @Override // androidx.fragment.app.d
    public boolean a() {
        boolean z2;
        int size;
        if (!S()) {
            K();
            J(true);
            Fragment fragment = this.f798s;
            if (fragment == null || !fragment.i().a()) {
                ArrayList<androidx.fragment.app.a> arrayList = this.f804y;
                ArrayList<Boolean> arrayList2 = this.f805z;
                ArrayList<androidx.fragment.app.a> arrayList3 = this.f787h;
                if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
                    arrayList.add(this.f787h.remove(size));
                    arrayList2.add(Boolean.TRUE);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.f783d = true;
                    try {
                        Z(this.f804y, this.f805z);
                    } finally {
                        f();
                    }
                }
                g0();
                if (this.f803x) {
                    this.f803x = false;
                    e0();
                }
                this.f786g.values().removeAll(Collections.singleton(null));
                return z2;
            }
            return true;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void a0(Parcelable parcelable) {
        Fragment fragment;
        Bundle bundle;
        k0.h hVar;
        if (parcelable == null) {
            return;
        }
        k0.f fVar = (k0.f) parcelable;
        if (fVar.f2176a == null) {
            return;
        }
        for (Fragment fragment2 : this.E.f2182b) {
            Iterator<k0.h> it = fVar.f2176a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hVar = null;
                    break;
                }
                hVar = it.next();
                if (hVar.f2188b.equals(fragment2.f729e)) {
                    break;
                }
            }
            if (hVar == null) {
                W(fragment2, 1, 0, 0, false);
                fragment2.f736l = true;
                W(fragment2, 0, 0, 0, false);
            } else {
                hVar.f2200n = fragment2;
                fragment2.f728d = null;
                fragment2.f741q = 0;
                fragment2.f738n = false;
                fragment2.f735k = false;
                Fragment fragment3 = fragment2.f731g;
                fragment2.f732h = fragment3 != null ? fragment3.f729e : null;
                fragment2.f731g = null;
                Bundle bundle2 = hVar.f2199m;
                if (bundle2 != null) {
                    bundle2.setClassLoader(this.f795p.f2172c.getClassLoader());
                    fragment2.f728d = hVar.f2199m.getSparseParcelableArray("android:view_state");
                    fragment2.f727c = hVar.f2199m;
                }
            }
        }
        this.f786g.clear();
        Iterator<k0.h> it2 = fVar.f2176a.iterator();
        while (it2.hasNext()) {
            k0.h next = it2.next();
            if (next != null) {
                ClassLoader classLoader = this.f795p.f2172c.getClassLoader();
                androidx.fragment.app.c P = P();
                if (next.f2200n == null) {
                    Bundle bundle3 = next.f2196j;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                    }
                    Fragment a2 = P.a(classLoader, next.f2187a);
                    next.f2200n = a2;
                    a2.E(next.f2196j);
                    Bundle bundle4 = next.f2199m;
                    if (bundle4 != null) {
                        bundle4.setClassLoader(classLoader);
                        fragment = next.f2200n;
                        bundle = next.f2199m;
                    } else {
                        fragment = next.f2200n;
                        bundle = new Bundle();
                    }
                    fragment.f727c = bundle;
                    Fragment fragment4 = next.f2200n;
                    fragment4.f729e = next.f2188b;
                    fragment4.f737m = next.f2189c;
                    fragment4.f739o = true;
                    fragment4.f746v = next.f2190d;
                    fragment4.f747w = next.f2191e;
                    fragment4.f748x = next.f2192f;
                    fragment4.A = next.f2193g;
                    fragment4.f736l = next.f2194h;
                    fragment4.f750z = next.f2195i;
                    fragment4.f749y = next.f2197k;
                    fragment4.M = c.b.values()[next.f2198l];
                }
                Fragment fragment5 = next.f2200n;
                fragment5.f742r = this;
                this.f786g.put(fragment5.f729e, fragment5);
                next.f2200n = null;
            }
        }
        this.f785f.clear();
        ArrayList<String> arrayList = fVar.f2177b;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment6 = this.f786g.get(next2);
                if (fragment6 == null) {
                    f0(new IllegalStateException(x.c.a("No instantiated fragment for (", next2, ")")));
                    throw null;
                }
                fragment6.f735k = true;
                if (this.f785f.contains(fragment6)) {
                    throw new IllegalStateException("Already added " + fragment6);
                }
                synchronized (this.f785f) {
                    this.f785f.add(fragment6);
                }
            }
        }
        if (fVar.f2178c != null) {
            this.f787h = new ArrayList<>(fVar.f2178c.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = fVar.f2178c;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.b bVar = bVarArr[i2];
                Objects.requireNonNull(bVar);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = bVar.f765a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    f.a aVar2 = new f.a();
                    int i5 = i3 + 1;
                    aVar2.f829a = iArr[i3];
                    String str = bVar.f766b.get(i4);
                    aVar2.f830b = str != null ? this.f786g.get(str) : null;
                    aVar2.f835g = c.b.values()[bVar.f767c[i4]];
                    aVar2.f836h = c.b.values()[bVar.f768d[i4]];
                    int[] iArr2 = bVar.f765a;
                    int i6 = i5 + 1;
                    int i7 = iArr2[i5];
                    aVar2.f831c = i7;
                    int i8 = i6 + 1;
                    int i9 = iArr2[i6];
                    aVar2.f832d = i9;
                    int i10 = i8 + 1;
                    int i11 = iArr2[i8];
                    aVar2.f833e = i11;
                    int i12 = iArr2[i10];
                    aVar2.f834f = i12;
                    aVar.f814b = i7;
                    aVar.f815c = i9;
                    aVar.f816d = i11;
                    aVar.f817e = i12;
                    aVar.f813a.add(aVar2);
                    aVar2.f831c = aVar.f814b;
                    aVar2.f832d = aVar.f815c;
                    aVar2.f833e = aVar.f816d;
                    aVar2.f834f = aVar.f817e;
                    i4++;
                    i3 = i10 + 1;
                }
                aVar.f818f = bVar.f769e;
                aVar.f819g = bVar.f770f;
                aVar.f821i = bVar.f771g;
                aVar.f764r = bVar.f772h;
                aVar.f820h = true;
                aVar.f822j = bVar.f773i;
                aVar.f823k = bVar.f774j;
                aVar.f824l = bVar.f775k;
                aVar.f825m = bVar.f776l;
                aVar.f826n = bVar.f777m;
                aVar.f827o = bVar.f778n;
                aVar.f828p = bVar.f779o;
                aVar.a(1);
                this.f787h.add(aVar);
                int i13 = aVar.f764r;
                if (i13 >= 0) {
                    synchronized (this) {
                        if (this.f791l == null) {
                            this.f791l = new ArrayList<>();
                        }
                        int size = this.f791l.size();
                        if (i13 < size) {
                            this.f791l.set(i13, aVar);
                        } else {
                            while (size < i13) {
                                this.f791l.add(null);
                                if (this.f792m == null) {
                                    this.f792m = new ArrayList<>();
                                }
                                this.f792m.add(Integer.valueOf(size));
                                size++;
                            }
                            this.f791l.add(aVar);
                        }
                    }
                }
                i2++;
            }
        } else {
            this.f787h = null;
        }
        String str2 = fVar.f2179d;
        if (str2 != null) {
            Fragment fragment7 = this.f786g.get(str2);
            this.f798s = fragment7;
            E(fragment7);
        }
        this.f784e = fVar.f2180e;
    }

    public final void b(l.c<Fragment> cVar) {
        int i2 = this.f794o;
        if (i2 < 1) {
            return;
        }
        int min = Math.min(i2, 3);
        int size = this.f785f.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f785f.get(i3);
            if (fragment.f726b < min) {
                W(fragment, min, fragment.m(), fragment.n(), false);
            }
        }
    }

    public Parcelable b0() {
        androidx.fragment.app.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).a();
            }
        }
        Iterator<Fragment> it = this.f786g.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.g() != null) {
                    int t2 = next.t();
                    View g2 = next.g();
                    Animation animation = g2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g2.clearAnimation();
                    }
                    next.C(null);
                    W(next, t2, 0, 0, false);
                } else if (next.h() != null) {
                    next.h().end();
                }
            }
        }
        K();
        this.f800u = true;
        if (this.f786g.isEmpty()) {
            return null;
        }
        ArrayList<k0.h> arrayList2 = new ArrayList<>(this.f786g.size());
        boolean z2 = false;
        for (Fragment fragment : this.f786g.values()) {
            if (fragment != null) {
                if (fragment.f742r != this) {
                    f0(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
                k0.h hVar = new k0.h(fragment);
                arrayList2.add(hVar);
                if (fragment.f726b <= 0 || hVar.f2199m != null) {
                    hVar.f2199m = fragment.f727c;
                } else {
                    if (this.B == null) {
                        this.B = new Bundle();
                    }
                    Bundle bundle2 = this.B;
                    fragment.Q.b(bundle2);
                    Parcelable b02 = fragment.f744t.b0();
                    if (b02 != null) {
                        bundle2.putParcelable("android:support:fragments", b02);
                    }
                    y(fragment, this.B, false);
                    if (this.B.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = this.B;
                        this.B = null;
                    }
                    if (fragment.f728d != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", fragment.f728d);
                    }
                    if (!fragment.G) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", fragment.G);
                    }
                    hVar.f2199m = bundle;
                    String str = fragment.f732h;
                    if (str != null) {
                        Fragment fragment2 = this.f786g.get(str);
                        if (fragment2 != null) {
                            if (hVar.f2199m == null) {
                                hVar.f2199m = new Bundle();
                            }
                            Bundle bundle3 = hVar.f2199m;
                            if (fragment2.f742r == this) {
                                bundle3.putString("android:target_state", fragment2.f729e);
                                int i2 = fragment.f733i;
                                if (i2 != 0) {
                                    hVar.f2199m.putInt("android:target_req_state", i2);
                                }
                            } else {
                                f0(new IllegalStateException("Fragment " + fragment2 + " is not currently in the FragmentManager"));
                                throw null;
                            }
                        } else {
                            f0(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.f732h));
                            throw null;
                        }
                    }
                }
                z2 = true;
            }
        }
        if (z2) {
            int size2 = this.f785f.size();
            if (size2 > 0) {
                arrayList = new ArrayList<>(size2);
                Iterator<Fragment> it2 = this.f785f.iterator();
                while (it2.hasNext()) {
                    Fragment next2 = it2.next();
                    arrayList.add(next2.f729e);
                    if (next2.f742r != this) {
                        f0(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                        throw null;
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList<androidx.fragment.app.a> arrayList3 = this.f787h;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                bVarArr = new androidx.fragment.app.b[size];
                for (int i3 = 0; i3 < size; i3++) {
                    bVarArr[i3] = new androidx.fragment.app.b(this.f787h.get(i3));
                }
            }
            k0.f fVar = new k0.f();
            fVar.f2176a = arrayList2;
            fVar.f2177b = arrayList;
            fVar.f2178c = bVarArr;
            Fragment fragment3 = this.f798s;
            if (fragment3 != null) {
                fVar.f2179d = fragment3.f729e;
            }
            fVar.f2180e = this.f784e;
            return fVar;
        }
        return null;
    }

    public void c(Fragment fragment, boolean z2) {
        T(fragment);
        if (fragment.f750z) {
            return;
        }
        if (this.f785f.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f785f) {
            this.f785f.add(fragment);
        }
        fragment.f735k = true;
        fragment.f736l = false;
        fragment.J = false;
        if (Q(fragment)) {
            this.f799t = true;
        }
        if (z2) {
            W(fragment, this.f794o, 0, 0, false);
        }
    }

    public void c0(Fragment fragment, c.b bVar) {
        if (this.f786g.get(fragment.f729e) == fragment && (fragment.f743s == null || fragment.f742r == this)) {
            fragment.M = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d(k0.e eVar, k0.c cVar, Fragment fragment) {
        if (this.f795p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f795p = eVar;
        this.f796q = cVar;
        this.f797r = fragment;
        if (fragment != null) {
            g0();
        }
        if (eVar instanceof a.c) {
            a.c cVar2 = (a.c) eVar;
            OnBackPressedDispatcher b2 = cVar2.b();
            this.f789j = b2;
            Fragment fragment2 = cVar2;
            if (fragment != null) {
                fragment2 = fragment;
            }
            a.b bVar = this.f790k;
            Objects.requireNonNull(b2);
            androidx.lifecycle.c a2 = fragment2.a();
            if (((androidx.lifecycle.e) a2).f901b != c.b.DESTROYED) {
                bVar.f1b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(a2, bVar));
            }
        }
        if (fragment != null) {
            k0.g gVar = fragment.f742r.E;
            k0.g gVar2 = gVar.f2183c.get(fragment.f729e);
            if (gVar2 == null) {
                gVar2 = new k0.g(gVar.f2185e);
                gVar.f2183c.put(fragment.f729e, gVar2);
            }
            this.E = gVar2;
        } else if (eVar instanceof l) {
            k d2 = ((l) eVar).d();
            m0.i iVar = k0.g.f2181g;
            String canonicalName = k0.g.class.getCanonicalName();
            if (canonicalName != null) {
                String a3 = f.f.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                m0.h hVar = d2.f2295a.get(a3);
                if (!k0.g.class.isInstance(hVar)) {
                    hVar = iVar instanceof j ? ((j) iVar).a(a3, k0.g.class) : ((g.a) iVar).a(k0.g.class);
                    m0.h put = d2.f2295a.put(a3, hVar);
                    if (put != null) {
                        put.a();
                    }
                }
                this.E = (k0.g) hVar;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else {
            this.E = new k0.g(false);
        }
    }

    public void d0(Fragment fragment) {
        if (fragment == null || (this.f786g.get(fragment.f729e) == fragment && (fragment.f743s == null || fragment.f742r == this))) {
            Fragment fragment2 = this.f798s;
            this.f798s = fragment;
            E(fragment2);
            E(this.f798s);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void e(Fragment fragment) {
        if (fragment.f750z) {
            fragment.f750z = false;
            if (fragment.f735k) {
                return;
            }
            if (this.f785f.contains(fragment)) {
                throw new IllegalStateException("Fragment already added: " + fragment);
            }
            synchronized (this.f785f) {
                this.f785f.add(fragment);
            }
            fragment.f735k = true;
            if (Q(fragment)) {
                this.f799t = true;
            }
        }
    }

    public void e0() {
        for (Fragment fragment : this.f786g.values()) {
            if (fragment != null && fragment.F) {
                if (this.f783d) {
                    this.f803x = true;
                } else {
                    fragment.F = false;
                    W(fragment, this.f794o, 0, 0, false);
                }
            }
        }
    }

    public final void f() {
        this.f783d = false;
        this.f805z.clear();
        this.f804y.clear();
    }

    public final void f0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new d0.a("FragmentManager"));
        k0.e eVar = this.f795p;
        try {
            if (eVar != null) {
                eVar.h("  ", null, printWriter, new String[0]);
            } else {
                I("  ", null, printWriter, new String[0]);
            }
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
        }
        throw runtimeException;
    }

    public void g(androidx.fragment.app.a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.d(z4);
        } else {
            aVar.c();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            i.o(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            V(this.f794o, true);
        }
        for (Fragment fragment : this.f786g.values()) {
        }
    }

    public final void g0() {
        a.b bVar = this.f790k;
        ArrayList<androidx.fragment.app.a> arrayList = this.f787h;
        boolean z2 = false;
        if ((arrayList != null ? arrayList.size() : 0) > 0 && R(this.f797r)) {
            z2 = true;
        }
        bVar.f0a = z2;
    }

    public void h(Fragment fragment) {
        if (fragment.f750z) {
            return;
        }
        fragment.f750z = true;
        if (fragment.f735k) {
            synchronized (this.f785f) {
                this.f785f.remove(fragment);
            }
            if (Q(fragment)) {
                this.f799t = true;
            }
            fragment.f735k = false;
        }
    }

    public void i(Configuration configuration) {
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                fragment.C = true;
                fragment.f744t.i(configuration);
            }
        }
    }

    public boolean j(MenuItem menuItem) {
        if (this.f794o < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                if (!fragment.f749y && fragment.f744t.j(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void k() {
        this.f800u = false;
        this.f801v = false;
        H(1);
    }

    public boolean l(Menu menu, MenuInflater menuInflater) {
        if (this.f794o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                if (!fragment.f749y ? fragment.f744t.l(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z2 = true;
                }
            }
        }
        if (this.f788i != null) {
            for (int i3 = 0; i3 < this.f788i.size(); i3++) {
                Fragment fragment2 = this.f788i.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    Objects.requireNonNull(fragment2);
                }
            }
        }
        this.f788i = arrayList;
        return z2;
    }

    public void m() {
        this.f802w = true;
        K();
        H(0);
        this.f795p = null;
        this.f796q = null;
        this.f797r = null;
        if (this.f789j != null) {
            Iterator<a.a> it = this.f790k.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f789j = null;
        }
    }

    public void n() {
        for (int i2 = 0; i2 < this.f785f.size(); i2++) {
            Fragment fragment = this.f785f.get(i2);
            if (fragment != null) {
                fragment.z();
            }
        }
    }

    public void o(boolean z2) {
        int size = this.f785f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f785f.get(size);
            if (fragment != null) {
                fragment.f744t.o(z2);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        Fragment next;
        Fragment fragment = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0005e.f809a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                l.h<String, Class<?>> hVar = androidx.fragment.app.c.f780a;
                try {
                    z2 = Fragment.class.isAssignableFrom(androidx.fragment.app.c.b(classLoader, attributeValue));
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment N = resourceId != -1 ? N(resourceId) : null;
                    if (N == null && string != null) {
                        int size = this.f785f.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                next = this.f785f.get(size);
                                if (next != null && string.equals(next.f748x)) {
                                    break;
                                }
                                size--;
                            } else {
                                Iterator<Fragment> it = this.f786g.values().iterator();
                                while (it.hasNext()) {
                                    next = it.next();
                                    if (next == null || !string.equals(next.f748x)) {
                                    }
                                }
                            }
                        }
                        fragment = next;
                        N = fragment;
                    }
                    if (N == null && id != -1) {
                        N = N(id);
                    }
                    if (N == null) {
                        N = P().a(context.getClassLoader(), attributeValue);
                        N.f737m = true;
                        if (resourceId == 0) {
                            resourceId = id;
                        }
                        N.f746v = resourceId;
                        N.f747w = id;
                        N.f748x = string;
                        N.f738n = true;
                        N.f742r = this;
                        k0.e eVar = this.f795p;
                        N.f743s = eVar;
                        Objects.requireNonNull(eVar);
                        N.w(attributeSet, N.f727c);
                        c(N, true);
                    } else if (N.f738n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    } else {
                        N.f738n = true;
                        k0.e eVar2 = this.f795p;
                        N.f743s = eVar2;
                        Objects.requireNonNull(eVar2);
                        N.w(attributeSet, N.f727c);
                    }
                    Fragment fragment2 = N;
                    int i2 = this.f794o;
                    if (i2 >= 1 || !fragment2.f737m) {
                        W(fragment2, i2, 0, 0, false);
                    } else {
                        W(fragment2, 1, 0, 0, false);
                    }
                    throw new IllegalStateException(x.c.a("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        onCreateView(null, str, context, attributeSet);
        return null;
    }

    public void p(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.p(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void q(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.q(fragment, context, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void r(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.r(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void s(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.s(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void t(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.t(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.f797r;
        if (obj == null) {
            obj = this.f795p;
        }
        b.a.a(obj, sb);
        sb.append("}}");
        return sb.toString();
    }

    public void u(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.u(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void v(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.v(fragment, context, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void w(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.w(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void x(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.x(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void y(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.y(fragment, bundle, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }

    public void z(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.f797r;
        if (fragment2 != null) {
            e eVar = fragment2.f742r;
            if (eVar instanceof e) {
                eVar.z(fragment, true);
            }
        }
        Iterator<d> it = this.f793n.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
            if (!z2) {
                throw null;
            }
        }
    }
}