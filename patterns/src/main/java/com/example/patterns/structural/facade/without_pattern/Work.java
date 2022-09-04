package com.example.patterns.structural.facade.without_pattern;

public class Work {

    public static void main(String[] args) {
        Project project = new Project();
        project.evaluate();
        Jira jira = new Jira();
        jira.startSprint();
        Developer developer = new Developer();
        developer.work(jira);
        jira.endSprint();
        developer.work(jira);
    }

}
