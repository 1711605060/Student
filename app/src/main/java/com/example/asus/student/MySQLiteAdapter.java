package com.example.asus.student;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class MySQLiteAdapter {
    SQLiteDatabase db=null;
    Context context=null;

    public  MySQLiteAdapter(Context context){this.context=context; }

    public  void openDB(){
MyHelper myHelper=new MyHelper();
db=myHelper.getWritableDatabase();
    }
}
