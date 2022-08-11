package com.example.patterns.creational.factory_method.with_pattern.developer_factory;

import com.example.patterns.creational.factory_method.with_pattern.developer.CppDeveloper;
import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;

public class CppDeveloperFactory extends DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        String name = "Lekha";
        return new CppDeveloper(name);
    }
}
