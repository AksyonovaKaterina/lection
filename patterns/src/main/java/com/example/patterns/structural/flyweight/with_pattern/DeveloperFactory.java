package com.example.patterns.structural.flyweight.with_pattern;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {

    private static final Map<String, Developer> developersByLanguage = new HashMap<>();

    public Developer getDeveloperByLanguage(String language) {
        Developer developer = developersByLanguage.get(language);

        if (developer == null) {
            switch (language) {
                case "java":
                    developer = new JavaDeveloper();
                    break;
                case "kotlin":
                    developer = new KotlinDeveloper();
                    break;
                default:
                    throw new IllegalArgumentException("There are so such a specialist in company");

            }
            developersByLanguage.put(language, developer);
        }
        return developer;
    }

}
