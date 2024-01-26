package i0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f2110a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f2109b = new C0027a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: i0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0027a extends a {
        public C0027a() {
            super((C0027a) null);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return a.f2109b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new a[i2];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2109b;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2110a = readParcelable == null ? f2109b : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f2110a = parcelable == f2109b ? null : parcelable;
    }

    public a(C0027a c0027a) {
        this.f2110a = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2110a, i2);
    }
}