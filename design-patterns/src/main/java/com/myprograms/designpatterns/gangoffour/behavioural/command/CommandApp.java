package com.myprograms.designpatterns.gangoffour.behavioural.command;

public class CommandApp {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        if(light.isSwitchedOn())
            System.out.println("Light is switched on");
        else
            System.out.println("Light cannot be switched on");

        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
        if(!light.isSwitchedOn())
            System.out.println("Light is switched off");
        else
            System.out.println("Light cannot be switched off");

    }
}
