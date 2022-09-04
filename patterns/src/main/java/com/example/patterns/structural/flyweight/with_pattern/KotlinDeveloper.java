package com.example.patterns.structural.flyweight.with_pattern;

public class KotlinDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Developer with hash code: " + this.hashCode() + " write kotlin code");

    }
}
