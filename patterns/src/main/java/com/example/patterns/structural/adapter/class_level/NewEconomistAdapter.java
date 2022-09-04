package com.example.patterns.structural.adapter.class_level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewEconomistAdapter extends NewEconomist implements Economist {

    @Override
    public List<Employee> giveSalaryReport() { // must not have the same signature in OldEconomist and Economist
        Map<String, Integer> report = super.oldGiveSalaryReport();
        List<Employee> iterableReport = new ArrayList<>();

        report.forEach((key, value) -> iterableReport.add(writeRecord(key, value)));

        return iterableReport;
    }

    private Employee writeRecord(String name, Integer salary) {
        return new Employee(name, salary);
    }
}
