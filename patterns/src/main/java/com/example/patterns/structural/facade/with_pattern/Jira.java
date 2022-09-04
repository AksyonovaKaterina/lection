package com.example.patterns.structural.facade.with_pattern;

public class Jira {

    private boolean isSprintActive;

    public boolean isSprintActive() {
        return isSprintActive;
    }

    public void startSprint() {
        System.out.println("Sprint is active");
        isSprintActive = true;
    }

    public void endSprint() {
        isSprintActive = false;
        System.out.println("Sprint is not active");
    }

}
