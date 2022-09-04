package com.example.patterns.structural.proxy.with_pattern;

public class RealSite implements Site {

    private final String url;

    public RealSite(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void showContent() {
        System.out.println("Loading real site on url: " + getUrl());
    }
}
