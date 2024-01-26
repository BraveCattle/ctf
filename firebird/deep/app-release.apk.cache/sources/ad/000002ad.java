package l;

import java.util.Map;

/* loaded from: classes.dex */
public class b extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f2233d;

    public b(c cVar) {
        this.f2233d = cVar;
    }

    @Override // l.g
    public void a() {
        this.f2233d.clear();
    }

    @Override // l.g
    public Object b(int i2, int i3) {
        return this.f2233d.f2241b[i2];
    }

    @Override // l.g
    public Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // l.g
    public int d() {
        return this.f2233d.f2242c;
    }

    @Override // l.g
    public int e(Object obj) {
        return this.f2233d.c(obj);
    }

    @Override // l.g
    public int f(Object obj) {
        return this.f2233d.c(obj);
    }

    @Override // l.g
    public void g(Object obj, Object obj2) {
        this.f2233d.add(obj);
    }

    @Override // l.g
    public void h(int i2) {
        this.f2233d.f(i2);
    }

    @Override // l.g
    public Object i(int i2, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}