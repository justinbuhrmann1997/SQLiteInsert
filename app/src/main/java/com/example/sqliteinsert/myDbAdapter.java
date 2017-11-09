package com.example.sqliteinsert;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;;
import android.database.sqlite.SQLiteOpenHelper;

public class myDbAdapter  {

    myDbHelper helper;

    public myDbAdapter(Context context)
    {
        helper = new myDbHelper(context);
    }


    //Inserts a user into the db, and returns the id of the inserted user
    public long insertData(String name, String password)
    {
        SQLiteDatabase db = helper.getWritableDatabase(); //Gets database
        ContentValues contentValues = new ContentValues();
        contentValues.put(UserContract.UserEntity.USER_NAME, name);
        contentValues.put(UserContract.UserEntity.USER_PWD, password);
        long id = db.insert(UserContract.UserEntity.TABLE_NAME, null , contentValues); // inserting the values
        return id;
    }


}
