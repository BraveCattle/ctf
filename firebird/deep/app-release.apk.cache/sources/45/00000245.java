package h;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1950a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1951b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1952c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1953d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1954e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1955f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1956g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1957h = false;

    public void a(int i2, int i3) {
        this.f1952c = i2;
        this.f1953d = i3;
        this.f1957h = true;
        if (this.f1956g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f1950a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f1951b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1950a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f1951b = i3;
        }
    }
}