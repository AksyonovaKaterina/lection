package com.example.patterns.creational.builder.without_pattern.team;

import com.example.patterns.creational.builder.without_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.without_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.without_pattern.members.PM;
import com.example.patterns.creational.builder.without_pattern.members.QA;
import com.example.patterns.creational.builder.without_pattern.members.SeniorFrontendDeveloper;
import lombok.Getter;

@Getter
public class FrontendTeam {
    private SeniorFrontendDeveloper seniorFrontendDeveloper;
    private JuniorDeveloper juniorDeveloper;
    private PM pm;
    private QA qa;
    private BusinessAnalyst analyst;

    public FrontendTeam(
            SeniorFrontendDeveloper seniorFrontendDeveloper,
            JuniorDeveloper juniorDeveloper,
            PM pm,
            QA qa,
            BusinessAnalyst analyst
    ) {
        this.seniorFrontendDeveloper = seniorFrontendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    public FrontendTeam(SeniorFrontendDeveloper seniorFrontendDeveloper, JuniorDeveloper juniorDeveloper, PM pm,
            QA qa) {
        this.seniorFrontendDeveloper = seniorFrontendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
    }

    public FrontendTeam(SeniorFrontendDeveloper seniorFrontendDeveloper, JuniorDeveloper juniorDeveloper, PM pm,
            BusinessAnalyst analyst) {
        this.seniorFrontendDeveloper = seniorFrontendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.analyst = analyst;
    }

    public FrontendTeam(SeniorFrontendDeveloper seniorFrontendDeveloper, JuniorDeveloper juniorDeveloper, QA qa,
            BusinessAnalyst analyst) {
        this.seniorFrontendDeveloper = seniorFrontendDeveloper;
        this.juniorDeveloper = juniorDeveloper;
        this.qa = qa;
        this.analyst = analyst;
    }

    public FrontendTeam(SeniorFrontendDeveloper seniorFrontendDeveloper, PM pm, QA qa, BusinessAnalyst analyst) {
        this.seniorFrontendDeveloper = seniorFrontendDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    public FrontendTeam(JuniorDeveloper juniorDeveloper, PM pm, QA qa, BusinessAnalyst analyst) {
        this.juniorDeveloper = juniorDeveloper;
        this.pm = pm;
        this.qa = qa;
        this.analyst = analyst;
    }

    // And so on..
    // It takes creating 31 constructors to cover all options
}
