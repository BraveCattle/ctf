package k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class b extends ComponentActivity {

    /* renamed from: g  reason: collision with root package name */
    public final d f2161g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.lifecycle.e f2162h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2163i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2164j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2165k;

    /* renamed from: l  reason: collision with root package name */
    public int f2166l;

    /* renamed from: m  reason: collision with root package name */
    public l.i<String> f2167m;

    /* loaded from: classes.dex */
    public class a extends e<b> implements m0.l, a.c {
        public a() {
            super(b.this);
        }

        @Override // m0.c
        public androidx.lifecycle.c a() {
            return b.this.f2162h;
        }

        @Override // a.c
        public OnBackPressedDispatcher b() {
            return b.this.f6f;
        }

        @Override // m0.l
        public m0.k d() {
            return b.this.d();
        }

        @Override // k0.e, k0.c
        public View e(int i2) {
            return b.this.findViewById(i2);
        }

        @Override // k0.e, k0.c
        public boolean f() {
            Window window = b.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // k0.e
        public void g(Fragment fragment) {
            Objects.requireNonNull(b.this);
        }

        @Override // k0.e
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            b.this.dump(str, null, printWriter, strArr);
        }

        @Override // k0.e
        public b i() {
            return b.this;
        }

        @Override // k0.e
        public LayoutInflater j() {
            return b.this.getLayoutInflater().cloneInContext(b.this);
        }

        @Override // k0.e
        public void k() {
            b.this.l();
        }
    }

    public b() {
        a aVar = new a();
        b.a.c(aVar, "callbacks == null");
        this.f2161g = new d(aVar);
        this.f2162h = new androidx.lifecycle.e(this);
        this.f2165k = true;
    }

    public static void j(int i2) {
        if ((i2 & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean k(androidx.fragment.app.d dVar, c.b bVar) {
        List<Fragment> list;
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) dVar;
        if (eVar.f785f.isEmpty()) {
            list = Collections.emptyList();
        } else {
            synchronized (eVar.f785f) {
                list = (List) eVar.f785f.clone();
            }
        }
        boolean z2 = false;
        for (Fragment fragment : list) {
            if (fragment != null) {
                if (fragment.N.f901b.compareTo(c.b.STARTED) >= 0) {
                    fragment.N.f(bVar);
                    z2 = true;
                }
                e eVar2 = fragment.f743s;
                if ((eVar2 == null ? null : eVar2.i()) != null) {
                    z2 |= k(fragment.i(), bVar);
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2163i);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2164j);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2165k);
        if (getApplication() != null) {
            n0.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2161g.f2170b.f2175f.I(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void l() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f2161g.b();
        int i4 = i2 >> 16;
        if (i4 == 0) {
            int i5 = u.a.f2679b;
            super.onActivityResult(i2, i3, intent);
            return;
        }
        int i6 = i4 - 1;
        String d2 = this.f2167m.d(i6);
        this.f2167m.h(i6);
        if (d2 == null) {
            Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
        } else if (this.f2161g.f2170b.f2175f.O(d2) == null) {
            Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2161g.b();
        this.f2161g.f2170b.f2175f.i(configuration);
    }

    @Override // androidx.activity.ComponentActivity, u.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        e<?> eVar = this.f2161g.f2170b;
        eVar.f2175f.d(eVar, eVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            e<?> eVar2 = this.f2161g.f2170b;
            if (eVar2 instanceof m0.l) {
                eVar2.f2175f.a0(parcelable);
                if (bundle.containsKey("android:support:next_request_index")) {
                    this.f2166l = bundle.getInt("android:support:next_request_index");
                    int[] intArray = bundle.getIntArray("android:support:request_indicies");
                    String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                    if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                        Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                    } else {
                        this.f2167m = new l.i<>(intArray.length);
                        for (int i2 = 0; i2 < intArray.length; i2++) {
                            this.f2167m.g(intArray[i2], stringArray[i2]);
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
        }
        if (this.f2167m == null) {
            this.f2167m = new l.i<>(10);
            this.f2166l = 0;
        }
        super.onCreate(bundle);
        this.f2162h.d(c.a.ON_CREATE);
        this.f2161g.f2170b.f2175f.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
            d dVar = this.f2161g;
            return onCreatePanelMenu | dVar.f2170b.f2175f.l(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        this.f2161g.f2170b.f2175f.onCreateView(view, str, context, attributeSet);
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2161g.f2170b.f2175f.m();
        this.f2162h.d(c.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2161g.f2170b.f2175f.n();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 != 0) {
            if (i2 != 6) {
                return false;
            }
            return this.f2161g.f2170b.f2175f.j(menuItem);
        }
        return this.f2161g.f2170b.f2175f.C(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z2) {
        this.f2161g.f2170b.f2175f.o(z2);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2161g.b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f2161g.f2170b.f2175f.D(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2164j = false;
        this.f2161g.f2170b.f2175f.H(3);
        this.f2162h.d(c.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z2) {
        this.f2161g.f2170b.f2175f.F(z2);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2162h.d(c.a.ON_RESUME);
        androidx.fragment.app.e eVar = this.f2161g.f2170b.f2175f;
        eVar.f800u = false;
        eVar.f801v = false;
        eVar.H(4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f2161g.f2170b.f2175f.G(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f2161g.b();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String d2 = this.f2167m.d(i4);
            this.f2167m.h(i4);
            if (d2 == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
            } else if (this.f2161g.f2170b.f2175f.O(d2) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + d2);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2164j = true;
        this.f2161g.b();
        this.f2161g.f2170b.f2175f.K();
    }

    @Override // androidx.activity.ComponentActivity, u.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        do {
        } while (k(this.f2161g.f2170b.f2175f, c.b.CREATED));
        this.f2162h.d(c.a.ON_STOP);
        Parcelable b02 = this.f2161g.f2170b.f2175f.b0();
        if (b02 != null) {
            bundle.putParcelable("android:support:fragments", b02);
        }
        if (this.f2167m.i() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2166l);
            int[] iArr = new int[this.f2167m.i()];
            String[] strArr = new String[this.f2167m.i()];
            for (int i2 = 0; i2 < this.f2167m.i(); i2++) {
                iArr[i2] = this.f2167m.f(i2);
                strArr[i2] = this.f2167m.j(i2);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2165k = false;
        if (!this.f2163i) {
            this.f2163i = true;
            androidx.fragment.app.e eVar = this.f2161g.f2170b.f2175f;
            eVar.f800u = false;
            eVar.f801v = false;
            eVar.H(2);
        }
        this.f2161g.b();
        this.f2161g.f2170b.f2175f.K();
        this.f2162h.d(c.a.ON_START);
        androidx.fragment.app.e eVar2 = this.f2161g.f2170b.f2175f;
        eVar2.f800u = false;
        eVar2.f801v = false;
        eVar2.H(3);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2161g.b();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2165k = true;
        do {
        } while (k(this.f2161g.f2170b.f2175f, c.b.CREATED));
        androidx.fragment.app.e eVar = this.f2161g.f2170b.f2175f;
        eVar.f801v = true;
        eVar.H(2);
        this.f2162h.d(c.a.ON_STOP);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (i2 != -1) {
            j(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (i2 != -1) {
            j(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        if (i2 != -1) {
            j(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        if (i2 != -1) {
            j(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        this.f2161g.f2170b.f2175f.onCreateView(null, str, context, attributeSet);
        return super.onCreateView(str, context, attributeSet);
    }
}