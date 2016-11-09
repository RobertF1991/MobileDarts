package com.example.rob.dcomproject;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Checkout extends AppCompatActivity {

    @Bind(R.id.dart1) ImageView dart1;
    @Bind(R.id.dart2) ImageView dart2;
    @Bind(R.id.dart3) ImageView dart3;

    @Bind(R.id.btn1) Button btn1;
    @Bind(R.id.btn1two) Button btn1Two;
    @Bind(R.id.btnD1) Button btnD1;
    @Bind(R.id.btnD1two) Button btnD1Two;
    @Bind(R.id.btnT1) Button btnT1;

    @Bind(R.id.btn2) Button btn2;
    @Bind(R.id.btn2Two) Button btn2Two;
    @Bind(R.id.btnD2) Button btnD2;
    @Bind(R.id.btnD2Two) Button btnD2Two;
    @Bind(R.id.btnD2Three) Button btnD2Three;
    @Bind(R.id.btnT2Two) Button btnT2;

    @Bind(R.id.btn3) Button btn3;
    @Bind(R.id.btnD3) Button btn3D;
    @Bind(R.id.btnD3Two) Button btn3DTwo;
    @Bind(R.id.btn3Two) Button btn3Two;
    @Bind(R.id.btnT3) Button btnT3;

    @Bind(R.id.btn4) Button btn4;
    @Bind(R.id.btn4Two) Button btn4Two;
    @Bind(R.id.btn4Three) Button btn4Three;
    @Bind(R.id.btnD4) Button btnD4;
    @Bind(R.id.btnD4two) Button btnD4Two;
    @Bind(R.id.btnD4three) Button btnD4Three;
    @Bind(R.id.btnT4) Button btnT4;
    @Bind(R.id.btnT4two) Button btnT4Two;

    @Bind(R.id.btn5) Button btn5;
    @Bind(R.id.btn5Two) Button btn5Two;
    @Bind(R.id.btnD5) Button btnD5;
    @Bind(R.id.btnD5Two) Button btnD5Two;
    @Bind(R.id.btnT5) Button btnT5;

    @Bind(R.id.btn6) Button btn6;
    @Bind(R.id.btn6Two) Button btn6Two;
    @Bind(R.id.btnD6) Button btnD6;
    @Bind(R.id.btnD6Two) Button btnD6Two;
    @Bind(R.id.btnD6Three) Button btnD6Three;
    @Bind(R.id.btnT6) Button btnT6;
    @Bind(R.id.btnT6Two) Button btnT6Two;

    @Bind(R.id.btn7) Button btn7;
    @Bind(R.id.btn7Two) Button btn7Two;
    @Bind(R.id.btn7Three) Button btn7Three;
    @Bind(R.id.btnD7) Button btnD7;
    @Bind(R.id.btnD7Two) Button btnD7two;
    @Bind(R.id.btnT7) Button btnT7;

    @Bind(R.id.btn8) Button btn8;
    @Bind(R.id.btn8Two) Button btn8Two;
    @Bind(R.id.btn8Three) Button btn8Three;
    @Bind(R.id.btnD8) Button btnD8;
    @Bind(R.id.btnD8Two) Button btnD8Two;
    @Bind(R.id.btnD8hree) Button btnD8Three;
    @Bind(R.id.btnT8) Button btnT8;
    @Bind(R.id.btnT8Two) Button btnT8two;

    @Bind(R.id.btn9) Button btn9;
    @Bind(R.id.btn9Two) Button btn9Two;
    @Bind(R.id.btnD9) Button btnD9;
    @Bind(R.id.btnD9Two) Button btnD9Two;
    @Bind(R.id.btnD9Three) Button btnD9Three;
    @Bind(R.id.btnT9) Button btnT9;
    @Bind(R.id.btnT9Two) Button btnT9Two;

    @Bind(R.id.btn10) Button btn10;
    @Bind(R.id.btn10Two) Button btn10Two;
    @Bind(R.id.btnD10) Button btnD10;
    @Bind(R.id.btnD10Two) Button btnD10Two;
    @Bind(R.id.btnD10Three) Button btnD10Three;
    @Bind(R.id.btnT10) Button btnT10;
    @Bind(R.id.btnT10Two) Button btnT10Two;

    @Bind(R.id.btn11) Button btn11;
    @Bind(R.id.btn11Two) Button btn11Two;
    @Bind(R.id.btnD11) Button btnD11;
    @Bind(R.id.btnT11) Button btnT11;

    @Bind(R.id.btn12) Button btn12;
    @Bind(R.id.btn12two) Button btn12Two;
    @Bind(R.id.btnD12) Button btnD12;
    @Bind(R.id.btnD12Two) Button btnD12Two;
    @Bind(R.id.btnT12) Button btnT12;
    @Bind(R.id.btnT12Two) Button btnT12Two;

    @Bind(R.id.btn13) Button btn13;
    @Bind(R.id.btn13Three) Button btn13Two;
    @Bind(R.id.btnD13) Button btnD13;
    @Bind(R.id.btnD13Two) Button btnD13Two;
    @Bind(R.id.btnD13Three) Button btnD13Three;
    @Bind(R.id.btnT13) Button btnT13;
    @Bind(R.id.btnT13Two) Button btnT13Two;

    @Bind(R.id.btn14) Button btn14;
    @Bind(R.id.btn14Two) Button btn14Two;
    @Bind(R.id.btnD14) Button btnD14;
    @Bind(R.id.btnD14Two) Button btnD14Two;
    @Bind(R.id.btnT14) Button btnT14;

    @Bind(R.id.btn15) Button btn15;
    @Bind(R.id.btn15Two) Button btn15Two;
    @Bind(R.id.btnD15) Button btnD15;
    @Bind(R.id.btnD15Two) Button btnD15Two;
    @Bind(R.id.btnD15Three) Button btnD15Three;
    @Bind(R.id.btnT15) Button btnT15;
    @Bind(R.id.btnT15Two) Button btnT15Two;

    @Bind(R.id.btn16) Button btn16;
    @Bind(R.id.btn16Two) Button btn16Two;
    @Bind(R.id.btnD16) Button btnD16;
    @Bind(R.id.btnD16Two) Button btnD16Two;
    @Bind(R.id.btnT16) Button btnT16;

    @Bind(R.id.btn17) Button btn17;
    @Bind(R.id.btn17Two) Button btn17Two;
    @Bind(R.id.btn17Three) Button btn17Three;
    @Bind(R.id.btnD17) Button btnD17;
    @Bind(R.id.btnD17Two) Button btnD17Two;
    @Bind(R.id.btnT17) Button btnT17;

    @Bind(R.id.btn18) Button btn18;
    @Bind(R.id.btn18two) Button btn18Two;
    @Bind(R.id.btn18Three) Button btn18Three;
    @Bind(R.id.btnD18) Button btnD18;
    @Bind(R.id.btnD18Two) Button btnD18Two;
    @Bind(R.id.btnT18) Button btnT18;
    @Bind(R.id.btnT18Two) Button btnT18Two;

    @Bind(R.id.btn19) Button btn19;
    @Bind(R.id.btn19Two) Button btn19Two;
    @Bind(R.id.btnD19) Button btnD19;
    @Bind(R.id.btnD19Two) Button btnD19Two;
    @Bind(R.id.btnT19) Button btnT19;

    @Bind(R.id.btn20) Button btn20;
    @Bind(R.id.btn20two) Button btn20Two;
    @Bind(R.id.D20) Button D20;
    @Bind(R.id.T20) Button T20;

    @Bind(R.id.checkOut) TextView text;
    @Bind(R.id.score) TextView fullScore;
    @Bind(R.id.hint) TextView hint;
    @Bind(R.id.scoreLine) TextView scoreLine;

    int score = 501;
    int total = 0;
    int undo = 0;
    int dartImage = 0;

    @OnClick({R.id.btn1, R.id.btn1two})
    public void cal1(Button btn){
        boolean yes = checkBust();
        total =+ 1;
        dartImage++;
        if(yes == false) {
            score = score - 1;
            total =+ 1;
            undo = 1;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick(R.id.btnD1)
    public void calD1(Button btn){
        boolean yes = checkBust();
        total =+ 2;
        dartImage++;
        if(yes == false) {
            score = score - 2;
            total =+2;
            undo = 2;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick(R.id.btnT1)
    public void calT1(Button btn){
        boolean yes = checkBust();
        total =+ 3;
        dartImage++;
        if(yes == false) {
            score = score - 3;
            total =+ 3;
            undo = 3;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn2, R.id.btn2Two})
    public void cal2(Button btn){
        boolean yes = checkBust();
        total =+ 2;
        dartImage++;
        if(yes == false) {
            score = score - 2;
            total =+ 2;
            undo = 2;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD2, R.id.btnD2Two, R.id.btnD2Three})
    public void calD2(Button btn){
        boolean yes = checkBust();
        total =+ 4;
        dartImage++;
        if(yes == false) {
            score = score - 4;
            total =+ 4;
            undo = 4;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT2Two})
    public void callT2(Button btn){
        boolean yes = checkBust();
        total =+ 6;
        dartImage++;
        if(yes == false) {
            score = score - 6;
            total =+ 6;
            undo = 6;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn3, R.id.btn3Two})
    public void cal3(Button btn){
        boolean yes = checkBust();
        total =+ 3;
        dartImage++;
        if(yes == false) {
            score = score - 3;
            total =+ 3;
            undo = 3;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }



    @OnClick({R.id.btnT3})
    public void calT3(Button btn){
        boolean yes = checkBust();
        total =+ 9;
        dartImage++;
        if(yes == false) {
            score = score - 9;
            total =+ 9;
            undo = 9;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn4, R.id.btn4Two, R.id.btn4Three})
    public void cal4(Button btn){
        boolean yes = checkBust();
        total =+ 4;
        dartImage++;
        if(yes == false) {
            score = score - 4;
            total =+ 4;
            undo = 4;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD4, R.id.btnD4two, R.id.btnD4three})
    public void calD4(Button btn){
        boolean yes = checkBust();
        total =+ 8;
        dartImage++;
        if(yes == false) {
            score = score - 8;
            total =+ 8;
            undo = 8;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT4, R.id.btnT2Two})
    public void calT2(Button btn){
        boolean yes = checkBust();
        total =+ 6;
        dartImage++;
        if(yes == false) {
            score = score - 6;
            total =+ 6;
            undo = 6;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn5, R.id.btn5Two})
    public void cal5(Button btn){
        boolean yes = checkBust();
        total =+ 5;
        dartImage++;
        if(yes == false) {
            score = score - 5;
            total =+ 5;
            undo = 5;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }



    @OnClick({R.id.btnT5})
    public void calT5(Button btn){
        boolean yes = checkBust();
        total =+ 15;
        dartImage++;
        if(yes == false) {
            score = score - 15;
            total =+ 15;
            undo = 15;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }






    @OnClick({R.id.btn6, R.id.btn6Two})
    public void cal6(Button btn){
        boolean yes = checkBust();
        total =+ 6;
        dartImage++;
        if(yes == false) {
            score = score - 6;
            total =+ 6;
            undo = 6;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD6, R.id.btnD6Two, R.id.btnD6Three})
    public void calD6(Button btn){
        boolean yes = checkBust();
        total =+ 12;
        dartImage++;
        if(yes == false) {
            score = score - 12;
            total =+ 12;
            undo = 12;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT6, R.id.btnT6Two})
    public void calT6(Button btn){
        boolean yes = checkBust();
        total =+ 18;
        dartImage++;
        if(yes == false) {
            score = score - 18;
            total =+ 18;
            undo = 18;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }






    @OnClick({R.id.btn7, R.id.btn7Two, R.id.btn7Three})
    public void cal7(Button btn){
        boolean yes = checkBust();
        total =+ 7;
        dartImage++;
        if(yes == false) {
            score = score - 7;
            total =+ 7;
            undo = 7;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD7, R.id.btnD7Two})
    public void calD7(Button btn){
        boolean yes = checkBust();
        total =+ 14;
        dartImage++;
        if(yes == false) {
            score = score - 14;
            total =+ 14;
            undo = 14;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT7})
    public void calT7(Button btn){
        boolean yes = checkBust();
        total =+ 14;
        dartImage++;
        if(yes == false) {
            score = score - 14;
            total =+ 14;
            undo = 14;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }






    @OnClick({R.id.btn8, R.id.btn8Two, R.id.btn8Three})
    public void cal8(Button btn){
        boolean yes = checkBust();
        total =+ 8;
        dartImage++;
        if(yes == false) {
            score = score - 8;
            total =+ 8;
            undo = 8;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD8, R.id.btnD8Two, R.id.btnD8hree})
    public void calD8(Button btn){
        boolean yes = checkBust();
        total =+ 16;
        dartImage++;
        if(yes == false) {
            score = score - 16;
            total =+ 16;
            undo = 16;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT8, R.id.btnT8Two})
    public void calT8(Button btn){
        boolean yes = checkBust();
        total =+ 24;
        dartImage++;
        if(yes == false) {
            score = score - 24;
            total =+ 24;
            undo = 24;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn9, R.id.btn9Two})
    public void cal9(Button btn){
        boolean yes = checkBust();
        total =+ 9;
        dartImage++;
        if(yes == false) {
            score = score - 9;
            total =+ 9;
            undo = 9;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD9, R.id.btnD9Two, R.id.btnD9Three})
    public void calD9(Button btn){
        boolean yes = checkBust();
        total =+ 18;
        dartImage++;
        if(yes == false) {
            score = score - 18;
            total =+ 18;
            undo = 18;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT9, R.id.btnT9Two})
    public void calT9(Button btn){
        boolean yes = checkBust();
        total =+ 27;
        dartImage++;
        if(yes == false) {
            score = score - 27;
            total =+ 27;
            undo = 27;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn10, R.id.btn10Two})
    public void cal10(Button btn){
        boolean yes = checkBust();
        total =+ 10;
        dartImage++;
        if(yes == false) {
            score = score - 10;
            total =+ 10;
            undo = 10;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD10, R.id.btnD10Two, R.id.btnD10Three})
    public void calD10(Button btn){
        boolean yes = checkBust();
        total =+ 20;
        dartImage++;
        if(yes == false) {
            score = score - 10;
            total =+ 10;
            undo = 10;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT10, R.id.btnT10Two})
    public void calT10(Button btn){
        boolean yes = checkBust();
        total =+ 30;
        dartImage++;
        if(yes == false) {
            score = score - 30;
            total =+ 30;
            undo = 30;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn11, R.id.btn11Two})
    public void cal11(Button btn){
        boolean yes = checkBust();
        total =+ 11;
        dartImage++;
        if(yes == false) {
            score = score - 11;
            total =+ 11;
            undo = 11;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD11})
    public void calD11(Button btn){
        boolean yes = checkBust();
        total =+ 22;
        dartImage++;
        if(yes == false) {
            score = score - 22;
            total =+ 22;
            undo = 22;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT11})
    public void calT11(Button btn){
        boolean yes = checkBust();
        total =+ 33;
        dartImage++;
        if(yes == false) {
            score = score - 33;
            total =+ 33;
            undo = 33;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn12, R.id.btn12two})
    public void cal12(Button btn){
        boolean yes = checkBust();
        total =+ 12;
        dartImage++;
        if(yes == false) {
            score = score - 12;
            total =+ 12;
            undo = 12;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD12, R.id.btnD12Two})
    public void calD12(Button btn){
        boolean yes = checkBust();
        total =+ 24;
        dartImage++;
        if(yes == false) {
            score = score - 24;
            total =+ 24;
            undo = 24;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT12, R.id.btnT12Two})
    public void calT12(Button btn){
        boolean yes = checkBust();
        total =+ 36;
        dartImage++;
        if(yes == false) {
            score = score - 36;
            total =+ 36;
            undo = 36;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }







    @OnClick({R.id.btn13, R.id.btn13Three})
    public void cal13(Button btn){
        boolean yes = checkBust();
        total =+ 13;
        dartImage++;
        if(yes == false) {
            score = score - 13;
            total =+ 13;
            undo = 13;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD13, R.id.btnD13Two, R.id.btnD13Three})
    public void calD13(Button btn){
        boolean yes = checkBust();
        total =+ 26;
        dartImage++;
        if(yes == false) {
            score = score - 26;
            total =+ 26;
            undo = 26;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT13, R.id.btnT13Two})
    public void calT13(Button btn){
        boolean yes = checkBust();
        total =+ 39;
        dartImage++;
        if(yes == false) {
            score = score - 39;
            total =+ 39;
            undo = 39;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn14, R.id.btn14Two})
    public void cal14(Button btn){
        boolean yes = checkBust();
        total =+ 14;
        dartImage++;
        if(yes == false) {
            score = score - 14;
            total =+ 14;
            undo = 14;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD14, R.id.btnD14Two})
    public void cald14(Button btn){
        boolean yes = checkBust();
        total =+ 28;
        dartImage++;
        if(yes == false) {
            score = score - 28;
            total =+ 28;
            undo = 28;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT14})
    public void calT14(Button btn){
        boolean yes = checkBust();
        total =+ 42;
        dartImage++;
        if(yes == false) {
            score = score - 42;
            total =+ 42;
            undo = 42;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn15, R.id.btn15Two})
    public void cal15(Button btn){
        boolean yes = checkBust();
        total =+ 15;
        dartImage++;
        if(yes == false) {
            score = score - 15;
            total =+ 15;
            undo = 15;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD15, R.id.btnD15Two, R.id.btnD15Three})
    public void calD15(Button btn){
        boolean yes = checkBust();
        total =+ 30;
        dartImage++;
        if(yes == false) {
            score = score - 30;
            total =+ 30;
            undo = 30;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT15, R.id.btnT15Two})
    public void calT15(Button btn){
        boolean yes = checkBust();
        total =+ 45;
        dartImage++;
        if(yes == false) {
            score = score - 45;
            total =+ 45;
            undo = 45;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn16, R.id.btn16Two})
    public void cal16(Button btn){
        boolean yes = checkBust();
        total =+ 16;
        dartImage++;
        if(yes == false) {
            score = score - 16;
            total =+ 16;
            undo = 16;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD16, R.id.btnD16Two})
    public void calD16(Button btn){
        boolean yes = checkBust();
        total =+ 32;
        dartImage++;
        if(yes == false) {
            score = score - 32;
            total =+ 32;
            undo = 32;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT16})
    public void calT16(Button btn){
        boolean yes = checkBust();
        total =+ 48;
        dartImage++;
        if(yes == false) {
            score = score - 48;
            total =+ 48;
            undo = 48;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn17, R.id.btn17Two, R.id.btn17Three})
    public void cal17(Button btn){
        boolean yes = checkBust();
        total =+ 17;
        dartImage++;
        if(yes == false) {
            score = score - 17;
            total =+ 17;
            undo = 17;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD17, R.id.btnD17Two})
    public void calD17(Button btn){
        boolean yes = checkBust();
        total =+ 34;
        dartImage++;
        if(yes == false) {
            score = score - 34;
            total =+ 34;
            undo = 34;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT17})
    public void calT17(Button btn){
        boolean yes = checkBust();
        total =+ 51;
        dartImage++;
        if(yes == false) {
            score = score - 51;
            total =+ 51;
            undo = 51;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }





    @OnClick({R.id.btn18, R.id.btn18two, R.id.btn18Three})
    public void call18(Button btn){
        boolean yes = checkBust();
        total += 18;
        dartImage++;
        if(yes == false) {
            score = score - 18;
            total =+18;
            undo = 18;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD18, R.id.btnD18Two})
    public void callD18(Button btn){
        boolean yes = checkBust();
        total += 36;
        dartImage++;
        if(yes == false) {
            score = score - 36;
            total =+36;
            undo = 36;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }


    @OnClick({R.id.btnT18, R.id.btnT18Two})
    public void callT18(Button btn){
        boolean yes = checkBust();
        total += 54;
        dartImage++;
        if(yes == false) {
            score = score - 54;
            total =+ 54;
            undo = 54;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }









    @OnClick({R.id.btn19, R.id.btn19Two})
    public void cal19(Button btn){
        boolean yes = checkBust();
        total =+ 19;
        dartImage++;
        if(yes == false) {
            score = score - 19;
            total =+ 19;
            undo = 19;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnD19, R.id.btnD19Two})
    public void calD19(Button btn){
        boolean yes = checkBust();
        total =+ 38;
        dartImage++;
        if(yes == false) {
            score = score - 38;
            total =+ 38;
            undo = 38;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick({R.id.btnT19})
    public void calT19(Button btn){
        boolean yes = checkBust();
        total =+ 57;
        dartImage++;
        if(yes == false) {
            score = score - 57;
            total =+ 57;
            undo = 57;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }






    @OnClick({R.id.btn20, R.id.btn20two})
    public void cal20(Button btn) {
        boolean yes = checkBust();
        total += 20;
        dartImage++;
        if(yes == false) {
            score = score - 20;
            total =+ 20;
            undo = 20;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();


    }

    @OnClick(R.id.D20)
    public void calD20(Button btn){
        boolean yes = checkBust();
        total =+ 40;
        if(yes == false) {
            score = score - 40;
            total =+ 40;
            undo = 40;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }

    @OnClick(R.id.T20)
    public void calT20(Button btn){
        boolean yes = checkBust();
        total =+ 60;
        if(yes == false) {
            score = score - 60;
            total =+ 60;
            undo = 60;
        }
        scoreLine.setText(score + "");
        fullScore.setText(total + "");
        dartHit();
        dartVis();
        help();
    }










    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        ButterKnife.bind(this);
        scoreLine.setText(score + "");
        scoreLine.setTextColor(Color.WHITE);
        hint.setTextColor(Color.WHITE);
        fullScore.setTextColor(Color.WHITE);
        help();

    }




    public boolean checkBust(){
        boolean yes = false;

        if(score <= 0){
            Toast.makeText(Checkout.this, "Bust", Toast.LENGTH_LONG).show();
            score = score + undo;
            yes = true;
            return yes;

        }
        else
        return yes;
    }

    public void help(){
        if(score == 170){
            hint.setText("T20 T20 Bull");
        }
        else if(score == 167){
            hint.setText("T20 T19 Bull");
        }
        else if(score == 164){
            hint.setText("T20 T18 Bull");
        }
        else if(score == 161){
            hint.setText("T20 T17 Bull");
        }
        else if(score == 158){
            hint.setText("T20 T20 D19");
        }
        else if(score == 157){
            hint.setText("T20 T19 D20");
        }
        else if(score == 156){
            hint.setText("T20 T20 D18");
        }
        else if(score == 155){
            hint.setText("T20 T19 D19");
        }
        else if(score == 154){
            hint.setText("T20 T18 D20");
        }
        else if(score == 153){
            hint.setText("T20 T19 D18");
        }
        else if(score == 152){
            hint.setText("T20 T20 D16");
        }
        else if(score == 151){
            hint.setText("T20 T17 D20");
        }
        else if(score == 150){
            hint.setText("T20 T18 D18");
        }
        else if(score == 149){
            hint.setText("T20 T19 D16");
        }
        else if(score == 148){
            hint.setText("T20 T16 D20");
        }
        else if(score == 147){
            hint.setText("T20 T17 D18");
        }
        else if(score == 146){
            hint.setText("T20 T18 D16");
        }
        else if(score == 145){
            hint.setText("T20 T15 D20");
        }
        else if(score == 144){
            hint.setText("T20 T20 D12");
        }
        else if(score == 143){
            hint.setText("T20 T17 D16");
        }
        else if(score == 142){
            hint.setText("T20 T14 D20");
        }
        else if(score == 141){
            hint.setText("T20 T19 D12");
        }
        else if(score == 140){
            hint.setText("T20 T16 D16");
        }
        else if(score == 139){
            hint.setText("T19 T14 D20");
        }
        else if(score == 138){
            hint.setText("T20 T18 D12");
        }
        else if(score == 137){
            hint.setText("T19 T16 D16");
        }
        else if(score == 136){
            hint.setText("T20 T20 D8");
        }
        else if(score == 135){
            hint.setText("T20 T17 D12");
        }
        else if(score == 134){
            hint.setText("T20 T14 D16");
        }
        else if(score == 133){
            hint.setText("T20 T19 D8");
        }
        else if(score == 132){
            hint.setText("T20 T16 D12");
        }
        else if(score == 131){
            hint.setText("T20 T13 D16");
        }
        else if(score == 130){
            hint.setText("T20 20 BULL");
        }
        else if(score == 129){
            hint.setText("T19 T16 D12");
        }
        else if(score == 128){
            hint.setText("T18 T14 D16");
        }
        else if(score == 127){
            hint.setText("T20 T17 D8");
        }
        else if(score == 126){
            hint.setText("T19 T19 D6");
        }
        else if(score == 125){
            hint.setText("25 T20 D20");
        }
        else if(score == 124){
            hint.setText("T20 T16 D8");
        }
        else if(score == 123){
            hint.setText("T19 T16 D9");
        }
        else if(score == 122){
            hint.setText("T18 T20 D4");
        }
        else if(score == 121){
            hint.setText("T17 T10 D16");
        }
        else if(score == 120){
            hint.setText("T20 20 D20");
        }
        else if(score == 119){
            hint.setText("T19 T10 D16");
        }
        else if(score == 118){
            hint.setText("T20 18 D20");
        }
        else if(score == 117){
            hint.setText("T20 17 D20");
        }
        else if(score == 116){
            hint.setText("T20 16 D20");
        }
        else if(score == 115){
            hint.setText("T20 15 D20");
        }
        else if(score == 114){
            hint.setText("T20 14 D20");
        }
        else if(score == 113){
            hint.setText("T20 13 D20");
        }
        else if(score == 112){
            hint.setText("T20 12 D20");
        }
        else if(score == 111){
            hint.setText("T20 19 D16");
        }
        else if(score == 110){
            hint.setText("T20 18 D16");
        }
        else if(score == 109){
            hint.setText("T19 20 D16");
        }
        else if(score == 108){
            hint.setText("T20 16 D16");
        }
        else if(score == 107){
            hint.setText("T19 18 D16");
        }
        else if(score == 106){
            hint.setText("T20 14 D16");
        }
        else if(score == 105){
            hint.setText("T19 16 D16");
        }
        else if(score == 104){
            hint.setText("T18 18 D16");
        }
        else if(score == 103){
            hint.setText("T20 3 D20");
        }
        else if(score == 102){
            hint.setText("T20 10 D16");
        }
        else if(score == 101){
            hint.setText("T20 1 D20");
        }
        else if(score == 100){
            hint.setText("T20 D10");
        }
        else if(score == 99){
            hint.setText("T19 10 D16");
        }
        else if(score == 98){
            hint.setText("T20 D19");
        }
        else if(score == 97){
            hint.setText("T19 D20");
        }
        else if(score == 96){
            hint.setText("T20 D18");
        }
        else if(score == 95){
            hint.setText("T19 D19");
        }
        else if(score == 94){
            hint.setText("T18 D20");
        }
        else if(score == 93){
            hint.setText("T19 D18");
        }
        else if(score == 92){
            hint.setText("T20 D16");
        }
        else if(score == 91){
            hint.setText("T17 D20");
        }
        else if(score == 90){
            hint.setText("T20 D15");
        }
        else if(score == 89){
            hint.setText("T19 D16");
        }
        else if(score == 88){
            hint.setText("T16 D20");
        }
        else if(score == 87){
            hint.setText("T17 D18");
        }
        else if(score == 86){
            hint.setText("T18 D16");
        }
        else if(score == 85){
            hint.setText("T15 D20");
        }
        else if(score == 84){
            hint.setText("T20 D12");
        }
        else if(score == 83){
            hint.setText("T17 D16");
        }
        else if(score == 82){
            hint.setText("T14 D20");
        }
        else if(score == 81){
            hint.setText("T19 D12");
        }
        else if(score == 80){
            hint.setText("T20 D10");
        }
        else if(score == 79){
            hint.setText("T13 D20");
        }
        else if(score == 78){
            hint.setText("T18 D12");
        }
        else if(score == 77){
            hint.setText("T19 D10");
        }
        else if(score == 76){
            hint.setText("T20 D8");
        }
        else if(score == 75){
            hint.setText("T17 D12");
        }
        else if(score == 74){
            hint.setText("T14 D16");
        }
        else if(score == 73){
            hint.setText("T19 D8");
        }
        else if(score == 72){
            hint.setText("T16 D12");
        }
        else if(score == 71){
            hint.setText("T13 D16");
        }
        else if(score == 70){
            hint.setText("T10 D20");
        }
        else if(score == 69){
            hint.setText("");
        }
        else if(score == 68){
            hint.setText("T20 D4");
        }
        else if(score == 67){
            hint.setText("T17 D8");
        }
        else if(score == 66){
            hint.setText("T10 D18");
        }
        else if(score == 65){
            hint.setText("T19 D4");
        }
        else if(score == 64){
            hint.setText("T16 D8");
        }
        else if(score == 63){
            hint.setText("T13 D12");
        }
        else if(score == 62){
            hint.setText("T10 D16");
        }
        else if(score == 61){
            hint.setText("T15 D8");
        }
        else if(score == 60){
            hint.setText("20 D20 ");
        }
        else
        {
            hint.setText("T20 T20 T20");
        }
    }

    public void dartVis(){


        if(dartImage == 0) {
            dart1.setVisibility(View.VISIBLE);
            dart2.setVisibility(View.VISIBLE);
            dart3.setVisibility(View.VISIBLE);
        }
        else if(dartImage == 1) {
            dart1.setVisibility(View.INVISIBLE);
        }
        else if(dartImage == 2) {
            dart2.setVisibility(View.INVISIBLE);
        }
        else if(dartImage == 3) {
            dart3.setVisibility(View.INVISIBLE);
            dartImage=0;
            dartVis();
        }
    }

    public void dartHit(){
        MediaPlayer mp = MediaPlayer.create(Checkout.this, R.raw.dartsound);
        mp.start();
    }



}
