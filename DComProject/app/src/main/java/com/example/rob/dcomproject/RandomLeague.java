package com.example.rob.dcomproject;

import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class RandomLeague extends AppCompatActivity {

    ListView listview;
    ArrayAdapter adapter;
    DatabaseH myDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_league);
        myDb = new DatabaseH(this);


        Cursor res = myDb.getAllData();
        if(res.getColumnCount() == 0){


            return;
        }

        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Team: " + res.getString(1) + "\n");
        }

    }

}
