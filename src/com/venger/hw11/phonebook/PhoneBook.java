package com.venger.hw11.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Recording> recordings;

    public PhoneBook() {
        this.recordings = new ArrayList<>();
    }

    public void addPerson(String name, long number) {
        this.recordings.add(new Recording(name, number));
    }

    public Recording find(String name) {
        for (Recording record : recordings) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Recording> findAll(String name) {
        List<Recording> findResult = new ArrayList<>();
        for (Recording record : recordings) {
            if (record.getName().equals(name)) {
                findResult.add(record);
            }
        }
        return findResult;
    }

    public void showAllRecords() {
        for (int i = 0; i < recordings.size(); i++) {
            System.out.println(recordings.get(i).toString());
        }
    }
}