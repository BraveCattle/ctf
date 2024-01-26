package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.b;
import androidx.core.widget.NestedScrollView;
import c.l;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b extends l {

    /* renamed from: d  reason: collision with root package name */
    public final AlertController f66d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f67a;

        /* renamed from: b  reason: collision with root package name */
        public final int f68b;

        public a(Context context) {
            int c2 = b.c(context, 0);
            this.f67a = new AlertController.b(new ContextThemeWrapper(context, b.c(context, c2)));
            this.f68b = c2;
        }

        public b a() {
            b bVar = new b(this.f67a.f53a, this.f68b);
            AlertController.b bVar2 = this.f67a;
            AlertController alertController = bVar.f66d;
            View view = bVar2.f57e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar2.f56d;
                if (charSequence != null) {
                    alertController.f28e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f55c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar2.f59g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f54b.inflate(alertController.L, (ViewGroup) null);
                int i2 = bVar2.f61i ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar2.f59g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f53a, i2, 16908308, null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar2.f62j;
                if (bVar2.f60h != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar2, alertController));
                }
                if (bVar2.f61i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f30g = recycleListView;
            }
            Objects.requireNonNull(this.f67a);
            bVar.setCancelable(true);
            Objects.requireNonNull(this.f67a);
            bVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f67a);
            bVar.setOnCancelListener(null);
            Objects.requireNonNull(this.f67a);
            bVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f67a.f58f;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public b(Context context, int i2) {
        super(context, c(context, i2));
        this.f66d = new AlertController(getContext(), this, getWindow());
    }

    public static int c(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // c.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z2;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        Button button;
        super.onCreate(bundle);
        AlertController alertController = this.f66d;
        int i2 = alertController.K;
        alertController.f25b.setContentView(alertController.J);
        View findViewById2 = alertController.f26c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.f31h;
        if (view2 == null) {
            view2 = alertController.f32i != 0 ? LayoutInflater.from(alertController.f24a).inflate(alertController.f32i, viewGroup, false) : null;
        }
        boolean z3 = view2 != null;
        if (!z3 || !AlertController.a(view2)) {
            alertController.f26c.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) alertController.f26c.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f37n) {
                frameLayout.setPadding(alertController.f33j, alertController.f34k, alertController.f35l, alertController.f36m);
            }
            if (alertController.f30g != null) {
                ((b.a) viewGroup.getLayoutParams()).f453a = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d2 = alertController.d(findViewById6, findViewById3);
        ViewGroup d3 = alertController.d(findViewById7, findViewById4);
        ViewGroup d4 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f26c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d3.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f29f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f30g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f30g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d3.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) d4.findViewById(16908313);
        alertController.f38o = button2;
        button2.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f39p) && alertController.f41r == null) {
            alertController.f38o.setVisibility(8);
            z2 = false;
        } else {
            alertController.f38o.setText(alertController.f39p);
            Drawable drawable = alertController.f41r;
            if (drawable != null) {
                int i3 = alertController.f27d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f38o.setCompoundDrawables(alertController.f41r, null, null, null);
            }
            alertController.f38o.setVisibility(0);
            z2 = true;
        }
        Button button3 = (Button) d4.findViewById(16908314);
        alertController.f42s = button3;
        button3.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f43t) && alertController.f45v == null) {
            alertController.f42s.setVisibility(8);
        } else {
            alertController.f42s.setText(alertController.f43t);
            Drawable drawable2 = alertController.f45v;
            if (drawable2 != null) {
                int i4 = alertController.f27d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f42s.setCompoundDrawables(alertController.f45v, null, null, null);
            }
            alertController.f42s.setVisibility(0);
            z2 |= true;
        }
        Button button4 = (Button) d4.findViewById(16908315);
        alertController.f46w = button4;
        button4.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.f47x) && alertController.f49z == null) {
            alertController.f46w.setVisibility(8);
            view = null;
        } else {
            alertController.f46w.setText(alertController.f47x);
            Drawable drawable3 = alertController.f49z;
            if (drawable3 != null) {
                int i5 = alertController.f27d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f46w.setCompoundDrawables(alertController.f49z, null, null, null);
            } else {
                view = null;
            }
            alertController.f46w.setVisibility(0);
            z2 |= true;
        }
        Context context = alertController.f24a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z2) {
                button = alertController.f38o;
            } else if (z2) {
                button = alertController.f42s;
            } else if (z2) {
                button = alertController.f46w;
            }
            alertController.b(button);
        }
        if (!(z2)) {
            d4.setVisibility(8);
        }
        if (alertController.G != null) {
            d2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f26c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f26c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f28e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.f26c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f28e);
                int i6 = alertController.B;
                if (i6 != 0) {
                    alertController.D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                alertController.f26c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d2.setVisibility(8);
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        int i7 = (d2 == null || d2.getVisibility() == 8) ? 0 : 1;
        boolean z5 = d4.getVisibility() != 8;
        if (!z5 && (findViewById = d3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f29f == null && alertController.f30g == null) ? view : d2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f30g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z5 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f50b, recycleListView.getPaddingRight(), z5 ? recycleListView.getPaddingBottom() : recycleListView.f51c);
            }
        }
        if (!z4) {
            View view3 = alertController.f30g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                int i8 = z5 ? 2 : 0;
                View findViewById11 = alertController.f26c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f26c.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, o> weakHashMap = m.f1633a;
                view3.setScrollIndicators(i7 | i8, 3);
                if (findViewById11 != null) {
                    d3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    d3.removeView(findViewById12);
                }
            }
        }
        ListView listView2 = alertController.f30g;
        if (listView2 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i9 = alertController.I;
        if (i9 > -1) {
            listView2.setItemChecked(i9, true);
            listView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f66d.A;
        if (nestedScrollView != null && nestedScrollView.p(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f66d.A;
        if (nestedScrollView != null && nestedScrollView.p(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // c.l, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f66d;
        alertController.f28e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}