package com.example.brooksrobison.scriptref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        message = "Your favorite scripture is: " + message;

        TextView tv = new TextView(this);
        tv.setText(message);
        setContentView(tv);
    }

}
