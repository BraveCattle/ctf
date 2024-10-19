package h;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class p {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f1977c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f1978a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f1979b;

    public p(ProgressBar progressBar) {
        this.f1978a = progressBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        u0 o2 = u0.o(this.f1978a.getContext(), attributeSet, f1977c, i2, 0);
        Drawable f2 = o2.f(0);
        if (f2 != null) {
            ProgressBar progressBar = this.f1978a;
            if (f2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) f2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable b2 = b(animationDrawable.getFrame(i3), true);
                    b2.setLevel(10000);
                    animationDrawable2.addFrame(b2, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                f2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(f2);
        }
        Drawable f3 = o2.f(1);
        if (f3 != null) {
            this.f1978a.setProgressDrawable(b(f3, false));
        }
        o2.f2006b.recycle();
    }

    public final Drawable b(Drawable drawable, boolean z2) {
        if (drawable instanceof y.a) {
            y.a aVar = (y.a) drawable;
            Drawable a2 = aVar.a();
            if (a2 != null) {
                aVar.b(b(a2, z2));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                int id = layerDrawable.getId(i2);
                drawableArr[i2] = b(layerDrawable.getDrawable(i2), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                layerDrawable2.setId(i3, layerDrawable.getId(i3));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1979b == null) {
                this.f1979b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z2 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}