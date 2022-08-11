package com.example.patterns.creational.singleton.with_pattern;

public class MobileApp {

    private final ActiveUsersLog activeUsersLog;

    public MobileApp() {
        this.activeUsersLog = ActiveUsersLog.getSecurityContext();
    }

    public void enter(String name) {
        activeUsersLog.enter(name);
    }

    public void allUsers() {
        activeUsersLog.allUsers();
    }

}
