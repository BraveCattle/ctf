package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<e> f1045f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    public static Comparator<c> f1046g = new a();

    /* renamed from: c  reason: collision with root package name */
    public long f1048c;

    /* renamed from: d  reason: collision with root package name */
    public long f1049d;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<k> f1047b = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f1050e = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int compare(androidx.recyclerview.widget.e.c r7, androidx.recyclerview.widget.e.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.e$c r7 = (androidx.recyclerview.widget.e.c) r7
                androidx.recyclerview.widget.e$c r8 = (androidx.recyclerview.widget.e.c) r8
                androidx.recyclerview.widget.k r0 = r7.f1058d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.k r4 = r8.f1058d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f1055a
                boolean r3 = r8.f1055a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f1056b
                int r2 = r7.f1056b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f1057c
                int r8 = r8.f1057c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.e.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1051a;

        /* renamed from: b  reason: collision with root package name */
        public int f1052b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1053c;

        /* renamed from: d  reason: collision with root package name */
        public int f1054d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1055a;

        /* renamed from: b  reason: collision with root package name */
        public int f1056b;

        /* renamed from: c  reason: collision with root package name */
        public int f1057c;

        /* renamed from: d  reason: collision with root package name */
        public k f1058d;

        /* renamed from: e  reason: collision with root package name */
        public int f1059e;
    }

    public void a(k kVar, int i2, int i3) {
        if (kVar.isAttachedToWindow() && this.f1048c == 0) {
            this.f1048c = kVar.getNanoTime();
            kVar.post(this);
        }
        b bVar = kVar.f1075a0;
        bVar.f1051a = i2;
        bVar.f1052b = i3;
    }

    public void b(long j2) {
        c cVar;
        k kVar;
        c cVar2;
        int size = this.f1047b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            k kVar2 = this.f1047b.get(i3);
            if (kVar2.getWindowVisibility() == 0) {
                b bVar = kVar2.f1075a0;
                bVar.f1054d = 0;
                int[] iArr = bVar.f1053c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                i2 += kVar2.f1075a0.f1054d;
            }
        }
        this.f1050e.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            k kVar3 = this.f1047b.get(i5);
            if (kVar3.getWindowVisibility() == 0) {
                b bVar2 = kVar3.f1075a0;
                int abs = Math.abs(bVar2.f1052b) + Math.abs(bVar2.f1051a);
                for (int i6 = 0; i6 < bVar2.f1054d * 2; i6 += 2) {
                    if (i4 >= this.f1050e.size()) {
                        cVar2 = new c();
                        this.f1050e.add(cVar2);
                    } else {
                        cVar2 = this.f1050e.get(i4);
                    }
                    int[] iArr2 = bVar2.f1053c;
                    int i7 = iArr2[i6 + 1];
                    cVar2.f1055a = i7 <= abs;
                    cVar2.f1056b = abs;
                    cVar2.f1057c = i7;
                    cVar2.f1058d = kVar3;
                    cVar2.f1059e = iArr2[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f1050e, f1046g);
        for (int i8 = 0; i8 < this.f1050e.size() && (kVar = (cVar = this.f1050e.get(i8)).f1058d) != null; i8++) {
            c(kVar, cVar.f1059e, cVar.f1055a ? Long.MAX_VALUE : j2);
            cVar.f1055a = false;
            cVar.f1056b = 0;
            cVar.f1057c = 0;
            cVar.f1058d = null;
            cVar.f1059e = 0;
        }
    }

    public final k.v c(k kVar, int i2, long j2) {
        boolean z2;
        int e2 = kVar.f1082e.e();
        int i3 = 0;
        while (true) {
            if (i3 >= e2) {
                z2 = false;
                break;
            }
            k.v u2 = k.u(kVar.f1082e.d(i3));
            if (u2.f1178a == i2 && !u2.h()) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            return null;
        }
        k.p pVar = kVar.f1076b;
        try {
            kVar.A();
            pVar.j(i2, false, j2);
            throw null;
        } catch (Throwable th) {
            kVar.B(false);
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i2 = a0.a.f2a;
            Trace.beginSection("RV Prefetch");
            if (this.f1047b.isEmpty()) {
                this.f1048c = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f1047b.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                k kVar = this.f1047b.get(i3);
                if (kVar.getWindowVisibility() == 0) {
                    j2 = Math.max(kVar.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f1048c = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1049d);
            this.f1048c = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1048c = 0L;
            int i4 = a0.a.f2a;
            Trace.endSection();
            throw th;
        }
    }
}