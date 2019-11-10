package com.myprograms.designpatterns.gangoffour.behavioural.observer;

public interface Observable {

    void register(Observer observer);

    void unregister(Observer observer);

    void updateObservers();

}
