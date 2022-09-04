package com.example.patterns.structural.bridge.without_pattern;

public class Company {

    public static void main(String[] args) {
        startProgram();
        startProgram();
    }

    private static void startProgram() {
        System.out.println("Start bank system program");
        BankSystemWithJavaDeveloper bankSystem = new BankSystemWithJavaDeveloper();
        bankSystem.work();

//        bankSystem.setDeveloper(new JsDeveloper());
//        bankSystem.work();

        System.out.println("Start mobile app program");
        BankSystemWithKotlinDeveloper mobileApp = new BankSystemWithKotlinDeveloper();
        mobileApp.work();

//        bankSystem.setDeveloper(new JsDeveloper());
//        mobileApp.work();
    }
}
