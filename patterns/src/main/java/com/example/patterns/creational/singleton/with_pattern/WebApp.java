package com.example.patterns.creational.singleton.with_pattern;

public class WebApp {

    private final ActiveUsersLog activeUsersLog;

    public WebApp() {
        this.activeUsersLog = ActiveUsersLog.getSecurityContext();
    }

    public void enter(String name) {
        activeUsersLog.enter(name);
    }

    public void allUsers() {
        activeUsersLog.allUsers();
    }
}
