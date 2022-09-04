package com.example.patterns.structural.adapter.object_level;

import java.util.Map;

public class NewEconomist {
    private final Reports reports = new Reports();

    public Map<String, Integer> giveSalaryReport() {
        return reports.getSalaryReport();
    }
}
