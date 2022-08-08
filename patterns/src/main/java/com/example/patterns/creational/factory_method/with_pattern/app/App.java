package com.example.patterns.creational.factory_method.with_pattern.app;

import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;
import com.example.patterns.creational.factory_method.with_pattern.developer_factory.CppDeveloperFactory;
import com.example.patterns.creational.factory_method.with_pattern.developer_factory.DeveloperFactory;
import com.example.patterns.creational.factory_method.with_pattern.developer_factory.JavaDeveloperFactory;
import com.example.patterns.creational.factory_method.with_pattern.developer_factory.KotlinDeveloperFactory;

public class App {

    public static void main(String[] args) {
        String language = "java"; // the only string to change
        DeveloperFactory factory = createSpecialistByLanguage(language);
        Developer developer = factory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createSpecialistByLanguage(String language) {
        return switch (language) {
            case "java" -> new JavaDeveloperFactory();
            case "kotlin" -> new KotlinDeveloperFactory();
            case "c++" -> new CppDeveloperFactory();
            default -> throw new IllegalArgumentException(
                    "Can't find specialist for language " + language);
        };


    }
}
