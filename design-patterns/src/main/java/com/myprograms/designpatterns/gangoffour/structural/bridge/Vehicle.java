package com.myprograms.designpatterns.gangoffour.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    // assembly line for the workshops
    protected List<Workshop> workshops = new ArrayList<>();

    public Vehicle() {
        super();
    }

    public boolean joinWorkshop(Workshop workshop) {
        return workshops.add(workshop);
    }

    public abstract void manufacture();

    public abstract int minWorkTime();
}
