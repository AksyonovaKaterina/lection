package com.example.patterns.creational.abstract_factory.with_pattern;

import com.example.patterns.creational.abstract_factory.with_pattern.teamFactories.KotlinBackendTeamFactory;
import com.example.patterns.creational.abstract_factory.with_pattern.teamFactories.TeamFactory;
import com.example.patterns.creational.abstract_factory.with_pattern.teams.Team;


public class Code {
    private Team team;

    public Code(Team team) { // replace with KotlinBackendTeam..
        this.team = team;
    }

    public void createApp() {
        team.developApp();
    }

    public static void main(String[] args) {
        TeamFactory factory = new KotlinBackendTeamFactory();
        Code code = new Code(factory.getTeam());
        code.createApp();
    }
}