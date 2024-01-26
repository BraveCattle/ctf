package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class d extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public e f150b;

    /* renamed from: c  reason: collision with root package name */
    public int f151c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f152d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f153e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f154f;

    /* renamed from: g  reason: collision with root package name */
    public final int f155g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f153e = z2;
        this.f154f = layoutInflater;
        this.f150b = eVar;
        this.f155g = i2;
        a();
    }

    public void a() {
        e eVar = this.f150b;
        g gVar = eVar.f178v;
        if (gVar != null) {
            eVar.i();
            ArrayList<g> arrayList = eVar.f166j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == gVar) {
                    this.f151c = i2;
                    return;
                }
            }
        }
        this.f151c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public g getItem(int i2) {
        ArrayList<g> l2;
        if (this.f153e) {
            e eVar = this.f150b;
            eVar.i();
            l2 = eVar.f166j;
        } else {
            l2 = this.f150b.l();
        }
        int i3 = this.f151c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return l2.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> l2;
        if (this.f153e) {
            e eVar = this.f150b;
            eVar.i();
            l2 = eVar.f166j;
        } else {
            l2 = this.f150b.l();
        }
        int i2 = this.f151c;
        int size = l2.size();
        return i2 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f154f.inflate(this.f155g, viewGroup, false);
        }
        int i3 = getItem(i2).f185b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f150b.m() && i3 != (i4 >= 0 ? getItem(i4).f185b : i3));
        j.a aVar = (j.a) view;
        if (this.f152d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}