package com.example.patterns.creational.abstract_factory.with_pattern.teamFactories;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.JavaDeveloper;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.BackendQA;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.JavaBackendTeam;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.Team;

public class JavaBackendTeamFactory implements TeamFactory{

    @Override
    public Team getTeam() {
        return new JavaBackendTeam(new JavaDeveloper(), new BackendQA(), new BackendBusinessAnalyst());
    }
}
