package com.example.patterns.creational.prototype.without_pattern.company;

import com.example.patterns.creational.prototype.without_pattern.company.Customer;
import com.example.patterns.creational.prototype.without_pattern.company.HR;
import com.example.patterns.creational.prototype.without_pattern.staff.Developer;
import com.example.patterns.creational.prototype.without_pattern.staff.QA;
import java.util.ArrayList;
import java.util.List;

public class Code {
    HR poorHr = new HR();
    Customer angryCustomer = new Customer();
    List<Developer> developers = new ArrayList<>();
    List<QA> qas = new ArrayList<>();

    public void play() {
        initCompany();
        daily();
    }

    private void initCompany() {
        poorHr.askAboutPreferences(angryCustomer);
        qas = poorHr.spawnQas();
        developers = poorHr.spawnDevelopers();
    }

    private void daily() {
        developers.forEach(System.out::println);
        qas.forEach(System.out::println);
    }


}
