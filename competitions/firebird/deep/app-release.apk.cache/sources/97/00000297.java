package k0;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class e<E> extends c {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f2171b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2172c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2173d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2174e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.fragment.app.e f2175f;

    public e(b bVar) {
        Handler handler = new Handler();
        this.f2175f = new androidx.fragment.app.e();
        this.f2171b = bVar;
        b.a.c(bVar, "context == null");
        this.f2172c = bVar;
        this.f2173d = handler;
        this.f2174e = 0;
    }

    @Override // k0.c
    public View e(int i2) {
        return null;
    }

    @Override // k0.c
    public boolean f() {
        return true;
    }

    public void g(Fragment fragment) {
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f2172c);
    }

    public void k() {
    }
}