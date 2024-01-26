package n;

/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2333a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2334b;

    /* renamed from: c  reason: collision with root package name */
    public int f2335c;

    public e(int i2, int i3) {
        this.f2333a = i3;
        if (i3 != 1) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f2334b = new Object[i2];
        } else if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else {
            this.f2334b = new Object[i2];
        }
    }

    public Object a() {
        switch (this.f2333a) {
            case 0:
                int i2 = this.f2335c;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    Object[] objArr = this.f2334b;
                    Object obj = objArr[i3];
                    objArr[i3] = null;
                    this.f2335c = i3;
                    return obj;
                }
                return null;
            default:
                int i4 = this.f2335c;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    Object[] objArr2 = this.f2334b;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    this.f2335c = i5;
                    return obj2;
                }
                return null;
        }
    }

    public boolean b(T t2) {
        for (int i2 = 0; i2 < this.f2335c; i2++) {
            if (this.f2334b[i2] == t2) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Object obj) {
        switch (this.f2333a) {
            case 0:
                int i2 = this.f2335c;
                Object[] objArr = this.f2334b;
                if (i2 < objArr.length) {
                    objArr[i2] = obj;
                    this.f2335c = i2 + 1;
                    return true;
                }
                return false;
            default:
                if (b(obj)) {
                    throw new IllegalStateException("Already in the pool!");
                }
                int i3 = this.f2335c;
                Object[] objArr2 = this.f2334b;
                if (i3 < objArr2.length) {
                    objArr2[i3] = obj;
                    this.f2335c = i3 + 1;
                    return true;
                }
                return false;
        }
    }
}