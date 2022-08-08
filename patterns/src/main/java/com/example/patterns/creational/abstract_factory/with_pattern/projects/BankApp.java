package com.example.patterns.creational.abstract_factory.with_pattern.projects;

import com.example.patterns.creational.abstract_factory.with_pattern.teams.KotlinBackendTeam;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.Team;

public class BankApp {
    private Team team;

    public BankApp(Team team) { // replace with KotlinBackendTeam..
        this.team = team;
    }

    public void getApp() {
        team.developApp();
    }

    public static void main(String[] args) {
        BankApp app = new BankApp(new KotlinBackendTeam()); // just give other team
        app.getApp();
    }
}