package com.example.rob.dcomproject;


import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LeagueTables extends AppCompatActivity{

    DatabaseH myDb;

    @Bind(R.id.preDiv) Button preDiv;

    @OnClick(R.id.preDiv)
      public void viewAll(){
        preDiv.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View V){
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0){

                            Toast toast = Toast.makeText(LeagueTables.this, "No league table found", Toast.LENGTH_LONG);
                            toast.setGravity(Gravity.CENTER, 0, 0);
                            toast.show();
                            return;
                        }



                        int n = 1;
                        StringBuffer buffer = new StringBuffer();
                        while(res.moveToNext()){
                            buffer.append("Position: " + n + "| \t");
                            buffer.append("Team: " + res.getString(1) + " " + "|\t");
                            buffer.append("Points: " + res.getString(3) + " " + "|\t");
                            buffer.append("Games Played: " + res.getString(2) + "|\t\n");
                            buffer.append("___________________________________\n");
                            buffer.append("\n");

                            n++;
                        }

                        showMeassage("League", buffer.toString());
                    }
                }
        );

    }

    public void showMeassage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
        alertDialog.getWindow().setLayout(1350, 2000);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league_tables);
        myDb = new DatabaseH(this);
        ButterKnife.bind(this);
        viewAll();


    }





}
