package com.myprograms.designpatterns.gangoffour.structural.flyweight;

public abstract class RaceCar {
    /*Intrinsic state  stored and shared in the Flyweight object*/
    String name;
    int speed;
    int horsePower;

    /* Extrinsic state is stored or computed by client objects, and passed to the Flyweight.*/
    abstract void moveCar(int currentX, int currentY, int newX, int newY);
}
