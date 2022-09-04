package com.example.patterns.structural.flyweight.with_pattern;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("java"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));
        developers.add(developerFactory.getDeveloperByLanguage("kotlin"));

        developers.forEach(Developer::writeCode);
    }

}
