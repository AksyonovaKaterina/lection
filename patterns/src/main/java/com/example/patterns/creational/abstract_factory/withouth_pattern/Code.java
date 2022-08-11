package com.example.patterns.creational.abstract_factory.withouth_pattern;

import com.example.patterns.creational.abstract_factory.withouth_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.withouth_pattern.developers.JavaDeveloper;
import com.example.patterns.creational.abstract_factory.withouth_pattern.qa.BackendQA;
import com.example.patterns.creational.abstract_factory.withouth_pattern.teams.JavaBackendTeam;

public class Code {
    private JavaBackendTeam javaBackendTeam; // replace with KotlinBackendTeam..

    public Code(JavaBackendTeam javaBackendTeam) { // replace with KotlinBackendTeam..
        this.javaBackendTeam = javaBackendTeam;
    }

    public void createApp() {
        javaBackendTeam.developJavaApp(); // replace with developKotlinApp()..
    }

    public static void main(String[] args) { // Why we create command here??
        JavaDeveloper developer = new JavaDeveloper(); // replace with KotlinDeveloper..
        BackendQA qa = new BackendQA(); // replace with ..
        BackendBusinessAnalyst analyst = new BackendBusinessAnalyst(); // replace with ..
        JavaBackendTeam team = new JavaBackendTeam(analyst, developer, qa); // replace with ..
        Code code = new Code(team);
        code.createApp();
    }
}
