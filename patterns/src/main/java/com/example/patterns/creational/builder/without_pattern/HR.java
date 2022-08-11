package com.example.patterns.creational.builder.without_pattern;

import com.example.patterns.creational.builder.without_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.without_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.without_pattern.members.PM;
import com.example.patterns.creational.builder.without_pattern.members.QA;
import com.example.patterns.creational.builder.without_pattern.members.SeniorBackendDeveloper;
import com.example.patterns.creational.builder.without_pattern.team.BackendTeam;
import java.util.UUID;

public class HR {

    public static void main(String[] args) {
        String idJunior = "314c8df8-bc32-40be-93b1-108bb09c5999";
        String seniorAge = "42";
        SeniorBackendDeveloper senior = new SeniorBackendDeveloper("Hldkj", Integer.parseInt(seniorAge));
        JuniorDeveloper junior = new JuniorDeveloper(UUID.fromString(idJunior));
        PM pm = new PM();
        QA qa = new QA();
        BusinessAnalyst analyst = new BusinessAnalyst();
        BackendTeam backendTeam = new BackendTeam(senior, junior, pm, qa, analyst);

        String idJunior2 = "6294c8df8-bc32-40be-93b1-108bb09c5389";
        String seniorAge2 = "42";
        SeniorBackendDeveloper senior2 = new SeniorBackendDeveloper("Hldkj", Integer.parseInt(seniorAge2));
        JuniorDeveloper junior2 = new JuniorDeveloper(UUID.fromString(idJunior2));
        PM pm2 = new PM();
        QA qa2 = new QA();

        BackendTeam backendTeam2 = new BackendTeam(senior2, junior2, pm2, qa2);
        backendTeam2.getAnalyst().sayHello();

    }

}
