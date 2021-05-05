package homework.task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task31MaxScore {

//Задание 31
//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

    public static void main(String[] args) {

        ArrayList<Integer> score = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        while (count < 10) {
            score.add(random.nextInt(100));
            count++;
        }
        System.out.println(score);

        Iterator<Integer> iterator = score.iterator();
        int maxScore = 0;
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number > maxScore) {
                maxScore = number;
                //  System.out.println(j+"<-------");
            }
        }
        System.out.println(maxScore + "<-------");
    }
}
