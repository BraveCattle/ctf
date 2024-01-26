package e0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.x64m.xsfmnative.R;
import f0.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f1613c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f1614a = f1613c;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f1615b = new C0019a(this);

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0019a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f1616a;

        public C0019a(a aVar) {
            this.f1616a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f1616a.f1614a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = this.f1616a.f1614a.getAccessibilityNodeProvider(view);
            f0.e eVar = accessibilityNodeProvider != null ? new f0.e(accessibilityNodeProvider) : null;
            if (eVar != null) {
                return (AccessibilityNodeProvider) eVar.f1740a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1616a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object tag;
            int i2;
            f0.d dVar = new f0.d(accessibilityNodeInfo);
            WeakHashMap<View, o> weakHashMap = m.f1633a;
            int i3 = Build.VERSION.SDK_INT;
            Object obj = null;
            if (i3 >= 28) {
                tag = Boolean.valueOf(view.isScreenReaderFocusable());
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(booleanValue);
            } else {
                dVar.f(1, booleanValue);
            }
            if (i3 >= 28) {
                obj = Boolean.valueOf(view.isAccessibilityHeading());
            } else {
                Object tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (Boolean.class.isInstance(tag2)) {
                    obj = tag2;
                }
            }
            Boolean bool2 = (Boolean) obj;
            boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo.setHeading(booleanValue2);
            } else {
                dVar.f(2, booleanValue2);
            }
            CharSequence d2 = m.d(view);
            if (i3 >= 28) {
                accessibilityNodeInfo.setPaneTitle(d2);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d2);
            }
            this.f1616a.b(view, dVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                        if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                            arrayList.add(Integer.valueOf(i4));
                        }
                    }
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                    }
                }
                ClickableSpan[] d3 = f0.d.d(text);
                if (d3 != null && d3.length > 0) {
                    dVar.e().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i6 = 0; i6 < d3.length; i6++) {
                        ClickableSpan clickableSpan = d3[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i2 = f0.d.f1730b;
                                f0.d.f1730b = i2 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i2 = sparseArray2.keyAt(i7);
                                break;
                            } else {
                                i7++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(d3[i6]));
                        ClickableSpan clickableSpan2 = d3[i6];
                        Spanned spanned = (Spanned) text;
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                dVar.a((d.a) list.get(i8));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f1616a.f1614a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f1616a.f1614a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f1616a.c(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f1616a.f1614a.sendAccessibilityEvent(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f1616a.f1614a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1614a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, f0.d dVar) {
        this.f1614a.onInitializeAccessibilityNodeInfo(view, dVar.f1731a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131230992(0x7f080110, float:1.8078052E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
        Lf:
            r1 = 0
            r2 = r1
        L11:
            int r3 = r0.size()
            if (r2 >= r3) goto L74
            java.lang.Object r3 = r0.get(r2)
            f0.d$a r3 = (f0.d.a) r3
            java.lang.Object r4 = r3.f1736a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r4 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r4
            int r4 = r4.getId()
            if (r4 != r10) goto L71
            f0.f r0 = r3.f1738c
            if (r0 == 0) goto L74
            r0 = 0
            java.lang.Class<? extends f0.f$a> r2 = r3.f1737b
            if (r2 == 0) goto L6a
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L44
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.Exception -> L44
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L44
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.Exception -> L44
            f0.f$a r2 = (f0.f.a) r2     // Catch: java.lang.Exception -> L44
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L42
            goto L69
        L42:
            r0 = move-exception
            goto L48
        L44:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L48:
            java.lang.Class<? extends f0.f$a> r4 = r3.f1737b
            if (r4 != 0) goto L4f
            java.lang.String r4 = "null"
            goto L53
        L4f:
            java.lang.String r4 = r4.getName()
        L53:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L69:
            r0 = r2
        L6a:
            f0.f r2 = r3.f1738c
            boolean r0 = r2.a(r9, r0)
            goto L75
        L71:
            int r2 = r2 + 1
            goto L11
        L74:
            r0 = r1
        L75:
            if (r0 != 0) goto L7d
            android.view.View$AccessibilityDelegate r0 = r8.f1614a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L7d:
            if (r0 != 0) goto Lce
            r2 = 2131230731(0x7f08000b, float:1.8077523E38)
            if (r10 != r2) goto Lce
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131230993(0x7f080111, float:1.8078054E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto Lcd
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto Lcd
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto Lc6
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = f0.d.d(r11)
            r2 = r1
        Lb4:
            if (r11 == 0) goto Lc6
            int r3 = r11.length
            if (r2 >= r3) goto Lc6
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto Lc3
            r11 = r0
            goto Lc7
        Lc3:
            int r2 = r2 + 1
            goto Lb4
        Lc6:
            r11 = r1
        Lc7:
            if (r11 == 0) goto Lcd
            r10.onClick(r9)
            r1 = r0
        Lcd:
            r0 = r1
        Lce:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.a.c(android.view.View, int, android.os.Bundle):boolean");
    }
}