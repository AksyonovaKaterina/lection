package com.example.patterns.structural.proxy.without_pattern;

public class Client {

    public static void main(String[] args) {
        RealSite realSite = new RealSite("https://real");
        realSite.showContent();
        realSite.showContent();
    }

}
