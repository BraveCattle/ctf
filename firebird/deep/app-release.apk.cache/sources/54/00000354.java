package v0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f2720a;

    /* renamed from: b  reason: collision with root package name */
    public long f2721b;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f2722c;

    /* renamed from: d  reason: collision with root package name */
    public int f2723d;

    /* renamed from: e  reason: collision with root package name */
    public int f2724e;

    public h(long j2, long j3) {
        this.f2720a = 0L;
        this.f2721b = 300L;
        this.f2722c = null;
        this.f2723d = 0;
        this.f2724e = 1;
        this.f2720a = j2;
        this.f2721b = j3;
    }

    public h(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f2720a = 0L;
        this.f2721b = 300L;
        this.f2722c = null;
        this.f2723d = 0;
        this.f2724e = 1;
        this.f2720a = j2;
        this.f2721b = j3;
        this.f2722c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f2720a);
        animator.setDuration(this.f2721b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f2723d);
            valueAnimator.setRepeatMode(this.f2724e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f2722c;
        return timeInterpolator != null ? timeInterpolator : a.f2708a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f2720a == hVar.f2720a && this.f2721b == hVar.f2721b && this.f2723d == hVar.f2723d && this.f2724e == hVar.f2724e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f2720a;
        long j3 = this.f2721b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f2723d) * 31) + this.f2724e;
    }

    public String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f2720a + " duration: " + this.f2721b + " interpolator: " + b().getClass() + " repeatCount: " + this.f2723d + " repeatMode: " + this.f2724e + "}\n";
    }
}