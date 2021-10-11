package com.venger.hw3;

/*
1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович",
он ее должен распарсить и задать значения полям.
 */

public class Person {
    private String surname;
    private String name;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String snp) {
        String[] parsingSnp = snp.split(" ");
        this.surname = parsingSnp[0];
        this.name = parsingSnp[1];
        this.patronymic = parsingSnp[2];
    }

    @Override
    public String toString() {
        return "Person: " + '\''+
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'';
    }

    public static void main(String[] args) {
        Person abc = new Person("Иванов Иван Иванович");
        System.out.println(abc);
        Person abc1 = new Person("Venher", "Dmitriy", "Olegovich");
        System.out.println(abc1);
    }
}