package com.myprograms.designpatterns.miscellaneous.dependencyinjection;

public class CashPaymentService implements PaymentService {
    @Override
    public void pay(Product product) {
        System.out.println("Payed with cash");
    }
}
