package i;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f2104b;

    /* renamed from: a  reason: collision with root package name */
    public c f2105a;

    public a() {
        super(0);
        this.f2105a = new b();
    }

    public static a c() {
        if (f2104b != null) {
            return f2104b;
        }
        synchronized (a.class) {
            if (f2104b == null) {
                f2104b = new a();
            }
        }
        return f2104b;
    }

    @Override // i.c
    public boolean b() {
        return this.f2105a.b();
    }
}