package com.example.patterns.creational.abstract_factory.withouth_pattern.teams;

import com.example.patterns.creational.abstract_factory.withouth_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.withouth_pattern.developers.JavaDeveloper;
import com.example.patterns.creational.abstract_factory.withouth_pattern.qa.BackendQA;
import java.util.stream.IntStream;

public class JavaBackendTeam {
    private BackendBusinessAnalyst backendBusinessAnalyst;
    private JavaDeveloper javaDeveloper;
    private BackendQA backendQA;

    public JavaBackendTeam(
            BackendBusinessAnalyst backendBusinessAnalyst,
            JavaDeveloper javaDeveloper,
            BackendQA backendQA
    ) {
        this.backendBusinessAnalyst = backendBusinessAnalyst;
        this.javaDeveloper = javaDeveloper;
        this.backendQA = backendQA;
    }

    public void developJavaApp() {
        System.out.println("Start project");
        IntStream.range(1, 6).forEach(this::workInSprint);
        System.out.println("End project");
    }

    private void workInSprint(int i) {
        System.out.printf("Sprint #%d started\n\n", i);
        backendBusinessAnalyst.analyzeBackendRequirements();
        javaDeveloper.writeJavaCode();
        backendQA.testBackend();
        System.out.printf("Sprint #%d ended\n\n", i);
    }
}
