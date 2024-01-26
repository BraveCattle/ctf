package f0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import f0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public static int f1730b;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f1731a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static final a f1732d;

        /* renamed from: e  reason: collision with root package name */
        public static final a f1733e;

        /* renamed from: f  reason: collision with root package name */
        public static final a f1734f;

        /* renamed from: g  reason: collision with root package name */
        public static final a f1735g;

        /* renamed from: a  reason: collision with root package name */
        public final Object f1736a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<? extends f.a> f1737b;

        /* renamed from: c  reason: collision with root package name */
        public final f f1738c;

        static {
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            f1732d = new a(4096, null);
            f1733e = new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null, f.h.class);
            int i2 = Build.VERSION.SDK_INT;
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, f.e.class);
            f1734f = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
            f1735g = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, f.C0021f.class);
            new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
        }

        public a(int i2, CharSequence charSequence) {
            this(null, i2, null, null, null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i2, null, null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f1738c = null;
            this.f1736a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
            this.f1737b = cls;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                Object obj2 = this.f1736a;
                Object obj3 = ((a) obj).f1736a;
                return obj2 == null ? obj3 == null : obj2.equals(obj3);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f1736a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f1739a;

        public b(Object obj) {
            this.f1739a = obj;
        }

        public static b a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            return new b(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
        }
    }

    public d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f1731a = accessibilityNodeInfo;
    }

    public static String c(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                switch (i2) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    default:
                        switch (i2) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i2) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f1731a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f1736a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f1731a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f1731a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public Bundle e() {
        return this.f1731a.getExtras();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f1731a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = ((d) obj).f1731a;
            if (accessibilityNodeInfo == null) {
                if (accessibilityNodeInfo2 != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void f(int i2, boolean z2) {
        Bundle e2 = e();
        if (e2 != null) {
            int i3 = e2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            e2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public void g(Object obj) {
        this.f1731a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((b) obj).f1739a);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f1731a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.text.SpannableString] */
    public String toString() {
        ?? text;
        ?? emptyList;
        ?? sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f1731a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f1731a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f1731a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f1731a.getClassName());
        sb.append("; text: ");
        if (!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List<Integer> b2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> b3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> b4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> b5 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString(TextUtils.substring(this.f1731a.getText(), 0, this.f1731a.getText().length()));
            for (int i2 = 0; i2 < b2.size(); i2++) {
                text.setSpan(new f0.a(b5.get(i2).intValue(), this, e().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b2.get(i2).intValue(), b3.get(i2).intValue(), b4.get(i2).intValue());
            }
        } else {
            text = this.f1731a.getText();
        }
        sb.append(text);
        sb.append("; contentDescription: ");
        sb.append(this.f1731a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f1731a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f1731a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f1731a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f1731a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f1731a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f1731a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f1731a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f1731a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f1731a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f1731a.isPassword());
        sb.append("; scrollable: " + this.f1731a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f1731a.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i3 = 0; i3 < size; i3++) {
                emptyList.add(new a(actionList.get(i3), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i4 = 0; i4 < emptyList.size(); i4++) {
            a aVar = (a) emptyList.get(i4);
            String c2 = c(((AccessibilityNodeInfo.AccessibilityAction) aVar.f1736a).getId());
            if (c2.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) aVar.f1736a).getLabel() != null) {
                c2 = ((AccessibilityNodeInfo.AccessibilityAction) aVar.f1736a).getLabel().toString();
            }
            sb.append(c2);
            if (i4 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}