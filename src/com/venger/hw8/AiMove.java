package com.venger.hw8;

import java.util.Random;

public class AiMove {
    private final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static final Random RANDOM_WORD = new Random();
    private String randomWordGuess;
    private StringBuilder hideWordGuess = new StringBuilder();
    private boolean answerPlayer;

    public boolean isAnswerPlayer() {
        return answerPlayer;
    }

    public void setAnswerPlayer(boolean answerPlayer) {
        this.answerPlayer = answerPlayer;
    }

    public void start() {
        this.randomWordGuess = guessTheWord();
        this.hideWordGuess = hideGuess();
    }

    private StringBuilder hideGuess() {
        hideWordGuess.append("#".repeat(15));
        System.out.println("Which word do you think I have guess?");
        return hideWordGuess;
    }

    private String guessTheWord() {
        return WORDS[RANDOM_WORD.nextInt(WORDS.length)];
    }

    public StringBuilder examinationWordPlayer(PlayerMove playerMove) {
        System.out.println("Enter a word that AiGuess: " + hideWordGuess);
        playerMove.wordInput();
        int playerWordLength = playerMove.getWordPlayer().length();
        if (randomWordGuess.equalsIgnoreCase(playerMove.getWordPlayer())) {
            setAnswerPlayer(true);
            for (int i = 0; i < randomWordGuess.length(); i++) {
                hideWordGuess.setCharAt(i, randomWordGuess.charAt(i));
            }
        } else {
            setAnswerPlayer(false);
            int max = Math.min(randomWordGuess.length(), playerWordLength);
            for (int i = 0; i < max; i++) {
                if (randomWordGuess.charAt(i) == playerMove.getWordPlayer().charAt(i)) {
                    hideWordGuess.setCharAt(i, randomWordGuess.charAt(i));
                }
            }
        }
        return hideWordGuess;
    }
}