package com.example.patterns.structural.facade.with_pattern;

public class Developer {

    public void work(Jira jira) {
        if(jira.isSprintActive()) {
            System.out.println("Developer is working");
        } else {
            System.out.println("Developer is chilling");
        }

    }
}
