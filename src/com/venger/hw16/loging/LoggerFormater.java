package com.venger.hw16.loging;

import java.util.Date;

public class LoggerFormater {
    private static final String DATE = "{date}";
    private static final String LEVEL = "{level}";
    private static final String MESSAGE = "{msg}";

    private final String format;

    public LoggerFormater(String format) {
        this.format = format;
    }

    public String format(Date date, LoggingLevel level, String message) {
        return format.replace(DATE, date.toString()).replace(LEVEL, level.name().replace(MESSAGE, message));
    }
}
