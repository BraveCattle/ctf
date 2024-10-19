package h0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h0.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f2089b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2090c;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f2091d;

    /* renamed from: e  reason: collision with root package name */
    public Context f2092e;

    /* renamed from: f  reason: collision with root package name */
    public int f2093f;

    /* renamed from: g  reason: collision with root package name */
    public C0025a f2094g;

    /* renamed from: h  reason: collision with root package name */
    public DataSetObserver f2095h;

    /* renamed from: i  reason: collision with root package name */
    public h0.b f2096i;

    /* renamed from: h0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0025a extends ContentObserver {
        public C0025a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            Cursor cursor;
            a aVar = a.this;
            if (!aVar.f2090c || (cursor = aVar.f2091d) == null || cursor.isClosed()) {
                return;
            }
            aVar.f2089b = aVar.f2091d.requery();
        }
    }

    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f2089b = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f2089b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z2) {
        b bVar;
        boolean z3 = z2 ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.f2090c = true;
        } else {
            this.f2090c = false;
        }
        boolean z4 = cursor != null;
        this.f2091d = cursor;
        this.f2089b = z4;
        this.f2092e = context;
        this.f2093f = z4 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.f2094g = new C0025a();
            bVar = new b();
        } else {
            bVar = null;
            this.f2094g = null;
        }
        this.f2095h = bVar;
        if (z4) {
            C0025a c0025a = this.f2094g;
            if (c0025a != null) {
                cursor.registerContentObserver(c0025a);
            }
            DataSetObserver dataSetObserver = this.f2095h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f2091d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0025a c0025a = this.f2094g;
                if (c0025a != null) {
                    cursor2.unregisterContentObserver(c0025a);
                }
                DataSetObserver dataSetObserver = this.f2095h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f2091d = cursor;
            if (cursor != null) {
                C0025a c0025a2 = this.f2094g;
                if (c0025a2 != null) {
                    cursor.registerContentObserver(c0025a2);
                }
                DataSetObserver dataSetObserver2 = this.f2095h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f2093f = cursor.getColumnIndexOrThrow("_id");
                this.f2089b = true;
                notifyDataSetChanged();
            } else {
                this.f2093f = -1;
                this.f2089b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f2089b || (cursor = this.f2091d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (this.f2089b) {
            this.f2091d.moveToPosition(i2);
            if (view == null) {
                c cVar = (c) this;
                view = cVar.f2102l.inflate(cVar.f2101k, viewGroup, false);
            }
            a(view, this.f2092e, this.f2091d);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f2096i == null) {
            this.f2096i = new h0.b(this);
        }
        return this.f2096i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f2089b || (cursor = this.f2091d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f2091d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f2089b && (cursor = this.f2091d) != null && cursor.moveToPosition(i2)) {
            return this.f2091d.getLong(this.f2093f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (this.f2089b) {
            if (this.f2091d.moveToPosition(i2)) {
                if (view == null) {
                    view = d(this.f2092e, this.f2091d, viewGroup);
                }
                a(view, this.f2092e, this.f2091d);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}