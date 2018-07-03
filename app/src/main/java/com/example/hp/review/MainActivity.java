package com.example.hp.review;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public  class MainActivity extends Activity {
    List<Model> modelList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modelList = new ArrayList<>();

        modelList.add(new Model(R.mipmap.ic_launcher_round,R.drawable.ic_launcher_background,"Riya","parava","Carnival","malayalam","2D","8/10","Drama","60k","40k"));
        modelList.add(new Model(R.mipmap.ic_launcher_round,R.drawable.ic_launcher_background,"Swetha","mahanati","DCinemas","Tamil","2D","9/10","Biopic","1000k","70k"));
        modelList.add(new Model(R.mipmap.ic_launcher_round,R.drawable.ic_launcher_background,"Arya","Dilse","PVR","Hindi","2D","5/10","Action","120k","20k"));
        listView = (ListView) findViewById(R.id.listview);
        MyCustomListAdapter adapter = new MyCustomListAdapter(this, R.layout.activity_main, modelList);
        listView.setAdapter(adapter);


    }
}
