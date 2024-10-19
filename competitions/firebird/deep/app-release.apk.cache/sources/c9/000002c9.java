package m0;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, h> f2295a = new HashMap<>();

    public final void a() {
        for (h hVar : this.f2295a.values()) {
            Map<String, Object> map = hVar.f2294a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : hVar.f2294a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            hVar.a();
        }
        this.f2295a.clear();
    }
}