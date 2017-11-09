package com.example.sqliteinsert;

import android.content.Context;
import android.widget.Toast;


//Creates a toast in the current context to show a given message
public class Message {
    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
