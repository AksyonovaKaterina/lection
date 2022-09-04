package com.example.patterns.structural.bridge.with_pattern;

public class Company {

    public static void main(String[] args) {
        startProgram(new JavaDeveloper());
        startProgram(new KotlinDeveloper());
    }

    private static void startProgram(Developer developer) {
        System.out.println("Start bank system program");
        BankSystem bankSystem = new BankSystem(developer);
        bankSystem.work();

        bankSystem.setDeveloper(new JsDeveloper());
        bankSystem.work();

        System.out.println("Start mobile app program");
        MobileApp mobileApp = new MobileApp(developer);
        mobileApp.work();

        bankSystem.setDeveloper(new JsDeveloper());
        mobileApp.work();
    }
}
