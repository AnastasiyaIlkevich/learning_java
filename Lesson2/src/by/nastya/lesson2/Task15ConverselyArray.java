package by.nastya.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task15ConverselyArray {

    public static void main(String[] args) {

        //Задание 15
        //Создать массив, заполнить его случайными элементами, распечатать,
        //перевернуть, и снова распечатать (при переворачивании нежелательно создавать
        //еще один массив).

        Random random = new Random();
        int randomArray = random.nextInt(20 - 1) + 1;
        int [] array = new int[randomArray];
        for (int i = 0; i < randomArray; i++) {
            int randomNum = random.nextInt(1100 - 1) + 1;
            array[i] = randomNum;
        }
//        System.out.println(Arrays.toString(array));// для проверки.
        printArray(array);
        converselyArray(array);
        System.out.println();
//        System.out.println(Arrays.toString(array));// для проверки.
        printArray(array);
    }

    private static void converselyArray(int[] array) {

        if (array.length > 1) {
            int conversely = array.length - 1;
            for (int i = 0; i < array.length; i++) {
                if (i == array.length / 2) {
//                    System.out.println("i== array.length/2");// для проверки.
                    break;
                }
                int tmp = array[i];
                array[i] = array[conversely];
                array[conversely] = tmp;
                conversely = conversely - 1;
            }
        } else {
            System.out.println("Массив равен 1 ");
        }
    }

    private static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(" " + j + " ");
        }
    }
}
