package androidx.activity;

import a.b;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f16a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f17b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements d, a.a {

        /* renamed from: a  reason: collision with root package name */
        public final c f18a;

        /* renamed from: b  reason: collision with root package name */
        public final b f19b;

        /* renamed from: c  reason: collision with root package name */
        public a.a f20c;

        public LifecycleOnBackPressedCancellable(c cVar, b bVar) {
            this.f18a = cVar;
            this.f19b = bVar;
            cVar.a(this);
        }

        @Override // androidx.lifecycle.d
        public void c(m0.c cVar, c.a aVar) {
            if (aVar == c.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f19b;
                onBackPressedDispatcher.f17b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f1b.add(aVar2);
                this.f20c = aVar2;
            } else if (aVar != c.a.ON_STOP) {
                if (aVar == c.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                a.a aVar3 = this.f20c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            }
        }

        @Override // a.a
        public void cancel() {
            ((e) this.f18a).f900a.d(this);
            this.f19b.f1b.remove(this);
            a.a aVar = this.f20c;
            if (aVar != null) {
                aVar.cancel();
                this.f20c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f22a;

        public a(b bVar) {
            this.f22a = bVar;
        }

        @Override // a.a
        public void cancel() {
            OnBackPressedDispatcher.this.f17b.remove(this.f22a);
            this.f22a.f1b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f16a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f17b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f0a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f16a;
        if (runnable != null) {
            runnable.run();
        }
    }
}