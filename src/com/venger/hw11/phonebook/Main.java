package com.venger.hw11.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addPerson("Alex", 380501564412L);
        phoneBook.addPerson("Ben", 380671242144L);
        phoneBook.addPerson("Sidorov", 122445444L);
        phoneBook.addPerson("Alex", 55544897L);

        phoneBook.showAllRecords();
        System.out.println("--------------------------------");
        System.out.println(phoneBook.find("Alex"));
        System.out.println("--------------------------------");
        System.out.println(phoneBook.findAll("Alex"));
        System.out.println("--------------------------------");
        System.out.println(phoneBook.find("Vakar"));
        System.out.println("--------------------------------");
        System.out.println(phoneBook.findAll("Alfred"));
    }
}