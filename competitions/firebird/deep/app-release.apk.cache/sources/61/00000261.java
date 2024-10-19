package h;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public TextView f2031a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f2032b;

    public w(TextView textView) {
        this.f2031a = textView;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f2032b;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.f2031a.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
        return textClassifier;
    }
}