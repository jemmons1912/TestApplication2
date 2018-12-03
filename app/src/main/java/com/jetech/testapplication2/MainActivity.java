package com.jetech.testapplication2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.jetech.testapplication2.com.jt.Automobile;
import com.jetech.testapplication2.com.jt.Bus;
import com.jetech.testapplication2.com.jt.Car;
import com.jetech.testapplication2.com.jt.Motorcycle;
import com.jetech.testapplication2.com.jt.Tractor;
import com.jetech.testapplication2.com.jt.Truck;

public class MainActivity extends AppCompatActivity {

    private static final int Morning = 1;

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
//        final ImageView myImage = findViewById(R.id.imageView);
        EditText secondEditText = findViewById(R.id.editText);
        secondEditText.setText("Good Morning");

        //This is my comment:this gives button functionality
        theButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "I entered " + theEditText.getText().toString();

                theTextView.setText(message);
//                myImage.setImageResource(R.drawable.img_1android);


            }
        });
        Automobile myVehicle = new Car();
        Log.e("Test", "my vehicle has " + myVehicle.getNumberOfWheels() + " wheels");
        Log.d("Test", "my vehicle has " + myVehicle.getNumberOfDoors() + " doors");
        myVehicle = new Truck();
        Log.e("Test", "my vehicle has " + myVehicle.getNumberOfWheels() + " wheels");
        Log.d("Test", "my vehicle has " + myVehicle.getNumberOfDoors() + " doors");
        myVehicle = new Motorcycle();
        Log.e("Test", "my vehicle has " + myVehicle.getNumberOfWheels() + " wheels");
        Log.d("Test", "my vehicle has " + myVehicle.getNumberOfDoors() + " doors");
        myVehicle = new Tractor();
        Log.e("Test", "my vehicle has " + myVehicle.getNumberOfWheels() + " wheels");
        Log.d("Test", "my vehicle has"  + myVehicle.getNumberOfDoors() + "doors");
        myVehicle = new Bus();
        Log.e("Test", "my vehicle has " + myVehicle.getNumberOfWheels() + " wheels");
        Log.d("Test", "my vehicle has" +  myVehicle.getNumberOfDoors() + "doors");


    }

    private String myFirstMethod() {
        return "helloworld";
    }
}

