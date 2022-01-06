package com.venger.hw16.loging;

public class FileMaxSizeReachedException extends Exception {
    public FileMaxSizeReachedException(String message) {
        super(message);
    }

    public FileMaxSizeReachedException(String message, Throwable cause) {
        super(message, cause);
    }
}
