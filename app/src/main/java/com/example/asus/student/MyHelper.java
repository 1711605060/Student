package com.example.asus.student;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class MyHelper extends SQLiteOpenHelper {

 public  MyHelper(@Nullable  Context context,@Nullable String name,SQLiteDatabase.CursorFactory factory, int version){
     super(context,name,factory,version);

 }

    public void onCreate(SQLiteDatabase db) {


    }
     public void onUpgrade(){}

}
