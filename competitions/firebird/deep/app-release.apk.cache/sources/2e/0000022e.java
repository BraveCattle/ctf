package h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1878a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1879b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1880c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1881d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1882e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1883f;

    public h(CompoundButton compoundButton) {
        this.f1878a = compoundButton;
    }

    public void a() {
        Drawable buttonDrawable = this.f1878a.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1881d || this.f1882e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1881d) {
                    mutate.setTintList(this.f1879b);
                }
                if (this.f1882e) {
                    mutate.setTintMode(this.f1880c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1878a.getDrawableState());
                }
                this.f1878a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0063, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x001c, B:5:0x0022, B:7:0x0028, B:11:0x0039, B:13:0x003f, B:15:0x0045, B:16:0x0052, B:18:0x0059, B:21:0x0065, B:23:0x006c), top: B:31:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[Catch: all -> 0x0063, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:3:0x001c, B:5:0x0022, B:7:0x0028, B:11:0x0039, B:13:0x003f, B:15:0x0045, B:16:0x0052, B:18:0x0059, B:21:0x0065, B:23:0x006c), top: B:31:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f1878a
            android.content.Context r0 = r0.getContext()
            int[] r3 = b.b.f1230l
            r8 = 0
            h.u0 r0 = h.u0.o(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f1878a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f2006b
            r7 = 0
            r4 = r10
            r6 = r11
            e0.m.e(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.m(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L36
            int r11 = r0.j(r10, r8)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L36
            android.widget.CompoundButton r1 = r9.f1878a     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            android.content.Context r2 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r11 = d.a.a(r2, r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            r1.setButtonDrawable(r11)     // Catch: android.content.res.Resources.NotFoundException -> L36 java.lang.Throwable -> L63
            goto L37
        L36:
            r10 = r8
        L37:
            if (r10 != 0) goto L52
            boolean r10 = r0.m(r8)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L52
            int r10 = r0.j(r8, r8)     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto L52
            android.widget.CompoundButton r11 = r9.f1878a     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L63
            android.graphics.drawable.Drawable r10 = d.a.a(r1, r10)     // Catch: java.lang.Throwable -> L63
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L63
        L52:
            r10 = 2
            boolean r11 = r0.m(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L65
            android.widget.CompoundButton r11 = r9.f1878a     // Catch: java.lang.Throwable -> L63
            android.content.res.ColorStateList r10 = r0.b(r10)     // Catch: java.lang.Throwable -> L63
            r11.setButtonTintList(r10)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r10 = move-exception
            goto L81
        L65:
            r10 = 3
            boolean r11 = r0.m(r10)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L7b
            android.widget.CompoundButton r11 = r9.f1878a     // Catch: java.lang.Throwable -> L63
            r1 = -1
            int r10 = r0.h(r10, r1)     // Catch: java.lang.Throwable -> L63
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = h.d0.b(r10, r1)     // Catch: java.lang.Throwable -> L63
            r11.setButtonTintMode(r10)     // Catch: java.lang.Throwable -> L63
        L7b:
            android.content.res.TypedArray r10 = r0.f2006b
            r10.recycle()
            return
        L81:
            android.content.res.TypedArray r11 = r0.f2006b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.b(android.util.AttributeSet, int):void");
    }
}