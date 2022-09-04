package com.example.patterns.structural.decorator.with_pattern;

public class SeniorJavaDeveloperDecorator extends DeveloperDecorator {

    public SeniorJavaDeveloperDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public void work() {
        super.work();
        specialDuties();
    }

    private void specialDuties() {
        System.out.println("Review code.");
    }
}
