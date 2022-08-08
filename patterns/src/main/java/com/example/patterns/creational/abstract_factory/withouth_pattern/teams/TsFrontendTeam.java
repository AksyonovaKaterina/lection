package com.example.patterns.creational.abstract_factory.withouth_pattern.teams;

import com.example.patterns.creational.abstract_factory.withouth_pattern.business_analysts.FrontendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.withouth_pattern.developers.TsDeveloper;
import com.example.patterns.creational.abstract_factory.withouth_pattern.qa.FrontendQA;
import java.util.stream.IntStream;

public class TsFrontendTeam {
    private FrontendBusinessAnalyst frontendBusinessAnalyst;
    private TsDeveloper tsDeveloper;
    private FrontendQA frontendQA;

    public TsFrontendTeam(FrontendBusinessAnalyst frontendBusinessAnalyst, TsDeveloper tsDeveloper,
            FrontendQA frontendQA) {
        this.frontendBusinessAnalyst = frontendBusinessAnalyst;
        this.tsDeveloper = tsDeveloper;
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
        tsDeveloper.writeTsCode();
        frontendQA.testFrontend();
        System.out.printf("Sprint #%d ended", i);
    }
}
