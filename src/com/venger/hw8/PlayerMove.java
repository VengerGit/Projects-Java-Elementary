package com.venger.hw8;

import java.util.Scanner;

public class PlayerMove {
    private static final Scanner INPUT_BY_THE_PLAYER = new Scanner(System.in);
    private String wordPlayer;

    public String getWordPlayer() {
        return wordPlayer;
    }

    public String wordInput() {
        return wordPlayer = INPUT_BY_THE_PLAYER.nextLine();
    }
}