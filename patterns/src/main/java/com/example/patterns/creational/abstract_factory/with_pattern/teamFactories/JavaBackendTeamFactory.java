package com.example.patterns.creational.abstract_factory.with_pattern.teamFactories;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BackendBusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.Developer;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.JavaDeveloper;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.BackendQA;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.QA;

public class JavaBackendTeamFactory implements TeamFactory{

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public QA getQA() {
        return new BackendQA();
    }

    @Override
    public BusinessAnalyst getAnalyst() {
        return new BackendBusinessAnalyst();
    }
}
