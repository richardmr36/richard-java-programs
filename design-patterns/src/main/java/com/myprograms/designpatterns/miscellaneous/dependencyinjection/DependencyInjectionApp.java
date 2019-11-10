package com.myprograms.designpatterns.miscellaneous.dependencyinjection;

public class DependencyInjectionApp {
    public static void main(String[] args) {
        PaymentService paymentService = PaymentServiceFactory.getPaymentService("CARD");
        Cart cart = new Cart(paymentService);
        cart.addProductToCart(new Product(101, "Milk"));
        cart.buy();
    }
}
