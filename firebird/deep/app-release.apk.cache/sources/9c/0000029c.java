package k0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f2187a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2188b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2189c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2190d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2191e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2192f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2193g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2194h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2195i;

    /* renamed from: j  reason: collision with root package name */
    public final Bundle f2196j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2197k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2198l;

    /* renamed from: m  reason: collision with root package name */
    public Bundle f2199m;

    /* renamed from: n  reason: collision with root package name */
    public Fragment f2200n;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public h[] newArray(int i2) {
            return new h[i2];
        }
    }

    public h(Parcel parcel) {
        this.f2187a = parcel.readString();
        this.f2188b = parcel.readString();
        this.f2189c = parcel.readInt() != 0;
        this.f2190d = parcel.readInt();
        this.f2191e = parcel.readInt();
        this.f2192f = parcel.readString();
        this.f2193g = parcel.readInt() != 0;
        this.f2194h = parcel.readInt() != 0;
        this.f2195i = parcel.readInt() != 0;
        this.f2196j = parcel.readBundle();
        this.f2197k = parcel.readInt() != 0;
        this.f2199m = parcel.readBundle();
        this.f2198l = parcel.readInt();
    }

    public h(Fragment fragment) {
        this.f2187a = Fragment.class.getName();
        this.f2188b = fragment.f729e;
        this.f2189c = fragment.f737m;
        this.f2190d = fragment.f746v;
        this.f2191e = fragment.f747w;
        this.f2192f = fragment.f748x;
        this.f2193g = fragment.A;
        this.f2194h = fragment.f736l;
        this.f2195i = fragment.f750z;
        this.f2196j = fragment.f730f;
        this.f2197k = fragment.f749y;
        this.f2198l = fragment.M.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2187a);
        sb.append(" (");
        sb.append(this.f2188b);
        sb.append(")}:");
        if (this.f2189c) {
            sb.append(" fromLayout");
        }
        if (this.f2191e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2191e));
        }
        String str = this.f2192f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2192f);
        }
        if (this.f2193g) {
            sb.append(" retainInstance");
        }
        if (this.f2194h) {
            sb.append(" removing");
        }
        if (this.f2195i) {
            sb.append(" detached");
        }
        if (this.f2197k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f2187a);
        parcel.writeString(this.f2188b);
        parcel.writeInt(this.f2189c ? 1 : 0);
        parcel.writeInt(this.f2190d);
        parcel.writeInt(this.f2191e);
        parcel.writeString(this.f2192f);
        parcel.writeInt(this.f2193g ? 1 : 0);
        parcel.writeInt(this.f2194h ? 1 : 0);
        parcel.writeInt(this.f2195i ? 1 : 0);
        parcel.writeBundle(this.f2196j);
        parcel.writeInt(this.f2197k ? 1 : 0);
        parcel.writeBundle(this.f2199m);
        parcel.writeInt(this.f2198l);
    }
}