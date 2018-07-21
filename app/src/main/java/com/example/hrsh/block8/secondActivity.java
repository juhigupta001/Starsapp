package com.example.hrsh.block8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller=getIntent();
        float rating=caller.getFloatExtra("nbstar",0);
        TextView textView=(TextView) findViewById(R.id.textView);
        textView.setText("      welcome to second activity !!your rating is  " +rating);
    }
}

