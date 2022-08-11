package com.example.patterns.creational.builder.with_pattern.members;

import java.util.UUID;

public class JuniorDeveloper {
    private final UUID id;

    public JuniorDeveloper(UUID id) {
        this.id = id;
    }

    public void sayHello() {
        System.out.println("I'm junior backend developer");
    }
}
