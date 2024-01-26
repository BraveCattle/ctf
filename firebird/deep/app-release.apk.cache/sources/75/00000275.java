package h1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import c.f;
import l.h;

/* loaded from: classes.dex */
public class a extends i0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0026a();

    /* renamed from: c  reason: collision with root package name */
    public final h<String, Bundle> f2103c;

    /* renamed from: h1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0026a implements Parcelable.ClassLoaderCreator<a> {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i2) {
            return new a[i2];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0026a c0026a) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f2103c = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f2103c.put(strArr[i2], bundleArr[i2]);
        }
    }

    public String toString() {
        StringBuilder a2 = f.a("ExtendableSavedState{");
        a2.append(Integer.toHexString(System.identityHashCode(this)));
        a2.append(" states=");
        a2.append(this.f2103c);
        a2.append("}");
        return a2.toString();
    }

    @Override // i0.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2110a, i2);
        int i3 = this.f2103c.f2280c;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f2103c.h(i4);
            bundleArr[i4] = this.f2103c.k(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}