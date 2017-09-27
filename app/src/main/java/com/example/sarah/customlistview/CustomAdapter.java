package com.example.sarah.customlistview;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sarah on 9/27/2017.
 */

public class CustomAdapter extends ArrayAdapter<Item> {
    private int resource;
    public CustomAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Item> objects) {
        super(context, R.layout.custom_row, objects);

    }


    public View getView(int positon,View convertView,ViewGroup parent ) {
        LayoutInflater imageInflater = LayoutInflater.from(getContext());
        View CuView = imageInflater.inflate(R.layout.custom_row ,parent,false );
        Item item=getItem(positon);
        TextView title = (TextView) CuView.findViewById(R.id.textView);
        ImageView image = (ImageView) CuView.findViewById(R.id.imageView);
        title.setText(item.getTitle());
        image.setImageResource(item.getImageid());
        return CuView;

    }
}
