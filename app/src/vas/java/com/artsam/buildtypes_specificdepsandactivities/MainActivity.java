package com.artsam.buildtypes_specificdepsandactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] catNames = getResources().getStringArray(R.array.cat_names);

        RecyclerView recView = (RecyclerView) findViewById(R.id.rec_view);
        recView.setLayoutManager(new LinearLayoutManager(this));
        recView.setAdapter(new MyAdapter(catNames));

    }
}
