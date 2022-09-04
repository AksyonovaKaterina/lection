package com.example.patterns.structural.bridge.with_pattern;

public class JsDeveloper implements Developer {

    @Override
    public void fixBug() {
        System.out.println("Fix js bugs");
    }
}
