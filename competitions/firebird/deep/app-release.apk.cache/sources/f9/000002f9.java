package p;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class k {

    /* renamed from: c  reason: collision with root package name */
    public static int f2509c;

    /* renamed from: a  reason: collision with root package name */
    public m f2510a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<m> f2511b = new ArrayList<>();

    public k(m mVar, int i2) {
        this.f2510a = null;
        f2509c++;
        this.f2510a = mVar;
    }

    public final long a(f fVar, long j2) {
        m mVar = fVar.f2489d;
        if (mVar instanceof i) {
            return j2;
        }
        int size = fVar.f2496k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2496k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2489d != mVar) {
                    j3 = Math.min(j3, a(fVar2, fVar2.f2491f + j2));
                }
            }
        }
        if (fVar == mVar.f2522i) {
            long j4 = j2 - mVar.j();
            return Math.min(Math.min(j3, a(mVar.f2521h, j4)), j4 - mVar.f2521h.f2491f);
        }
        return j3;
    }

    public final long b(f fVar, long j2) {
        m mVar = fVar.f2489d;
        if (mVar instanceof i) {
            return j2;
        }
        int size = fVar.f2496k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = fVar.f2496k.get(i2);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f2489d != mVar) {
                    j3 = Math.max(j3, b(fVar2, fVar2.f2491f + j2));
                }
            }
        }
        if (fVar == mVar.f2521h) {
            long j4 = j2 + mVar.j();
            return Math.max(Math.max(j3, b(mVar.f2522i, j4)), j4 - mVar.f2522i.f2491f);
        }
        return j3;
    }
}