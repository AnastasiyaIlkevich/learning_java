package by.nastya.lesson2;

import java.util.Random;

public class Task13ArrayRandomNum {

    public static void main(String[] args) {

        //Задание 13
        //Создать последовательность случайных чисел, найти и вывести наибольшее
        //из них.

        Random random = new Random();
        int randomArray = random.nextInt(100 - 1) + 1;
        //System.out.println("randomArray " + randomArray);//------------для проверки
        int [] array = new int[randomArray];
        for (int i = 0; i < randomArray; i++) {
            int randomNam = random.nextInt(100 - 1) + 1;
            array[i] = randomNam;
            //    System.out.println(i + " --- " + array[i]);//-------------для проверки
        }
        min(array);
        max(array);
    }

    private static void max(int[] array) {
        for (int num = 0; num < array.length - 1; num++) {
            if (array[num] > array[(num + 1)]) {
                int tempVariable = array[num];
                array[num] = array[(num + 1)];
                array[(num + 1)] = tempVariable;
            }
        }
        System.out.println("максимальное число----->" + array[array.length - 1]);
    }

    private static void min(int[] array) {
        for (int num = 0; num < array.length - 1; num++) {
            if (array[num] < array[(num + 1)]) {
                int tempVariable = array[num];
                array[num] = array[(num + 1)];
                array[(num + 1)] = tempVariable;
            }
        }
        System.out.println("минимальное число----->" + array[array.length - 1]);
    }
}
