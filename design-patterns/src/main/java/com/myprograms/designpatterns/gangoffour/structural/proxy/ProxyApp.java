package com.myprograms.designpatterns.gangoffour.structural.proxy;

import java.net.URL;

public class ProxyApp {
    public static void main(String[] args) throws Exception {
        Image image = new ProxyImage(new URL("https://dzone.com/articles/design-patterns-proxy"));
        image.displayImage();
    }
}
