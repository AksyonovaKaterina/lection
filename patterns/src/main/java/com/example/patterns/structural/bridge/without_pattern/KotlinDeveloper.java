package com.example.patterns.structural.bridge.without_pattern;

import com.example.patterns.structural.bridge.with_pattern.Developer;

public class KotlinDeveloper implements Developer {

    @Override
    public void fixBug() {
        System.out.println("Fix kotlin program");
    }
}
