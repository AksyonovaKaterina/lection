package com.example.patterns.structural.adapter.object_level;

public class Employee {

    private final String name;

    private final Integer salary;

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

}
