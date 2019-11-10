package com.myprograms.designpatterns.corej2ee.presentationtier.frontcontroller;

public class FrontControllerApp {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
        frontController.dispatchRequest("DASHBOARD");
        frontController.dispatchRequest("ERROR");
    }
}
