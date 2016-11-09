package com.example.rob.dcomproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


public class DatabaseH extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 30;
    public static final String DATABASE_NAME = "DartsTables.db";
    public static final String TABLE_NAME = "LeagueTables";
    public static final String SCORES_TABLE = "SCORES";
    public static final String COL_1 = "POSITION";
    public static final String COL_2 = "TEAM";
    public static final String COL_3 = "PLAYED";
    public static final String COL_4 = "POINTS";
    public static final String COL_5 = "CAPTAIN";
    public static final String COL_6 = "VICE_CAPTAIN";
    public static final String COL_7 = "HOME";
    public static final String COL_8 = "HOMETEAM";
    public static final String COL_9 = "AWAYTEAM";
    public static final String COL_10 = "MATCH1";
    public static final String COL_11 = "MATCH2";
    public static final String COL_12 = "MATCH3";
    public static final String COL_13 = "MATCH4";
    public static final String COL_14 = "MATCH5";
    public static final String COL_15 = "MATCHSCORE";

    public DatabaseH(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE " + TABLE_NAME + " (" + COL_1 + " INTEGER , TEAM TEXT PRIMARY KEY, PLAYED INTEGER DEFAULT 0, POINTS INTEGER DEFAULT 0, CAPTAIN TEXT, " +
                "VICE_CAPTAIN TEXT, HOME TEXT);");

        db.execSQL("CREATE TABLE " + SCORES_TABLE + " (HOMETEAM TEXT UNIQUE, AWAYTEAM TEXT UNIQUE, MATCH1 TEXT, MATCH2 TEXT, " +
                "MATCH3 TEXT, MATCH4 TEXT, MATCH5 TEXT, MATCHSCORE TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + SCORES_TABLE);
        onCreate(db);
    }

    public boolean insertData(String team, String captain, String v_cap, String home){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, team);
        contentValues.put(COL_5, captain);
        contentValues.put(COL_6, v_cap);
        contentValues.put(COL_7, home);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }



    public boolean insertScores(String home_team, String away_team, String match1,
                                String match2, String match3, String match4,
                                String match5, String matchscore){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_8, home_team);
        contentValues.put(COL_9, away_team);
        contentValues.put(COL_10, match1);
        contentValues.put(COL_11, match2);
        contentValues.put(COL_12, match3);
        contentValues.put(COL_13, match4);
        contentValues.put(COL_14, match5);
        contentValues.put(COL_15, matchscore);

        long result = db.insert(SCORES_TABLE, null, contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME + " ORDER BY " + COL_4 + " DESC", null);
        return res;
    }

    public Cursor getAllData2(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);
        return res;
    }

    public Cursor getAllData3(String team){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + TABLE_NAME + " WHERE TEAM = ?" , new String[] { team });
        return res;
    }

    public Cursor getScoresData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM " + SCORES_TABLE, null);
        return res;
    }

    public boolean updateDate(String team, int played, int points ){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, team);
        contentValues.put(COL_3, played);
        contentValues.put(COL_4, points);
        db.update(TABLE_NAME, contentValues, "TEAM = ?", new String[] { team });
        return true;
    }

    public void clearScores(){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + SCORES_TABLE);
    }

    public void deleteTeam(String team){
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_NAME + " WHERE TEAM = ?", new String[]{team});
    }
}
