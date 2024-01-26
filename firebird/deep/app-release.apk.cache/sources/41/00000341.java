package t0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f2671d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f2672e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2673f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2674g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2675h;

    /* renamed from: i  reason: collision with root package name */
    public int f2676i;

    /* renamed from: j  reason: collision with root package name */
    public int f2677j;

    /* renamed from: k  reason: collision with root package name */
    public int f2678k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l.a(), new l.a(), new l.a());
    }

    public b(Parcel parcel, int i2, int i3, String str, l.a<String, Method> aVar, l.a<String, Method> aVar2, l.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2671d = new SparseIntArray();
        this.f2676i = -1;
        this.f2677j = 0;
        this.f2678k = -1;
        this.f2672e = parcel;
        this.f2673f = i2;
        this.f2674g = i3;
        this.f2677j = i2;
        this.f2675h = str;
    }

    @Override // t0.a
    public void a() {
        int i2 = this.f2676i;
        if (i2 >= 0) {
            int i3 = this.f2671d.get(i2);
            int dataPosition = this.f2672e.dataPosition();
            this.f2672e.setDataPosition(i3);
            this.f2672e.writeInt(dataPosition - i3);
            this.f2672e.setDataPosition(dataPosition);
        }
    }

    @Override // t0.a
    public a b() {
        Parcel parcel = this.f2672e;
        int dataPosition = parcel.dataPosition();
        int i2 = this.f2677j;
        if (i2 == this.f2673f) {
            i2 = this.f2674g;
        }
        int i3 = i2;
        return new b(parcel, dataPosition, i3, this.f2675h + "  ", this.f2668a, this.f2669b, this.f2670c);
    }

    @Override // t0.a
    public boolean f() {
        return this.f2672e.readInt() != 0;
    }

    @Override // t0.a
    public byte[] g() {
        int readInt = this.f2672e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2672e.readByteArray(bArr);
        return bArr;
    }

    @Override // t0.a
    public CharSequence h() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2672e);
    }

    @Override // t0.a
    public boolean i(int i2) {
        while (this.f2677j < this.f2674g) {
            int i3 = this.f2678k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f2672e.setDataPosition(this.f2677j);
            int readInt = this.f2672e.readInt();
            this.f2678k = this.f2672e.readInt();
            this.f2677j += readInt;
        }
        return this.f2678k == i2;
    }

    @Override // t0.a
    public int j() {
        return this.f2672e.readInt();
    }

    @Override // t0.a
    public <T extends Parcelable> T l() {
        return (T) this.f2672e.readParcelable(b.class.getClassLoader());
    }

    @Override // t0.a
    public String n() {
        return this.f2672e.readString();
    }

    @Override // t0.a
    public void p(int i2) {
        a();
        this.f2676i = i2;
        this.f2671d.put(i2, this.f2672e.dataPosition());
        this.f2672e.writeInt(0);
        this.f2672e.writeInt(i2);
    }

    @Override // t0.a
    public void q(boolean z2) {
        this.f2672e.writeInt(z2 ? 1 : 0);
    }

    @Override // t0.a
    public void r(byte[] bArr) {
        if (bArr == null) {
            this.f2672e.writeInt(-1);
            return;
        }
        this.f2672e.writeInt(bArr.length);
        this.f2672e.writeByteArray(bArr);
    }

    @Override // t0.a
    public void s(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2672e, 0);
    }

    @Override // t0.a
    public void t(int i2) {
        this.f2672e.writeInt(i2);
    }

    @Override // t0.a
    public void u(Parcelable parcelable) {
        this.f2672e.writeParcelable(parcelable, 0);
    }

    @Override // t0.a
    public void v(String str) {
        this.f2672e.writeString(str);
    }
}