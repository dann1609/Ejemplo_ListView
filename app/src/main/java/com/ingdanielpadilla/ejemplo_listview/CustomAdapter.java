package com.ingdanielpadilla.ejemplo_listview;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Laboratorio on 29/09/2015.
 */
public class CustomAdapter extends BaseAdapter {

    private static final String TAG="AS_ListView";
    private Context context;
    private String[] values;

    public CustomAdapter(Context context,String[] values){
        this.context= context;
        this.values=values;
    }



    @Override
    public int getCount() {
        return values.length;
    }

    @Override
    public Object getItem(int position) {
        return values[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        String s=values[position];
        if(view==null){
            LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.custom_row,null);
        }
        Button button =(Button)view.findViewById(R.id.btnRemove);
        button.setFocusable(false);
        button.setFocusableInTouchMode(false);
        button.setTag(s);
        TextView f1=(TextView) view.findViewById(R.id.tvField1);
        f1.setText(s);
        view.setTag(s);
        return view;
    }
}


