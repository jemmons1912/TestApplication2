package com.jetech.testapplication2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int Morning = ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This is my comment:this is explicit typecasting.findViewById returns the view and the EditText explicitly typecasts the EditText
        final EditText theEditText = findViewById(R.id.editText);
        //This is my comment:findViewById returns the view and the TextView typecasts the TextView
        final TextView theTextView = findViewById(R.id.textView);
        //This is my comment:you have a button being assigned to the variable theButton which is now hooked to the xml button
        final Button theButton = findViewById(R.id.button);
        final ImageView myImage = findViewById(R.id.imageView);
        EditText secondEditText = findViewById(R.id.editText);
        secondEditText.setText(Good Morning);

        //This is my comment:this gives button functionality
        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "I entered " + theEditText.getText().toString();

                theTextView.setText(message);
                myImage.setImageResource(R.drawable.img_1android);


            }
        });



    }

    private String myFirstMethod() {
        return "helloworld";
    }
}

