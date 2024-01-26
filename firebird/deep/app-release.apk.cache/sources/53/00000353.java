package v0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final l.h<String, h> f2719a = new l.h<>();

    public static g a(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return b(arrayList);
            }
            return null;
        } catch (Exception e2) {
            StringBuilder a2 = c.f.a("Can't load animation resource ID #0x");
            a2.append(Integer.toHexString(i2));
            Log.w("MotionSpec", a2.toString(), e2);
            return null;
        }
    }

    public static g b(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f2708a;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f2709b;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f2710c;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f2723d = objectAnimator.getRepeatCount();
                hVar.f2724e = objectAnimator.getRepeatMode();
                gVar.f2719a.put(propertyName, hVar);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public h c(String str) {
        if (this.f2719a.getOrDefault(str, null) != null) {
            return this.f2719a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return this.f2719a.equals(((g) obj).f2719a);
    }

    public int hashCode() {
        return this.f2719a.hashCode();
    }

    public String toString() {
        return '\n' + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2719a + "}\n";
    }
}