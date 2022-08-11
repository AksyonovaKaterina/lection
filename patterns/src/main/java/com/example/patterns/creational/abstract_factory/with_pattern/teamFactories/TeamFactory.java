package com.example.patterns.creational.abstract_factory.with_pattern.teamFactories;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.Developer;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.QA;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.Team;

public interface TeamFactory {
    Team getTeam();
}
