package h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class v extends Spinner {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f2008j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final h.d f2009b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2010c;

    /* renamed from: d  reason: collision with root package name */
    public g0 f2011d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f2012e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2013f;

    /* renamed from: g  reason: collision with root package name */
    public f f2014g;

    /* renamed from: h  reason: collision with root package name */
    public int f2015h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f2016i;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().a()) {
                v.this.b();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.app.b f2018b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f2019c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f2020d;

        public b() {
        }

        @Override // h.v.f
        public boolean a() {
            androidx.appcompat.app.b bVar = this.f2018b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // h.v.f
        public CharSequence b() {
            return this.f2020d;
        }

        @Override // h.v.f
        public void c(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // h.v.f
        public int d() {
            return 0;
        }

        @Override // h.v.f
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f2018b;
            if (bVar != null) {
                bVar.dismiss();
                this.f2018b = null;
            }
        }

        @Override // h.v.f
        public void f(int i2, int i3) {
            if (this.f2019c == null) {
                return;
            }
            b.a aVar = new b.a(v.this.getPopupContext());
            CharSequence charSequence = this.f2020d;
            if (charSequence != null) {
                aVar.f67a.f56d = charSequence;
            }
            ListAdapter listAdapter = this.f2019c;
            int selectedItemPosition = v.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f67a;
            bVar.f59g = listAdapter;
            bVar.f60h = this;
            bVar.f62j = selectedItemPosition;
            bVar.f61i = true;
            androidx.appcompat.app.b a2 = aVar.a();
            this.f2018b = a2;
            ListView listView = a2.f66d.f30g;
            listView.setTextDirection(i2);
            listView.setTextAlignment(i3);
            this.f2018b.show();
        }

        @Override // h.v.f
        public void h(CharSequence charSequence) {
            this.f2020d = charSequence;
        }

        @Override // h.v.f
        public int j() {
            return 0;
        }

        @Override // h.v.f
        public void l(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // h.v.f
        public void m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // h.v.f
        public Drawable n() {
            return null;
        }

        @Override // h.v.f
        public void o(ListAdapter listAdapter) {
            this.f2019c = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i2) {
            v.this.setSelection(i2);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i2, this.f2019c.getItemId(i2));
            }
            androidx.appcompat.app.b bVar = this.f2018b;
            if (bVar != null) {
                bVar.dismiss();
                this.f2018b = null;
            }
        }

        @Override // h.v.f
        public void p(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f2022b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f2023c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f2022b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f2023c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof q0) {
                    q0 q0Var = (q0) spinnerAdapter;
                    if (q0Var.getDropDownViewTheme() == null) {
                        q0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f2023c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i2);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i2) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f2023c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f2022b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends i0 implements f {
        public CharSequence C;
        public ListAdapter D;
        public final Rect E;
        public int F;

        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(v vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                v.this.setSelection(i2);
                if (v.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    v.this.performItemClick(view, i2, dVar.D.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                v vVar = v.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
                if (!(vVar.isAttachedToWindow() && vVar.getGlobalVisibleRect(dVar.E))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.i();
            }
        }

        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2026b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f2026b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f2026b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.E = new Rect();
            this.f1908p = v.this;
            s(true);
            this.f1909q = new a(v.this);
        }

        @Override // h.v.f
        public CharSequence b() {
            return this.C;
        }

        @Override // h.v.f
        public void f(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            t();
            this.f1918z.setInputMethodMode(2);
            i();
            e0 e0Var = this.f1896d;
            e0Var.setChoiceMode(1);
            e0Var.setTextDirection(i2);
            e0Var.setTextAlignment(i3);
            int selectedItemPosition = v.this.getSelectedItemPosition();
            e0 e0Var2 = this.f1896d;
            if (a() && e0Var2 != null) {
                e0Var2.setListSelectionHidden(false);
                e0Var2.setSelection(selectedItemPosition);
                if (e0Var2.getChoiceMode() != 0) {
                    e0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (a2 || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.f1918z.setOnDismissListener(new c(bVar));
        }

        @Override // h.v.f
        public void h(CharSequence charSequence) {
            this.C = charSequence;
        }

        @Override // h.i0, h.v.f
        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.D = listAdapter;
        }

        @Override // h.v.f
        public void p(int i2) {
            this.F = i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.n()
                r1 = 0
                if (r0 == 0) goto L26
                h.v r1 = h.v.this
                android.graphics.Rect r1 = r1.f2016i
                r0.getPadding(r1)
                h.v r0 = h.v.this
                boolean r0 = h.a1.b(r0)
                if (r0 == 0) goto L1d
                h.v r0 = h.v.this
                android.graphics.Rect r0 = r0.f2016i
                int r0 = r0.right
                goto L24
            L1d:
                h.v r0 = h.v.this
                android.graphics.Rect r0 = r0.f2016i
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                h.v r0 = h.v.this
                android.graphics.Rect r0 = r0.f2016i
                r0.right = r1
                r0.left = r1
            L2e:
                h.v r0 = h.v.this
                int r0 = r0.getPaddingLeft()
                h.v r2 = h.v.this
                int r2 = r2.getPaddingRight()
                h.v r3 = h.v.this
                int r3 = r3.getWidth()
                h.v r4 = h.v.this
                int r5 = r4.f2015h
                r6 = -2
                if (r5 != r6) goto L78
                android.widget.ListAdapter r5 = r8.D
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.n()
                int r4 = r4.a(r5, r6)
                h.v r5 = h.v.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                h.v r6 = h.v.this
                android.graphics.Rect r6 = r6.f2016i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L7e
            L78:
                r4 = -1
                if (r5 != r4) goto L82
                int r4 = r3 - r0
                int r4 = r4 - r2
            L7e:
                r8.r(r4)
                goto L85
            L82:
                r8.r(r5)
            L85:
                h.v r4 = h.v.this
                boolean r4 = h.a1.b(r4)
                if (r4 == 0) goto L96
                int r3 = r3 - r2
                int r0 = r8.f1898f
                int r3 = r3 - r0
                int r0 = r8.F
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L9b
            L96:
                int r2 = r8.F
                int r0 = r0 + r2
                int r3 = r0 + r1
            L9b:
                r8.f1899g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h.v.d.t():void");
        }
    }

    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public boolean f2028a;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f2028a = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f2028a ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a();

        CharSequence b();

        void c(int i2);

        int d();

        void dismiss();

        void f(int i2, int i3);

        void h(CharSequence charSequence);

        int j();

        void l(Drawable drawable);

        void m(int i2);

        Drawable n();

        void o(ListAdapter listAdapter);

        void p(int i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f2016i = r0
            android.content.Context r0 = r9.getContext()
            h.p0.a(r9, r0)
            int[] r0 = b.b.f1240v
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            h.d r2 = new h.d
            r2.<init>(r9)
            r9.f2009b = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L2e
            f.c r3 = new f.c
            r3.<init>(r10, r2)
            r9.f2010c = r3
            goto L30
        L2e:
            r9.f2010c = r10
        L30:
            r2 = 0
            r3 = -1
            int[] r4 = h.v.f2008j     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch: java.lang.Throwable -> L49 java.lang.Exception -> L4c
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r5 == 0) goto L58
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            goto L58
        L43:
            r10 = move-exception
            r2 = r4
            goto Ld0
        L47:
            r5 = move-exception
            goto L4f
        L49:
            r10 = move-exception
            goto Ld0
        L4c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L4f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L5b
        L58:
            r4.recycle()
        L5b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L97
            if (r3 == r5) goto L62
            goto La5
        L62:
            h.v$d r3 = new h.v$d
            android.content.Context r6 = r9.f2010c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f2010c
            int[] r7 = b.b.f1240v
            h.u0 r6 = h.u0.o(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.i(r7, r8)
            r9.f2015h = r7
            android.graphics.drawable.Drawable r7 = r6.e(r5)
            android.widget.PopupWindow r8 = r3.f1918z
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.C = r4
            android.content.res.TypedArray r4 = r6.f2006b
            r4.recycle()
            r9.f2014g = r3
            h.u r4 = new h.u
            r4.<init>(r9, r9, r3)
            r9.f2011d = r4
            goto La5
        L97:
            h.v$b r3 = new h.v$b
            r3.<init>()
            r9.f2014g = r3
            java.lang.String r4 = r0.getString(r4)
            r3.h(r4)
        La5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131427383(0x7f0b0037, float:1.847638E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter(r3)
        Lbc:
            r0.recycle()
            r9.f2013f = r5
            android.widget.SpinnerAdapter r10 = r9.f2012e
            if (r10 == 0) goto Lca
            r9.setAdapter(r10)
            r9.f2012e = r2
        Lca:
            h.d r10 = r9.f2009b
            r10.d(r11, r12)
            return
        Ld0:
            if (r2 == 0) goto Ld5
            r2.recycle()
        Ld5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.v.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f2016i);
            Rect rect = this.f2016i;
            return i3 + rect.left + rect.right;
        }
        return i3;
    }

    public void b() {
        this.f2014g.f(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        h.d dVar = this.f2009b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.f2014g;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.f2014g;
        return fVar != null ? fVar.j() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f2014g != null ? this.f2015h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f2014g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.f2014g;
        return fVar != null ? fVar.n() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2010c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.f2014g;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        h.d dVar = this.f2009b;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h.d dVar = this.f2009b;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f2014g;
        if (fVar == null || !fVar.a()) {
            return;
        }
        this.f2014g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f2014g == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f2028a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f2014g;
        eVar.f2028a = fVar != null && fVar.a();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var = this.f2011d;
        if (g0Var == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.f2014g;
        if (fVar != null) {
            if (fVar.a()) {
                return true;
            }
            b();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2013f) {
            this.f2012e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f2014g != null) {
            Context context = this.f2010c;
            if (context == null) {
                context = getContext();
            }
            this.f2014g.o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h.d dVar = this.f2009b;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        h.d dVar = this.f2009b;
        if (dVar != null) {
            dVar.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.f2014g;
        if (fVar == null) {
            super.setDropDownHorizontalOffset(i2);
            return;
        }
        fVar.p(i2);
        this.f2014g.c(i2);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.f2014g;
        if (fVar != null) {
            fVar.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.f2014g != null) {
            this.f2015h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f2014g;
        if (fVar != null) {
            fVar.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(d.a.a(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f2014g;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h.d dVar = this.f2009b;
        if (dVar != null) {
            dVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h.d dVar = this.f2009b;
        if (dVar != null) {
            dVar.i(mode);
        }
    }
}