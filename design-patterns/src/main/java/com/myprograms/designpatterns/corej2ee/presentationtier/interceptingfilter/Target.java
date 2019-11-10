package com.myprograms.designpatterns.corej2ee.presentationtier.interceptingfilter;

public class Target {
    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }
}
