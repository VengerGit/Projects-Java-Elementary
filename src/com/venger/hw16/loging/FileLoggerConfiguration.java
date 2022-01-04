package com.venger.hw16.loging;

import java.nio.file.Path;

public class FileLoggerConfiguration {
    private final Path pathFileLogger;
    private LoggingLevel loggingLevel;
    private final long maxSizeFile;
    private String format;

    public FileLoggerConfiguration(Path pathFileLogger, LoggingLevel loggingLevel, long maxSizeFile, String format) {
        this.pathFileLogger = pathFileLogger;
        this.loggingLevel = loggingLevel;
        this.maxSizeFile = maxSizeFile;
        this.format = format;
    }

    public Path getPathFileLogger() {
        return pathFileLogger;
    }

    public LoggingLevel getLoggingLevel() {
        return loggingLevel;
    }

    public long getMaxSizeFile() {
        return maxSizeFile;
    }

    public String getFormat() {
        return format;
    }
}