package com.example.patterns.structural.adapter.object_level;

import java.util.Map;

public class Reports {

    private static final Map<String, Integer> salaryReport;

    public Map<String, Integer> getSalaryReport() {
        return salaryReport;
    }


    static {
        salaryReport = Map.of(
                "Anna", 89,
                "Masha", 12,
                "Sasha", 78,
                "Vitya", 23
        );
    }
}
