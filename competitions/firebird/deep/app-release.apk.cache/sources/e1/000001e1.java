package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f1664a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f1665b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f1666c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f1667d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f1668e;

    public c() {
        super(null);
    }

    public c(Context context, int i2) {
        super(context);
        this.f1664a = i2;
    }

    public void a(Configuration configuration) {
        if (this.f1668e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1667d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1667d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f1665b == null) {
            this.f1665b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1665b.setTo(theme);
            }
        }
        this.f1665b.applyStyle(this.f1664a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f1668e == null) {
            Configuration configuration = this.f1667d;
            this.f1668e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f1668e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1666c == null) {
                this.f1666c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1666c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1665b;
        if (theme != null) {
            return theme;
        }
        if (this.f1664a == 0) {
            this.f1664a = 2131624259;
        }
        b();
        return this.f1665b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i2) {
        if (this.f1664a != i2) {
            this.f1664a = i2;
            b();
        }
    }
}