package com.example.patterns.creational.singleton.without_pattern;

import java.util.ArrayList;
import java.util.List;

public class SecurityContext {
    private List<String> usersOnline = new ArrayList<>();

    public void enter(String name) {
        usersOnline.add(name);
    }

    public void allUsers() {
        usersOnline.forEach(System.out::println);
    }
}
