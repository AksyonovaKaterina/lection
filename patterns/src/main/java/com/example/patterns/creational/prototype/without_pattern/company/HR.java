package com.example.patterns.creational.prototype.without_pattern.company;

import com.example.patterns.creational.prototype.without_pattern.company.Customer;
import com.example.patterns.creational.prototype.without_pattern.staff.QA;
import com.example.patterns.creational.prototype.without_pattern.staff.Developer;
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
        for (int i = 1; i < 10; i ++) {
            developers.add(findDeveloperByExample(exampleDeveloper));
        }
        return developers;
    }

    public Developer findDeveloperByExample(Developer developer) {
        Developer newDeveloper = new Developer();
        newDeveloper.setGrade(developer.getGrade());
        newDeveloper.setUserName(developer.getUserName());
        newDeveloper.setLanguage(developer.getLanguage());
        return newDeveloper;
    }

    public List<QA> spawnQas() {
        List<QA> qas = new ArrayList<>();
        for (int i = 1; i < 10; i ++) {
            qas.add(findQAByExample(exampleQA));
        }
        return qas;
    }

    private QA findQAByExample(QA qa) {
        QA newQa = new QA();
        newQa.setGrade(qa.getGrade());
        newQa.setUserName(qa.getUserName());
        newQa.setProjects(qa.getProjects());
        return newQa;
    }
}
