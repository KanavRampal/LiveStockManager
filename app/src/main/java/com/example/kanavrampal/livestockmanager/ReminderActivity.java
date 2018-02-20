package com.example.kanavrampal.livestockmanager;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ReminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        Toolbar toolbar =  findViewById(R.id.toolbar);
        toolbar.setTitle("Reminders");
        setSupportActionBar(toolbar);

        ListView listView = (ListView) findViewById(R.id.listview);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<String> obj = new ArrayList<>();
        obj.add("aa");
        obj.add("aa");obj.add("aa");obj.add("aa");obj.add("aa");obj.add("aa");obj.add("aa");obj.add("aa");
        ReminderCustomAdaptor adaptor = new ReminderCustomAdaptor(this,obj);
        listView.setAdapter(adaptor);
    }

}
