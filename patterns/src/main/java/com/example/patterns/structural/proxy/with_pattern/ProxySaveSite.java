package com.example.patterns.structural.proxy.with_pattern;

public class ProxySaveSite implements Site {

    private Site site;
    private Integer count;

    public ProxySaveSite(String url) {
        this.site = new ProxyLoggingSite(url);
        this.count = 0;
    }

    public String getUrl() {
        return site.getUrl();
    }

    @Override
    public void showContent() {
        if (count < 1) {
            site.showContent();
        } else {
            System.out.println("Access to the site with url: " + getUrl() + " is denied");
        }
        count++;
    }
}
