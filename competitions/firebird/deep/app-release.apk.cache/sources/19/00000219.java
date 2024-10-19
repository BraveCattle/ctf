package h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import com.x64m.xsfmnative.R;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final C0024a f1821b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1822c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f1823d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.appcompat.widget.a f1824e;

    /* renamed from: f  reason: collision with root package name */
    public int f1825f;

    /* renamed from: g  reason: collision with root package name */
    public e0.o f1826g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1827h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1828i;

    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0024a implements e0.p {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1829a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1830b;

        public C0024a() {
        }

        @Override // e0.p
        public void a(View view) {
            if (this.f1829a) {
                return;
            }
            a aVar = a.this;
            aVar.f1826g = null;
            a.super.setVisibility(this.f1830b);
        }

        @Override // e0.p
        public void b(View view) {
            a.super.setVisibility(0);
            this.f1829a = false;
        }

        @Override // e0.p
        public void c(View view) {
            this.f1829a = true;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f1821b = new C0024a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1822c = context;
        } else {
            this.f1822c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public e0.o e(int i2, long j2) {
        e0.o oVar = this.f1826g;
        if (oVar != null) {
            oVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            e0.o a2 = e0.m.a(this);
            a2.a(1.0f);
            a2.c(j2);
            C0024a c0024a = this.f1821b;
            a.this.f1826g = a2;
            c0024a.f1830b = i2;
            View view = a2.f1642a.get();
            if (view != null) {
                a2.e(view, c0024a);
            }
            return a2;
        }
        e0.o a3 = e0.m.a(this);
        a3.a(0.0f);
        a3.c(j2);
        C0024a c0024a2 = this.f1821b;
        a.this.f1826g = a3;
        c0024a2.f1830b = i2;
        View view2 = a3.f1642a.get();
        if (view2 != null) {
            a3.e(view2, c0024a2);
        }
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.f1826g != null ? this.f1821b.f1830b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1825f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.b.f1219a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.f1824e;
        if (aVar != null) {
            Configuration configuration2 = aVar.f101c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            aVar.f422q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            androidx.appcompat.view.menu.e eVar = aVar.f102d;
            if (eVar != null) {
                eVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1828i = false;
        }
        if (!this.f1828i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1828i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1828i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1827h = false;
        }
        if (!this.f1827h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1827h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1827h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    @Override // android.view.View
    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            e0.o oVar = this.f1826g;
            if (oVar != null) {
                oVar.b();
            }
            super.setVisibility(i2);
        }
    }
}