package com.example.patterns.structural.adapter.object_level;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewEconomistAdapter implements Economist {

    private final NewEconomist newEconomist = new NewEconomist();

    @Override
    public List<Employee> giveSalaryReport() {
        Map<String, Integer> report = newEconomist.giveSalaryReport();
        List<Employee> iterableReport = new ArrayList<>();

        report.forEach((key, value) -> iterableReport.add(writeRecord(key, value)));

        return iterableReport;
    }

    private Employee writeRecord(String name, Integer salary) {
        return new Employee(name, salary);
    }
}
