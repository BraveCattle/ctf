package w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a {

    /* renamed from: w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0037a {
    }

    /* loaded from: classes.dex */
    public static final class b implements InterfaceC0037a {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f2725a;

        public b(c[] cVarArr) {
            this.f2725a = cVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f2726a;

        /* renamed from: b  reason: collision with root package name */
        public int f2727b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2728c;

        /* renamed from: d  reason: collision with root package name */
        public String f2729d;

        /* renamed from: e  reason: collision with root package name */
        public int f2730e;

        /* renamed from: f  reason: collision with root package name */
        public int f2731f;

        public c(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f2726a = str;
            this.f2727b = i2;
            this.f2728c = z2;
            this.f2729d = str2;
            this.f2730e = i3;
            this.f2731f = i4;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0037a {

        /* renamed from: a  reason: collision with root package name */
        public final b0.a f2732a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2733b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2734c;

        public d(b0.a aVar, int i2, int i3) {
            this.f2732a = aVar;
            this.f2734c = i2;
            this.f2733b = i3;
        }
    }

    public static InterfaceC0037a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), t.a.f2664b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new d(new b0.a(string, string2, string3, b(resources, resourceId)), integer, integer2);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), t.a.f2665c);
                            int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                            boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                            int i3 = obtainAttributes2.hasValue(9) ? 9 : 3;
                            String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                            int i4 = obtainAttributes2.getInt(i3, 0);
                            int i5 = obtainAttributes2.hasValue(5) ? 5 : 0;
                            int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                            String string5 = obtainAttributes2.getString(i5);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                c(xmlPullParser);
                            }
                            arrayList.add(new c(string5, i2, z2, string4, i4, resourceId2));
                        } else {
                            c(xmlPullParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
            }
            c(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}