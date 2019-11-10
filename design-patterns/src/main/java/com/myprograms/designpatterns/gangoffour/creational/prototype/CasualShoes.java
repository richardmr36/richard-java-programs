package com.myprograms.designpatterns.gangoffour.creational.prototype;

public class CasualShoes extends Shoes {
    private static final long serialVersionUID = -6493171299609719559L;

    public String toString() {
        return "CasualShoes";
    }

    @Override
    public void wear() {
        //some CasualShoes specific code to wear
        System.out.println("I am wearing " + toString());
    }
}
