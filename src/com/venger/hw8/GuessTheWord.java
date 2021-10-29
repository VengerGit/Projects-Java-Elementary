package com.venger.hw8;
/*
6. * Создать массив из слов;
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы которые стоят
на своих местах.
apple – загаданное apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
 */

public class GuessTheWord {
    public static void main(String[] args) {
        AiMove test = new AiMove();
        PlayerMove test1 = new PlayerMove();
        test.start();
        while (!test.isAnswerPlayer()){
            System.out.println(test.examinationWordPlayer(test1));
        }
    }
}