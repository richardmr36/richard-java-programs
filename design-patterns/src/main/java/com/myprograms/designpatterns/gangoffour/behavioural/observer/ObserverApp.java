package com.myprograms.designpatterns.gangoffour.behavioural.observer;

public class ObserverApp {
    public static void main(String[] args) {
        SensorReceiver sensorReceiver = new SensorReceiver();
        SensorLogger sensorLogger = new SensorLogger();
        sensorReceiver.register(sensorLogger);
        sensorReceiver.addData(new SensorData("temperature", 1.2d));
        sensorReceiver.updateObservers();
    }
}
