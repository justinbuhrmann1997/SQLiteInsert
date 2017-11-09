package com.example.sqliteinsert;
import android.provider.BaseColumns;
/**
 * Created by Justin on 18-10-2017.
 */


final class UserContract implements BaseColumns {
final static String DATABASE_NAME = "employee";
final static int DATABASE_VERSION = 5;


    final static class UserEntity{
        final static String TABLE_NAME = "UserInfo";
        final static String UID = BaseColumns._ID;
        final static String USER_NAME = "UserName";
        final static String USER_PWD = "Password";
    }
}
