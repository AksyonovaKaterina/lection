package com.example.patterns.creational.singleton.without_pattern;

public class MobileApp {

    private final SecurityContext securityContext;

    public MobileApp() {
        this.securityContext = new SecurityContext();
    }

    public void enter(String name) {
        securityContext.enter(name);
    }

    public void allUsers() {
        System.out.println("Users on site");
        securityContext.allUsers();
    }

}
