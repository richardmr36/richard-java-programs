package com.myprograms.designpatterns.gangoffour.creational.prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Shoes xyz = ShoeFactory.makeObject("Sport");
        xyz.wear();
    }
}
