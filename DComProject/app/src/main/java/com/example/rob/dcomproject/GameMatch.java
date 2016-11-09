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

public class GameMatch extends AppCompatActivity {

    DatabaseH myDb;

    @Bind(R.id.submitbutton) Button submit;
    @Bind(R.id.homeTeam) EditText homeTeam;
    @Bind(R.id.awayTeam) EditText awayTeam;
    @Bind(R.id.match1) EditText match1;
    @Bind(R.id.match2) EditText match2;
    @Bind(R.id.match3) EditText match3;
    @Bind(R.id.match4) EditText match4;
    @Bind(R.id.match5) EditText match5;
    @Bind(R.id.matchScore) EditText matchscore;

    @OnClick(R.id.submitbutton)
    public void submit(){

        if(homeTeam.getText().toString().equals("") || awayTeam.getText().toString().equals("")) {
            Toast.makeText(GameMatch.this, "Please enter a team name", Toast.LENGTH_LONG).show();
        }
        else {
            Cursor check = myDb.getAllData3(homeTeam.getText().toString());
            Cursor check2 = myDb.getAllData3(awayTeam.getText().toString());


            if (check.getCount() != 0) {
                if (check2.getCount() != 0) {
                    boolean isInserted = myDb.insertScores(homeTeam.getText().toString(), awayTeam.getText().toString(), match1.getText().toString(),
                            match2.getText().toString(), match3.getText().toString(), match4.getText().toString(), match5.getText().toString(),
                            matchscore.getText().toString());

                    if (isInserted == true)
                        Toast.makeText(GameMatch.this, "Inserted", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(GameMatch.this, "Not Inserted", Toast.LENGTH_LONG).show();
                } else
                    Toast.makeText(GameMatch.this, "Team name not found", Toast.LENGTH_LONG).show();
            } else
                Toast.makeText(GameMatch.this, "Team name not found", Toast.LENGTH_LONG).show();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_match);
        ButterKnife.bind(this);
        myDb = new DatabaseH(this);
        homeTeam.setBackgroundColor(Color.WHITE);
        awayTeam.setBackgroundColor(Color.WHITE);
        match1.setBackgroundColor(Color.WHITE);
        match2.setBackgroundColor(Color.WHITE);
        match3.setBackgroundColor(Color.WHITE);
        match4.setBackgroundColor(Color.WHITE);
        match5.setBackgroundColor(Color.WHITE);
        matchscore.setBackgroundColor(Color.WHITE);
        
    }

}
