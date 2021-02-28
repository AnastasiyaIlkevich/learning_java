package by.nastya.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Task16SumNumArray {
    static private final int namArray[] = new int[2];

    public static void main(String[] args) {
        //Задание 16
        //Определите сумму элементов одномерного массива, расположенных между
        //минимальным и максимальным значениями.

        Random random = new Random();
        int randomArray = random.nextInt(10 - 1) + 1;
        int[] array = new int[randomArray];
        for (int i = 0; i < randomArray; i++) {
            int randomNam = random.nextInt(10 - 1) + 1;
            array[i] = randomNam;
        }
        System.out.println(Arrays.toString(array));// для проверки.
        System.out.println("Минимальная оценка ---> " + getMin(array) +
                ", ee место в массиве ---> " + namArray[0]);
        System.out.println("Максимальная оценка ---> " + getMax(array) +
                ", ee место в массиве ---> " + namArray[1]);
        sumNumArray(array);
    }

    private static void sumNumArray(int[] array) {
        int sumNumberArray = 0;
        if (namArray[1] > namArray[0]) {//мин--макс
            for (int i = namArray[0] + 1; i < namArray[1]; i++) {
                sumNumberArray = sumNumberArray + array[i];
            }
            System.out.println("Сумма чисел расположенных между минимальным и максимальным " +
                    "значениями массива " + sumNumberArray);
        }

        if (namArray[1] < namArray[0]) {// макс -- мин
            for (int i = namArray[1] + 1; i < namArray[0]; i++) {
                sumNumberArray = sumNumberArray + array[i];
            }
            System.out.println("Сумма чисел расположенных между минимальным и максимальным " +
                    "значениями массива " + sumNumberArray);
        } else if (array.length < 3) {
            System.out.println("Метод не способен расчитать ответ т.к. были получены не расчетные " +
                    "рандомные параметры");
        }
    }

    //здесь находим максимум
    public static int getMax(int[] maxArray) {
        int maxEvaluation = maxArray[0];
        for (int i = 1; i < maxArray.length; i++) {
            if (maxArray[i] > maxEvaluation) {
                maxEvaluation = maxArray[i];
                namArray[1] = i;
            }
        }
        return maxEvaluation;
    }

    // здесь находим минимум
    public static int getMin(int[] minArray) {
        int minEvaluation = minArray[0];
        for (int i = 1; i < minArray.length; i++) {
            if (minArray[i] < minEvaluation) {
                minEvaluation = minArray[i];
                namArray[0] = i;
            }
        }
        return minEvaluation;
    }
}
