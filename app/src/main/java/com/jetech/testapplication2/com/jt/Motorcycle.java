package com.jetech.testapplication2.com.jt;

public class Motorcycle extends Automobile {
    public Motorcycle() {
        setNumberOfWheels(2);
        setNumberOfDoors(0);

    }

    public Motorcycle(int numWheels, int numDoors) {
        setNumberOfWheels(numWheels);
        setNumberOfDoors(getNumberOfDoors());


    }
}