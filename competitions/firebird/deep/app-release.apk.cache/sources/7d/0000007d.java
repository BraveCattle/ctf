package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import o.g;
import o.h;
import o.i;
import o.j;
import o.l;
import p.b;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f478b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<androidx.constraintlayout.widget.b> f479c;

    /* renamed from: d  reason: collision with root package name */
    public o.f f480d;

    /* renamed from: e  reason: collision with root package name */
    public int f481e;

    /* renamed from: f  reason: collision with root package name */
    public int f482f;

    /* renamed from: g  reason: collision with root package name */
    public int f483g;

    /* renamed from: h  reason: collision with root package name */
    public int f484h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f485i;

    /* renamed from: j  reason: collision with root package name */
    public int f486j;

    /* renamed from: k  reason: collision with root package name */
    public c f487k;

    /* renamed from: l  reason: collision with root package name */
    public q.b f488l;

    /* renamed from: m  reason: collision with root package name */
    public int f489m;

    /* renamed from: n  reason: collision with root package name */
    public HashMap<String, Integer> f490n;

    /* renamed from: o  reason: collision with root package name */
    public SparseArray<o.e> f491o;

    /* renamed from: p  reason: collision with root package name */
    public b f492p;

    /* loaded from: classes.dex */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float A;
        public String B;
        public int C;
        public float D;
        public float E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public float N;
        public float O;
        public int P;
        public int Q;
        public int R;
        public boolean S;
        public boolean T;
        public String U;
        public boolean V;
        public boolean W;
        public boolean X;
        public boolean Y;
        public boolean Z;

        /* renamed from: a  reason: collision with root package name */
        public int f493a;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f494a0;

        /* renamed from: b  reason: collision with root package name */
        public int f495b;

        /* renamed from: b0  reason: collision with root package name */
        public int f496b0;

        /* renamed from: c  reason: collision with root package name */
        public float f497c;

        /* renamed from: c0  reason: collision with root package name */
        public int f498c0;

        /* renamed from: d  reason: collision with root package name */
        public int f499d;

        /* renamed from: d0  reason: collision with root package name */
        public int f500d0;

        /* renamed from: e  reason: collision with root package name */
        public int f501e;

        /* renamed from: e0  reason: collision with root package name */
        public int f502e0;

        /* renamed from: f  reason: collision with root package name */
        public int f503f;

        /* renamed from: f0  reason: collision with root package name */
        public int f504f0;

        /* renamed from: g  reason: collision with root package name */
        public int f505g;

        /* renamed from: g0  reason: collision with root package name */
        public int f506g0;

        /* renamed from: h  reason: collision with root package name */
        public int f507h;

        /* renamed from: h0  reason: collision with root package name */
        public float f508h0;

        /* renamed from: i  reason: collision with root package name */
        public int f509i;

        /* renamed from: i0  reason: collision with root package name */
        public int f510i0;

        /* renamed from: j  reason: collision with root package name */
        public int f511j;

        /* renamed from: j0  reason: collision with root package name */
        public int f512j0;

        /* renamed from: k  reason: collision with root package name */
        public int f513k;

        /* renamed from: k0  reason: collision with root package name */
        public float f514k0;

        /* renamed from: l  reason: collision with root package name */
        public int f515l;

        /* renamed from: l0  reason: collision with root package name */
        public o.e f516l0;

        /* renamed from: m  reason: collision with root package name */
        public int f517m;

        /* renamed from: n  reason: collision with root package name */
        public int f518n;

        /* renamed from: o  reason: collision with root package name */
        public float f519o;

        /* renamed from: p  reason: collision with root package name */
        public int f520p;

        /* renamed from: q  reason: collision with root package name */
        public int f521q;

        /* renamed from: r  reason: collision with root package name */
        public int f522r;

        /* renamed from: s  reason: collision with root package name */
        public int f523s;

        /* renamed from: t  reason: collision with root package name */
        public int f524t;

        /* renamed from: u  reason: collision with root package name */
        public int f525u;

        /* renamed from: v  reason: collision with root package name */
        public int f526v;

        /* renamed from: w  reason: collision with root package name */
        public int f527w;

        /* renamed from: x  reason: collision with root package name */
        public int f528x;

        /* renamed from: y  reason: collision with root package name */
        public int f529y;

        /* renamed from: z  reason: collision with root package name */
        public float f530z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0003a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f531a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f531a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
            this.f493a = -1;
            this.f495b = -1;
            this.f497c = -1.0f;
            this.f499d = -1;
            this.f501e = -1;
            this.f503f = -1;
            this.f505g = -1;
            this.f507h = -1;
            this.f509i = -1;
            this.f511j = -1;
            this.f513k = -1;
            this.f515l = -1;
            this.f517m = -1;
            this.f518n = 0;
            this.f519o = 0.0f;
            this.f520p = -1;
            this.f521q = -1;
            this.f522r = -1;
            this.f523s = -1;
            this.f524t = -1;
            this.f525u = -1;
            this.f526v = -1;
            this.f527w = -1;
            this.f528x = -1;
            this.f529y = -1;
            this.f530z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f494a0 = false;
            this.f496b0 = -1;
            this.f498c0 = -1;
            this.f500d0 = -1;
            this.f502e0 = -1;
            this.f504f0 = -1;
            this.f506g0 = -1;
            this.f508h0 = 0.5f;
            this.f516l0 = new o.e();
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            this.f493a = -1;
            this.f495b = -1;
            this.f497c = -1.0f;
            this.f499d = -1;
            this.f501e = -1;
            this.f503f = -1;
            this.f505g = -1;
            this.f507h = -1;
            this.f509i = -1;
            this.f511j = -1;
            this.f513k = -1;
            this.f515l = -1;
            this.f517m = -1;
            this.f518n = 0;
            this.f519o = 0.0f;
            this.f520p = -1;
            this.f521q = -1;
            this.f522r = -1;
            this.f523s = -1;
            this.f524t = -1;
            this.f525u = -1;
            this.f526v = -1;
            this.f527w = -1;
            this.f528x = -1;
            this.f529y = -1;
            this.f530z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f494a0 = false;
            this.f496b0 = -1;
            this.f498c0 = -1;
            this.f500d0 = -1;
            this.f502e0 = -1;
            this.f504f0 = -1;
            this.f506g0 = -1;
            this.f508h0 = 0.5f;
            this.f516l0 = new o.e();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2542b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0003a.f531a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f517m);
                        this.f517m = resourceId;
                        if (resourceId == -1) {
                            this.f517m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f518n = obtainStyledAttributes.getDimensionPixelSize(index, this.f518n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.f519o) % 360.0f;
                        this.f519o = f2;
                        if (f2 < 0.0f) {
                            this.f519o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f493a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f493a);
                        continue;
                    case 6:
                        this.f495b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f495b);
                        continue;
                    case 7:
                        this.f497c = obtainStyledAttributes.getFloat(index, this.f497c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f499d);
                        this.f499d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f499d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f501e);
                        this.f501e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f501e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f503f);
                        this.f503f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f503f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f505g);
                        this.f505g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f505g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f507h);
                        this.f507h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f507h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f509i);
                        this.f509i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f509i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f511j);
                        this.f511j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f511j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f513k);
                        this.f513k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f513k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f515l);
                        this.f515l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f515l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f520p);
                        this.f520p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f520p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f521q);
                        this.f521q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f521q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f522r);
                        this.f522r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f522r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f523s);
                        this.f523s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f523s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f524t = obtainStyledAttributes.getDimensionPixelSize(index, this.f524t);
                        continue;
                    case 22:
                        this.f525u = obtainStyledAttributes.getDimensionPixelSize(index, this.f525u);
                        continue;
                    case 23:
                        this.f526v = obtainStyledAttributes.getDimensionPixelSize(index, this.f526v);
                        continue;
                    case 24:
                        this.f527w = obtainStyledAttributes.getDimensionPixelSize(index, this.f527w);
                        continue;
                    case 25:
                        this.f528x = obtainStyledAttributes.getDimensionPixelSize(index, this.f528x);
                        continue;
                    case 26:
                        this.f529y = obtainStyledAttributes.getDimensionPixelSize(index, this.f529y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.f530z = obtainStyledAttributes.getFloat(index, this.f530z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        this.H = 2;
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        this.I = 2;
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.B.substring(i2, indexOf2);
                                        String substring3 = this.B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.B.substring(i2);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(substring4);
                                            continue;
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                continue;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                            case 51:
                                this.U = obtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f493a = -1;
            this.f495b = -1;
            this.f497c = -1.0f;
            this.f499d = -1;
            this.f501e = -1;
            this.f503f = -1;
            this.f505g = -1;
            this.f507h = -1;
            this.f509i = -1;
            this.f511j = -1;
            this.f513k = -1;
            this.f515l = -1;
            this.f517m = -1;
            this.f518n = 0;
            this.f519o = 0.0f;
            this.f520p = -1;
            this.f521q = -1;
            this.f522r = -1;
            this.f523s = -1;
            this.f524t = -1;
            this.f525u = -1;
            this.f526v = -1;
            this.f527w = -1;
            this.f528x = -1;
            this.f529y = -1;
            this.f530z = 0.5f;
            this.A = 0.5f;
            this.B = null;
            this.C = 1;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = 0;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = 1.0f;
            this.O = 1.0f;
            this.P = -1;
            this.Q = -1;
            this.R = -1;
            this.S = false;
            this.T = false;
            this.U = null;
            this.V = true;
            this.W = true;
            this.X = false;
            this.Y = false;
            this.Z = false;
            this.f494a0 = false;
            this.f496b0 = -1;
            this.f498c0 = -1;
            this.f500d0 = -1;
            this.f502e0 = -1;
            this.f504f0 = -1;
            this.f506g0 = -1;
            this.f508h0 = 0.5f;
            this.f516l0 = new o.e();
        }

        public void a() {
            this.Y = false;
            this.V = true;
            this.W = true;
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == -2 && this.S) {
                this.V = false;
                if (this.H == 0) {
                    this.H = 1;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == -2 && this.T) {
                this.W = false;
                if (this.I == 0) {
                    this.I = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.V = false;
                if (i2 == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.W = false;
                if (i3 == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f497c == -1.0f && this.f493a == -1 && this.f495b == -1) {
                return;
            }
            this.Y = true;
            this.V = true;
            this.W = true;
            if (!(this.f516l0 instanceof g)) {
                this.f516l0 = new g();
            }
            ((g) this.f516l0).E(this.R);
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x00ce, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d0, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r9).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00dd, code lost:
            if (r1 > 0) goto L50;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.InterfaceC0032b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f532a;

        /* renamed from: b  reason: collision with root package name */
        public int f533b;

        /* renamed from: c  reason: collision with root package name */
        public int f534c;

        /* renamed from: d  reason: collision with root package name */
        public int f535d;

        /* renamed from: e  reason: collision with root package name */
        public int f536e;

        /* renamed from: f  reason: collision with root package name */
        public int f537f;

        /* renamed from: g  reason: collision with root package name */
        public int f538g;

        public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f532a = constraintLayout2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0174  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x0187 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01a0  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x01bc  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x01ea  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x01ef  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x01fc  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0206  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x020e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:155:0x0219 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0223 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:168:0x0248  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x024a  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0262  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0158 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0160 A[ADDED_TO_REGION] */
        @android.annotation.SuppressLint({"WrongCall"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(o.e r21, p.b.a r22) {
            /*
                Method dump skipped, instructions count: 629
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.a(o.e, p.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f478b = new SparseArray<>();
        this.f479c = new ArrayList<>(4);
        this.f480d = new o.f();
        this.f481e = 0;
        this.f482f = 0;
        this.f483g = Integer.MAX_VALUE;
        this.f484h = Integer.MAX_VALUE;
        this.f485i = true;
        this.f486j = 263;
        this.f487k = null;
        this.f488l = null;
        this.f489m = -1;
        this.f490n = new HashMap<>();
        this.f491o = new SparseArray<>();
        b bVar = new b(this, this);
        this.f492p = bVar;
        o.f fVar = this.f480d;
        fVar.W = this;
        fVar.f2441h0 = bVar;
        fVar.f2440g0.f2483f = bVar;
        this.f478b.put(getId(), this);
        this.f487k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.e.f2542b, 0, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 9) {
                    this.f481e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f481e);
                } else if (index == 10) {
                    this.f482f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f482f);
                } else if (index == 7) {
                    this.f483g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f483g);
                } else if (index == 8) {
                    this.f484h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f484h);
                } else if (index == 89) {
                    this.f486j = obtainStyledAttributes.getInt(index, this.f486j);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f488l = new q.b(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f488l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.f487k = cVar;
                        cVar.d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f487k = null;
                    }
                    this.f489m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f480d.J(this.f486j);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:157:0x02ff -> B:158:0x0300). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r19, android.view.View r20, o.e r21, androidx.constraintlayout.widget.ConstraintLayout.a r22, android.util.SparseArray<o.e> r23) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a(boolean, android.view.View, o.e, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f490n;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.f490n.get(str);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.f478b.get(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f479c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                Objects.requireNonNull(this.f479c.get(i2));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((parseInt / 1080.0f) * width);
                        int i5 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i4;
                        float f3 = i5;
                        float f4 = i4 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i5 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public final o.e e(View view) {
        if (view == this) {
            return this.f480d;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).f516l0;
    }

    public boolean f() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f485i = true;
        super.forceLayout();
    }

    public void g(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f490n == null) {
                this.f490n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f490n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f484h;
    }

    public int getMaxWidth() {
        return this.f483g;
    }

    public int getMinHeight() {
        return this.f482f;
    }

    public int getMinWidth() {
        return this.f481e;
    }

    public int getOptimizationLevel() {
        return this.f480d.f2450q0;
    }

    public final boolean h() {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        String str;
        int d2;
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        int i6;
        String str2;
        String resourceName;
        int id;
        o.e eVar;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = 1;
            if (i8 >= childCount) {
                z2 = false;
                break;
            } else if (getChildAt(i8).isLayoutRequested()) {
                z2 = true;
                break;
            } else {
                i8++;
            }
        }
        if (z2) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i9 = 0; i9 < childCount2; i9++) {
                o.e e2 = e(getChildAt(i9));
                if (e2 != null) {
                    e2.u();
                }
            }
            int i10 = -1;
            if (isInEditMode) {
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt = getChildAt(i11);
                    try {
                        resourceName = getResources().getResourceName(childAt.getId());
                        g(0, resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        id = childAt.getId();
                    } catch (Resources.NotFoundException unused) {
                    }
                    if (id != 0) {
                        View view = this.f478b.get(id);
                        if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                            onViewAdded(view);
                        }
                        if (view != this) {
                            eVar = view == null ? null : ((a) view.getLayoutParams()).f516l0;
                            eVar.Y = resourceName;
                        }
                    }
                    eVar = this.f480d;
                    eVar.Y = resourceName;
                }
            }
            if (this.f489m != -1) {
                for (int i12 = 0; i12 < childCount2; i12++) {
                    View childAt2 = getChildAt(i12);
                    if (childAt2.getId() == this.f489m && (childAt2 instanceof d)) {
                        this.f487k = ((d) childAt2).getConstraintSet();
                    }
                }
            }
            c cVar = this.f487k;
            if (cVar != null) {
                int childCount3 = getChildCount();
                HashSet hashSet = new HashSet(cVar.f552c.keySet());
                while (i7 < childCount3) {
                    View childAt3 = getChildAt(i7);
                    int id2 = childAt3.getId();
                    if (!cVar.f552c.containsKey(Integer.valueOf(id2))) {
                        StringBuilder a2 = c.f.a("id unknown ");
                        try {
                            str2 = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                        } catch (Exception unused2) {
                            str2 = "UNKNOWN";
                        }
                        a2.append(str2);
                        Log.w("ConstraintSet", a2.toString());
                    } else if (cVar.f551b && id2 == i10) {
                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    } else {
                        if (id2 != i10) {
                            if (cVar.f552c.containsKey(Integer.valueOf(id2))) {
                                hashSet.remove(Integer.valueOf(id2));
                                c.a aVar = cVar.f552c.get(Integer.valueOf(id2));
                                if (childAt3 instanceof androidx.constraintlayout.widget.a) {
                                    aVar.f556d.f567d0 = i2;
                                }
                                int i13 = aVar.f556d.f567d0;
                                if (i13 != i10 && i13 == i2) {
                                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt3;
                                    aVar2.setId(id2);
                                    aVar2.setType(aVar.f556d.f563b0);
                                    aVar2.setMargin(aVar.f556d.f565c0);
                                    aVar2.setAllowsGoneWidget(aVar.f556d.f579j0);
                                    c.b bVar = aVar.f556d;
                                    int[] iArr = bVar.f569e0;
                                    if (iArr != null) {
                                        aVar2.setReferencedIds(iArr);
                                    } else {
                                        String str3 = bVar.f571f0;
                                        if (str3 != null) {
                                            bVar.f569e0 = cVar.b(aVar2, str3);
                                            aVar2.setReferencedIds(aVar.f556d.f569e0);
                                        }
                                    }
                                }
                                a aVar3 = (a) childAt3.getLayoutParams();
                                aVar3.a();
                                aVar.a(aVar3);
                                HashMap<String, q.a> hashMap = aVar.f558f;
                                i4 = childCount3;
                                Class<?> cls = childAt3.getClass();
                                for (String str4 : hashMap.keySet()) {
                                    boolean z7 = z2;
                                    q.a aVar4 = hashMap.get(str4);
                                    HashMap<String, q.a> hashMap2 = hashMap;
                                    String a3 = f.f.a("set", str4);
                                    boolean z8 = isInEditMode;
                                    try {
                                    } catch (IllegalAccessException e3) {
                                        e = e3;
                                        i6 = childCount2;
                                    } catch (NoSuchMethodException e4) {
                                        e = e4;
                                        i6 = childCount2;
                                    } catch (InvocationTargetException e5) {
                                        e = e5;
                                        i6 = childCount2;
                                    }
                                    switch (n.g.a(aVar4.f2525b)) {
                                        case 0:
                                            i6 = childCount2;
                                            cls.getMethod(a3, Integer.TYPE).invoke(childAt3, Integer.valueOf(aVar4.f2526c));
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 1:
                                            i6 = childCount2;
                                            cls.getMethod(a3, Float.TYPE).invoke(childAt3, Float.valueOf(aVar4.f2527d));
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 2:
                                            i6 = childCount2;
                                            cls.getMethod(a3, Integer.TYPE).invoke(childAt3, Integer.valueOf(aVar4.f2530g));
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 3:
                                            i6 = childCount2;
                                            Method method = cls.getMethod(a3, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(aVar4.f2530g);
                                            method.invoke(childAt3, colorDrawable);
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 4:
                                            i6 = childCount2;
                                            cls.getMethod(a3, CharSequence.class).invoke(childAt3, aVar4.f2528e);
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 5:
                                            i6 = childCount2;
                                            cls.getMethod(a3, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(aVar4.f2529f));
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                            break;
                                        case 6:
                                            i6 = childCount2;
                                            try {
                                                cls.getMethod(a3, Float.TYPE).invoke(childAt3, Float.valueOf(aVar4.f2527d));
                                            } catch (IllegalAccessException e6) {
                                                e = e6;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z2 = z7;
                                                hashMap = hashMap2;
                                                isInEditMode = z8;
                                                childCount2 = i6;
                                            } catch (NoSuchMethodException e7) {
                                                e = e7;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(cls.getName());
                                                sb.append(" must have a method ");
                                                sb.append(a3);
                                                Log.e("TransitionLayout", sb.toString());
                                                z2 = z7;
                                                hashMap = hashMap2;
                                                isInEditMode = z8;
                                                childCount2 = i6;
                                            } catch (InvocationTargetException e8) {
                                                e = e8;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str4 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z2 = z7;
                                                hashMap = hashMap2;
                                                isInEditMode = z8;
                                                childCount2 = i6;
                                            }
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            childCount2 = i6;
                                        default:
                                            z2 = z7;
                                            hashMap = hashMap2;
                                            isInEditMode = z8;
                                            break;
                                    }
                                }
                                z5 = z2;
                                z6 = isInEditMode;
                                i5 = childCount2;
                                childAt3.setLayoutParams(aVar3);
                                c.d dVar = aVar.f554b;
                                if (dVar.f606c == 0) {
                                    childAt3.setVisibility(dVar.f605b);
                                }
                                childAt3.setAlpha(aVar.f554b.f607d);
                                childAt3.setRotation(aVar.f557e.f611b);
                                childAt3.setRotationX(aVar.f557e.f612c);
                                childAt3.setRotationY(aVar.f557e.f613d);
                                childAt3.setScaleX(aVar.f557e.f614e);
                                childAt3.setScaleY(aVar.f557e.f615f);
                                if (!Float.isNaN(aVar.f557e.f616g)) {
                                    childAt3.setPivotX(aVar.f557e.f616g);
                                }
                                if (!Float.isNaN(aVar.f557e.f617h)) {
                                    childAt3.setPivotY(aVar.f557e.f617h);
                                }
                                childAt3.setTranslationX(aVar.f557e.f618i);
                                childAt3.setTranslationY(aVar.f557e.f619j);
                                childAt3.setTranslationZ(aVar.f557e.f620k);
                                c.e eVar2 = aVar.f557e;
                                if (eVar2.f621l) {
                                    childAt3.setElevation(eVar2.f622m);
                                }
                            } else {
                                i4 = childCount3;
                                z5 = z2;
                                z6 = isInEditMode;
                                i5 = childCount2;
                                Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                            }
                            i7++;
                            i10 = -1;
                            i2 = 1;
                            childCount3 = i4;
                            z2 = z5;
                            isInEditMode = z6;
                            childCount2 = i5;
                        }
                    }
                    i4 = childCount3;
                    z5 = z2;
                    z6 = isInEditMode;
                    i5 = childCount2;
                    i7++;
                    i10 = -1;
                    i2 = 1;
                    childCount3 = i4;
                    z2 = z5;
                    isInEditMode = z6;
                    childCount2 = i5;
                }
                z3 = z2;
                z4 = isInEditMode;
                i3 = childCount2;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    c.a aVar5 = cVar.f552c.get(num);
                    int i14 = aVar5.f556d.f567d0;
                    if (i14 != -1 && i14 == 1) {
                        androidx.constraintlayout.widget.a aVar6 = new androidx.constraintlayout.widget.a(getContext());
                        aVar6.setId(num.intValue());
                        c.b bVar2 = aVar5.f556d;
                        int[] iArr2 = bVar2.f569e0;
                        if (iArr2 != null) {
                            aVar6.setReferencedIds(iArr2);
                        } else {
                            String str5 = bVar2.f571f0;
                            if (str5 != null) {
                                bVar2.f569e0 = cVar.b(aVar6, str5);
                                aVar6.setReferencedIds(aVar5.f556d.f569e0);
                            }
                        }
                        aVar6.setType(aVar5.f556d.f563b0);
                        aVar6.setMargin(aVar5.f556d.f565c0);
                        a generateDefaultLayoutParams = generateDefaultLayoutParams();
                        aVar6.g();
                        aVar5.a(generateDefaultLayoutParams);
                        addView(aVar6, generateDefaultLayoutParams);
                    }
                    if (aVar5.f556d.f560a) {
                        View eVar3 = new e(getContext());
                        eVar3.setId(num.intValue());
                        a generateDefaultLayoutParams2 = generateDefaultLayoutParams();
                        aVar5.a(generateDefaultLayoutParams2);
                        addView(eVar3, generateDefaultLayoutParams2);
                    }
                }
            } else {
                z3 = z2;
                z4 = isInEditMode;
                i3 = childCount2;
            }
            this.f480d.f2461e0.clear();
            int size = this.f479c.size();
            if (size > 0) {
                for (int i15 = 0; i15 < size; i15++) {
                    androidx.constraintlayout.widget.b bVar3 = this.f479c.get(i15);
                    if (bVar3.isInEditMode()) {
                        bVar3.setIds(bVar3.f546f);
                    }
                    h hVar = bVar3.f545e;
                    if (hVar != null) {
                        i iVar = (i) hVar;
                        iVar.f2459f0 = 0;
                        Arrays.fill(iVar.f2458e0, (Object) null);
                        for (int i16 = 0; i16 < bVar3.f543c; i16++) {
                            int i17 = bVar3.f542b[i16];
                            View d3 = d(i17);
                            if (d3 == null && (d2 = bVar3.d(this, (str = bVar3.f547g.get(Integer.valueOf(i17))))) != 0) {
                                bVar3.f542b[i16] = d2;
                                bVar3.f547g.put(Integer.valueOf(d2), str);
                                d3 = d(d2);
                            }
                            if (d3 != null) {
                                h hVar2 = bVar3.f545e;
                                o.e e9 = e(d3);
                                i iVar2 = (i) hVar2;
                                Objects.requireNonNull(iVar2);
                                if (e9 != iVar2 && e9 != null) {
                                    int i18 = iVar2.f2459f0 + 1;
                                    o.e[] eVarArr = iVar2.f2458e0;
                                    if (i18 > eVarArr.length) {
                                        iVar2.f2458e0 = (o.e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
                                    }
                                    o.e[] eVarArr2 = iVar2.f2458e0;
                                    int i19 = iVar2.f2459f0;
                                    eVarArr2[i19] = e9;
                                    iVar2.f2459f0 = i19 + 1;
                                }
                            }
                        }
                        bVar3.f545e.a(this.f480d);
                    }
                }
            }
            int i20 = i3;
            for (int i21 = 0; i21 < i20; i21++) {
                View childAt4 = getChildAt(i21);
                if (childAt4 instanceof f) {
                    f fVar = (f) childAt4;
                    if (fVar.f637b == -1 && !fVar.isInEditMode()) {
                        fVar.setVisibility(fVar.f639d);
                    }
                    View findViewById = findViewById(fVar.f637b);
                    fVar.f638c = findViewById;
                    if (findViewById != null) {
                        ((a) findViewById.getLayoutParams()).f494a0 = true;
                        fVar.f638c.setVisibility(0);
                        fVar.setVisibility(0);
                    }
                }
            }
            this.f491o.clear();
            this.f491o.put(0, this.f480d);
            this.f491o.put(getId(), this.f480d);
            for (int i22 = 0; i22 < i20; i22++) {
                View childAt5 = getChildAt(i22);
                this.f491o.put(childAt5.getId(), e(childAt5));
            }
            for (int i23 = 0; i23 < i20; i23++) {
                View childAt6 = getChildAt(i23);
                o.e e10 = e(childAt6);
                if (e10 != null) {
                    a aVar7 = (a) childAt6.getLayoutParams();
                    o.f fVar2 = this.f480d;
                    fVar2.f2461e0.add(e10);
                    o.e eVar4 = e10.K;
                    if (eVar4 != null) {
                        ((l) eVar4).f2461e0.remove(e10);
                        e10.K = null;
                    }
                    e10.K = fVar2;
                    a(z4, childAt6, e10, aVar7, this.f491o);
                }
            }
            return z3;
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            o.e eVar = aVar.f516l0;
            if ((childAt.getVisibility() != 8 || aVar.Y || aVar.Z || isInEditMode) && !aVar.f494a0) {
                int p2 = eVar.p();
                int q2 = eVar.q();
                int o2 = eVar.o() + p2;
                int i7 = eVar.i() + q2;
                childAt.layout(p2, q2, o2, i7);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(p2, q2, o2, i7);
                }
            }
        }
        int size = this.f479c.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                Objects.requireNonNull(this.f479c.get(i8));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        o.e e2 = e(view);
        if ((view instanceof e) && !(e2 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.f516l0 = gVar;
            aVar.Y = true;
            gVar.E(aVar.R);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar = (androidx.constraintlayout.widget.b) view;
            bVar.g();
            ((a) view.getLayoutParams()).Z = true;
            if (!this.f479c.contains(bVar)) {
                this.f479c.add(bVar);
            }
        }
        this.f478b.put(view.getId(), view);
        this.f485i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f478b.remove(view.getId());
        o.e e2 = e(view);
        this.f480d.f2461e0.remove(e2);
        e2.K = null;
        this.f479c.remove(view);
        this.f485i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f485i = true;
        super.requestLayout();
    }

    public void setConstraintSet(c cVar) {
        this.f487k = cVar;
    }

    @Override // android.view.View
    public void setId(int i2) {
        this.f478b.remove(getId());
        super.setId(i2);
        this.f478b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 == this.f484h) {
            return;
        }
        this.f484h = i2;
        requestLayout();
    }

    public void setMaxWidth(int i2) {
        if (i2 == this.f483g) {
            return;
        }
        this.f483g = i2;
        requestLayout();
    }

    public void setMinHeight(int i2) {
        if (i2 == this.f482f) {
            return;
        }
        this.f482f = i2;
        requestLayout();
    }

    public void setMinWidth(int i2) {
        if (i2 == this.f481e) {
            return;
        }
        this.f481e = i2;
        requestLayout();
    }

    public void setOnConstraintsChanged(q.c cVar) {
        q.b bVar = this.f488l;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f486j = i2;
        this.f480d.f2450q0 = i2;
        n.d.f2316p = j.a(i2, 256);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}