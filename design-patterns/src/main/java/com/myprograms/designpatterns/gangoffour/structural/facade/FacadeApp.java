package com.myprograms.designpatterns.gangoffour.structural.facade;

public class FacadeApp {
    public static void main(String[] args) {
        OrderServiceFacade facade = new OrderServiceFacadeImpl();
        if(facade.placeOrder(9))
            System.out.println("Order placed successfully!");
    }
}
