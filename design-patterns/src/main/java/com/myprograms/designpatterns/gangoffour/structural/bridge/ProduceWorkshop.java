package com.myprograms.designpatterns.gangoffour.structural.bridge;

import java.util.concurrent.TimeUnit;

public class ProduceWorkshop extends Workshop {

    public ProduceWorkshop() {
        super();
    }

    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Producing... ");
        long timeToTake = 300 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }
}
