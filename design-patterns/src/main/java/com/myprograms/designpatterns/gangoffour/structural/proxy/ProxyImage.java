package com.myprograms.designpatterns.gangoffour.structural.proxy;

import java.net.URL;

public class ProxyImage implements Image {
    private URL url;

    public ProxyImage(URL url) {
        this.url = url;
    }

    //this method delegates to the real image
    public void displayImage() {
        System.out.println("Getting the real image");
        RealImage real = new RealImage(url);
        real.displayImage();
    }
}
