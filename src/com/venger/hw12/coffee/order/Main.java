package com.venger.hw12.coffee.order;

import java.util.Scanner;

public class Main {
    private static Scanner scannerInput = new Scanner(System.in);
    private static int choose;

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-Van");
        coffeeOrderBoard.add("Jhon Snow");
        coffeeOrderBoard.draw();
        do {
            menu(coffeeOrderBoard);
        } while (choose != 4);
    }

    private static void menu(CoffeeOrderBoard coffeeOrderBoard) {
        System.out.println("Hello, welcome to Starbucks");
        System.out.println("Choose menu: 1.add Order, 2.issue the next order, 3.issue an order ready earlier, 4. Exit programme ");
        choose = scannerInput.nextInt();
        scannerInput.nextLine();
        switch (choose) {
            case 1:
                System.out.println("enter name, to aad order");
                String name = scannerInput.nextLine();
                coffeeOrderBoard.add(name);
                coffeeOrderBoard.draw();
                break;
            case 2:
                System.out.println("issue the next order");
                coffeeOrderBoard.deliver();
                coffeeOrderBoard.draw();
                break;
            case 3:
                int deliver;
                do {
                    System.out.println("enter an order ready earlier");
                    deliver = scannerInput.nextInt() - 1;
                } while (deliver < 0 || deliver >= coffeeOrderBoard.getOrderList().size());
                coffeeOrderBoard.deliver(deliver);
                coffeeOrderBoard.draw();
                break;
            case 4:
                coffeeOrderBoard.draw();
                System.out.println("Exit.");
                break;
        }
    }
}