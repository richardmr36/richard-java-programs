package com.myprograms.solidprinciples.isp.gooddesign;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying!");
    }

}
