package com.myprograms.designpatterns.gangoffour.structural.bridge;

public class Bus extends Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Manufactoring Bus");
        workshops.stream().forEach(workshop -> workshop.work(this));
        System.out.println("Done.");
        System.out.println();
    }
    @Override
    public int minWorkTime() {
        return 20;
    }
}
