package com.example.patterns.creational.builder.with_pattern.team;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorDeveloper;

public class BackendTeam {
    private SeniorDeveloper seniorDeveloper;
    private JuniorDeveloper juniorDeveloper;
    private PM pm;
    private QA qa;
    private BusinessAnalyst analyst;

    public BackendTeam(
            SeniorDeveloper seniorDeveloper, 
            JuniorDeveloper juniorDeveloper, 
            PM pm,
            QA qa,
            BusinessAnalyst analyst) {
        this.seniorDeveloper = seniorDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    public void greet() {
        System.out.println("Our backend team:");
        seniorDeveloper.sayHello();
        juniorDeveloper.sayHello();
        pm.sayHello();
        qa.sayHello();
        analyst.sayHello();
    }
}
