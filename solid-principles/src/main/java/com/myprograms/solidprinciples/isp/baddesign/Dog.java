package com.myprograms.solidprinciples.isp.baddesign;

public class Dog implements AnimalAction {
    @Override
    public void fly() {
        /*Do nothing because dog cannot fly. This method violates ISP*/
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking!");
    }
}
