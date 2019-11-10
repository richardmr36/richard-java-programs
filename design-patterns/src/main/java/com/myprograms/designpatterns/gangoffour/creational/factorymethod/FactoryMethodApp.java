package com.myprograms.designpatterns.gangoffour.creational.factorymethod;

public class FactoryMethodApp {
    public static void main(String[] args) {
        RoseFactory roseFactory = new RoseFactory ();

        //get an object of Red Rose and call its addColor method.
        Rose redRose = roseFactory.getRose("RED");

        //call addColor method of RedRose
        redRose.addColor();

        //get an object of Yellow Rose and call its getColor method.
        Rose yellowRose = roseFactory.getRose("YELLOW");

        //call addColor method of YellowRose
        yellowRose.addColor();

        //get an object of Pink Rose and call its getColor method.
        Rose pinkRose = roseFactory.getRose("PINK");

        //call addColor method of PinkRose
        pinkRose.addColor();
    }
}
