package com.example.sarah.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.attr.resource;

public class MainActivity extends AppCompatActivity {
ListView Gallery;
    ArrayList<Item> items=new ArrayList<Item>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gallery= (ListView) findViewById(R.id.listview);
        items.add(new Item("desert",R.drawable.pic));
//items.add(new Item("night",R.drawable.night));
        CustomAdapter custom= new CustomAdapter(this,R.layout.custom_row,items);
        Gallery.setAdapter(custom);
    }
}
