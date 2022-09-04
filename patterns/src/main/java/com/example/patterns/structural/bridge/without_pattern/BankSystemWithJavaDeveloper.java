package com.example.patterns.structural.bridge.without_pattern;

public class BankSystemWithJavaDeveloper {

    public void work() {
        System.out.println("Bank system work");
        fail();
    }

    public void fail() {
        System.out.println("Bank system fail");
        System.out.println("Fix java bugs");
        System.out.println("Bank system is fixed");
    }
}
