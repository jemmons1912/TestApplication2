package com.jetech.testapplication2.com.jt;

public class Tractor extends Automobile {
    public Tractor(){
      setNumberOfWheels(4);
      setNumberOfDoors(1);
    }
    public Tractor(int numWheels,int numDoors){
      setNumberOfWheels(numWheels);
      setNumberOfDoors(numDoors);

}
}