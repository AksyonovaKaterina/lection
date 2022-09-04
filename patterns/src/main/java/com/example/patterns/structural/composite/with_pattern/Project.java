package com.example.patterns.structural.composite.with_pattern;

import java.util.ArrayList;
import java.util.List;

public class Project {

    private List<Team> teams = new ArrayList<>();

    public static void main(String[] args) {
        Project project = new Project();

        JavaDeveloper javaDeveloper = new JavaDeveloper();
        JavaDeveloper javaDeveloper1 = new JavaDeveloper();
        KotlinDeveloper kotlinDeveloper = new KotlinDeveloper();
        KotlinDeveloper kotlinDeveloper1 = new KotlinDeveloper();

        BackendTeam backendTeam = new BackendTeam();
        backendTeam.addMember(javaDeveloper);
        backendTeam.addMember(javaDeveloper1);
        backendTeam.addMember(kotlinDeveloper);

        FrontendTeam frontendTeam = new FrontendTeam();
        frontendTeam.addMember(kotlinDeveloper1);

        project.addTeam(backendTeam);
        project.addTeam(frontendTeam);

        project.work();

        project.teams.forEach(e -> e.removeMember(0));
        project.work();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    private void work() {
        teams.forEach(Team::createProject);
    }
}
