package com.myprograms.designpatterns.gangoffour.behavioural.chainofresponsibility;

public class CloudDataHandler implements RequestHandler {
    private RequestHandler requestHandler;

    @Override
    public void setNextRequestHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public boolean process(RequestData requestData) {
        requestData.setMetaCloudData("Meta Data from Cloud is populated");
        return requestHandler == null || requestHandler.process(requestData);
    }
}
