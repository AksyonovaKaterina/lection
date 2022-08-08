package com.example.patterns.creational.factory_method.without_pattern.app;

import com.example.patterns.creational.factory_method.without_pattern.developers.JavaDeveloper;

public class App {

    public static void main(String[] args) {
        JavaDeveloper developer = new JavaDeveloper(); // need to change when work other developer
        developer.writeJavaCode(); // need to change due to developer language
    }
}
