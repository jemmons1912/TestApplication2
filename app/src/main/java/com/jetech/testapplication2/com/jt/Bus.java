package com.jetech.testapplication2.com.jt;

public class Bus extends Automobile {
    public Bus() {
        setNumberOfWheels(6);
        setNumberOfDoors(2);


    }



    public Bus(int numWheels, int numDoors) {
        setNumberOfWheels(numWheels);
        setNumberOfDoors(numDoors);
    }
}


