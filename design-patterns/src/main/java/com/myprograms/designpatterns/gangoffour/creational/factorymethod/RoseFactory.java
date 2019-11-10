package com.myprograms.designpatterns.gangoffour.creational.factorymethod;

public class RoseFactory {

    //use addColor method to get object of type Rose
    public Rose getRose(String roseColor){
        if(roseColor == null){
            return null;
        }
        if(roseColor.equalsIgnoreCase("RED")){
            return new RedRose();

        } else if(roseColor.equalsIgnoreCase("YELLOW")){
            return new YellowRose();

        } else if(roseColor.equalsIgnoreCase("PINK")){
            return new PinkRose();
        }
        return null;

    }
}
