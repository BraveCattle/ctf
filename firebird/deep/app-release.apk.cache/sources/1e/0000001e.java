package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import com.x64m.xsfmnative.R;
import e0.m;
import e0.o;
import h.u0;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public g f83b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f84c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f85d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f86e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f87f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f88g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f89h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f90i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f91j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f92k;

    /* renamed from: l  reason: collision with root package name */
    public int f93l;

    /* renamed from: m  reason: collision with root package name */
    public Context f94m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f95n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f96o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f97p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f98q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f99r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u0 o2 = u0.o(getContext(), attributeSet, b.b.f1236r, R.attr.listMenuViewStyle, 0);
        this.f92k = o2.e(5);
        this.f93l = o2.j(1, -1);
        this.f95n = o2.a(7, false);
        this.f94m = context;
        this.f96o = o2.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f97p = obtainStyledAttributes.hasValue(0);
        o2.f2006b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f98q == null) {
            this.f98q = LayoutInflater.from(getContext());
        }
        return this.f98q;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f89h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f87f = checkBox;
        LinearLayout linearLayout = this.f91j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f90i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f90i.getLayoutParams();
        rect.top = this.f90i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f85d = radioButton;
        LinearLayout linearLayout = this.f91j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i2) {
        int i3;
        String sb;
        this.f83b = gVar;
        int i4 = 0;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f188e);
        setCheckable(gVar.isCheckable());
        boolean m2 = gVar.m();
        gVar.e();
        if (!m2 || !this.f83b.m()) {
            i4 = 8;
        }
        if (i4 == 0) {
            TextView textView = this.f88g;
            g gVar2 = this.f83b;
            char e2 = gVar2.e();
            if (e2 == 0) {
                sb = "";
            } else {
                Resources resources = gVar2.f197n.f157a.getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(gVar2.f197n.f157a).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i5 = gVar2.f197n.n() ? gVar2.f194k : gVar2.f192i;
                g.c(sb2, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                g.c(sb2, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                g.c(sb2, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                g.c(sb2, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                g.c(sb2, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                g.c(sb2, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == '\b') {
                    i3 = R.string.abc_menu_delete_shortcut_label;
                } else if (e2 == '\n') {
                    i3 = R.string.abc_menu_enter_shortcut_label;
                } else if (e2 != ' ') {
                    sb2.append(e2);
                    sb = sb2.toString();
                } else {
                    i3 = R.string.abc_menu_space_shortcut_label;
                }
                sb2.append(resources.getString(i3));
                sb = sb2.toString();
            }
            textView.setText(sb);
        }
        if (this.f88g.getVisibility() != i4) {
            this.f88g.setVisibility(i4);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f200q);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f83b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f92k;
        WeakHashMap<View, o> weakHashMap = m.f1633a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f86e = textView;
        int i2 = this.f93l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f94m, i2);
        }
        this.f88g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f89h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f96o);
        }
        this.f90i = (ImageView) findViewById(R.id.group_divider);
        this.f91j = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        if (this.f84c != null && this.f95n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f84c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z2 && this.f85d == null && this.f87f == null) {
            return;
        }
        if (this.f83b.h()) {
            if (this.f85d == null) {
                b();
            }
            compoundButton = this.f85d;
            compoundButton2 = this.f87f;
        } else {
            if (this.f87f == null) {
                a();
            }
            compoundButton = this.f87f;
            compoundButton2 = this.f85d;
        }
        if (z2) {
            compoundButton.setChecked(this.f83b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f87f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f85d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f83b.h()) {
            if (this.f85d == null) {
                b();
            }
            compoundButton = this.f85d;
        } else {
            if (this.f87f == null) {
                a();
            }
            compoundButton = this.f87f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f99r = z2;
        this.f95n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f90i;
        if (imageView != null) {
            imageView.setVisibility((this.f97p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f83b.f197n);
        boolean z2 = this.f99r;
        if (z2 || this.f95n) {
            ImageView imageView = this.f84c;
            if (imageView == null && drawable == null && !this.f95n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f84c = imageView2;
                LinearLayout linearLayout = this.f91j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f95n) {
                this.f84c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f84c;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f84c.getVisibility() != 0) {
                this.f84c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i2;
        TextView textView;
        if (charSequence != null) {
            this.f86e.setText(charSequence);
            if (this.f86e.getVisibility() == 0) {
                return;
            }
            textView = this.f86e;
            i2 = 0;
        } else {
            i2 = 8;
            if (this.f86e.getVisibility() == 8) {
                return;
            }
            textView = this.f86e;
        }
        textView.setVisibility(i2);
    }
}