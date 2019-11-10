package com.myprograms.designpatterns.miscellaneous.dependencyinjection;

public class Product {
    public int productId;
    public String name;

    public Product() {
    }

    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
}