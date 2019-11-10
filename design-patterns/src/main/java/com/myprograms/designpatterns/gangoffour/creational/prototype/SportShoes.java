package com.myprograms.designpatterns.gangoffour.creational.prototype;

public class SportShoes extends Shoes {
    private static final long serialVersionUID = 440347043243434494L;

    public String toString() {
        return "SportShoes";
    }

    @Override
    public void wear() {
        //some SportShoes specific code to wear
        System.out.println("I am wearing " + toString());
    }
}
