package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.f;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f765a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<String> f766b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f767c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f768d;

    /* renamed from: e  reason: collision with root package name */
    public final int f769e;

    /* renamed from: f  reason: collision with root package name */
    public final int f770f;

    /* renamed from: g  reason: collision with root package name */
    public final String f771g;

    /* renamed from: h  reason: collision with root package name */
    public final int f772h;

    /* renamed from: i  reason: collision with root package name */
    public final int f773i;

    /* renamed from: j  reason: collision with root package name */
    public final CharSequence f774j;

    /* renamed from: k  reason: collision with root package name */
    public final int f775k;

    /* renamed from: l  reason: collision with root package name */
    public final CharSequence f776l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList<String> f777m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<String> f778n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f779o;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f765a = parcel.createIntArray();
        this.f766b = parcel.createStringArrayList();
        this.f767c = parcel.createIntArray();
        this.f768d = parcel.createIntArray();
        this.f769e = parcel.readInt();
        this.f770f = parcel.readInt();
        this.f771g = parcel.readString();
        this.f772h = parcel.readInt();
        this.f773i = parcel.readInt();
        this.f774j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f775k = parcel.readInt();
        this.f776l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f777m = parcel.createStringArrayList();
        this.f778n = parcel.createStringArrayList();
        this.f779o = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f813a.size();
        this.f765a = new int[size * 5];
        if (!aVar.f820h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f766b = new ArrayList<>(size);
        this.f767c = new int[size];
        this.f768d = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            f.a aVar2 = aVar.f813a.get(i2);
            int i4 = i3 + 1;
            this.f765a[i3] = aVar2.f829a;
            ArrayList<String> arrayList = this.f766b;
            Fragment fragment = aVar2.f830b;
            arrayList.add(fragment != null ? fragment.f729e : null);
            int[] iArr = this.f765a;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f831c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f832d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f833e;
            iArr[i7] = aVar2.f834f;
            this.f767c[i2] = aVar2.f835g.ordinal();
            this.f768d[i2] = aVar2.f836h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f769e = aVar.f818f;
        this.f770f = aVar.f819g;
        this.f771g = aVar.f821i;
        this.f772h = aVar.f764r;
        this.f773i = aVar.f822j;
        this.f774j = aVar.f823k;
        this.f775k = aVar.f824l;
        this.f776l = aVar.f825m;
        this.f777m = aVar.f826n;
        this.f778n = aVar.f827o;
        this.f779o = aVar.f828p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f765a);
        parcel.writeStringList(this.f766b);
        parcel.writeIntArray(this.f767c);
        parcel.writeIntArray(this.f768d);
        parcel.writeInt(this.f769e);
        parcel.writeInt(this.f770f);
        parcel.writeString(this.f771g);
        parcel.writeInt(this.f772h);
        parcel.writeInt(this.f773i);
        TextUtils.writeToParcel(this.f774j, parcel, 0);
        parcel.writeInt(this.f775k);
        TextUtils.writeToParcel(this.f776l, parcel, 0);
        parcel.writeStringList(this.f777m);
        parcel.writeStringList(this.f778n);
        parcel.writeInt(this.f779o ? 1 : 0);
    }
}