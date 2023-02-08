package com.venger.hw16.loging;

import java.nio.file.Path;

final class FileLoggerValidator {

    private FileLoggerValidator(){
    }

    public static void checkFileSize(long curent, long max, Path path) {
        if (curent > max) {
            try {
                throw new FileMaxSizeReachedException(
                        String.format("File [%s] reached maximum size [%s] that is higher that maximum available [%s] ",
                                path,
                                curent,
                                max));
            } catch (FileMaxSizeReachedException e) {
                e.printStackTrace();
            }
        }
    }
}