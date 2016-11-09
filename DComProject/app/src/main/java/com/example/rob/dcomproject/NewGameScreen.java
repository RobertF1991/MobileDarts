package com.example.rob.dcomproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.OnClick;

public class NewGameScreen extends AppCompatActivity {

    DatabaseH myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game_screen);

        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.myFAB);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showMeassage("Team Search", "Team:");
            }
        });


        Button newGame = (Button) findViewById(R.id.newGame);
        newGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                letsPlay();
                Intent intent = new Intent(v.getContext(), Checkout.class);
                startActivityForResult(intent, 0);
            }
        });

        Button leaguebtn = (Button) findViewById(R.id.leagueGame);
        leaguebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LeagueView.class);
                startActivityForResult(intent, 0);
            }
        });

        Button gamebth = (Button) findViewById(R.id.gameMatch);
        gamebth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), GameMatch.class);
                startActivityForResult(intent, 0);
            }
        });

        Button adminLog = (Button) findViewById(R.id.adminLogin);
        adminLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Login.class);
                startActivityForResult(intent, 0);
            }
        });




        myDb = new DatabaseH(this);





    }




    public void letsPlay(){
        MediaPlayer mp = MediaPlayer.create(NewGameScreen.this, R.raw.letsplaydarts);
        mp.start();
    }


    public void showMeassage(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setTitle(message);
        final EditText lot = new EditText(NewGameScreen.this);
        final Button send = new Button(NewGameScreen.this);

        lot.setInputType(InputType.TYPE_CLASS_TEXT);

        LinearLayout show = new LinearLayout(this);
        show.addView(lot);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                Cursor res = myDb.getAllData3(lot.getText().toString());
                if (res.getCount() == 0) {
                    Toast.makeText(NewGameScreen.this, "Please enter a value", Toast.LENGTH_LONG).show();
                } else {
                    int n = 1;
                    StringBuffer buffer = new StringBuffer();
                    while (res.moveToNext()) {
                        buffer.append("Position: " + n + "| \t");
                        buffer.append("Team: " + res.getString(1) + " " + "|\t");
                        buffer.append("Points: " + res.getString(3) + " " + "|\t");
                        buffer.append("Games Played: " + res.getString(2) + "|\t\n");
                        buffer.append("___________________________________\n");
                        buffer.append("Captain: " + res.getString(4) + " " + "|\t");
                        buffer.append("Vice Captain: " + res.getString(5) + " " + "|\t");
                        buffer.append("Home Venue: " + res.getString(6) + " " + "|\t\n");
                        buffer.append("___________________________________\n");
                        buffer.append("\n");

                        n++;
                    }
                    showMeassage2("Team", buffer.toString());
                }
            }
        });
        builder.setView(show);

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void showMeassage2(String team, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(team);
        builder.setMessage(s);
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }


}
