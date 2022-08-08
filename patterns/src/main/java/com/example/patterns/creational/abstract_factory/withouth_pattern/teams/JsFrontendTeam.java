package com.example.patterns.creational.abstract_factory.withouth_pattern.teams;

import com.example.patterns.creational.abstract_factory.withouth_pattern.business_analysts.FrontendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.withouth_pattern.developers.JsDeveloper;
import com.example.patterns.creational.abstract_factory.withouth_pattern.qa.FrontendQA;
import java.util.stream.IntStream;

public class JsFrontendTeam {
    private FrontendBusinessAnalyst frontendBusinessAnalyst;
    private JsDeveloper jsDeveloper;
    private FrontendQA frontendQA;

    public JsFrontendTeam(FrontendBusinessAnalyst frontendBusinessAnalyst, JsDeveloper jsDeveloper,
            FrontendQA frontendQA) {
        this.frontendBusinessAnalyst = frontendBusinessAnalyst;
        this.jsDeveloper = jsDeveloper;
        this.frontendQA = frontendQA;
    }

    public void developJsApp() {
        System.out.println("Start project");
        IntStream.range(0, 5).forEach(this::workInSprint);
        System.out.println("End project");
    }

    private void workInSprint(int i) {
        System.out.printf("Sprint #%d started", i);
        frontendBusinessAnalyst.analyzeFrontendRequirements();
        jsDeveloper.writeJsCode();
        frontendQA.testFrontend();
        System.out.printf("Sprint #%d ended", i);
    }
}
