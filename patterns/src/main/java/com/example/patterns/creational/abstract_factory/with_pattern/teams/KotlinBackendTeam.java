package com.example.patterns.creational.abstract_factory.with_pattern.teams;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.Developer;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.QA;
import com.example.patterns.creational.abstract_factory.with_pattern.teamFactories.KotlinBackendTeamFactory;
import com.example.patterns.creational.abstract_factory.with_pattern.teamFactories.TeamFactory;
import java.util.stream.IntStream;

public class KotlinBackendTeam implements Team {

    private Developer developer;
    private QA qa;
    private BusinessAnalyst analyst;

    public KotlinBackendTeam(Developer developer, QA qa, BusinessAnalyst analyst) {
        this.developer = developer;
        this.qa = qa;
        this.analyst = analyst;
    }

    public void developApp() {
        System.out.println("Start project");
        IntStream.range(1, 5).forEach(this::workInSprint);
        System.out.println("End project");
    }

    private void workInSprint(int i) {
        System.out.printf("Sprint #%d started\n", i);
        developer.writeCode();
        analyst.analyzeRequirements();
        qa.test();
        System.out.printf("Sprint #%d ended\n\n", i);
    }
}
