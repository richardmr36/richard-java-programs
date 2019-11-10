package com.myprograms.designpatterns.gangoffour.behavioural.visitor;

public interface Visitor{
    public void visit(Book book);
    public void visit(DVD dvd);
}