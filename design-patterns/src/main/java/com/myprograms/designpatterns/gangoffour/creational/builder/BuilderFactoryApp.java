package com.myprograms.designpatterns.gangoffour.creational.builder;

public class BuilderFactoryApp {
    public static void main(String[] args) {
        Email email = new Email.EmailBuilder()
                .addRecipient("john@Doe.com")
                .setMainText("Check the builder pattern")
                .setGreeting("Hi John!")
                .setClosing("Regards")
                .setTitle("Builder pattern resources")
                .build();

        System.out.println(email);
    }
}
