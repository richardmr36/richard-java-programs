package com.myprograms.solidprinciples.isp.gooddesign;

public class Dog implements Barkable {
    @Override
    public void bark() {
        System.out.println("Dog is barking!");
    }
}
