package com.myprograms.designpatterns.gangoffour.structural.composite.component;

public interface Worker {
    void assignWork(Employee manager, Work work);
    void performWork();
}
