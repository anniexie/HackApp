package com.example.cs98a.hackapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                boolean handled = false;
                if (actionId == EditorInfo.IME_ACTION_SEND) {
                    String inputText = v.getText().toString();
                    handled = true;
                    User.me = new User(inputText, "Elsewhere");
                    Intent myIntent = new Intent(NameActivity.this, MainActivity.class);
                    myIntent.putExtra("clubName", "Cannon"); //Optional parameters
                    startActivity(myIntent);
                }
                return handled;
            }
        });
    }
}
