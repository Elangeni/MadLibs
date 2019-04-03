package com.example.elangeniyabba.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivityIn extends AppCompatActivity {

    // Create variables
    EditText etnoun1, etpluralNoun, etnoun2, etplace, etadjective, etnoun3;
    Button button;

    String firstNoun, nounPlural, secondNoun, inputPlace, inputAdjective, thirdNoun,madLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_in);

        //Collect user inputs and store them in strings
        etnoun1 = (EditText)findViewById(R.id.noun1);
        etpluralNoun =  (EditText)findViewById(R.id.pluralNoun);
        etnoun2 = (EditText)findViewById(R.id.noun2);
        etplace = (EditText)findViewById(R.id.place);
        etadjective = (EditText)findViewById(R.id.adjective);
        etnoun3 = (EditText)findViewById(R.id.noun3);

        button = (Button)findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNoun = etnoun1.getText().toString();
                nounPlural = etpluralNoun.getText().toString();
                secondNoun = etnoun2.getText().toString();
                inputPlace = etplace.getText().toString();
                inputAdjective = etadjective.getText().toString();
                thirdNoun = etnoun3.getText().toString();

                madLib ="Be kind to your " + firstNoun + "-footed " + nounPlural + "\n" +
                        "For a duck may be somebody`s " + secondNoun + ",\n" +
                        "Be kind to your " + nounPlural + " in " + inputPlace + "\n" +
                        "Where the weather is always " + inputAdjective + ".\n" +
                        "\n" +
                        "You may think that this is the " + thirdNoun + ",\n" +
                        "Well it is.\t";

                createStory(v);
            }
        });


    }



    public void createStory(View view) {
        Intent myIntent = new Intent(MainActivityIn.this,
                MainActivityOut.class);
        myIntent.putExtra("story",madLib);
        startActivity(myIntent);
    }
}
