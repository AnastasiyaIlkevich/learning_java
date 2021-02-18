package by.nastya.lesson1;

import java.util.Scanner;

public class Task4ReversNumber {
    public static void main(String[] args) {
        //Определить число, полученное выписыванием в обратном порядке цифр
        //любого 4-х значного натурального числа n.
        //--------------------------------------------------

        int firstNumber, secondNumber, thirdNumber, fourthNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 4-х значное натуральное число");
        int number = scanner.nextInt();
        firstNumber = number / 1000;
        secondNumber = (number - firstNumber * 1000) / 100;
        thirdNumber = (number - firstNumber * 1000 - secondNumber * 100) / 10;
        fourthNumber = (number - firstNumber * 1000 - secondNumber * 100 - thirdNumber * 10);
        int reversNumber = fourthNumber * 1000 + thirdNumber * 100 + secondNumber * 10 + firstNumber;

        System.out.println("Ваше число наоборот--> " + reversNumber);
    }


}
