package com.example.rob.dcomproject;

import android.content.Intent;
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

public class Login extends AppCompatActivity {

    @Bind(R.id.logBtn) Button logBtn;
    @Bind(R.id.userName) EditText user;
    @Bind(R.id.passWd) EditText pass;



    @OnClick(R.id.logBtn)
    public void log(){
        String top = user.getText().toString();
        String bottom = pass.getText().toString();
        if("admin".equals(top) && "admin".equals(bottom)) {
            Intent intent = new Intent(Login.this, MainActivity.class);
            startActivityForResult(intent, 0);
            Toast.makeText(Login.this, "Logged in", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(Login.this, "Incorrect Username or Password", Toast.LENGTH_LONG).show();
            user.requestFocus();

        }
        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        user.setBackgroundColor(Color.WHITE);
        pass.setBackgroundColor(Color.WHITE);
    }

}
