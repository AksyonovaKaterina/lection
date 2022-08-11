package com.example.patterns.creational.factory_method.with_pattern.developer;

public class JavaDeveloper implements Developer{

    public final String name;

    public JavaDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Write java code");
    }
}
