package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.x64m.xsfmnative.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f142b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f143c;

    /* renamed from: d  reason: collision with root package name */
    public e f144d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f145e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f146f;

    /* renamed from: g  reason: collision with root package name */
    public a f147g;

    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f148b = -1;

        public a() {
            a();
        }

        public void a() {
            e eVar = c.this.f144d;
            g gVar = eVar.f178v;
            if (gVar != null) {
                eVar.i();
                ArrayList<g> arrayList = eVar.f166j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == gVar) {
                        this.f148b = i2;
                        return;
                    }
                }
            }
            this.f148b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public g getItem(int i2) {
            e eVar = c.this.f144d;
            eVar.i();
            ArrayList<g> arrayList = eVar.f166j;
            Objects.requireNonNull(c.this);
            int i3 = i2 + 0;
            int i4 = this.f148b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            e eVar = c.this.f144d;
            eVar.i();
            int size = eVar.f166j.size();
            Objects.requireNonNull(c.this);
            int i2 = size + 0;
            return this.f148b < 0 ? i2 : i2 - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.Adapter
        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f143c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).d(getItem(i2), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i2) {
        this.f142b = context;
        this.f143c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f147g == null) {
            this.f147g = new a();
        }
        return this.f147g;
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z2) {
        i.a aVar = this.f146f;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean c(e eVar, g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f146f = aVar;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f(l lVar) {
        if (lVar.hasVisibleItems()) {
            f fVar = new f(lVar);
            b.a aVar = new b.a(lVar.f157a);
            c cVar = new c(aVar.f67a.f53a, R.layout.abc_list_menu_item_layout);
            fVar.f183d = cVar;
            cVar.f146f = fVar;
            e eVar = fVar.f181b;
            eVar.b(cVar, eVar.f157a);
            ListAdapter a2 = fVar.f183d.a();
            AlertController.b bVar = aVar.f67a;
            bVar.f59g = a2;
            bVar.f60h = fVar;
            View view = lVar.f171o;
            if (view != null) {
                bVar.f57e = view;
            } else {
                bVar.f55c = lVar.f170n;
                bVar.f56d = lVar.f169m;
            }
            bVar.f58f = fVar;
            androidx.appcompat.app.b a3 = aVar.a();
            fVar.f182c = a3;
            a3.setOnDismissListener(fVar);
            WindowManager.LayoutParams attributes = fVar.f182c.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            fVar.f182c.show();
            i.a aVar2 = this.f146f;
            if (aVar2 != null) {
                aVar2.c(lVar);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(boolean z2) {
        a aVar = this.f147g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, e eVar) {
        if (this.f142b != null) {
            this.f142b = context;
            if (this.f143c == null) {
                this.f143c = LayoutInflater.from(context);
            }
        }
        this.f144d = eVar;
        a aVar = this.f147g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean k(e eVar, g gVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f144d.r(this.f147g.getItem(i2), this, 0);
    }
}