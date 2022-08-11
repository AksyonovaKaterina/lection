package com.example.patterns.creational.factory_method.with_pattern.developer;

public class KotlinDeveloper implements Developer{

    public final String name;

    public KotlinDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Kotlin java code");
    }
}
