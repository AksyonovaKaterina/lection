package com.example.patterns.structural.flyweight.without_pattern;

import com.example.patterns.structural.flyweight.with_pattern.Developer;

public class KotlinDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Developer with hash code: " + this.hashCode() + " write kotlin code");

    }
}
