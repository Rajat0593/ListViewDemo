package com.f.rajat.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DynamicLists extends AppCompatActivity {
private ListView mStringListView,mArrayListView;
 private String[] mDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
 private ArrayList<String> mArrayListDays;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_lists);

        //initialize views
        mStringListView = findViewById(R.id.string_list_view);
        mArrayListView = findViewById(R.id.array_list_view);

        //initialize arrayList
         mArrayListDays = new ArrayList<>();

        /**you can directly push the values of the string[] using the addAll() with Arrays.asList() method
        *mArrayListDays.addAll(Arrays.asList(mDays));
        */

        //populate arrayList
        mArrayListDays.add("Monday");
        mArrayListDays.add("Tuesday");
        mArrayListDays.add("Wednesday");
        mArrayListDays.add("Thursday");
        mArrayListDays.add("Friday");
        mArrayListDays.add("Saturday");
        mArrayListDays.add("Sunday");

        //set the adapter with parameters(context,layout,dataSource(from where you are siplaying the data))
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1, mDays);
        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this,android.R.layout.simple_expandable_list_item_1, mArrayListDays);

        //set the adapters
        mStringListView.setAdapter(arrayAdapter);
        mArrayListView.setAdapter(arrayAdapter1);
    }
}