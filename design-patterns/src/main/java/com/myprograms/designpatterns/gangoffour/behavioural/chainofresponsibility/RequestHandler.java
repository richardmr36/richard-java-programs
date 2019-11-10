package com.myprograms.designpatterns.gangoffour.behavioural.chainofresponsibility;

public interface RequestHandler {
    void setNextRequestHandler(RequestHandler requestHandler);
    boolean process(RequestData requestData);
}
