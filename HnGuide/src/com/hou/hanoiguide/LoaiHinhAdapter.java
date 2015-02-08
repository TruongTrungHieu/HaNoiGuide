package com.hou.hanoiguide;

import java.util.Arrays;
import java.util.List;

import com.cipolat.slidenavigation.R;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ichimaru on 1/24/2015.
 */
public class LoaiHinhAdapter extends BaseAdapter {
    List<String> loaihinh;
    Boolean[] isExpand;
    Context context;
    private static LayoutInflater inflater = null;

    public LoaiHinhAdapter(Context context, List<String> loaihinh){
        this.context = context;
        this.loaihinh = loaihinh;
        isExpand = new Boolean[loaihinh.size()];
        Arrays.fill(isExpand, false);
        inflater = (LayoutInflater)context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return loaihinh.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = convertView;
        v = inflater.inflate(R.layout.loaihinh_listview, null);
        
        TextView tv_Loaihinh = (TextView) v.findViewById(R.id.tv_Loaihinh);
        tv_Loaihinh.setText(loaihinh.get(position));
        
        final ListView lv_Diadiem = (ListView) v.findViewById(R.id.lv_Diadiem);
        lv_Diadiem.setAdapter(new DiadiemAdapter(context,isExpand[position]));
        setListViewHeight(lv_Diadiem);
        
        final TextView tv_Seemore = (TextView) v.findViewById(R.id.tv_Seemore);
        SetText(tv_Seemore, isExpand[position]);
        tv_Seemore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	isExpand[position] = !isExpand[position];
                lv_Diadiem.setAdapter(new DiadiemAdapter(context, isExpand[position]));
                setListViewHeight(lv_Diadiem);
                SetText(tv_Seemore, isExpand[position]);
            }
        });
        return v;
    }

    void SetText(TextView tv, Boolean bool){
        if(bool)
        {
        	tv.setText("Rút g�?n");
        }
        else
        {
        	tv.setText("Xem thêm...");
        }
    }
    
    private void setListViewHeight(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + listView.getDividerHeight()*(listAdapter.getCount()-1);
        listView.setLayoutParams(params);
        listView.requestLayout();
    }
    
    
    class DiadiemAdapter extends BaseAdapter{
        String [] name;
        String [] address;
        Context context;
        int [] imageId;
        Thongtin thongtin;
        boolean showAll;

        private LayoutInflater inflater=null;
        public DiadiemAdapter(Context context, boolean showAll) {
            // TODO Auto-generated constructor stub
            thongtin = new Thongtin();
            this.showAll = showAll;
            this.name = thongtin.names;
            this.address = thongtin.addresses;
            this.imageId = thongtin.images;
            this.context = context;
            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            if(name.length < 2 || showAll)
                return name.length;
            return 2;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public class Holder
        {
            TextView tv_name,tv_address;
            ImageView img;
        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            Holder holder = new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.diadiem_listview, null);
            holder.tv_name =(TextView) rowView.findViewById(R.id.tv_Ten);
            holder.tv_address =(TextView) rowView.findViewById(R.id.tv_Diachi);
            holder.img=(ImageView) rowView.findViewById(R.id.iv_Diadiem);
            holder.tv_name.setText(name[position]);
            holder.tv_address.setText(address[position]);
            holder.img.setImageResource(imageId[position]);
            rowView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    Intent t = new Intent(context, Chitiet_Activity.class).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    v.getContext().startActivity(t);
                    
                }
            });
            return rowView;
        }
    }
}


