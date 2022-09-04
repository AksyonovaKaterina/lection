package com.example.patterns.structural.flyweight.with_pattern;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Developer with hash code: " + this.hashCode() + " write java code");

    }
}
