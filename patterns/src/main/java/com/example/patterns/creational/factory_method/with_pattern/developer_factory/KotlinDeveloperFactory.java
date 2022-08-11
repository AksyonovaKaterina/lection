package com.example.patterns.creational.factory_method.with_pattern.developer_factory;

import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;
import com.example.patterns.creational.factory_method.with_pattern.developer.KotlinDeveloper;

public class KotlinDeveloperFactory extends DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        String name = "Lekha";
        return new KotlinDeveloper(name);
    }
}
