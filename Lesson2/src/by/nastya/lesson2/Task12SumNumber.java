package by.nastya.lesson2;

import java.util.Random;

public class Task12SumNumber {

    //Задание 12
    //Найдите сумму первых n целых чисел, которые делятся на 3.

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        int number = 1;
        int counter = 0;
        int sum = 0;
        while (number <= randomNum) {
            if (number % 3 == 0) {
                sum = sum + number;
                counter++;
                if (counter == 3) {
                    break;
                }
            }
            number++;
        }
    }
}
