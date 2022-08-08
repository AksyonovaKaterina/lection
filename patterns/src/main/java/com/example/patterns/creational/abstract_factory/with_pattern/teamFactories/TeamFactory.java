package com.example.patterns.creational.abstract_factory.with_pattern.teamFactories;

import com.example.patterns.creational.abstract_factory.with_pattern.business_analysts.BusinessAnalyst;
import com.example.patterns.creational.abstract_factory.with_pattern.developers.Developer;
import com.example.patterns.creational.abstract_factory.with_pattern.qa.QA;

public interface TeamFactory {
    Developer getDeveloper();
    QA getQA();
    BusinessAnalyst getAnalyst();
}
