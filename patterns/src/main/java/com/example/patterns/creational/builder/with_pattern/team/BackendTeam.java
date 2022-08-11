package com.example.patterns.creational.builder.with_pattern.team;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorBackendDeveloper;
import java.util.UUID;
import lombok.Getter;

@Getter
public class BackendTeam {

    private final SeniorBackendDeveloper seniorBackendDeveloper;
    private final JuniorDeveloper juniorDeveloper;
    private final PM pm;
    private final QA qa;
    private final BusinessAnalyst analyst;

    private BackendTeam(BackendTeamBuilderImpl builder) {
        this.seniorBackendDeveloper = builder.seniorBackendDeveloper;
        this.juniorDeveloper = builder.juniorDeveloper;
        this.pm = builder.pm;
        this.qa = builder.qa;
        this.analyst = builder.analyst;
    }

    @Override
    public String toString() {
        return "Team{" +
                "seniorDeveloper=" + seniorBackendDeveloper +
                ", juniorDeveloper=" + juniorDeveloper +
                ", pm=" + pm +
                ", qa=" + qa +
                ", analyst=" + analyst +
                '}';
    }

    public static class BackendTeamBuilderImpl implements TeamBuilder {
        private final SeniorBackendDeveloper seniorBackendDeveloper;
        private JuniorDeveloper juniorDeveloper;
        private PM pm;
        private QA qa;
        private BusinessAnalyst analyst;
        
        public BackendTeamBuilderImpl(String name, String age) {
            this.seniorBackendDeveloper = new SeniorBackendDeveloper(name, Integer.valueOf(age));
        }

        public BackendTeamBuilderImpl defaultJuniorDeveloper() {
            this.juniorDeveloper =
                    new JuniorDeveloper(
                            UUID.fromString("a3350519-ca86-4f64-a711-55a5429d6197")
                    );
            return this;
        }

        public BackendTeamBuilderImpl juniorDeveloper(String id) {
            this.juniorDeveloper = new JuniorDeveloper(UUID.fromString(id));
            return this;
        }

        public BackendTeamBuilderImpl pm() {
            this.pm = new PM();
            return this;
        }

        public BackendTeamBuilderImpl qa() {
            this.qa = new QA();
            return this;
        }

        public BackendTeamBuilderImpl analyst() {
            this.analyst = new BusinessAnalyst();
            return this;
        }

        public BackendTeam build() {
            BackendTeam backendTeam =  new BackendTeam(this);
            validateTeamObject(backendTeam);
            return backendTeam;
        }
        private void validateTeamObject(BackendTeam backendTeam) {
            if (backendTeam.seniorBackendDeveloper.name.isEmpty()) {
                throw new IllegalStateException("Senior developer must have name");
            }
        }
    }
}
