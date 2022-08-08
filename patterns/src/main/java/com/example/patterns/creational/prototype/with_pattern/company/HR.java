package com.example.patterns.creational.prototype.with_pattern.company;

import com.example.patterns.creational.prototype.with_pattern.staff.Developer;
import com.example.patterns.creational.prototype.with_pattern.staff.QA;
import java.util.ArrayList;
import java.util.List;

public class HR {
    private Developer exampleDeveloper;
    private QA exampleQA;

    public void askAboutPreferences(Customer customer) {
        this.exampleDeveloper = customer.giveExampleDeveloper();
        this.exampleQA = customer.giveExampleQA();
    }

    public List<Developer> spawnDevelopers() {
        List<Developer> developers = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            developers.add(exampleDeveloper.clone());
        }
        return developers;
    }

    public List<QA> spawnQas() {
        List<QA> qas = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            qas.add(exampleQA.clone());
        }
        return qas;
    }
}
