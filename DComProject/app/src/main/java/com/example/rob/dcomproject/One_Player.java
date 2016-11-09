package com.example.rob.dcomproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class One_Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one__player);

        Button fivebtn = (Button) findViewById(R.id.fiveOh);
        fivebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Five.class);
                startActivityForResult(intent, 0);
            }
        });

        Button therebth = (Button) findViewById(R.id.threeOh);
        therebth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Five.class);
                startActivityForResult(intent, 0);
            }
        });

        Button checkbth = (Button) findViewById(R.id.checkOut);
        checkbth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Checkout.class);
        startActivityForResult(intent, 0);
    }
});

        Button unlimbth = (Button) findViewById(R.id.unlim);
        unlimbth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Unlimited.class);
                startActivityForResult(intent, 0);
            }
        });


    }

}
