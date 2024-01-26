package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import c.l;
import com.x64m.xsfmnative.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24a;

    /* renamed from: b  reason: collision with root package name */
    public final l f25b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f26c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f28e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f29f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f30g;

    /* renamed from: h  reason: collision with root package name */
    public View f31h;

    /* renamed from: i  reason: collision with root package name */
    public int f32i;

    /* renamed from: j  reason: collision with root package name */
    public int f33j;

    /* renamed from: k  reason: collision with root package name */
    public int f34k;

    /* renamed from: l  reason: collision with root package name */
    public int f35l;

    /* renamed from: m  reason: collision with root package name */
    public int f36m;

    /* renamed from: o  reason: collision with root package name */
    public Button f38o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f39p;

    /* renamed from: q  reason: collision with root package name */
    public Message f40q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f41r;

    /* renamed from: s  reason: collision with root package name */
    public Button f42s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f43t;

    /* renamed from: u  reason: collision with root package name */
    public Message f44u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f45v;

    /* renamed from: w  reason: collision with root package name */
    public Button f46w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f47x;

    /* renamed from: y  reason: collision with root package name */
    public Message f48y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f49z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f37n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener R = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f50b;

        /* renamed from: c  reason: collision with root package name */
        public final int f51c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.f1238t);
            this.f51c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f50b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f38o || (message2 = alertController.f40q) == null) && (view != alertController.f42s || (message2 = alertController.f44u) == null)) ? (view != alertController.f46w || (message = alertController.f48y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.Q.obtainMessage(1, alertController2.f25b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f53a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f54b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f55c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f56d;

        /* renamed from: e  reason: collision with root package name */
        public View f57e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnKeyListener f58f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f59g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f60h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f61i;

        /* renamed from: j  reason: collision with root package name */
        public int f62j = -1;

        public b(Context context) {
            this.f53a = context;
            this.f54b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f63a;

        public c(DialogInterface dialogInterface) {
            this.f63a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f63a.get(), message.what);
            } else if (i2 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, l lVar, Window window) {
        this.f24a = context;
        this.f25b = lVar;
        this.f26c = window;
        this.Q = new c(lVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, b.b.f1223e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f27d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        lVar.a().t(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}