package com.example.patterns.creational.factory_method.with_pattern.developer_factory;

import com.example.patterns.creational.factory_method.with_pattern.developer.CppDeveloper;
import com.example.patterns.creational.factory_method.with_pattern.developer.Developer;

public class CppDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
