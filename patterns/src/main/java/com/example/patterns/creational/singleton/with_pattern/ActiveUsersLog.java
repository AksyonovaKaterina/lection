package com.example.patterns.creational.singleton.with_pattern;

import java.util.ArrayList;
import java.util.List;

public class ActiveUsersLog {
    private static final ActiveUsersLog context = new ActiveUsersLog();

    private List<String> usersOnline = new ArrayList<>();

    private ActiveUsersLog() {}

    public static ActiveUsersLog getSecurityContext() {
        return context;
    }

    public void enter(String name) {
        usersOnline.add(name);
    }

    public void allUsers() {
        System.out.println("Users on site");
        usersOnline.forEach(System.out::println);
    }
}
