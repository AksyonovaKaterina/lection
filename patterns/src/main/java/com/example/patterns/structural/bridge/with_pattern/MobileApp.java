package com.example.patterns.structural.bridge.with_pattern;

public class MobileApp implements Program{ 
    
    private Developer developer;

    public MobileApp(Developer developer) {
        this.developer = developer;
    }

    @Override
    public void work() {
        System.out.println("Mobile app work");
        fail();
    }

    @Override
    public void fail() {
        System.out.println("Mobile app fail");
        developer.fixBug();
        System.out.println("Mobile app is fixed");
    }

    @Override
    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}
