package com.myprograms.designpatterns.gangoffour.structural.bridge;

import java.util.concurrent.TimeUnit;

public class TestWorkshop extends Workshop {

    public TestWorkshop() {
        super();
    }
    @Override
    public void work(Vehicle vehicle) {
        System.out.print("Testing... ");
        long timeToTake = 50 * vehicle.minWorkTime();
        try {
            TimeUnit.MILLISECONDS.sleep(timeToTake); // Thread.sleep(timeToTake);
        } catch (InterruptedException exp) {
            // nothing to do for now.
        }
        System.out.printf("(Time taken: %d millis), Done.\n", timeToTake);
    }

}
