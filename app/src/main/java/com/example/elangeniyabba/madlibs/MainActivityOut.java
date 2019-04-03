package com.example.elangeniyabba.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityOut extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_out2);

        TextView storyText = (TextView)findViewById(R.id.storyText);
        Button button = (Button)findViewById(R.id.button2);
        String madLib = getIntent().getStringExtra("story");

        storyText.setText(madLib);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToMenu(v);
            }
        });
    }

    public void returnToMenu(View view) {
        Intent myIntent = new Intent(MainActivityOut.this,
                MainActivityIn.class);
        startActivity(myIntent);
    }
}
