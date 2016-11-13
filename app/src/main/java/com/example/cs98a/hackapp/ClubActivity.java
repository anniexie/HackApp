package com.example.cs98a.hackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class ClubActivity extends AppCompatActivity {

    public static String club;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
        Intent intent = getIntent(); //if it's a string you stored.

        TextView textview = (TextView)findViewById(R.id.textView3);
        textview.setText(club);

        TextView textview2 = (TextView)findViewById(R.id.textView5);
        textview2.setText(foldr(Location.getVisitors(club)));

    }

    private static String foldr(ArrayList<String> array) {
        if (array.isEmpty())
            return "Quiet night, eh?";
        String ret = "";
        for (int i = 0; i < array.size() - 1; i++)
            ret += array.get(i) + '\n';
        ret += array.get(array.size() - 1);
        return ret;
    }
}
