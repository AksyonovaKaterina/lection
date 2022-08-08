package com.example.patterns.creational.abstract_factory.withouth_pattern.teams;

import com.example.patterns.creational.abstract_factory.withouth_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.withouth_pattern.developers.KotlinDeveloper;
import com.example.patterns.creational.abstract_factory.withouth_pattern.qa.BackendQA;
import java.util.stream.IntStream;


public class KotlinBackendTeam {

    private BackendBusinessAnalyst backendBusinessAnalyst;
    private KotlinDeveloper kotlinDeveloper;
    private BackendQA backendQA;

    public KotlinBackendTeam(
            BackendBusinessAnalyst backendBusinessAnalyst,
            KotlinDeveloper kotlinDeveloper,
            BackendQA backendQA
    ) {
        this.backendBusinessAnalyst = backendBusinessAnalyst;
        this.kotlinDeveloper = kotlinDeveloper;
        this.backendQA = backendQA;
    }

    public void developKotlinApp() {
        System.out.println("Start project");
        IntStream.range(0, 5).forEach(this::workInSprint);
        System.out.println("End project");
    }

    private void workInSprint(int i) {
        System.out.printf("Sprint #%d started", i);
        backendBusinessAnalyst.analyzeBackendRequirements();
        kotlinDeveloper.writeKotlinCode();
        backendQA.testBackend();
        System.out.printf("Sprint #%d ended", i);
    }
}
