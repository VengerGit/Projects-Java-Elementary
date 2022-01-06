package com.venger.hw16.loging;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Date;

public final class FileLogerrWriter {

    private final FileLoggerConfiguration configuration;
    private final LoggerFormater loggerFormater;

    public FileLogerrWriter(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
        loggerFormater = new LoggerFormater(configuration.getFormat());
    }

    public void write(Path file, String message) {
        write(file.toFile(), message);
    }

    public void write(File file, String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write( loggerFormater.format(new Date(), LoggingLevel.DEBUG, message));
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("SWW while the file read operation. ", e);
        }
    }
}
