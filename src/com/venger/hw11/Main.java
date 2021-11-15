package com.venger.hw11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PracticeList1a practiceList1a = new PracticeList1a();

        String input = "lawyer";
        System.out.println(practiceList1a.countOccurance(getWords(), input));

        int[] test = {1, 2, 3};
        System.out.println(practiceList1a.toList(test));

        System.out.println(practiceList1a.findUnique(getNumbers()));

        practiceList1a.calcOccurance(getWords());

        System.out.println(practiceList1a.findOccurance(getWords()));
    }

    public static List<Integer> getNumbers() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/com/venger/hw11/Numbers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer> list = new ArrayList<>();
        while (true) {
            if (!scanner.hasNextInt()) break;
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static List<String> getWords() {
        List<String> lines = new ArrayList<>();
        File file = new File("src/com/venger/hw11/Words.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = null;
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            lines.add(line);
        }
        return lines;
    }
}