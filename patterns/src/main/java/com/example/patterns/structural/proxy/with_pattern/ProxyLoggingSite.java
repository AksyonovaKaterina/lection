package com.example.patterns.structural.proxy.with_pattern;

public class ProxyLoggingSite implements Site {
    private Site site;

    public ProxyLoggingSite(String url) {
        this.site = new RealSite(url);
    }

    public String getUrl() {
        return site.getUrl();
    }

    @Override
    public void showContent() {
        System.out.println("Some one want access site with url: " + site.getUrl());
        site.showContent();
        System.out.println("Some one leave site with url: " + site.getUrl());
    }
}
