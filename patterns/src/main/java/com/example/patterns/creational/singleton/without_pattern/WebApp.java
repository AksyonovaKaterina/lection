package com.example.patterns.creational.singleton.without_pattern;

public class WebApp {

    private final SecurityContext securityContext;

    public WebApp() {
        this.securityContext = new SecurityContext();
    }

    public void enter(String name) {
        securityContext.enter(name);
    }

    public void allUsers() {
        securityContext.allUsers();
    }
}
