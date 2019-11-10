package com.myprograms.designpatterns.gangoffour.behavioural.mediator;

public interface Mediator {
    public void send(String message, Colleague colleague);
}