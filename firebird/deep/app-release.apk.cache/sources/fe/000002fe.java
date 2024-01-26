package q;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<a> f2531a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.c> f2532b = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2533a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C0033b> f2534b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f2535c;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2535c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f2548h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2533a = obtainStyledAttributes.getResourceId(index, this.f2533a);
                } else if (index == 1) {
                    this.f2535c = obtainStyledAttributes.getResourceId(index, this.f2535c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2535c);
                    context.getResources().getResourceName(this.f2535c);
                    if ("layout".equals(resourceTypeName)) {
                        new androidx.constraintlayout.widget.c().a(context, this.f2535c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: q.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0033b {

        /* renamed from: a  reason: collision with root package name */
        public float f2536a;

        /* renamed from: b  reason: collision with root package name */
        public float f2537b;

        /* renamed from: c  reason: collision with root package name */
        public float f2538c;

        /* renamed from: d  reason: collision with root package name */
        public float f2539d;

        /* renamed from: e  reason: collision with root package name */
        public int f2540e;

        public C0033b(Context context, XmlPullParser xmlPullParser) {
            this.f2536a = Float.NaN;
            this.f2537b = Float.NaN;
            this.f2538c = Float.NaN;
            this.f2539d = Float.NaN;
            this.f2540e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f2550j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f2540e = obtainStyledAttributes.getResourceId(index, this.f2540e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2540e);
                    context.getResources().getResourceName(this.f2540e);
                    if ("layout".equals(resourceTypeName)) {
                        new androidx.constraintlayout.widget.c().a(context, this.f2540e);
                    }
                } else if (index == 1) {
                    this.f2539d = obtainStyledAttributes.getDimension(index, this.f2539d);
                } else if (index == 2) {
                    this.f2537b = obtainStyledAttributes.getDimension(index, this.f2537b);
                } else if (index == 3) {
                    this.f2538c = obtainStyledAttributes.getDimension(index, this.f2538c);
                } else if (index == 4) {
                    this.f2536a = obtainStyledAttributes.getDimension(index, this.f2536a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c2 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            a aVar2 = new a(context, xml);
                            this.f2531a.put(aVar2.f2533a, aVar2);
                            aVar = aVar2;
                            continue;
                        } else if (c2 == 3) {
                            C0033b c0033b = new C0033b(context, xml);
                            if (aVar != null) {
                                aVar.f2534b.add(c0033b);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                            continue;
                        } else {
                            a(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d0, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}