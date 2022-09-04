package com.example.patterns.structural.bridge.without_pattern;

import com.example.patterns.structural.bridge.with_pattern.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void fixBug() {
        System.out.println("Fix java program");
    }
}
