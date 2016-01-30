package com.artsam.buildtypes_specificdepsandactivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] catNames = getResources().getStringArray(R.array.cat_names);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(new MyAdapter(this, catNames));

    }
}
