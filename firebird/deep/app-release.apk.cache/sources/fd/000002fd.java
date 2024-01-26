package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import n.g;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f2524a;

    /* renamed from: b  reason: collision with root package name */
    public int f2525b;

    /* renamed from: c  reason: collision with root package name */
    public int f2526c;

    /* renamed from: d  reason: collision with root package name */
    public float f2527d;

    /* renamed from: e  reason: collision with root package name */
    public String f2528e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2529f;

    /* renamed from: g  reason: collision with root package name */
    public int f2530g;

    public a(String str, int i2, Object obj) {
        this.f2524a = str;
        this.f2525b = i2;
        b(obj);
    }

    public a(a aVar, Object obj) {
        this.f2524a = aVar.f2524a;
        this.f2525b = aVar.f2525b;
        b(obj);
    }

    public static void a(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        int integer;
        float dimension;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f2544d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        Object obj = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                if (index == 3) {
                    i4 = 3;
                } else if (index == 2) {
                    i4 = 4;
                } else {
                    if (index == 7) {
                        dimension = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        dimension = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i2 = 2;
                    } else if (index == 6) {
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        obj = Integer.valueOf(integer);
                        i2 = i4;
                    } else if (index == 8) {
                        obj = obtainStyledAttributes.getString(index);
                        i2 = 5;
                    }
                    obj = Float.valueOf(dimension);
                    i2 = 7;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(integer);
                i2 = i4;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, i2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public void b(Object obj) {
        switch (g.a(this.f2525b)) {
            case 0:
                this.f2526c = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.f2527d = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.f2530g = ((Integer) obj).intValue();
                return;
            case 4:
                this.f2528e = (String) obj;
                return;
            case 5:
                this.f2529f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}