package e0;

import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import com.x64m.xsfmnative.R;
import e0.m;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f1619a = false;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1620b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1621c = false;

    /* renamed from: d  reason: collision with root package name */
    public static Field f1622d;

    /* loaded from: classes.dex */
    public interface a {
        boolean h(KeyEvent keyEvent);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = m.f.f1637d;
            m.f fVar = (m.f) view.getTag(R.id.tag_unhandled_key_event_manager);
            if (fVar == null) {
                fVar = new m.f();
                view.setTag(R.id.tag_unhandled_key_event_manager, fVar);
            }
            WeakReference<KeyEvent> weakReference = fVar.f1640c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                fVar.f1640c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                if (fVar.f1639b == null) {
                    fVar.f1639b = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = fVar.f1639b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = weakReference2.get();
                    if (view2 == null || !view2.isAttachedToWindow()) {
                        return true;
                    }
                    fVar.b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(e0.d.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.h(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L7e
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L61
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L61
            if (r8 == 0) goto L61
            boolean r1 = e0.d.f1619a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            e0.d.f1620b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            e0.d.f1619a = r3
        L4c:
            java.lang.reflect.Method r1 = e0.d.f1620b
            if (r1 == 0) goto L5e
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5e
            r4[r0] = r10     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L5e
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L5e
        L5e:
            if (r0 == 0) goto L61
            goto L7d
        L61:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L68
            goto L7d
        L68:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = e0.m.b(r7, r10)
            if (r8 == 0) goto L73
            goto L7d
        L73:
            if (r7 == 0) goto L79
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L79:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L7d:
            return r3
        L7e:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld1
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = e0.d.f1621c
            if (r7 != 0) goto L97
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L95
            e0.d.f1622d = r7     // Catch: java.lang.NoSuchFieldException -> L95
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L95
        L95:
            e0.d.f1621c = r3
        L97:
            java.lang.reflect.Field r7 = e0.d.f1622d
            if (r7 == 0) goto La2
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La2
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La2
            goto La3
        La2:
            r7 = r2
        La3:
            if (r7 == 0) goto Lb0
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb0
            goto Ld0
        Lb0:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbb
            goto Ld0
        Lbb:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = e0.m.b(r7, r10)
            if (r8 == 0) goto Lc6
            goto Ld0
        Lc6:
            if (r7 == 0) goto Lcc
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lcc:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld0:
            return r3
        Ld1:
            if (r8 == 0) goto Ld9
            boolean r8 = e0.m.b(r8, r10)
            if (r8 != 0) goto Ldf
        Ld9:
            boolean r7 = r7.h(r10)
            if (r7 == 0) goto Le0
        Ldf:
            r0 = r3
        Le0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d.b(e0.d$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}