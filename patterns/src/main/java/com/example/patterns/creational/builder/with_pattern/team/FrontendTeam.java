package com.example.patterns.creational.builder.with_pattern.team;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorFrontendDeveloper;
import java.util.UUID;
import lombok.Getter;

@Getter
public class FrontendTeam {

    private final SeniorFrontendDeveloper seniorFrontendDeveloper;
    private final JuniorDeveloper juniorDeveloper;
    private final PM pm;
    private final QA qa;
    private final BusinessAnalyst analyst;

    private FrontendTeam(FrontendTeamBuilderImpl builder) {
        this.seniorFrontendDeveloper = builder.seniorFrontendDeveloper;
        this.juniorDeveloper = builder.juniorDeveloper;
        this.pm = builder.pm;
        this.qa = builder.qa;
        this.analyst = builder.analyst;
    }

    @Override
    public String toString() {
        return "Team{" +
                "seniorDeveloper=" + seniorFrontendDeveloper +
                ", juniorDeveloper=" + juniorDeveloper +
                ", pm=" + pm +
                ", qa=" + qa +
                ", analyst=" + analyst +
                '}';
    }

    public static class FrontendTeamBuilderImpl implements TeamBuilder {
        private final SeniorFrontendDeveloper seniorFrontendDeveloper;
        private JuniorDeveloper juniorDeveloper;
        private PM pm;
        private QA qa;
        private BusinessAnalyst analyst;
        
        public FrontendTeamBuilderImpl(String name) {
            this.seniorFrontendDeveloper = new SeniorFrontendDeveloper(name);
        }

        public FrontendTeamBuilderImpl defaultJuniorDeveloper() {
            this.juniorDeveloper =
                    new JuniorDeveloper(
                            UUID.fromString("a3350519-ca86-4f64-a711-55a5429d6197")
                    );
            return this;
        }

        public FrontendTeamBuilderImpl juniorDeveloper(String id) {
            this.juniorDeveloper = new JuniorDeveloper(UUID.fromString(id));
            return this;
        }

        public FrontendTeamBuilderImpl pm() {
            this.pm = new PM();
            return this;
        }

        public FrontendTeamBuilderImpl qa() {
            this.qa = new QA();
            return this;
        }

        public FrontendTeamBuilderImpl analyst() {
            this.analyst = new BusinessAnalyst();
            return this;
        }

        public FrontendTeam build() {
            FrontendTeam backendTeam =  new FrontendTeam(this);
            validateTeamObject(backendTeam);
            return backendTeam;
        }
        private void validateTeamObject(FrontendTeam backendTeam) {
            if (backendTeam.seniorFrontendDeveloper.name.isEmpty()) {
                throw new IllegalStateException("Senior developer must have name");
            }
        }
    }
}
