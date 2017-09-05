package com.scu.miomin.shswiperefreshlayout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class SimpleLvAdapter extends BaseAdapter {

    private List datas;
    private Context context;

    // 构造器
    public SimpleLvAdapter(Context context, List datas) {
        super();
        this.datas = datas;
        this.context = context;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.simple_item, null);
        }
        return convertView;
    }
}