package by.nastya.lesson2;

import java.util.Random;

public class Task12SumNumber {

    //Задание 12
    //Найдите сумму первых n целых чисел, которые делятся на 3.

    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        int counter = 0;
        int sum = 0;
        while (randomNum != 0) {
            if (randomNum % 3 == 0) {
                //System.out.println("randomNum "+randomNum);
                sum = sum + randomNum;
                counter++;
                if (counter == 3) {
                    break;
                }
            }
            randomNum++;
        }
        System.out.println("Сумма первых 3 целых чисел, которые делятся на 3 равна ->" + sum);
    }
}
