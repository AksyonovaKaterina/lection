package com.example.patterns.creational.singleton.without_pattern;

import static java.util.logging.Level.INFO;

import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class Developer {
    private final CustomLogger logger = new CustomLogger(ZoneOffset.UTC);

    public void logWork() {
        logger.publish("Coded feature");
    }
}
