package by.nastya.lesson2;

import java.util.Random;

public class Task10Factorial {
    public static void main(String[] args) {

        //Задание 10
        //Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

        Random random = new Random();
        int randomNum = random.nextInt(15 - 10) + 10;

        System.out.printf("Факториал числа %d равен ----> %d", randomNum, factorialNum(randomNum));
    }

    private static int factorialNum(int randomNum) {

        int factorial = 1;
        for (int i = 1; i <= randomNum; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
