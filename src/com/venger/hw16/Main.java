package com.venger.hw16;

import com.venger.hw16.loging.FileLogger;
import com.venger.hw16.loging.FileLoggerConfiguration;
import com.venger.hw16.loging.LoggingLevel;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        FileLoggerConfiguration fileLoggerConfiguration = new FileLoggerConfiguration(Path.of("./logging.out"),
                LoggingLevel.INFO, 1000, "{date},{level} Message: {msg}");
        FileLogger fileLogger = new FileLogger(fileLoggerConfiguration);
        fileLogger.info("Hello, world!");
    }
}
