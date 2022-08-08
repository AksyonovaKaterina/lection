package com.example.patterns.creational.builder.with_pattern.hr;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorBackendDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.JuniorFrontendDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorBackendDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.SeniorFrontendDeveloper;
import com.example.patterns.creational.builder.with_pattern.team_builder.TeamBuilder;

public class Director {

    public void findFullBackendTeam(TeamBuilder builder){
        builder.setSeniorDeveloper(new SeniorBackendDeveloper());
        builder.setJuniorDeveloper(new JuniorBackendDeveloper());
        builder.setBusinessAnalyst(new BusinessAnalyst());
        builder.setQA(new QA());
        builder.setPM(new PM());
    }

    public void findCoddingFrontendTeam(TeamBuilder builder) {
        builder.setSeniorDeveloper(new SeniorFrontendDeveloper());
        builder.setJuniorDeveloper(new JuniorFrontendDeveloper());
        builder.setQA(new QA());
    }

    public void findInfoFrontendTeam(TeamBuilder builder) {
        builder.setBusinessAnalyst(new BusinessAnalyst());
        builder.setPM(new PM());
    }
}
