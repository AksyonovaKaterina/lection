package com.example.patterns.creational.singleton.with_pattern;


public class Life {

    public static void main(String[] args) {
        MobileApp mobile = new MobileApp();
        WebApp desktop = new WebApp();

        mobile.enter("Romeo");
        desktop.enter("Juliet");

        mobile.allUsers();
        desktop.allUsers();
    }

}
