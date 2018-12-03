package com.jetech.testapplication2.com.jt;

public class Truck extends Automobile  {
    public Truck(){
        setNumberOfWheels(4);
        setNumberOfDoors(2);
    }
    public Truck(int numWheels, int numDoors){
        setNumberOfWheels(numWheels);
        setNumberOfDoors(getNumberOfDoors());
    }


    }

