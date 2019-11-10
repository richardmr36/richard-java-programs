package com.myprograms.designpatterns.gangoffour.behavioural.command;

public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
    }

    public void switchOff() {
        on = false;
    }

    public boolean isSwitchedOn() {
        return on;
    }
}
