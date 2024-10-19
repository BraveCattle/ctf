package d1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f1602a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f1603b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f1604c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f1605d = new a();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            if (dVar.f1604c == animator) {
                dVar.f1604c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1607a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f1608b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f1607a = iArr;
            this.f1608b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f1605d);
        this.f1602a.add(bVar);
    }
}