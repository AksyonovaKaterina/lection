package com.example.patterns.creational.builder.without_pattern.members;

public class SeniorBackendDeveloper {
    public final String name;
    public final Integer age;

    public SeniorBackendDeveloper(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("I'm senior backend developer");
    }
}
