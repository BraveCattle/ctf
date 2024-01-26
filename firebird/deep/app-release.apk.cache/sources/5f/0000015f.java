package c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.x64m.xsfmnative.R;
import h.a0;
import h.r;
import h.r0;
import h.s;
import h.v;
import h.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class m {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private final Object[] mConstructorArgs = new Object[2];
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final l.h<String, Constructor<? extends View>> sConstructorMap = new l.h<>();

    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f1358b;

        /* renamed from: c  reason: collision with root package name */
        public final String f1359c;

        /* renamed from: d  reason: collision with root package name */
        public Method f1360d;

        /* renamed from: e  reason: collision with root package name */
        public Context f1361e;

        public a(View view, String str) {
            this.f1358b = view;
            this.f1359c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String sb;
            Method method;
            if (this.f1360d == null) {
                Context context = this.f1358b.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1359c, View.class)) != null) {
                            this.f1360d = method;
                            this.f1361e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f1358b.getId();
                if (id == -1) {
                    sb = "";
                } else {
                    StringBuilder a2 = f.a(" with id '");
                    a2.append(this.f1358b.getContext().getResources().getResourceEntryName(id));
                    a2.append("'");
                    sb = a2.toString();
                }
                StringBuilder a3 = f.a("Could not find method ");
                a3.append(this.f1359c);
                a3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a3.append(this.f1358b.getClass());
                a3.append(sb);
                throw new IllegalStateException(a3.toString());
            }
            try {
                this.f1360d.invoke(this.f1361e, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            WeakHashMap<View, e0.o> weakHashMap = e0.m.f1633a;
            if (view.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        l.h<String, Constructor<? extends View>> hVar = sConstructorMap;
        Constructor<? extends View> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return createViewByPrefix(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i2 >= strArr.length) {
                    return null;
                }
                View createViewByPrefix = createViewByPrefix(context, str, strArr[i2]);
                if (createViewByPrefix != null) {
                    return createViewByPrefix;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z2, boolean z3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1243y, 0, 0);
        int resourceId = z2 ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z3 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            Log.i(LOG_TAG, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof f.c) && ((f.c) context).f1664a == resourceId) ? context : new f.c(context, resourceId) : context;
    }

    private void verifyNotNull(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public h.c createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new h.c(context, attributeSet);
    }

    public h.e createButton(Context context, AttributeSet attributeSet) {
        return new h.e(context, attributeSet, R.attr.buttonStyle);
    }

    public h.f createCheckBox(Context context, AttributeSet attributeSet) {
        return new h.f(context, attributeSet);
    }

    public h.g createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new h.g(context, attributeSet);
    }

    public h.j createEditText(Context context, AttributeSet attributeSet) {
        return new h.j(context, attributeSet);
    }

    public h.k createImageButton(Context context, AttributeSet attributeSet) {
        return new h.k(context, attributeSet);
    }

    public h.m createImageView(Context context, AttributeSet attributeSet) {
        return new h.m(context, attributeSet, 0);
    }

    public h.n createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new h.n(context, attributeSet);
    }

    public h.q createRadioButton(Context context, AttributeSet attributeSet) {
        return new h.q(context, attributeSet);
    }

    public r createRatingBar(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public s createSeekBar(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    public v createSpinner(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet, R.attr.spinnerStyle);
    }

    public y createTextView(Context context, AttributeSet attributeSet) {
        return new y(context, attributeSet);
    }

    public a0 createToggleButton(Context context, AttributeSet attributeSet) {
        return new a0(context, attributeSet);
    }

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z2, boolean z3, boolean z4, boolean z5) {
        View createRatingBar;
        Context context2 = (!z2 || view == null) ? context : view.getContext();
        if (z3 || z4) {
            context2 = themifyContext(context2, attributeSet, z3, z4);
        }
        if (z5) {
            r0.a(context2);
        }
        Objects.requireNonNull(str);
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                createRatingBar = createRatingBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 1:
                createRatingBar = createCheckedTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 2:
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 3:
                createRatingBar = createTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 4:
                createRatingBar = createImageButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 5:
                createRatingBar = createSeekBar(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 6:
                createRatingBar = createSpinner(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 7:
                createRatingBar = createRadioButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\b':
                createRatingBar = createToggleButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\t':
                createRatingBar = createImageView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\n':
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case 11:
                createRatingBar = createCheckBox(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\f':
                createRatingBar = createEditText(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            case '\r':
                createRatingBar = createButton(context2, attributeSet);
                verifyNotNull(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = createViewFromTag(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            checkOnClickListener(createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}