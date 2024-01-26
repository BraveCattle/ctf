package e0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import com.x64m.xsfmnative.R;
import e0.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, o> f1633a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f1634b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1635c;

    /* loaded from: classes.dex */
    public class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f1636a;

        public a(k kVar) {
            this.f1636a = kVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Objects.requireNonNull(windowInsets);
            return this.f1636a.a(view, new s(windowInsets)).g();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static s a(View view, s sVar, Rect rect) {
            WindowInsets g2 = sVar.g();
            if (g2 != null) {
                return s.h(view.computeSystemWindowInsets(g2, rect));
            }
            rect.setEmpty();
            return sVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static WindowInsets a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f1637d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f1638a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f1639b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f1640c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f1638a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((e) arrayList.get(size)).a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
        f1633a = null;
        f1635c = false;
        new WeakHashMap();
    }

    public static o a(View view) {
        if (f1633a == null) {
            f1633a = new WeakHashMap<>();
        }
        o oVar = f1633a.get(view);
        if (oVar == null) {
            o oVar2 = new o(view);
            f1633a.put(view, oVar2);
            return oVar2;
        }
        return oVar;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = f.f1637d;
        f fVar = (f) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (fVar == null) {
            fVar = new f();
            view.setTag(R.id.tag_unhandled_key_event_manager, fVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = fVar.f1638a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = f.f1637d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (fVar.f1638a == null) {
                        fVar.f1638a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = f.f1637d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            fVar.f1638a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                fVar.f1638a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = fVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (fVar.f1639b == null) {
                    fVar.f1639b = new SparseArray<>();
                }
                fVar.f1639b.put(keyCode, new WeakReference<>(a2));
            }
        }
        return a2 != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f1635c) {
            return null;
        }
        if (f1634b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1634b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1635c = true;
                return null;
            }
        }
        Object obj = f1634b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = view.getAccessibilityPaneTitle();
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void e(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.a(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void f(View view, e0.a aVar) {
        if (aVar == null && (c(view) instanceof a.C0019a)) {
            aVar = new e0.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f1615b);
    }

    public static void g(View view, k kVar) {
        if (kVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(kVar));
        }
    }
}