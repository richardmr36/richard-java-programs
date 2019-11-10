package com.myprograms.designpatterns.gangoffour.creational.factorymethod;

public class YellowRose implements Rose {
    @Override
    public void addColor() {
        System.out.println("Hello – I am the Yellow Rose !");
    }
}
