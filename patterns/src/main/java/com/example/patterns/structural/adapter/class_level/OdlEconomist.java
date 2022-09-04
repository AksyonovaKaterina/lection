package com.example.patterns.structural.adapter.class_level;

import java.util.List;

public class OdlEconomist implements Economist {

    private final Reports reports = new Reports();

    @Override
    public List<Employee> giveSalaryReport() {
        return reports.getSalaryReport()
                .entrySet()
                .stream()
                .map(entry -> new Employee(entry.getKey(), entry.getValue()))
                .toList();
    }
}
