package com.example.patterns.creational.abstract_factory.with_pattern.teamFactories;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.Developer;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.KotlinDeveloper;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.BackendQA;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.QA;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.KotlinBackendTeam;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.Team;

public class KotlinBackendTeamFactory implements TeamFactory{

    @Override
    public Team getTeam() {
        return new KotlinBackendTeam(new KotlinDeveloper(), new BackendQA(), new BackendBusinessAnalyst());
    }
}
