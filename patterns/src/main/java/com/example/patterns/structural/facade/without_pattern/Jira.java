package com.example.patterns.structural.facade.without_pattern;

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
