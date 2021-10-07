package com.venger.hw2;

/*
Задана последовательность движений, вернуть true если оне вернется в исходную точку.
 */

public class RobotReturnToOrigin {

    public static void main(String[] args) {
        String moves1 = "UD";
        String moves2 = "LL";
        String moves3 = "RRDD";

        System.out.println(judgeCircle(moves1));
        System.out.println(judgeCircle(moves2));
        System.out.println(judgeCircle(moves3));
    }

    public static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                y++;
            } else if (moves.charAt(i) == 'D') {
                y--;
            } else if (moves.charAt(i) == 'R') {
                x++;
            } else {
                x--;
            }
        }
        return x == 0 && y == 0;
    }
}