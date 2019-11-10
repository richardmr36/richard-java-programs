package com.myprograms.designpatterns.gangoffour.creational.prototype;


public class FormalShoes extends Shoes {
    private static final long serialVersionUID = -5670125744755511170L;

    public String toString() {
        return "FormalShoes";
    }

    @Override
    public void wear() {
        //some FormalShoes specific code to wear
        System.out.println("I am wearing " + toString());
    }
}
