package com.example.patterns.structural.facade.with_pattern;

public class ControlWork {

    Developer developer = new Developer();
    Jira jira = new Jira();
    Project project = new Project();

    public void normalWorkFlow() {
        project.evaluate();
        jira.startSprint();
        developer.work(jira);
        jira.endSprint();
    }

}
