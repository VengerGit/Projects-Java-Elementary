package com.venger.hw8;

/*
2. Создать метод findSymbolOccurance. Метод принимает в качестве параметров строку и символ. Необходимо вычислить, сколько раз символ
встречается в переданной строке и вернуть это числовое значение.
3. Создать метод findWordPosition. Метод принимает в качестве параметров две строки (source, target). Необходимо выяснить, является ли target
(подстрока) частью строки source. Если да, тогда вернуть номер позиции (индекс) первого элемента подстроки в строке, иначе вернуть -1.
4. Создать метод stringReverse. Метод принимает в качестве параметра строку. Необходимо ее развернуть и вернуть измененный вариант.
5. Создать метод isPalindrome. Метод принимает в качестве параметра строку. Необходимо Проверить является ли переданная строка палиндромом.
Если да, тогда вернут true, иначе false.
 */

public class StringMethods {
    public static void main(String[] args) {
        String proverka = "How are you?";
        char repeats = 'o';
        System.out.println("Символ " + "\"" + repeats + "\" " + "встречается:" + findSymbolOccurance(proverka, repeats));

        String source = "Apollo";
        String target = "pollo";
        System.out.println("Мы ищем: " + target + "\tв строке " + source + "." + "Индекс: " + findWordPosition(source, target));

        String otputReverse = "Hello";
        System.out.println(stringReverse(otputReverse));

        String proverkaPolindrome = "ERE";
        System.out.println(isPalindrome(proverkaPolindrome));
    }

    public static boolean isPalindrome(String input) {
        StringBuilder palindrome = new StringBuilder(input);
        return input.matches(String.valueOf(palindrome.reverse()));
    }

    public static StringBuilder stringReverse(String input) {
        StringBuilder reverseString = new StringBuilder(input);
        return reverseString.reverse();
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static int findSymbolOccurance(String input, char repeats) {
        input = input.toLowerCase();
        System.out.printf("В строке: %s ", input);
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == repeats) {
                sum++;
            }
        }
        return sum;
    }
}