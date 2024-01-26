package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.x64m.xsfmnative.R;
import h.a1;
import h.o0;
import h.u0;
import h.w0;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements f.b {

    /* renamed from: n0  reason: collision with root package name */
    public static final n f327n0;
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public l L;
    public k M;
    public View.OnFocusChangeListener N;
    public m O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public h0.a S;
    public boolean T;
    public CharSequence U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f328a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f329b0;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f330c0;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f331d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f332e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f333f0;

    /* renamed from: g0  reason: collision with root package name */
    public SearchableInfo f334g0;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f335h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Runnable f336i0;

    /* renamed from: j0  reason: collision with root package name */
    public Runnable f337j0;

    /* renamed from: k0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f338k0;

    /* renamed from: l0  reason: collision with root package name */
    public View.OnKeyListener f339l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextWatcher f340m0;

    /* renamed from: q  reason: collision with root package name */
    public final SearchAutoComplete f341q;

    /* renamed from: r  reason: collision with root package name */
    public final View f342r;

    /* renamed from: s  reason: collision with root package name */
    public final View f343s;

    /* renamed from: t  reason: collision with root package name */
    public final View f344t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f345u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f346v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f347w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f348x;

    /* renamed from: y  reason: collision with root package name */
    public final View f349y;

    /* renamed from: z  reason: collision with root package name */
    public p f350z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends h.c {

        /* renamed from: e  reason: collision with root package name */
        public int f351e;

        /* renamed from: f  reason: collision with root package name */
        public SearchView f352f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f353g;

        /* renamed from: h  reason: collision with root package name */
        public final Runnable f354h;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f353g) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f353g = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f354h = new a();
            this.f351e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                if (i2 < 600) {
                    return (i2 < 640 || i3 < 480) ? 160 : 192;
                }
                return 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.f327n0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f368c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f351e <= 0 || super.enoughToFilter();
        }

        @Override // h.c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f353g) {
                removeCallbacks(this.f354h);
                post(this.f354h);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f352f;
            searchView.A(searchView.R);
            searchView.post(searchView.f336i0);
            if (searchView.f341q.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f352f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f352f.hasFocus() && getVisibility() == 0) {
                this.f353g = true;
                Context context = getContext();
                n nVar = SearchView.f327n0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f353g = false;
                removeCallbacks(this.f354h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f353g = true;
            } else {
                this.f353g = false;
                removeCallbacks(this.f354h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f352f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f351e = i2;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f341q.getText();
            searchView.f331d0 = text;
            boolean z2 = !TextUtils.isEmpty(text);
            searchView.z(z2);
            searchView.B(!z2);
            searchView.v();
            searchView.y();
            if (searchView.L != null && !TextUtils.equals(charSequence, searchView.f330c0)) {
                searchView.L.b(charSequence.toString());
            }
            searchView.f330c0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.w();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h0.a aVar = SearchView.this.S;
            if (aVar instanceof o0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            if (searchView.f349y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f343s.getPaddingLeft();
                Rect rect = new Rect();
                boolean b2 = a1.b(searchView);
                int dimensionPixelSize = searchView.Q ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f341q.getDropDownBackground().getPadding(rect);
                searchView.f341q.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f341q.setDropDownWidth((((searchView.f349y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f345u) {
                searchView.t();
            } else if (view == searchView.f347w) {
                searchView.p();
            } else if (view == searchView.f346v) {
                searchView.u();
            } else if (view == searchView.f348x) {
                SearchableInfo searchableInfo = searchView.f334g0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.J, searchableInfo));
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent(searchView.I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            } else if (view == searchView.f341q) {
                searchView.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f334g0 == null) {
                return false;
            }
            if (searchView.f341q.isPopupShowing() && SearchView.this.f341q.getListSelection() != -1) {
                SearchView searchView2 = SearchView.this;
                if (searchView2.f334g0 != null && searchView2.S != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i2 == 66 || i2 == 84 || i2 == 61) {
                        return searchView2.q(searchView2.f341q.getListSelection());
                    }
                    if (i2 != 21 && i2 != 22) {
                        if (i2 == 19) {
                            searchView2.f341q.getListSelection();
                            return false;
                        }
                        return false;
                    }
                    searchView2.f341q.setSelection(i2 == 21 ? 0 : searchView2.f341q.length());
                    searchView2.f341q.setListSelection(0);
                    searchView2.f341q.clearListSelection();
                    searchView2.f341q.a();
                    return true;
                }
                return false;
            }
            if (!(TextUtils.getTrimmedLength(SearchView.this.f341q.getText()) == 0) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                view.cancelLongPress();
                SearchView searchView3 = SearchView.this;
                searchView3.o(0, null, searchView3.f341q.getText().toString());
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.u();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.q(i2);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.r(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f366a;

        /* renamed from: b  reason: collision with root package name */
        public Method f367b;

        /* renamed from: c  reason: collision with root package name */
        public Method f368c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.f366a = null;
            this.f367b = null;
            this.f368c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f366a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f367b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f368c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends i0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f369c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<o> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new o[i2];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f369c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = c.f.a("SearchView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" isIconified=");
            a2.append(this.f369c);
            a2.append("}");
            return a2.toString();
        }

        @Override // i0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f2110a, i2);
            parcel.writeValue(Boolean.valueOf(this.f369c));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f370a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f371b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f372c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f373d;

        /* renamed from: e  reason: collision with root package name */
        public final int f374e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f375f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f374e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f371b = new Rect();
            this.f373d = new Rect();
            this.f372c = new Rect();
            a(rect, rect2);
            this.f370a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f371b.set(rect);
            this.f373d.set(rect);
            Rect rect3 = this.f373d;
            int i2 = this.f374e;
            rect3.inset(-i2, -i2);
            this.f372c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z2;
            float f2;
            int i2;
            boolean z3;
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z4 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z3 = this.f375f;
                    if (z3 && !this.f373d.contains(x2, y2)) {
                        z4 = z3;
                        z2 = false;
                    }
                } else {
                    if (action == 3) {
                        z3 = this.f375f;
                        this.f375f = false;
                    }
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                z2 = true;
            } else {
                if (this.f371b.contains(x2, y2)) {
                    this.f375f = true;
                    z2 = true;
                }
                z2 = true;
                z4 = false;
            }
            if (z4) {
                if (!z2 || this.f372c.contains(x2, y2)) {
                    Rect rect = this.f372c;
                    f2 = x2 - rect.left;
                    i2 = y2 - rect.top;
                } else {
                    f2 = this.f370a.getWidth() / 2;
                    i2 = this.f370a.getHeight() / 2;
                }
                motionEvent.setLocation(f2, i2);
                return this.f370a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        f327n0 = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f336i0 = new b();
        this.f337j0 = new c();
        this.f338k0 = new WeakHashMap<>();
        f fVar = new f();
        this.f339l0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f340m0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1239u, i2, 0);
        u0 u0Var = new u0(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(u0Var.j(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f341q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f342r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f343s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f344t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f345u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f346v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f347w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f348x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        Drawable e2 = u0Var.e(10);
        WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
        findViewById.setBackground(e2);
        findViewById2.setBackground(u0Var.e(14));
        imageView.setImageDrawable(u0Var.e(13));
        imageView2.setImageDrawable(u0Var.e(7));
        imageView3.setImageDrawable(u0Var.e(4));
        imageView4.setImageDrawable(u0Var.e(16));
        imageView5.setImageDrawable(u0Var.e(13));
        this.F = u0Var.e(12);
        w0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = u0Var.j(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = u0Var.j(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f340m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f339l0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(u0Var.a(8, true));
        int d2 = u0Var.d(1, -1);
        if (d2 != -1) {
            setMaxWidth(d2);
        }
        this.K = u0Var.l(6);
        this.U = u0Var.l(11);
        int h2 = u0Var.h(3, -1);
        if (h2 != -1) {
            setImeOptions(h2);
        }
        int h3 = u0Var.h(2, -1);
        if (h3 != -1) {
            setInputType(h3);
        }
        setFocusable(u0Var.a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f349y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        A(this.Q);
        x();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f341q.setText(charSequence);
        this.f341q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z2) {
        this.R = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f341q.getText());
        this.f345u.setVisibility(i3);
        z(z3);
        this.f342r.setVisibility(z2 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i2 = 8;
        }
        this.E.setVisibility(i2);
        v();
        B(!z3);
        y();
    }

    public final void B(boolean z2) {
        int i2 = 8;
        if (this.f329b0 && !this.R && z2) {
            this.f346v.setVisibility(8);
            i2 = 0;
        }
        this.f348x.setVisibility(i2);
    }

    @Override // f.b
    public void a() {
        if (this.f332e0) {
            return;
        }
        this.f332e0 = true;
        int imeOptions = this.f341q.getImeOptions();
        this.f333f0 = imeOptions;
        this.f341q.setImeOptions(imeOptions | 33554432);
        this.f341q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f341q.clearFocus();
        this.f341q.setImeVisibility(false);
        this.W = false;
    }

    @Override // f.b
    public void e() {
        this.f341q.setText("");
        SearchAutoComplete searchAutoComplete = this.f341q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f331d0 = "";
        clearFocus();
        A(true);
        this.f341q.setImeOptions(this.f333f0);
        this.f332e0 = false;
    }

    public int getImeOptions() {
        return this.f341q.getImeOptions();
    }

    public int getInputType() {
        return this.f341q.getInputType();
    }

    public int getMaxWidth() {
        return this.f328a0;
    }

    public CharSequence getQuery() {
        return this.f341q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f334g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f334g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public h0.a getSuggestionsAdapter() {
        return this.S;
    }

    public final Intent l(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f331d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f335h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f334g0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f335h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f341q.refreshAutoCompleteResults();
            return;
        }
        n nVar = f327n0;
        SearchAutoComplete searchAutoComplete = this.f341q;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f366a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = f327n0;
        SearchAutoComplete searchAutoComplete2 = this.f341q;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f367b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void o(int i2, String str, String str2) {
        getContext().startActivity(l("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f336i0);
        post(this.f337j0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.f341q;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.D);
            int[] iArr = this.C;
            int i6 = iArr[1];
            int[] iArr2 = this.D;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.B;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.f350z;
            if (pVar != null) {
                pVar.a(this.B, this.A);
                return;
            }
            p pVar2 = new p(this.B, this.A, this.f341q);
            this.f350z = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 <= 0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // androidx.appcompat.widget.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.R
            if (r0 == 0) goto L8
            super.onMeasure(r4, r5)
            return
        L8:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L2a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1b
            goto L37
        L1b:
            int r0 = r3.f328a0
            if (r0 <= 0) goto L37
            goto L2e
        L20:
            int r4 = r3.f328a0
            if (r4 <= 0) goto L25
            goto L37
        L25:
            int r4 = r3.getPreferredWidth()
            goto L37
        L2a:
            int r0 = r3.f328a0
            if (r0 <= 0) goto L2f
        L2e:
            goto L33
        L2f:
            int r0 = r3.getPreferredWidth()
        L33:
            int r4 = java.lang.Math.min(r0, r4)
        L37:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L49
            if (r0 == 0) goto L44
            goto L51
        L44:
            int r5 = r3.getPreferredHeight()
            goto L51
        L49:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L51:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f2110a);
        A(oVar.f369c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f369c = this.R;
        return oVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f336i0);
    }

    public void p() {
        if (!TextUtils.isEmpty(this.f341q.getText())) {
            this.f341q.setText("");
            this.f341q.requestFocus();
            this.f341q.setImeVisibility(true);
        } else if (this.Q) {
            k kVar = this.M;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                A(true);
            }
        }
    }

    public boolean q(int i2) {
        int i3;
        String h2;
        m mVar = this.O;
        if (mVar == null || !mVar.b(i2)) {
            Cursor cursor = this.S.f2091d;
            if (cursor != null && cursor.moveToPosition(i2)) {
                Intent intent = null;
                try {
                    int i4 = o0.f1958z;
                    String h3 = o0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h3 == null) {
                        h3 = this.f334g0.getSuggestIntentAction();
                    }
                    if (h3 == null) {
                        h3 = "android.intent.action.SEARCH";
                    }
                    String str = h3;
                    String h4 = o0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h4 == null) {
                        h4 = this.f334g0.getSuggestIntentData();
                    }
                    if (h4 != null && (h2 = o0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h4 = h4 + "/" + Uri.encode(h2);
                    }
                    intent = l(str, h4 == null ? null : Uri.parse(h4), o0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException e2) {
                    try {
                        i3 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i3 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e3) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e3);
                    }
                }
            }
            this.f341q.setImeVisibility(false);
            this.f341q.dismissDropDown();
            return true;
        }
        return false;
    }

    public boolean r(int i2) {
        CharSequence c2;
        m mVar = this.O;
        if (mVar == null || !mVar.a(i2)) {
            Editable text = this.f341q.getText();
            Cursor cursor = this.S.f2091d;
            if (cursor == null) {
                return true;
            }
            if (!cursor.moveToPosition(i2) || (c2 = this.S.c(cursor)) == null) {
                setQuery(text);
                return true;
            }
            setQuery(c2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.W && isFocusable()) {
            if (this.R) {
                return super.requestFocus(i2, rect);
            }
            boolean requestFocus = this.f341q.requestFocus(i2, rect);
            if (requestFocus) {
                A(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void s(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f335h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            p();
        } else {
            t();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q == z2) {
            return;
        }
        this.Q = z2;
        A(z2);
        x();
    }

    public void setImeOptions(int i2) {
        this.f341q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f341q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f328a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        x();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        h0.a aVar = this.S;
        if (aVar instanceof o0) {
            ((o0) aVar).f1964r = z2 ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f334g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f341q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f341q
            android.app.SearchableInfo r3 = r6.f334g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f334g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f334g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f341q
            r3.setInputType(r7)
            h0.a r7 = r6.S
            if (r7 == 0) goto L42
            r7.b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.f334g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            h.o0 r7 = new h.o0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f334g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f338k0
            r7.<init>(r3, r6, r4, r5)
            r6.S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f341q
            r3.setAdapter(r7)
            h0.a r7 = r6.S
            h.o0 r7 = (h.o0) r7
            boolean r3 = r6.V
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = r0
        L69:
            r7.f1964r = r3
        L6b:
            r6.x()
        L6e:
            android.app.SearchableInfo r7 = r6.f334g0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.f334g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.I
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.f334g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.J
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = r3
        La0:
            r6.f329b0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f341q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.R
            r6.A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        A(this.R);
    }

    public void setSuggestionsAdapter(h0.a aVar) {
        this.S = aVar;
        this.f341q.setAdapter(aVar);
    }

    public void t() {
        A(false);
        this.f341q.requestFocus();
        this.f341q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void u() {
        Editable text = this.f341q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.L;
        if (lVar == null || !lVar.a(text.toString())) {
            if (this.f334g0 != null) {
                o(0, null, text.toString());
            }
            this.f341q.setImeVisibility(false);
            this.f341q.dismissDropDown();
        }
    }

    public final void v() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f341q.getText());
        if (!z3 && (!this.Q || this.f332e0)) {
            z2 = false;
        }
        this.f347w.setVisibility(z2 ? 0 : 8);
        Drawable drawable = this.f347w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void w() {
        int[] iArr = this.f341q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f343s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f344t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void x() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f341q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.Q && this.F != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            this.F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void y() {
        int i2 = 0;
        if (!((this.T || this.f329b0) && !this.R) || (this.f346v.getVisibility() != 0 && this.f348x.getVisibility() != 0)) {
            i2 = 8;
        }
        this.f344t.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.f329b0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.T
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f329b0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.R
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f329b0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.f346v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.z(boolean):void");
    }
}