package d0;

import n.e;

/* loaded from: classes.dex */
public class b<T> extends e {

    /* renamed from: d  reason: collision with root package name */
    public final Object f1592d;

    public b(int i2) {
        super(i2, 1);
        this.f1592d = new Object();
    }

    @Override // n.e
    public T a() {
        T t2;
        synchronized (this.f1592d) {
            t2 = (T) super.a();
        }
        return t2;
    }

    @Override // n.e
    public boolean c(T t2) {
        boolean c2;
        synchronized (this.f1592d) {
            c2 = super.c(t2);
        }
        return c2;
    }
}