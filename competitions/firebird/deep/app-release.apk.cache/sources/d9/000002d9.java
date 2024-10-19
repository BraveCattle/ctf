package n0;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import m0.c;
import m0.l;

/* loaded from: classes.dex */
public abstract class a {
    public static <T extends c & l> a b(T t2) {
        return new b(t2, t2.d());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}