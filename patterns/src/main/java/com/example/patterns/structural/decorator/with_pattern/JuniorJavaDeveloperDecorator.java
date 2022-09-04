package com.example.patterns.structural.decorator.with_pattern;

public class JuniorJavaDeveloperDecorator extends DeveloperDecorator {

    public JuniorJavaDeveloperDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public void work() {
        super.work();
        specialDuties();
    }

    private void specialDuties() {
        System.out.println("Ask questions.");
    }
}
