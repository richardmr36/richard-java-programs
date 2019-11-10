package com.myprograms.solidprinciples.isp.baddesign;

public class Bird implements AnimalAction {

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

    @Override
    public void bark() {
        /*Do nothing because bird cannot bark. This method violates ISP*/
    }
}
