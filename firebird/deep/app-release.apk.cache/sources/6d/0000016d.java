package c1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.c;
import d1.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b extends c {
    public b(g gVar, f1.b bVar) {
        super(gVar, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public float c() {
        return this.f1534o.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void d(Rect rect) {
        f1.b bVar = this.f1535p;
        if (!FloatingActionButton.this.f1501k) {
            rect.set(0, 0, 0, 0);
            return;
        }
        FloatingActionButton.this.getSizeDimension();
        float elevation = this.f1534o.getElevation() + this.f1530k;
        int i2 = f1.a.f1742d;
        int ceil = (int) Math.ceil(elevation);
        int ceil2 = (int) Math.ceil(elevation * 1.5f);
        rect.set(ceil, ceil2, ceil, ceil2);
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void f() {
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void g() {
        n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void h(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void i(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(c.f1514u, o(f2, f4));
        stateListAnimator.addState(c.f1515v, o(f2, f3));
        stateListAnimator.addState(c.f1516w, o(f2, f3));
        stateListAnimator.addState(c.f1517x, o(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f1534o, "elevation", f2).setDuration(0L));
        if (i2 <= 24) {
            g gVar = this.f1534o;
            arrayList.add(ObjectAnimator.ofFloat(gVar, View.TRANSLATION_Z, gVar.getTranslationZ()).setDuration(100L));
        }
        arrayList.add(ObjectAnimator.ofFloat(this.f1534o, View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(c.f1513t);
        stateListAnimator.addState(c.f1518y, animatorSet);
        stateListAnimator.addState(c.f1519z, o(0.0f, 0.0f));
        this.f1534o.setStateListAnimator(stateListAnimator);
        if (FloatingActionButton.this.f1501k) {
            n();
            throw null;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void j(Rect rect) {
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        if (!floatingActionButton.f1501k) {
            super/*android.view.View*/.setBackgroundDrawable(null);
            return;
        }
        super/*android.view.View*/.setBackgroundDrawable(new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom));
    }

    @Override // com.google.android.material.floatingactionbutton.c
    public void l(ColorStateList colorStateList) {
    }

    public final Animator o(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1534o, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f1534o, View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(c.f1513t);
        return animatorSet;
    }
}