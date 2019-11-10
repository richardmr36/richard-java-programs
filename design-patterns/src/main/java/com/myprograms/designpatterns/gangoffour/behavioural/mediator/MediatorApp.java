package com.myprograms.designpatterns.gangoffour.behavioural.mediator;

public class MediatorApp {
    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        ConcreteColleague desktop = new ConcreteColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("Hello World");
        mobile.send("Hello");
    }
}
