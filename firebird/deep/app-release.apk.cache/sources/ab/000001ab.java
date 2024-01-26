package d0;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class a extends Writer {

    /* renamed from: a  reason: collision with root package name */
    public final String f1590a;

    /* renamed from: b  reason: collision with root package name */
    public StringBuilder f1591b = new StringBuilder(128);

    public a(String str) {
        this.f1590a = str;
    }

    public final void a() {
        if (this.f1591b.length() > 0) {
            Log.d(this.f1590a, this.f1591b.toString());
            StringBuilder sb = this.f1591b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                a();
            } else {
                this.f1591b.append(c2);
            }
        }
    }
}