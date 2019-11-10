package com.myprograms.designpatterns.gangoffour.behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorApp {
    public static void main(String[] args) {
        List<Visitable> itemList = new ArrayList<>();
        itemList.add(new Book(110, 1.4));
        itemList.add(new Book(199, 1.9));
        itemList.add(new DVD(40, 0.1));

        ShoppingCartVisitor visitor = new ShoppingCartVisitor();

        for (Visitable item : itemList)
            item.accept(visitor);

        System.out.println("Total Price: " + visitor.getTotalPrice());
    }
}
