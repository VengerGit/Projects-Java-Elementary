package com.venger.hw13;

import java.util.*;

public class FileNavigator {
    private Map<String, FileData> listFilesData = new HashMap<>();


    public Map<String, FileData> add(String keyPathToFile, FileData fileData) throws ExceptionKeyPathAndFilePathDoNotMatch {
        if (keyPathToFile.equals(fileData.getPathToFile())) {
            listFilesData.put(keyPathToFile, fileData);
        } else {
            throw new ExceptionKeyPathAndFilePathDoNotMatch("путь-ключ и путь к файлу не совпадают");
        }
        return listFilesData;
    }

    public FileData find(String findPathToFile) {
        return listFilesData.get(findPathToFile);
    }

    public List<FileData> filterBySize(byte findSize) {
        List<FileData> resultFilter = new ArrayList<>();
        for (FileData file : listFilesData.values()) {
            if (file.getSize() <= findSize) {
                resultFilter.add(file);
            }
        }
        return resultFilter;
    }

    public FileData remove(String pathToFile) {
        return listFilesData.remove(pathToFile);
    }

    public List<FileData> sortBySize() {
        List<FileData> fileSortBySize = new ArrayList<>(listFilesData.values());
        Collections.sort(fileSortBySize, new Comparator<FileData>() {
            @Override
            public int compare(FileData o1, FileData o2) {
                return o1.getSize() - o2.getSize();
            }
        });
        return fileSortBySize;
    }

    @Override
    public String toString() {
        return "FileNavigator :" +
                "listFilesData =" + listFilesData +
                '.';
    }
}