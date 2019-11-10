package com.myprograms.designpatterns.gangoffour.behavioural.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class ChainOfResponsibilityApp {
    public static void main(String[] args) {
        RequestData requestData = new RequestData();
        List<RequestHandler> requestHandlers = new ArrayList<>();
        requestHandlers.add(new DBDataHandler());
        requestHandlers.add(new FileDataHandler());
        requestHandlers.add(new CloudDataHandler());

        // create the chain of Handler
        for (int i = 0; i < requestHandlers.size() - 1; i++) {
            requestHandlers.get(i).setNextRequestHandler(requestHandlers.get(i + 1));
        }

        requestHandlers.get(0).process(requestData);
        System.out.println(requestData);
    }
}
