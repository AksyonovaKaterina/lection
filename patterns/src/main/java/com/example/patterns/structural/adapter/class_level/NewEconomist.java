package com.example.patterns.structural.adapter.class_level;

import java.util.Map;

public class NewEconomist {
    private final Reports reports = new Reports();

    public Map<String, Integer> oldGiveSalaryReport() {
        return reports.getSalaryReport();
    }
}
