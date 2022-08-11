package com.example.patterns.creational.builder.with_pattern;


import com.example.patterns.creational.builder.with_pattern.team.BackendTeam;
import com.example.patterns.creational.builder.with_pattern.team.BackendTeam.BackendTeamBuilderImpl;
import com.example.patterns.creational.builder.with_pattern.team.FrontendTeam;
import com.example.patterns.creational.builder.with_pattern.team.FrontendTeam.FrontendTeamBuilderImpl;

public class HR {

    public static void main(String[] args) {
        BackendTeam backendTeam = new BackendTeamBuilderImpl("Boris", "34").build();
        BackendTeam twoDeveloperBackendTeam = new BackendTeamBuilderImpl("Andrey", "28")
                .defaultJuniorDeveloper()
                .build();

        BackendTeam developerBackendTeam = new BackendTeamBuilderImpl("Andrey", "28")
                .juniorDeveloper("314c8df8-bc32-40be-93b1-108bb09c5999")
                .build();

        BackendTeamBuilderImpl notFullBackendTeamBuilderImpl = new BackendTeamBuilderImpl("Fedor", "24")
                .analyst()
                .defaultJuniorDeveloper();

        BackendTeam fullBackendTeam = notFullBackendTeamBuilderImpl.pm().build();

        FrontendTeam frontendTeam = new FrontendTeamBuilderImpl("Nikita").build();

    }
}
