package com.myprograms.designpatterns.gangoffour.behavioural.templatemethod;

public class TemplateMethodApp {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.log("Message to Log in File.");
        System.out.println();

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.setConsoleLoggingEnabled(true);
        emailLogger.log("Message to Log via Email.");
        System.out.println();

        DatabaseLogger databaseLogger = new DatabaseLogger();
        databaseLogger.log("Message to Log in DB.");
    }
}
