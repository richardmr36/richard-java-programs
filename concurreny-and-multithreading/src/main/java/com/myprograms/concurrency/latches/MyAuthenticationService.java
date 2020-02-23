package com.myprograms.concurrency.latches;

public class MyAuthenticationService implements MyService {
    @Override
    public void init() {
        System.out.println("Authentication Service initiated..");
    }
}
