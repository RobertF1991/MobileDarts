package com.example.rob.dcomproject;

import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class reg_Team extends AppCompatActivity {

    DatabaseH myDb;

    @Bind(R.id.submitData) Button submitData;
    @Bind(R.id.teamName) EditText team;
    @Bind(R.id.captain_name) EditText captain;
    @Bind(R.id.v_cap_name) EditText v_captain;
    @Bind(R.id.homeVenue) EditText home;


    @OnClick(R.id.submitData)
    public void addData(){
        submitData.setOnClickListener(
        new View.OnClickListener(){
            public void onClick(View v){
                Cursor check = myDb.getAllData3(team.getText().toString());

                if(team.getText().toString().equals("") || captain.getText().toString().equals("") ||
                        v_captain.getText().toString().equals("") || home.getText().toString().equals("")) {
                    Toast.makeText(reg_Team.this, "You have left a text field blank", Toast.LENGTH_LONG).show();
                }
                else if (check.getCount() != 0){
                    Toast.makeText(reg_Team.this, "Team name already exists", Toast.LENGTH_LONG).show();
                }
                else{
                    boolean isInserted = myDb.insertData(team.getText().toString(),
                            captain.getText().toString(),
                            v_captain.getText().toString(),
                            home.getText().toString());

                    if (isInserted == true)
                        Toast.makeText(reg_Team.this, "Inserted", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(reg_Team.this, "Not Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_team);

        ButterKnife.bind(this);
        myDb = new DatabaseH(this);
        addData();

        team.setBackgroundColor(Color.WHITE);
        captain.setBackgroundColor(Color.WHITE);
        v_captain.setBackgroundColor(Color.WHITE);
        home.setBackgroundColor(Color.WHITE);

    }



}
