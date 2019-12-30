package com.example.myapplication2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;


public class DatabaseHelper extends SQLiteOpenHelper {
    public DatabaseHelper( Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("Create table user(name text primary key, password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(" drop table if EXISTS user");
    }

    public boolean insert(String username,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues content =  new ContentValues();
        content.put("name",username);
        content.put("password",password);
        long ins = db.insert("user",null,content);
        if (ins == -1){
            return false;
        }
        else {
            return true;
        }
    }

    //check if username exists
    public  boolean checkUsername(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from user where name=?",new String[]{name});
        if (cursor.getCount()>0)return false;
        else return true;
    }
    public boolean checkLogin(String name, String password){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where name=? and password=?",new String[]{name,password});
        if(cursor.getCount() > 0) return true;
        else return false;
    }
}
