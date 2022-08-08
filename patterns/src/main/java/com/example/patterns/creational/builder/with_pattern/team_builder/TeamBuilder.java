package com.example.patterns.creational.builder.with_pattern.team_builder;

import com.example.patterns.creational.builder.with_pattern.members.BusinessAnalyst;
import com.example.patterns.creational.builder.with_pattern.members.JuniorDeveloper;
import com.example.patterns.creational.builder.with_pattern.members.PM;
import com.example.patterns.creational.builder.with_pattern.members.QA;
import com.example.patterns.creational.builder.with_pattern.members.SeniorDeveloper;

public interface TeamBuilder {
    void setSeniorDeveloper(SeniorDeveloper seniorDeveloper);
    void setJuniorDeveloper(JuniorDeveloper juniorDeveloper);
    void setQA(QA qa);
    void setBusinessAnalyst(BusinessAnalyst  businessAnalyst);
    void setPM(PM pm);

}
