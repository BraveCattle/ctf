package b0;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1245a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1246b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1247c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f1248d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1249e;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1245a = str;
        this.f1246b = str2;
        this.f1247c = str3;
        Objects.requireNonNull(list);
        this.f1248d = list;
        this.f1249e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = c.f.a("FontRequest {mProviderAuthority: ");
        a2.append(this.f1245a);
        a2.append(", mProviderPackage: ");
        a2.append(this.f1246b);
        a2.append(", mQuery: ");
        a2.append(this.f1247c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i2 = 0; i2 < this.f1248d.size(); i2++) {
            sb.append(" [");
            List<byte[]> list = this.f1248d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}