package com.example.spinner;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class spinner_adapter extends ArrayAdapter<com.example.spinner.data_item> {
    Activity context;
    ArrayList<com.example.spinner.data_item> list;
    LayoutInflater inflater;
    public spinner_adapter(Activity context,int id,ArrayList<com.example.spinner.data_item> list){
        super(context,id,list);
        this.list=list;
        inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    public View getView(int position, View convertView , ViewGroup parent){
        View itemView = inflater.inflate(R.layout.spinner_row,parent,false);
        ImageView imageView=(ImageView)itemView.findViewById(R.id.imageView);
        TextView txtname= itemView.findViewById(R.id.txtname);
        TextView txtdetails=itemView.findViewById(R.id.txtdetails);
        com.example.spinner.data_item rowd =list.get(position);
        txtname.setText(rowd.name);
        txtdetails.setText(rowd.Details);
        imageView.setImageResource(rowd.image);
        return itemView;

    }
    public View getDropDownView(int position,View convertView,ViewGroup parent){
        return getView(position,convertView,parent);
    }
}
