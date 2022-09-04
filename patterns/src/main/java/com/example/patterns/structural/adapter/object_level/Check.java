package com.example.patterns.structural.adapter.object_level;

import com.example.patterns.structural.adapter.class_level.NewEconomist;

public class Check {

    private NewEconomist oldeconomist = new NewEconomist();
    private com.example.patterns.structural.adapter.object_level.NewEconomist newEconomist = new com.example.patterns.structural.adapter.object_level.NewEconomist();
    private Economist economist = new NewEconomistAdapter();
    private Inspector inspector = new Inspector();

    private void doCheck() {
        inspector.isSalaryReportCorrect(economist.giveSalaryReport());
    }

    public static void main(String[] args) {
        Check check = new Check();
        check.doCheck();
    }
}
