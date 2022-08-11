package com.example.patterns.creational.builder.with_pattern.team;

public interface TeamBuilder {
    TeamBuilder defaultJuniorDeveloper();

    TeamBuilder juniorDeveloper(String id);

    TeamBuilder pm();

    TeamBuilder qa();

    TeamBuilder analyst();
}
