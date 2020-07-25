package com.example.sharif.blood_donaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHARIF on 8/14/2018.
 */

 public class CustomAdapter extends BaseAdapter {
    private List<Donete> dataset=new ArrayList<Donete>();
    private Context activity;
    private static LayoutInflater inflater;
    TextView name,num,cnic,group;
    public CustomAdapter(List<Donete> dataset, Context activity){
        this.dataset=dataset;
        this.activity=activity;
        inflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return dataset.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if(convertView==null) {
            v = inflater.inflate(R.layout.list, null);
        }
        Donete cun=dataset.get(position);
            name=v.findViewById(R.id.name2);
            name.setText(cun.getName());
            num=v.findViewById(R.id.number2);
            num.setText(cun.getPhone());
            cnic=v.findViewById(R.id.cnic2);
            cnic.setText(cun.getCnic());
            group=v.findViewById(R.id.group1);
            group.setText(cun.getB_group());
        return v;
    }
}
