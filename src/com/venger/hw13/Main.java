package com.venger.hw13;

public class Main {
    public static void main(String[] args) throws ExceptionKeyPathAndFilePathDoNotMatch {
        FileNavigator fileNavigator = new FileNavigator();
        FileData projects = new FileData("HelloWorld.java", (byte) 8, "D:/projects/");
        FileData document = new FileData("MyNotes.txt", (byte) 1, "D:/documents/MyDocuments");
        FileData photo = new FileData("MyPhoto.jpg", (byte) 13, "D:/Photo/");
        FileData zipFile = new FileData("Archive.rar", (byte) 24, "D:/documents/zipFiles");

        fileNavigator.add("D:/projects/", projects);
        fileNavigator.add("D:/documents/MyDocuments", document);
        fileNavigator.add("D:/Photo/", photo);
        fileNavigator.add("D:/documents/zipFiles", zipFile);

        System.out.println(fileNavigator);
        System.out.println("===========================");
        System.out.println("Find file by Path: " + fileNavigator.find("D:/Photo/"));
        System.out.println("===========================");
        System.out.println("Filter file by size: " + fileNavigator.filterBySize((byte) 8));
        System.out.println("===========================");
        System.out.println("Remove file from list: " + fileNavigator.remove("D:/Photo/"));
        System.out.println("===========================");
        System.out.println(fileNavigator);
        System.out.println("===========================");
        System.out.println("Sort By size: " + fileNavigator.sortBySize());
    }
}