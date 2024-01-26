package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static g f2612a = new r0.a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<l.a<ViewGroup, ArrayList<g>>>> f2613b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f2614c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public g f2615b;

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup f2616c;

        /* renamed from: r0.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0036a extends j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l.a f2617a;

            public C0036a(l.a aVar) {
                this.f2617a = aVar;
            }

            @Override // r0.g.d
            public void b(g gVar) {
                ((ArrayList) this.f2617a.get(a.this.f2616c)).remove(gVar);
            }
        }

        public a(g gVar, ViewGroup viewGroup) {
            this.f2615b = gVar;
            this.f2616c = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0206 A[EDGE_INSN: B:143:0x0206->B:95:0x0206 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 712
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: r0.k.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f2616c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2616c.removeOnAttachStateChangeListener(this);
            k.f2614c.remove(this.f2616c);
            ArrayList<g> arrayList = k.a().get(this.f2616c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<g> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().x(this.f2616c);
                }
            }
            this.f2615b.i(true);
        }
    }

    public static l.a<ViewGroup, ArrayList<g>> a() {
        l.a<ViewGroup, ArrayList<g>> aVar;
        WeakReference<l.a<ViewGroup, ArrayList<g>>> weakReference = f2613b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            l.a<ViewGroup, ArrayList<g>> aVar2 = new l.a<>();
            f2613b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}