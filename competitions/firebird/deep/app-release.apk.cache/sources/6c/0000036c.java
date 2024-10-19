package x;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import b0.e;
import java.io.IOException;
import java.io.InputStream;
import w.a;

/* loaded from: classes.dex */
public class i extends j {
    @Override // x.j
    public Typeface a(Context context, a.b bVar, Resources resources, int i2) {
        a.c[] cVarArr = bVar.f2725a;
        int length = cVarArr.length;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            a.c cVar = cVarArr[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.f2731f).setWeight(cVar.f2727b);
                if (!cVar.f2728c) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(cVar.f2730e).setFontVariationSettings(cVar.f2729d).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
    }

    @Override // x.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, e.c[] cVarArr, int i2) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        int length = cVarArr.length;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            e.c cVar = cVarArr[i3];
            try {
                openFileDescriptor = contentResolver.openFileDescriptor(cVar.f1264a, "r", cancellationSignal);
            } catch (IOException unused) {
            }
            if (openFileDescriptor != null) {
                Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(cVar.f1266c);
                if (!cVar.f1267d) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(cVar.f1265b).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } else if (openFileDescriptor == null) {
                i3++;
            }
            openFileDescriptor.close();
            i3++;
        }
        if (builder == null) {
            return null;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i2 & 1) != 0 ? 700 : 400, (i2 & 2) != 0 ? 1 : 0)).build();
    }

    @Override // x.j
    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // x.j
    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // x.j
    public e.c e(e.c[] cVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}