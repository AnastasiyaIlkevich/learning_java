package homework.task29;

import java.util.ArrayList;
import java.util.Random;

public class Task29RandomAssessment {

    //Задание 29
    //Создать список оценок учеников с помощью ArrayList, заполнить случайными
    //оценками. Удалить неудовлетворительные оценки из списка.

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> randomAssessment = new ArrayList<>();
        //рандомное создание списка оценок
        for (int i = 0; i < 20; i++) {
            randomAssessment.add(random.nextInt(100) + 1);
        }
        System.out.println(randomAssessment);

        //удаление всех неудовлетворительных оценок
        for (int i = 0; i < randomAssessment.size(); i++) {
            if (randomAssessment.get(i) < 39) {
                randomAssessment.remove(i);
                i--;
            }
        }

        System.out.println(randomAssessment);
    }

}
