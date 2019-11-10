package com.myprograms.designpatterns.gangoffour.structural.facade;

public class InventoryService {
    public static boolean isAvailable(Product product) {
        /*Check Warehouse database for product availability*/
        return true;
    }
}
