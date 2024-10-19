package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: j  reason: collision with root package name */
    public static final PorterDuff.Mode f690j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public Object f692b;

    /* renamed from: a  reason: collision with root package name */
    public int f691a = -1;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f693c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f694d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f695e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f696f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f697g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f698h = f690j;

    /* renamed from: i  reason: collision with root package name */
    public String f699i = null;

    public String toString() {
        String str;
        int height;
        String str2;
        int i2;
        if (this.f691a == -1) {
            return String.valueOf(this.f692b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f691a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f691a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f692b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f692b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                int i3 = this.f691a;
                if (i3 == -1) {
                    int i4 = Build.VERSION.SDK_INT;
                    Icon icon = (Icon) this.f692b;
                    if (i4 >= 28) {
                        str2 = icon.getResPackage();
                    } else {
                        str2 = null;
                        try {
                            str2 = (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        }
                    }
                } else if (i3 == 2) {
                    str2 = ((String) this.f692b).split(":", -1)[0];
                } else {
                    throw new IllegalStateException("called getResPackage() on " + this);
                }
                sb.append(str2);
                sb.append(" id=");
                Object[] objArr = new Object[1];
                int i5 = this.f691a;
                if (i5 == -1) {
                    int i6 = Build.VERSION.SDK_INT;
                    Icon icon2 = (Icon) this.f692b;
                    if (i6 >= 28) {
                        i2 = icon2.getResId();
                    } else {
                        try {
                            i2 = ((Integer) icon2.getClass().getMethod("getResId", new Class[0]).invoke(icon2, new Object[0])).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon resource", e3);
                            i2 = 0;
                        }
                    }
                } else if (i5 == 2) {
                    i2 = this.f695e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                objArr[0] = Integer.valueOf(i2);
                sb.append(String.format("0x%08x", objArr));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f695e);
                if (this.f696f != 0) {
                    sb.append(" off=");
                    height = this.f696f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f692b);
                break;
        }
        if (this.f697g != null) {
            sb.append(" tint=");
            sb.append(this.f697g);
        }
        if (this.f698h != f690j) {
            sb.append(" mode=");
            sb.append(this.f698h);
        }
        sb.append(")");
        return sb.toString();
    }
}