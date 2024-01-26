package h;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.x64m.xsfmnative.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class o0 extends h0.c implements View.OnClickListener {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f1958z = 0;

    /* renamed from: m  reason: collision with root package name */
    public final SearchView f1959m;

    /* renamed from: n  reason: collision with root package name */
    public final SearchableInfo f1960n;

    /* renamed from: o  reason: collision with root package name */
    public final Context f1961o;

    /* renamed from: p  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1962p;

    /* renamed from: q  reason: collision with root package name */
    public final int f1963q;

    /* renamed from: r  reason: collision with root package name */
    public int f1964r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f1965s;

    /* renamed from: t  reason: collision with root package name */
    public int f1966t;

    /* renamed from: u  reason: collision with root package name */
    public int f1967u;

    /* renamed from: v  reason: collision with root package name */
    public int f1968v;

    /* renamed from: w  reason: collision with root package name */
    public int f1969w;

    /* renamed from: x  reason: collision with root package name */
    public int f1970x;

    /* renamed from: y  reason: collision with root package name */
    public int f1971y;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1972a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1973b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1974c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1975d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1976e;

        public a(View view) {
            this.f1972a = (TextView) view.findViewById(16908308);
            this.f1973b = (TextView) view.findViewById(16908309);
            this.f1974c = (ImageView) view.findViewById(16908295);
            this.f1975d = (ImageView) view.findViewById(16908296);
            this.f1976e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public o0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1964r = 1;
        this.f1966t = -1;
        this.f1967u = -1;
        this.f1968v = -1;
        this.f1969w = -1;
        this.f1970x = -1;
        this.f1971y = -1;
        this.f1959m = searchView;
        this.f1960n = searchableInfo;
        this.f1963q = searchView.getSuggestionCommitIconResId();
        this.f1961o = context;
        this.f1962p = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    @Override // h0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // h0.a
    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f1966t = cursor.getColumnIndex("suggest_text_1");
                this.f1967u = cursor.getColumnIndex("suggest_text_2");
                this.f1968v = cursor.getColumnIndex("suggest_text_2_url");
                this.f1969w = cursor.getColumnIndex("suggest_icon_1");
                this.f1970x = cursor.getColumnIndex("suggest_icon_2");
                this.f1971y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    @Override // h0.a
    public CharSequence c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (!this.f1960n.shouldRewriteQueryFromData() || (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
            if (!this.f1960n.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                return null;
            }
            return h2;
        }
        return h3;
    }

    @Override // h0.a
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f2102l.inflate(this.f2100j, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f1963q);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f2092e.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else if (size != 2) {
                throw new FileNotFoundException("More than two path segments: " + uri);
            } else {
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f2092e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // h0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f2102l.inflate(this.f2101k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1972a.setText(e2.toString());
            }
            return inflate;
        }
    }

    @Override // h0.a, android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(this.f2092e, this.f2091d, viewGroup);
            ((a) d2.getTag()).f1972a.setText(e2.toString());
            return d2;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f2091d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f2091d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1959m.s((CharSequence) tag);
        }
    }
}