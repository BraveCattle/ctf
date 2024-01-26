package k0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class o {
    public static void d(List<View> list, View view) {
        int size = list.size();
        if (g(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    if (!g(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean g(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean j(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public void h(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    h(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public void i(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public abstract Object k(Object obj, Object obj2, Object obj3);

    public abstract void l(Object obj, View view);

    public abstract void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void n(Object obj, View view, ArrayList<View> arrayList);

    public abstract void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void p(Object obj, Rect rect);

    public abstract void q(Object obj, View view);

    public abstract void r(Object obj, View view, ArrayList<View> arrayList);

    public abstract void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object t(Object obj);
}