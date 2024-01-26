package g1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    public static e f1817c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1818a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f1819b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e eVar = e.this;
            b bVar = (b) message.obj;
            synchronized (eVar.f1818a) {
                if (bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
    }
}