package com.example.patterns.structural.adapter.class_level;

import java.util.List;

public class Inspector {

    public void isSalaryReportCorrect(List<Employee> records) {
        records.forEach(employee -> assertMinSalary(employee.getName(), employee.getSalary()));
    }

    private void assertMinSalary(String name, Integer salary) {
        if (salary <= 30) {
            System.out.println(name + "'s salary is too low!!");
        }
    }
}
