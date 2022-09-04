package com.example.patterns.structural.proxy.with_pattern;

public class Client {

    public static void main(String[] args) {
        Site siteWithAllFeatures = new ProxySaveSite("https://save");
        siteWithAllFeatures.showContent();
        siteWithAllFeatures.showContent();

        System.out.println();

        Site siteWithLogging = new ProxyLoggingSite("https://logging");
        siteWithLogging.showContent();
        siteWithLogging.showContent();

        System.out.println();

        Site realSite = new RealSite("https://real");
        realSite.showContent();
        realSite.showContent();

        System.out.println();
    }

}
