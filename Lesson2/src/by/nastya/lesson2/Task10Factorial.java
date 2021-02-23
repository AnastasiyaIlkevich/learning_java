package by.nastya.lesson2;

import java.util.Random;

public class Task10Factorial {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum = random.nextInt(15 - 10) + 10;
        factorialNum(randomNum);
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
