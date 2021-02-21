package by.nastya.lesson1;

import java.util.Scanner;

public class Task5ComparisonNumbers {
    public static void main(String[] args) {
        //Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
        //различны?
        //--------------------------------------------------

        int firstNumber, secondNumber, thirdNumber, fourthNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4-х значное натуральное число");
        int number = scanner.nextInt();
        firstNumber = number / 1000;
        secondNumber = (number - firstNumber * 1000) / 100;
        thirdNumber = (number - firstNumber * 1000 - secondNumber * 100) / 10;
        fourthNumber = (number - firstNumber * 1000 - secondNumber * 100 - thirdNumber * 10);
        if (firstNumber != secondNumber && firstNumber != thirdNumber && firstNumber != fourthNumber && secondNumber != thirdNumber && secondNumber != fourthNumber && thirdNumber != fourthNumber) {
            System.out.println("Все цифры различны! ");
        } else {
            System.out.println("Есть одинаковые числа!!! ");
        }
    }
}
