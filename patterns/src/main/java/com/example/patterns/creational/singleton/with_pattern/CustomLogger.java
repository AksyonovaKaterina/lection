package com.example.patterns.creational.singleton.with_pattern;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class CustomLogger extends StreamHandler {

    private static CustomLogger logger;

    public final ZoneOffset zone;

    public static synchronized CustomLogger getLogger() {
        if (logger == null) {
            logger = new CustomLogger(ZoneOffset.UTC);
        }
        return logger;
    }

    private CustomLogger(ZoneOffset zone) {
        super(new FileOutputStream(FileDescriptor.out), new SimpleFormatter());
        this.zone = zone;
    }

    public synchronized void publish(String msg) {
        String standertMessage =  String.format("Logged by logger this hashcode = %d at %s%n",
                this.hashCode(), LocalDateTime.now(zone));
        LogRecord logMessage = new LogRecord(Level.INFO, msg + standertMessage);
        publish(logMessage);
    }

    @Override
    public synchronized void publish(LogRecord logMessage) {
        super.publish(logMessage);
        super.flush();
    }

    @Override
    public void close() {
        flush();
    }
}
