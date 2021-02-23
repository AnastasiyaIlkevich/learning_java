package by.nastya.lesson2;

import java.util.Random;

public class Task11SimpleNumber {

    //Задание 11
    //Имеется целое число, определить является ли это число простым, т.е.
    //делится без остатка только на 1 и себя.

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        int counter = 0;
        if (randomNum == 0 || randomNum == 1) {
            System.out.printf("Число %d не является простым или составным числом.", randomNum);
        } else {
            for (int i = 1; i < 10; i++) {
                int remainderNam = randomNum % i;
                if (remainderNam == 0) {
                    counter++;
                }
            }
            if (counter == 3) {
                System.out.printf("Число %d является составным числом.", randomNum);
            } else if (counter == 2) {
                System.out.printf("Число %d является простым числом.", randomNum);
            }
        }
    }
}
