package com.myprograms.designpatterns.gangoffour.behavioural.visitor;

public class ShoppingCartVisitor implements Visitor {
    private double totalPrice;

    public void visit(Book book) {
        totalPrice += book.getPrice();
    }

    public void visit(DVD dvd) {
        totalPrice += dvd.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}