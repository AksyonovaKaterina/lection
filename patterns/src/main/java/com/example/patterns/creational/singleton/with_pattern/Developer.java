package com.example.patterns.creational.singleton.with_pattern;

import static com.example.patterns.creational.singleton.with_pattern.CustomLogger.getLogger;

import java.time.LocalTime;

public class Developer implements Staff{
    private final CustomLogger logger = getLogger();

    public void logWork() {
        logger.publish("Coded feature.");
    }
}
