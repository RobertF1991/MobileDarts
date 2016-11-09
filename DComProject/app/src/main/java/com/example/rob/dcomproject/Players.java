package com.example.rob.dcomproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Players extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        Button onePlayer = (Button) findViewById(R.id.onePlayer);
        onePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), One_Player.class);
                startActivityForResult(intent, 0);
            }
        });

        Button twoPlayer = (Button) findViewById(R.id.twoPlayers);
        twoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), TwoPlayers.class);
                startActivityForResult(intent, 0);
            }
        });



    }
}
