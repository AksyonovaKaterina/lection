package com.example.patterns.creational.singleton.without_pattern;

import static java.util.logging.Level.INFO;

import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.logging.LogRecord;

public class QA {

    private final CustomLogger logger = new CustomLogger(ZoneOffset.MIN);

    public void logWork() {
        logger.publish("Tested feature.");
    }
}
