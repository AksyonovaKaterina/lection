package com.example.patterns.structural.adapter.class_level;

public class Check {

    private OdlEconomist oldEconomist = new OdlEconomist();

    private NewEconomist newEconomist = new NewEconomist();
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
