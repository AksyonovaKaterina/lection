package com.example.patterns.structural.flyweight.without_pattern;

import com.example.patterns.structural.flyweight.with_pattern.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Developer with hash code: " + this.hashCode() + " write java code");

    }
}
