package com.example.patterns.structural.proxy.without_pattern;

import com.example.patterns.structural.proxy.with_pattern.Site;

public class RealSite implements Site {

    private Integer count;
    private final String url;

    public RealSite(String url) {
        this.url = url;
        this.count = 0;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void showContent() {

        if (count < 1) {
            System.out.println("Some one want access site with url: " + getUrl());
            System.out.println("Loading real site on url: " + getUrl());
            System.out.println("Some one leave site with url: " + getUrl());
        } else {
            System.out.println("Access to the site with url: " + getUrl() + " is denied");
        }
        count++;
    }
}
