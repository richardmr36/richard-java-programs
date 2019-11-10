package com.myprograms.designpatterns.corej2ee.presentationtier.interceptingfilter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}