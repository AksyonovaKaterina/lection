package com.example.patterns.creational.factory_method.with_pattern;

import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;
import com.example.patterns.creational.factory_method.with_pattern.developer_factory.DeveloperFactory;

public class App {

    public static void main(String[] args) {
        String language = "java"; // the only string to change
        Developer developer = DeveloperFactory.createDeveloper(language);
        developer.writeCode();
    }


}
