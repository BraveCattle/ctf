package k0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<h> f2176a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f2177b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.fragment.app.b[] f2178c;

    /* renamed from: d  reason: collision with root package name */
    public String f2179d;

    /* renamed from: e  reason: collision with root package name */
    public int f2180e;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i2) {
            return new f[i2];
        }
    }

    public f() {
        this.f2179d = null;
    }

    public f(Parcel parcel) {
        this.f2179d = null;
        this.f2176a = parcel.createTypedArrayList(h.CREATOR);
        this.f2177b = parcel.createStringArrayList();
        this.f2178c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
        this.f2179d = parcel.readString();
        this.f2180e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f2176a);
        parcel.writeStringList(this.f2177b);
        parcel.writeTypedArray(this.f2178c, i2);
        parcel.writeString(this.f2179d);
        parcel.writeInt(this.f2180e);
    }
}