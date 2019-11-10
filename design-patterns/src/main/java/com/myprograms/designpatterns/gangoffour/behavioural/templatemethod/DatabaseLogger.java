package com.myprograms.designpatterns.gangoffour.behavioural.templatemethod;

public class DatabaseLogger extends AbstractLogger {
    @Override
    protected void openDataStoreOperation() {
        System.out.println("Connecting to Database.");
    }

    @Override
    protected void logMessage(String messageToLog) {
        System.out.println("Inserting Log Message to DB table : " + messageToLog);
    }

    @Override
    protected void closeDataStoreOperation() {
        System.out.println("Closing DB connection.");
    }
}
