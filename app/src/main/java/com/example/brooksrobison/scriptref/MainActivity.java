package com.example.brooksrobison.scriptref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "scripture";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareScript(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        EditText b = (EditText)findViewById(R.id.bookET);
        EditText c = (EditText)findViewById(R.id.chaptET);
        EditText v = (EditText)findViewById(R.id.verseET);

        String message = b.getText().toString() + " " + c.getText().toString()
                + ":" + v.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


}
