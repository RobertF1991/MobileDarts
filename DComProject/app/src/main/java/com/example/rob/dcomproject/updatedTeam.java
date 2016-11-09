package com.example.rob.dcomproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Rob on 31/03/2016.
 */
public class updatedTeam extends Activity {

    DatabaseH myDb;

    @Bind(R.id.updateBtn) Button btnUpdate;
    @Bind(R.id.teamUpdate) EditText teamUpdate;
    @Bind(R.id.pointsUpdate) EditText pointsUpdate;
    @Bind(R.id.playedUpdate) EditText playedUpdate;

    String played = playedUpdate.getText().toString();
    int played2 = Integer.parseInt(played);

    String points = pointsUpdate.getText().toString();
    int points2 = Integer.parseInt(points);

    @OnClick(R.id.updateBtn)
    public void updateDate(){
        btnUpdate.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        boolean isUpdate = myDb.updateDate(teamUpdate.getText().toString(),
                                points2, played2);
                        if(isUpdate == true)
                            Toast.makeText(updatedTeam.this, "Updated", Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(updatedTeam.this, "Not Updated", Toast.LENGTH_LONG).show();
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_drawer);
        myDb = new DatabaseH(this);
        ButterKnife.bind(this);
    }

}
