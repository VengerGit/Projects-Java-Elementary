package com.venger.hw16.loging;

import java.io.File;

public class FileLogger implements Logger {
    private final FileLoggerConfiguration configuration;
    private final FileLogerrWriter logerrWriter;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        logerrWriter = new FileLogerrWriter(configuration);
    }

    @Override
    public void debug(String message) {
        File file = configuration.getPathFileLogger().toFile();
        FileLoggerValidator.checkFileSize(
                file.length() +
                        message.length(), configuration.getMaxSizeFile(),
                configuration.getPathFileLogger());
        logerrWriter.write(file, message);
    }


    @Override
    public void info(String message) {
        File file = configuration.getPathFileLogger().toFile();
        FileLoggerValidator.checkFileSize(file.length() +
                        message.length(), configuration.getMaxSizeFile(),
                configuration.getPathFileLogger());
        logerrWriter.write(file, message);
    }
}