package com.example.patterns.creational.builder.without_pattern.team;

import com.example.patterns.creational.builder.without_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.without_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.without_pattern.members.PM;
import com.example.patterns.creational.builder.without_pattern.members.QA;
import com.example.patterns.creational.builder.without_pattern.members.SeniorBackendDeveloper;
import lombok.Getter;

@Getter
public class BackendTeam {
    private SeniorBackendDeveloper seniorBackendDeveloper;
    private JuniorDeveloper juniorDeveloper;
    private PM pm;
    private QA qa;
    private BusinessAnalyst analyst;

    public BackendTeam(
            SeniorBackendDeveloper seniorBackendDeveloper,
            JuniorDeveloper juniorDeveloper,
            PM pm,
            QA qa,
            BusinessAnalyst analyst
    ) {
        this.seniorBackendDeveloper = seniorBackendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    public BackendTeam(SeniorBackendDeveloper seniorBackendDeveloper, JuniorDeveloper juniorDeveloper, PM pm,
            QA qa) {
        this.seniorBackendDeveloper = seniorBackendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
    }

    public BackendTeam(SeniorBackendDeveloper seniorBackendDeveloper, JuniorDeveloper juniorDeveloper, PM pm,
            BusinessAnalyst analyst) {
        this.seniorBackendDeveloper = seniorBackendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.analyst = analyst;
    }

    public BackendTeam(SeniorBackendDeveloper seniorBackendDeveloper, JuniorDeveloper juniorDeveloper, QA qa,
            BusinessAnalyst analyst) {
        this.seniorBackendDeveloper = seniorBackendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.qa = qa;
        this.analyst = analyst;
    }

    public BackendTeam(SeniorBackendDeveloper seniorBackendDeveloper, PM pm, QA qa, BusinessAnalyst analyst) {
        this.seniorBackendDeveloper = seniorBackendDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    public BackendTeam(JuniorDeveloper juniorDeveloper, PM pm, QA qa, BusinessAnalyst analyst) {
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    // And so on..
    // It takes creating 31 constructors to cover all options
}
