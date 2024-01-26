package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import com.x64m.xsfmnative.R;
import h.l0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1885b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static i f1886c;

    /* renamed from: a  reason: collision with root package name */
    public l0 f1887a;

    /* loaded from: classes.dex */
    public class a implements l0.c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1888a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1889b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1890c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1891d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1892e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1893f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c2 = p0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{p0.f1981b, p0.f1983d, p0.f1982c, p0.f1985f}, new int[]{p0.b(context, R.attr.colorButtonNormal), x.a.a(c2, i2), x.a.a(c2, i2), i2});
        }

        public ColorStateList c(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                ThreadLocal<TypedValue> threadLocal = d.a.f1587a;
                return context.getColorStateList(R.color.abc_tint_edittext);
            } else if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                ThreadLocal<TypedValue> threadLocal2 = d.a.f1587a;
                return context.getColorStateList(R.color.abc_tint_switch_track);
            } else if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d2 = p0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = p0.f1981b;
                    iArr2[0] = p0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = p0.f1984e;
                    iArr2[1] = p0.c(context, R.attr.colorControlActivated);
                    iArr[2] = p0.f1985f;
                    iArr2[2] = p0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = p0.f1981b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = p0.f1984e;
                    iArr2[1] = p0.c(context, R.attr.colorControlActivated);
                    iArr[2] = p0.f1985f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, p0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, p0.c(context, R.attr.colorAccent));
                }
                if (i2 != R.drawable.abc_spinner_mtrl_am_alpha && i2 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(this.f1889b, i2)) {
                        return p0.d(context, R.attr.colorControlNormal);
                    }
                    if (a(this.f1892e, i2)) {
                        ThreadLocal<TypedValue> threadLocal3 = d.a.f1587a;
                        return context.getColorStateList(R.color.abc_tint_default);
                    } else if (a(this.f1893f, i2)) {
                        ThreadLocal<TypedValue> threadLocal4 = d.a.f1587a;
                        return context.getColorStateList(R.color.abc_tint_btn_checkable);
                    } else if (i2 == R.drawable.abc_seekbar_thumb_material) {
                        ThreadLocal<TypedValue> threadLocal5 = d.a.f1587a;
                        return context.getColorStateList(R.color.abc_tint_seek_thumb);
                    } else {
                        return null;
                    }
                }
                ThreadLocal<TypedValue> threadLocal6 = d.a.f1587a;
                return context.getColorStateList(R.color.abc_tint_spinner);
            }
        }

        public final void d(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (d0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = i.f1885b;
            }
            drawable.setColorFilter(i.c(i2, mode));
        }
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f1886c == null) {
                e();
            }
            iVar = f1886c;
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter g2;
        synchronized (i.class) {
            g2 = l0.g(i2, mode);
        }
        return g2;
    }

    public static synchronized void e() {
        synchronized (i.class) {
            if (f1886c == null) {
                i iVar = new i();
                f1886c = iVar;
                iVar.f1887a = l0.c();
                l0 l0Var = f1886c.f1887a;
                a aVar = new a();
                synchronized (l0Var) {
                    l0Var.f1944g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, s0 s0Var, int[] iArr) {
        PorterDuff.Mode mode = l0.f1935h;
        if (d0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z2 = s0Var.f1996d;
        if (!z2 && !s0Var.f1995c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        ColorStateList colorStateList = z2 ? s0Var.f1993a : null;
        PorterDuff.Mode mode2 = s0Var.f1995c ? s0Var.f1994b : l0.f1935h;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilter = l0.g(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.f1887a.e(context, i2);
    }

    public synchronized ColorStateList d(Context context, int i2) {
        return this.f1887a.h(context, i2);
    }
}