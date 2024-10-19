package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import t0.a;
import t0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f684a;
        if (aVar.i(1)) {
            cVar = aVar.o();
        }
        remoteActionCompat.f684a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f685b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f685b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f686c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f686c = charSequence2;
        remoteActionCompat.f687d = (PendingIntent) aVar.m(remoteActionCompat.f687d, 4);
        boolean z2 = remoteActionCompat.f688e;
        if (aVar.i(5)) {
            z2 = aVar.f();
        }
        remoteActionCompat.f688e = z2;
        boolean z3 = remoteActionCompat.f689f;
        if (aVar.i(6)) {
            z3 = aVar.f();
        }
        remoteActionCompat.f689f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f684a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f685b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f686c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f687d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z2 = remoteActionCompat.f688e;
        aVar.p(5);
        aVar.q(z2);
        boolean z3 = remoteActionCompat.f689f;
        aVar.p(6);
        aVar.q(z3);
    }
}