package com.example.patterns.creational.builder.with_pattern.team_builder;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.team.BackendTeam;
import com.example.patterns.creational.builder.with_pattern.team_builder.TeamBuilder;

public class BackendTeamBuilder implements TeamBuilder {

    private SeniorDeveloper seniorDeveloper;
    private JuniorDeveloper juniorDeveloper;
    private PM pm;
    private QA qa;
    private BusinessAnalyst analyst;

    @Override
    public void setSeniorDeveloper(SeniorDeveloper seniorDeveloper) {
        this.seniorDeveloper = seniorDeveloper;
    }

    @Override
    public void setJuniorDeveloper(JuniorDeveloper juniorDeveloper) {
        this.juniorDeveloper = juniorDeveloper;
    }

    @Override
    public void setQA(QA qa) {
        this.qa = qa;
    }

    @Override
    public void setBusinessAnalyst(BusinessAnalyst businessAnalyst) {
        this.analyst = businessAnalyst;
    }

    @Override
    public void setPM(PM pm) {
        this.pm = pm;
    }

    public BackendTeam build() {
        return new BackendTeam(
                this.seniorDeveloper,
                this.juniorDeveloper,
                this.pm,
                this.qa,
                this.analyst
        );
    }
}
