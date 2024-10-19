package h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2067a;

    /* renamed from: b  reason: collision with root package name */
    public final View f2068b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f2069c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f2070d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f2071e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2072f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f2073g;

    public y0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f2070d = layoutParams;
        this.f2071e = new Rect();
        this.f2072f = new int[2];
        this.f2073g = new int[2];
        this.f2067a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f2068b = inflate;
        this.f2069c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(y0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131623940;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f2068b.getParent() != null) {
            ((WindowManager) this.f2067a.getSystemService("window")).removeView(this.f2068b);
        }
    }
}