package m0;

import androidx.lifecycle.LiveData;

/* loaded from: classes.dex */
public class f<T> extends LiveData<T> {
    public void g(T t2) {
        LiveData.a("setValue");
        this.f875f++;
        this.f873d = t2;
        c(null);
    }
}