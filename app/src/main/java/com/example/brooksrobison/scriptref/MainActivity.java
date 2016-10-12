package com.example.brooksrobison.scriptref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void shareScript(View view) {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        EditText e = (EditText)findViewById(R.id.bookET);



        intent.putExtra("book", e.getText());
        startActivity(intent);

    }


}
