package homework.task30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Task30ArrayListAndSet {

    //Задание 30
    //Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
    //числа.

    public static void main(String[] args) {
        // рандомные числа
        Random random = new Random();
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            number.add(random.nextInt(10));
        }
        System.out.println(number);

        //удаление повторных чисел
        HashSet<Integer> setNumber = new HashSet<>(number);
        System.out.println(setNumber);

    }

}
