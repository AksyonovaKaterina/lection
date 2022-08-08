package com.example.patterns.creational.builder.with_pattern.hr;

import com.example.patterns.creational.builder.with_pattern.team.BackendTeam;
import com.example.patterns.creational.builder.with_pattern.team.FrontendTeam;
import com.example.patterns.creational.builder.with_pattern.team_builder.BackendTeamBuilder;
import com.example.patterns.creational.builder.with_pattern.team_builder.FrontendTeamBuilder;

public class HR {

    public static void main(String[] args) {
        Director director = new Director();

        FrontendTeamBuilder frontendTeamBuilder = new FrontendTeamBuilder();
        BackendTeamBuilder backendTeamBuilder = new BackendTeamBuilder();

        director.findFullBackendTeam(backendTeamBuilder);
        director.findCoddingFrontendTeam(frontendTeamBuilder);
        director.findInfoFrontendTeam(frontendTeamBuilder);

        BackendTeam backendTeam = backendTeamBuilder.build();
        FrontendTeam frontendTeam = frontendTeamBuilder.build();

        backendTeam.greet();
        frontendTeam.greet();
    }
}
