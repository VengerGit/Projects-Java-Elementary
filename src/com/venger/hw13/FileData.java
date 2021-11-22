package com.venger.hw13;

public class FileData {
    private String name;
    private byte size;
    private String pathToFile;

    public FileData(String name, byte size, String pathToFile) {
        this.name = name;
        this.size = size;
        this.pathToFile = pathToFile;
    }

    public byte getSize() {
        return size;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", pathToFile='" + pathToFile + '\'' +
                '}';
    }
}