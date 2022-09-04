package com.example.patterns.structural.decorator.with_pattern;

public class DeveloperDecorator implements Developer{
    private Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }


    @Override
    public void work() {
        developer.work();
    }
}
