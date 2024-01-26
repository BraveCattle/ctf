package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f548d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f549e;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, q.a> f550a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f551b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f552c = new HashMap<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f553a;

        /* renamed from: b  reason: collision with root package name */
        public final d f554b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final C0004c f555c = new C0004c();

        /* renamed from: d  reason: collision with root package name */
        public final b f556d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f557e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, q.a> f558f = new HashMap<>();

        public void a(ConstraintLayout.a aVar) {
            b bVar = this.f556d;
            aVar.f499d = bVar.f574h;
            aVar.f501e = bVar.f576i;
            aVar.f503f = bVar.f578j;
            aVar.f505g = bVar.f580k;
            aVar.f507h = bVar.f581l;
            aVar.f509i = bVar.f582m;
            aVar.f511j = bVar.f583n;
            aVar.f513k = bVar.f584o;
            aVar.f515l = bVar.f585p;
            aVar.f520p = bVar.f586q;
            aVar.f521q = bVar.f587r;
            aVar.f522r = bVar.f588s;
            aVar.f523s = bVar.f589t;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.D;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.G;
            aVar.f528x = bVar.O;
            aVar.f529y = bVar.N;
            aVar.f525u = bVar.K;
            aVar.f527w = bVar.M;
            aVar.f530z = bVar.f590u;
            aVar.A = bVar.f591v;
            aVar.f517m = bVar.f593x;
            aVar.f518n = bVar.f594y;
            aVar.f519o = bVar.f595z;
            aVar.B = bVar.f592w;
            aVar.P = bVar.A;
            aVar.Q = bVar.B;
            aVar.E = bVar.P;
            aVar.D = bVar.Q;
            aVar.G = bVar.S;
            aVar.F = bVar.R;
            aVar.S = bVar.f575h0;
            aVar.T = bVar.f577i0;
            aVar.H = bVar.T;
            aVar.I = bVar.U;
            aVar.L = bVar.V;
            aVar.M = bVar.W;
            aVar.J = bVar.X;
            aVar.K = bVar.Y;
            aVar.N = bVar.Z;
            aVar.O = bVar.f561a0;
            aVar.R = bVar.C;
            aVar.f497c = bVar.f572g;
            aVar.f493a = bVar.f568e;
            aVar.f495b = bVar.f570f;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.f564c;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.f566d;
            String str = bVar.f573g0;
            if (str != null) {
                aVar.U = str;
            }
            aVar.setMarginStart(bVar.I);
            aVar.setMarginEnd(this.f556d.H);
            aVar.a();
        }

        public final void b(int i2, ConstraintLayout.a aVar) {
            this.f553a = i2;
            b bVar = this.f556d;
            bVar.f574h = aVar.f499d;
            bVar.f576i = aVar.f501e;
            bVar.f578j = aVar.f503f;
            bVar.f580k = aVar.f505g;
            bVar.f581l = aVar.f507h;
            bVar.f582m = aVar.f509i;
            bVar.f583n = aVar.f511j;
            bVar.f584o = aVar.f513k;
            bVar.f585p = aVar.f515l;
            bVar.f586q = aVar.f520p;
            bVar.f587r = aVar.f521q;
            bVar.f588s = aVar.f522r;
            bVar.f589t = aVar.f523s;
            bVar.f590u = aVar.f530z;
            bVar.f591v = aVar.A;
            bVar.f592w = aVar.B;
            bVar.f593x = aVar.f517m;
            bVar.f594y = aVar.f518n;
            bVar.f595z = aVar.f519o;
            bVar.A = aVar.P;
            bVar.B = aVar.Q;
            bVar.C = aVar.R;
            bVar.f572g = aVar.f497c;
            bVar.f568e = aVar.f493a;
            bVar.f570f = aVar.f495b;
            bVar.f564c = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.f566d = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.P = aVar.E;
            bVar.Q = aVar.D;
            bVar.S = aVar.G;
            bVar.R = aVar.F;
            bVar.f575h0 = aVar.S;
            bVar.f577i0 = aVar.T;
            bVar.T = aVar.H;
            bVar.U = aVar.I;
            bVar.V = aVar.L;
            bVar.W = aVar.M;
            bVar.X = aVar.J;
            bVar.Y = aVar.K;
            bVar.Z = aVar.N;
            bVar.f561a0 = aVar.O;
            bVar.f573g0 = aVar.U;
            bVar.K = aVar.f525u;
            bVar.M = aVar.f527w;
            bVar.J = aVar.f524t;
            bVar.L = aVar.f526v;
            bVar.O = aVar.f528x;
            bVar.N = aVar.f529y;
            bVar.H = aVar.getMarginEnd();
            this.f556d.I = aVar.getMarginStart();
        }

        public final void c(int i2, d.a aVar) {
            b(i2, aVar);
            this.f554b.f607d = aVar.f624m0;
            e eVar = this.f557e;
            eVar.f611b = aVar.f627p0;
            eVar.f612c = aVar.f628q0;
            eVar.f613d = aVar.f629r0;
            eVar.f614e = aVar.f630s0;
            eVar.f615f = aVar.f631t0;
            eVar.f616g = aVar.f632u0;
            eVar.f617h = aVar.f633v0;
            eVar.f618i = aVar.f634w0;
            eVar.f619j = aVar.f635x0;
            eVar.f620k = aVar.f636y0;
            eVar.f622m = aVar.f626o0;
            eVar.f621l = aVar.f625n0;
        }

        public Object clone() {
            a aVar = new a();
            b bVar = aVar.f556d;
            b bVar2 = this.f556d;
            Objects.requireNonNull(bVar);
            bVar.f560a = bVar2.f560a;
            bVar.f564c = bVar2.f564c;
            bVar.f562b = bVar2.f562b;
            bVar.f566d = bVar2.f566d;
            bVar.f568e = bVar2.f568e;
            bVar.f570f = bVar2.f570f;
            bVar.f572g = bVar2.f572g;
            bVar.f574h = bVar2.f574h;
            bVar.f576i = bVar2.f576i;
            bVar.f578j = bVar2.f578j;
            bVar.f580k = bVar2.f580k;
            bVar.f581l = bVar2.f581l;
            bVar.f582m = bVar2.f582m;
            bVar.f583n = bVar2.f583n;
            bVar.f584o = bVar2.f584o;
            bVar.f585p = bVar2.f585p;
            bVar.f586q = bVar2.f586q;
            bVar.f587r = bVar2.f587r;
            bVar.f588s = bVar2.f588s;
            bVar.f589t = bVar2.f589t;
            bVar.f590u = bVar2.f590u;
            bVar.f591v = bVar2.f591v;
            bVar.f592w = bVar2.f592w;
            bVar.f593x = bVar2.f593x;
            bVar.f594y = bVar2.f594y;
            bVar.f595z = bVar2.f595z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f561a0 = bVar2.f561a0;
            bVar.f563b0 = bVar2.f563b0;
            bVar.f565c0 = bVar2.f565c0;
            bVar.f567d0 = bVar2.f567d0;
            bVar.f573g0 = bVar2.f573g0;
            int[] iArr = bVar2.f569e0;
            if (iArr != null) {
                bVar.f569e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f569e0 = null;
            }
            bVar.f571f0 = bVar2.f571f0;
            bVar.f575h0 = bVar2.f575h0;
            bVar.f577i0 = bVar2.f577i0;
            bVar.f579j0 = bVar2.f579j0;
            C0004c c0004c = aVar.f555c;
            C0004c c0004c2 = this.f555c;
            Objects.requireNonNull(c0004c);
            c0004c.f597a = c0004c2.f597a;
            c0004c.f598b = c0004c2.f598b;
            c0004c.f599c = c0004c2.f599c;
            c0004c.f600d = c0004c2.f600d;
            c0004c.f601e = c0004c2.f601e;
            c0004c.f603g = c0004c2.f603g;
            c0004c.f602f = c0004c2.f602f;
            d dVar = aVar.f554b;
            d dVar2 = this.f554b;
            Objects.requireNonNull(dVar);
            dVar.f604a = dVar2.f604a;
            dVar.f605b = dVar2.f605b;
            dVar.f607d = dVar2.f607d;
            dVar.f608e = dVar2.f608e;
            dVar.f606c = dVar2.f606c;
            e eVar = aVar.f557e;
            e eVar2 = this.f557e;
            Objects.requireNonNull(eVar);
            eVar.f610a = eVar2.f610a;
            eVar.f611b = eVar2.f611b;
            eVar.f612c = eVar2.f612c;
            eVar.f613d = eVar2.f613d;
            eVar.f614e = eVar2.f614e;
            eVar.f615f = eVar2.f615f;
            eVar.f616g = eVar2.f616g;
            eVar.f617h = eVar2.f617h;
            eVar.f618i = eVar2.f618i;
            eVar.f619j = eVar2.f619j;
            eVar.f620k = eVar2.f620k;
            eVar.f621l = eVar2.f621l;
            eVar.f622m = eVar2.f622m;
            aVar.f553a = this.f553a;
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: k0  reason: collision with root package name */
        public static SparseIntArray f559k0;

        /* renamed from: c  reason: collision with root package name */
        public int f564c;

        /* renamed from: d  reason: collision with root package name */
        public int f566d;

        /* renamed from: e0  reason: collision with root package name */
        public int[] f569e0;

        /* renamed from: f0  reason: collision with root package name */
        public String f571f0;

        /* renamed from: g0  reason: collision with root package name */
        public String f573g0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f560a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f562b = false;

        /* renamed from: e  reason: collision with root package name */
        public int f568e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f570f = -1;

        /* renamed from: g  reason: collision with root package name */
        public float f572g = -1.0f;

        /* renamed from: h  reason: collision with root package name */
        public int f574h = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f576i = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f578j = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f580k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f581l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f582m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f583n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f584o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f585p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f586q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f587r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f588s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f589t = -1;

        /* renamed from: u  reason: collision with root package name */
        public float f590u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public float f591v = 0.5f;

        /* renamed from: w  reason: collision with root package name */
        public String f592w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f593x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f594y = 0;

        /* renamed from: z  reason: collision with root package name */
        public float f595z = 0.0f;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a0  reason: collision with root package name */
        public float f561a0 = 1.0f;

        /* renamed from: b0  reason: collision with root package name */
        public int f563b0 = -1;

        /* renamed from: c0  reason: collision with root package name */
        public int f565c0 = 0;

        /* renamed from: d0  reason: collision with root package name */
        public int f567d0 = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f575h0 = false;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f577i0 = false;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f579j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f559k0 = sparseIntArray;
            sparseIntArray.append(38, 24);
            f559k0.append(39, 25);
            f559k0.append(41, 28);
            f559k0.append(42, 29);
            f559k0.append(47, 35);
            f559k0.append(46, 34);
            f559k0.append(20, 4);
            f559k0.append(19, 3);
            f559k0.append(17, 1);
            f559k0.append(55, 6);
            f559k0.append(56, 7);
            f559k0.append(27, 17);
            f559k0.append(28, 18);
            f559k0.append(29, 19);
            f559k0.append(0, 26);
            f559k0.append(43, 31);
            f559k0.append(44, 32);
            f559k0.append(26, 10);
            f559k0.append(25, 9);
            f559k0.append(59, 13);
            f559k0.append(62, 16);
            f559k0.append(60, 14);
            f559k0.append(57, 11);
            f559k0.append(61, 15);
            f559k0.append(58, 12);
            f559k0.append(50, 38);
            f559k0.append(36, 37);
            f559k0.append(35, 39);
            f559k0.append(49, 40);
            f559k0.append(34, 20);
            f559k0.append(48, 36);
            f559k0.append(24, 5);
            f559k0.append(37, 76);
            f559k0.append(45, 76);
            f559k0.append(40, 76);
            f559k0.append(18, 76);
            f559k0.append(16, 76);
            f559k0.append(3, 23);
            f559k0.append(5, 27);
            f559k0.append(7, 30);
            f559k0.append(8, 8);
            f559k0.append(4, 33);
            f559k0.append(6, 2);
            f559k0.append(1, 22);
            f559k0.append(2, 21);
            f559k0.append(21, 61);
            f559k0.append(23, 62);
            f559k0.append(22, 63);
            f559k0.append(54, 69);
            f559k0.append(33, 70);
            f559k0.append(12, 71);
            f559k0.append(10, 72);
            f559k0.append(11, 73);
            f559k0.append(13, 74);
            f559k0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2545e);
            this.f562b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = f559k0.get(index);
                if (i3 == 80) {
                    this.f575h0 = obtainStyledAttributes.getBoolean(index, this.f575h0);
                } else if (i3 != 81) {
                    switch (i3) {
                        case 1:
                            int i4 = this.f585p;
                            int[] iArr = c.f548d;
                            int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                            if (resourceId == -1) {
                                resourceId = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f585p = resourceId;
                            continue;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            continue;
                        case 3:
                            int i5 = this.f584o;
                            int[] iArr2 = c.f548d;
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                            if (resourceId2 == -1) {
                                resourceId2 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f584o = resourceId2;
                            continue;
                        case 4:
                            int i6 = this.f583n;
                            int[] iArr3 = c.f548d;
                            int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                            if (resourceId3 == -1) {
                                resourceId3 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f583n = resourceId3;
                            continue;
                        case 5:
                            this.f592w = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            continue;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            continue;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            continue;
                        case 9:
                            int i7 = this.f589t;
                            int[] iArr4 = c.f548d;
                            int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                            if (resourceId4 == -1) {
                                resourceId4 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f589t = resourceId4;
                            continue;
                        case 10:
                            int i8 = this.f588s;
                            int[] iArr5 = c.f548d;
                            int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                            if (resourceId5 == -1) {
                                resourceId5 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f588s = resourceId5;
                            continue;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            continue;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            continue;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        case 17:
                            this.f568e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f568e);
                            continue;
                        case 18:
                            this.f570f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f570f);
                            continue;
                        case 19:
                            this.f572g = obtainStyledAttributes.getFloat(index, this.f572g);
                            continue;
                        case 20:
                            this.f590u = obtainStyledAttributes.getFloat(index, this.f590u);
                            continue;
                        case 21:
                            this.f566d = obtainStyledAttributes.getLayoutDimension(index, this.f566d);
                            continue;
                        case 22:
                            this.f564c = obtainStyledAttributes.getLayoutDimension(index, this.f564c);
                            continue;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            continue;
                        case 24:
                            int i9 = this.f574h;
                            int[] iArr6 = c.f548d;
                            int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                            if (resourceId6 == -1) {
                                resourceId6 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f574h = resourceId6;
                            continue;
                        case 25:
                            int i10 = this.f576i;
                            int[] iArr7 = c.f548d;
                            int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                            if (resourceId7 == -1) {
                                resourceId7 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f576i = resourceId7;
                            continue;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            continue;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 28:
                            int i11 = this.f578j;
                            int[] iArr8 = c.f548d;
                            int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                            if (resourceId8 == -1) {
                                resourceId8 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f578j = resourceId8;
                            continue;
                        case 29:
                            int i12 = this.f580k;
                            int[] iArr9 = c.f548d;
                            int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                            if (resourceId9 == -1) {
                                resourceId9 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f580k = resourceId9;
                            continue;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            continue;
                        case 31:
                            int i13 = this.f586q;
                            int[] iArr10 = c.f548d;
                            int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                            if (resourceId10 == -1) {
                                resourceId10 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f586q = resourceId10;
                            continue;
                        case 32:
                            int i14 = this.f587r;
                            int[] iArr11 = c.f548d;
                            int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                            if (resourceId11 == -1) {
                                resourceId11 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f587r = resourceId11;
                            continue;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            continue;
                        case 34:
                            int i15 = this.f582m;
                            int[] iArr12 = c.f548d;
                            int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                            if (resourceId12 == -1) {
                                resourceId12 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f582m = resourceId12;
                            continue;
                        case 35:
                            int i16 = this.f581l;
                            int[] iArr13 = c.f548d;
                            int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                            if (resourceId13 == -1) {
                                resourceId13 = obtainStyledAttributes.getInt(index, -1);
                            }
                            this.f581l = resourceId13;
                            continue;
                        case 36:
                            this.f591v = obtainStyledAttributes.getFloat(index, this.f591v);
                            continue;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            continue;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            continue;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            continue;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            continue;
                        default:
                            switch (i3) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    continue;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    continue;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    continue;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    continue;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    continue;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    continue;
                                    continue;
                                default:
                                    switch (i3) {
                                        case 61:
                                            int i17 = this.f593x;
                                            int[] iArr14 = c.f548d;
                                            int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                            if (resourceId14 == -1) {
                                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                            }
                                            this.f593x = resourceId14;
                                            continue;
                                        case 62:
                                            this.f594y = obtainStyledAttributes.getDimensionPixelSize(index, this.f594y);
                                            continue;
                                        case 63:
                                            this.f595z = obtainStyledAttributes.getFloat(index, this.f595z);
                                            continue;
                                            continue;
                                        default:
                                            switch (i3) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f561a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f563b0 = obtainStyledAttributes.getInt(index, this.f563b0);
                                                    break;
                                                case 73:
                                                    this.f565c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f565c0);
                                                    break;
                                                case 74:
                                                    this.f571f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f579j0 = obtainStyledAttributes.getBoolean(index, this.f579j0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f559k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                                case 77:
                                                    this.f573g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f559k0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f577i0 = obtainStyledAttributes.getBoolean(index, this.f577i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0004c {

        /* renamed from: h  reason: collision with root package name */
        public static SparseIntArray f596h;

        /* renamed from: a  reason: collision with root package name */
        public boolean f597a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f598b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f599c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f600d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f601e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f602f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f603g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f596h = sparseIntArray;
            sparseIntArray.append(2, 1);
            f596h.append(4, 2);
            f596h.append(5, 3);
            f596h.append(1, 4);
            f596h.append(0, 5);
            f596h.append(3, 6);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2546f);
            this.f597a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f596h.get(index)) {
                    case 1:
                        this.f603g = obtainStyledAttributes.getFloat(index, this.f603g);
                        break;
                    case 2:
                        this.f600d = obtainStyledAttributes.getInt(index, this.f600d);
                        break;
                    case 3:
                        this.f599c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : m.a.f2291a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f601e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.f598b;
                        int[] iArr = c.f548d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f598b = resourceId;
                        break;
                    case 6:
                        this.f602f = obtainStyledAttributes.getFloat(index, this.f602f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f604a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f605b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f606c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f607d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f608e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2547g);
            this.f604a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f607d = obtainStyledAttributes.getFloat(index, this.f607d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f605b);
                    this.f605b = i3;
                    int[] iArr = c.f548d;
                    this.f605b = c.f548d[i3];
                } else if (index == 4) {
                    this.f606c = obtainStyledAttributes.getInt(index, this.f606c);
                } else if (index == 3) {
                    this.f608e = obtainStyledAttributes.getFloat(index, this.f608e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f609n;

        /* renamed from: a  reason: collision with root package name */
        public boolean f610a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f611b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f612c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f613d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f614e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f615f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f616g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f617h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f618i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f619j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f620k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f621l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f622m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f609n = sparseIntArray;
            sparseIntArray.append(6, 1);
            f609n.append(7, 2);
            f609n.append(8, 3);
            f609n.append(4, 4);
            f609n.append(5, 5);
            f609n.append(0, 6);
            f609n.append(1, 7);
            f609n.append(2, 8);
            f609n.append(3, 9);
            f609n.append(9, 10);
            f609n.append(10, 11);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2549i);
            this.f610a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f609n.get(index)) {
                    case 1:
                        this.f611b = obtainStyledAttributes.getFloat(index, this.f611b);
                        break;
                    case 2:
                        this.f612c = obtainStyledAttributes.getFloat(index, this.f612c);
                        break;
                    case 3:
                        this.f613d = obtainStyledAttributes.getFloat(index, this.f613d);
                        break;
                    case 4:
                        this.f614e = obtainStyledAttributes.getFloat(index, this.f614e);
                        break;
                    case 5:
                        this.f615f = obtainStyledAttributes.getFloat(index, this.f615f);
                        break;
                    case 6:
                        this.f616g = obtainStyledAttributes.getDimension(index, this.f616g);
                        break;
                    case 7:
                        this.f617h = obtainStyledAttributes.getDimension(index, this.f617h);
                        break;
                    case 8:
                        this.f618i = obtainStyledAttributes.getDimension(index, this.f618i);
                        break;
                    case 9:
                        this.f619j = obtainStyledAttributes.getDimension(index, this.f619j);
                        break;
                    case 10:
                        this.f620k = obtainStyledAttributes.getDimension(index, this.f620k);
                        break;
                    case 11:
                        this.f621l = true;
                        this.f622m = obtainStyledAttributes.getDimension(index, this.f622m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f549e = sparseIntArray;
        sparseIntArray.append(76, 25);
        f549e.append(77, 26);
        f549e.append(79, 29);
        f549e.append(80, 30);
        f549e.append(86, 36);
        f549e.append(85, 35);
        f549e.append(58, 4);
        f549e.append(57, 3);
        f549e.append(55, 1);
        f549e.append(94, 6);
        f549e.append(95, 7);
        f549e.append(65, 17);
        f549e.append(66, 18);
        f549e.append(67, 19);
        f549e.append(0, 27);
        f549e.append(81, 32);
        f549e.append(82, 33);
        f549e.append(64, 10);
        f549e.append(63, 9);
        f549e.append(98, 13);
        f549e.append(101, 16);
        f549e.append(99, 14);
        f549e.append(96, 11);
        f549e.append(100, 15);
        f549e.append(97, 12);
        f549e.append(89, 40);
        f549e.append(74, 39);
        f549e.append(73, 41);
        f549e.append(88, 42);
        f549e.append(72, 20);
        f549e.append(87, 37);
        f549e.append(62, 5);
        f549e.append(75, 82);
        f549e.append(84, 82);
        f549e.append(78, 82);
        f549e.append(56, 82);
        f549e.append(54, 82);
        f549e.append(5, 24);
        f549e.append(7, 28);
        f549e.append(23, 31);
        f549e.append(24, 8);
        f549e.append(6, 34);
        f549e.append(8, 2);
        f549e.append(3, 23);
        f549e.append(4, 21);
        f549e.append(2, 22);
        f549e.append(13, 43);
        f549e.append(26, 44);
        f549e.append(21, 45);
        f549e.append(22, 46);
        f549e.append(20, 60);
        f549e.append(18, 47);
        f549e.append(19, 48);
        f549e.append(14, 49);
        f549e.append(15, 50);
        f549e.append(16, 51);
        f549e.append(17, 52);
        f549e.append(25, 53);
        f549e.append(90, 54);
        f549e.append(68, 55);
        f549e.append(91, 56);
        f549e.append(69, 57);
        f549e.append(92, 58);
        f549e.append(70, 59);
        f549e.append(59, 61);
        f549e.append(61, 62);
        f549e.append(60, 63);
        f549e.append(27, 64);
        f549e.append(106, 65);
        f549e.append(33, 66);
        f549e.append(107, 67);
        f549e.append(103, 79);
        f549e.append(1, 38);
        f549e.append(102, 68);
        f549e.append(93, 69);
        f549e.append(71, 70);
        f549e.append(31, 71);
        f549e.append(29, 72);
        f549e.append(30, 73);
        f549e.append(32, 74);
        f549e.append(28, 75);
        f549e.append(104, 76);
        f549e.append(83, 77);
        f549e.append(108, 78);
        f549e.append(53, 80);
        f549e.append(52, 81);
    }

    public void a(Context context, int i2) {
        q.a aVar;
        c cVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        cVar.f552c.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.f551b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!cVar.f552c.containsKey(Integer.valueOf(id))) {
                cVar.f552c.put(Integer.valueOf(id), new a());
            }
            a aVar3 = cVar.f552c.get(Integer.valueOf(id));
            HashMap<String, q.a> hashMap = cVar.f550a;
            HashMap<String, q.a> hashMap2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap.keySet()) {
                q.a aVar4 = hashMap.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        aVar = new q.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                    } else {
                        try {
                            aVar = new q.a(aVar4, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                    hashMap2.put(str, aVar);
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                } catch (InvocationTargetException e7) {
                    e = e7;
                }
            }
            aVar3.f558f = hashMap2;
            aVar3.b(id, aVar2);
            aVar3.f554b.f605b = childAt.getVisibility();
            aVar3.f554b.f607d = childAt.getAlpha();
            aVar3.f557e.f611b = childAt.getRotation();
            aVar3.f557e.f612c = childAt.getRotationX();
            aVar3.f557e.f613d = childAt.getRotationY();
            aVar3.f557e.f614e = childAt.getScaleX();
            aVar3.f557e.f615f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar3.f557e;
                eVar.f616g = pivotX;
                eVar.f617h = pivotY;
            }
            aVar3.f557e.f618i = childAt.getTranslationX();
            aVar3.f557e.f619j = childAt.getTranslationY();
            aVar3.f557e.f620k = childAt.getTranslationZ();
            e eVar2 = aVar3.f557e;
            if (eVar2.f621l) {
                eVar2.f622m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) childAt;
                b bVar = aVar3.f556d;
                bVar.f579j0 = aVar5.f541j.f2371h0;
                bVar.f569e0 = aVar5.getReferencedIds();
                aVar3.f556d.f563b0 = aVar5.getType();
                aVar3.f556d.f565c0 = aVar5.getMargin();
            }
            i3++;
            cVar = this;
        }
    }

    public final int[] b(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = q.d.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a c(Context context, AttributeSet attributeSet) {
        C0004c c0004c;
        String str;
        StringBuilder sb;
        String str2;
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.e.f2541a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index != 1 && 23 != index && 24 != index) {
                aVar.f555c.f597a = true;
                aVar.f556d.f562b = true;
                aVar.f554b.f604a = true;
                aVar.f557e.f610a = true;
            }
            switch (f549e.get(index)) {
                case 1:
                    b bVar = aVar.f556d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, bVar.f585p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar.f585p = resourceId;
                    continue;
                case 2:
                    b bVar2 = aVar.f556d;
                    bVar2.G = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.f556d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, bVar3.f584o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar3.f584o = resourceId2;
                    continue;
                case 4:
                    b bVar4 = aVar.f556d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, bVar4.f583n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar4.f583n = resourceId3;
                    continue;
                case 5:
                    aVar.f556d.f592w = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f556d;
                    bVar5.A = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.f556d;
                    bVar6.B = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.f556d;
                    bVar7.H = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.f556d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, bVar8.f589t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar8.f589t = resourceId4;
                    continue;
                case 10:
                    b bVar9 = aVar.f556d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, bVar9.f588s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar9.f588s = resourceId5;
                    continue;
                case 11:
                    b bVar10 = aVar.f556d;
                    bVar10.M = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.f556d;
                    bVar11.N = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.f556d;
                    bVar12.J = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.f556d;
                    bVar13.L = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.f556d;
                    bVar14.O = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.f556d;
                    bVar15.K = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.f556d;
                    bVar16.f568e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f568e);
                    continue;
                case 18:
                    b bVar17 = aVar.f556d;
                    bVar17.f570f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f570f);
                    continue;
                case 19:
                    b bVar18 = aVar.f556d;
                    bVar18.f572g = obtainStyledAttributes.getFloat(index, bVar18.f572g);
                    continue;
                case 20:
                    b bVar19 = aVar.f556d;
                    bVar19.f590u = obtainStyledAttributes.getFloat(index, bVar19.f590u);
                    continue;
                case 21:
                    b bVar20 = aVar.f556d;
                    bVar20.f566d = obtainStyledAttributes.getLayoutDimension(index, bVar20.f566d);
                    continue;
                case 22:
                    d dVar = aVar.f554b;
                    dVar.f605b = obtainStyledAttributes.getInt(index, dVar.f605b);
                    d dVar2 = aVar.f554b;
                    dVar2.f605b = f548d[dVar2.f605b];
                    continue;
                case 23:
                    b bVar21 = aVar.f556d;
                    bVar21.f564c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f564c);
                    continue;
                case 24:
                    b bVar22 = aVar.f556d;
                    bVar22.D = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.f556d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, bVar23.f574h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar23.f574h = resourceId6;
                    continue;
                case 26:
                    b bVar24 = aVar.f556d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, bVar24.f576i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar24.f576i = resourceId7;
                    continue;
                case 27:
                    b bVar25 = aVar.f556d;
                    bVar25.C = obtainStyledAttributes.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.f556d;
                    bVar26.E = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.f556d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, bVar27.f578j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar27.f578j = resourceId8;
                    continue;
                case 30:
                    b bVar28 = aVar.f556d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, bVar28.f580k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar28.f580k = resourceId9;
                    continue;
                case 31:
                    b bVar29 = aVar.f556d;
                    bVar29.I = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case 32:
                    b bVar30 = aVar.f556d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, bVar30.f586q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar30.f586q = resourceId10;
                    continue;
                case 33:
                    b bVar31 = aVar.f556d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, bVar31.f587r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar31.f587r = resourceId11;
                    continue;
                case 34:
                    b bVar32 = aVar.f556d;
                    bVar32.F = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.f556d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, bVar33.f582m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar33.f582m = resourceId12;
                    continue;
                case 36:
                    b bVar34 = aVar.f556d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, bVar34.f581l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar34.f581l = resourceId13;
                    continue;
                case 37:
                    b bVar35 = aVar.f556d;
                    bVar35.f591v = obtainStyledAttributes.getFloat(index, bVar35.f591v);
                    continue;
                case 38:
                    aVar.f553a = obtainStyledAttributes.getResourceId(index, aVar.f553a);
                    continue;
                case 39:
                    b bVar36 = aVar.f556d;
                    bVar36.Q = obtainStyledAttributes.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f556d;
                    bVar37.P = obtainStyledAttributes.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.f556d;
                    bVar38.R = obtainStyledAttributes.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.f556d;
                    bVar39.S = obtainStyledAttributes.getInt(index, bVar39.S);
                    continue;
                case 43:
                    d dVar3 = aVar.f554b;
                    dVar3.f607d = obtainStyledAttributes.getFloat(index, dVar3.f607d);
                    continue;
                case 44:
                    e eVar = aVar.f557e;
                    eVar.f621l = true;
                    eVar.f622m = obtainStyledAttributes.getDimension(index, eVar.f622m);
                    continue;
                case 45:
                    e eVar2 = aVar.f557e;
                    eVar2.f612c = obtainStyledAttributes.getFloat(index, eVar2.f612c);
                    continue;
                case 46:
                    e eVar3 = aVar.f557e;
                    eVar3.f613d = obtainStyledAttributes.getFloat(index, eVar3.f613d);
                    continue;
                case 47:
                    e eVar4 = aVar.f557e;
                    eVar4.f614e = obtainStyledAttributes.getFloat(index, eVar4.f614e);
                    continue;
                case 48:
                    e eVar5 = aVar.f557e;
                    eVar5.f615f = obtainStyledAttributes.getFloat(index, eVar5.f615f);
                    continue;
                case 49:
                    e eVar6 = aVar.f557e;
                    eVar6.f616g = obtainStyledAttributes.getDimension(index, eVar6.f616g);
                    continue;
                case 50:
                    e eVar7 = aVar.f557e;
                    eVar7.f617h = obtainStyledAttributes.getDimension(index, eVar7.f617h);
                    continue;
                case 51:
                    e eVar8 = aVar.f557e;
                    eVar8.f618i = obtainStyledAttributes.getDimension(index, eVar8.f618i);
                    continue;
                case 52:
                    e eVar9 = aVar.f557e;
                    eVar9.f619j = obtainStyledAttributes.getDimension(index, eVar9.f619j);
                    continue;
                case 53:
                    e eVar10 = aVar.f557e;
                    eVar10.f620k = obtainStyledAttributes.getDimension(index, eVar10.f620k);
                    continue;
                case 54:
                    b bVar40 = aVar.f556d;
                    bVar40.T = obtainStyledAttributes.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.f556d;
                    bVar41.U = obtainStyledAttributes.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.f556d;
                    bVar42.V = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.f556d;
                    bVar43.W = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.f556d;
                    bVar44.X = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.f556d;
                    bVar45.Y = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    e eVar11 = aVar.f557e;
                    eVar11.f611b = obtainStyledAttributes.getFloat(index, eVar11.f611b);
                    continue;
                case 61:
                    b bVar46 = aVar.f556d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, bVar46.f593x);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    bVar46.f593x = resourceId14;
                    continue;
                case 62:
                    b bVar47 = aVar.f556d;
                    bVar47.f594y = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.f594y);
                    continue;
                case 63:
                    b bVar48 = aVar.f556d;
                    bVar48.f595z = obtainStyledAttributes.getFloat(index, bVar48.f595z);
                    continue;
                case 64:
                    C0004c c0004c2 = aVar.f555c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, c0004c2.f598b);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    c0004c2.f598b = resourceId15;
                    continue;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        c0004c = aVar.f555c;
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        c0004c = aVar.f555c;
                        str = m.a.f2291a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    c0004c.f599c = str;
                    continue;
                case 66:
                    aVar.f555c.f601e = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    C0004c c0004c3 = aVar.f555c;
                    c0004c3.f603g = obtainStyledAttributes.getFloat(index, c0004c3.f603g);
                    continue;
                case 68:
                    d dVar4 = aVar.f554b;
                    dVar4.f608e = obtainStyledAttributes.getFloat(index, dVar4.f608e);
                    continue;
                case 69:
                    aVar.f556d.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f556d.f561a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    b bVar49 = aVar.f556d;
                    bVar49.f563b0 = obtainStyledAttributes.getInt(index, bVar49.f563b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f556d;
                    bVar50.f565c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f565c0);
                    continue;
                case 74:
                    aVar.f556d.f571f0 = obtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f556d;
                    bVar51.f579j0 = obtainStyledAttributes.getBoolean(index, bVar51.f579j0);
                    continue;
                case 76:
                    C0004c c0004c4 = aVar.f555c;
                    c0004c4.f600d = obtainStyledAttributes.getInt(index, c0004c4.f600d);
                    continue;
                case 77:
                    aVar.f556d.f573g0 = obtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    d dVar5 = aVar.f554b;
                    dVar5.f606c = obtainStyledAttributes.getInt(index, dVar5.f606c);
                    continue;
                case 79:
                    C0004c c0004c5 = aVar.f555c;
                    c0004c5.f602f = obtainStyledAttributes.getFloat(index, c0004c5.f602f);
                    continue;
                case 80:
                    b bVar52 = aVar.f556d;
                    bVar52.f575h0 = obtainStyledAttributes.getBoolean(index, bVar52.f575h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f556d;
                    bVar53.f577i0 = obtainStyledAttributes.getBoolean(index, bVar53.f577i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f549e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void d(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a c2 = c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2.f556d.f560a = true;
                    }
                    this.f552c.put(Integer.valueOf(c2.f553a), c2);
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}