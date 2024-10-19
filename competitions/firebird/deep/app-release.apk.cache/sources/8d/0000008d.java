package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.x64m.xsfmnative.R;
import e0.j;
import e0.k;
import e0.m;
import e0.o;
import e0.s;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements e0.h {

    /* renamed from: t  reason: collision with root package name */
    public static final String f640t;

    /* renamed from: u  reason: collision with root package name */
    public static final Class<?>[] f641u;

    /* renamed from: v  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f642v;

    /* renamed from: w  reason: collision with root package name */
    public static final Comparator<View> f643w;

    /* renamed from: x  reason: collision with root package name */
    public static final n.e<Rect> f644x;

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f645b;

    /* renamed from: c  reason: collision with root package name */
    public final n.c f646c;

    /* renamed from: d  reason: collision with root package name */
    public final List<View> f647d;

    /* renamed from: e  reason: collision with root package name */
    public final List<View> f648e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f649f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f650g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f651h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f652i;

    /* renamed from: j  reason: collision with root package name */
    public View f653j;

    /* renamed from: k  reason: collision with root package name */
    public View f654k;

    /* renamed from: l  reason: collision with root package name */
    public g f655l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f656m;

    /* renamed from: n  reason: collision with root package name */
    public s f657n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f658o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f659p;

    /* renamed from: q  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f660q;

    /* renamed from: r  reason: collision with root package name */
    public k f661r;

    /* renamed from: s  reason: collision with root package name */
    public final j f662s;

    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        @Override // e0.k
        public s a(View view, s sVar) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f657n, sVar)) {
                coordinatorLayout.f657n = sVar;
                boolean z2 = true;
                boolean z3 = sVar.d() > 0;
                coordinatorLayout.f658o = z3;
                coordinatorLayout.setWillNotDraw((z3 || coordinatorLayout.getBackground() != null) ? false : false);
                if (!sVar.f1647a.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        WeakHashMap<View, o> weakHashMap = m.f1633a;
                        if (childAt.getFitsSystemWindows() && ((f) childAt.getLayoutParams()).f665a != null && sVar.f1647a.h()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return sVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v2, Rect rect) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, V v2, int i2) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        }

        @Deprecated
        public void j(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5) {
        }

        public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6) {
            if (i6 == 0) {
                j(coordinatorLayout, v2, view, i2, i3, i4, i5);
            }
        }

        public boolean l(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z2) {
            return false;
        }

        public void m(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        }

        public Parcelable n(CoordinatorLayout coordinatorLayout, V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean o(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
            if (i3 == 0) {
                return o(coordinatorLayout, v2, view, view2, i2);
            }
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f660q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f660q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f665a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f666b;

        /* renamed from: c  reason: collision with root package name */
        public int f667c;

        /* renamed from: d  reason: collision with root package name */
        public int f668d;

        /* renamed from: e  reason: collision with root package name */
        public int f669e;

        /* renamed from: f  reason: collision with root package name */
        public int f670f;

        /* renamed from: g  reason: collision with root package name */
        public int f671g;

        /* renamed from: h  reason: collision with root package name */
        public int f672h;

        /* renamed from: i  reason: collision with root package name */
        public int f673i;

        /* renamed from: j  reason: collision with root package name */
        public int f674j;

        /* renamed from: k  reason: collision with root package name */
        public View f675k;

        /* renamed from: l  reason: collision with root package name */
        public View f676l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f677m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f678n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f679o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f680p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f681q;

        public f(int i2, int i3) {
            super(i2, i3);
            this.f666b = false;
            this.f667c = 0;
            this.f668d = 0;
            this.f669e = -1;
            this.f670f = -1;
            this.f671g = 0;
            this.f672h = 0;
            this.f681q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            this.f666b = false;
            this.f667c = 0;
            this.f668d = 0;
            this.f669e = -1;
            this.f670f = -1;
            this.f671g = 0;
            this.f672h = 0;
            this.f681q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f2556b);
            this.f667c = obtainStyledAttributes.getInteger(0, 0);
            this.f670f = obtainStyledAttributes.getResourceId(1, -1);
            this.f668d = obtainStyledAttributes.getInteger(2, 0);
            this.f669e = obtainStyledAttributes.getInteger(6, -1);
            this.f671g = obtainStyledAttributes.getInt(5, 0);
            this.f672h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f666b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f640t;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f640t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f642v;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = context.getClassLoader().loadClass(string).getConstructor(CoordinatorLayout.f641u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(context, attributeSet);
                    } catch (Exception e2) {
                        throw new RuntimeException(f.f.a("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f665a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f665a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f666b = false;
            this.f667c = 0;
            this.f668d = 0;
            this.f669e = -1;
            this.f670f = -1;
            this.f671g = 0;
            this.f672h = 0;
            this.f681q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f666b = false;
            this.f667c = 0;
            this.f668d = 0;
            this.f669e = -1;
            this.f670f = -1;
            this.f671g = 0;
            this.f672h = 0;
            this.f681q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f666b = false;
            this.f667c = 0;
            this.f668d = 0;
            this.f669e = -1;
            this.f670f = -1;
            this.f671g = 0;
            this.f672h = 0;
            this.f681q = new Rect();
        }

        public boolean a(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    return false;
                }
                return this.f679o;
            }
            return this.f678n;
        }

        public void b(int i2, boolean z2) {
            if (i2 == 0) {
                this.f678n = z2;
            } else if (i2 != 1) {
            } else {
                this.f679o = z2;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends i0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public SparseArray<Parcelable> f683c;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new h[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f683c = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f683c.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            SparseArray<Parcelable> sparseArray = this.f683c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f683c.keyAt(i3);
                parcelableArr[i3] = this.f683c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            float z2 = view.getZ();
            float z3 = view2.getZ();
            if (z2 > z3) {
                return -1;
            }
            return z2 < z3 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f640t = r02 != null ? r02.getName() : null;
        f643w = new i();
        f641u = new Class[]{Context.class, AttributeSet.class};
        f642v = new ThreadLocal<>();
        f644x = new d0.b(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f645b = new ArrayList();
        this.f646c = new n.c(1);
        this.f647d = new ArrayList();
        this.f648e = new ArrayList();
        this.f649f = new int[2];
        this.f662s = new j();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.a.f2555a, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f652i = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f652i.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.f652i;
                iArr[i2] = (int) (iArr[i2] * f2);
            }
        }
        this.f659p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
    }

    public static Rect a() {
        Rect rect = (Rect) f644x.a();
        return rect == null ? new Rect() : rect;
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void c(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public List<View> d(View view) {
        n.c cVar = this.f646c;
        int i2 = ((l.h) cVar.f2312b).f2280c;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((l.h) cVar.f2312b).k(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((l.h) cVar.f2312b).h(i3));
            }
        }
        this.f648e.clear();
        if (arrayList != null) {
            this.f648e.addAll(arrayList);
        }
        return this.f648e;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        c cVar = ((f) view.getLayoutParams()).f665a;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f659p;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public List<View> e(View view) {
        List list = (List) ((l.h) this.f646c.f2312b).getOrDefault(view, null);
        this.f648e.clear();
        if (list != null) {
            this.f648e.addAll(list);
        }
        return this.f648e;
    }

    public void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = s.a.f2661a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = s.a.f2661a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        s.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = s.a.f2662b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int width;
        int i5 = fVar.f667c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.f668d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        if (i9 != 1) {
            width = i9 != 5 ? rect.left : rect.right;
        } else {
            width = rect.left + (rect.width() / 2);
        }
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f645b);
    }

    public final s getLastWindowInsets() {
        return this.f657n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f662s.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f659p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i2) {
        StringBuilder sb;
        int[] iArr = this.f652i;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // e0.h
    public void i(View view, View view2, int i2, int i3) {
        j jVar = this.f662s;
        if (i3 == 1) {
            jVar.f1629b = i2;
        } else {
            jVar.f1628a = i2;
        }
        this.f654k = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((f) getChildAt(i4).getLayoutParams()).a(i3);
        }
    }

    public f j(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f666b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                if (fVar.f665a != behavior) {
                    fVar.f665a = behavior;
                    fVar.f666b = true;
                    if (behavior != null) {
                        behavior.c(fVar);
                    }
                }
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        c newInstance = dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (fVar.f665a != newInstance) {
                            fVar.f665a = newInstance;
                            fVar.f666b = true;
                            if (newInstance != null) {
                                newInstance.c(fVar);
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder a2 = c.f.a("Default behavior class ");
                        a2.append(dVar.value().getName());
                        a2.append(" could not be instantiated. Did you forget");
                        a2.append(" a default constructor?");
                        Log.e("CoordinatorLayout", a2.toString(), e2);
                    }
                }
            }
            fVar.f666b = true;
        }
        return fVar;
    }

    @Override // e0.h
    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.f665a) != null) {
                    cVar.k(this, childAt, view, i2, i3, i4, i5, i6);
                    z2 = true;
                }
            }
        }
        if (z2) {
            q(1);
        }
    }

    @Override // e0.h
    public void m(View view, int i2) {
        j jVar = this.f662s;
        if (i2 == 1) {
            jVar.f1629b = 0;
        } else {
            jVar.f1628a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.f665a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i2);
                }
                fVar.b(i2, false);
                fVar.f680p = false;
            }
        }
        this.f654k = null;
    }

    @Override // e0.h
    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.f665a) != null) {
                    int[] iArr2 = this.f649f;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    cVar.i(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f649f;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f649f;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            q(1);
        }
    }

    @Override // e0.h
    public boolean o(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f665a;
                if (cVar != null) {
                    boolean p2 = cVar.p(this, childAt, view, view2, i2, i3);
                    z2 |= p2;
                    fVar.b(i3, p2);
                } else {
                    fVar.b(i3, false);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f656m) {
            if (this.f655l == null) {
                this.f655l = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f655l);
        }
        if (this.f657n == null) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.f651h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f656m && this.f655l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f655l);
        }
        View view = this.f654k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f651h = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f658o || this.f659p == null) {
            return;
        }
        s sVar = this.f657n;
        int d2 = sVar != null ? sVar.d() : 0;
        if (d2 > 0) {
            this.f659p.setBounds(0, 0, getWidth(), d2);
            this.f659p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t2 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int layoutDirection = getLayoutDirection();
        int size = this.f645b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f645b.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f665a) == null || !cVar.f(this, view, layoutDirection))) {
                r(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
        if (r0.g(r30, r20, r8, r21, r23, 0) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0187  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f665a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f665a) != null) {
                    z2 |= cVar.h(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        n(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        l(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        i(view, view2, i2, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f2110a);
        SparseArray<Parcelable> sparseArray = hVar.f683c;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = j(childAt).f665a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.m(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable n2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f665a;
            if (id != -1 && cVar != null && (n2 = cVar.n(this, childAt)) != null) {
                sparseArray.append(id, n2);
            }
        }
        hVar.f683c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        m(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f653j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f653j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f665a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f653j
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f653j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view, int i2, int i3) {
        Rect a2 = a();
        f(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            f644x.c(a2);
        }
    }

    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z2;
        boolean z3;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Rect rect2;
        int i13;
        f fVar;
        c cVar;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        int layoutDirection = getLayoutDirection();
        int size = this.f645b.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = 0;
        while (i14 < size) {
            View view = this.f645b.get(i14);
            f fVar2 = (f) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i14;
            } else {
                int i15 = 0;
                while (i15 < i14) {
                    if (fVar2.f676l == this.f645b.get(i15)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f675k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            f(fVar3.f675k, a5);
                            c(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i13 = i14;
                            i11 = i15;
                            rect2 = a4;
                            fVar = fVar2;
                            g(layoutDirection, a5, a7, fVar3, measuredWidth, measuredHeight);
                            boolean z4 = (a7.left == a6.left && a7.top == a6.top) ? false : true;
                            b(fVar3, a7, measuredWidth, measuredHeight);
                            int i16 = a7.left - a6.left;
                            int i17 = a7.top - a6.top;
                            if (i16 != 0) {
                                WeakHashMap<View, o> weakHashMap2 = m.f1633a;
                                view.offsetLeftAndRight(i16);
                            }
                            if (i17 != 0) {
                                WeakHashMap<View, o> weakHashMap3 = m.f1633a;
                                view.offsetTopAndBottom(i17);
                            }
                            if (z4 && (cVar = fVar3.f665a) != null) {
                                cVar.d(this, view, fVar3.f675k);
                            }
                            a5.setEmpty();
                            n.e<Rect> eVar = f644x;
                            eVar.c(a5);
                            a6.setEmpty();
                            eVar.c(a6);
                            a7.setEmpty();
                            eVar.c(a7);
                            i15 = i11 + 1;
                            fVar2 = fVar;
                            size = i12;
                            i14 = i13;
                            a4 = rect2;
                        }
                    }
                    i11 = i15;
                    i12 = size;
                    rect2 = a4;
                    i13 = i14;
                    fVar = fVar2;
                    i15 = i11 + 1;
                    fVar2 = fVar;
                    size = i12;
                    i14 = i13;
                    a4 = rect2;
                }
                int i18 = size;
                Rect rect3 = a4;
                i3 = i14;
                f fVar4 = fVar2;
                c(view, true, a3);
                if (fVar4.f671g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar4.f671g, layoutDirection);
                    int i19 = absoluteGravity & 112;
                    if (i19 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i19 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i20 = absoluteGravity & 7;
                    if (i20 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i20 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar4.f672h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, o> weakHashMap4 = m.f1633a;
                    if (view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar5 = (f) view.getLayoutParams();
                        c cVar2 = fVar5.f665a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(this, view, a8)) {
                            a8.set(a9);
                        } else if (!a9.contains(a8)) {
                            StringBuilder a10 = c.f.a("Rect should be within the child's bounds. Rect:");
                            a10.append(a8.toShortString());
                            a10.append(" | Bounds:");
                            a10.append(a9.toShortString());
                            throw new IllegalArgumentException(a10.toString());
                        }
                        a9.setEmpty();
                        n.e<Rect> eVar2 = f644x;
                        eVar2.c(a9);
                        if (!a8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar5.f672h, layoutDirection);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a8.top - ((ViewGroup.MarginLayoutParams) fVar5).topMargin) - fVar5.f674j) >= (i10 = a2.top)) {
                                z2 = false;
                            } else {
                                x(view, i10 - i9);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin) + fVar5.f674j) < (i8 = a2.bottom)) {
                                x(view, height - i8);
                                z2 = true;
                            }
                            if (!z2) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a8.left - ((ViewGroup.MarginLayoutParams) fVar5).leftMargin) - fVar5.f673i) >= (i7 = a2.left)) {
                                z3 = false;
                            } else {
                                w(view, i7 - i6);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin) + fVar5.f673i) < (i5 = a2.right)) {
                                w(view, width - i5);
                                z3 = true;
                            }
                            if (!z3) {
                                w(view, 0);
                            }
                        }
                        a8.setEmpty();
                        eVar2.c(a8);
                    }
                }
                if (i2 != 2) {
                    rect = rect3;
                    rect.set(((f) view.getLayoutParams()).f681q);
                    if (rect.equals(a3)) {
                        i4 = i18;
                    } else {
                        ((f) view.getLayoutParams()).f681q.set(a3);
                    }
                } else {
                    rect = rect3;
                }
                i4 = i18;
                for (int i21 = i3 + 1; i21 < i4; i21++) {
                    View view2 = this.f645b.get(i21);
                    f fVar6 = (f) view2.getLayoutParams();
                    c cVar3 = fVar6.f665a;
                    if (cVar3 != null && cVar3.b(this, view2, view)) {
                        if (i2 == 0 && fVar6.f680p) {
                            fVar6.f680p = false;
                        } else {
                            boolean d2 = i2 != 2 ? cVar3.d(this, view2, view) : true;
                            if (i2 == 1) {
                                fVar6.f680p = d2;
                            }
                        }
                    }
                }
            }
            i14 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        Rect rect4 = a4;
        a2.setEmpty();
        n.e<Rect> eVar3 = f644x;
        eVar3.c(a2);
        a3.setEmpty();
        eVar3.c(a3);
        rect4.setEmpty();
        eVar3.c(rect4);
    }

    public void r(View view, int i2) {
        Rect a2;
        Rect a3;
        n.e<Rect> eVar;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f675k;
        int i3 = 0;
        if (view2 == null && fVar.f670f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            a2 = a();
            a3 = a();
            try {
                f(view2, a2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
                return;
            } finally {
                a2.setEmpty();
                eVar = f644x;
                eVar.c(a2);
                a3.setEmpty();
                eVar.c(a3);
            }
        }
        int i4 = fVar.f669e;
        if (i4 >= 0) {
            f fVar3 = (f) view.getLayoutParams();
            int i5 = fVar3.f667c;
            if (i5 == 0) {
                i5 = 8388661;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
            int i6 = absoluteGravity & 7;
            int i7 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i4 = width - i4;
            }
            int h2 = h(i4) - measuredWidth2;
            if (i6 == 1) {
                h2 += measuredWidth2 / 2;
            } else if (i6 == 5) {
                h2 += measuredWidth2;
            }
            if (i7 == 16) {
                i3 = 0 + (measuredHeight2 / 2);
            } else if (i7 == 80) {
                i3 = measuredHeight2 + 0;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(h2, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        f fVar4 = (f) view.getLayoutParams();
        a2 = a();
        a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
        if (this.f657n != null) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                a2.left = this.f657n.b() + a2.left;
                a2.top = this.f657n.d() + a2.top;
                a2.right -= this.f657n.c();
                a2.bottom -= this.f657n.a();
            }
        }
        a3 = a();
        int i8 = fVar4.f667c;
        if ((i8 & 7) == 0) {
            i8 |= 8388611;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i2);
        view.layout(a3.left, a3.top, a3.right, a3.bottom);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).f665a;
        if (cVar == null || !cVar.l(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f650g) {
            return;
        }
        v(false);
        this.f650g = true;
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f660q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f659p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f659p = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f659p.setState(getDrawableState());
                }
                Drawable drawable3 = this.f659p;
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f659p.setVisible(getVisibility() == 0, false);
                this.f659p.setCallback(this);
            }
            WeakHashMap<View, o> weakHashMap2 = m.f1633a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = v.a.f2707a;
            drawable = context.getDrawable(i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f659p;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f659p.setVisible(z2, false);
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f647d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator<View> comparator = f643w;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = list.get(i4);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f665a;
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z3 && cVar != null) {
                    if (i2 == 0) {
                        z3 = cVar.e(this, view, motionEvent);
                    } else if (i2 == 1) {
                        z3 = cVar.r(this, view, motionEvent);
                    }
                    if (z3) {
                        this.f653j = view;
                    }
                }
                if (fVar.f665a == null) {
                    fVar.f677m = false;
                }
                boolean z5 = fVar.f677m;
                if (z5) {
                    z2 = true;
                } else {
                    z2 = z5 | false;
                    fVar.f677m = z2;
                }
                z4 = z2 && !z5;
                if (z2 && !z4) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    cVar.e(this, view, motionEvent2);
                } else if (i2 == 1) {
                    cVar.r(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).f665a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.e(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).f677m = false;
        }
        this.f653j = null;
        this.f650g = false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f659p;
    }

    public final void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f673i;
        if (i3 != i2) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            view.offsetLeftAndRight(i2 - i3);
            fVar.f673i = i2;
        }
    }

    public final void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f674j;
        if (i3 != i2) {
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            view.offsetTopAndBottom(i2 - i3);
            fVar.f674j = i2;
        }
    }

    public final void y() {
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (!getFitsSystemWindows()) {
            m.g(this, null);
            return;
        }
        if (this.f661r == null) {
            this.f661r = new a();
        }
        m.g(this, this.f661r);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}