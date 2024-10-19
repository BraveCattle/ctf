package b0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import b0.f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import l.h;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final l.f<String, Typeface> f1257a = new l.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final f f1258b = new f("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1259c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<f.c<d>>> f1260d = new h<>();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator<byte[]> f1261e = new a();

    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    if (bArr3[i4] != bArr4[i4]) {
                        i2 = bArr3[i4];
                        i3 = bArr4[i4];
                    }
                }
                return 0;
            }
            i2 = bArr3.length;
            i3 = bArr4.length;
            return i2 - i3;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1262a;

        /* renamed from: b  reason: collision with root package name */
        public final c[] f1263b;

        public b(int i2, c[] cVarArr) {
            this.f1262a = i2;
            this.f1263b = cVarArr;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f1264a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1265b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1266c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1267d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1268e;

        public c(Uri uri, int i2, int i3, boolean z2, int i4) {
            Objects.requireNonNull(uri);
            this.f1264a = uri;
            this.f1265b = i2;
            this.f1266c = i3;
            this.f1267d = z2;
            this.f1268e = i4;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f1269a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1270b;

        public d(Typeface typeface, int i2) {
            this.f1269a = typeface;
            this.f1270b = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[LOOP:1: B:15:0x004b->B:30:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[EDGE_INSN: B:80:0x0094->B:32:0x0094 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static b0.e.b a(android.content.Context r20, android.os.CancellationSignal r21, b0.a r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.e.a(android.content.Context, android.os.CancellationSignal, b0.a):b0.e$b");
    }

    public static d b(Context context, b0.a aVar, int i2) {
        try {
            b a2 = a(context, null, aVar);
            int i3 = a2.f1262a;
            if (i3 != 0) {
                return new d(null, i3 == 1 ? -2 : -3);
            }
            Typeface b2 = x.d.f2767a.b(context, null, a2.f1263b, i2);
            return new d(b2, b2 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new d(null, -1);
        }
    }
}