package com.example.patterns.creational.prototype.with_pattern.company;

import static com.example.patterns.creational.prototype.utils.Grade.JUNIOR;
import static com.example.patterns.creational.prototype.utils.ProgrammingLanguage.JAVA;

import com.example.patterns.creational.prototype.with_pattern.staff.Developer;
import com.example.patterns.creational.prototype.with_pattern.staff.QA;
import java.util.List;

public class Customer {
    public QA giveExampleQA() {
        return new QA("boris whiskas", JUNIOR, List.of("codeApp", "agachevSol."));
    }

    public Developer giveExampleDeveloper() {
        return new Developer(JAVA, JUNIOR, "ryzhiy chips");
    }
}
