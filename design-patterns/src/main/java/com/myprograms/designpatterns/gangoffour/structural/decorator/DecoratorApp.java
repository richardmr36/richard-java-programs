package com.myprograms.designpatterns.gangoffour.structural.decorator;

public class DecoratorApp {
    public static void main(String[] args) {
        System.out.println("Test 1\n");
        Phone phone = new AndroidPhone(new BasicPhone());
        phone.printModel();
        System.out.println("\nTest 2\n");
        Phone phone1 = new IPhone(phone);
        phone1.printModel();
    }
}
