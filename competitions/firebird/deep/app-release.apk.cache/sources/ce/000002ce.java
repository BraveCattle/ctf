package n;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f2311a;

    /* renamed from: b  reason: collision with root package name */
    public e f2312b;

    /* renamed from: c  reason: collision with root package name */
    public e f2313c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2314d;

    /* JADX WARN: Type inference failed for: r3v2, types: [n.e, l.h] */
    /* JADX WARN: Type inference failed for: r3v3, types: [n.e, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [n.e, l.a] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.util.SparseArray, n.e] */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.e, n.e] */
    public c(int i2) {
        if (i2 == 1) {
            this.f2311a = new e(10, 1);
            this.f2312b = new l.h();
            this.f2313c = new ArrayList();
            this.f2314d = new HashSet();
        } else if (i2 != 2) {
            this.f2311a = new e(256, 0);
            this.f2312b = new e(256, 0);
            this.f2313c = new e(256, 0);
            this.f2314d = new h[32];
        } else {
            this.f2311a = new l.a();
            this.f2312b = new SparseArray();
            this.f2313c = new l.e();
            this.f2314d = new l.a();
        }
    }

    public void a(T t2) {
        if (((l.h) this.f2312b).e(t2) >= 0) {
            return;
        }
        ((l.h) this.f2312b).put(t2, null);
    }

    public void b(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t2)) {
            return;
        }
        if (hashSet.contains(t2)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t2);
        ArrayList arrayList2 = (ArrayList) ((l.h) this.f2312b).getOrDefault(t2, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                b(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t2);
        arrayList.add(t2);
    }

    public ArrayList<T> c() {
        ArrayList<T> arrayList = (ArrayList) this.f2311a.a();
        return arrayList == 0 ? new ArrayList<>() : arrayList;
    }

    public void d(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2311a.c(arrayList);
    }
}