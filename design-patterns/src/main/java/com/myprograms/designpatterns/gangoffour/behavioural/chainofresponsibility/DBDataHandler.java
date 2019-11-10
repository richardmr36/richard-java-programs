package com.myprograms.designpatterns.gangoffour.behavioural.chainofresponsibility;

public class DBDataHandler implements RequestHandler {
    private RequestHandler requestHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public boolean process(RequestData requestData) {
        requestData.setMetaDBData("Meta Data from DB is populated");
        return requestHandler == null || requestHandler.process(requestData);
    }
}
