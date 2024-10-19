package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import w.a;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2005a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f2006b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f2007c;

    public u0(Context context, TypedArray typedArray) {
        this.f2005a = context;
        this.f2006b = typedArray;
    }

    public static u0 n(Context context, AttributeSet attributeSet, int[] iArr) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static u0 o(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new u0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f2006b.getBoolean(i2, z2);
    }

    public ColorStateList b(int i2) {
        int resourceId;
        if (this.f2006b.hasValue(i2) && (resourceId = this.f2006b.getResourceId(i2, 0)) != 0) {
            Context context = this.f2005a;
            ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.f2006b.getColorStateList(i2);
    }

    public int c(int i2, int i3) {
        return this.f2006b.getDimensionPixelOffset(i2, i3);
    }

    public int d(int i2, int i3) {
        return this.f2006b.getDimensionPixelSize(i2, i3);
    }

    public Drawable e(int i2) {
        int resourceId;
        return (!this.f2006b.hasValue(i2) || (resourceId = this.f2006b.getResourceId(i2, 0)) == 0) ? this.f2006b.getDrawable(i2) : d.a.a(this.f2005a, resourceId);
    }

    public Drawable f(int i2) {
        int resourceId;
        Drawable f2;
        if (!this.f2006b.hasValue(i2) || (resourceId = this.f2006b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        i a2 = i.a();
        Context context = this.f2005a;
        synchronized (a2) {
            f2 = a2.f1887a.f(context, resourceId, true);
        }
        return f2;
    }

    public Typeface g(int i2, int i3, w.b bVar) {
        StringBuilder sb;
        String str;
        int resourceId = this.f2006b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f2007c == null) {
            this.f2007c = new TypedValue();
        }
        Context context = this.f2005a;
        TypedValue typedValue = this.f2007c;
        if (context.isRestricted()) {
            return null;
        }
        Resources resources = context.getResources();
        resources.getValue(resourceId, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder a2 = c.f.a("Resource \"");
            a2.append(resources.getResourceName(resourceId));
            a2.append("\" (");
            a2.append(Integer.toHexString(resourceId));
            a2.append(") is not a Font: ");
            a2.append(typedValue);
            throw new Resources.NotFoundException(a2.toString());
        }
        String charSequence2 = charSequence.toString();
        if (charSequence2.startsWith("res/")) {
            Typeface a3 = x.d.f2768b.a(x.d.c(resources, resourceId, i3));
            if (a3 != null) {
                bVar.b(a3, null);
                return a3;
            }
            try {
                if (!charSequence2.toLowerCase().endsWith(".xml")) {
                    Typeface b2 = x.d.b(context, resources, resourceId, charSequence2, i3);
                    if (b2 != null) {
                        bVar.b(b2, null);
                    } else {
                        bVar.a(-3, null);
                    }
                    return b2;
                }
                a.InterfaceC0037a a4 = w.a.a(resources.getXml(resourceId), resources);
                if (a4 == null) {
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    bVar.a(-3, null);
                    return null;
                }
                return x.d.a(context, a4, resources, resourceId, i3, bVar, null, true);
            } catch (IOException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Failed to read xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                Log.e("ResourcesCompat", sb.toString(), e);
                bVar.a(-3, null);
                return null;
            } catch (XmlPullParserException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Failed to parse xml resource ";
                sb.append(str);
                sb.append(charSequence2);
                Log.e("ResourcesCompat", sb.toString(), e);
                bVar.a(-3, null);
                return null;
            }
        }
        bVar.a(-3, null);
        return null;
    }

    public int h(int i2, int i3) {
        return this.f2006b.getInt(i2, i3);
    }

    public int i(int i2, int i3) {
        return this.f2006b.getLayoutDimension(i2, i3);
    }

    public int j(int i2, int i3) {
        return this.f2006b.getResourceId(i2, i3);
    }

    public String k(int i2) {
        return this.f2006b.getString(i2);
    }

    public CharSequence l(int i2) {
        return this.f2006b.getText(i2);
    }

    public boolean m(int i2) {
        return this.f2006b.hasValue(i2);
    }
}