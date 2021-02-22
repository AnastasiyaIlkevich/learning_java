package by.nastya.lesson2;

import java.util.Scanner;

public class Task6CheckNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Задание 6
        //Создайте число. Определите, является ли число трехзначным. Определите, является
        //ли его последняя цифра семеркой. Определите, является ли число четным.

        System.out.println("Введите целое число:");
        int number = scanner.nextInt();
        checkingTheNumber(number);
    }

    public static void checkingTheNumber(int number) {

        int numNumber = number / 100;
        int endNumber = number % 10;
        int evenInteger = number % 2;
        System.out.printf("Вы ввели число %d.", number);
        if (numNumber > 0 && numNumber < 10) {//проверка на 3-х значность
            System.out.print(" Это 3-х значное число, ");
        } else {
            System.out.print(" Это не 3-х значное число, ");
        }
        if (endNumber == 7) {//проверка на последнюю цифру
            System.out.print("заканчивается на 7 ");
        } else {
            System.out.printf("не заканчивается на 7, а заканчивается на %d ", endNumber);
        }
        if (evenInteger == 0) {// проверка на четность
            System.out.print("и оно является четным.");
        } else {
            System.out.println("и оно не является четным.");
        }
    }
}
