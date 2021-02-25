package by.nastya.lesson2;

import java.util.Random;

public class Task14MinAndMaxArray {
    static private final int namArray[] = new int[2];

    public static void main(String[] args) {

        //Задание 14
        //Создать массив оценок произвольной длины, вывести максимальную и
        //минимальную оценку, её (их) номера.

        Random random = new Random();
        int randomArray = random.nextInt(100 - 1) + 1;
        //System.out.println("randomArray " + randomArray);//------------для проверки
        int array[] = new int[randomArray];
        for (int i = 0; i < randomArray; i++) {
            int randomNam = random.nextInt(100 - 1) + 1;
            array[i] = randomNam;
            //    System.out.println(i + " --- " + array[i]);//-------------для проверки
        }
        System.out.println("Минимальная оценка ___---___---> " + getMin(array) +
                " ee место в массиве " + namArray[1]);
        System.out.println("Максимальная оценка ___---___---> " + getMax(array) +
                " ee место в массиве " + namArray[0]);
    }

    //здесь находим максимум
    public static int getMax(int[] maxArray) {
        int maxEvaluation = maxArray[0];
        for (int i = 1; i < maxArray.length; i++) {
            if (maxArray[i] > maxEvaluation) {
                maxEvaluation = maxArray[i];
                namArray[0] = i;
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
                namArray[1] = i;
            }
        }
        return minEvaluation;
    }
}


