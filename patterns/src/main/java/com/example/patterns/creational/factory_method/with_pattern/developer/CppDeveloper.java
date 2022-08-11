package com.example.patterns.creational.factory_method.with_pattern.developer;

public class CppDeveloper implements Developer{

    public final String name;

    public CppDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void writeCode() {
        System.out.println("Write c++ code");
    }
}
