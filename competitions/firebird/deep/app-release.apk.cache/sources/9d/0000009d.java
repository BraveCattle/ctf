package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import t0.a;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f691a = aVar.k(iconCompat.f691a, 1);
        byte[] bArr = iconCompat.f693c;
        if (aVar.i(2)) {
            bArr = aVar.g();
        }
        iconCompat.f693c = bArr;
        iconCompat.f694d = aVar.m(iconCompat.f694d, 3);
        iconCompat.f695e = aVar.k(iconCompat.f695e, 4);
        iconCompat.f696f = aVar.k(iconCompat.f696f, 5);
        iconCompat.f697g = (ColorStateList) aVar.m(iconCompat.f697g, 6);
        String str = iconCompat.f699i;
        if (aVar.i(7)) {
            str = aVar.n();
        }
        iconCompat.f699i = str;
        iconCompat.f698h = PorterDuff.Mode.valueOf(str);
        switch (iconCompat.f691a) {
            case -1:
                parcelable = iconCompat.f694d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f692b = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.f694d;
                if (parcelable == null) {
                    byte[] bArr2 = iconCompat.f693c;
                    iconCompat.f692b = bArr2;
                    iconCompat.f691a = 3;
                    iconCompat.f695e = 0;
                    iconCompat.f696f = bArr2.length;
                    break;
                }
                iconCompat.f692b = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                iconCompat.f692b = new String(iconCompat.f693c, Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f692b = iconCompat.f693c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f699i = iconCompat.f698h.name();
        switch (iconCompat.f691a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f694d = (Parcelable) iconCompat.f692b;
                break;
            case 2:
                iconCompat.f693c = ((String) iconCompat.f692b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f693c = (byte[]) iconCompat.f692b;
                break;
            case 4:
            case 6:
                iconCompat.f693c = iconCompat.f692b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f691a;
        if (-1 != i2) {
            aVar.p(1);
            aVar.t(i2);
        }
        byte[] bArr = iconCompat.f693c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f694d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i3 = iconCompat.f695e;
        if (i3 != 0) {
            aVar.p(4);
            aVar.t(i3);
        }
        int i4 = iconCompat.f696f;
        if (i4 != 0) {
            aVar.p(5);
            aVar.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f697g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f699i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
    }
}