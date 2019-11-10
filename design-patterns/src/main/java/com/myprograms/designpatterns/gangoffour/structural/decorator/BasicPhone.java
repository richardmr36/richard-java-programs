package com.myprograms.designpatterns.gangoffour.structural.decorator;

public class BasicPhone implements Phone {
    @Override
    public void printModel() {
        System.out.println("Basic Phone");
    }
}
