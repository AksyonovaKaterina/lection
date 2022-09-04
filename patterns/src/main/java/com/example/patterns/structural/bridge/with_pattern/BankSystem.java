package com.example.patterns.structural.bridge.with_pattern;

public class BankSystem implements Program {

    private Developer developer;

    public BankSystem(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void work() {
        System.out.println("Bank system work");
        fail();
    }

    @Override
    public void fail() {
        System.out.println("Bank system fail");
        developer.fixBug();
        System.out.println("Bank system is fixed");
    }

    @Override
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
