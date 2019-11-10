package com.myprograms.designpatterns.miscellaneous.dependencyinjection;

public class CardPaymentService implements PaymentService {

    @Override
    public void pay(Product product) {
        System.out.println("Payed " + product.name + " with credit card");
    }
}
