package com.example.patterns.creational.factory_method.with_pattern.developer_factory;

import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;

public abstract class DeveloperFactory {
    public static Developer createDeveloper(String language) {
        DeveloperFactory factory;
        switch (language) {
            case "java" -> factory = new JavaDeveloperFactory();
            case "kotlin" -> factory = new KotlinDeveloperFactory();
            case "c++" -> factory = new CppDeveloperFactory();
            default -> throw new IllegalArgumentException(
                    "Can't find specialist for language " + language);
        }
        return factory.createDeveloper();
    }

    public abstract Developer createDeveloper();
}
