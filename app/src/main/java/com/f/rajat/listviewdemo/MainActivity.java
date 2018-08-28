package com.f.rajat.listviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button static_list_button,dynamic_list_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        initClickListeners();
    }

    private void initClickListeners() {
        static_list_button.setOnClickListener(this);
        dynamic_list_button.setOnClickListener(this);
    }

    private void initViews() {
        static_list_button = findViewById(R.id.simple_list_xml);
        dynamic_list_button = findViewById(R.id.dynamic_list_java);
    }

    //for multiple clickable items
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.simple_list_xml:
                Intent goToStaticListsUsingXml = new Intent(MainActivity.this,StaticListsUsingXml.class);
                startActivity(goToStaticListsUsingXml);

                break;
            case R.id.dynamic_list_java:
                Intent goToDynamicListsUsingJava = new Intent(MainActivity.this,DynamicLists.class);
                startActivity(goToDynamicListsUsingJava);

                break;
        }
    }
}
