package com.example.brooksrobison.scriptref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {


            String newString;

            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                newString = null;
            } else {
                newString = extras.getString("book");
            }

            TextView t = (TextView)findViewById(R.id.scriptTV);


            t.setText(newString);
        } catch(NullPointerException ex) {
            
        }
    }

    private final Runnable mUpdateUITimerTask = new Runnable() {     public void run() {         // do whatever you want to change here, like:         t.setText("Second text to display!");     } }; private final Handler mHandler = new Handler();
}
