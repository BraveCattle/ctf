package h;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public class w0 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        x0 x0Var = x0.f2050k;
        if (x0Var != null && x0Var.f2052b == view) {
            x0.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new x0(view, charSequence);
            return;
        }
        x0 x0Var2 = x0.f2051l;
        if (x0Var2 != null && x0Var2.f2052b == view) {
            x0Var2.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}