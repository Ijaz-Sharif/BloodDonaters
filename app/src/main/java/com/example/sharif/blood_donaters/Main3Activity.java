package com.example.sharif.blood_donaters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {
   ListView listView;
   List<Donete> data=new ArrayList<Donete>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        listView=findViewById(R.id.list);
        Database datbase=new Database(Main3Activity.this);
        data=datbase.getData();
        CustomAdapter customAdapter=new CustomAdapter(data,this);
        listView.setAdapter(customAdapter);
    }
}
