package n0;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import m0.c;
import m0.f;
import m0.g;
import m0.h;
import m0.i;
import m0.j;
import m0.k;

/* loaded from: classes.dex */
public class b extends n0.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f2366a;

    /* renamed from: b  reason: collision with root package name */
    public final C0031b f2367b;

    /* loaded from: classes.dex */
    public static class a<D> extends f<D> {
        @Override // androidx.lifecycle.LiveData
        public void d() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(g<? super D> gVar) {
            super.f(gVar);
        }

        @Override // m0.f
        public void g(D d2) {
            super.g(null);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            b.a.a(null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: n0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031b extends h {

        /* renamed from: c  reason: collision with root package name */
        public static final i f2368c = new a();

        /* renamed from: b  reason: collision with root package name */
        public l.i<a> f2369b = new l.i<>(10);

        /* renamed from: n0.b$b$a */
        /* loaded from: classes.dex */
        public static class a implements i {
            public <T extends h> T a(Class<T> cls) {
                return new C0031b();
            }
        }

        @Override // m0.h
        public void a() {
            if (this.f2369b.i() <= 0) {
                l.i<a> iVar = this.f2369b;
                int i2 = iVar.f2285d;
                Object[] objArr = iVar.f2284c;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                iVar.f2285d = 0;
                iVar.f2282a = false;
                return;
            }
            Objects.requireNonNull(this.f2369b.j(0));
            throw null;
        }
    }

    public b(c cVar, k kVar) {
        this.f2366a = cVar;
        i iVar = C0031b.f2368c;
        String canonicalName = C0031b.class.getCanonicalName();
        if (canonicalName != null) {
            String a2 = f.f.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            h hVar = kVar.f2295a.get(a2);
            if (!C0031b.class.isInstance(hVar)) {
                hVar = iVar instanceof j ? ((j) iVar).a(a2, C0031b.class) : ((C0031b.a) iVar).a(C0031b.class);
                h put = kVar.f2295a.put(a2, hVar);
                if (put != null) {
                    put.a();
                }
            }
            this.f2367b = (C0031b) hVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // n0.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0031b c0031b = this.f2367b;
        if (c0031b.f2369b.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (c0031b.f2369b.i() <= 0) {
                return;
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0031b.f2369b.f(0));
            printWriter.print(": ");
            printWriter.println(c0031b.f2369b.j(0).toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        b.a.a(this.f2366a, sb);
        sb.append("}}");
        return sb.toString();
    }
}