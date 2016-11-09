package com.example.rob.dcomproject;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    DatabaseH myDb;

    @Bind(R.id.btnUpdate) Button btnUpdate;
    @Bind(R.id.teamUpdate) EditText teamUpdate;
    @Bind(R.id.pointsUpdate) EditText pointsUpdate;
    @Bind(R.id.playedUpdate) EditText playedUpdate;
    @Bind(R.id.viewBtn) Button viewBtn;
    @Bind(R.id.btnScores) Button btnScores;
    @Bind(R.id.btnClear) Button btnClear;
    @Bind(R.id.btnDelete) Button btnDelete;

    @OnClick(R.id.btnUpdate)
    public void updateData(){
        btnUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String played = playedUpdate.getText().toString();


                        String points = pointsUpdate.getText().toString();

                        String team = teamUpdate.getText().toString();

                        Cursor check = myDb.getAllData3(teamUpdate.getText().toString());


                        if(check.getCount() != 0) {

                            if(points.matches("") || played.matches("")){
                                Toast.makeText(MainActivity.this, "Please enter a value", Toast.LENGTH_LONG).show();
                            }
                            else {

                                int points2 = Integer.parseInt(points);
                                int played2 = Integer.parseInt(played);

                                boolean isUpdate = myDb.updateDate(team,
                                        points2, played2);
                                if (isUpdate == true)
                                    Toast.makeText(MainActivity.this, "Updated", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(MainActivity.this, "Not Updated", Toast.LENGTH_LONG).show();
                            }
                        }
                        else

                            Toast.makeText(MainActivity.this, "No Team", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    @OnClick(R.id.viewBtn)
    public void getTeams(){

        Cursor res = myDb.getAllData2();
        if(res.getCount() == 0){

            Toast toast = Toast.makeText(MainActivity.this, "No league table found", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }


        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Team: " + res.getString(1) + " " + "\t\n");
        }

        showMessage("League", buffer.toString());

    }

    @OnClick(R.id.btnScores)
    public void getScroes(){
        Cursor res = myDb.getScoresData();
        if(res.getCount() == 0){

            Toast toast = Toast.makeText(MainActivity.this, "No scores found", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
            return;
        }


        StringBuffer buffer = new StringBuffer();
        while(res.moveToNext()){
            buffer.append("Home Team: " + res.getString(0) + " " + "\t");
            buffer.append("Away Team: " + res.getString(1) + " " + "\t");
            buffer.append("Match Score: " + res.getString(7) + " " + "\t\n");
        }

        showMessage("Scores", buffer.toString());


    }

    @OnClick(R.id.btnDelete)
    public void delete(){
        myDb.deleteTeam(teamUpdate.getText().toString());
        Toast toast = Toast.makeText(MainActivity.this, "Team deleted", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @OnClick(R.id.btnClear)
    public void clear(){
                      myDb.clearScores();
        Toast toast = Toast.makeText(MainActivity.this, "Scores cleared", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showMessage(String title, String message){
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
        setContentView(R.layout.activity_main);
        myDb = new DatabaseH(this);
        ButterKnife.bind(this);
        updateData();
    }

}
