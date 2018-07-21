package com.example.hrsh.block8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent gotosecond=new Intent(firstActivity.this,secondActivity.class);
                RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
                float rating = ratingBar.getRating();
                gotosecond.putExtra("nbstar",rating);
                startActivity(gotosecond);

                Toast.makeText(getApplicationContext(), rating + "stars", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
