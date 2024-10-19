package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import java.lang.reflect.Field;
import m0.c;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements d {

    /* renamed from: b  reason: collision with root package name */
    public static int f11b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f12c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f13d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f14e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f15a;

    @Override // androidx.lifecycle.d
    public void c(c cVar, c.a aVar) {
        if (aVar != c.a.ON_DESTROY) {
            return;
        }
        if (f11b == 0) {
            try {
                f11b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f13d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f14e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f12c = declaredField3;
                declaredField3.setAccessible(true);
                f11b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f11b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f15a.getSystemService("input_method");
            try {
                Object obj = f12c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f13d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f14e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}