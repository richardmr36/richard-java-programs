package com.myprograms.designpatterns.gangoffour.structural.proxy;

import java.net.URL;

public class RealImage implements Image {
    public RealImage(URL url) {
        //load up the image
        loadImage(url);
    }

    public void displayImage() {
        System.out.println("Displaying the real image");
    }

    //a method that only the real image has
    private void loadImage(URL url) {
        System.out.println("Loading the real image from " + url);
    }
}
